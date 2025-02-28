package hedaox.ninjinentities.entities;

import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.entity.EntityCusPar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class EntityAura extends Entity {
    public final int number_of_lightVerts = 10;

    public long[] lightVert = new long[10];

    private int lightLivingTime;

    public long lightVert2;

    private int Lightcolor;

    private int Lightcolor2;

    private boolean bolLighting;

    private boolean bolLighting2;

    public int rm;

    private Entity mot;

    public int getLightLivingTime() {
        return lightLivingTime;
    }

    private boolean rot = false;

    private int Age;

    private int color;

    private int colorl2;

    private int colorl3;

    private final float state;

    private final float state2;

    private final int crel;

    private float yaw;

    private float pitch;

    private float alpha;

    private String tex;

    private String texl2;

    private String texl3;

    private int speed;

    private boolean inner;

    private int rendpass;

    private boolean bol;

    private boolean bol2;

    private boolean bol3;

    private boolean bol4;

    private boolean bol4a;

    private byte bol6;

    private boolean bol7;

    private boolean bolGODX;

    private boolean bolGODPARTC;

    private boolean bolROTATION;

    public EntityAura(World par1World) {
        super(par1World);
        color = 16777215;
        colorl2 = 16777215;
        colorl3 = -1;
        Lightcolor = 16777215;
        Lightcolor2 = 16777215;
        state = 0.0F;
        state2 = 0.0F;
        crel = 0;
        yaw = 0.0F;
        pitch = 0.0F;
        alpha = 0.1F;
        tex = "aura";
        texl2 = "";
        texl3 = "";
        speed = 20;
        inner = true;
        rendpass = 1;
        bol = false;
        bol2 = false;
        bol3 = false;
        bol4 = false;
        bol4a = false;
        bol6 = -1;
        bol7 = false;
        bolGODX = false;
        bolGODPARTC = false;
        bolROTATION = false;
        bolLighting = false;
        bolLighting2 = false;
    }

    public EntityAura(World par1World, Entity dbcCharger, int c, float s, float s2, int cr, boolean b, float a) {
        this(par1World, dbcCharger, c, s, s2, cr, b);
        alpha = a;
    }

    public EntityAura(World par1World, Entity dbcCharger, int c, float s, float s2, int cr, boolean b) {
        this(par1World, dbcCharger, c, s, s2, cr);
        rot = b;
    }

    public EntityAura(World par1World, Entity dbcCharger, int c, float s, float s2, int cr) {
        super(par1World);
        color = 16777215;
        colorl2 = 16777215;
        colorl3 = -1;
        Lightcolor = 16777215;
        Lightcolor2 = 16777215;
        bolLighting = false;
        bolLighting2 = false;
        yaw = 0.0F;
        pitch = 0.0F;
        alpha = 0.1F;
        tex = "aura";
        texl2 = "";
        texl3 = "";
        speed = 20;
        inner = true;
        rendpass = 1;
        bol = false;
        bol2 = false;
        bol3 = false;
        bol4 = false;
        bol4a = false;
        bol6 = -1;
        bol7 = false;
        bolGODX = false;
        bolGODPARTC = false;
        bolROTATION = false;
        mot = dbcCharger;
        color = c;
        state = s;
        state2 = s2;
        crel = cr;
        rm = rand.nextInt(10);
        int i = 0;
        getClass();
        while (i < 10) {
            lightVert[i] = rand.nextLong();
            i++;
        }
        lightVert2 = rand.nextLong();
        lightLivingTime = rand.nextInt(4);
        Entity entityPlayer = mot;
        if (entityPlayer != null) {
            if (rot) {
                yaw = entityPlayer.rotationYaw;
                pitch = entityPlayer.rotationPitch;
            }
            setPositionAndRotation(entityPlayer.posX, entityPlayer.posY + ((entityPlayer instanceof net.minecraft.client.entity.EntityPlayerSP) ? -1.6F : 0.0F), entityPlayer.posZ, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
        }
    }
    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldRenderInPass(int pass) {
        return (pass == rendpass);
    }

    @SideOnly(Side.CLIENT)
    public float getShadowSize() {
        return 0.0F;
    }

    public boolean getRot() {
        return rot;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public int getAge() {
        return Age;
    }

    public float getState() {
        return state;
    }

    public float getState2() {
        return state2;
    }

    public float getCRel() {
        return crel;
    }

    public int getCol() {
        return color;
    }

    public void setCol(int c) {
        color = c;
    }

    public int getColL2() {
        return colorl2;
    }

    public void setColL2(int c) {
        colorl2 = c;
    }

    public int getColL3() {
        return colorl3;
    }

    public void setColL3(int c) {
        colorl3 = c;
    }

    public int getLightCol() {
        return Lightcolor;
    }

    public void setLightCol(int c) {
        Lightcolor = c;
    }

    public int getLightCol2() {
        return Lightcolor2;
    }

    public void setLightCol2(int c) {
        Lightcolor2 = c;
    }

    public float getAlp() {
        return alpha;
    }

    public void setAlp(float f) {
        alpha = f;
    }

    public String getTex() {
        return tex;
    }

    public void setTex(String s) {
        tex = s;
    }

    public String getTexL2() {
        return texl2;
    }

    public void setTexL2(String s) {
        texl2 = s;
    }

    public String getTexL3() {
        return texl3;
    }

    public void setTexL3(String s) {
        texl3 = s;
    }

    public int getSpd() {
        return speed;
    }

    public void setSpd(int s) {
        speed = s;
    }

    public boolean getInner() {
        return inner;
    }

    public void setInner(boolean s) {
        inner = s;
    }

    public void setRendPass(int s) {
        rendpass = s;
    }

    public Entity getmot() {
        return mot;
    }

    public void setBol(boolean b) {
        bol = b;
    }

    public void setBol2(boolean b) {
        bol2 = b;
    }

    public void setBol3(boolean b) {
        bol3 = b;
    }

    public void setBol4(boolean b) {
        bol4 = b;
    }

    public void setBol4a(boolean b) {
        bol4a = b;
    }

    public void setBol6(int b) {
        bol6 = (byte)b;
    }

    public void setBol7(boolean b) {
        bol7 = b;
    }

    public void setBolGODX(boolean b) {
        bolGODX = b;
    }

    public void setBolGODPARTC(boolean b) {
        bolGODPARTC = b;
    }

    public void setBolROTATION(boolean b) {
        bolROTATION = b;
    }

    public void setBolLighting(boolean b) {
        bolLighting = b;
    }

    public void setBolLighting2(boolean b) {
        bolLighting2 = b;
    }

    public boolean getBol() {
        return bol;
    }

    public boolean getBol2() {
        return bol2;
    }

    public boolean getBol3() {
        return bol3;
    }

    public boolean getBol4() {
        return bol4;
    }

    public boolean getBol4a() {
        return bol4a;
    }

    public byte getBol6() {
        return bol6;
    }

    public boolean getBol7() {
        return bol7;
    }

    public boolean getBolGODX() {
        return bolGODX;
    }

    public boolean getBolGODPARTC() {
        return bolGODPARTC;
    }

    public boolean getBolROTATION() {
        return bolROTATION;
    }

    public boolean getBolLighting() {
        return bolLighting;
    }

    public boolean getBolLighting2() {
        return bolLighting2;
    }

    public void onUpdate() {
        boolean aura_type = JGConfigClientSettings.CLIENT_DA13;
        boolean aura_type2 = JGConfigClientSettings.CLIENT_DA20;
        Entity entityPlayer = mot;
        if (entityPlayer != null) {
            int sneak = entityPlayer.isSneaking() ? 0 : 1;
            if (JGConfigClientSettings.CLIENT_GR0)
                for (int k = 0; k < JGConfigClientSettings.get_da1(); k++) {
                    if (bolGODPARTC)
                        if (!bol4) {
                            if (ticksExisted % 17 == 0) {
                                float a = alpha, h1 = 1.0F;
                                float spe2 = 1.3F;
                                float h2 = (color >> 16 & 0xFF) / 255.0F;
                                float h3 = (color >> 8 & 0xFF) / 255.0F;
                                float h4 = (color & 0xFF) / 255.0F;
                                float red = h1 * h2 + 0.6F, green = h1 * h3 + 0.6F, blue = h1 * h4 + 0.6F;
                                if (red > 1.0F)
                                    red = 1.0F;
                                if (green > 1.0F)
                                    green = 1.0F;
                                if (blue > 1.0F)
                                    blue = 1.0F;
                                Entity pl = this;
                                double x = Math.random() * spe2 - (spe2 / 2.0F);
                                double y = -0.30000001192092896D;
                                double z = Math.random() * spe2 - (spe2 / 2.0F);
                                EntityCusPar entityCusPar = new EntityCusPar("jinryuudragonbc:bens_particles.png", worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, 0.05D + Math.random() * 0.05000000074505806D, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 48, 48, 8, 32, false, 0.0F, false, 0.0F, 1, "", 35, 0, 0.003F + (float)(Math.random() * 0.006000000052154064D), 0.0F, 0.0F, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.8F, 0.0F, 0.9F, 0.95F, 0.018F, false, -1, true, entityPlayer);
                                entityCusPar.worldObj.spawnEntityInWorld(entityCusPar);
                            }
                        } else if (ticksExisted % 17 == 0) {
                            float a = alpha, h1 = 1.0F;
                            float spe2 = 1.3F;
                            float h2 = (color >> 16 & 0xFF) / 255.0F;
                            float h3 = (color >> 8 & 0xFF) / 255.0F;
                            float h4 = (color & 0xFF) / 255.0F;
                            float red = h1 * h2 + 0.6F, green = h1 * h3 + 0.6F, blue = h1 * h4 + 0.6F;
                            Entity pl = this;
                            double x = Math.random() * spe2 - (spe2 / 2.0F);
                            double y = -0.30000001192092896D;
                            double z = Math.random() * spe2 - (spe2 / 2.0F);
                            EntityCusPar entityCusPar = new EntityCusPar("jinryuudragonbc:bens_particles.png", worldObj, 0.2F, 0.2F, pl.posX, pl.posY, pl.posZ, x, y, z, 0.0D, 0.05D + Math.random() * 0.10000000149011612D, 0.0D, 0.0F, (int)(Math.random() * 8.0D) + 48, 48, 8, 32, false, 0.0F, false, 0.0F, 1, "", 20, 0, 0.003F + (float)(Math.random() * 0.006000000052154064D), 0.0F, 0.0F, 0, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.8F, 0.0F, 0.9F, 0.95F, 0.05F, false, -1, true, entityPlayer);
                            entityCusPar.worldObj.spawnEntityInWorld(entityCusPar);
                        }
                }
            if (rot) {
                yaw = entityPlayer.rotationYaw;
                pitch = entityPlayer.rotationPitch;
            }
            setPositionAndRotation(entityPlayer.posX, entityPlayer.posY + ((entityPlayer instanceof net.minecraft.client.entity.EntityPlayerSP) ? -1.6F : 0.0F), entityPlayer.posZ, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
            if (getAge() < getLightLivingTime() && ((getState() > 4.0F && getState() < 7.0F) || getBolLighting() || getBolLighting2()) &&
                getAge() == 2)
                entityPlayer.playSound("jinryuudragonbc:1610.spark", 0.0375F, 0.85F + lightLivingTime * 0.05F);
        } else {
            setDead();
        }
        if (Age++ >= speed)
            setDead();
    }

    public boolean getCanSpawnHere() {
        return !worldObj.checkNoEntityCollision(boundingBox);
    }

    public void onLivingUpdate() {}

    protected void readEntityFromNBT(NBTTagCompound var1) {}

    protected void writeEntityToNBT(NBTTagCompound var1) {}

    protected void entityInit() {}
}
