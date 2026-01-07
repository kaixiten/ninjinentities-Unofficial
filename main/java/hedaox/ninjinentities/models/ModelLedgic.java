package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelLedgic extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedHead2;
	private final ModelRenderer HatLayer_r1;
	private final ModelRenderer HatLayer_r2;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer RightArm_r1;
    private float scale = 1.0F;

	public ModelLedgic(float _scale) {
		textureWidth = 64;
		textureHeight = 64;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, -2.0F, 0.0F);


		bipedHead2 = new ModelRenderer(this);
		bipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(bipedHead2);
		bipedHead2.cubeList.add(new ModelBox(bipedHead2, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(-1.0F, -4.75F, 1.0F);
		bipedHead2.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, 0.0F, 0.0F, 0.1309F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 24, 28, -6.0F, -3.0F, -5.0F, 4, 4, 8, -0.01F));

		HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(1.0F, -4.75F, 1.0F);
		bipedHead2.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, 0.0F, 0.0F, -0.1309F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 24, 16, 2.0F, -3.0F, -5.0F, 4, 4, 8, -0.01F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, -2.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 16, 40, -2.0F, 0.0F, -2.0F, 4, 14, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 14, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 46, 40, -1.0F, -2.0F, -2.0F, 3, 13, 4, 0.0F));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(0.0F, 8.0F, 2.0F);
		bipedLeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.1745F, 0.0F, 0.0F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 32, 0, -1.0F, -1.0F, 0.0F, 3, 7, 0, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 32, 40, -2.0F, -2.0F, -2.0F, 3, 13, 4, 0.0F));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(0.0F, 8.0F, 2.0F);
		bipedRightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.1745F, 0.0F, 0.0F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 32, 7, -2.0F, -1.0F, 0.0F, 3, 7, 0, 0.0F));
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
