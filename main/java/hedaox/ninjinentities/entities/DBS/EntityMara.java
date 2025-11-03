package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.config.ModConfig;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.util.AxisAlignedBB;

import java.util.ArrayList;
import java.util.List;

public class EntityMara extends EntityDBCNinjin {

    public int randomSoundDelay = 0;
    private int tickCounter = 0; // 用于计数的变量
    private int totalKiAbsorbed = 0; // 记录吸收的 Ki 总量
    private int storedKi = 0; // 存储吸收的 Ki 值
    private long lastConversionTime = 0; // 上次转换 Ki 值的时间

    private double initialMaxHealth; // 生物生成时的初始血量上限
    private double initialAttackDamage; // 生物生成时的初始攻击力

    private final long spawnTime; // 生物生成的时间

    public EntityMara(World par1World) {
        super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{5, 1, 5}, new byte[]{6, 6, 4});
        this.experienceValue = 80;
        this.setSize(1.0F, 2.16F);
        this.spawnTime = System.currentTimeMillis(); // 记录生物生成的时间
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(18000.0D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1800.0D);
    }

    @SideOnly(Side.CLIENT)
    public String getTexture() {
        return ModVars.MOD_ID + ":textures/entity/old_mara.png";
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        // 在实体生成后，记录初始血量和攻击力（从 NBT 中读取）
        if (this.initialMaxHealth == 0 && getEntityData().hasKey("jrmcSpawnInitiatedCHP")) {
            this.initialMaxHealth = getEntityData().getDouble("jrmcSpawnInitiatedCHP");
        }
        if (this.initialAttackDamage == 0 && getEntityData().hasKey("jrmcSpawnInitiatedCAT")) {
            this.initialAttackDamage = getEntityData().getDouble("jrmcSpawnInitiatedCAT");
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        // 优先检查死亡状态
        if (this.isDead || this.getHealth() <= 0 || this.getHealth() < 0.1f) {
            return;
        }

        // 检查是否已经过了5秒
        long currentTime = System.currentTimeMillis();
        if (currentTime - spawnTime < 5000) { // 5000 毫秒 = 5 秒
            return; // 如果未满5秒，跳过后续逻辑
        }

        // 检查是否存在 jrmcSpawnInitiatedCAT 和 jrmcSpawnInitiatedCHP NBT
        if (!getEntityData().hasKey("jrmcSpawnInitiatedCAT") || !getEntityData().hasKey("jrmcSpawnInitiatedCHP")) {
            return; // 如果没有这两个 NBT，跳过 Ki 吸收逻辑
        }

        // 使用配置文件中的时间间隔
        if (tickCounter % ModConfig.kiDrainInterval == 0) {
            // 使用配置文件中的范围
            List<EntityPlayer> playersInRange = getPlayersInRange(ModConfig.kiDrainRange);
            for (EntityPlayer player : playersInRange) {
                if (player != null) { // 检查玩家是否为 null
                    // 使用配置文件中的扣除量
                    int drainedKi = reducePlayerKi(player, ModConfig.kiDrainAmount);
                    if (drainedKi > 0) {
                        totalKiAbsorbed += drainedKi; // 累加吸收的 Ki 值
                        storedKi += drainedKi; // 存储吸收的 Ki 值
                    }
                }
            }
        }

        // 修改时间检查，确保不会在死亡边缘执行
        if (currentTime - lastConversionTime >= 5000 && this.getHealth() > 0) {
            handleKiConversion();
            lastConversionTime = currentTime;
        }

        tickCounter++;
    }

    /**
     * 获取生物范围内的玩家
     *
     * @param range 检测范围
     * @return 范围内的玩家列表
     */
    public List<EntityPlayer> getPlayersInRange(double range) {
        List<EntityPlayer> playersInRange = new ArrayList<>();
        if (this.worldObj == null) {
            return playersInRange; // 如果 worldObj 为 null，返回空列表
        }
        // 获取生物的位置
        double x = this.posX;
        double y = this.posY;
        double z = this.posZ;

        // 遍历范围内的实体
        AxisAlignedBB boundingBox = AxisAlignedBB.getBoundingBox(x - range, y - range, z - range, x + range, y + range, z + range);
        playersInRange = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox);

        return playersInRange;
    }

    /**
     * 减少玩家的 Ki 值
     *
     * @param player 玩家实体
     * @param amount 扣除的 Ki 值（支持百分比）
     * @return 实际扣除的 Ki 值
     */
    public int reducePlayerKi(EntityPlayer player, String amount) {
        if (player == null) {
            return 0; // 如果玩家为 null，直接返回
        }

        // 检查玩家的 playerGameType NBT
        NBTTagCompound playerData = player.getEntityData();
        if (playerData.hasKey("playerGameType") && playerData.getInteger("playerGameType") == 1) {
            return 0; // 如果 playerGameType 为 1，跳过该玩家的 Ki 吸收
        }

        // 获取当前 Ki 值
        int currentKi = JRMCoreH.getInt(player, "jrmcEnrgy");

        // 计算扣除量
        int drainAmount;
        if (amount.endsWith("%")) {
            // 百分比扣除
            double percentage = Double.parseDouble(amount.substring(0, amount.length() - 1)) / 100.0;
            drainAmount = (int) (currentKi * percentage);
        } else {
            // 固定值扣除
            drainAmount = Integer.parseInt(amount);
        }

        // 确保 Ki 值不会降到某个阈值以下（例如 100）
        int minKi = 100; // 设置最低 Ki 值
        int newKi = Math.max(currentKi - drainAmount, minKi);

        // 设置新的 Ki 值
        JRMCoreH.setInt(newKi, player, "jrmcEnrgy");

        return drainAmount; // 返回实际扣除的 Ki 值
    }

    /**
     * 处理 Ki 值转换逻辑
     */
    private void handleKiConversion() {
        // 添加明确的死亡检查
        if (this.isDead || this.getHealth() <= 0 || this.getHealth() < 0.1f) {
            return; // 如果生物已经死亡，直接返回
        }

        // 原有的转换逻辑...
        double maxHealth = getEntityData().getDouble("jrmcSpawnInitiatedCHP");
        double currentHealth = this.getHealth();

        if (currentHealth < maxHealth * 0.8) {
            healFromKi();
        } else {
            enhanceEntity();
        }
    }

    /**
     * 使用吸收的 Ki 值回复血量
     */
    private void healFromKi() {
        // 双重检查死亡状态
        if (this.isDead || this.getHealth() <= 0 || this.getHealth() < 0.1f) {
            return;
        }

        // 原有的回复逻辑...
        double maxHealth = getEntityData().getDouble("jrmcSpawnInitiatedCHP");
        double currentHealth = this.getHealth();

        // 确保不会复活已死亡的生物
        if (currentHealth <= 0) {
            return;
        }
        // 如果生物即将死亡，则跳过血量回复
        if (this.getHealth() <= 0) {
            return;
        }

        // 计算最大回复量（1% 最大血量）
        double maxHealAmount = maxHealth * (ModConfig.kiToHealthRatio / 100.0);

        // 计算实际回复量（不超过最大回复量）
        double healthToHeal = Math.min(storedKi, maxHealAmount);

        // 更新血量
        double newHealth = Math.min(currentHealth + healthToHeal, maxHealth);
        this.setHealth((float) newHealth);

        // 计算剩余的 Ki 值
        double remainingKi = storedKi - healthToHeal;

        // 如果剩余的 Ki 值大于 0，则用于增强血量和攻击力
        if (remainingKi > 0) {
            enhanceEntityWithRemainingKi(remainingKi);
        }

        // 重置存储的 Ki 值
        storedKi = 0;
    }

    /**
     * 使用剩余的 Ki 值增强血量和攻击力
     */
    private void enhanceEntityWithKi(double ki) {
        double currentMaxHealth = getEntityData().getDouble("jrmcSpawnInitiatedCHP");
        double currentAttackDamage = getEntityData().getDouble("jrmcSpawnInitiatedCAT");

        double newMaxHealth = Math.floor(currentMaxHealth + ki * parseRatio(ModConfig.kiToMaxHealthRatio, 1.0));
        double newAttackDamage = Math.floor(currentAttackDamage + ki * parseRatio(ModConfig.kiToAttackRatio, 1.0));

        double maxHealthLimit = initialMaxHealth * (1 + ModConfig.maxHealthEnhancementLimit / 100.0);
        double attackDamageLimit = initialAttackDamage * (1 + ModConfig.attackEnhancementLimit / 100.0);

        newMaxHealth = Math.min(newMaxHealth, maxHealthLimit);
        newAttackDamage = Math.min(newAttackDamage, attackDamageLimit);

        getEntityData().setDouble("jrmcSpawnInitiatedCHP", newMaxHealth);
        getEntityData().setDouble("jrmcSpawnInitiatedCAT", newAttackDamage);

        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(newMaxHealth);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(newAttackDamage);

        updateMaxHealthModifier(newMaxHealth);
        updateAttackDamageModifier(newAttackDamage);
    }
    private void enhanceEntity() {
        enhanceEntityWithKi(storedKi);
        storedKi = 0;
    }

    private void enhanceEntityWithRemainingKi(double remainingKi) {
        enhanceEntityWithKi(remainingKi);
    }

    /**
     * 更新最大血量的 Modifier
     */
    private void updateMaxHealthModifier(double newMaxHealth) {
        // 移除旧的修饰器（如果存在）
        AttributeModifier oldHealthModifier = this.getAttributeMap()
            .getAttributeInstance(SharedMonsterAttributes.maxHealth)
            .getModifier(this.getUniqueID());
        if (oldHealthModifier != null) {
            this.getAttributeMap()
                .getAttributeInstance(SharedMonsterAttributes.maxHealth)
                .removeModifier(oldHealthModifier);
        }

        // 计算 Modifier 的值（确保与 jrmcSpawnInitiatedCHP 一致）
        double modifierValue = newMaxHealth - this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue();

        // 应用新的修饰器
        AttributeModifier newHealthModifier = new AttributeModifier(
            this.getUniqueID(), // UUID
            "maxHealthModifier", // 名称
            modifierValue, // 值
            0 // 操作类型（0 = 直接增加值）
        );
        this.getAttributeMap()
            .getAttributeInstance(SharedMonsterAttributes.maxHealth)
            .applyModifier(newHealthModifier);
    }

    /**
     * 更新攻击力的 Modifier
     */
    private void updateAttackDamageModifier(double newAttackDamage) {
        // 移除旧的修饰器（如果存在）
        AttributeModifier oldAttackDamageModifier = this.getAttributeMap()
            .getAttributeInstance(SharedMonsterAttributes.attackDamage)
            .getModifier(this.getUniqueID());
        if (oldAttackDamageModifier != null) {
            this.getAttributeMap()
                .getAttributeInstance(SharedMonsterAttributes.attackDamage)
                .removeModifier(oldAttackDamageModifier);
        }

        // 计算 Modifier 的值（确保与 jrmcSpawnInitiatedCAT 一致）
        double modifierValue = newAttackDamage - this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue();

        // 应用新的修饰器
        AttributeModifier newAttackDamageModifier = new AttributeModifier(
            this.getUniqueID(), // UUID
            "attackDamageModifier", // 名称
            modifierValue, // 值
            0 // 操作类型（0 = 直接增加值）
        );
        this.getAttributeMap()
            .getAttributeInstance(SharedMonsterAttributes.attackDamage)
            .applyModifier(newAttackDamageModifier);
    }

    /**
     * 解析比例值（支持百分比或固定值）
     *
     * @param ratio 比例值（如 "0.1" 或 "10%"）
     * @param defaultValue 默认值（如果解析失败）
     * @return 解析后的比例值
     */
    private double parseRatio(String ratio, double defaultValue) {
        if (ratio.endsWith("%")) {
            // 百分比
            try {
                return Double.parseDouble(ratio.substring(0, ratio.length() - 1)) / 100.0;
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        } else {
            // 固定值
            try {
                return Double.parseDouble(ratio);
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        }
    }
}
