package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class Modelomega extends ModelBase {
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftarmChild_1;
	private final ModelRenderer leftarmChild;
	private final ModelRenderer leftarmChild_2;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightarmChild_2;
	private final ModelRenderer rightarmChild;
	private final ModelRenderer rightarmChild_1;
	private final ModelRenderer BackFang1;
	private final ModelRenderer BackFang2;
	private final ModelRenderer BackFang3;
	private final ModelRenderer BackFang4;
	private final ModelRenderer BackFang5;
	private final ModelRenderer BackFang6;
	private final ModelRenderer RightEars;
	private final ModelRenderer Shape3;
	private final ModelRenderer RightShoulderFang;
	private final ModelRenderer RightArmFang;
	private final ModelRenderer LeftShoulderFang;
	private final ModelRenderer LeftArmFang;
	private final ModelRenderer RightLegFang;
	private final ModelRenderer LeftLegFang;
	private final ModelRenderer HeadFang2;
	private final ModelRenderer HeadFang;
	private final ModelRenderer FaceFang3;
	private final ModelRenderer FaceFang2;
	private final ModelRenderer FaceFang;
	private final ModelRenderer DragonBall7;
	private final ModelRenderer DragonBall6;
	private final ModelRenderer DragonBall5;
	private final ModelRenderer DragonBall4;
	private final ModelRenderer DragonBall3;
	private final ModelRenderer DragonBall2;
	private final ModelRenderer DragonBall;
	private final ModelRenderer BackFang7;
	private final ModelRenderer BackFang8;
	public int heldItemRight;
	private final float scale = 1.0F;


	public Modelomega(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -2.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -2.0F, 8, 8, 8, 0.0F));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(3.0F, -4.9F, -0.5F);
		Head.addChild(Shape3);
		setRotateAngle(Shape3, 0.695F, -0.5463F, -0.8657F);
		Shape3.cubeList.add(new ModelBox(Shape3, 42, 26, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F));

		RightEars = new ModelRenderer(this);
		RightEars.setRotationPoint(-2.0F, -4.9F, 0.5F);
		Head.addChild(RightEars);
		setRotateAngle(RightEars, 2.9596F, -0.5463F, -2.3003F);
		RightEars.cubeList.add(new ModelBox(RightEars, 39, 26, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F));

		FaceFang3 = new ModelRenderer(this);
		FaceFang3.setRotationPoint(2.0F, -1.5F, -2.4F);
		Head.addChild(FaceFang3);
		setRotateAngle(FaceFang3, -0.2276F, -0.5009F, 0.0F);
		FaceFang3.cubeList.add(new ModelBox(FaceFang3, 9, 1, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

		FaceFang2 = new ModelRenderer(this);
		FaceFang2.setRotationPoint(-2.5F, -1.5F, -2.0F);
		Head.addChild(FaceFang2);
		setRotateAngle(FaceFang2, -0.2276F, 0.5009F, 0.0F);
		FaceFang2.cubeList.add(new ModelBox(FaceFang2, 9, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

		FaceFang = new ModelRenderer(this);
		FaceFang.setRotationPoint(-0.5F, -1.5F, -2.5F);
		Head.addChild(FaceFang);
		setRotateAngle(FaceFang, -0.2276F, 0.0F, 0.0F);
		FaceFang.cubeList.add(new ModelBox(FaceFang, 9, 1, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

		HeadFang = new ModelRenderer(this);
		HeadFang.setRotationPoint(0.8F, -15.5F, 3.0F);
		Head.addChild(HeadFang);
		setRotateAngle(HeadFang, -0.5463F, 0.0F, 0.0F);
		HeadFang.cubeList.add(new ModelBox(HeadFang, 33, 0, 0.0F, 1.0F, 1.0F, 3, 8, 3, 0.0F));

		HeadFang2 = new ModelRenderer(this);
		HeadFang2.setRotationPoint(0.8F, -15.5F, 3.0F);
		Head.addChild(HeadFang2);
		setRotateAngle(HeadFang2, -0.5463F, 0.0F, 0.0F);
		HeadFang2.cubeList.add(new ModelBox(HeadFang2, 33, 0, -4.6F, 1.0F, 1.0F, 3, 8, 3, 0.0F));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.2F, 1.7F, 1.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 40, 16, -0.6F, -2.5F, -3.7F, 5, 8, 5, 0.0F));

		LeftArmFang = new ModelRenderer(this);
		LeftArmFang.setRotationPoint(0.0F, 2.3F, 2.6F);
		leftarm.addChild(LeftArmFang);
		setRotateAngle(LeftArmFang, -0.2731F, 0.0F, 0.0F);
		LeftArmFang.cubeList.add(new ModelBox(LeftArmFang, 91, 1, 0.0F, 0.5394F, -1.9259F, 2, 2, 3, 0.0F));

		leftarmChild_1 = new ModelRenderer(this);
		leftarmChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmChild_1);
		leftarmChild_1.cubeList.add(new ModelBox(leftarmChild_1, 40, 40, -0.2F, 5.0F, -3.5F, 4, 2, 4, 0.0F));

		leftarmChild = new ModelRenderer(this);
		leftarmChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmChild);
		leftarmChild.cubeList.add(new ModelBox(leftarmChild, 7, 40, -1.1F, -2.8F, -4.2F, 6, 6, 6, 0.0F));

		LeftShoulderFang = new ModelRenderer(this);
		LeftShoulderFang.setRotationPoint(1.5F, -2.5F, 0.0F);
		leftarmChild.addChild(LeftShoulderFang);
		setRotateAngle(LeftShoulderFang, 0.0F, -0.1367F, -0.6374F);
		LeftShoulderFang.cubeList.add(new ModelBox(LeftShoulderFang, 87, 0, 0.7275F, 1.0F, -1.9813F, 4, 2, 2, 0.0F));

		BackFang7 = new ModelRenderer(this);
		BackFang7.setRotationPoint(-0.2F, -2.6408F, 5.3218F);
		leftarmChild.addChild(BackFang7);
		setRotateAngle(BackFang7, 0.6541F, 0.2095F, 0.1581F);
		BackFang7.cubeList.add(new ModelBox(BackFang7, 88, 0, -0.084F, -2.1902F, -5.5525F, 2, 2, 6, 0.0F));

		leftarmChild_2 = new ModelRenderer(this);
		leftarmChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmChild_2);
		leftarmChild_2.cubeList.add(new ModelBox(leftarmChild_2, 70, 40, -0.7F, 6.2F, -3.7F, 5, 6, 5, 0.0F));

		rightarm = new ModelRenderer(this);
		rightarm.mirror = true;
		rightarm.setRotationPoint(-5.2F, 1.7F, -1.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 40, 16, -4.4F, -2.5F, -1.7F, 5, 8, 5, 0.0F));

		RightArmFang = new ModelRenderer(this);
		RightArmFang.setRotationPoint(-2.0F, 2.3F, 3.6F);
		rightarm.addChild(RightArmFang);
		setRotateAngle(RightArmFang, -0.2731F, 0.0F, 0.0F);
		RightArmFang.cubeList.add(new ModelBox(RightArmFang, 90, 0, 0.0F, 0.2697F, -0.9629F, 2, 2, 3, 0.0F));

		rightarmChild_2 = new ModelRenderer(this);
		rightarmChild_2.mirror = true;
		rightarmChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarmChild_2);
		rightarmChild_2.cubeList.add(new ModelBox(rightarmChild_2, 70, 40, -4.3F, 6.2F, -1.7F, 5, 6, 5, 0.0F));

		rightarmChild = new ModelRenderer(this);
		rightarmChild.mirror = true;
		rightarmChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarmChild);
		rightarmChild.cubeList.add(new ModelBox(rightarmChild, 7, 40, -4.8F, -2.8F, -2.2F, 6, 6, 6, 0.0F));

		RightShoulderFang = new ModelRenderer(this);
		RightShoulderFang.setRotationPoint(-4.5F, -5.0F, 1.0F);
		rightarmChild.addChild(RightShoulderFang);
		setRotateAngle(RightShoulderFang, 0.0F, 0.1367F, 0.6374F);
		RightShoulderFang.cubeList.add(new ModelBox(RightShoulderFang, 87, 1, -0.8637F, 1.0F, -0.9907F, 4, 2, 2, 0.0F));

		BackFang8 = new ModelRenderer(this);
		BackFang8.setRotationPoint(0.0119F, -2.1833F, 5.7041F);
		rightarmChild.addChild(BackFang8);
		setRotateAngle(BackFang8, 0.6541F, -0.2095F, -0.1581F);
		BackFang8.cubeList.add(new ModelBox(BackFang8, 88, 1, -1.208F, -1.5951F, -4.7763F, 2, 2, 6, 0.0F));

		rightarmChild_1 = new ModelRenderer(this);
		rightarmChild_1.mirror = true;
		rightarmChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarmChild_1);
		rightarmChild_1.cubeList.add(new ModelBox(rightarmChild_1, 40, 40, -3.7F, 5.0F, -1.5F, 4, 2, 4, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-4.0F, 0.0F, -2.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, 0.0F, 0.0F, 0.0F, 8, 12, 4, 0.1F));

		BackFang1 = new ModelRenderer(this);
		BackFang1.setRotationPoint(1.0F, 2.6F, 3.3F);
		Body.addChild(BackFang1);
		setRotateAngle(BackFang1, 0.5009F, 0.0F, 0.0F);
		BackFang1.cubeList.add(new ModelBox(BackFang1, 91, 1, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

		BackFang3 = new ModelRenderer(this);
		BackFang3.setRotationPoint(0.0F, 6.0F, 3.3F);
		Body.addChild(BackFang3);
		setRotateAngle(BackFang3, 0.5009F, 0.0F, 0.0F);
		BackFang3.cubeList.add(new ModelBox(BackFang3, 89, 1, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F));

		BackFang2 = new ModelRenderer(this);
		BackFang2.setRotationPoint(5.0F, 2.6F, 3.3F);
		Body.addChild(BackFang2);
		setRotateAngle(BackFang2, 0.5009F, 0.0F, 0.0F);
		BackFang2.cubeList.add(new ModelBox(BackFang2, 88, 0, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

		BackFang4 = new ModelRenderer(this);
		BackFang4.setRotationPoint(6.0F, 6.0F, 3.3F);
		Body.addChild(BackFang4);
		setRotateAngle(BackFang4, 0.5009F, 0.0F, 0.0F);
		BackFang4.cubeList.add(new ModelBox(BackFang4, 89, 0, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F));

		BackFang6 = new ModelRenderer(this);
		BackFang6.setRotationPoint(5.0F, 7.6F, 3.3F);
		Body.addChild(BackFang6);
		setRotateAngle(BackFang6, -0.4098F, 0.0F, 0.0F);
		BackFang6.cubeList.add(new ModelBox(BackFang6, 90, 1, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

		BackFang5 = new ModelRenderer(this);
		BackFang5.setRotationPoint(1.0F, 7.6F, 3.3F);
		Body.addChild(BackFang5);
		setRotateAngle(BackFang5, -0.4098F, 0.0F, 0.0F);
		BackFang5.cubeList.add(new ModelBox(BackFang5, 90, 0, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

		DragonBall7 = new ModelRenderer(this);
		DragonBall7.setRotationPoint(3.0F, 3.0F, -1.0F);
		Body.addChild(DragonBall7);
		DragonBall7.cubeList.add(new ModelBox(DragonBall7, 69, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F));

		DragonBall6 = new ModelRenderer(this);
		DragonBall6.setRotationPoint(0.0F, 4.2F, -1.0F);
		Body.addChild(DragonBall6);
		DragonBall6.cubeList.add(new ModelBox(DragonBall6, 69, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F));

		DragonBall = new ModelRenderer(this);
		DragonBall.setRotationPoint(3.0F, 0.2F, -1.0F);
		Body.addChild(DragonBall);
		DragonBall.cubeList.add(new ModelBox(DragonBall, 69, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F));

		DragonBall5 = new ModelRenderer(this);
		DragonBall5.setRotationPoint(5.0F, 4.2F, -1.0F);
		Body.addChild(DragonBall5);
		DragonBall5.cubeList.add(new ModelBox(DragonBall5, 69, 0, 1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F));

		DragonBall3 = new ModelRenderer(this);
		DragonBall3.setRotationPoint(0.0F, 1.7F, -1.0F);
		Body.addChild(DragonBall3);
		DragonBall3.cubeList.add(new ModelBox(DragonBall3, 69, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F));

		DragonBall2 = new ModelRenderer(this);
		DragonBall2.setRotationPoint(6.0F, 1.7F, -1.0F);
		Body.addChild(DragonBall2);
		setRotateAngle(DragonBall2, 0.0F, 0.0F, 0.0349F);
		DragonBall2.cubeList.add(new ModelBox(DragonBall2, 69, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F));

		DragonBall4 = new ModelRenderer(this);
		DragonBall4.setRotationPoint(3.0F, 2.2F, -1.0F);
		Body.addChild(DragonBall4);
		DragonBall4.cubeList.add(new ModelBox(DragonBall4, 69, 0, 0.0F, 4.0F, 0.0F, 2, 2, 1, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(2.0F, 12.0F, 2.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		RightLegFang = new ModelRenderer(this);
		RightLegFang.setRotationPoint(-1.0F, 1.8F, -2.3F);
		RLeg.addChild(RightLegFang);
		setRotateAngle(RightLegFang, 0.2731F, 0.0F, 0.0F);
		RightLegFang.cubeList.add(new ModelBox(RightLegFang, 88, 0, 0.0F, 0.0F, -2.0F, 2, 2, 3, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.mirror = true;
		LLeg.setRotationPoint(2.0F, 12.0F, 2.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LeftLegFang = new ModelRenderer(this);
		LeftLegFang.setRotationPoint(3.0F, 1.8F, -2.3F);
		LLeg.addChild(LeftLegFang);
		setRotateAngle(LeftLegFang, 0.2731F, 0.0F, 0.0F);
		LeftLegFang.cubeList.add(new ModelBox(LeftLegFang, 87, 0, 0.0F, 0.0F, -2.0F, 2, 2, 3, 0.0F));
	}

	public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
	{
		setRotateAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);
		if (this.isChild)
		{
			float f6 = 2.0F;
			GL11.glPushMatrix();
			GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
			GL11.glTranslatef(0.0F, 16.0F * p_78088_7_, 0.0F);
			this.Head.render(p_78088_7_);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
			GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
			this.Body.render(p_78088_7_);

			GL11.glPopMatrix();
		}
		else
		{
			this.Head.render(p_78088_7_);
			this.Body.render(p_78088_7_);

			GL11.glScaled(0.9D, 0.9D, 0.9D);
			this.rightarm.render(p_78088_7_);
			this.leftarm.render(p_78088_7_);
		}
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotateAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	{
		this.Head.rotateAngleY = p_78087_4_  / (180F / (float)Math.PI);
		this.Head.rotateAngleX = p_78087_5_  / (180F / (float)Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
		this.leftarm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
		this.rightarm.rotateAngleZ = 0.0F;
		this.leftarm.rotateAngleZ = 0.0F;
		this.RLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
		this.LLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
		this.RLeg.rotateAngleY = 0.0F;
		this.LLeg.rotateAngleY = 0.0F;
		if (this.isRiding)
		{
			this.rightarm.rotateAngleX = 0;
			this.RLeg.rotateAngleX = 0;
			this.LLeg.rotateAngleX = 0;
			this.RLeg.rotateAngleY = 0;
			this.LLeg.rotateAngleY = 0;
		}
		if (this.heldItemRight != 0) {
			this.rightarm.rotateAngleX = (this.rightarm.rotateAngleX * 0.5F - 0.31415927F * this.heldItemRight);
		}
		this.rightarm.rotateAngleY = 0.0F;
		if (this.onGround > -9990.0F)
		{
			float f6 = this.onGround;
			this.Body.rotateAngleY = (MathHelper.sin(MathHelper.sqrt_float(f6) * 3.1415927F * 2.0F) * 0.2F);
			this.rightarm.rotationPointZ = (-MathHelper.sin(this.Body.rotateAngleY) * 5.0F);
			this.rightarm.rotationPointX = (-MathHelper.cos(this.Body.rotateAngleY) * 6.0F);
			this.leftarm.rotationPointZ = (-MathHelper.sin(this.Body.rotateAngleY) * 5.0F);
			this.leftarm.rotationPointX = (MathHelper.cos(this.Body.rotateAngleY) * 5.0F);

			f6 = 1.0F - this.onGround;
			f6 *= f6;
			f6 *= f6;
			f6 = 1.0F - f6;
			float f7 = MathHelper.sin(f6 * 3.1415927F);
			float f8 = MathHelper.sin(this.onGround * 3.1415927F) * -(this.Head.rotateAngleX - 0.7F) * 0.75F;
			this.rightarm.rotateAngleX = ((float)(this.rightarm.rotateAngleX - (f7 * 1.2D + f8)));
			this.rightarm.rotateAngleY += this.Body.rotateAngleY * 2.0F;
			this.rightarm.rotateAngleZ = (MathHelper.sin(this.onGround * 2.1415927F) * -0.4F);

			this.rightarm.offsetX = 0.03F;
			this.rightarm.offsetZ = -0.08F;
			this.leftarm.offsetZ = 0.11F;
		}
	}
}