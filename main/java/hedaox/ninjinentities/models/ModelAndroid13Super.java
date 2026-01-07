package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAndroid13Super extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelAndroid13Super(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(hair3, 0.0F, 0.0873F, 0.2618F);
		bipedHead.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 56, 0, 1.0603F, -4.342F, -3.0F, 1, 7, 3, 0.0F));

		ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(hair5, -0.3491F, 0.0F, -0.4363F);
		bipedHead.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 52, 4, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

		ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(hair9, -0.5236F, 0.3491F, 0.0F);
		bipedHead.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 52, 4, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

		ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(hair8, 2.7925F, 0.0873F, 0.5236F);
		bipedHead.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 52, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		ModelRenderer hair = new ModelRenderer(this);
		hair.setRotationPoint(-1.0F, -9.0F, 0.0F);
		setRotationAngle(hair, -0.0873F, 0.0F, -0.1745F);
		bipedHead.addChild(hair);
		hair.cubeList.add(new ModelBox(hair, 48, 0, -0.5133F, -5.474F, -2.0714F, 4, 8, 4, 0.0F));

		ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(hair1, 0.0F, 0.0F, 0.2618F);
		bipedHead.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 52, 0, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

		ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(hair4, 2.7925F, 0.0873F, -0.6109F);
		bipedHead.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 52, 0, -0.0028F, -3.971F, -3.2188F, 3, 8, 3, 0.0F));

		ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair6, -0.3491F, 0.0F, 0.5236F);
		bipedHead.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 48, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

		ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair2, 0.0F, 0.0F, -0.0873F);
		bipedHead.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 52, 0, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

		ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(hair7, 2.7925F, 0.0873F, -0.4363F);
		bipedHead.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 52, 0, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair10, -0.5236F, -0.2618F, 0.0F);
		bipedHead.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 52, 0, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

		ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-3.0F, -7.0F, -1.0F);
		setRotationAngle(hair11, -0.2618F, 0.0F, 0.0F);
		bipedHead.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 56, 2, 1.9972F, -1.971F, -3.2188F, 2, 4, 2, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 32, 0, -5.029F, -2.3146F, -2.0032F, 3, 3, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 0, 9.9969F, -2.5029F, -2.0112F, 3, 3, 4, 0.0F));

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
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scaleX, scaleY, scaleZ);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scaleY/0.45F,1.88F)))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        bipedBody.render(scaleFactor);
        GL11.glPopMatrix();
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netbipedHeadYaw / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = headPitch / (180F / (float)Math.PI);

        this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;

        this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
        this.bipedRightArm.rotateAngleY = 0.0F;

        float animProgress = this.onGround;
        this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(animProgress) * (float)Math.PI * 2.0F) * 0.2F;

        float animCurve = 1.0F - animProgress;
        animCurve *= animCurve;
        animCurve *= animCurve;
        animCurve = 1.0F - animCurve;

        float sinCurve = MathHelper.sin(animCurve * (float)Math.PI);
        float headOffset = MathHelper.sin(animProgress * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
        this.bipedRightArm.rotateAngleX -= (sinCurve * 1.2F + headOffset);
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
        this.bipedRightArm.rotateAngleZ = MathHelper.sin(animProgress * 2.1415927F) * -0.4F;
    }
}
