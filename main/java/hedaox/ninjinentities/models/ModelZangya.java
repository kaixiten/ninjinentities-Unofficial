package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelZangya extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelZangya(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 29, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earR, 0.0F, -0.5236F, 0.0F);
		Head.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 24, 24, -4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 44, 44, 4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, -7.0F, 0.0F);
		setRotationAngle(hair1, 0.0F, 0.0F, 0.5236F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 0, 0, 0.0F, -3.4226F, -2.0F, 3, 3, 5, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-1.0F, -7.0F, 0.0F);
		setRotationAngle(hair2, 0.0F, 0.0F, -0.5236F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 0, 0, -2.0F, -4.0F, -2.0F, 5, 4, 5, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-7.0F, -6.0F, 1.0F);
		setRotationAngle(hair3, 0.0F, 0.0F, 0.2618F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 0, 0, 1.0F, -4.0F, -2.0F, 2, 4, 5, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-1.0F, -5.0F, 0.0F);
		setRotationAngle(hair4, 0.2618F, 0.0F, -0.5236F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 0, 0, -1.0F, -5.0F, -2.0F, 5, 5, 5, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(1.0F, -6.0F, -1.0F);
		setRotationAngle(hair5, 0.3491F, 0.0F, 0.3491F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 0, 0, -1.0F, -4.0F, -2.0F, 3, 4, 2, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(6.0F, -5.0F, 1.0F);
		setRotationAngle(hair6, 0.0F, 0.0F, -0.2618F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 0, 0, -3.0F, -4.0F, -2.0F, 2, 4, 5, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(2.0F, -7.0F, 5.5F);
		setRotationAngle(hair7, 0.1745F, 0.0F, 0.0F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 0, 3, -6.0F, -3.0F, -2.5F, 8, 7, 2, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(2.0F, -1.0F, 5.5F);
		setRotationAngle(hair8, 0.1745F, 0.0F, 0.0F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 0, 3, -6.0F, -3.0F, -2.5F, 8, 7, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(2.0F, 5.0F, 6.5F);
		setRotationAngle(hair9, 0.0873F, 0.0F, 0.0F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 0, 3, -6.0F, -3.0F, -2.5F, 8, 7, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(2.0F, -5.0F, 5.5F);
		setRotationAngle(hair10, 0.0873F, 0.0F, -0.6109F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 0, 3, -6.0F, 0.0F, -2.5F, 8, 4, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-2.0F, -5.0F, 5.5F);
		setRotationAngle(hair11, 0.0873F, 0.0F, 0.6109F);
		Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 0, 3, -2.0F, 0.0F, -2.5F, 8, 4, 3, 0.0F));

        ModelRenderer hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-2.0F, 0.0F, 6.5F);
		setRotationAngle(hair12, 0.0873F, 0.0F, 0.6109F);
		Head.addChild(hair12);
		hair12.cubeList.add(new ModelBox(hair12, 0, 3, -2.0F, 0.0F, -2.5F, 8, 4, 2, 0.0F));

        ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(2.0F, 0.0F, 6.5F);
		setRotationAngle(hair13, 0.0873F, 0.0F, -0.6109F);
		Head.addChild(hair13);
		hair13.cubeList.add(new ModelBox(hair13, 0, 3, -6.0F, 0.0F, -2.5F, 8, 4, 2, 0.0F));

        ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(2.0F, 5.0F, 7.5F);
		setRotationAngle(hair14, 0.0873F, 0.0F, -0.6109F);
		Head.addChild(hair14);
		hair14.cubeList.add(new ModelBox(hair14, 0, 3, -6.0F, 0.0F, -3.5F, 8, 4, 3, 0.0F));

        ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(-2.0F, 5.0F, 7.5F);
		setRotationAngle(hair15, 0.0873F, 0.0F, 0.6109F);
		Head.addChild(hair15);
		hair15.cubeList.add(new ModelBox(hair15, 0, 3, -2.0F, 0.0F, -3.5F, 8, 4, 3, 0.0F));

        ModelRenderer strand1 = new ModelRenderer(this);
		strand1.setRotationPoint(0.0F, -5.0F, -5.0F);
		setRotationAngle(strand1, -0.2618F, 0.0F, -0.1745F);
		Head.addChild(strand1);
		strand1.cubeList.add(new ModelBox(strand1, 1, 18, -4.0F, -4.0F, 0.0F, 3, 4, 1, 0.0F));

        ModelRenderer strand2 = new ModelRenderer(this);
		strand2.setRotationPoint(-4.0F, -4.0F, -5.0F);
		setRotationAngle(strand2, -0.2618F, 1.2217F, -0.1745F);
		Head.addChild(strand2);
		strand2.cubeList.add(new ModelBox(strand2, 0, 3, -3.9406F, -4.9935F, -0.0973F, 3, 4, 1, 0.0F));

        ModelRenderer strand3 = new ModelRenderer(this);
		strand3.setRotationPoint(4.0F, -5.0F, -5.0F);
		setRotationAngle(strand3, -0.2618F, -1.2217F, 0.1745F);
		Head.addChild(strand3);
		strand3.cubeList.add(new ModelBox(strand3, 0, 3, 0.0F, -4.0F, 0.0F, 4, 4, 1, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 40, 0, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(-0.2F, 18.6F, 0.2F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 32, -4.5F, -14.6F, -2.4F, 9, 9, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 16, 45, -3.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(3.8F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 30, 46, 0.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 40, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.8F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 45, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
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
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
