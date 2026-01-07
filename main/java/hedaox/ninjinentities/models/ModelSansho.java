package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSansho extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSansho(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 2, 0, 4.0F, -1.0F, -4.0F, 0, 7, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -1.0F, -4.0F, 0, 7, 1, 0.0F));

        ModelRenderer headChild_6 = new ModelRenderer(this);
		headChild_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(headChild_6, -0.3491F, 0.0F, 0.6982F);
		bipedHead.addChild(headChild_6);

        ModelRenderer headChild_14 = new ModelRenderer(this);
		headChild_14.setRotationPoint(-6.0F, -7.5F, -0.9F);
		setRotationAngle(headChild_14, -0.3491F, 0.0F, 0.4363F);
		bipedHead.addChild(headChild_14);

        ModelRenderer headChild_3 = new ModelRenderer(this);
		headChild_3.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(headChild_3, 0.0F, 0.0873F, 0.7854F);
		bipedHead.addChild(headChild_3);

        ModelRenderer headChild = new ModelRenderer(this);
		headChild.setRotationPoint(-1.0F, -8.7F, 0.0F);
		setRotationAngle(headChild, -0.0873F, 0.0F, -0.6108F);
		bipedHead.addChild(headChild);

        ModelRenderer headChild_5 = new ModelRenderer(this);
		headChild_5.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(headChild_5, -0.3491F, 0.0F, -0.7854F);
		bipedHead.addChild(headChild_5);

        ModelRenderer headChild_7 = new ModelRenderer(this);
		headChild_7.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(headChild_7, 2.7925F, 0.0873F, -1.309F);
		bipedHead.addChild(headChild_7);

        ModelRenderer headChild_4 = new ModelRenderer(this);
		headChild_4.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(headChild_4, 2.7925F, 0.0873F, -1.1345F);
		bipedHead.addChild(headChild_4);

        ModelRenderer headChild_13 = new ModelRenderer(this);
		headChild_13.setRotationPoint(2.0F, -5.0F, -1.0F);
		setRotationAngle(headChild_13, -0.3491F, 0.0F, -0.4363F);
		bipedHead.addChild(headChild_13);

        ModelRenderer headChild_12 = new ModelRenderer(this);
		headChild_12.setRotationPoint(0.0F, -5.0F, -2.0F);
		setRotationAngle(headChild_12, -0.3491F, 0.0F, -0.4363F);
		bipedHead.addChild(headChild_12);

        ModelRenderer headChild_2 = new ModelRenderer(this);
		headChild_2.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(headChild_2, 0.0F, 0.0F, 0.6981F);
		bipedHead.addChild(headChild_2);

        ModelRenderer headChild_9 = new ModelRenderer(this);
		headChild_9.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(headChild_9, -0.5236F, 0.3491F, 0.0F);
		bipedHead.addChild(headChild_9);

        ModelRenderer headChild_10 = new ModelRenderer(this);
		headChild_10.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(headChild_10, -0.5236F, -0.2618F, 0.0F);
		bipedHead.addChild(headChild_10);

        ModelRenderer headChild_1 = new ModelRenderer(this);
		headChild_1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(headChild_1, 0.0F, 0.0F, -0.6981F);
		bipedHead.addChild(headChild_1);

        ModelRenderer headChild_8 = new ModelRenderer(this);
		headChild_8.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(headChild_8, 2.7925F, 0.0873F, 0.9599F);
		bipedHead.addChild(headChild_8);

        ModelRenderer headChild_11 = new ModelRenderer(this);
		headChild_11.setRotationPoint(-4.0F, -8.0F, -2.0F);
		setRotationAngle(headChild_11, -0.3491F, 0.0F, 0.3491F);
		bipedHead.addChild(headChild_11);

        ModelRenderer headChild_15 = new ModelRenderer(this);
		headChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_15, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(headChild_15);
		headChild_15.cubeList.add(new ModelBox(headChild_15, 12, 26, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer headChild_16 = new ModelRenderer(this);
		headChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_16, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(headChild_16);
		headChild_16.cubeList.add(new ModelBox(headChild_16, 24, 14, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        ModelRenderer cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(cape, 0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 24, 24, -4.2F, -5.0F, 3.0F, 8, 23, 0, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(4.8F, -3.4F, -0.3F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedBody.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, -1.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 24, 4, 4.2745F, -5.4858F, -2.0F, 1, 3, 1, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 16, 1.2895F, -5.7853F, 0.0F, 1, 3, 1, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-5.2F, -3.4F, -0.4F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		bipedBody.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 32, 0, -6.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 4, 0, -5.2795F, -5.5857F, -2.0F, 1, 3, 1, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 4, 4, -2.2945F, -5.8852F, 0.0F, 1, 3, 1, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		setRotationAngle(bipedRightArm, 0.0F, 0.0F, 0.0873F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 40, -3.9128F, -1.0038F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		setRotationAngle(bipedLeftArm, 0.0F, 0.0F, -0.0873F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 12, 44, 7.9128F, -1.0038F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 32, 0, -2.5F, 0.4F, -2.4F, 4, 5, 5, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.0873F);
		bipedRightLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 24, 2, -3.091F, 8.9166F, 0.0F, 2, 1, 1, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 24, 0, -3.2653F, 6.9243F, 0.0F, 2, 1, 1, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 40, 20, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 0, 2.5F, 0.4F, -2.4F, 4, 5, 5, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 12.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.0873F);
		bipedLeftLeg.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 20, 18, 4.0F, -3.0F, 0.0F, 2, 1, 1, 0.0F));

        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, 10.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.0873F);
		bipedLeftLeg.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 20, 16, 4.0F, -3.0F, 0.0F, 2, 1, 1, 0.0F));
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
