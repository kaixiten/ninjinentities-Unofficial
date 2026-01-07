package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Model5Stars extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Line_r1;
	private final ModelRenderer Line_r2;
	private final ModelRenderer bipedBody;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail2;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

    public Model5Stars(float _scale) {
        textureWidth = 64;
        textureHeight = 64;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 7.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 40, 34, -0.5F, -6.0F, -2.5F, 1, 2, 5, 0.01F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 40, 41, -0.5F, -8.0F, -0.5F, 1, 2, 3, 0.01F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 31, -2.5F, -5.0F, -2.5F, 5, 5, 5, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 41, -2.0F, -2.0F, -5.5F, 4, 2, 3, 0.0F));

		Line_r1 = new ModelRenderer(this);
		Line_r1.setRotationPoint(-2.5F, -4.0F, -1.5F);
        Line_r1.mirror = true;
		bipedHead.addChild(Line_r1);
		setRotationAngle(Line_r1, -0.2618F, -0.48F, 0.0F);
		Line_r1.cubeList.add(new ModelBox(Line_r1, 0, 41, 0.0F, -5.0F, -1.0F, 0, 5, 5, 0.0F));

		Line_r2 = new ModelRenderer(this);
		Line_r2.setRotationPoint(2.5F, -4.0F, -1.5F);
		bipedHead.addChild(Line_r2);
		setRotationAngle(Line_r2, -0.2618F, 0.48F, 0.0F);
		Line_r2.cubeList.add(new ModelBox(Line_r2, 0, 41, 0.0F, -5.0F, -1.0F, 0, 5, 5, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 18, -4.0F, 7.0F, -3.0F, 8, 7, 6, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 14.0F, -4.0F, 8, 9, 9, 0.0F));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 21.0F, 5.0F);
		bipedBody.addChild(Tail);
		setRotationAngle(Tail, -0.3054F, 0.0F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 36, 1, -1.5F, -2.0F, -1.0F, 3, 3, 4, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(-1.0F, -0.75F, 6.0F);
		Tail.addChild(Tail2);
		setRotationAngle(Tail2, 0.3927F, 0.0F, 0.0F);
		Tail2.cubeList.add(new ModelBox(Tail2, 35, 9, 0.0F, -2.0F, -4.0F, 2, 2, 5, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 11.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 20, 34, -1.0F, -2.0F, -1.5F, 2, 10, 3, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 11.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 30, 34, -1.0F, -2.0F, -1.5F, 2, 10, 3, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 23.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 28, 18, -4.0F, 0.0F, -5.0F, 5, 1, 7, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 23.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 28, 26, -1.0F, 0.0F, -5.0F, 5, 1, 7, 0.0F));
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
