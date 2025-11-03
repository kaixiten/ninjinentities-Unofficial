package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class Modelomega2 extends ModelBase {
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer leftarm;
    private final ModelRenderer rightarm;

    public int heldItemLeft;
	public int heldItemRight;

	private final float scale = 1.0F;


	public Modelomega2(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -2.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -2.0F, 8, 8, 8, 0.0F));

        ModelRenderer shape3 = new ModelRenderer(this);
		shape3.setRotationPoint(3.0F, -4.9F, -0.5F);
		Head.addChild(shape3);
		setRotationAngle(shape3, 0.695F, -0.5463F, -0.8657F);
		shape3.cubeList.add(new ModelBox(shape3, 42, 26, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F));

        ModelRenderer rightEars = new ModelRenderer(this);
		rightEars.setRotationPoint(-2.0F, -4.9F, 0.5F);
		Head.addChild(rightEars);
		setRotationAngle(rightEars, 2.9596F, -0.5463F, -2.3003F);
		rightEars.cubeList.add(new ModelBox(rightEars, 39, 26, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F));

        ModelRenderer faceFang3 = new ModelRenderer(this);
		faceFang3.setRotationPoint(2.0F, -1.5F, -2.4F);
		Head.addChild(faceFang3);
		setRotationAngle(faceFang3, -0.2276F, -0.5009F, 0.0F);
		faceFang3.cubeList.add(new ModelBox(faceFang3, 9, 1, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

        ModelRenderer faceFang2 = new ModelRenderer(this);
		faceFang2.setRotationPoint(-2.5F, -1.5F, -2.0F);
		Head.addChild(faceFang2);
		setRotationAngle(faceFang2, -0.2276F, 0.5009F, 0.0F);
		faceFang2.cubeList.add(new ModelBox(faceFang2, 9, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

        ModelRenderer faceFang = new ModelRenderer(this);
		faceFang.setRotationPoint(-0.5F, -1.5F, -2.5F);
		Head.addChild(faceFang);
		setRotationAngle(faceFang, -0.2276F, 0.0F, 0.0F);
		faceFang.cubeList.add(new ModelBox(faceFang, 9, 1, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

        ModelRenderer headFang = new ModelRenderer(this);
		headFang.setRotationPoint(0.8F, -15.5F, 3.0F);
		Head.addChild(headFang);
		setRotationAngle(headFang, -0.5463F, 0.0F, 0.0F);
		headFang.cubeList.add(new ModelBox(headFang, 33, 0, 0.0F, 1.0F, 1.0F, 3, 8, 3, 0.0F));

        ModelRenderer headFang2 = new ModelRenderer(this);
		headFang2.setRotationPoint(0.8F, -15.5F, 3.0F);
		Head.addChild(headFang2);
		setRotationAngle(headFang2, -0.5463F, 0.0F, 0.0F);
		headFang2.cubeList.add(new ModelBox(headFang2, 33, 0, -4.6F, 1.0F, 1.0F, 3, 8, 3, 0.0F));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.2F, 1.7F, 1.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 40, 16, -0.6F, -2.5F, -3.7F, 5, 8, 5, 0.0F));

        ModelRenderer leftArmFang = new ModelRenderer(this);
		leftArmFang.setRotationPoint(0.0F, 2.3F, 2.6F);
		leftarm.addChild(leftArmFang);
		setRotationAngle(leftArmFang, -0.2731F, 0.0F, 0.0F);
		leftArmFang.cubeList.add(new ModelBox(leftArmFang, 91, 1, 0.0F, 0.5394F, -1.9259F, 2, 2, 3, 0.0F));

        ModelRenderer leftarmChild_1 = new ModelRenderer(this);
		leftarmChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmChild_1);
		leftarmChild_1.cubeList.add(new ModelBox(leftarmChild_1, 40, 40, -0.2F, 5.0F, -3.5F, 4, 2, 4, 0.0F));

        ModelRenderer leftarmChild = new ModelRenderer(this);
		leftarmChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmChild);
		leftarmChild.cubeList.add(new ModelBox(leftarmChild, 7, 40, -1.1F, -2.8F, -4.2F, 6, 6, 6, 0.0F));

        ModelRenderer leftShoulderFang = new ModelRenderer(this);
		leftShoulderFang.setRotationPoint(1.5F, -2.5F, 0.0F);
		leftarmChild.addChild(leftShoulderFang);
		setRotationAngle(leftShoulderFang, 0.0F, -0.1367F, -0.6374F);
		leftShoulderFang.cubeList.add(new ModelBox(leftShoulderFang, 87, 0, 0.7275F, 1.0F, -1.9813F, 4, 2, 2, 0.0F));

        ModelRenderer backFang7 = new ModelRenderer(this);
		backFang7.setRotationPoint(-0.2F, -2.6408F, 5.3218F);
		leftarmChild.addChild(backFang7);
		setRotationAngle(backFang7, 0.6541F, 0.2095F, 0.1581F);
		backFang7.cubeList.add(new ModelBox(backFang7, 88, 0, -0.084F, -2.1902F, -5.5525F, 2, 2, 6, 0.0F));

        ModelRenderer leftarmChild_2 = new ModelRenderer(this);
		leftarmChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmChild_2);
		leftarmChild_2.cubeList.add(new ModelBox(leftarmChild_2, 70, 40, -0.7F, 6.2F, -3.7F, 5, 6, 5, 0.0F));

		rightarm = new ModelRenderer(this);
		rightarm.mirror = true;
		rightarm.setRotationPoint(-5.2F, 1.7F, -1.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 40, 16, -4.4F, -2.5F, -1.7F, 5, 8, 5, 0.0F));

        ModelRenderer rightArmFang = new ModelRenderer(this);
		rightArmFang.setRotationPoint(-2.0F, 2.3F, 3.6F);
		rightarm.addChild(rightArmFang);
		setRotationAngle(rightArmFang, -0.2731F, 0.0F, 0.0F);
		rightArmFang.cubeList.add(new ModelBox(rightArmFang, 90, 0, 0.0F, 0.2697F, -0.9629F, 2, 2, 3, 0.0F));

        ModelRenderer rightarmChild_2 = new ModelRenderer(this);
		rightarmChild_2.mirror = true;
		rightarmChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarmChild_2);
		rightarmChild_2.cubeList.add(new ModelBox(rightarmChild_2, 70, 40, -4.3F, 6.2F, -1.7F, 5, 6, 5, 0.0F));

        ModelRenderer rightarmChild = new ModelRenderer(this);
		rightarmChild.mirror = true;
		rightarmChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarmChild);
		rightarmChild.cubeList.add(new ModelBox(rightarmChild, 7, 40, -4.8F, -2.8F, -2.2F, 6, 6, 6, 0.0F));

        ModelRenderer rightShoulderFang = new ModelRenderer(this);
		rightShoulderFang.setRotationPoint(-4.5F, -5.0F, 1.0F);
		rightarmChild.addChild(rightShoulderFang);
		setRotationAngle(rightShoulderFang, 0.0F, 0.1367F, 0.6374F);
		rightShoulderFang.cubeList.add(new ModelBox(rightShoulderFang, 87, 1, -0.8637F, 1.0F, -0.9907F, 4, 2, 2, 0.0F));

        ModelRenderer backFang8 = new ModelRenderer(this);
		backFang8.setRotationPoint(0.0119F, -2.1833F, 5.7041F);
		rightarmChild.addChild(backFang8);
		setRotationAngle(backFang8, 0.6541F, -0.2095F, -0.1581F);
		backFang8.cubeList.add(new ModelBox(backFang8, 88, 1, -1.208F, -1.5951F, -4.7763F, 2, 2, 6, 0.0F));

        ModelRenderer rightarmChild_1 = new ModelRenderer(this);
		rightarmChild_1.mirror = true;
		rightarmChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarmChild_1);
		rightarmChild_1.cubeList.add(new ModelBox(rightarmChild_1, 40, 40, -3.7F, 5.0F, -1.5F, 4, 2, 4, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-4.0F, 0.0F, -2.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, 0.0F, 0.0F, 0.0F, 8, 12, 4, 0.1F));

        ModelRenderer backFang1 = new ModelRenderer(this);
		backFang1.setRotationPoint(1.0F, 2.6F, 3.3F);
		Body.addChild(backFang1);
		setRotationAngle(backFang1, 0.5009F, 0.0F, 0.0F);
		backFang1.cubeList.add(new ModelBox(backFang1, 91, 1, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

        ModelRenderer backFang3 = new ModelRenderer(this);
		backFang3.setRotationPoint(0.0F, 6.0F, 3.3F);
		Body.addChild(backFang3);
		setRotationAngle(backFang3, 0.5009F, 0.0F, 0.0F);
		backFang3.cubeList.add(new ModelBox(backFang3, 89, 1, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F));

        ModelRenderer backFang2 = new ModelRenderer(this);
		backFang2.setRotationPoint(5.0F, 2.6F, 3.3F);
		Body.addChild(backFang2);
		setRotationAngle(backFang2, 0.5009F, 0.0F, 0.0F);
		backFang2.cubeList.add(new ModelBox(backFang2, 88, 0, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

        ModelRenderer backFang4 = new ModelRenderer(this);
		backFang4.setRotationPoint(6.0F, 6.0F, 3.3F);
		Body.addChild(backFang4);
		setRotationAngle(backFang4, 0.5009F, 0.0F, 0.0F);
		backFang4.cubeList.add(new ModelBox(backFang4, 89, 0, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F));

        ModelRenderer backFang6 = new ModelRenderer(this);
		backFang6.setRotationPoint(5.0F, 7.6F, 3.3F);
		Body.addChild(backFang6);
		setRotationAngle(backFang6, -0.4098F, 0.0F, 0.0F);
		backFang6.cubeList.add(new ModelBox(backFang6, 90, 1, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

        ModelRenderer backFang5 = new ModelRenderer(this);
		backFang5.setRotationPoint(1.0F, 7.6F, 3.3F);
		Body.addChild(backFang5);
		setRotationAngle(backFang5, -0.4098F, 0.0F, 0.0F);
		backFang5.cubeList.add(new ModelBox(backFang5, 90, 0, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(2.0F, 12.0F, 2.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer rightLegFang = new ModelRenderer(this);
		rightLegFang.setRotationPoint(-1.0F, 1.8F, -2.3F);
		RLeg.addChild(rightLegFang);
		setRotationAngle(rightLegFang, 0.2731F, 0.0F, 0.0F);
		rightLegFang.cubeList.add(new ModelBox(rightLegFang, 88, 0, 0.0F, 0.0F, -2.0F, 2, 2, 3, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.mirror = true;
		LLeg.setRotationPoint(2.0F, 12.0F, 2.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer leftLegFang = new ModelRenderer(this);
		leftLegFang.setRotationPoint(3.0F, 1.8F, -2.3F);
		LLeg.addChild(leftLegFang);
		setRotationAngle(leftLegFang, 0.2731F, 0.0F, 0.0F);
		leftLegFang.cubeList.add(new ModelBox(leftLegFang, 87, 0, 0.0F, 0.0F, -2.0F, 2, 2, 3, 0.0F));
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

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
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
