package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGohanAdultSsj2 extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	public ModelGohanAdultSsj2(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		setRotationAngle(hair1, -0.0873F, 0.0F, -0.1745F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 42, 2, -0.5133F, -6.474F, -2.0714F, 3, 8, 3, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-2.0F, -10.0F, 0.0F);
		setRotationAngle(hair2, 0.0F, 0.0F, -0.349F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 43, 2, -1.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair3, 0.0F, 0.0F, 0.3665F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 43, 2, 0.0603F, -5.342F, -3.0F, 3, 7, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(hair4, 0.0F, 0.0873F, 0.4363F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -5.342F, -0.9F, 2, 7, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-4.6F, -6.4F, -2.0F);
		setRotationAngle(hair5, 2.7925F, 0.0873F, -0.4364F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 42, 2, -0.0028F, -2.171F, -3.2188F, 3, 7, 3, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(hair6, -0.0873F, 0.0F, -0.4363F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -5.1257F, -3.0188F, 3, 9, 3, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair7, -0.3491F, 0.0F, 0.0699F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 43, 2, 1.8099F, -4.0417F, -5.0982F, 3, 7, 4, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-3.0F, -8.0F, 2.0F);
		setRotationAngle(hair8, 2.7925F, -0.0873F, -0.349F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 43, 4, -1.9972F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(hair9, 2.7925F, 0.0873F, 0.349F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 43, 4, -1.0028F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-0.7F, -4.2F, 1.3F);
		setRotationAngle(hair10, 2.8798F, 0.0873F, 0.0F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 42, 2, 0.9972F, -2.3391F, -4.0809F, 3, 10, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-3.5F, -6.6F, 1.6F);
		setRotationAngle(hair11, 2.9671F, 0.0175F, 0.0524F);
		Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 42, 2, 0.9972F, -4.6289F, -4.1585F, 3, 10, 3, 0.0F));

        ModelRenderer strand1 = new ModelRenderer(this);
		strand1.setRotationPoint(-5.5F, -7.0F, -2.6F);
		setRotationAngle(strand1, -0.4364F, 0.0F, 0.3491F);
		Head.addChild(strand1);
		strand1.cubeList.add(new ModelBox(strand1, 38, 2, 1.9972F, -2.971F, -3.2188F, 2, 5, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
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
