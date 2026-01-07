package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelPiccolo4 extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer ArmL;
	private final ModelRenderer ArmR;
	private final ModelRenderer LegL;
    private final ModelRenderer LegR;
    private final float scale;

	public ModelPiccolo4(float _scale) {
		textureWidth = 128;
		textureHeight = 64;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, -7.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.1F));

        ModelRenderer tentacleL = new ModelRenderer(this);
        tentacleL.mirror = true;
		tentacleL.setRotationPoint(1.5F, -7.1F, -4.3F);
		bipedHead.addChild(tentacleL);
		setRotationAngle(tentacleL, 0.3316F, 0.8727F, -2.9147F);
		tentacleL.cubeList.add(new ModelBox(tentacleL, 25, -1, -0.1253F, -0.3779F, -3.8457F, 0, 4, 4, 0.1F));

        ModelRenderer tentacleR = new ModelRenderer(this);
		tentacleR.setRotationPoint(-1.5F, -7.1F, -4.3F);
		bipedHead.addChild(tentacleR);
		setRotationAngle(tentacleR, 0.3316F, -0.8727F, 2.9147F);
		tentacleR.cubeList.add(new ModelBox(tentacleR, 25, -1, 0.1253F, -0.3779F, -3.8457F, 0, 4, 4, 0.1F));

        ModelRenderer head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -5.6F, 1.7F);
		bipedHead.addChild(head2);
		head2.cubeList.add(new ModelBox(head2, 33, 1, -3.5F, -3.0F, -5.0F, 7, 8, 8, 0.1F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(-3.7F, -5.3F, -1.0F);
		bipedHead.addChild(earR);
		setRotationAngle(earR, -0.0451F, 0.5284F, -0.2625F);
		earR.cubeList.add(new ModelBox(earR, 34, 1, -3.5F, -3.5F, 0.0F, 3, 6, 0, 0.1F));

        ModelRenderer earL = new ModelRenderer(this);
        earL.mirror = true;
		earL.setRotationPoint(3.7F, -5.3F, -1.0F);
		bipedHead.addChild(earL);
		setRotationAngle(earL, -0.0451F, -0.5284F, 0.2625F);
		earL.cubeList.add(new ModelBox(earL, 34, 1, 0.5F, -3.5F, 0.0F, 3, 6, 0, 0.1F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, -7.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 1, 24, -5.0F, 0.0F, -3.0F, 10, 9, 6, 0.0F));

        ModelRenderer body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 9.5F, 0.0F);
		bipedBody.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 1, 41, -4.5F, -0.5F, -2.5F, 9, 2, 5, 0.0F));

        ModelRenderer body3 = new ModelRenderer(this);
		body3.setRotationPoint(0.0F, 11.0F, 0.0F);
		bipedBody.addChild(body3);
		body3.cubeList.add(new ModelBox(body3, 1, 50, -5.0F, 0.0F, -3.0F, 10, 4, 6, 0.0F));

		ArmL = new ModelRenderer(this);
        ArmL.mirror = true;
		ArmL.setRotationPoint(5.8F, -5.1F, 0.0F);
		ArmL.cubeList.add(new ModelBox(ArmL, 41, 19, -0.8F, -1.9F, -2.5F, 5, 15, 5, 0.0F));

		ArmR = new ModelRenderer(this);
		ArmR.setRotationPoint(-5.8F, -5.1F, 0.0F);
		ArmR.cubeList.add(new ModelBox(ArmR, 41, 19, -4.2F, -1.9F, -2.5F, 5, 15, 5, 0.0F));

		LegL = new ModelRenderer(this);
        LegL.mirror = true;
		LegL.setRotationPoint(2.5F, 8.0F, 0.0F);
		LegL.cubeList.add(new ModelBox(LegL, 40, 40, -2.5F, 0.0F, -3.0F, 5, 14, 6, 0.0F));

        ModelRenderer feetL = new ModelRenderer(this);
		feetL.setRotationPoint(0.0F, 0.0F, 0.0F);
        feetL.mirror = true;
		LegL.addChild(feetL);
		feetL.cubeList.add(new ModelBox(feetL, 64, 41, -2.0F, 14.0F, -3.3F, 4, 2, 5, 0.0F));

		LegR = new ModelRenderer(this);
		LegR.setRotationPoint(-2.5F, 8.0F, 0.0F);
		LegR.cubeList.add(new ModelBox(LegR, 40, 40, -2.5F, 0.0F, -3.0F, 5, 14, 6, 0.0F));

        ModelRenderer feetR = new ModelRenderer(this);
		feetR.setRotationPoint(0.0F, 0.0F, 0.0F);
		LegR.addChild(feetR);
		feetR.cubeList.add(new ModelBox(feetR, 64, 41, -2.0F, 14.0F, -3.3F, 4, 2, 5, 0.0F));
	}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glScalef(this.scale, this.scale, this.scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
        this.bipedHead.render(f5);
        this.bipedBody.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
        this.LegL.render(f5);
        this.LegR.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
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

        this.bipedHead.rotateAngleY = (par4 / (r2 / 3.1415927F));
        this.bipedHead.rotateAngleX = (par5 / (r2 / 3.1415927F));
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
