package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAndroid13Super extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelAndroid13Super(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(hair3, 0.0F, 0.0873F, 0.2618F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 56, 0, 1.0603F, -4.342F, -3.0F, 1, 7, 3, 0.0F));

		ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(hair5, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 52, 4, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

		ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(hair9, -0.5236F, 0.3491F, 0.0F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 52, 4, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

		ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(hair8, 2.7925F, 0.0873F, 0.5236F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 52, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		ModelRenderer hair = new ModelRenderer(this);
		hair.setRotationPoint(-1.0F, -9.0F, 0.0F);
		setRotationAngle(hair, -0.0873F, 0.0F, -0.1745F);
		Head.addChild(hair);
		hair.cubeList.add(new ModelBox(hair, 48, 0, -0.5133F, -5.474F, -2.0714F, 4, 8, 4, 0.0F));

		ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(hair1, 0.0F, 0.0F, 0.2618F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 52, 0, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

		ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(hair4, 2.7925F, 0.0873F, -0.6109F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 52, 0, -0.0028F, -3.971F, -3.2188F, 3, 8, 3, 0.0F));

		ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair6, -0.3491F, 0.0F, 0.5236F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 48, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

		ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair2, 0.0F, 0.0F, -0.0873F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 52, 0, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

		ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(hair7, 2.7925F, 0.0873F, -0.4363F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 52, 0, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair10, -0.5236F, -0.2618F, 0.0F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 52, 0, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

		ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-3.0F, -7.0F, -1.0F);
		setRotationAngle(hair11, -0.2618F, 0.0F, 0.0F);
		Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 56, 2, 1.9972F, -1.971F, -3.2188F, 2, 4, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		RArm.cubeList.add(new ModelBox(RArm, 32, 0, -5.029F, -2.3146F, -2.0032F, 3, 3, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		LArm.cubeList.add(new ModelBox(LArm, 32, 0, 9.9969F, -2.5029F, -2.0112F, 3, 3, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
        this.Head.rotateAngleY = f3 / (160F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (160F / (float)Math.PI);
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
