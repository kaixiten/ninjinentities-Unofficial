package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityDBCNeut;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import hedaox.ninjinentities.Main;
import hedaox.ninjinentities.config.ModConfig;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.network.MessageSendEntityToSpark;
import net.minecraft.block.Block;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityDBCNinjin extends EntityDBCNeut {

    private EntityPlayer spwner = null;
    private int noSpwnr = DBCConfig.mdat;
    public int angerLevel = 0;
    protected int aggroCooldown = 0;
    public int prevAttackCounter = 0;
    public int attackCounter = 0;
    private byte data1 = 1;
    private byte data2 = 0;
    private byte data3 = 0;
    private byte data4 = 0;
    // Attack Type : 1/KiAttack 2/disk 3/wave 4/whirled wave 5/Big Ki Attack 6/SmallKiAttack
    private byte[] attacksType = {1};
    // Attack Color : 1/white 2/blue 3/purple 4/red 5/black 6/green 7/yellow 8/orange
    private byte[] attacksColor = {0};
    private boolean blst = false;
    public int alignment = 83;
    public boolean isTrainer = false;
    public boolean hasAnAura = false;
    public float auraRed = 100.0F;
    public float auraGreen = 125.0F;
    public float auraBlue = 255.0F;
    public float auraRed2 = 100.0F;
    public float auraGreen2 = 125.0F;
    public float auraBlue2 = 255.0F;
    public MindState mindState = MindState.NEUTRAL;
    public boolean canTeleport = false;
    private int wait = 0;
    private int m = 1;
    private int rang = 0;
    public boolean auraLightning = false;
    private int lightningCount = 0;
    private int randomSeed = 0; // 改为 int，避免全局随机同步
    public boolean hasAGodAura = false;
    private boolean updtd = false;
    private final double moveSpeed = DBCConfig.EnemyDefaultMoveSpeed;
    private int outOfRangeHits = 0; // 记录近战范围外被攻击次数
    private static final double MELEE_RANGE = 3.5; // 近战范围
    private static final int TELEPORT_TRIGGER_HITS = 5; // 触发瞬移的攻击次数
    private int nextTeleportTick = 100;
    private int teleportCooldown = 160;
    private Map<EntityLivingBase, Integer> hateMap = new HashMap<>();

    // 地面行走追踪相关变量
    private boolean isFlying = false;
    private int stuckCounter = 0; // 检测是否卡住
    private EntityDBCNinjin lastPosition = null;
    private int flightEscapeTicks = 0; // 持续脱困计数器

    // 肢体动画相关
    public float limbSwingAmount;
    public float prevLimbSwingAmount;
    public float limbSwing;

    // 数据观察器同步ID
    private static final int DATAWATCHER_LIMB_SWING_AMOUNT = 20;
    private static final int DATAWATCHER_LIMB_SWING = 21;

    public enum MindState {
        NEUTRAL, AGGRESSIVE, PACIFIC
    }

    public EntityDBCNinjin(World par1World) {
        super(par1World);
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors) {
        super(par1World);
        setMediumDifficulty();
        alignment = _alignment;
        this.isTrainer = _isTrainer;
        mindState = _mindState;
        canTeleport = _canTeleport;
        attacksType = _attacksType;
        attacksColor = _attacksColors;
        if (mindState == MindState.AGGRESSIVE)
            angerLevel = 400;
        // 初始化攻击类型/颜色
        if (attacksType.length > 0) this.data1 = attacksType[0];
        if (attacksColor.length > 0) this.data2 = attacksColor[0];
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, boolean _hasAnAura) {
        this(par1World, _alignment, _mindState, _isTrainer, _canTeleport, _attacksType, _attacksColors);
        hasAnAura = _hasAnAura;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue) {
        this(par1World, _alignment, _mindState, _isTrainer, _canTeleport, _attacksType, _attacksColors);
        auraRed = _auraRed;
        auraGreen = _auraGreen;
        auraBlue = _auraBlue;
        hasAnAura = true;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning) {
        this(par1World, _alignment, _mindState, _isTrainer, _canTeleport, _attacksType, _attacksColors, _auraRed, _auraGreen, _auraBlue);
        auraLightning = _auraLightning;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod) {
        this(par1World, _alignment, _mindState, _isTrainer, _canTeleport, _attacksType, _attacksColors, _auraRed, _auraGreen, _auraBlue, _auraLightning);
        hasAGodAura = _auraGod;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod, float _auraRed2, float _auraGreen2, float _auraBlue2) {
        this(par1World, _alignment, _mindState, _isTrainer, _canTeleport, _attacksType, _attacksColors, _auraRed, _auraGreen, _auraBlue, _auraLightning, _auraGod);
        auraRed2 = _auraRed2;
        auraGreen2 = _auraGreen2;
        auraBlue2 = _auraBlue2;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod, float _auraRed2, float _auraGreen2, float _auraBlue2, boolean _hasAnAura) {
        this(par1World, _alignment, _mindState, _isTrainer, _canTeleport, _attacksType, _attacksColors, _auraRed, _auraGreen, _auraBlue, _auraLightning, _auraGod, _auraRed2, _auraGreen2, _auraBlue2);
        hasAnAura = _hasAnAura;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(DATAWATCHER_LIMB_SWING_AMOUNT, 0.0F);
        this.dataWatcher.addObject(DATAWATCHER_LIMB_SWING, 0.0F);
    }

    @Override
    protected void updateEntityActionState() {
        if (mindState == MindState.PACIFIC) {
            angerLevel = 0;
        } else if (angerLevel >= 400) {
            becomeAngryAtAllPlayer();
        }
        if (this.angerLevel > 0) {
            this.fallDistance = 0.0F;

            this.prevAttackCounter = this.attackCounter;
            EntityLivingBase attackTarget = this.getAttackTarget();
            if ((attackTarget != null) && (attackTarget.isDead)) {
                this.setAttackTarget(null);
                this.dataWatcher.updateObject(23, 0);
                super.updateEntityActionState();
            }
            if ((attackTarget == null) || (this.aggroCooldown-- <= 0)) {
                EntityPlayer closestPlayer = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0D);
                // 检查创造模式 - 但仍然允许作为生成者
                if (closestPlayer != null) {
                    super.updateEntityActionState();
                    if (closestPlayer.capabilities.isCreativeMode) {
                        // 如果是创造模式，但没有攻击目标，仍然设置为生成者
                        if (this.spwner == null) {
                            this.spwner = closestPlayer;
                        }
                    } else {
                        // 非创造模式玩家优先作为攻击目标
                        this.setAttackTarget(closestPlayer);
                        this.dataWatcher.updateObject(23, closestPlayer.getEntityId());
                        this.aggroCooldown = 20;
                    }
                }
            }
            if (attackTarget != null) {
                float r = this.width / 2.0F + 3.5F;
                if ((this.entityToAttack != null) && (this.entityToAttack.isEntityAlive()) && (this.entityToAttack.getDistanceToEntity(this) < r)) {
                    AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(this.posX - r, this.posY - r, this.posZ - r, this.posX + r, this.posY + r, this.posZ + r);
                    List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                    double distance = getXZDistanceToEntity(attackTarget);
                    if (this.attackTime - ((!DBCConfig.AaiDisabled && distance < 0.5D) ? (DBCConfig.EnemyDefaultAttackTimer - DBCConfig.EnemyDefaultShortRangeAttackTimer) : 0) <= 0) {
                        for (int i = 0; i < list.size(); i++) {
                            EntityPlayer player = list.get(i);
                            // 跳过创造模式玩家
                            if (player.capabilities.isCreativeMode) continue;
                            attackEntityAsMob(player);
                        }
                        this.attackTime = DBCConfig.EnemyDefaultAttackTimer;
                        this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC3.force", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
                    }
                }
                if (attackTarget != null && attackTarget.isEntityAlive()
                    && attackTarget.getDistanceSqToEntity(this) < 4096.0D) {
                    double distanceMulti = attackTarget.getDistanceSqToEntity(this) / 50.0D * 0.1D + 1.0D;
                    int fireAttackRate = (int)(distanceMulti * 80);
                    if (fireAttackRate < this.kiAttackTimerMin) {fireAttackRate = this.kiAttackTimerMin;
                    }
                    double d5 = attackTarget.posX - this.posX;
                    double d6 = (attackTarget.posY + attackTarget.getEyeHeight()) - (this.posY + this.height / 2.0F);
                    double d7 = attackTarget.posZ - this.posZ;

                    this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0F / (float)Math.PI;

                    double horizontalDist = Math.hypot(d5, d7);

                    this.rotationPitch = (float)(-Math.atan2(d6, horizontalDist) * 180.0D / Math.PI);


                    if (this.canFireKiAttacks && canEntityBeSeen(attackTarget)) {
                        if (!this.hasAAiKiChargeSystem || this.chargingKiAttack) {
                            this.attackCounter++;
                            if (this.attackCounter >= fireAttackRate) {
                                EntityEnergyAtt kiAttack;
                                this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC2.basicbeam_fire", 0.5F, 1.0F);
                                byte type = this.data1;
                                byte speed = 2;
                                byte effect = 1;
                                byte color = this.data2;
                                byte density = 1;
                                byte sincantation = 0;
                                byte sfire = 0;
                                byte smove = 0;
                                byte[] sts = JRMCoreH.techDBCstatsDefault;
                                int dmg = (int)(50.0F / ((this.data1 == 6) ? 5.0F : 1.0F));
                                int f = (int)getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
                                int dmg1 = (int)(f * 1.2F / ((this.data1 == 6) ? 5.0F : 1.0F));
                                int cst = dmg1 / 2;
                                if (this.data3 == 0) {
                                    kiAttack = new EntityEnergyAtt(this, type, speed, dmg, effect, color, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0);
                                } else {
                                    kiAttack = new EntityEnergyAtt(this, type, speed, dmg, effect, color, this.data4, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0);
                                }
                                double d8 = this.width + 0.5D;
                                Vec3 vec3 = getLook(1.0F);
                                kiAttack.posX = this.posX + vec3.xCoord * d8;
                                kiAttack.posY = this.posY + (this.height / 2.0F) + 0.5D;
                                kiAttack.posZ = this.posZ + vec3.zCoord * d8;
                                this.worldObj.spawnEntityInWorld(kiAttack);
                                if (this.data1 == 6 && (int)(Math.random() * 8.0D) != 0) {
                                    this.attackCounter = this.kiBarrageType0 ? (fireAttackRate - 10) : fireAttackRate;
                                    this.blst = false;
                                } else {
                                    this.attackCounter = -40;
                                    this.blst = true;
                                }
                            }
                        }
                    } else if (this.attackCounter > 0)
                    {
                        this.attackCounter -= 1;
                    }
                } else if (this.attackCounter > 0) {
                    this.attackCounter -= 1;
                }
            } else {
                super.updateEntityActionState();
            }
        }
    }

    protected NBTTagCompound nbt(EntityPlayer p, String s) {
        NBTTagCompound nbt;
        if (s.contains("pres")) {
            if (!p.getEntityData().hasKey("PlayerPersisted")) {
                nbt = new NBTTagCompound();
                p.getEntityData().setTag("PlayerPersisted", nbt);
            } else {
                nbt = p.getEntityData().getCompoundTag("PlayerPersisted");
            }
        } else {
            nbt = p.getEntityData();
        }
        return nbt;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
    }

    public void onDeath(DamageSource par1DamageSource) {
        Entity entitySource = par1DamageSource.getEntity();
        if ((entitySource instanceof EntityPlayer)) {
            List<?> listCloseEntities = this.worldObj
                .getEntitiesWithinAABBExcludingEntity(this,
                    this.boundingBox.expand(32.0D, 32.0D, 32.0D));
            for (int i = 0; i < listCloseEntities.size(); i++) {
                Entity entity = (Entity) listCloseEntities.get(i);
                if ((entity instanceof EntityDBCNinjin entityTrain)) {
                    entityTrain.becomeAngryAt(entitySource);
                }
            }
            becomeAngryAt(entitySource);
        }

        if (entitySource instanceof EntityPlayer) {
            int e = 1;
            if (entitySource instanceof EntityPlayer player) {
                JRMCoreH.expPls(player, e);
            }
        }

        if (ForgeHooks.onLivingDeath(this, par1DamageSource)) return;
        Entity entity = par1DamageSource.getEntity();
        EntityLivingBase entitylivingbase = this.func_94060_bK();

        if (this.scoreValue >= 0 && entitylivingbase != null)
        {
            entitylivingbase.addToPlayerScore(this, this.scoreValue);
        }

        if (entity != null)
        {
            entity.onKillEntity(this);
        }

        this.dead = true;
        this.func_110142_aN().func_94549_h();

        if (!this.worldObj.isRemote)
        {
            int i = 0;

            if (entity instanceof EntityPlayer)
            {
                i = EnchantmentHelper.getLootingModifier((EntityLivingBase)entity);
            }

            captureDrops = true;
            capturedDrops.clear();
            int j = 0;

            if (this.func_146066_aG() && this.worldObj.getGameRules().getGameRuleBooleanValue("doMobLoot"))
            {
                this.dropFewItems(this.recentlyHit > 0, i);
                this.dropEquipment(this.recentlyHit > 0, i);

                if (this.recentlyHit > 0)
                {
                    j = this.rand.nextInt(200) - i;

                    if (j < 5)
                    {
                        this.dropRareDrop(j <= 0 ? 1 : 0);
                    }
                }
            }

            captureDrops = false;

            if (!ForgeHooks.onLivingDrops(this, par1DamageSource, capturedDrops, i, recentlyHit > 0, j))
            {
                for (EntityItem item : capturedDrops)
                {
                    worldObj.spawnEntityInWorld(item);
                }
            }
        }

        this.worldObj.setEntityState(this, (byte)3);
    }

    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("Anger", (short) this.angerLevel);
        par1NBTTagCompound.setBoolean("CanTeleport", this.canTeleport);
        par1NBTTagCompound.setBoolean("HasAnAura", this.hasAnAura);
        par1NBTTagCompound.setBoolean("AuraLightning", this.auraLightning);
        par1NBTTagCompound.setBoolean("HasAGodAura", this.hasAGodAura);
        par1NBTTagCompound.setFloat("AuraRed", this.auraRed);
        par1NBTTagCompound.setFloat("AuraGreen", this.auraGreen);
        par1NBTTagCompound.setFloat("AuraBlue", this.auraBlue);
        par1NBTTagCompound.setFloat("AuraRed2", this.auraRed2);
        par1NBTTagCompound.setFloat("AuraGreen2", this.auraGreen2);
        par1NBTTagCompound.setFloat("AuraBlue2", this.auraBlue2);
        par1NBTTagCompound.setByte("Data1", this.data1);
        par1NBTTagCompound.setByte("Data2", this.data2);
    }

    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.angerLevel = par1NBTTagCompound.getShort("Anger");
        this.canTeleport = par1NBTTagCompound.getBoolean("CanTeleport");
        this.hasAnAura = par1NBTTagCompound.getBoolean("HasAnAura");
        this.auraLightning = par1NBTTagCompound.getBoolean("AuraLightning");
        this.hasAGodAura = par1NBTTagCompound.getBoolean("HasAGodAura");
        this.auraRed = par1NBTTagCompound.getFloat("AuraRed");
        this.auraGreen = par1NBTTagCompound.getFloat("AuraGreen");
        this.auraBlue = par1NBTTagCompound.getFloat("AuraBlue");
        this.auraRed2 = par1NBTTagCompound.getFloat("AuraRed2");
        this.auraGreen2 = par1NBTTagCompound.getFloat("AuraGreen2");
        this.auraBlue2 = par1NBTTagCompound.getFloat("AuraBlue2");
        this.data1 = par1NBTTagCompound.getByte("Data1");
        this.data2 = par1NBTTagCompound.getByte("Data2");
    }

    protected Entity findPlayerToAttack() {
        return this.angerLevel == 0 ? null : super.findPlayerToAttack();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        boolean result = super.attackEntityFrom(source, amount);

        if (source.getEntity() instanceof EntityPlayer attacker) {

            // 检查是否为创造模式玩家 - 不触发仇恨或远程攻击计数
            if (attacker.capabilities.isCreativeMode) {
                return result;
            }

            // 计算距离
            double distance = getDistanceToEntity(attacker);

            // 如果在近战范围外被攻击
            if (distance > MELEE_RANGE) {
                outOfRangeHits++;

                // 快触发瞬移时给出警告音效
                if (outOfRangeHits >= TELEPORT_TRIGGER_HITS - 1) {
                }
            } else {
                // 在近战范围内被攻击则重置计数器
                outOfRangeHits = 0;
            }
        }

        // === 仇恨系统 ===
        if (result && source.getEntity() instanceof EntityLivingBase entity) {
            // 跳过创造模式玩家
            if (entity instanceof EntityPlayer && ((EntityPlayer) entity).capabilities.isCreativeMode) {
                return result;
            }
            addHate(entity, (int) amount * 2);
        }

        return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void onLivingUpdate() {
        // 更新肢体动画 - 这是关键修复
        this.prevLimbSwingAmount = this.limbSwingAmount;
        double dx = this.posX - this.prevPosX;
        double dz = this.posZ - this.prevPosZ;
        float moveDistance = (float) Math.sqrt(dx * dx + dz * dz) * 4.0F;

        if (moveDistance > 1.0F) {
            moveDistance = 1.0F;
        }

        this.limbSwingAmount += (moveDistance - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;

        // ======= 关键修复：同步动画数据到客户端 =======
        if (!this.worldObj.isRemote) {
            // 服务端：更新数据观察器，同步到所有客户端
            this.dataWatcher.updateObject(DATAWATCHER_LIMB_SWING_AMOUNT, this.limbSwingAmount);
            this.dataWatcher.updateObject(DATAWATCHER_LIMB_SWING, this.limbSwing);
        } else {
            // 客户端：从数据观察器读取服务端同步的值
            Float syncedAmount = this.dataWatcher.getWatchableObjectFloat(DATAWATCHER_LIMB_SWING_AMOUNT);
            Float syncedSwing = this.dataWatcher.getWatchableObjectFloat(DATAWATCHER_LIMB_SWING);

            if (syncedAmount != null) {
                this.limbSwingAmount = syncedAmount;
            }
            if (syncedSwing != null) {
                this.limbSwing = syncedSwing;
            }
        }

        // ====== AI 与瞬移逻辑 ======
        EntityLivingBase currentTarget = this.getAttackTarget();

        // 检查目标是否为创造模式玩家，若是则清空
        if (currentTarget instanceof EntityPlayer && ((EntityPlayer) currentTarget).capabilities.isCreativeMode) {
            this.setAttackTarget(null);
            currentTarget = null;
        }

        // ====== 玩家仇恨 & 瞬移逻辑 ======
        List<EntityPlayer> players = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class,
            this.boundingBox.expand(16.0D, 16.0D, 16.0D));

        if (!players.isEmpty()) {
            for (EntityPlayer player : players) {
                // 跳过创造模式玩家的仇恨和攻击
                if (player.capabilities.isCreativeMode) continue;
                becomeAngryAt(player);

                double distSq = this.getDistanceSqToEntity(player);

                int minInterval = 800;
                int maxInterval = 2000;

                // 距离越远瞬移越快，越近越慢
                if (distSq > 256) { // 超过16格
                    minInterval = 40;
                    maxInterval = 80;
                } else if (distSq < 64) { // 小于8格
                    minInterval = 120;
                    maxInterval = 240;
                } else {
                    minInterval = 80;
                    maxInterval = 200;
                }

                if (this.wait >= this.nextTeleportTick) {
                    this.wait = 0;
                    this.nextTeleportTick = minInterval + this.rand.nextInt(maxInterval - minInterval);

                    if (!this.worldObj.isRemote && canTeleport && distSq > 64) { // 只有在距离较远时才瞬移
                        this.setAttackTarget(player); // 设置目标
                        teleportToTarget();           // 瞬移到目标位置
                        outOfRangeHits = 0; // 重置远程攻击计数
                    } else if (distSq <= 64) { // 距离较近时使用地面追踪
                        if (!this.worldObj.isRemote && !isFlying) {
                            this.setAttackTarget(player);
                            // 使用地面追踪AI
                            if (distSq > 2.5 * 2.5) { // 如果距离大于攻击范围，尝试移动
                                this.getNavigator().tryMoveToEntityLiving(player, 1.0D);
                            }
                        }
                    }
                }
            }
        }

        // ====== 优化: 飞行 vs 走路 切换逻辑 ======
        if (currentTarget == null) {
            currentTarget = this.getAttackTarget(); // 重新获取
        }

        // 根据高度判断是否在飞行
        if (currentTarget != null) {
            double groundY = this.worldObj.getTopSolidOrLiquidBlock((int) this.posX, (int) this.posZ);
            double heightOffGround = this.posY - groundY;
            isFlying = heightOffGround > Math.ceil(this.height);
        }
        boolean shouldFly = shouldEntityFly(currentTarget);

        // 根据shouldFly状态决定使用哪种AI
        if (shouldFly) {
            if (ModConfig.useNewFlightAI) {
                // 新飞行逻辑
                handleTargetTracking(4.0D, 1.6D);
            } else {
                // 旧飞行逻辑
                handleOldFlight();
            }
        } else {
            // 地面行走追踪逻辑
            handleGroundTracking();
        }

        // ====== 其他常规更新 ======
        updateArmSwingProgress();
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        super.onLivingUpdate();

        // 定时刷新仇恨目标（每秒一次）
        if (!this.worldObj.isRemote && this.ticksExisted % 20 == 0) {
            updateTargetFromHate();
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        // 客户端：渲染光环粒子
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8 && (angerLevel >= 400) && (hasAnAura || auraLightning || hasAGodAura)) {
            // 限制粒子数量
            int particleCount = Math.min(5, JGConfigClientSettings.get_da1());
            for (int k = 0; k < particleCount; k++) {
                double y20 = 0.30000001192092896D;
                double x21 = 0.019999999552965164D;
                double x22 = 0.009999999776482582D;
                double y21 = 0.8999999761581421D;
                double random0 =0.800000011920929D;
                double random01 =0.029999999329447746D;
                double random02 =0.05000000074505806D;
                Entity pl = this;
                float red = auraRed;float green = auraGreen;float blue = auraBlue;
                float red2 = auraRed2;float green2 = auraGreen2;float blue2 = auraBlue2;
                float life = 0.8F * pl.height;
                float extra_scale = 1.0F + (pl.height > 2.1F ? pl.height / 2.0F : 0.0F) / 5.0F;
                double x = (Math.random() - 0.5D) * (width * 1.2F);
                double y = Math.random() * (this.height * 1.4F) - this.height / 2.0F - y20;
                double z = (Math.random() - 0.5D) * (width * 1.2F);
                double motx = Math.random() * x21 - x22;
                double moty = (Math.random() * y21 + y21) * (life * extra_scale * 0.07D);
                double motz = Math.random() * x21 - x22;
                for (int i = 0; i < 5; i++) {
                    x = (Math.random() - 0.5D) * (width * 1.2F);
                    y = Math.random() * (this.height * 1.4F) - this.height / 2.0F - y20;
                    z = (Math.random() - 0.5D) * (width * 1.2F);
                    motx = Math.random() * x21 - x22;
                    moty = (Math.random() * y21 + y21) * (life * extra_scale * 0.07D);
                    motz = Math.random() * x21 - x22;
                    if (hasAnAura) {
                        Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY
                            + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int) (Math.random() * 3.0D) + 32, 8, 3,
                            32, false, 0.0F, false, 0.0F, 1, "", (int) (30.0F * life * 0.5F), 2,
                            ((float) (Math.random() * random01) + 0.03F) * life * extra_scale, ((float) (Math.random() * x22) + 0.02F) * life * extra_scale,
                            0.2F * life * extra_scale, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F,
                            0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);
                        pl.worldObj.spawnEntityInWorld(entity);
                        Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY
                            + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int) (Math.random() * 8.0D) + 32, 32, 8,
                            32, false, 0.0F, false, 0.0F, 1, "", (int) (30.0F * life * 0.5F), 2,
                            ((float) (Math.random() * random01) + 0.03F) * life * extra_scale, ((float) (Math.random() * x22) + 0.02F) * life * extra_scale,
                            0.1F * life * extra_scale, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                            2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);
                        pl.worldObj.spawnEntityInWorld(entity2);
                    }
                }
                if(hasAGodAura) {
                    float out = 1.6F;float in = 1.0F;
                    extra_scale = 0.5F;
                    int dea = 50;
                    for (int gh = 0; gh < 2; gh++) {
                        x = Math.random() * out - out / 2.0F;
                        y = Math.random() * this.height - 0.5D;
                        z = Math.random() * out - out / 2.0F;

                        Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ,
                            x, y, z, 0.0D, Math.random() * random02, 0.0D, 0.0F, (int)(Math.random() * 3.0D) + 8, 8, 3, 32,
                            false, 0.0F, false, 0.0F, 1, "", 50, 2,
                            ((float)(Math.random() * random01) + 0.03F) * life * 0.5F, ((float)(Math.random() * x22) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,
                            red2, green2, blue2, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F,
                            0.015F, false, -1, false, pl);

                        x = Math.random() * out - out / 2.0F;
                        y = Math.random() * this.height - 0.5D;
                        z = Math.random() * out - out / 2.0F;
                        entity.worldObj.spawnEntityInWorld(entity);

                        Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ,
                            x, y, z, 0.0D, Math.random() * random02, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32,
                            false, 0.0F, false, 0.0F, 1, "", 50, 2,
                            ((float)(Math.random() * random01) + 0.03F) * life * 0.5F, ((float)(Math.random() * x22) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,
                            red2, green2, blue2, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F,
                            0.015F, false, -1, false, pl);

                        entity.worldObj.spawnEntityInWorld(entity2);
                    }
                    out *= 1.4F;
                    x = Math.random() * out - out / 2.0F;
                    y = Math.random() * this.height - 0.5D;
                    z = Math.random() * out - out / 2.0F;

                    Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ,
                        x, y, z, 0.0D, Math.random() * random02, 0.0D, 0.0F, (int)(Math.random() * 3.0D) + 8, 8, 3, 32,
                        false, 0.0F, false, 0.0F, 1, "", 50, 2,
                        ((float)(Math.random() * random01) + 0.03F) * life * 0.5F, ((float)(Math.random() * x22) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,
                        red, green, blue, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F,
                        0.015F, false, -1, false, pl);

                    x = Math.random() * out - out / 2.0F;
                    y = Math.random() * this.height - 0.5D;
                    z = Math.random() * out - out / 2.0F;
                    entity.worldObj.spawnEntityInWorld(entity);

                    Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ,
                        x, y, z, 0.0D, Math.random() * random02, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32,
                        false, 0.0F, false, 0.0F, 1, "", 50, 2,
                        ((float)(Math.random() * random01) + 0.03F) * life * 0.5F, ((float)(Math.random() * x22) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,
                        red, green, blue, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F,
                        0.015F, false, -1, false, pl);
                    entity2.worldObj.spawnEntityInWorld(entity2);
                }

                if(auraLightning && lightningCount == 1) {
                    Entity entity3 = new EntityCusPar(ModVars.MOD_ID + ":textures/effect/lightning.png", pl.worldObj, 0.2F, 0.2F, pl.posX,
                        pl.posY + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int) (Math.random() * 8.0D) + 32,
                        32, 8, 32, false, 0.0F, false, 0.0F, 1, "", (int) (30.0F * life * 0.5F), 2,
                        ((float) (Math.random() * random01) + 0.03F) * life * extra_scale, ((float) (Math.random() * x22) + 0.02F) * life * extra_scale, 0.1F
                        * life * extra_scale, 0, 255.0F, 255.0F, 255.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);

                    pl.worldObj.spawnEntityInWorld(entity3);

                    if (pl.ticksExisted % 25 == this.rand.nextInt(25) || pl.ticksExisted % 70 == 1) {
                        Main.network.sendToServer(new MessageSendEntityToSpark(this.getEntityId()));
                    }

                    lightningCount = 0;
                }
                else
                {
                    lightningCount++;
                }
            }
        }

        // 服务端：处理瞬移冷却、仇恨清理
        if (!this.worldObj.isRemote) {
            // 1. 瞬移冷却倒计时
            if (teleportCooldown > 0) {
                teleportCooldown--;
            }

            // 2. 条件1：远程攻击触发瞬移
            if (outOfRangeHits >= TELEPORT_TRIGGER_HITS && this.getAttackTarget() != null) {
                EntityLivingBase target = this.getAttackTarget();
                if (!(target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode)) {
                    double distSq = this.getDistanceSqToEntity(target);
                    if (distSq > 4.0D && canTeleport) {
                        teleportToTarget();
                        outOfRangeHits = 0; // 重置远程攻击计数
                    }
                }
            }

            // 3. 条件2：每15秒强制瞬移
            if (teleportCooldown <= 0 && this.getAttackTarget() != null) {
                EntityLivingBase target = this.getAttackTarget();
                if (!(target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode)) {
                    double distSq = this.getDistanceSqToEntity(target);
                    if (distSq > 4.0D && canTeleport) {
                        teleportToTarget();
                    }
                }
                teleportCooldown = 300; // 重置冷却
            }

            // 4. 清理仇恨表（防止内存泄漏）
            if (this.ticksExisted % 100 == 0) {
                hateMap.entrySet().removeIf(entry ->
                    entry.getKey() == null ||
                        entry.getKey().isDead ||
                        this.getDistanceSqToEntity(entry.getKey()) > 100.0D
                );
            }

            // 5. 生成者检测与验证
            final double SPAWNER_SEARCH_RADIUS = DBCConfig.mdal;
            handleSpawnerDetection(SPAWNER_SEARCH_RADIUS);
            validateSpawnerPresence(SPAWNER_SEARCH_RADIUS);

            // 6. 客户端更新
            final int CLIENT_UPDATE_INTERVAL = 20;
            if (this.worldObj.isRemote) {
                handleClientUpdates(CLIENT_UPDATE_INTERVAL);
            } else {
                if (!this.updtd) {
                    this.updtd = true;
                }
            }
        }
    }

    private void handleGroundTracking() {
        EntityLivingBase target = this.getAttackTarget();
        if (target == null) return;

        if (target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode) {
            return;
        }

        double dx = target.posX - this.posX;
        double dy = target.posY - this.posY;
        double dz = target.posZ - this.posZ;
        double horizontalDist = Math.sqrt(dx * dx + dz * dz);
        double totalDist = Math.sqrt(dx * dx + dy * dy + dz * dz);

        if (totalDist < 2.5D) return;

        // ========== 深坑检测与飞行脱困 ==========
        boolean isInDeepPit = (dy > 2.0D); // 目标在上方超过2格
        boolean isStuckHorizontally = (Math.abs(this.motionX) < 0.05D && Math.abs(this.motionZ) < 0.05D);

        if (isInDeepPit && this.onGround && isStuckHorizontally) {
            this.flightEscapeTicks = 10; // 激活持续脱困
        }

        // ========== 持续飞行脱困逻辑 ==========
        if (this.flightEscapeTicks > 0) {
            this.flightEscapeTicks--;
            this.motionY = 0.4D; // 持续上升力
            this.onGround = false; // 强制脱离地面状态
            this.isAirBorne = true;

            // 同时给予水平推力，防止卡在角落
            if (horizontalDist > 0.1D) {
                this.motionX = (dx / horizontalDist) * 0.3D;
                this.motionZ = (dz / horizontalDist) * 0.3D;
            }
            return; // 跳过其他移动逻辑
        }

        // ========== 智能障碍检测与应对 ==========
        if (horizontalDist > 0.1D && this.onGround) {
            // 检测前方是否有障碍
            if (hasObstacleAhead(dx, dz, horizontalDist)) {
                // 尝试跳跃越过1格高障碍
                if (canJumpOverObstacle(dx, dz, horizontalDist)) {
                    this.motionY = 0.4D; // 跳跃
                    this.isAirBorne = true;
                } else {
                    // 如果无法跳跃，尝试侧移绕过
                    tryToMoveAround(dx, dz, horizontalDist);
                }
            } else {
                // 没有障碍，正常移动
                moveTowardTarget(dx, dz, horizontalDist);
            }
        } else if (horizontalDist > 0.1D) {
            // 空中或非地面状态，继续朝目标移动
            moveTowardTarget(dx, dz, horizontalDist);
        }

        this.fallDistance = 0.0F; // 防摔伤
    }

    // 检测前方是否有障碍
    private boolean hasObstacleAhead(double dx, double dz, double dist) {
        double lookX = dx / dist;
        double lookZ = dz / dist;

        // 检测前方1格范围内的障碍
        double probeX = this.posX + lookX * 0.8D;
        double probeZ = this.posZ + lookZ * 0.8D;

        int probeY = MathHelper.floor_double(this.posY);
        int headY = MathHelper.floor_double(this.posY + this.height);

        // 检查路径上是否有阻挡方块
        for (int y = probeY; y <= headY; y++) {
            if (!this.worldObj.getBlock(MathHelper.floor_double(probeX), y, MathHelper.floor_double(probeZ)).getMaterial().isReplaceable()) {
                return true; // 发现障碍
            }
        }
        return false;
    }

    // 检查是否可以跳跃越过障碍
    private boolean canJumpOverObstacle(double dx, double dz, double dist) {
        double lookX = dx / dist;
        double lookZ = dz / dist;

        double probeX = this.posX + lookX * 0.8D;
        double probeZ = this.posZ + lookZ * 0.8D;

        int currentY = MathHelper.floor_double(this.posY - 0.2D); // 当前脚下
        int frontY = MathHelper.floor_double(this.posY + 0.8D); // 前方头顶
        int frontHeadY = MathHelper.floor_double(this.posY + this.height + 0.2D); // 前方头顶

        // 检查前方是否是1格台阶（脚下固体，头顶空气）
        Block footBlock = this.worldObj.getBlock(MathHelper.floor_double(probeX), currentY, MathHelper.floor_double(probeZ));
        Block headBlock = this.worldObj.getBlock(MathHelper.floor_double(probeX), frontHeadY, MathHelper.floor_double(probeZ));

        return footBlock.getMaterial().isSolid() && headBlock.getMaterial().isReplaceable();
    }

    // 尝试绕过障碍
    private void tryToMoveAround(double dx, double dz, double dist) {
        // 尝试向左或向右移动绕过障碍
        double lookX = dx / dist;
        double lookZ = dz / dist;

        // 计算垂直于目标方向的向量（左转90度）
        double sideX = -lookZ;
        double sideZ = lookX;

        // 检查左侧是否有路径
        if (canMoveTo(this.posX + sideX * 1.0D, this.posZ + sideZ * 1.0D)) {
            this.motionX = sideX * 0.3D;
            this.motionZ = sideZ * 0.3D;
        }
        // 检查右侧是否有路径
        else if (canMoveTo(this.posX - sideX * 1.0D, this.posZ - sideZ * 1.0D)) {
            this.motionX = -sideX * 0.3D;
            this.motionZ = -sideZ * 0.3D;
        }
        // 如果左右都不可行，尝试跳跃
        else {
            this.motionY = 0.4D;
            this.isAirBorne = true;
        }
    }

    // 检查指定位置是否可以移动
    private boolean canMoveTo(double x, double z) {
        int checkY = MathHelper.floor_double(this.posY - 0.2D);
        int headY = MathHelper.floor_double(this.posY + this.height);

        // 检查路径上是否都是可通行方块
        for (int y = checkY; y <= headY; y++) {
            if (!this.worldObj.getBlock(MathHelper.floor_double(x), y, MathHelper.floor_double(z)).getMaterial().isReplaceable()) {
                return false;
            }
        }
        return true;
    }

    // 朝目标移动
    private void moveTowardTarget(double dx, double dz, double dist) {
        // ======= 动态速度计算：距离越远速度越快 =======
        double baseSpeed = 0.2D; // 基础速度
        double distanceFactor = Math.min(1.0D, dist * 0.02D); // 距离系数
        double totalSpeed = baseSpeed + distanceFactor; // 总速度

        // ======= 加速系数 =======
        double accel = 0.12D + Math.min(0.6D, dist * 0.015D);
        double maxSpeed = totalSpeed * 2.0D;

        // ======= 三维单位向量（只取XZ方向）=======
        Vec3 vecToTarget = Vec3.createVectorHelper(dx, 0, dz).normalize(); // 忽略Y轴

        // ======= 只对XZ轴施加运动 =======
        this.motionX += vecToTarget.xCoord * accel;
        this.motionZ += vecToTarget.zCoord * accel;

        // ======= 限制最大速度（只限制XZ平面）=======
        double totalSpeedSq = this.motionX * this.motionX + this.motionZ * this.motionZ;
        if (totalSpeedSq > maxSpeed * maxSpeed) {
            double scale = maxSpeed / Math.sqrt(totalSpeedSq);
            this.motionX *= scale;
            this.motionZ *= scale;
        }
    }




    public double getDistanceSqToEntity(Entity entity) {
        double dx = this.posX - entity.posX;
        double dy = this.posY - entity.posY;
        double dz = this.posZ - entity.posZ;
        return dx * dx + dy * dy + dz * dz;
    }


    private boolean shouldEntityFly(EntityLivingBase target) {
        if (target == null) {
            return false;
        }
        // 检查创造模式
        if (target instanceof EntityPlayer player) {
            if (player.capabilities.isCreativeMode) {
                return false;
            }
        }

        double groundY = this.worldObj.getTopSolidOrLiquidBlock((int) this.posX, (int) this.posZ);
        double heightOffGround = this.posY - groundY;

        return heightOffGround > Math.ceil(this.height);
    }

    // 瞬移到目标位置
    private void teleportToTarget() {
        EntityLivingBase target = this.getAttackTarget();
        if (target == null || worldObj.isRemote) return;
        if (target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode) {
            return;
        }
        worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC3.teleport", 1.0F, 1.0F);

        Vec3 lookVec = target.getLookVec();
        double teleportDistance = 2.0;

        double newX = target.posX - lookVec.xCoord * teleportDistance;
        double newZ = target.posZ - lookVec.zCoord * teleportDistance;

        double targetTopY = target.boundingBox.maxY;

        setPositionAndUpdate(newX, targetTopY, newZ);

        attackCounter = 0;
        teleportCooldown = 300; // 统一重置冷却
    }

    // 辅助方法分解
    private void handleSpawnerDetection(double radius) {
        if (this.spwner == null && radius > 0) {
            AxisAlignedBB searchArea = createBoundingBox(radius);
            List<EntityPlayer> nearbyPlayers = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, searchArea);

            if (!nearbyPlayers.isEmpty()) {
                // 允许创造模式玩家作为生成者（仅用于存在验证，AI仍忽略其战斗）
                this.spwner = nearbyPlayers.get(0); // 直接取第一个，不管模式
            }
        }
    }

    private void validateSpawnerPresence(double radius) {
        if (this.spwner != null && radius > 0) {
            AxisAlignedBB checkArea = createBoundingBox(radius);
            List<EntityPlayer> nearbyPlayers = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, checkArea);

            int validSpawnerCount = countValidSpawners(nearbyPlayers);

            if (validSpawnerCount == 0) {
                if (--this.noSpwnr <= 0) {
                    setDead();
                }
            } else if (this.noSpwnr != DBCConfig.mdat) {
                this.noSpwnr = DBCConfig.mdat;
            }
        } else if (!this.worldObj.isRemote && this.spwner == null) {
            setDead();
        }
    }

    private int countValidSpawners(List<EntityPlayer> players) {
        // 不再检查 isCreativeMode，所有玩家都算作有效的生成者
        // 这样即使在创造模式下，实体也能保持存在
        return players.size();
    }

    private void handleClientUpdates(int updateInterval) {
        if (++this.rang > updateInterval) {
            this.rang = 0;
            int entityId = updateDataInt(23);
            EntityLivingBase target = (entityId > 0) ? (EntityLivingBase) this.worldObj.getEntityByID(entityId) : null;
            // 检查目标是否为创造模式玩家
            if (target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode) {
                target = null;
            }
            this.setAttackTarget(target);
        }
    }

    private void handleTargetTracking(double chaseThreshold, double snapThreshold) {
        EntityLivingBase target = this.getAttackTarget();
        // 如果目标是玩家且处于创造模式，则直接返回，不启用飞行 AI
        if (target instanceof EntityPlayer player) {
            if (player.capabilities.isCreativeMode) {
                return;
            }
        }

        if (target != null && this.canEntityBeSeen(target)) {
            double dx = target.posX - this.posX;
            double dy = target.posY - this.posY;
            double dz = target.posZ - this.posZ;
            double distanceSq = dx * dx + dy * dy + dz * dz;
            double distance = Math.sqrt(distanceSq);
            if (distance < 3.0D) return;
            // ======= 动态速度计算：距离越远速度越快 =======
            double baseSpeed = 0.33D; // 基础速度
            double distanceFactor = Math.min(1.0D, distance * 0.02D); // 距离系数
            double totalSpeed = baseSpeed + distanceFactor; // 总速度

            // ======= 加速系数 =======
            double accel = 0.12D + Math.min(0.6D, distance * 0.015D);
            double maxSpeed = totalSpeed * 2.0D;

            // ======= 三维单位向量 =======
            Vec3 vecToTarget = Vec3.createVectorHelper(dx, dy, dz).normalize();

            // ======= 直接施加运动 =======
            this.motionX += vecToTarget.xCoord * accel;
            this.motionY += vecToTarget.yCoord * accel;
            this.motionZ += vecToTarget.zCoord * accel;

            // ======= 限制最大速度 =======
            double totalSpeedSq = this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ;
            if (totalSpeedSq > maxSpeed * maxSpeed) {
                double scale = maxSpeed / Math.sqrt(totalSpeedSq);
                this.motionX *= scale;
                this.motionY *= scale;
                this.motionZ *= scale;
            }

            this.fallDistance = 0.0F; // 防止摔落伤害
        }
    }

    private void handleOldFlight() {
        EntityLivingBase target = this.getAttackTarget();
        if (target != null && this.canEntityBeSeen(target)) {
            if (target.posY - 4.0D > this.posY) {
                this.motionY += 0.1D;
            } else if (target.posY - 1.6D >= this.posY) {
                this.posY = target.posY - 1.6D;
                this.motionY = 0.0D;
                this.fallDistance = 0.0F;
            }
        }
    }

    private AxisAlignedBB createBoundingBox(double radius) {
        return AxisAlignedBB.getBoundingBox(
            this.posX - radius, this.posY - radius, this.posZ - radius,
            this.posX + radius, this.posY + radius, this.posZ + radius
        );
    }

    public void becomeAngryAtAllPlayer() {
        List<EntityPlayer> players = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class,
            this.boundingBox.expand(100, 100, 100));
        for (EntityPlayer p : players) {
            // 跳过创造模式玩家
            if (p.capabilities.isCreativeMode) continue;
            becomeAngryAt(p);
        }
    }

    private void becomeAngryAt(Entity par1Entity) {
        if (par1Entity instanceof EntityLivingBase target) {
            // 跳过创造模式玩家
            if (target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode) {
                return;
            }
            this.setAttackTarget(target);
            this.angerLevel = (400 + this.rand.nextInt(400));
        }
    }

    // 增加仇恨
    public void addHate(EntityLivingBase entity, int amount) {
        if (entity == null || entity.isDead) return;
        // 跳过创造模式玩家
        if (entity instanceof EntityPlayer && ((EntityPlayer) entity).capabilities.isCreativeMode) {
            return;
        }
        hateMap.put(entity, hateMap.getOrDefault(entity, 0) + amount);
    }

    // 选择仇恨最高的目标
    private void updateTargetFromHate() {
        EntityLivingBase highest = null;
        int maxHate = -1;

        for (Map.Entry<EntityLivingBase, Integer> entry : hateMap.entrySet()) {
            EntityLivingBase e = entry.getKey();
            if (e == null || e.isDead || this.getDistanceToEntity(e) > 40) {
                continue; // 距离太远/死亡的不算
            }
            // 跳过创造模式玩家
            if (e instanceof EntityPlayer && ((EntityPlayer) e).capabilities.isCreativeMode) {
                continue;
            }
            if (entry.getValue() > maxHate) {
                maxHate = entry.getValue();
                highest = e;
            }
        }

        if (highest != null && this.getAttackTarget() != highest) {
            this.setAttackTarget(highest);
        }
    }

    // 当攻击别人时增加仇恨，保证不容易切目标
    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean result = super.attackEntityAsMob(entityIn);
        if (result && entityIn instanceof EntityLivingBase target) {
            // 跳过创造模式玩家
            if (target instanceof EntityPlayer && ((EntityPlayer) target).capabilities.isCreativeMode) {
                return result;
            }
            addHate(target, 5); // 每次攻击锁定更牢固
        }
        return result;
    }
}
