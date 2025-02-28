package hedaox.ninjinentities.models;

import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.DragonBC.common.Npcs.ModelAura;
import JinRyuu.DragonBC.common.Npcs.ModelAuraG;
import JinRyuu.DragonBC.common.Npcs.RenderDBC;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityAura;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class Aura extends RenderDBC {
    private final ModelAura auraModel;

    private boolean au_fel = true;

    private int au_i = 0;

    private long time_start = 0L;

    private final float seb = 0.03F;

    private final float[][] lightVertRotation;

    private int lightVertN;

    public Aura() {
        super(new ModelAura(), 0.5F);
        int lvnm = 10;
        lightVertRotation = new float[10][7];
        auraModel = new ModelAura();
        ModelAuraG bModel = new ModelAuraG();
    }


    public void renderAura(EntityAura par1Entity, double parX, double parY, double parZ, float par8, float par9) {
        float var13 = par1Entity.getAge();
        boolean rot = par1Entity.getRot();
        shadowSize = 0.0F;
        if (JGConfigClientSettings.CLIENT_DA20) {
            if (JGConfigClientSettings.CLIENT_DA14 && par1Entity.getBol6() == -1) {
                func_tad(par1Entity, parX, parY, parZ, par8, par9);
            } else if (JGConfigClientSettings.CLIENT_DA12) {
                lightning(par1Entity, parX, parY, parZ, par9, var13, rot);
            }
        } else if (JGConfigClientSettings.CLIENT_DA14) {
            func_tad(par1Entity, parX, parY, parZ, par8, par9);
        } else if (JGConfigClientSettings.CLIENT_DA12) {
            lightning(par1Entity, parX, parY, parZ, par9, var13, rot);
        }
    }

    private void func_tad(EntityAura par1Entity, double parX, double parY, double parZ, float par8, float par9) {
        boolean Rotation = par1Entity.getBolROTATION();
        if (!DBCClient.mc.isGamePaused())
            if (Rotation) {
                if (System.nanoTime() / 100000000L - time_start > 1L) {
                    if (au_fel) {
                        if (au_i >= 8) {
                            au_fel = false;
                            au_i--;
                        } else {
                            au_i++;
                        }
                    } else if (au_i <= 0) {
                        au_fel = true;
                        au_i++;
                    } else {
                        au_i--;
                    }
                    time_start = System.nanoTime() / 100000000L;
                }
            } else if (System.nanoTime() / 10000000L - time_start > 1L) {
                if (au_fel) {
                    if (au_i >= 5) {
                        au_fel = false;
                        au_i--;
                    } else {
                        au_i++;
                    }
                } else if (au_i <= 0) {
                    au_fel = true;
                    au_i++;
                } else {
                    au_i--;
                }
                time_start = System.nanoTime() / 10000000L;
            }
        if (au_i > 8) {
            au_i = 8;
        } else if (au_i < 0) {
            au_i = 0;
        }
        if (Rotation)
            au_i = 0;
        shadowSize = 0.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)parX + 0.0F, (float)parY + 3.0F, (float)parZ + 0.0F);
        boolean rot = par1Entity.getRot();
        if (rot) {
            GL11.glTranslatef(0.0F, -1.5F, 0.0F);
            GL11.glRotatef(-par1Entity.rotationYaw, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(par1Entity.rotationPitch - 90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, 1.5F, 0.0F);
        }
        GL11.glPushMatrix();
        boolean iner = par1Entity.getInner();
        float spd = par1Entity.getSpd();
        if (spd == 0) spd = 1.0F; // 避免除以零
        float spd2 = 18.0F / spd * 0.05F;
        float var13 = par1Entity.getAge();
        float cr = par1Entity.getCRel();
        float s1 = par1Entity.getState();
        float s = s1 + cr * 0.03F;
        float s2 = par1Entity.getState2() * 0.5F;
        int c = par1Entity.getCol();
        String tex = par1Entity.getTex();
        int cl2 = par1Entity.getColL2();
        int cl3 = par1Entity.getColL3();
        String texl2 = par1Entity.getTexL2();
        String texl3 = par1Entity.getTexL3();
        float p = par1Entity.getAlp();
        boolean hasl2 = (texl2.length() > 2);
        boolean GodX = par1Entity.getBolGODX();
        s += s2;
        boolean cl3b = (cl3 > 0);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        final String RESOURCE_DOMAIN = "jinryuudragonbc";
        ResourceLocation txx = new ResourceLocation("jinryuudragonbc:aura.png");
        ResourceLocation txx3 = new ResourceLocation( RESOURCE_DOMAIN, texl3 + ".png");
        ResourceLocation txx2 = new ResourceLocation( RESOURCE_DOMAIN, texl2 + ".png");
        GL11.glEnable(3042);
        float f4 = 0.5F;
        GL11.glColor4f(f4, f4, f4, 1.0F);
        GL11.glDisable(2896);
        GL11.glBlendFunc(1, 1);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        renderManager.renderEngine.bindTexture(txx);
        glColor4f(c, p);
        GL11.glDepthMask(false);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glBlendFunc(770, 771);
        GL11.glAlphaFunc(516, 0.003921569F);
        GL11.glScalef(1.0F + 0.1F * s + au_i * 0.03F, 1.0F + 0.07F * s, 1.0F + 0.1F * s + au_i * 0.03F);
        GL11.glTranslatef(0.0F, -0.3F - 0.07F * s, 0.0F);
        GL11.glRotatef(var13 * spd2, 0.0F, 1.0F, 0.0F);
        boolean spawn = true;
        float w = 0.75F;
        for (int i2 = 0; i2 < (iner ? 2 : 1); i2++) {
            if (i2 == 1 && (
                GodX ? (var13 > 10.0F) : (var13 > (cl3b ? (spd / 2.0F) : 10.0F))))
                break;
            for (int i = 0; i < 4; i++) {
                GL11.glPushMatrix();
                GL11.glRotatef((i * 90), 0.0F, 1.0F, 0.0F);
                if (var13 < 15.0F) {
                    glColor4f(c, p);
                    if (spawn)
                        auraModel.renderModel(par1Entity, 0.0625F, var13, i2 * w, spd);
                    if (hasl2) {
                        renderManager.renderEngine.bindTexture(txx2);
                        glColor4f(cl2, p);
                        if (spawn)
                            auraModel.renderModel(par1Entity, 0.0625F, var13, i2 * w, spd);
                    }
                }
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef((i * 90 + 45), 0.0F, 1.0F, 0.0F);
                renderManager.renderEngine.bindTexture((cl3b && i2 == 1) ? txx3 : txx);
                if (cl3b && i2 == 1) {
                    cf(c, cl3, p);
                } else {
                    glColor4f(c, p);
                }
                if (spawn)
                    auraModel.renderModel(par1Entity, 0.0625F, var13 + 4.0F, i2 * w, spd);
                if (hasl2) {
                    renderManager.renderEngine.bindTexture(txx2);
                    glColor4f(cl2, p);
                    if (spawn)
                        auraModel.renderModel(par1Entity, 0.0625F, var13 + 4.0F, i2 * w, spd);
                }
                GL11.glPopMatrix();
                if (cl3b) {
                    GL11.glPushMatrix();
                    GL11.glScalef(0.7F, 0.7F, 0.7F);
                    GL11.glTranslatef(0.0F, 0.95F, 0.0F);
                    GL11.glRotatef((i * 90 + 45), 0.0F, 1.0F, 0.0F);
                    renderManager.renderEngine.bindTexture(txx3);
                    glColor4f(cl3, p);
                    if (spawn)
                        auraModel.renderModel(par1Entity, 0.0625F, var13 + 4.0F, i2 * w, spd);
                    GL11.glPopMatrix();
                }
            }
        }
        GL11.glAlphaFunc(516, 0.1F);
        GL11.glDisable(3042);
        GL11.glEnable(2896);
        GL11.glEnable(3553);
        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
        if (JGConfigClientSettings.CLIENT_DA12)
            lightning(par1Entity, parX, parY, parZ, par9, var13, rot);
    }

    private void lightning(EntityAura e, double par2, double par4, double par6, float par9, float var13, boolean rot) {
        if (var13 < e.getLightLivingTime() && ((e.getState() > 4.0F && e.getState() < 7.0F) || e.getBolLighting2()) && !rot) {
            GL11.glPushMatrix();
            Tessellator tessellator2 = Tessellator.instance;
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 1);
            double[] adouble = new double[8];
            double[] adouble1 = new double[8];
            double d3 = 0.0D;
            double d4 = 0.0D;
            GL11.glTranslatef((float)par2, (float)par4 + e.height / 2.0F, (float)par6);
            int k1 = 0;
            int nu = (int)(Math.random() * 10.0D) + 1;
            int nu2 = 1;
            if (!JRMCoreClient.mc.isGamePaused())
                lightVertN = (int)(Math.random() * 10.0D);
            for (int i = 0; i < lightVertN; i++) {
                if (!JRMCoreClient.mc.isGamePaused()) {
                    lightVertRotation[i][0] = (float)(Math.random());
                    lightVertRotation[i][1] = (float)(Math.random());
                    lightVertRotation[i][2] = (float)(Math.random());
                    lightVertRotation[i][3] = (float)(Math.random() * 1.2000000476837158D) - 0.6F;
                    lightVertRotation[i][4] = (float)(Math.random() * e.height) - e.height / 2.0F;
                    lightVertRotation[i][5] = (float)(Math.random() * 1.2000000476837158D) - 0.6F;
                    lightVertRotation[i][6] = (float)(Math.random() * 0.20000000298023224D);
                }
                float sc = 0.05F + lightVertRotation[i][6];
                GL11.glRotatef(360.0F * lightVertRotation[i][0], 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(360.0F * lightVertRotation[i][1], 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(360.0F * lightVertRotation[i][2], 0.0F, 0.0F, 1.0F);
                GL11.glTranslatef(lightVertRotation[i][3], lightVertRotation[i][4], lightVertRotation[i][5]);
                Random random1 = new Random(e.lightVert[i]);
                for (int j = 0; j < nu2; j++) {
                    int k = 7;
                    int l = 0;
                    if (j > 0)
                        k = 7 - j;
                    if (j > 0)
                        l = k - 2;
                    double d5 = adouble[k] - d3;
                    double d6 = adouble1[k] - d4;
                    for (int i1 = k; i1 >= l; i1--) {
                        double d7 = d5;
                        double d8 = d6;
                        d5 += (random1.nextInt(31) - 15) * 0.07000000029802322D;
                        d6 += (random1.nextInt(31) - 15) * 0.07000000029802322D;
                        tessellator2.startDrawing(5);
                        float f2 = 0.5F;
                        if (!e.getBol7()) {
                            tessellator2.setColorRGBA_F(0.9F * f2, 0.9F * f2, f2, 0.35F);
                        } else {
                            tessellator2.setColorRGBA_F(f2, 0.05F * f2, 0.1F * f2, 0.5F);
                        }
                        double d9 = 0.1D + k1 * 0.2D;
                        double d10 = 0.1D + k1 * 0.2D;
                        for (int j1 = 0; j1 < 5; j1++) {
                            double d11 = 0.0D - d9;
                            double d12 = 0.0D - d9;
                            if (j1 == 1 || j1 == 2)
                                d11 += d9 * 2.0D * sc;
                            if (j1 == 2 || j1 == 3)
                                d12 += d9 * 2.0D * sc;
                            double d13 = 0.0D - d10;
                            double d14 = 0.0D - d10;
                            if (j1 == 1 || j1 == 2)
                                d13 += d10 * 2.0D * sc;
                            if (j1 == 2 || j1 == 3)
                                d14 += d10 * 2.0D * sc;
                            if (i1 < 8) {
                                tessellator2.addVertex(d13 + d5 * sc, (-(i1 - 7) * sc), d14 + d6 * sc);
                                tessellator2.addVertex(d11 + d7 * sc, (-((i1 + 1) - 7) * sc), d12 + d8 * sc);
                            }
                        }
                        tessellator2.draw();
                    }
                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        }
        if (var13 < e.getLightLivingTime() && e.getBolLighting() && !rot) {
            GL11.glPushMatrix();
            Tessellator tessellator = Tessellator.instance;
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 1);
            double[] adouble = new double[8];
            double[] adouble1 = new double[8];
            double d3 = 0.0D;
            double d4 = 0.0D;
            for (int i = 7; i >= 0; i--);
            int k1 = 0;
            float sc = 0.2F;
            Random random1 = new Random(e.lightVert2);
            for (int j = 0; j < 3; j++) {
                int k = 7;
                int l = 0;
                if (j > 0)
                    k = 7 - j;
                if (j > 0)
                    l = k - 2;
                double d5 = adouble[k] - d3;
                double d6 = adouble1[k] - d4;
                for (int i1 = k; i1 >= l; i1--) {
                    double d7 = d5;
                    double d8 = d6;
                    d5 += (random1.nextInt(31) - 15) * 0.07000000029802322D;
                    d6 += (random1.nextInt(31) - 15) * 0.07000000029802322D;
                    tessellator.startDrawing(5);
                    int lightcolor = e.getLightCol();
                    float f1 = (lightcolor >> 16 & 0xFF) / 255.0F;
                    float f2 = (lightcolor >> 8 & 0xFF) / 255.0F;
                    float f3 = (lightcolor & 0xFF) / 255.0F;
                    tessellator.setColorRGBA_F(f1, f2, f3, 0.4F);
                    double d9 = 0.1D + k1 * 0.2D;
                    double d10 = 0.1D + k1 * 0.2D;
                    for (int j1 = 0; j1 < 5; j1++) {
                        double d11 = par2 + 0.0D - d9;
                        double d12 = par6 + 0.0D - d9;
                        if (j1 == 1 || j1 == 2)
                            d11 += d9 * 2.0D * sc;
                        if (j1 == 2 || j1 == 3)
                            d12 += d9 * 2.0D * sc;
                        double d13 = par2 + 0.0D - d10;
                        double d14 = par6 + 0.0D - d10;
                        if (j1 == 1 || j1 == 2)
                            d13 += d10 * 2.0D * sc;
                        if (j1 == 2 || j1 == 3)
                            d14 += d10 * 2.0D * sc;
                        if (i1 < 8) {
                            tessellator.addVertex(d13 + d5 * sc, par4 - ((i1 - 7) * sc), d14 + d6 * sc);
                            tessellator.addVertex(d11 + d7 * sc, par4 - (((i1 + 1) - 7) * sc), d12 + d8 * sc);
                        }
                    }
                    tessellator.draw();
                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        }
    }

    public static void glColor4f(int c, float a) {
        float h2 = (c >> 16 & 0xFF) / 255.0F;
        float h3 = (c >> 8 & 0xFF) / 255.0F;
        float h4 = (c & 0xFF) / 255.0F;
        float h1 = 1.0F;
        GL11.glColor4f(h1 * h2, h1 * h3, h1 * h4, a);
    }

    public static void cf(int x, int y, float a) {
        float h2 = (x >> 16 & 0xFF) / 255.0F;
        float h3 = (x >> 8 & 0xFF) / 255.0F;
        float h4 = (x & 0xFF) / 255.0F;
        float y2 = (y >> 16 & 0xFF) / 255.0F;
        float y3 = (y >> 8 & 0xFF) / 255.0F;
        float y4 = (y & 0xFF) / 255.0F;
        float pc = 0.5F;
        float pg = 1.0F - pc;
        float ga = h2 * pg + y2 * pc;
        float hr = h3 * pg + y3 * pc;
        float ah = h4 * pg + y4 * pc;
        h2 = ga;
        h3 = hr;
        h4 = ah;
        GL11.glColor4f(h2, h3, h4, a);
    }

    protected float handleRotationFloat(Entity par1Entity, float par2) {
        return par1Entity.ticksExisted + par2;
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        renderAura((EntityAura)par1Entity, par2, par4, par6, par8, par9);
    }
}
