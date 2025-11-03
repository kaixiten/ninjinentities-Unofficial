package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKeflaNinjin extends ModelBase {
	private  ModelRenderer Head;
    private  ModelRenderer Body;
	private  ModelRenderer RArm;
	private  ModelRenderer LArm;
	private  ModelRenderer RLeg;
	private  ModelRenderer LLeg;
	private float scale = 1.0F;

    public ModelKeflaNinjin(float _scale, int _form) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;

        ModelRenderer LEarring;
        ModelRenderer REarring;
        ModelRenderer strand2;
        ModelRenderer strand1;
        ModelRenderer hair13;
        ModelRenderer hair12;
        ModelRenderer hair11;
        ModelRenderer hair10;
        ModelRenderer hair9;
        ModelRenderer hair8;
        ModelRenderer hair7;
        ModelRenderer hair6;
        ModelRenderer hair5;
        ModelRenderer hair4;
        ModelRenderer hair3;
        ModelRenderer hair2;
        ModelRenderer hair1;
        if(_form == 0)
		{
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

			hair1 = new ModelRenderer(this);
			hair1.setRotationPoint(-1.0F, -11.0F, 3.0F);
			setRotationAngle(hair1, 0.0F, 0.0F, 0.0873F);
			Head.addChild(hair1);
			hair1.cubeList.add(new ModelBox(hair1, 45, 2, 0.0603F, -4.658F, -3.0F, 3, 8, 3, 0.0F));

			hair2 = new ModelRenderer(this);
			hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
			setRotationAngle(hair2, 0.0F, 0.0F, -0.6981F);
			Head.addChild(hair2);
			hair2.cubeList.add(new ModelBox(hair2, 45, 2, -0.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

			hair3 = new ModelRenderer(this);
			hair3.setRotationPoint(0.0F, -8.0F, 0.0F);
			setRotationAngle(hair3, 0.0F, 0.0F, 0.1745F);
			Head.addChild(hair3);
			hair3.cubeList.add(new ModelBox(hair3, 45, 2, 0.0603F, -4.342F, -3.0F, 3, 7, 3, 0.0F));

			hair4 = new ModelRenderer(this);
			hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
			setRotationAngle(hair4, 0.0F, 0.0873F, 0.2618F);
			Head.addChild(hair4);
			hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));

			hair5 = new ModelRenderer(this);
			hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
			setRotationAngle(hair5, 2.7925F, 0.0873F, -1.3963F);
			Head.addChild(hair5);
			hair5.cubeList.add(new ModelBox(hair5, 45, 2, -0.2474F, -2.6696F, -2.7223F, 3, 6, 3, 0.0F));

			hair6 = new ModelRenderer(this);
			hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
			setRotationAngle(hair6, -0.3491F, 0.0F, -0.4363F);
			Head.addChild(hair6);
			hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

			hair7 = new ModelRenderer(this);
			hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
			setRotationAngle(hair7, -0.3491F, 0.0F, 0.5236F);
			Head.addChild(hair7);
			hair7.cubeList.add(new ModelBox(hair7, 45, 2, 1.8099F, -6.4417F, -5.0982F, 3, 10, 5, 0.0F));

			hair8 = new ModelRenderer(this);
			hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
			setRotationAngle(hair8, 2.7925F, 0.0873F, -0.4363F);
			Head.addChild(hair8);
			hair8.cubeList.add(new ModelBox(hair8, 45, 2, -0.4847F, -3.7367F, -2.7246F, 3, 7, 3, 0.0F));

			hair9 = new ModelRenderer(this);
			hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
			setRotationAngle(hair9, 2.7925F, 0.0873F, 0.5236F);
			Head.addChild(hair9);
			hair9.cubeList.add(new ModelBox(hair9, 45, 2, 0.3618F, -3.6765F, -2.7815F, 3, 7, 3, 0.0F));

			hair10 = new ModelRenderer(this);
			hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
			setRotationAngle(hair10, -0.5236F, 0.3491F, 0.0F);
			Head.addChild(hair10);
			hair10.cubeList.add(new ModelBox(hair10, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			hair11 = new ModelRenderer(this);
			hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
			setRotationAngle(hair11, -0.5236F, -0.2618F, 0.0F);
			Head.addChild(hair11);
			hair11.cubeList.add(new ModelBox(hair11, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			hair12 = new ModelRenderer(this);
			hair12.setRotationPoint(-5.0F, 0.0F, 3.0F);
			setRotationAngle(hair12, -0.5236F, -0.2618F, -0.7854F);
			Head.addChild(hair12);
			hair12.cubeList.add(new ModelBox(hair12, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 2, 0.0F));

			hair13 = new ModelRenderer(this);
			hair13.setRotationPoint(1.0F, -6.0F, 3.0F);
			setRotationAngle(hair13, -0.2618F, -0.2618F, 0.7854F);
			Head.addChild(hair13);
			hair13.cubeList.add(new ModelBox(hair13, 38, 2, 0.9972F, -5.6289F, -4.1585F, 2, 7, 2, 0.0F));

			strand1 = new ModelRenderer(this);
			strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
			setRotationAngle(strand1, -0.3491F, 0.0F, 0.7854F);
			Head.addChild(strand1);
			strand1.cubeList.add(new ModelBox(strand1, 38, 2, 0.583F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			strand2 = new ModelRenderer(this);
			strand2.setRotationPoint(1.0F, -5.0F, -2.0F);
			setRotationAngle(strand2, -0.3491F, 0.0F, -0.7854F);
			Head.addChild(strand2);
			strand2.cubeList.add(new ModelBox(strand2, 38, 2, 1.9972F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			REarring = new ModelRenderer(this);
			REarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(REarring, 0.0F, -0.5236F, 0.0F);
			Head.addChild(REarring);
			REarring.cubeList.add(new ModelBox(REarring, 32, 2, -5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			LEarring = new ModelRenderer(this);
			LEarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			LEarring.mirror = true;
			setRotationAngle(LEarring, 0.0F, 0.5236F, 0.0F);
			Head.addChild(LEarring);
			LEarring.cubeList.add(new ModelBox(LEarring, 32, 2, 5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			Body = new ModelRenderer(this);
			Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
			Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

			RArm = new ModelRenderer(this);
			RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
			Body.addChild(RArm);
			RArm.cubeList.add(new ModelBox(RArm, 41, 16, -3.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

			LArm = new ModelRenderer(this);
			LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
			LArm.mirror = true;
			Body.addChild(LArm);
			LArm.cubeList.add(new ModelBox(LArm, 41, 16, 0.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

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
		else if(_form == 1)
		{
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

			hair1 = new ModelRenderer(this);
			hair1.setRotationPoint(-1.0F, -11.0F, 3.0F);
			setRotationAngle(hair1, 0.0F, 0.0F, 0.2618F);
			Head.addChild(hair1);
			hair1.cubeList.add(new ModelBox(hair1, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

			hair2 = new ModelRenderer(this);
			hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
			setRotationAngle(hair2, 0.0F, 0.0F, -0.2618F);
			Head.addChild(hair2);
			hair2.cubeList.add(new ModelBox(hair2, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

			hair3 = new ModelRenderer(this);
			hair3.setRotationPoint(0.0F, -8.0F, 0.0F);
			setRotationAngle(hair3, 0.0F, 0.0F, 0.1745F);
			Head.addChild(hair3);
			hair3.cubeList.add(new ModelBox(hair3, 45, 2, 0.0603F, -4.342F, -3.0F, 3, 7, 3, 0.0F));

			hair4 = new ModelRenderer(this);
			hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
			setRotationAngle(hair4, 0.0F, 0.0873F, 0.2618F);
			Head.addChild(hair4);
			hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));

			hair5 = new ModelRenderer(this);
			hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
			setRotationAngle(hair5, 2.7925F, 0.0873F, -0.6109F);
			Head.addChild(hair5);
			hair5.cubeList.add(new ModelBox(hair5, 45, 2, -0.2474F, -2.6696F, -2.7223F, 3, 6, 3, 0.0F));

			hair6 = new ModelRenderer(this);
			hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
			setRotationAngle(hair6, -0.3491F, 0.0F, -0.4363F);
			Head.addChild(hair6);
			hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

			hair7 = new ModelRenderer(this);
			hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
			setRotationAngle(hair7, -0.3491F, 0.0F, 0.5236F);
			Head.addChild(hair7);
			hair7.cubeList.add(new ModelBox(hair7, 45, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

			hair8 = new ModelRenderer(this);
			hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
			setRotationAngle(hair8, 2.7925F, 0.0873F, -0.4363F);
			Head.addChild(hair8);
			hair8.cubeList.add(new ModelBox(hair8, 45, 2, -0.4847F, -3.7367F, -2.7246F, 3, 7, 3, 0.0F));

			hair9 = new ModelRenderer(this);
			hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
			setRotationAngle(hair9, 2.7925F, 0.0873F, 0.5236F);
			Head.addChild(hair9);
			hair9.cubeList.add(new ModelBox(hair9, 45, 2, 0.3618F, -3.6765F, -2.7815F, 3, 7, 3, 0.0F));

			hair10 = new ModelRenderer(this);
			hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
			setRotationAngle(hair10, -0.5236F, 0.3491F, 0.0F);
			Head.addChild(hair10);
			hair10.cubeList.add(new ModelBox(hair10, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			hair11 = new ModelRenderer(this);
			hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
			setRotationAngle(hair11, -0.5236F, -0.2618F, 0.0F);
			Head.addChild(hair11);
			hair11.cubeList.add(new ModelBox(hair11, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			hair12 = new ModelRenderer(this);
			hair12.setRotationPoint(-5.0F, 0.0F, 3.0F);
			setRotationAngle(hair12, -0.5236F, -0.2618F, -0.7854F);
			Head.addChild(hair12);
			hair12.cubeList.add(new ModelBox(hair12, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 2, 0.0F));

			hair13 = new ModelRenderer(this);
			hair13.setRotationPoint(1.0F, -6.0F, 3.0F);
			setRotationAngle(hair13, -0.2618F, -0.2618F, 0.7854F);
			Head.addChild(hair13);
			hair13.cubeList.add(new ModelBox(hair13, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 2, 0.0F));

            ModelRenderer hair14 = new ModelRenderer(this);
			hair14.setRotationPoint(1.0F, -6.0F, 3.0F);
			setRotationAngle(hair14, -0.2618F, -0.2618F, 1.3963F);
			Head.addChild(hair14);
			hair14.cubeList.add(new ModelBox(hair14, 38, 2, 2.256F, -4.8789F, -3.2255F, 2, 7, 2, 0.0F));

            ModelRenderer hair15 = new ModelRenderer(this);
			hair15.setRotationPoint(-3.0F, -6.0F, 6.0F);
			setRotationAngle(hair15, 0.4363F, 0.0F, 1.8326F);
			Head.addChild(hair15);
			hair15.cubeList.add(new ModelBox(hair15, 38, 2, 2.256F, -4.8789F, -3.2255F, 2, 7, 2, 0.0F));

			strand1 = new ModelRenderer(this);
			strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
			setRotationAngle(strand1, -0.3491F, 0.0F, 0.7854F);
			Head.addChild(strand1);
			strand1.cubeList.add(new ModelBox(strand1, 38, 2, 0.583F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			strand2 = new ModelRenderer(this);
			strand2.setRotationPoint(1.0F, -5.0F, -2.0F);
			setRotationAngle(strand2, -0.3491F, 0.0F, -0.7854F);
			Head.addChild(strand2);
			strand2.cubeList.add(new ModelBox(strand2, 38, 2, 1.9972F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			REarring = new ModelRenderer(this);
			REarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(REarring, 0.0F, -0.5236F, 0.0F);
			Head.addChild(REarring);
			REarring.cubeList.add(new ModelBox(REarring, 32, 2, -5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			LEarring = new ModelRenderer(this);
			LEarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			LEarring.mirror = true;
			setRotationAngle(LEarring, 0.0F, 0.5236F, 0.0F);
			Head.addChild(LEarring);
			LEarring.cubeList.add(new ModelBox(LEarring, 32, 2, 5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			Body = new ModelRenderer(this);
			Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
			Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

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
