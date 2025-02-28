package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCooler extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer Body;
	private final ModelRenderer Breasts;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
	private final ModelRenderer FroB;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelCooler(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(-4.0F, -4.0F, -1.0F);
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 0, 0, -1.0F, -1.0F, -1.0F, 1, 3, 2, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(5.0F, -4.0F, -1.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 0, 0, -1.0F, -1.0F, -1.0F, 1, 3, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		Breasts = new ModelRenderer(this);
		Breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Breasts, -0.1745F, 0.0F, 0.0F);
		Body.addChild(Breasts);
		Breasts.cubeList.add(new ModelBox(Breasts, 64, 12, -3.5F, 0.9566F, -1.6871F, 7, 4, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		FroB = new ModelRenderer(this);
		FroB.setRotationPoint(0.0F, 10.0F, 2.0F);

		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 38, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 38, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 38, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 38, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 38, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 38, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));
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