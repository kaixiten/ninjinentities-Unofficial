package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Modelpikkon extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Hat;
	private final ModelRenderer Cloth;
	private final ModelRenderer LeftCloth1;
	private final ModelRenderer LeftCloth2;
	private final ModelRenderer LeftCloth3;
	private final ModelRenderer LeftCloth4;
	private final ModelRenderer RightCloth1;
	private final ModelRenderer RightCloth2;
	private final ModelRenderer RightCloth3;
	private final ModelRenderer RightCloth4;
	private final ModelRenderer bipedBody;
	private final ModelRenderer Outfit;
	private final ModelRenderer bipedBody_r1;
	private final ModelRenderer bipedBody_r2;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedBody_r3;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedBody_r4;
    private float scale = 1.0F;

	public Modelpikkon(float _scale) {
		textureWidth = 128;
		textureHeight = 128;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hat = new ModelRenderer(this);
		Hat.setRotationPoint(0.0F, -7.0F, 4.0F);
		bipedHead.addChild(Hat);
		Hat.cubeList.add(new ModelBox(Hat, 0, 16, -4.0F, -5.0F, -8.0F, 8, 7, 8, 0.01F));

		Cloth = new ModelRenderer(this);
		Cloth.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hat.addChild(Cloth);
		setRotationAngle(Cloth, -0.2182F, 0.0F, 0.0F);


		LeftCloth1 = new ModelRenderer(this);
		LeftCloth1.setRotationPoint(1.0F, 0.0F, 0.0F);
		Cloth.addChild(LeftCloth1);
		setRotationAngle(LeftCloth1, 0.3341F, 0.103F, -0.288F);
		LeftCloth1.cubeList.add(new ModelBox(LeftCloth1, 32, 21, -1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F));

		LeftCloth2 = new ModelRenderer(this);
		LeftCloth2.setRotationPoint(0.0F, 5.0F, 1.0F);
		LeftCloth1.addChild(LeftCloth2);
		setRotationAngle(LeftCloth2, 0.3341F, 0.103F, -0.288F);
		LeftCloth2.cubeList.add(new ModelBox(LeftCloth2, 32, 26, -0.851F, -0.6266F, -0.9398F, 2, 5, 0, 0.0F));

		LeftCloth3 = new ModelRenderer(this);
		LeftCloth3.setRotationPoint(0.0F, 4.0F, 0.0F);
		LeftCloth2.addChild(LeftCloth3);
		setRotationAngle(LeftCloth3, -0.3084F, 0.2266F, 0.4279F);
		LeftCloth3.cubeList.add(new ModelBox(LeftCloth3, 36, 21, -0.6194F, 0.0653F, -0.6572F, 2, 5, 0, 0.0F));

		LeftCloth4 = new ModelRenderer(this);
		LeftCloth4.setRotationPoint(0.0F, 5.0F, 0.0F);
		LeftCloth3.addChild(LeftCloth4);
		setRotationAngle(LeftCloth4, -0.3131F, 0.1516F, 0.1724F);
		LeftCloth4.cubeList.add(new ModelBox(LeftCloth4, 40, 45, -0.6194F, 0.0653F, -0.6572F, 2, 5, 0, 0.0F));

		RightCloth1 = new ModelRenderer(this);
		RightCloth1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		Cloth.addChild(RightCloth1);
		setRotationAngle(RightCloth1, 0.3341F, -0.103F, 0.288F);
		RightCloth1.cubeList.add(new ModelBox(RightCloth1, 36, 26, -1.0F, 0.0F, 0.0F, 2, 5, 0, 0.0F));

		RightCloth2 = new ModelRenderer(this);
		RightCloth2.setRotationPoint(0.0F, 5.0F, 1.0F);
		RightCloth1.addChild(RightCloth2);
		setRotationAngle(RightCloth2, 0.3341F, -0.103F, 0.288F);
		RightCloth2.cubeList.add(new ModelBox(RightCloth2, 40, 21, -1.149F, -0.6266F, -0.9398F, 2, 5, 0, 0.0F));

		RightCloth3 = new ModelRenderer(this);
		RightCloth3.setRotationPoint(0.0F, 4.0F, 0.0F);
		RightCloth2.addChild(RightCloth3);
		setRotationAngle(RightCloth3, -0.3084F, -0.2266F, -0.4279F);
		RightCloth3.cubeList.add(new ModelBox(RightCloth3, 40, 26, -1.3806F, 0.0653F, -0.6572F, 2, 5, 0, 0.0F));

		RightCloth4 = new ModelRenderer(this);
		RightCloth4.setRotationPoint(0.0F, 5.0F, 0.0F);
		RightCloth3.addChild(RightCloth4);
		setRotationAngle(RightCloth4, -0.3131F, -0.1516F, -0.1724F);
		RightCloth4.cubeList.add(new ModelBox(RightCloth4, 16, 47, -1.3806F, 0.0653F, -0.6572F, 2, 5, 0, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 31, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		Outfit = new ModelRenderer(this);
		Outfit.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.addChild(Outfit);
		Outfit.cubeList.add(new ModelBox(Outfit, 32, 69, -4.5F, -23.9F, 1.75F, 9, 8, 1, 0.0F));
		Outfit.cubeList.add(new ModelBox(Outfit, 52, 69, -4.5F, -18.9F, -2.25F, 9, 3, 1, 0.0F));
		Outfit.cubeList.add(new ModelBox(Outfit, 32, 14, -4.0F, -14.0F, -2.25F, 8, 2, 5, 0.02F));
		Outfit.cubeList.add(new ModelBox(Outfit, 60, 32, -4.0F, -16.0F, -2.0F, 8, 2, 4, 0.01F));

		bipedBody_r1 = new ModelRenderer(this);
		bipedBody_r1.setRotationPoint(-2.0F, -16.0F, 0.0F);
		Outfit.addChild(bipedBody_r1);
		setRotationAngle(bipedBody_r1, 0.0F, 0.0F, -0.2618F);
		bipedBody_r1.cubeList.add(new ModelBox(bipedBody_r1, 60, 38, -2.5F, -9.0F, -2.25F, 3, 8, 5, 0.02F));

		bipedBody_r2 = new ModelRenderer(this);
		bipedBody_r2.setRotationPoint(2.0F, -16.0F, 0.0F);
		Outfit.addChild(bipedBody_r2);
		setRotationAngle(bipedBody_r2, 0.0F, 0.0F, 0.2618F);
		bipedBody_r2.cubeList.add(new ModelBox(bipedBody_r2, 16, 61, -0.5F, -9.0F, -2.25F, 3, 8, 5, 0.02F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 44, 21, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 53, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 44, 37, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 56, 53, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 24, 45, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 58, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F));

		bipedBody_r3 = new ModelRenderer(this);
		bipedBody_r3.setRotationPoint(1.9F, -0.1F, 0.0F);
		bipedRightLeg.addChild(bipedBody_r3);
		setRotationAngle(bipedBody_r3, 0.0F, 0.0F, 0.0873F);
		bipedBody_r3.cubeList.add(new ModelBox(bipedBody_r3, 24, 31, -4.5F, 0.0F, -2.25F, 5, 9, 5, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 47, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 60, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F));

		bipedBody_r4 = new ModelRenderer(this);
		bipedBody_r4.setRotationPoint(-1.9F, -0.1F, 0.0F);
		bipedLeftLeg.addChild(bipedBody_r4);
		setRotationAngle(bipedBody_r4, 0.0F, 0.0F, -0.0873F);
		bipedBody_r4.cubeList.add(new ModelBox(bipedBody_r4, 32, 0, -0.5F, 0.0F, -2.25F, 5, 9, 5, 0.0F));
	}

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.0399999618530273 + 5.5 / (1.0 + Math.pow(scale / 0.45F, 1.8799999952316284))), 0.0F);
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
