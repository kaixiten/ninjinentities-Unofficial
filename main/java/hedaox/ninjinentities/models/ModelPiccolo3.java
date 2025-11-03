package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelPiccolo3 extends ModelBase {
  private final ModelRenderer Head;
  private final ModelRenderer Body;
  private final ModelRenderer ArmL;
  private final ModelRenderer ArmR;
  private final ModelRenderer LegL;
  private final ModelRenderer LegR;
    private final float scale;

  public ModelPiccolo3(float _scale) {
    this.textureWidth = 128;
    this.textureHeight = 64;
    scale = _scale;

      ModelRenderer tentacleL = new ModelRenderer(this, 25, -1);
    tentacleL.mirror = true;
    tentacleL.setRotationPoint(1.5F, -5.5F, -4.0F);
    tentacleL.addBox(0.0F, -2.0F, -4.0F, 0, 4, 4, 0.0F);
    setRotateAngle(tentacleL, 0.0F, -0.6981317F, 0.0F);
    this.Head = new ModelRenderer(this, 0, 0);
    this.Head.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      ModelRenderer tentacleR = new ModelRenderer(this, 25, -1);
    tentacleR.setRotationPoint(-1.5F, -5.5F, -4.0F);
    tentacleR.addBox(0.0F, -2.0F, -4.0F, 0, 4, 4, 0.0F);
    setRotateAngle(tentacleR, 0.0F, 0.6981317F, 0.0F);
      ModelRenderer body2 = new ModelRenderer(this, 1, 41);
    body2.setRotationPoint(0.0F, 9.5F, 0.0F);
    body2.addBox(-4.5F, -0.5F, -2.5F, 9, 2, 5, 0.0F);
    this.LegL = new ModelRenderer(this, 40, 40);
    this.LegL.mirror = true;
    this.LegL.setRotationPoint(2.5F, 8.0F, 0.0F);
    this.LegL.addBox(-2.5F, 0.0F, -3.0F, 5, 14, 6, 0.0F);
    this.LegR = new ModelRenderer(this, 40, 40);
    this.LegR.setRotationPoint(-2.5F, 8.0F, 0.0F);
    this.LegR.addBox(-2.5F, 0.0F, -3.0F, 5, 14, 6, 0.0F);
      ModelRenderer feetR = new ModelRenderer(this, 64, 41);
    feetR.setRotationPoint(0.0F, 0.0F, 0.0F);
    feetR.addBox(-2.0F, 14.0F, -3.3F, 4, 2, 5, 0.0F);
      ModelRenderer earL = new ModelRenderer(this, 34, 1);
    earL.mirror = true;
    earL.setRotationPoint(3.8F, -4.5F, -1.0F);
    earL.addBox(0.0F, -3.5F, 0.0F, 3, 6, 0, 0.0F);
    setRotateAngle(earL, 0.0F, -0.87266463F, 0.04363323F);
      ModelRenderer body3 = new ModelRenderer(this, 1, 50);
    body3.setRotationPoint(0.0F, 11.0F, 0.0F);
    body3.addBox(-5.0F, 0.0F, -3.0F, 10, 4, 6, 0.0F);
    this.ArmL = new ModelRenderer(this, 41, 19);
    this.ArmL.mirror = true;
    this.ArmL.setRotationPoint(5.8F, -5.1F, 0.0F);
    this.ArmL.addBox(-1.0F, -2.0F, -2.5F, 5, 15, 5, -0.1F);
      ModelRenderer head2 = new ModelRenderer(this, 33, 1);
    head2.setRotationPoint(0.0F, -5.6F, 1.7F);
    head2.addBox(-3.5F, -3.0F, -5.0F, 7, 8, 8, 0.0F);
      ModelRenderer earR = new ModelRenderer(this, 34, 1);
    earR.setRotationPoint(-3.5F, -4.5F, -1.0F);
    earR.addBox(-3.5F, -3.5F, 0.0F, 3, 6, 0, 0.0F);
    setRotateAngle(earR, 0.0F, 0.87266463F, -0.04363323F);
    this.ArmR = new ModelRenderer(this, 41, 19);
    this.ArmR.setRotationPoint(-5.8F, -5.1F, 0.0F);
    this.ArmR.addBox(-4.0F, -2.0F, -2.5F, 5, 15, 5, -0.1F);
      ModelRenderer feetL = new ModelRenderer(this, 64, 41);
    feetL.mirror = true;
    feetL.setRotationPoint(0.0F, 0.0F, 0.0F);
    feetL.addBox(-2.0F, 14.0F, -3.3F, 4, 2, 5, 0.0F);
    this.Body = new ModelRenderer(this, 1, 24);
    this.Body.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.Body.addBox(-5.0F, 0.0F, -3.0F, 10, 9, 6, 0.0F);
    this.Head.addChild(tentacleL);
    this.Head.addChild(tentacleR);
    this.Body.addChild(body2);
    this.LegR.addChild(feetR);
    this.Head.addChild(earL);
    this.Body.addChild(body3);
    this.Head.addChild(head2);
    this.Head.addChild(earR);
    this.LegL.addChild(feetL);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GL11.glPushMatrix();
    GL11.glScalef(this.scale, this.scale, this.scale);
    GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
    this.Head.render(f5);
    this.Body.render(f5);
    this.ArmR.render(f5);
    this.ArmL.render(f5);
    this.LegL.render(f5);
    this.LegR.render(f5);
    GL11.glPopMatrix();
  }

  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
  {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }

  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    int calc = par7Entity.ticksExisted;
    if (calc > 100) {
      calc -= 100;
    }
    float r = 360.0F;
    float r2 = 180.0F;

    this.Head.rotateAngleY = (par4 / (r2 / 3.1415927F));
    this.Head.rotateAngleX = (par5 / (r2 / 3.1415927F));
    float ex = par7Entity.ticksExisted;
    float r3 = MathHelper.cos(ex * 0.14F) * 0.1F;
    float r4 = MathHelper.cos(ex / 8.0F) / 5.0F + 0.1F;

    r3 = MathHelper.cos(ex * 0.14F) * 0.1F;
    r4 = MathHelper.cos(ex / 8.0F) / 3.0F - 0.2F;

    this.LegR.rotateAngleX = (-0.0F - MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);
    this.LegL.rotateAngleX = (-0.0F + MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);
    this.ArmR.rotateAngleX = (-0.0F + MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);
    this.ArmL.rotateAngleX = (-0.0F - MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);

    this.LegR.rotateAngleY = 0.0F;
    this.LegL.rotateAngleY = 0.0F;
    this.ArmR.rotateAngleY = 0.0F;
    this.ArmL.rotateAngleY = 0.0F;

    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
}
