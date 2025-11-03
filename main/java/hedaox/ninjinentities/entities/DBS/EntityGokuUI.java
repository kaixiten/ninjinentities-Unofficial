package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.config.ModConfig;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.event.DodgeSystem;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGokuUI extends EntityDBCNinjin {
    // 闪避系统实例
    private final DodgeSystem dodgeSystem = new DodgeSystem(this);

    // 反击概率缓存
    private final float counterChance = (float)(ModConfig.gokuUIMCounterChance / 100.0);

    public EntityGokuUI(World world) {
        super(world, 100, MindState.NEUTRAL, true, true, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7}, 255.0F, 255.0F, 255.0F, false, true, 225.0F, 225.0F, 225.0F);
        this.experienceValue = 80;
        this.setSize(0.6F, 1.8F);

        // 初始化闪避参数
        this.dodgeSystem.dodge = (int)ModConfig.gokuUIDodgeRate;
        this.dodgeSystem.strikeBack = (int)ModConfig.gokuUICounterChance;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(110000.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15000.0D);
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float damage) {
        if (dodgeSystem.tryDodge(source.getEntity())) {
            tryCounterAttack(source.getEntity());
            return false;
        }
        return super.attackEntityFrom(source, damage);
    }

    private void tryCounterAttack(Entity attacker) {
        NBTTagCompound nbt = this.getEntityData();
        if (nbt.hasKey("jrmcSpawnInitiatedCAT") &&
            attacker instanceof EntityPlayer &&
            DodgeSystem.RANDOM.nextFloat() < counterChance) {

            double attackDamage = nbt.getDouble("jrmcSpawnInitiatedCAT");
            dodgeSystem.performCounterAttack(attacker, attackDamage);
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity target) {
        this.swingItem();
        return super.attackEntityAsMob(target);
    }

    @SideOnly(Side.CLIENT)
    public String getTexture() {
        return ModVars.MOD_ID + ":textures/entity/gokuUi.png";
    }
}
