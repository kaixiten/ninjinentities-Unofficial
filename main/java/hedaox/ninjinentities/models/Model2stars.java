package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Model2stars extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bone4;
	private final ModelRenderer head_r1;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedBody_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer bipedBody_r2;
	private final ModelRenderer bipedBody_r3;
	private final ModelRenderer bipedBody_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer bipedBody_r5;
	private final ModelRenderer bipedBody_r6;
	private final ModelRenderer bipedBody_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer bipedBody_r8;
	private final ModelRenderer bipedBody_r9;
	private final ModelRenderer bipedBody_r10;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer RightArm_r4;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bone;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bone2;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer RightLeg_r5;
	private final ModelRenderer RightLeg_r6;
    private float scale = 1.0F;

	public Model2stars(float _scale) {
		textureWidth = 128;
		textureHeight = 128;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);


		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 39, 12, -4.0F, -28.0F, -9.0F, 8, 5, 7, 0.0F));
		bone4.cubeList.add(new ModelBox(bone4, 58, 0, -5.0F, -28.0F, -10.0F, 4, 4, 3, -0.5F));
		bone4.cubeList.add(new ModelBox(bone4, 28, 36, 1.0F, -28.0F, -10.0F, 4, 4, 3, -0.5F));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(head_r1);
		setRotationAngle(head_r1, 0.3054F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 35, 0, -4.0F, -24.0F, -3.0F, 8, 3, 7, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -6.0F, -2.0F, -6.0F, 12, 8, 11, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 36, -5.0F, 6.0F, -4.0F, 10, 5, 8, 0.0F));

		bipedBody_r1 = new ModelRenderer(this);
		bipedBody_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bipedBody_r1);
		setRotationAngle(bipedBody_r1, -0.2618F, 0.0F, 0.0F);
		bipedBody_r1.cubeList.add(new ModelBox(bipedBody_r1, 0, 19, -6.0F, -14.0F, -9.0F, 12, 7, 10, 0.0F));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 50, 60, 4.0F, -31.0F, -1.0F, 2, 6, 2, -0.2F));

		bipedBody_r2 = new ModelRenderer(this);
		bipedBody_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bipedBody_r2);
		setRotationAngle(bipedBody_r2, -1.4835F, 0.0F, 0.0F);
		bipedBody_r2.cubeList.add(new ModelBox(bipedBody_r2, 0, 0, 4.0F, -11.0F, -20.0F, 2, 6, 2, -0.2F));

		bipedBody_r3 = new ModelRenderer(this);
		bipedBody_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bipedBody_r3);
		setRotationAngle(bipedBody_r3, -1.0908F, 0.0F, 0.0F);
		bipedBody_r3.cubeList.add(new ModelBox(bipedBody_r3, 0, 19, 4.0F, -20.0F, -19.0F, 2, 6, 2, -0.2F));

		bipedBody_r4 = new ModelRenderer(this);
		bipedBody_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bipedBody_r4);
		setRotationAngle(bipedBody_r4, -0.6545F, 0.0F, 0.0F);
		bipedBody_r4.cubeList.add(new ModelBox(bipedBody_r4, 0, 36, 4.0F, -28.0F, -14.0F, 2, 6, 2, -0.2F));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 58, 61, -6.0F, -31.0F, -1.0F, 2, 6, 2, -0.2F));
		bone5.cubeList.add(new ModelBox(bone5, 28, 49, -1.0F, -28.0F, 1.0F, 2, 3, 2, -0.2F));

		bipedBody_r5 = new ModelRenderer(this);
		bipedBody_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bipedBody_r5);
		setRotationAngle(bipedBody_r5, -1.4835F, 0.0F, 0.0F);
		bipedBody_r5.cubeList.add(new ModelBox(bipedBody_r5, 0, 61, -6.0F, -11.0F, -20.0F, 2, 6, 2, -0.2F));

		bipedBody_r6 = new ModelRenderer(this);
		bipedBody_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bipedBody_r6);
		setRotationAngle(bipedBody_r6, -1.0908F, 0.0F, 0.0F);
		bipedBody_r6.cubeList.add(new ModelBox(bipedBody_r6, 8, 61, -6.0F, -20.0F, -19.0F, 2, 6, 2, -0.2F));

		bipedBody_r7 = new ModelRenderer(this);
		bipedBody_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bipedBody_r7);
		setRotationAngle(bipedBody_r7, -0.6545F, 0.0F, 0.0F);
		bipedBody_r7.cubeList.add(new ModelBox(bipedBody_r7, 16, 61, -6.0F, -28.0F, -14.0F, 2, 6, 2, -0.2F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 23.6F, 0.0F);
		bipedBody.addChild(bone3);
		setRotationAngle(bone3, -0.0873F, 0.0F, 0.0F);


		bipedBody_r8 = new ModelRenderer(this);
		bipedBody_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bipedBody_r8);
		setRotationAngle(bipedBody_r8, -0.2618F, 0.0F, 0.0F);
		bipedBody_r8.cubeList.add(new ModelBox(bipedBody_r8, 44, 24, -2.25F, -8.0F, 4.25F, 5, 4, 7, 0.0F));

		bipedBody_r9 = new ModelRenderer(this);
		bipedBody_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bipedBody_r9);
		setRotationAngle(bipedBody_r9, -0.7418F, 0.0F, 0.0F);
		bipedBody_r9.cubeList.add(new ModelBox(bipedBody_r9, 36, 36, -4.0F, -10.0F, -5.0F, 8, 5, 7, 0.0F));

		bipedBody_r10 = new ModelRenderer(this);
		bipedBody_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bipedBody_r10);
		setRotationAngle(bipedBody_r10, -0.0873F, 0.0F, 0.0F);
		bipedBody_r10.cubeList.add(new ModelBox(bipedBody_r10, 30, 48, -1.25F, -5.5F, 11.25F, 3, 3, 6, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-6.0F, 2.0F, -1.0F);
		bipedBody.addChild(bipedRightArm);


		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setRotationPoint(1.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(LeftArm2);
		setRotationAngle(LeftArm2, 0.0F, 0.0F, 0.1309F);


		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(-3.0F, 4.0F, 1.0F);
        RightArm_r1.mirror = true;
		LeftArm2.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, -0.3491F, 0.0F, 0.0F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 48, 48, -1.0F, -0.6194F, -1.0866F, 3, 8, 4, -0.25F));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(-1.0F, -1.0F, 1.0F);
        RightArm_r2.mirror = true;
		LeftArm2.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.3927F, 0.0F, 0.0F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 0, 49, -3.0F, -2.0F, -3.0F, 3, 8, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(6.0F, 2.0F, -1.0F);
		bipedBody.addChild(bipedLeftArm);


		RightArm2 = new ModelRenderer(this);
		RightArm2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(RightArm2);
		setRotationAngle(RightArm2, 0.0F, 0.0F, -0.1309F);


		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setRotationPoint(3.0F, 4.0F, 1.0F);
		RightArm2.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, -0.3491F, 0.0F, 0.0F);
		RightArm_r3.cubeList.add(new ModelBox(RightArm_r3, 48, 48, -2.0F, -0.6194F, -1.0866F, 3, 8, 4, -0.25F));

		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setRotationPoint(1.0F, -1.0F, 1.0F);
		RightArm2.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, 0.3927F, 0.0F, 0.0F);
		RightArm_r4.cubeList.add(new ModelBox(RightArm_r4, 0, 49, 0.0F, -2.0F, -3.0F, 3, 8, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-4.9F, 16.0F, -2.0F);
		bipedBody.addChild(bipedRightLeg);
		setRotationAngle(bipedRightLeg, -0.3354F, 0.2823F, 0.0159F);


		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.9F, 7.6187F, 0.8966F);
		bipedRightLeg.addChild(bone);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);


		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.2616F, 0.0113F, -0.0421F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 58, 56, -3.9F, -0.65F, -2.5F, 3, 1, 4, 0.0F));

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.4363F, 0.0F, 0.0F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 62, 10, -3.4F, -4.0F, -0.5F, 2, 4, 2, 0.0F));

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.3927F, 0.0F, 0.0F);
		RightLeg_r3.cubeList.add(new ModelBox(RightLeg_r3, 59, 35, -3.9F, -7.0F, -5.0F, 3, 5, 3, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(4.9F, 16.0F, -2.0F);
		bipedBody.addChild(bipedLeftLeg);
		setRotationAngle(bipedLeftLeg, -0.3354F, -0.2823F, -0.0159F);


		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.9F, 7.6187F, 0.8966F);
		bipedLeftLeg.addChild(bone2);
		setRotationAngle(bone2, 0.1309F, 0.0F, 0.0F);


		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.2616F, -0.0113F, 0.0421F);
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 34, 24, 0.9F, -0.65F, -2.5F, 3, 1, 4, 0.0F));

		RightLeg_r5 = new ModelRenderer(this);
		RightLeg_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(RightLeg_r5);
		setRotationAngle(RightLeg_r5, 0.4363F, 0.0F, 0.0F);
		RightLeg_r5.cubeList.add(new ModelBox(RightLeg_r5, 61, 24, 1.4F, -4.0F, -0.5F, 2, 4, 2, 0.0F));

		RightLeg_r6 = new ModelRenderer(this);
		RightLeg_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(RightLeg_r6);
		setRotationAngle(RightLeg_r6, -0.3927F, 0.0F, 0.0F);
		RightLeg_r6.cubeList.add(new ModelBox(RightLeg_r6, 38, 57, 0.9F, -7.0F, -5.0F, 3, 5, 3, 0.0F));
	}

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
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
