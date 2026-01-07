package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBrolyZSsj extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelBrolyZSsj(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, -11.0F, 1.0F);
		setRotationAngle(hair1, 1.0472F, 1.5708F, 0.5236F);
		bipedHead.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-5.0F, -10.0F, 0.0F);
		setRotationAngle(hair2, -0.7854F, 0.0F, 1.1345F);
		bipedHead.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 45, 2, 1.0603F, -3.658F, -3.0F, 2, 7, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(5.0F, -10.0F, 0.0F);
		setRotationAngle(hair3, -0.7854F, 0.0F, -1.1345F);
		bipedHead.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 45, 2, -3.0603F, -3.658F, -3.0F, 2, 7, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair4, -0.3491F, 0.0F, 0.5236F);
		bipedHead.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.8099F, -3.4417F, -5.0982F, 3, 7, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-2.0F, -7.0F, 1.0F);
		setRotationAngle(hair5, 2.7925F, 0.0873F, -1.5709F);
		bipedHead.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 45, 2, 0.1736F, -2.8054F, -2.4469F, 3, 7, 3, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(2.0F, -7.0F, 1.0F);
		setRotationAngle(hair6, 2.7925F, -0.0873F, 1.7454F);
		bipedHead.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 45, 2, -3.1736F, -2.8054F, -2.4469F, 3, 7, 3, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(0.0F, -11.0F, 1.0F);
		setRotationAngle(hair7, 1.0472F, -1.5708F, -0.5236F);
		bipedHead.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 45, 2, -3.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(1.0F, -10.0F, 4.0F);
		setRotationAngle(hair8, -0.3491F, 0.0F, -0.5236F);
		bipedHead.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 45, 2, -4.8099F, -3.4417F, -5.0982F, 3, 7, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(6.0F, -7.0F, 2.0F);
		setRotationAngle(hair9, 2.7925F, 0.0873F, 2.269F);
		bipedHead.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 45, 2, 2.923F, -0.7204F, -1.944F, 3, 4, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-6.0F, -7.0F, 2.0F);
		setRotationAngle(hair10, 2.7925F, -0.0873F, -2.3562F);
		bipedHead.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 45, 2, -5.923F, -0.7204F, -1.944F, 3, 4, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-3.0F, -5.0F, 1.0F);
		setRotationAngle(hair11, -2.3562F, -0.5236F, 0.0F);
		bipedHead.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 38, 2, 0.9972F, -9.1645F, -0.623F, 3, 8, 3, 0.0F));

        ModelRenderer hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(4.0F, -5.0F, 1.0F);
		setRotationAngle(hair12, -2.5307F, 0.2618F, -0.0873F);
		bipedHead.addChild(hair12);
		hair12.cubeList.add(new ModelBox(hair12, 38, 2, -3.9972F, -8.9054F, -1.8641F, 3, 8, 3, 0.0F));

        ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(7.5F, -6.2F, 4.4F);
		setRotationAngle(hair13, 0.0F, 0.0F, 2.8798F);
		bipedHead.addChild(hair13);
		hair13.cubeList.add(new ModelBox(hair13, 38, 2, 3.689F, -6.3956F, -4.0294F, 2, 7, 3, 0.0F));

        ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(-5.5F, -8.2F, 4.4F);
		setRotationAngle(hair14, -0.0873F, 0.0873F, -2.618F);
		bipedHead.addChild(hair14);
		hair14.cubeList.add(new ModelBox(hair14, 38, 2, -4.9972F, -8.2916F, -5.4173F, 2, 7, 3, 0.0F));

        ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(3.5F, -3.2F, 7.4F);
		setRotationAngle(hair15, 0.3491F, 0.0F, 0.0F);
		bipedHead.addChild(hair15);
		hair15.cubeList.add(new ModelBox(hair15, 38, 2, -4.9972F, -2.8702F, -5.5267F, 3, 9, 3, 0.0F));

        ModelRenderer hair16 = new ModelRenderer(this);
		hair16.setRotationPoint(-0.5F, 0.8F, 7.4F);
		setRotationAngle(hair16, 0.3491F, 0.0F, 0.5236F);
		bipedHead.addChild(hair16);
		hair16.cubeList.add(new ModelBox(hair16, 38, 2, -3.9972F, -5.0013F, -4.751F, 3, 7, 3, 0.0F));

        ModelRenderer hair17 = new ModelRenderer(this);
		hair17.setRotationPoint(0.5F, 0.8F, 7.4F);
		setRotationAngle(hair17, 0.3491F, 0.0F, -0.5236F);
		bipedHead.addChild(hair17);
		hair17.cubeList.add(new ModelBox(hair17, 38, 2, 0.9972F, -5.0013F, -4.751F, 3, 7, 3, 0.0F));

        ModelRenderer strand1 = new ModelRenderer(this);
		strand1.setRotationPoint(0.0F, -5.0F, -2.5F);
		setRotationAngle(strand1, -0.3491F, -0.1745F, -0.7854F);
		bipedHead.addChild(strand1);
		strand1.cubeList.add(new ModelBox(strand1, 38, 2, 1.9972F, -1.6421F, -2.7351F, 2, 5, 2, 0.0F));

        ModelRenderer strand2 = new ModelRenderer(this);
		strand2.setRotationPoint(0.0F, -5.0F, -2.5F);
		setRotationAngle(strand2, -0.3491F, 0.1745F, 0.7854F);
		bipedHead.addChild(strand2);
		strand2.cubeList.add(new ModelBox(strand2, 38, 2, -3.9972F, -1.6421F, -2.7351F, 2, 5, 2, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(-3.8F, 5.4F, 3.8F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

        ModelRenderer kilt = new ModelRenderer(this);
		kilt.setRotationPoint(7.3F, 13.0F, -7.0F);
		bipedBody.addChild(kilt);
		kilt.cubeList.add(new ModelBox(kilt, 63, 16, -8.0F, -10.0F, 0.8F, 9, 10, 5, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer RShoulderArmor = new ModelRenderer(this);
		RShoulderArmor.setRotationPoint(-7.0F, -1.7F, 4.0F);
		setRotationAngle(RShoulderArmor, -1.5708F, 0.0F, 0.1047F);
		bipedRightArm.addChild(RShoulderArmor);

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer LShoulderArmor = new ModelRenderer(this);
		LShoulderArmor.setRotationPoint(7.0F, -1.7F, 4.0F);
		setRotationAngle(LShoulderArmor, -1.5708F, 0.0F, -0.1047F);
		bipedLeftArm.addChild(LShoulderArmor);

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
