package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBbssj2 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer hj;

	private float scale = 1.0F;

	public ModelBbssj2(float _scale) {
		this.textureWidth = 128;
		this.textureHeight = 64;

		scale = _scale;

		this.Head = new ModelRenderer(this);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		this.setRotationAngle(hair1, -0.0873F, 0.0F, -0.1745F);
		this.Head.addChild(hair1);

		hair1.cubeList.add(new ModelBox(hair1, 42, 2, -0.5133F, -5.474F, -2.0714F, 4, 8, 4, 0.0F));
		ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
		this.setRotationAngle(hair2, 0.0F, 0.0F, 0.2618F);
		this.Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 45, 2, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

		ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		this.setRotationAngle(hair3, 0.0F, 0.0F, -0.0873F);
		this.Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 45, 2, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

		ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		this.setRotationAngle(hair4, 0.0F, 0.0873F, 0.2618F);
		this.Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));
		ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
		this.setRotationAngle(hair5, 2.7925F, 0.0873F, -0.6109F);
		this.Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 8, 3, 0.0F));
		ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		this.setRotationAngle(hair6, -0.3491F, 0.0F, -0.4363F);
		this.Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));
		ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		this.setRotationAngle(hair7, -0.3491F, 0.0F, 0.5236F);
		this.Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 45, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));
		ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
		this.setRotationAngle(hair8, 2.7925F, 0.0873F, -0.4363F);
		this.Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));
		ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		this.setRotationAngle(hair9, 2.7925F, 0.0873F, 0.5236F);
		this.Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));
		ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
		this.setRotationAngle(hair10, -0.5236F, 0.3491F, 0.0F);
		this.Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
		ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
		this.setRotationAngle(hair11, -0.5236F, -0.2618F, 0.0F);
		this.Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
		ModelRenderer hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-3.0F, -2.0F, 3.0F);
		this.setRotationAngle(hair12, -0.5236F, -0.2618F, 0.0F);
		this.Head.addChild(hair12);
		hair12.cubeList.add(new ModelBox(hair12, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
		ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(-2.0F, -3.0F, 2.0F);
		this.setRotationAngle(hair13, -0.5236F, -0.2618F, 0.0F);
		this.Head.addChild(hair13);
		hair13.cubeList.add(new ModelBox(hair13, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
		ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(-5.0F, -2.0F, 3.0F);
		this.setRotationAngle(hair14, -0.5236F, -0.2618F, 0.0F);
		this.Head.addChild(hair14);
		hair14.cubeList.add(new ModelBox(hair14, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
		ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(-6.0F, -3.0F, 2.0F);
		this.setRotationAngle(hair15, -0.5236F, -0.2618F, 0.0F);
		this.Head.addChild(hair15);
		hair15.cubeList.add(new ModelBox(hair15, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
		this.Body = new ModelRenderer(this);
		this.Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));
		this.RArm = new ModelRenderer(this);
		this.RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		this.Body.addChild(this.RArm);
		this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		this.LArm = new ModelRenderer(this);
		this.LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		this.LArm.mirror = true;
		this.Body.addChild(this.LArm);
		this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		this.RLeg = new ModelRenderer(this);
		this.RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		this.Body.addChild(this.RLeg);
		this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		ModelRenderer belt = new ModelRenderer(this);
		belt.setRotationPoint(-0.8F, -1.6F, -2.2F);
		this.setRotationAngle(belt, -0.0698F, 0.0873F, 0.0F);
		this.RLeg.addChild(belt);
		belt.cubeList.add(new ModelBox(belt, 56, 20, -1.2857F, -1.145F, -0.1004F, 2, 8, 0, 0.0F));
		ModelRenderer belt2 = new ModelRenderer(this);
		belt2.setRotationPoint(-0.8F, -1.6F, -2.2F);
		this.setRotationAngle(belt2, -0.0698F, 1.2217F, 0.0F);
		this.RLeg.addChild(belt2);
		belt2.cubeList.add(new ModelBox(belt2, 56, 20, -2.2857F, -1.145F, -1.1004F, 2, 8, 0, 0.0F));
		this.LLeg = new ModelRenderer(this);
		this.LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		this.LLeg.mirror = true;
		this.Body.addChild(this.LLeg);
		this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		this.hj = new ModelRenderer(this);
		this.hj.setRotationPoint(0.0F, -0.5F, 0.0F);
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 26, 6.0F, -0.5F, 2.0F, 1, 3, 1, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 26, 4.0F, -0.5F, -3.0F, 3, 3, 1, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 26, -7.0F, -0.5F, 2.0F, 1, 3, 1, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 26, -5.0F, -0.5F, 2.0F, 10, 5, 2, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 26, -7.0F, -0.5F, -3.0F, 3, 3, 1, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 25, -7.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 25, 4.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 19, -6.0F, -1.0F, -3.5F, 1, 4, 7, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 19, 5.0F, -1.0F, -3.5F, 1, 4, 7, 0.0F));
		this.hj.cubeList.add(new ModelBox(this.hj, 79, 28, -5.0F, -2.0F, 4.0F, 10, 3, 1, 0.0F));

		ModelRenderer bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-6.5F, -5.02F, 3.5F);
		this.hj.addChild(bone22);
		this.setRotationAngle(bone22, -1.0036F, -0.0436F, -0.1745F);
		bone22.cubeList.add(new ModelBox(bone22, 83, 12, -0.28F, -4.48F, -0.9F, 1, 5, 2, 0.0F));

		ModelRenderer bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(6.5F, -5.0F, 3.5F);
		this.hj.addChild(bone23);
		this.setRotationAngle(bone23, -1.0036F, 0.0F, 0.1745F);
		bone23.cubeList.add(new ModelBox(bone23, 83, 12, -0.75F, -4.5F, -0.95F, 1, 5, 2, 0.0F));

		ModelRenderer bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(6.5F, -5.0F, 3.5F);
		this.hj.addChild(bone26);
		this.setRotationAngle(bone26, -1.0036F, 0.0F, 0.1745F);
		bone26.cubeList.add(new ModelBox(bone26, 93, 12, -0.75F, -4.5F, 0.6143F, 1, 4, 1, 0.0F));

		ModelRenderer bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-5.5F, -5.0F, 3.5F);
		this.hj.addChild(bone27);
		this.setRotationAngle(bone27, -1.0036F, -0.0436F, -0.2182F);
		bone27.cubeList.add(new ModelBox(bone27, 93, 12, -1.2F, -4.55F, 0.5F, 1, 4, 1, 0.0F));

		ModelRenderer bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(6.5F, -7.0F, 1.5F);
		this.hj.addChild(bone21);
		this.setRotationAngle(bone21, -0.6545F, 0.0F, 0.1745F);
		bone21.cubeList.add(new ModelBox(bone21, 99, 11, -0.4F, 0.4635F, 1.7358F, 1, 6, 2, 0.0F));

		ModelRenderer bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(6.5F, -7.0F, 2.5F);
		this.hj.addChild(bone25);
		this.setRotationAngle(bone25, -0.6545F, 0.0F, 0.1745F);
		bone25.cubeList.add(new ModelBox(bone25, 93, 11, -0.4F, 0.4635F, 2.7358F, 1, 6, 1, 0.0F));

		ModelRenderer bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-6.5F, -7.0F, 1.5F);
		this.hj.addChild(bone20);
		this.setRotationAngle(bone20, -0.6545F, 0.0F, -0.1745F);
		bone20.cubeList.add(new ModelBox(bone20, 97, 11, -0.6F, 0.4635F, 1.7358F, 1, 6, 2, 0.0F));

		ModelRenderer bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-6.5F, -7.0F, 2.5F);
		this.hj.addChild(bone24);
		this.setRotationAngle(bone24, -0.6545F, 0.0F, -0.1745F);
		bone24.cubeList.add(new ModelBox(bone24, 93, 11, -0.6F, 0.4635F, 2.7358F, 1, 6, 1, 0.0F));
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.hj.render(f5);
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
		this.Head.render(f5);
		this.Body.render(f5);
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
