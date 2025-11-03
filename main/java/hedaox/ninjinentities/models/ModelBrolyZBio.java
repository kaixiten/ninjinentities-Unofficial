package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBrolyZBio extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelBrolyZBio(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair_1 = new ModelRenderer(this);
		hair_1.setRotationPoint(-4.0F, -11.0F, 0.0F);
		setRotationAngle(hair_1, -0.7854F, 0.0F, 1.6581F);
		Head.addChild(hair_1);

        ModelRenderer hair_18 = new ModelRenderer(this);
		hair_18.setRotationPoint(0.0F, -5.0F, -2.5F);
		setRotationAngle(hair_18, -0.3491F, -0.1745F, -0.7854F);
		Head.addChild(hair_18);

        ModelRenderer hair_3 = new ModelRenderer(this);
		hair_3.setRotationPoint(3.0F, -7.0F, 2.0F);
		setRotationAngle(hair_3, -0.5236F, 0.0873F, 0.2618F);
		Head.addChild(hair_3);

        ModelRenderer hair_19 = new ModelRenderer(this);
		hair_19.setRotationPoint(-5.0F, -10.0F, -2.5F);
		setRotationAngle(hair_19, -0.3491F, -0.1745F, 0.6981F);
		Head.addChild(hair_19);

        ModelRenderer hair_2 = new ModelRenderer(this);
		hair_2.setRotationPoint(4.0F, -11.0F, -1.0F);
		setRotationAngle(hair_2, -0.6981F, 0.2618F, -1.9199F);
		Head.addChild(hair_2);

        ModelRenderer hair_16 = new ModelRenderer(this);
		hair_16.setRotationPoint(0.5F, 0.8F, 7.4F);
		setRotationAngle(hair_16, 0.3491F, 0.0F, -0.5236F);
		Head.addChild(hair_16);
		hair_16.cubeList.add(new ModelBox(hair_16, 40, 3, 1.9972F, -6.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair_12 = new ModelRenderer(this);
		hair_12.setRotationPoint(7.5F, -8.2F, 2.4F);
		setRotationAngle(hair_12, -0.2618F, -0.2618F, 2.8798F);
		Head.addChild(hair_12);
		hair_12.cubeList.add(new ModelBox(hair_12, 40, 3, 3.4302F, -6.1456F, -4.9624F, 2, 7, 3, 0.0F));

        ModelRenderer hair_17 = new ModelRenderer(this);
		hair_17.setRotationPoint(-2.0F, -8.0F, -2.0F);
		setRotationAngle(hair_17, -0.3491F, -0.0873F, 0.2618F);
		Head.addChild(hair_17);

        ModelRenderer hair_13 = new ModelRenderer(this);
		hair_13.setRotationPoint(-7.5F, -8.2F, 2.4F);
		setRotationAngle(hair_13, -0.2618F, 0.2618F, -2.8798F);
		Head.addChild(hair_13);
		hair_13.cubeList.add(new ModelBox(hair_13, 41, 3, -5.4302F, -6.1456F, -4.9624F, 2, 7, 3, 0.0F));

        ModelRenderer hair_9 = new ModelRenderer(this);
		hair_9.setRotationPoint(-4.0F, -7.0F, 2.0F);
		setRotationAngle(hair_9, 2.7925F, -0.0873F, -1.2217F);
		Head.addChild(hair_9);

        ModelRenderer hair_14 = new ModelRenderer(this);
		hair_14.setRotationPoint(3.5F, -3.2F, 7.4F);
		setRotationAngle(hair_14, 0.3491F, 0.0F, 0.0F);
		Head.addChild(hair_14);
		hair_14.cubeList.add(new ModelBox(hair_14, 40, 2, -4.9972F, -4.7495F, -4.8426F, 3, 9, 3, 0.0F));

        ModelRenderer hair_5 = new ModelRenderer(this);
		hair_5.setRotationPoint(2.0F, -7.0F, 1.0F);
		setRotationAngle(hair_5, 2.7925F, -0.0873F, 1.4836F);
		Head.addChild(hair_5);

        ModelRenderer hair_8 = new ModelRenderer(this);
		hair_8.setRotationPoint(4.0F, -7.0F, 2.0F);
		setRotationAngle(hair_8, 2.7925F, 0.0873F, 1.2217F);
		Head.addChild(hair_8);

        ModelRenderer hair_6 = new ModelRenderer(this);
		hair_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair_6, -0.3491F, 0.0F, 0.5236F);
		Head.addChild(hair_6);

        ModelRenderer hair_7 = new ModelRenderer(this);
		hair_7.setRotationPoint(1.0F, -10.0F, 4.0F);
		setRotationAngle(hair_7, -0.3491F, 0.0F, -0.5236F);
		Head.addChild(hair_7);

        ModelRenderer hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, -11.0F, 1.0F);
		setRotationAngle(hair, 0.5236F, 0.4363F, 0.6109F);
		Head.addChild(hair);

        ModelRenderer hair_10 = new ModelRenderer(this);
		hair_10.setRotationPoint(-3.0F, -5.0F, 1.0F);
		setRotationAngle(hair_10, -2.3562F, -0.5236F, 0.0F);
		Head.addChild(hair_10);
		hair_10.cubeList.add(new ModelBox(hair_10, 40, 2, 0.9972F, -7.0431F, -2.7443F, 3, 8, 3, 0.0F));
		hair_10.cubeList.add(new ModelBox(hair_10, 41, 2, -0.0028F, -5.8184F, -1.5195F, 3, 8, 3, 0.0F));

        ModelRenderer hair_11 = new ModelRenderer(this);
		hair_11.setRotationPoint(4.0F, -5.0F, 1.0F);
		setRotationAngle(hair_11, -2.5307F, 0.2618F, 0.0F);
		Head.addChild(hair_11);
		hair_11.cubeList.add(new ModelBox(hair_11, 41, 2, -3.9972F, -7.2672F, -3.0113F, 3, 8, 3, 0.0F));

        ModelRenderer hair_15 = new ModelRenderer(this);
		hair_15.setRotationPoint(-0.5F, 0.8F, 7.4F);
		setRotationAngle(hair_15, 0.3491F, 0.0F, 0.5236F);
		Head.addChild(hair_15);
		hair_15.cubeList.add(new ModelBox(hair_15, 41, 3, -4.9972F, -6.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair_4 = new ModelRenderer(this);
		hair_4.setRotationPoint(-2.0F, -7.0F, 1.0F);
		setRotationAngle(hair_4, 2.7925F, 0.0873F, -1.4836F);
		Head.addChild(hair_4);

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
