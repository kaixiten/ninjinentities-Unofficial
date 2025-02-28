package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelPiccolo4 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer TentacleL;
	private final ModelRenderer TentacleR;
	private final ModelRenderer Head2;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Body3;
	private final ModelRenderer ArmL;
	private final ModelRenderer ArmR;
	private final ModelRenderer LegL;
	private final ModelRenderer FeetL;
	private final ModelRenderer LegR;
	private final ModelRenderer FeetR;
    private final float scale;

	public ModelPiccolo4(float _scale) {
		textureWidth = 128;
		textureHeight = 64;
        scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -7.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.1F));

		TentacleL = new ModelRenderer(this);
        TentacleL.mirror = true;
		TentacleL.setRotationPoint(1.5F, -7.1F, -4.3F);
		Head.addChild(TentacleL);
		setRotationAngle(TentacleL, 0.3316F, 0.8727F, -2.9147F);
		TentacleL.cubeList.add(new ModelBox(TentacleL, 25, -1, -0.1253F, -0.3779F, -3.8457F, 0, 4, 4, 0.1F));

		TentacleR = new ModelRenderer(this);
		TentacleR.setRotationPoint(-1.5F, -7.1F, -4.3F);
		Head.addChild(TentacleR);
		setRotationAngle(TentacleR, 0.3316F, -0.8727F, 2.9147F);
		TentacleR.cubeList.add(new ModelBox(TentacleR, 25, -1, 0.1253F, -0.3779F, -3.8457F, 0, 4, 4, 0.1F));

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(0.0F, -5.6F, 1.7F);
		Head.addChild(Head2);
		Head2.cubeList.add(new ModelBox(Head2, 33, 1, -3.5F, -3.0F, -5.0F, 7, 8, 8, 0.1F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(-3.7F, -5.3F, -1.0F);
		Head.addChild(EarR);
		setRotationAngle(EarR, -0.0451F, 0.5284F, -0.2625F);
		EarR.cubeList.add(new ModelBox(EarR, 34, 1, -3.5F, -3.5F, 0.0F, 3, 6, 0, 0.1F));

		EarL = new ModelRenderer(this);
        EarL.mirror = true;
		EarL.setRotationPoint(3.7F, -5.3F, -1.0F);
		Head.addChild(EarL);
		setRotationAngle(EarL, -0.0451F, -0.5284F, 0.2625F);
		EarL.cubeList.add(new ModelBox(EarL, 34, 1, 0.5F, -3.5F, 0.0F, 3, 6, 0, 0.1F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -7.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 1, 24, -5.0F, 0.0F, -3.0F, 10, 9, 6, 0.0F));

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 9.5F, 0.0F);
		Body.addChild(Body2);
		Body2.cubeList.add(new ModelBox(Body2, 1, 41, -4.5F, -0.5F, -2.5F, 9, 2, 5, 0.0F));

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, 11.0F, 0.0F);
		Body.addChild(Body3);
		Body3.cubeList.add(new ModelBox(Body3, 1, 50, -5.0F, 0.0F, -3.0F, 10, 4, 6, 0.0F));

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

		FeetL = new ModelRenderer(this);
		FeetL.setRotationPoint(0.0F, 0.0F, 0.0F);
        FeetL.mirror = true;
		LegL.addChild(FeetL);
		FeetL.cubeList.add(new ModelBox(FeetL, 64, 41, -2.0F, 14.0F, -3.3F, 4, 2, 5, 0.0F));

		LegR = new ModelRenderer(this);
		LegR.setRotationPoint(-2.5F, 8.0F, 0.0F);
		LegR.cubeList.add(new ModelBox(LegR, 40, 40, -2.5F, 0.0F, -3.0F, 5, 14, 6, 0.0F));

		FeetR = new ModelRenderer(this);
		FeetR.setRotationPoint(0.0F, 0.0F, 0.0F);
		LegR.addChild(FeetR);
		FeetR.cubeList.add(new ModelBox(FeetR, 64, 41, -2.0F, 14.0F, -3.3F, 4, 2, 5, 0.0F));
	}

    @Override
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
