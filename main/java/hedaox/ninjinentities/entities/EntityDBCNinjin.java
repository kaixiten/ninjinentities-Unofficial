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
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
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
	protected Entity targetedEntity = null;
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
	private static double random = Math.random();
	public boolean hasAGodAura = false;
	private boolean updtd = false;
    private final double moveSpeed = DBCConfig.EnemyDefaultMoveSpeed;
    private int outOfRangeHits = 0; // 记录近战范围外被攻击次数
    private static final double MELEE_RANGE = 3.5; // 近战范围
    private static final int TELEPORT_TRIGGER_HITS = 5; // 触发瞬移的攻击次数
    private int nextTeleportTick = 100;
    private int teleportCooldown = 160;
    private Map<EntityLivingBase, Integer> hateMap = new HashMap<>();


    public boolean isBlst() {
        return blst;
    }

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
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, boolean _hasAnAura) {
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
        hasAnAura = _hasAnAura;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue) {
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
        auraRed = _auraRed;
        auraGreen = _auraGreen;
        auraBlue = _auraBlue;
        hasAnAura = true;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning) {
        super(par1World);
        setMediumDifficulty();
        alignment = _alignment;
        this.isTrainer = _isTrainer;
        mindState = _mindState;
        canTeleport = _canTeleport;
        attacksType = _attacksType;
        attacksColor = _attacksColors;
        if (mindState == EntityDBCNinjin.MindState.AGGRESSIVE)
            angerLevel = 400;
        auraRed = _auraRed;
        auraGreen = _auraGreen;
        auraBlue = _auraBlue;
        hasAnAura = true;
        auraLightning = _auraLightning;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod) {
        super(par1World);
        setMediumDifficulty();
        alignment = _alignment;
        this.isTrainer = _isTrainer;
        mindState = _mindState;
        canTeleport = _canTeleport;
        attacksType = _attacksType;
        attacksColor = _attacksColors;
        if (mindState == EntityDBCNinjin.MindState.AGGRESSIVE)
            angerLevel = 400;
        auraRed = _auraRed;
        auraGreen = _auraGreen;
        auraBlue = _auraBlue;
        hasAnAura = false;
        auraLightning = _auraLightning;
        hasAGodAura = _auraGod;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod, float _auraRed2, float _auraGreen2, float _auraBlue2) {
        super(par1World);
        setMediumDifficulty();
        alignment = _alignment;
        this.isTrainer = _isTrainer;
        mindState = _mindState;
        canTeleport = _canTeleport;
        attacksType = _attacksType;
        attacksColor = _attacksColors;
        if (mindState == EntityDBCNinjin.MindState.AGGRESSIVE)
            angerLevel = 400;
        auraRed = _auraRed;
        auraGreen = _auraGreen;
        auraBlue = _auraBlue;
        auraRed2 = _auraRed2;
        auraGreen2 = _auraGreen2;
        auraBlue2 = _auraBlue2;
        hasAnAura = false;
        auraLightning = _auraLightning;
        hasAGodAura = _auraGod;
    }

    public EntityDBCNinjin(World par1World, int _alignment, MindState _mindState, boolean _isTrainer, boolean _canTeleport, byte[] _attacksType, byte[] _attacksColors, float _auraRed, float _auraGreen, float _auraBlue, boolean _auraLightning, boolean _auraGod, float _auraRed2, float _auraGreen2, float _auraBlue2, boolean _hasAnAura) {
        super(par1World);
        setMediumDifficulty();
        alignment = _alignment;
        this.isTrainer = _isTrainer;
        mindState = _mindState;
        canTeleport = _canTeleport;
        attacksType = _attacksType;
        attacksColor = _attacksColors;
        if (mindState == EntityDBCNinjin.MindState.AGGRESSIVE)
            angerLevel = 400;
        auraRed = _auraRed;
        auraGreen = _auraGreen;
        auraBlue = _auraBlue;
        auraRed2 = _auraRed2;
        auraGreen2 = _auraGreen2;
        auraBlue2 = _auraBlue2;
        hasAnAura = _hasAnAura;
        auraLightning = _auraLightning;
        hasAGodAura = _auraGod;
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
            if ((this.targetedEntity != null) && (this.targetedEntity.isDead)) {
                this.targetedEntity = null;
                this.dataWatcher.updateObject(23, 0);
                super.updateEntityActionState();
            }
            if ((this.targetedEntity == null) || (this.aggroCooldown-- <= 0)) {
                this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0D);
                super.updateEntityActionState();
                if (this.targetedEntity != null) {
                    this.dataWatcher.updateObject(23, this.targetedEntity.getEntityId());
                    this.aggroCooldown = 20;
                }
            }
            boolean isInMeleeRange = false;
            if (this.targetedEntity != null) {
                float r = this.width / 2.0F + 3.5F;
                if ((this.entityToAttack != null) && (this.entityToAttack.isEntityAlive()) && (this.entityToAttack.getDistanceToEntity(this) < r)) {
                    AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(this.posX - r, this.posY - r, this.posZ - r, this.posX + r, this.posY + r, this.posZ + r);
                    List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                    double distance = getXZDistanceToEntity(this.targetedEntity);
                    if (this.attackTime - ((!DBCConfig.AaiDisabled && distance < 0.5D) ? (DBCConfig.EnemyDefaultAttackTimer - DBCConfig.EnemyDefaultShortRangeAttackTimer) : 0) <= 0) {
                        for (int i = 0; i < list.size(); i++) {
                            EntityPlayer player = list.get(i);
                            attackEntityAsMob(player);
                        }
                        this.attackTime = DBCConfig.EnemyDefaultAttackTimer;
                        this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC3.force", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
                    }
                }
                if (this.targetedEntity != null && this.targetedEntity.isEntityAlive()
                    && this.targetedEntity.getDistanceSqToEntity(this) < 4096.0D) {
                    double distanceMulti = this.targetedEntity.getDistanceSqToEntity(this) / 50.0D * 0.1D + 1.0D;
                    double ogTimer = ((this.kiAttackTimer >= 10) ? this.kiAttackTimer : 80);
                    int fireAttackRate = (int)(ogTimer / distanceMulti);
                    if (fireAttackRate < this.kiAttackTimerMin) {fireAttackRate = this.kiAttackTimerMin;
                    }
                    double d5 = this.targetedEntity.posX - this.posX;
                    double d6 = (this.targetedEntity.posY + this.targetedEntity.getEyeHeight()) - (this.posY + this.height / 2.0F);
                    double d7 = this.targetedEntity.posZ - this.posZ;

                    this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0F / (float)Math.PI;

                    double horizontalDist = Math.hypot(d5, d7);

                    this.rotationPitch = (float)(-Math.atan2(d6, horizontalDist) * 180.0D / Math.PI);


                    if (this.canFireKiAttacks && canEntityBeSeen(this.targetedEntity)) {
                        if (!this.hasAAiKiChargeSystem || this.chargingKiAttack) {
                            this.attackCounter++;
                            if (this.attackCounter >= fireAttackRate) {
                                EntityEnergyAtt kiAttack;
                                this.worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC2.basicbeam_fire", 0.5F, 1.0F);
                                byte type = this.data1;
                                byte speed = 1;
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
                                if (this.data1 != 6 || (int)(Math.random() * 8.0D) == 0) {
                                    this.attackCounter = -40;
                                    this.blst = true;
                                } else {
                                    this.attackCounter = this.kiBarrageType0 ? (fireAttackRate - 10) : fireAttackRate;
                                    this.blst = false;
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

		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(
				0.7D);
	}

	public void onDeath(DamageSource par1DamageSource) {
		Entity entitySource = par1DamageSource.getEntity();
		if ((entitySource instanceof EntityPlayer)) {
			List<?> listCloseEntities = this.worldObj
					.getEntitiesWithinAABBExcludingEntity(this,
							this.boundingBox.expand(32.0D, 32.0D, 32.0D));
			for (int i = 0; i < listCloseEntities.size(); i++) {
				Entity entity = (Entity) listCloseEntities.get(i);
				if ((entity instanceof EntityDBCNinjin)) {
					EntityDBCNinjin entityTrain = (EntityDBCNinjin) entity;
					entityTrain.becomeAngryAt(entitySource);
				}
			}
			becomeAngryAt(entitySource);
		}

		if (entitySource instanceof EntityPlayer) {
			int e = 1;
			if (entitySource instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer)entitySource;
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
	}

	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
		this.angerLevel = par1NBTTagCompound.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}


    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        boolean result = super.attackEntityFrom(source, amount);

        if (source.getEntity() instanceof EntityPlayer) {
            EntityPlayer attacker = (EntityPlayer) source.getEntity();

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
        if (result && source.getEntity() instanceof EntityLivingBase) {
            addHate((EntityLivingBase) source.getEntity(), (int) amount * 2);
        }

        return result;
    }


    @SuppressWarnings("rawtypes")
	@Override
	public void onLivingUpdate() {

        if ((this.worldObj.isRemote) && (JGConfigClientSettings.CLIENT_DA8) && (angerLevel >= 400) && (hasAnAura || auraLightning || hasAGodAura)) {
            for (int k = 0; k < JGConfigClientSettings.get_da1(); k++) {
                EntityDBCNinjin EntityDBCNinjin = this;
                Entity pl = this;
                float red = auraRed;float green = auraGreen;float blue = auraBlue;
                float red2 = auraRed2;float green2 = auraGreen2;float blue2 = auraBlue2;
                float life = 0.8F * pl.height;
                float extra_scale = 1.0F + (pl.height > 2.1F ? pl.height / 2.0F : 0.0F) / 5.0F;
                double x = (Math.random() - 0.5D) * (width * 1.2F);
                double y = Math.random() * (this.height * 1.4F) - this.height / 2.0F - 0.30000001192092896D;
                double z = (Math.random() - 0.5D) * (width * 1.2F);
                double motx = Math.random() * 0.019999999552965164D - 0.009999999776482582D;
                double moty = (Math.random() * 0.8999999761581421D + 0.8999999761581421D) * (life * extra_scale * 0.07D);
                double motz = Math.random() * 0.019999999552965164D - 0.009999999776482582D;
                for (int i = 0; i < 5; i++) {
                    x = (Math.random() - 0.5D) * (width * 1.2F);
                    y = Math.random() * (this.height * 1.4F) - this.height / 2.0F - 0.30000001192092896D;
                    z = (Math.random() - 0.5D) * (width * 1.2F);
                    motx = Math.random() * 0.019999999552965164D - 0.009999999776482582D;
                    moty = (Math.random() * 0.8999999761581421D + 0.8999999761581421D) * (life * extra_scale * 0.07D);
                    motz = Math.random() * 0.019999999552965164D - 0.009999999776482582D;
                    if (hasAnAura) {
                        Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int) (Math.random() * 3.0D) + 32, 8, 3, 32, false, 0.0F, false, 0.0F, 1, "", (int) (30.0F * life * 0.5F), 2, ((float) (Math.random() * 0.029999999329447746D) + 0.03F) * life * extra_scale, ((float) (Math.random() * 0.009999999776482582D) + 0.02F) * life * extra_scale, 0.2F * life * extra_scale, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);
                        pl.worldObj.spawnEntityInWorld(entity);
                        Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int) (Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", (int) (30.0F * life * 0.5F), 2, ((float) (Math.random() * 0.029999999329447746D) + 0.03F) * life * extra_scale, ((float) (Math.random() * 0.009999999776482582D) + 0.02F) * life * extra_scale, 0.1F * life * extra_scale, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);
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

                        Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 3.0D) + 8, 8, 3, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0, red2, green2, blue2, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                        x = Math.random() * out - out / 2.0F;
                        y = Math.random() * this.height - 0.5D;
                        z = Math.random() * out - out / 2.0F;
                        entity.worldObj.spawnEntityInWorld(entity);

                        Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,  red2, green2, blue2, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                        entity.worldObj.spawnEntityInWorld(entity2);
                    }
                    out *= 1.4F;
                    x = Math.random() * out - out / 2.0F;
                    y = Math.random() * this.height - 0.5D;
                    z = Math.random() * out - out / 2.0F;

                    Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 3.0D) + 8, 8, 3, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,  red, green, blue, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                    x = Math.random() * out - out / 2.0F;
                    y = Math.random() * this.height - 0.5D;
                    z = Math.random() * out - out / 2.0F;
                    entity.worldObj.spawnEntityInWorld(entity);

                    Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,  red, green, blue, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                    entity.worldObj.spawnEntityInWorld(entity2);

                    x = Math.random() * in - in / 2.0F;
                    y = (Math.random() * this.height - 0.5D) * 0.800000011920929D;
                    z = Math.random() * in - in / 2.0F;

                    entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 3.0D) + 8, 8, 3, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0, 180.0F, 180F, 180.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                    x = Math.random() * in - in / 2.0F;
                    y = (Math.random() * this.height - 0.5D) * 0.800000011920929D;
                    z = Math.random() * in - in / 2.0F;
                    entity.worldObj.spawnEntityInWorld(entity);

                    entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0, 180.0F, 180.0F, 180.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                    entity.worldObj.spawnEntityInWorld(entity2);

                    in *= 1.2F;
                    x = Math.random() * in - in / 2.0F;
                    y = (Math.random() * this.height - 0.5D) * 0.800000011920929D;
                    z = Math.random() * in - in / 2.0F;

                    entity = new EntityCusPar("jinryuumodscore:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 3.0D) + 8, 8, 3, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,  red2, green2, blue2, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                    x = Math.random() * in - in / 2.0F;
                    y = (Math.random() * this.height - 0.5D) * 0.800000011920929D;
                    z = Math.random() * in - in / 2.0F;
                    entity.worldObj.spawnEntityInWorld(entity);

                    entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", this.worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", 50, 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * 0.5F, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * 0.5F, 0.2F * life * 0.5F, 0,  red2, green2, blue2, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.015F, false, -1, false, pl);

                    entity.worldObj.spawnEntityInWorld(entity2);
                }

                if(auraLightning && lightningCount == 1) {
                    Entity entity3 = new EntityCusPar(ModVars.MOD_ID + ":textures/effect/lightning.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int) (Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", (int) (30.0F * life * 0.5F), 2, ((float) (Math.random() * 0.029999999329447746D) + 0.03F) * life * extra_scale, ((float) (Math.random() * 0.009999999776482582D) + 0.02F) * life * extra_scale, 0.1F * life * extra_scale, 0, 255.0F, 255.0F, 255.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);

                    pl.worldObj.spawnEntityInWorld(entity3);

                    if (pl.ticksExisted % 25 == (int) random * 25 || pl.ticksExisted % 70 == 1) {
                        Main.network.sendToServer(new MessageSendEntityToSpark(this.getEntityId()));
                        random = Math.random();
                    }

                    lightningCount = 0;
                }
                else
                {
                    lightningCount++;
                }
            }
        }
        this.wait++;

        // ====== 玩家仇恨 & 瞬移逻辑 ======
        List<EntityPlayer> players = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class,
            this.boundingBox.expand(16.0D, 16.0D, 16.0D));

        if (!players.isEmpty()) {
            for (EntityPlayer player : players) {
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

                    if (!this.worldObj.isRemote && canTeleport) {
                        this.targetedEntity = player; // 设置目标
                        teleportToTarget();           // 瞬移到目标位置
                    }
                }
            }
        }

        // ====== 🆕 新增: 飞行 vs 走路 切换逻辑 ======
        if (this.getAttackTarget() != null) {
            EntityLivingBase target = this.getAttackTarget();
            double dx = target.posX - this.posX;
            double dy = target.posY - this.posY;
            double dz = target.posZ - this.posZ;
            double distanceSq = dx * dx + dy * dy + dz * dz;

            boolean shouldFly = false;

            // 条件1: 距离太远（>8格）
            if (distanceSq > 80) {
                shouldFly = true;
            }

            // 条件2: 高度差大（>3格）
            if (Math.abs(dy) > 3.0D) {
                shouldFly = true;
            }

            if (shouldFly) {
                // ====== 判断使用新飞行还是旧飞行 ======
                if (ModConfig.useNewFlightAI) {
                    handleTargetTracking(4.0D, 1.0D);
                } else {
                    handleOldFlight();
                }

                this.onGround = false; // 避免地面动画干扰
            } else {
                // 使用寻路 AI（走路）
                this.getNavigator().tryMoveToEntityLiving(target, 1.0D);
            }
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
        final double SPAWNER_SEARCH_RADIUS = DBCConfig.mdal;
        final double VERTICAL_CHASE_THRESHOLD = 4.0D;
        final double VERTICAL_SNAP_THRESHOLD = 1.6D;
        final int CLIENT_UPDATE_INTERVAL = 20;
        final double MIN_TELEPORT_DIST_SQ = 4.0D; // 2格以内不瞬移

        // 1. 生成者检测与验证
        handleSpawnerDetection(SPAWNER_SEARCH_RADIUS);
        validateSpawnerPresence(SPAWNER_SEARCH_RADIUS);

        // 2. 客户端与服务端逻辑
        if (this.worldObj.isRemote) {
            handleClientUpdates(CLIENT_UPDATE_INTERVAL);
        } else {
            if (!this.updtd) {
                this.updtd = true;
            }
        }

        // 3. 目标追踪行为
        if (ModConfig.useNewFlightAI) {
            // 新飞行逻辑
            handleTargetTracking(VERTICAL_CHASE_THRESHOLD, VERTICAL_SNAP_THRESHOLD);
        } else {
            // 旧飞行逻辑
            handleOldFlight();
        }

        super.onUpdate();

        // 4. 瞬移冷却倒计时
        if (teleportCooldown > 0) {
            teleportCooldown--;
        }
        if (outOfRangeHits >= TELEPORT_TRIGGER_HITS && targetedEntity != null) {
            if (!(targetedEntity instanceof EntityPlayer && ((EntityPlayer) targetedEntity).capabilities.isCreativeMode)) {
                double distSq = this.getDistanceSqToEntity(targetedEntity);
                if (distSq > MIN_TELEPORT_DIST_SQ && canTeleport) {  // 🆕 加上条件
                    teleportToTarget();

                    if (targetedEntity instanceof EntityPlayer) {
                        EntityPlayer player = (EntityPlayer) targetedEntity;
                        String mobName = this.getCommandSenderName();
                        String msg = StatCollector.translateToLocal("message.ninjin.teleportwarn");
                        player.addChatMessage(new ChatComponentText(mobName + "：" + msg));
                    }
                }
            }
            outOfRangeHits = 0;
        }



// 6. 条件2：每15秒必瞬移
        if (teleportCooldown <= 0 && targetedEntity != null) {
            // 跳过创造模式玩家
            if (!(targetedEntity instanceof EntityPlayer && ((EntityPlayer) targetedEntity).capabilities.isCreativeMode)) {
                double distSq = this.getDistanceSqToEntity(targetedEntity);
                if (distSq > MIN_TELEPORT_DIST_SQ && canTeleport) {
                    teleportToTarget();
                }
            }
            teleportCooldown = 300; // 重置冷却
        }
}


    // 瞬移到目标位置
    private void teleportToTarget() {
        if (targetedEntity == null || worldObj.isRemote) return;

        // 🆕 跳过创造模式玩家
        if (targetedEntity instanceof EntityPlayer && ((EntityPlayer) targetedEntity).capabilities.isCreativeMode) {
            return;
        }

        worldObj.playSoundAtEntity(this, "jinryuudragonbc:DBC3.teleport", 1.0F, 1.0F);

        Vec3 lookVec = targetedEntity.getLookVec();
        double teleportDistance = 2.0; // 距离可调

        double newX = targetedEntity.posX - lookVec.xCoord * teleportDistance;
        double newZ = targetedEntity.posZ - lookVec.zCoord * teleportDistance;

        // 对齐玩家碰撞箱顶部，让脚底在玩家头顶
        double targetTopY = targetedEntity.boundingBox.maxY;
        double newY = targetTopY;

        setPositionAndUpdate(newX, newY, newZ);

        attackCounter = 0;
    }


    // 辅助方法分解
    private void handleSpawnerDetection(double radius) {
        if (this.spwner == null && radius > 0) {
            AxisAlignedBB searchArea = createBoundingBox(radius);
            List<EntityPlayer> nearbyPlayers = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, searchArea);

            if (!nearbyPlayers.isEmpty()) {
                this.spwner = nearbyPlayers.get(0);
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
        int count = 0;
        int spawnerGroupId = JRMCoreH.getInt(this.spwner, "JRMCGID");

        for (EntityPlayer player : players) {
            int playerGroupId = JRMCoreH.getInt(player, "JRMCGID");
            if (this.spwner.getEntityId() == player.getEntityId() ||
                (spawnerGroupId != 0 && spawnerGroupId == playerGroupId)) {
                count++;
            }
        }

        // 自我检查
        if (getEntityId() == this.spwner.getEntityId()) {
            count++;
        }

        return count;
    }

    private void handleClientUpdates(int updateInterval) {
        if (++this.rang > updateInterval) {
            this.rang = 0;
            int entityId = updateDataInt(23);
            this.targetedEntity = (entityId > 0) ? this.worldObj.getEntityByID(entityId) : null;
        }
    }

    private void handleTargetTracking(double chaseThreshold, double snapThreshold) {
        // 如果目标是玩家且处于创造模式，则直接返回，不启用飞行 AI
        if (this.targetedEntity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) this.targetedEntity;
            if (player.capabilities.isCreativeMode) {
                return;
            }
        }

        if (this.targetedEntity != null && this.canEntityBeSeen(this.targetedEntity)) {
            double dx = this.targetedEntity.posX - this.posX;
            double dy = this.targetedEntity.posY - this.posY;
            double dz = this.targetedEntity.posZ - this.posZ;
            double distanceSq = dx * dx + dy * dy + dz * dz;

            // ======= 三维加速与最大速度 =======
            double accel = 0.1D + Math.min(0.4D, distanceSq * 0.005D);
            double maxSpeed = 0.35D + Math.min(0.5D, distanceSq * 0.005D);

            // ======= 三维单位向量 =======
            Vec3 vecToTarget = Vec3.createVectorHelper(dx, dy, dz).normalize();

            // ======= 直接施加运动 =======
            this.motionX += vecToTarget.xCoord * accel;
            this.motionY += vecToTarget.yCoord * accel;
            this.motionZ += vecToTarget.zCoord * accel;

            // ======= 限制三维最大速度 =======
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
        if (this.targetedEntity != null && this.canEntityBeSeen(this.targetedEntity)) {
            if (this.targetedEntity.posY - 4.0D > this.posY) {
                this.motionY += 0.1D;
            } else if (this.targetedEntity.posY - 1.6D >= this.posY) {
                this.posY = this.targetedEntity.posY - 1.6D;
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

	private void becomeAngryAt(Entity par1Entity) {
		this.entityToAttack = par1Entity;
		this.angerLevel = (400 + this.rand.nextInt(400));
	}
    // 增加仇恨
    public void addHate(EntityLivingBase entity, int amount) {
        if (entity == null || entity.isDead) return;
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
        if (result && entityIn instanceof EntityLivingBase) {
            addHate((EntityLivingBase) entityIn, 5); // 每次攻击锁定更牢固
        }
        return result;
    }
}
