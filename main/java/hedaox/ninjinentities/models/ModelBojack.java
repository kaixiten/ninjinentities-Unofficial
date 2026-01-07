package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBojack extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelBojack(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 30, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earR, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(earR);
		earR.mirror = true;
		earR.cubeList.add(new ModelBox(earR, 61, 27, -4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earL, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 61, 27, 4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-2.0F, 0.0F, 5.5F);
		setRotationAngle(hair2, 0.2618F, 0.0F, 0.6109F);
		bipedHead.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 0, 18, -3.7208F, -2.448F, -2.2857F, 8, 4, 2, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(2.0F, 0.0F, 5.5F);
		setRotationAngle(hair3, 0.2618F, 0.0F, -0.6109F);
		bipedHead.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 0, 18, -4.2792F, -2.448F, -2.2857F, 8, 4, 2, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(2.0F, -1.0F, 5.5F);
		setRotationAngle(hair8, 0.349F, 0.0F, 0.0F);
		bipedHead.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 0, 16, -6.0F, -3.0F, -2.5F, 8, 7, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(2.0F, 5.0F, 6.5F);
		setRotationAngle(hair9, 0.0873F, 0.0F, 0.0F);
		bipedHead.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 0, 16, -6.0F, -3.0F, -2.5F, 8, 7, 3, 0.0F));

        ModelRenderer hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-2.0F, 0.0F, 6.5F);
		setRotationAngle(hair12, 0.0873F, 0.0F, 0.6109F);
		bipedHead.addChild(hair12);
		hair12.cubeList.add(new ModelBox(hair12, 0, 18, -2.0F, 0.0F, -2.5F, 8, 4, 2, 0.0F));

        ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(2.0F, 0.0F, 6.5F);
		setRotationAngle(hair13, 0.0873F, 0.0F, -0.6109F);
		bipedHead.addChild(hair13);
		hair13.cubeList.add(new ModelBox(hair13, 0, 18, -6.0F, 0.0F, -2.5F, 8, 4, 2, 0.0F));

        ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(2.0F, 5.0F, 7.5F);
		setRotationAngle(hair14, 0.0873F, 0.0F, -0.6109F);
		bipedHead.addChild(hair14);
		hair14.cubeList.add(new ModelBox(hair14, 0, 17, -6.0F, 0.0F, -3.5F, 8, 4, 3, 0.0F));

        ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(-2.0F, 5.0F, 7.5F);
		setRotationAngle(hair15, 0.0873F, 0.0F, 0.6109F);
		bipedHead.addChild(hair15);
		hair15.cubeList.add(new ModelBox(hair15, 0, 17, -2.0F, 0.0F, -3.5F, 8, 4, 3, 0.0F));

        ModelRenderer bandanaStripR = new ModelRenderer(this);
		bandanaStripR.setRotationPoint(0.0F, -4.0F, 4.0F);
		setRotationAngle(bandanaStripR, 0.0F, 0.0F, -0.3491F);
		bipedHead.addChild(bandanaStripR);
		bandanaStripR.cubeList.add(new ModelBox(bandanaStripR, 8, 11, -7.0F, -2.0F, 0.0F, 7, 2, 0, 0.0F));

        ModelRenderer bandanaStripL = new ModelRenderer(this);
		bandanaStripL.setRotationPoint(0.0F, -4.0F, 4.0F);
		setRotationAngle(bandanaStripL, 0.0F, 0.0F, 0.3491F);
		bipedHead.addChild(bandanaStripL);
		bandanaStripL.mirror = true;
		bandanaStripL.cubeList.add(new ModelBox(bandanaStripL, 8, 11, 0.0F, -2.0F, 0.0F, 7, 2, 0, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 40, 0, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(-0.2F, 18.6F, 0.2F);
		bipedBody.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 32, -4.5F, -13.6F, -2.4F, 9, 10, 5, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 54, 54, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 40, 16, -9.0F, -25.0F, -3.0F, 5, 4, 6, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 56, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, 22.0F, 0.0F);
		bipedLeftArm.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 46, 4.0F, -25.0F, -3.0F, 5, 4, 6, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 22, 47, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 38, 47, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
