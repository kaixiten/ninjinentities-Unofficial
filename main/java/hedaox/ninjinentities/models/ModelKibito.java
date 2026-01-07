package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKibito extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Ear2_r1;
	private final ModelRenderer Ear1_r1;
	private final ModelRenderer hair;
	private final ModelRenderer hair19;
	private final ModelRenderer hair19_r1;
	private final ModelRenderer hair18;
	private final ModelRenderer hair18_r1;
	private final ModelRenderer hair15;
	private final ModelRenderer hair15_r1;
	private final ModelRenderer hair13;
	private final ModelRenderer hair13_r1;
	private final ModelRenderer hair12;
	private final ModelRenderer hair11;
	private final ModelRenderer hair10;
	private final ModelRenderer hair2;
	private final ModelRenderer hair3;
	private final ModelRenderer hair15_r2;
	private final ModelRenderer hair4;
	private final ModelRenderer hair12_r1;
	private final ModelRenderer hair5;
	private final ModelRenderer hair15_r3;
	private final ModelRenderer hair6;
	private final ModelRenderer hair15_r4;
	private final ModelRenderer hair7;
	private final ModelRenderer hair15_r5;
	private final ModelRenderer hair8;
	private final ModelRenderer hair15_r6;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scale = 1.0F;

	public ModelKibito(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.2F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.19F));

		Ear2_r1 = new ModelRenderer(this);
		Ear2_r1.setRotationPoint(2.8F, -1.5F, -2.0F);
		bipedHead.addChild(Ear2_r1);
		Ear2_r1.mirror = true;
		setRotationAngle(Ear2_r1, 0.0F, -0.5236F, 0.0F);
		Ear2_r1.cubeList.add(new ModelBox(Ear2_r1, 25, 3, 0.1F, -4.0F, -0.4F, 5, 5, 0, -0.19F));

		Ear1_r1 = new ModelRenderer(this);
		Ear1_r1.setRotationPoint(-2.8F, -1.5F, -2.0F);
		bipedHead.addChild(Ear1_r1);
		setRotationAngle(Ear1_r1, 0.0F, 0.5236F, 0.0F);
		Ear1_r1.cubeList.add(new ModelBox(Ear1_r1, 25, 3, -5.1F, -4.0F, -0.4F, 5, 5, 0, -0.19F));

		hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, 0.1F, -1.7F);
		bipedHead.addChild(hair);


		hair19 = new ModelRenderer(this);
		hair19.setRotationPoint(-4.0F, -2.0F, 4.0F);
		hair.addChild(hair19);
		setRotationAngle(hair19, -2.9671F, 0.1745F, -0.3491F);


		hair19_r1 = new ModelRenderer(this);
		hair19_r1.setRotationPoint(2.4972F, -7.8289F, -0.6585F);
		hair19.addChild(hair19_r1);
		setRotationAngle(hair19_r1, 0.0F, 0.0F, -0.0873F);
		hair19_r1.cubeList.add(new ModelBox(hair19_r1, 46, 2, -1.5F, -3.0F, -1.5F, 3, 6, 3, -0.1F));

		hair18 = new ModelRenderer(this);
		hair18.setRotationPoint(4.0F, -2.0F, 4.0F);
		hair.addChild(hair18);
		setRotationAngle(hair18, -2.9671F, -0.1745F, 0.5236F);


		hair18_r1 = new ModelRenderer(this);
		hair18_r1.setRotationPoint(-2.4972F, -8.6289F, -0.6585F);
		hair18.addChild(hair18_r1);
		setRotationAngle(hair18_r1, 0.0F, 0.0F, 0.3054F);
		hair18_r1.cubeList.add(new ModelBox(hair18_r1, 46, 2, -1.5F, -3.0F, -1.5F, 3, 6, 3, -0.1F));

		hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(-4.0F, -2.0F, 4.0F);
		hair.addChild(hair15);
		setRotationAngle(hair15, -2.7053F, 0.1745F, -0.5236F);


		hair15_r1 = new ModelRenderer(this);
		hair15_r1.setRotationPoint(6.9972F, -3.4289F, -0.6585F);
		hair15.addChild(hair15_r1);
		setRotationAngle(hair15_r1, -0.192F, 0.0F, -0.1309F);
		hair15_r1.cubeList.add(new ModelBox(hair15_r1, 47, 2, -2.0F, -3.8F, -1.4F, 3, 8, 3, -0.1F));

		hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(-4.0F, -2.0F, 4.0F);
		hair.addChild(hair13);
		setRotationAngle(hair13, 3.1416F, 0.0F, 0.0F);


		hair13_r1 = new ModelRenderer(this);
		hair13_r1.setRotationPoint(3.4972F, -5.2289F, -1.8585F);
		hair13.addChild(hair13_r1);
		setRotationAngle(hair13_r1, 0.0F, 0.0F, -0.0873F);
		hair13_r1.cubeList.add(new ModelBox(hair13_r1, 47, 2, -1.5F, -4.0F, -1.5F, 3, 8, 3, -0.1F));

		hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-4.0F, -2.0F, 4.0F);
		hair.addChild(hair12);
		setRotationAngle(hair12, -2.7053F, 0.0F, 0.0F);
		hair12.cubeList.add(new ModelBox(hair12, 46, 2, 1.9972F, -1.2289F, -3.4585F, 4, 5, 3, -0.1F));

		hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
		hair.addChild(hair11);
		setRotationAngle(hair11, -2.7053F, -0.2618F, 0.0F);
		hair11.cubeList.add(new ModelBox(hair11, 46, 2, 0.9972F, -5.6289F, -1.1585F, 3, 10, 3, -0.1F));

		hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
		hair.addChild(hair10);
		setRotationAngle(hair10, -2.7053F, 0.3491F, 0.0F);
		hair10.cubeList.add(new ModelBox(hair10, 47, 2, 0.9972F, -5.6289F, -0.1585F, 3, 9, 3, -0.1F));

		hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(0.0F, -2.0F, 6.0F);
		hair.addChild(hair2);
		setRotationAngle(hair2, -2.8081F, -0.448F, 0.2633F);
		hair2.cubeList.add(new ModelBox(hair2, 47, 2, -3.9972F, -5.6289F, -0.1585F, 3, 9, 3, -0.1F));

		hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(4.0F, -2.0F, 4.0F);
		hair.addChild(hair3);
		setRotationAngle(hair3, -2.7053F, -0.1745F, 0.5236F);


		hair15_r2 = new ModelRenderer(this);
		hair15_r2.setRotationPoint(-6.9972F, -3.4289F, -0.6585F);
		hair3.addChild(hair15_r2);
		setRotationAngle(hair15_r2, -0.192F, 0.0F, 0.1309F);
		hair15_r2.cubeList.add(new ModelBox(hair15_r2, 47, 2, -1.0F, -3.8F, -1.4F, 3, 8, 3, -0.1F));

		hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-4.0F, -2.0F, 4.0F);
		hair.addChild(hair4);
		setRotationAngle(hair4, -2.7053F, 0.0F, 0.0F);


		hair12_r1 = new ModelRenderer(this);
		hair12_r1.setRotationPoint(3.9972F, -3.0289F, -1.0585F);
		hair4.addChild(hair12_r1);
		setRotationAngle(hair12_r1, -0.1745F, 0.0F, 0.0F);
		hair12_r1.cubeList.add(new ModelBox(hair12_r1, 46, 2, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

		hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(4.5F, -0.8F, 4.0F);
		hair.addChild(hair5);
		setRotationAngle(hair5, -2.7053F, -0.1745F, 0.5236F);


		hair15_r3 = new ModelRenderer(this);
		hair15_r3.setRotationPoint(-6.9972F, -4.6289F, -0.2585F);
		hair5.addChild(hair15_r3);
		setRotationAngle(hair15_r3, -0.192F, 0.0F, 0.1309F);
		hair15_r3.cubeList.add(new ModelBox(hair15_r3, 47, 2, -1.0F, -3.8F, -1.4F, 3, 8, 3, -0.1F));

		hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(4.9F, 1.5F, 4.0F);
		hair.addChild(hair6);
		setRotationAngle(hair6, -2.7053F, -0.1745F, 0.5236F);


		hair15_r4 = new ModelRenderer(this);
		hair15_r4.setRotationPoint(-6.9972F, -4.6289F, -0.2585F);
		hair6.addChild(hair15_r4);
		setRotationAngle(hair15_r4, -0.192F, 0.0F, 0.1309F);
		hair15_r4.cubeList.add(new ModelBox(hair15_r4, 47, 2, -1.0F, -3.8F, -1.4F, 3, 8, 3, -0.1F));

		hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-4.5F, -0.8F, 4.0F);
		hair.addChild(hair7);
		setRotationAngle(hair7, -2.7053F, 0.1745F, -0.5236F);


		hair15_r5 = new ModelRenderer(this);
		hair15_r5.setRotationPoint(6.9972F, -4.6289F, -0.2585F);
		hair7.addChild(hair15_r5);
		setRotationAngle(hair15_r5, -0.192F, 0.0F, -0.1309F);
		hair15_r5.cubeList.add(new ModelBox(hair15_r5, 47, 2, -2.0F, -3.8F, -1.4F, 3, 8, 3, -0.1F));

		hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-4.9F, 1.5F, 4.0F);
		hair.addChild(hair8);
		setRotationAngle(hair8, -2.7053F, 0.1745F, -0.5236F);


		hair15_r6 = new ModelRenderer(this);
		hair15_r6.setRotationPoint(6.9972F, -4.6289F, -0.2585F);
		hair8.addChild(hair15_r6);
		setRotationAngle(hair15_r6, -0.192F, 0.0F, -0.1309F);
		hair15_r6.cubeList.add(new ModelBox(hair15_r6, 47, 2, -2.0F, -3.8F, -1.4F, 3, 8, 3, -0.1F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
		bipedHead.render(f5);
		bipedBody.render(f5);
		GL11.glPopMatrix();
        this.bipedHead.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.bipedRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.bipedRightArm.rotateAngleZ = 0.0F;
		this.bipedLeftArm.rotateAngleZ = 0.0F;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.bipedRightLeg.rotateAngleY = 0.0F;
		this.bipedLeftLeg.rotateAngleY = 0.0F;
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
