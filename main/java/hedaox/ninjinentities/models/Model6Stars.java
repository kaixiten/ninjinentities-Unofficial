package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Model6Stars extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer HatLayer_r1;
	private final ModelRenderer HatLayer_r2;
	private final ModelRenderer bipedHead2;
	private final ModelRenderer HatLayer_r3;
	private final ModelRenderer HatLayer_r4;
	private final ModelRenderer HatLayer_r5;
	private final ModelRenderer HatLayer_r6;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightArm;
    private float scale = 1.0F;

	public Model6Stars(float _scale) {
		textureWidth = 128;
		textureHeight = 128;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 72, 0, -2.0F, -10.0F, -5.0F, 4, 4, 10, 0.01F));

		HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(-1.0F, -8.0F, 3.0F);
		bipedHead.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, -1.3963F, 0.0F, 0.0F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 32, 13, -1.0F, -2.0F, 0.0F, 4, 4, 9, 0.0F));

		HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(-1.5F, 0.0F, 4.5F);
		bipedHead.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, -0.9163F, 0.0F, 0.0F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 0, 48, 0.0F, -1.0F, 0.0F, 3, 3, 9, 0.0F));

		bipedHead2 = new ModelRenderer(this);
		bipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(bipedHead2);
		bipedHead2.cubeList.add(new ModelBox(bipedHead2, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		HatLayer_r3 = new ModelRenderer(this);
		HatLayer_r3.setRotationPoint(-1.0F, -5.0F, 1.0F);
		bipedHead2.addChild(HatLayer_r3);
		setRotationAngle(HatLayer_r3, 0.0F, 0.0F, 0.1309F);
		HatLayer_r3.cubeList.add(new ModelBox(HatLayer_r3, 24, 44, -6.0F, -3.0F, -5.0F, 4, 4, 8, 0.49F));

		HatLayer_r4 = new ModelRenderer(this);
		HatLayer_r4.setRotationPoint(1.0F, -5.0F, 1.0F);
		bipedHead2.addChild(HatLayer_r4);
		setRotationAngle(HatLayer_r4, 0.0F, 0.0F, -0.1309F);
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 25, 32, 2.0F, -3.0F, -5.0F, 4, 4, 8, 0.49F));

		HatLayer_r5 = new ModelRenderer(this);
		HatLayer_r5.setRotationPoint(-1.8096F, 1.0794F, 3.4602F);
		bipedHead2.addChild(HatLayer_r5);
		setRotationAngle(HatLayer_r5, 0.1745F, -0.2618F, 0.0F);
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 13, 75, -2.0F, 0.0F, 0.0F, 4, 16, 1, 0.5F));

		HatLayer_r6 = new ModelRenderer(this);
		HatLayer_r6.setRotationPoint(1.8096F, 1.0794F, 3.4602F);
		bipedHead2.addChild(HatLayer_r6);
		setRotationAngle(HatLayer_r6, 0.1745F, 0.2618F, 0.0F);
		HatLayer_r6.cubeList.add(new ModelBox(HatLayer_r6, -1, 75, -2.0F, 0.0F, 0.0F, 4, 16, 1, 0.5F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 32, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 50, 42, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 50, 26, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 58, 0, -1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 24, 56, -2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));
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
