package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCoolerFifthForm extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HeadChild_3;
	private final ModelRenderer HeadChild_5;
	private final ModelRenderer HeadChild_9;
	private final ModelRenderer HeadChild_8;
	private final ModelRenderer HeadChild;
	private final ModelRenderer HeadChild_1;
	private final ModelRenderer HeadChild_4;
	private final ModelRenderer HeadChild_6;
	private final ModelRenderer HeadChild_2;
	private final ModelRenderer HeadChild_7;
	private final ModelRenderer HeadChild_10;
	private final ModelRenderer HeadChild_11;
	private final ModelRenderer Crown1;
	private final ModelRenderer Crown2;
	private final ModelRenderer Crown3;
	private final ModelRenderer Crown4;
	private final ModelRenderer Crown5;
	private final ModelRenderer Crown6;
	private final ModelRenderer Crown7;
	private final ModelRenderer Crown8;
	private final ModelRenderer Crowngem;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer Body;
	private final ModelRenderer Breasts;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
	private final ModelRenderer FroB;
	private final ModelRenderer ShoulderGuard1;
	private final ModelRenderer ShoulderGuard2;
	private final ModelRenderer ShoulderGuard3;
	private final ModelRenderer ShoulderGuard4;
	private final ModelRenderer ShoulderGuard5;
	private final ModelRenderer ShoulderGuard6;
	private final ModelRenderer Backspike2;
	private final ModelRenderer Backspike1;
	private final ModelRenderer RArm;
	private final ModelRenderer Wristspike2;
	private final ModelRenderer LArm;
	private final ModelRenderer Wristspike1;
	private final ModelRenderer RLeg;
	private final ModelRenderer Legspike2;
	private final ModelRenderer LLeg;
	private final ModelRenderer Legspike1;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelCoolerFifthForm(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 24, 24, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		HeadChild_3 = new ModelRenderer(this);
		HeadChild_3.setRotationPoint(2.0F, -7.0F, 0.0F);
		Head.addChild(HeadChild_3);
		setRotationAngle(HeadChild_3, 0.0F, 0.0873F, 0.2618F);


		HeadChild_5 = new ModelRenderer(this);
		HeadChild_5.setRotationPoint(-5.0F, -7.0F, 4.0F);
		Head.addChild(HeadChild_5);
		setRotationAngle(HeadChild_5, -0.3491F, 0.0F, -0.4363F);


		HeadChild_9 = new ModelRenderer(this);
		HeadChild_9.setRotationPoint(0.0F, -2.0F, 6.0F);
		Head.addChild(HeadChild_9);
		setRotationAngle(HeadChild_9, -0.5236F, 0.3491F, 0.0F);


		HeadChild_8 = new ModelRenderer(this);
		HeadChild_8.setRotationPoint(3.0F, -8.0F, 2.0F);
		Head.addChild(HeadChild_8);
		setRotationAngle(HeadChild_8, 2.7925F, 0.0873F, 0.5236F);


		HeadChild = new ModelRenderer(this);
		HeadChild.setRotationPoint(-1.0F, -9.0F, 0.0F);
		Head.addChild(HeadChild);
		setRotationAngle(HeadChild, -0.0873F, 0.0F, -0.1745F);


		HeadChild_1 = new ModelRenderer(this);
		HeadChild_1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		Head.addChild(HeadChild_1);
		setRotationAngle(HeadChild_1, 0.0F, 0.0F, 0.2618F);


		HeadChild_4 = new ModelRenderer(this);
		HeadChild_4.setRotationPoint(-5.0F, -6.0F, -2.0F);
		Head.addChild(HeadChild_4);
		setRotationAngle(HeadChild_4, 2.7925F, 0.0873F, -0.6109F);


		HeadChild_6 = new ModelRenderer(this);
		HeadChild_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		Head.addChild(HeadChild_6);
		setRotationAngle(HeadChild_6, -0.3491F, 0.0F, 0.5236F);


		HeadChild_2 = new ModelRenderer(this);
		HeadChild_2.setRotationPoint(1.0F, -8.0F, 0.0F);
		Head.addChild(HeadChild_2);
		setRotationAngle(HeadChild_2, 0.0F, 0.0F, -0.0873F);


		HeadChild_7 = new ModelRenderer(this);
		HeadChild_7.setRotationPoint(-5.0F, -7.0F, 2.0F);
		Head.addChild(HeadChild_7);
		setRotationAngle(HeadChild_7, 2.7925F, 0.0873F, -0.4363F);


		HeadChild_10 = new ModelRenderer(this);
		HeadChild_10.setRotationPoint(-4.0F, -2.0F, 4.0F);
		Head.addChild(HeadChild_10);
		setRotationAngle(HeadChild_10, -0.5236F, -0.2618F, 0.0F);


		HeadChild_11 = new ModelRenderer(this);
		HeadChild_11.setRotationPoint(-3.0F, -7.0F, -1.0F);
		Head.addChild(HeadChild_11);
		setRotationAngle(HeadChild_11, -0.2618F, 0.0F, 0.0F);


		Crown1 = new ModelRenderer(this);
		Crown1.setRotationPoint(0.5F, -0.9F, -4.2F);
		Head.addChild(Crown1);
		setRotationAngle(Crown1, -0.6981F, 0.0F, 0.0F);
		Crown1.cubeList.add(new ModelBox(Crown1, 20, 16, -4.0F, -8.0F, -4.0F, 7, 4, 1, 0.5F));

		Crown2 = new ModelRenderer(this);
		Crown2.setRotationPoint(-3.0F, -5.4375F, -4.5F);
		Head.addChild(Crown2);
		setRotationAngle(Crown2, 0.0F, 0.0F, -1.3273F);
		Crown2.cubeList.add(new ModelBox(Crown2, 0, 6, -0.3787F, -2.5301F, -0.5F, 1, 5, 1, 0.5F));

		Crown3 = new ModelRenderer(this);
		Crown3.mirror = true;
		Crown3.setRotationPoint(3.0F, -5.4375F, -4.5F);
		Head.addChild(Crown3);
		setRotationAngle(Crown3, 0.0F, 0.0F, 1.3273F);
		Crown3.cubeList.add(new ModelBox(Crown3, 0, 6, -0.6213F, -2.5301F, -0.5F, 1, 5, 1, 0.5F));

		Crown4 = new ModelRenderer(this);
		Crown4.setRotationPoint(-6.0625F, -6.25F, -3.7375F);
		Head.addChild(Crown4);
		setRotationAngle(Crown4, -0.8727F, 0.0F, -1.309F);
		Crown4.cubeList.add(new ModelBox(Crown4, 0, 22, -0.4396F, -1.0104F, -0.5124F, 1, 2, 1, 0.5F));

		Crown5 = new ModelRenderer(this);
		Crown5.mirror = true;
		Crown5.setRotationPoint(6.0625F, -6.25F, -3.7375F);
		Head.addChild(Crown5);
		setRotationAngle(Crown5, -0.8727F, 0.0F, 1.309F);
		Crown5.cubeList.add(new ModelBox(Crown5, 0, 22, -0.5604F, -1.0104F, -0.5124F, 1, 2, 1, 0.5F));

		Crown6 = new ModelRenderer(this);
		Crown6.setRotationPoint(1.0F, -4.8F, -4.0F);
		Head.addChild(Crown6);
		setRotationAngle(Crown6, -1.2217F, 0.0F, 0.0F);
		Crown6.cubeList.add(new ModelBox(Crown6, 0, 22, -4.0F, -8.0F, -4.0F, 1, 4, 1, 0.5F));

		Crown7 = new ModelRenderer(this);
		Crown7.setRotationPoint(6.0F, -4.8F, -4.0F);
		Head.addChild(Crown7);
		setRotationAngle(Crown7, -1.2217F, 0.0F, 0.0F);
		Crown7.cubeList.add(new ModelBox(Crown7, 0, 22, -4.0F, -8.0F, -4.0F, 1, 4, 1, 0.5F));

		Crown8 = new ModelRenderer(this);
		Crown8.setRotationPoint(0.0625F, -5.4875F, -4.375F);
		Head.addChild(Crown8);
		setRotationAngle(Crown8, 0.0F, 0.0F, 1.5708F);
		Crown8.cubeList.add(new ModelBox(Crown8, 0, 22, -0.5F, -2.0F, -0.5625F, 1, 4, 1, 0.5F));

		Crowngem = new ModelRenderer(this);
		Crowngem.setRotationPoint(3.5F, -0.9F, -4.7F);
		Head.addChild(Crowngem);
		setRotationAngle(Crowngem, -0.6894F, 0.0F, 0.0F);
		Crowngem.cubeList.add(new ModelBox(Crowngem, 6, 0, -4.5F, -7.2085F, -4.0619F, 2, 3, 1, 0.3F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(-4.0F, -3.0F, -1.0F);
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 49, 0, -1.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.mirror = true;
		EarL.setRotationPoint(4.0F, -3.0F, -1.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 49, 0, 0.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 32, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		Breasts = new ModelRenderer(this);
		Breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Breasts);
		setRotationAngle(Breasts, -0.1745F, 0.0F, 0.0F);
		Breasts.cubeList.add(new ModelBox(Breasts, 36, 16, -3.5F, 1.0F, -1.8F, 7, 4, 1, 0.0F));

		ShoulderGuard1 = new ModelRenderer(this);
		ShoulderGuard1.setRotationPoint(9.8F, -0.3F, -0.3F);
		Body.addChild(ShoulderGuard1);
		setRotationAngle(ShoulderGuard1, 0.0F, 0.0F, 0.6981F);
		ShoulderGuard1.cubeList.add(new ModelBox(ShoulderGuard1, 0, 16, -4.6428F, -0.7661F, -3.0F, 2, 5, 1, 0.0F));

		ShoulderGuard2 = new ModelRenderer(this);
		ShoulderGuard2.setRotationPoint(9.8F, -0.3F, -0.3F);
		Body.addChild(ShoulderGuard2);
		setRotationAngle(ShoulderGuard2, 0.0F, 0.0F, 0.6981F);
		ShoulderGuard2.cubeList.add(new ModelBox(ShoulderGuard2, 48, 7, -4.6428F, -0.7661F, -2.0F, 2, 1, 5, 0.0F));

		ShoulderGuard3 = new ModelRenderer(this);
		ShoulderGuard3.setRotationPoint(9.8F, -0.3F, 4.3F);
		Body.addChild(ShoulderGuard3);
		setRotationAngle(ShoulderGuard3, 0.0F, 0.0F, 0.6981F);
		ShoulderGuard3.cubeList.add(new ModelBox(ShoulderGuard3, 0, 16, -4.6428F, -0.7661F, -2.0F, 2, 5, 1, 0.0F));

		ShoulderGuard4 = new ModelRenderer(this);
		ShoulderGuard4.mirror = true;
		ShoulderGuard4.setRotationPoint(-9.8F, -0.3F, -0.3F);
		Body.addChild(ShoulderGuard4);
		setRotationAngle(ShoulderGuard4, 0.0F, 0.0F, -0.6981F);
		ShoulderGuard4.cubeList.add(new ModelBox(ShoulderGuard4, 0, 16, 2.6428F, -0.7661F, -3.0F, 2, 5, 1, 0.0F));

		ShoulderGuard5 = new ModelRenderer(this);
		ShoulderGuard5.mirror = true;
		ShoulderGuard5.setRotationPoint(-9.8F, -0.3F, -0.3F);
		Body.addChild(ShoulderGuard5);
		setRotationAngle(ShoulderGuard5, 0.0F, 0.0F, -0.6981F);
		ShoulderGuard5.cubeList.add(new ModelBox(ShoulderGuard5, 48, 7, 2.6428F, -0.7661F, -2.0F, 2, 1, 5, 0.0F));

		ShoulderGuard6 = new ModelRenderer(this);
		ShoulderGuard6.mirror = true;
		ShoulderGuard6.setRotationPoint(-9.8F, -0.3F, 4.3F);
		Body.addChild(ShoulderGuard6);
		setRotationAngle(ShoulderGuard6, 0.0F, 0.0F, -0.6981F);
		ShoulderGuard6.cubeList.add(new ModelBox(ShoulderGuard6, 0, 16, 2.6428F, -0.7661F, -2.0F, 2, 5, 1, 0.0F));

		Backspike2 = new ModelRenderer(this);
		Backspike2.setRotationPoint(1.3F, 8.0F, -3.1F);
		Body.addChild(Backspike2);
		setRotationAngle(Backspike2, -1.309F, 0.0F, 0.0F);
		Backspike2.cubeList.add(new ModelBox(Backspike2, 0, 22, -4.0F, -9.1F, -4.0F, 1, 4, 1, 0.5F));

		Backspike1 = new ModelRenderer(this);
		Backspike1.setRotationPoint(5.5F, 8.0F, -3.1F);
		Body.addChild(Backspike1);
		setRotationAngle(Backspike1, -1.309F, 0.0017F, 0.0F);
		Backspike1.cubeList.add(new ModelBox(Backspike1, 0, 22, -4.0F, -9.1F, -4.0F, 1, 4, 1, 0.5F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 0, 48, -3.0031F, -2.079F, -2.0018F, 4, 12, 4, 0.0F));

		Wristspike2 = new ModelRenderer(this);
		Wristspike2.setRotationPoint(1.0F, 12.0F, -3.1F);
		RArm.addChild(Wristspike2);
		setRotationAngle(Wristspike2, -1.1345F, 0.0017F, 0.0F);
		Wristspike2.cubeList.add(new ModelBox(Wristspike2, 0, 22, -2.0031F, -9.1333F, -4.0717F, 1, 4, 1, 0.5F));

		LArm = new ModelRenderer(this);
		LArm.mirror = true;
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 48, -0.9938F, -2.158F, -1.9964F, 4, 12, 4, 0.0F));

		Wristspike1 = new ModelRenderer(this);
		Wristspike1.setRotationPoint(6.3F, 12.0F, -3.1F);
		LArm.addChild(Wristspike1);
		setRotationAngle(Wristspike1, -1.1345F, 0.0017F, 0.0F);
		Wristspike1.cubeList.add(new ModelBox(Wristspike1, 0, 22, -5.9969F, -9.1335F, -4.0715F, 1, 4, 1, 0.5F));

		RLeg = new ModelRenderer(this);
		RLeg.mirror = true;
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 40, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Legspike2 = new ModelRenderer(this);
		Legspike2.setRotationPoint(3.0F, 14.7F, -3.5F);
		RLeg.addChild(Legspike2);
		setRotationAngle(Legspike2, -1.1345F, 0.0192F, 0.0F);
		Legspike2.cubeList.add(new ModelBox(Legspike2, 0, 22, -4.0F, -9.1F, -4.0F, 1, 4, 1, 0.5F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 40, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Legspike1 = new ModelRenderer(this);
		Legspike1.setRotationPoint(4.0F, 14.7F, -3.5F);
		LLeg.addChild(Legspike1);
		setRotationAngle(Legspike1, -1.1345F, 0.0017F, 0.0F);
		Legspike1.cubeList.add(new ModelBox(Legspike1, 0, 22, -4.0F, -9.1F, -4.0F, 1, 4, 1, 0.5F));

		FroB = new ModelRenderer(this);
		FroB.setRotationPoint(0.0F, 10.0F, 2.0F);


		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 26, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		renderHairs(0.0625F, "FR", f2);
		GL11.glPopMatrix();
		this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.RArm.rotateAngleZ = 0.0F;
		this.LArm.rotateAngleZ = 0.0F;
		this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.RLeg.rotateAngleY = 0.0F;
		this.LLeg.rotateAngleY = 0.0F;
	}
	private void transRot(float f5, ModelRenderer m)
	{
		GL11.glTranslatef(m.rotationPointX * f5, m.rotationPointY * f5, m.rotationPointZ * f5);
		if (m.rotateAngleZ != 0.0F) {
			GL11.glRotatef(m.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
		}
		if (m.rotateAngleY != 0.0F) {
			GL11.glRotatef(m.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
		}
		if (m.rotateAngleX != 0.0F) {
			GL11.glRotatef(m.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
		}
	}
	public String renderHairs(float par1, String hair, float par3)
	{
		if (hair.equals("FR"))
		{
			GL11.glPushMatrix();
			transRot(par1, Body);
			GL11.glScalef(1.0F, 1.0F, 1.0F);
			FroB.render(par1);
			float r = MathHelper.sin(par3 * 0.02F) * 0.1F;
			float r2 = MathHelper.cos(par3 * 0.02F) * 0.1F;
			float r3 = MathHelper.cos(par3 * 0.14F) * 0.1F;
			ftailS1.rotateAngleY = 0.2F;
			ftailS1.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r;
			ftailS1.rotateAngleX = -0.3F;
			ftailS2.rotateAngleY = 0.2F;
			ftailS2.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r2 + r3;
			ftailS2.rotateAngleX = 0.4F;
			ftailS3.rotateAngleY = 0.1F;
			ftailS3.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.1F - 0.1F + r + r3;
			ftailS3.rotateAngleX = 0.6F;
			ftailS3.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F + 0.3F;
			ftailS4.rotateAngleY = 0.1F;
			ftailS4.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.1F + r2;
			ftailS4.rotateAngleX = 0.3F;
			ftailS4.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.2F;
			ftailS5.rotateAngleY = 0.2F;
			ftailS5.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r + r3;
			ftailS5.rotateAngleX = -0.2F;
			ftailS5.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.3F;
			ftailS6.rotateAngleY = 0.2F;
			ftailS6.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r2 + r3;
			ftailS6.rotateAngleX = -0.4F;
			ftailS6.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F - 0.4F;
			GL11.glPopMatrix();
		}
		return "";
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}