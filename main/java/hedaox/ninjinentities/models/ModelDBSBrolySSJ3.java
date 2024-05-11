package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelDBSBrolySSJ3 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer SSJ3;
	private final ModelRenderer hair1;
	private final ModelRenderer hair2;
	private final ModelRenderer hair3;
	private final ModelRenderer hair4;
	private final ModelRenderer hair5;
	private final ModelRenderer hair6;
	private final ModelRenderer hair7;
	private final ModelRenderer hair8;
	private final ModelRenderer hair9;
	private final ModelRenderer hair10;
	private final ModelRenderer hair11;
	private final ModelRenderer hair12;
	private final ModelRenderer hair13;
	private final ModelRenderer hair14;
	private final ModelRenderer hair15;
	private final ModelRenderer hair16;
	private final ModelRenderer hair17;
	private final ModelRenderer hair18;
	private final ModelRenderer hair19;
	private final ModelRenderer strand1;
	private final ModelRenderer Body1;
	private final ModelRenderer Body2;
	private final ModelRenderer Chest;
	private final ModelRenderer Body3;
	private final ModelRenderer Cloth;
	private final ModelRenderer ArmR1;
	private final ModelRenderer ArmR2;
	private final ModelRenderer ArmR3;
	private final ModelRenderer ArmR3_r1;
	private final ModelRenderer ArmL1;
	private final ModelRenderer ArmL2;
	private final ModelRenderer ArmL3;
	private final ModelRenderer LegR;
	private final ModelRenderer LegL;

	public ModelDBSBrolySSJ3() {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -8.0F, 0.5F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		SSJ3 = new ModelRenderer(this);
		SSJ3.setRotationPoint(0.0F, 0.0F, 0.5F);
		Head.addChild(SSJ3);
		setRotationAngle(SSJ3, 0.0436F, 0.0F, 0.0F);
		

		hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		SSJ3.addChild(hair1);
		setRotationAngle(hair1, -1.309F, 0.0F, 0.6109F);
		hair1.cubeList.add(new ModelBox(hair1, 53, 2, -0.5133F, -7.474F, -2.0714F, 4, 9, 4, 0.0F));

		hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
		SSJ3.addChild(hair2);
		setRotationAngle(hair2, -0.3491F, 0.0F, 0.2618F);
		hair2.cubeList.add(new ModelBox(hair2, 56, 2, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

		hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		SSJ3.addChild(hair3);
		setRotationAngle(hair3, -0.3491F, 0.0F, -0.0873F);
		hair3.cubeList.add(new ModelBox(hair3, 56, 2, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

		hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		SSJ3.addChild(hair4);
		setRotationAngle(hair4, 0.0F, 0.0873F, 0.2618F);
		hair4.cubeList.add(new ModelBox(hair4, 56, 2, 1.0603F, -3.342F, -3.0F, 2, 6, 3, 0.0F));

		hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
		SSJ3.addChild(hair5);
		setRotationAngle(hair5, 2.7925F, 0.0873F, -0.6109F);
		hair5.cubeList.add(new ModelBox(hair5, 56, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		SSJ3.addChild(hair6);
		setRotationAngle(hair6, -1.2218F, 0.0F, -0.4363F);
		hair6.cubeList.add(new ModelBox(hair6, 56, 2, 1.8099F, -2.1257F, -2.2188F, 3, 6, 3, 0.0F));

		hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		SSJ3.addChild(hair7);
		setRotationAngle(hair7, -0.8727F, 0.0F, 0.5236F);
		hair7.cubeList.add(new ModelBox(hair7, 56, 2, 1.8099F, -1.4417F, -5.0982F, 3, 5, 5, 0.0F));

		hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
		SSJ3.addChild(hair8);
		setRotationAngle(hair8, 2.7925F, 0.0873F, -0.4363F);
		hair8.cubeList.add(new ModelBox(hair8, 56, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		SSJ3.addChild(hair9);
		setRotationAngle(hair9, 2.7925F, 0.0873F, 0.5236F);
		hair9.cubeList.add(new ModelBox(hair9, 56, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
		SSJ3.addChild(hair10);
		setRotationAngle(hair10, -2.7053F, 0.3491F, 0.0F);
		hair10.cubeList.add(new ModelBox(hair10, 54, 2, 0.9972F, -6.6289F, -0.1585F, 3, 10, 3, 0.0F));

		hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair11);
		setRotationAngle(hair11, -2.7053F, -0.2618F, 0.0F);
		hair11.cubeList.add(new ModelBox(hair11, 53, 2, 0.9972F, -5.6289F, -1.1585F, 3, 10, 3, 0.0F));

		hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair12);
		setRotationAngle(hair12, -2.7053F, 0.0F, 0.0F);
		hair12.cubeList.add(new ModelBox(hair12, 53, 2, 1.9972F, -5.6289F, -4.1585F, 4, 10, 3, 0.0F));

		hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair13);
		setRotationAngle(hair13, 3.1416F, 0.0F, 0.0F);
		hair13.cubeList.add(new ModelBox(hair13, 53, 2, 0.9972F, -11.6289F, -3.1585F, 6, 10, 3, 0.0F));

		hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair14);
		setRotationAngle(hair14, -2.7053F, 0.1745F, -0.2618F);
		hair14.cubeList.add(new ModelBox(hair14, 53, 2, 4.9972F, -8.6289F, -2.1585F, 4, 10, 3, 0.0F));

		hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair15);
		setRotationAngle(hair15, -2.7053F, -0.1745F, 0.5236F);
		hair15.cubeList.add(new ModelBox(hair15, 53, 2, -8.9972F, -8.6289F, -2.1585F, 4, 10, 3, 0.0F));

		hair16 = new ModelRenderer(this);
		hair16.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair16);
		setRotationAngle(hair16, -2.7053F, -0.1745F, 0.9599F);
		hair16.cubeList.add(new ModelBox(hair16, 53, 2, -8.9972F, -8.6289F, 0.8415F, 3, 7, 3, 0.0F));

		hair17 = new ModelRenderer(this);
		hair17.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair17);
		setRotationAngle(hair17, -2.7053F, 0.1745F, -0.9599F);
		hair17.cubeList.add(new ModelBox(hair17, 53, 2, 5.9972F, -8.6289F, 0.8415F, 3, 7, 3, 0.0F));

		hair18 = new ModelRenderer(this);
		hair18.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair18);
		setRotationAngle(hair18, -2.9671F, -0.1745F, 0.5236F);
		hair18.cubeList.add(new ModelBox(hair18, 53, 2, -3.9972F, -13.6289F, -2.1585F, 3, 8, 3, 0.0F));

		hair19 = new ModelRenderer(this);
		hair19.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair19);
		setRotationAngle(hair19, -2.9671F, 0.1745F, -0.3491F);
		hair19.cubeList.add(new ModelBox(hair19, 53, 2, 0.9972F, -13.6289F, -2.1585F, 3, 8, 3, 0.0F));

		strand1 = new ModelRenderer(this);
		strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
		SSJ3.addChild(strand1);
		setRotationAngle(strand1, -0.3491F, 0.0F, -0.4363F);
		strand1.cubeList.add(new ModelBox(strand1, 49, 2, 3.9972F, 3.029F, -2.2188F, 2, 5, 2, 0.0F));

		Body1 = new ModelRenderer(this);
		Body1.setRotationPoint(0.0F, -8.0F, 0.0F);
		Body1.cubeList.add(new ModelBox(Body1, 0, 18, -7.0F, 0.0F, -2.7F, 14, 8, 7, 0.0F));

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 8.0F, 0.0F);
		Body1.addChild(Body2);
		Body2.cubeList.add(new ModelBox(Body2, 0, 34, -5.5F, -1.8F, -2.9F, 11, 6, 6, 0.0F));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body2.addChild(Chest);
		Chest.cubeList.add(new ModelBox(Chest, 35, 34, -6.5F, -6.8F, -3.8F, 13, 5, 2, 0.0F));

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body2.addChild(Body3);
		Body3.cubeList.add(new ModelBox(Body3, 0, 48, -6.5F, 4.0F, -3.1F, 13, 5, 7, 0.0F));

		Cloth = new ModelRenderer(this);
		Cloth.setRotationPoint(0.0F, 15.5F, 0.8F);
		Body3.addChild(Cloth);
		Cloth.cubeList.add(new ModelBox(Cloth, 90, 46, -6.6F, -7.0F, 0.2F, 13, 10, 4, 0.0F));

		ArmR1 = new ModelRenderer(this);
		ArmR1.setRotationPoint(-7.4F, -5.5F, 0.3F);
		ArmR1.cubeList.add(new ModelBox(ArmR1, 66, 25, -6.0F, -3.0F, -3.5F, 7, 5, 7, -0.1F));

		ArmR2 = new ModelRenderer(this);
		ArmR2.setRotationPoint(5.7F, 7.5F, -0.3F);
		ArmR1.addChild(ArmR2);
		ArmR2.cubeList.add(new ModelBox(ArmR2, 67, 38, -11.3F, -5.8F, -2.8F, 6, 5, 6, 0.0F));

		ArmR3 = new ModelRenderer(this);
		ArmR3.setRotationPoint(1.6F, 2.2F, -0.8F);
		ArmR2.addChild(ArmR3);
		setRotationAngle(ArmR3, -0.2276F, 0.0F, 0.0F);
		

		ArmR3_r1 = new ModelRenderer(this);
		ArmR3_r1.setRotationPoint(-9.7F, 1.0F, 0.8F);
		ArmR3.addChild(ArmR3_r1);
		setRotationAngle(ArmR3_r1, 0.0436F, 0.0F, 0.0F);
		ArmR3_r1.cubeList.add(new ModelBox(ArmR3_r1, 67, 50, -3.0F, -4.7F, -3.3F, 6, 8, 5, 0.0F));

		ArmL1 = new ModelRenderer(this);
		ArmL1.mirror = true;
		ArmL1.setRotationPoint(7.4F, -5.5F, 0.3F);
		ArmL1.cubeList.add(new ModelBox(ArmL1, 66, 25, -1.0F, -3.0F, -3.5F, 7, 5, 7, -0.1F));

		ArmL2 = new ModelRenderer(this);
		ArmL2.mirror = true;
		ArmL2.setRotationPoint(-5.7F, 7.5F, -0.3F);
		ArmL1.addChild(ArmL2);
		ArmL2.cubeList.add(new ModelBox(ArmL2, 67, 38, 5.3F, -5.8F, -2.8F, 6, 5, 6, 0.0F));

		ArmL3 = new ModelRenderer(this);
		ArmL3.mirror = true;
		ArmL3.setRotationPoint(-1.3F, 2.2F, -0.8F);
		ArmL2.addChild(ArmL3);
		setRotationAngle(ArmL3, -0.182F, 0.0F, 0.0F);
		ArmL3.cubeList.add(new ModelBox(ArmL3, 67, 50, 6.4F, -3.7F, -2.5F, 6, 8, 5, 0.0F));

		LegR = new ModelRenderer(this);
		LegR.setRotationPoint(-3.0F, 9.0F, 0.0F);
		LegR.cubeList.add(new ModelBox(LegR, 41, 42, -3.0F, 0.0F, -3.0F, 6, 15, 6, 0.0F));

		LegL = new ModelRenderer(this);
		LegL.mirror = true;
		LegL.setRotationPoint(3.0F, 9.0F, 0.0F);
		LegL.cubeList.add(new ModelBox(LegL, 41, 42, -3.0F, 0.0F, -3.0F, 6, 15, 6, 0.0F));
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		this.Head.render(f5);
		this.Body1.render(f5);
		this.ArmR1.render(f5);
		this.ArmL1.render(f5);
		this.LegL.render(f5);
		this.LegR.render(f5);
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
		float n4 = par4;
		float n5 = par5;

		this.Head.rotateAngleY = (n4 / (r2 / 3.1415927F));
		this.Head.rotateAngleX = (n5 / (r2 / 3.1415927F));
		float ex = par7Entity.ticksExisted;
		float r3 = MathHelper.cos(ex * 0.14F) * 0.1F;
		float r4 = MathHelper.cos(ex / 8.0F) / 5.0F + 0.1F;

		r3 = MathHelper.cos(ex * 0.14F) * 0.1F;
		r4 = MathHelper.cos(ex / 8.0F) / 3.0F - 0.2F;

		this.LegR.rotateAngleX = (-0.0F - MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);
		this.LegL.rotateAngleX = (-0.0F + MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);
		this.ArmR1.rotateAngleX = (-0.0F + MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);
		this.ArmL1.rotateAngleX = (-0.0F - MathHelper.cos(par1 * 0.6662F) * 1.2F * par2);

		this.LegR.rotateAngleY = 0.0F;
		this.LegL.rotateAngleY = 0.0F;
		this.ArmR1.rotateAngleY = 0.0F;
		this.ArmL1.rotateAngleY = 0.0F;

		this.Cloth.rotateAngleX = (0.15F + this.LegL.rotateAngleX * (this.LegR.rotateAngleX >= 0.0F ? -1 : 1) * 1.0F);
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	}
}