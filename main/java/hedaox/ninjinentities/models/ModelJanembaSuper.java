package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelJanembaSuper extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelJanembaSuper(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer earleft = new ModelRenderer(this);
		earleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earleft, 0.0F, -0.7695F, -0.4554F);
		bipedHead.addChild(earleft);
		earleft.cubeList.add(new ModelBox(earleft, 44, 27, 1.6084F, -3.5F, -4.5365F, 6, 3, 0, 0.0F));

        ModelRenderer earright = new ModelRenderer(this);
		earright.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earright, 0.0F, 0.7695F, 0.4554F);
		bipedHead.addChild(earright);
		earright.cubeList.add(new ModelBox(earright, 39, 18, -7.5084F, -3.5F, -4.5365F, 6, 3, 0, 0.0F));

        ModelRenderer hornL1 = new ModelRenderer(this);
		hornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(hornL1, -0.4098F, 0.0948F, 0.403F);
		bipedHead.addChild(hornL1);
		hornL1.cubeList.add(new ModelBox(hornL1, 0, 16, -1.9F, -10.4F, -6.0F, 3, 5, 2, 0.0F));

        ModelRenderer hornL2 = new ModelRenderer(this);
		hornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(hornL2, -0.5918F, 0.182F, 0.4098F);
		bipedHead.addChild(hornL2);
		hornL2.cubeList.add(new ModelBox(hornL2, 0, 0, -1.6F, -12.3F, -7.6F, 2, 4, 2, 0.0F));

        ModelRenderer hornL3 = new ModelRenderer(this);
		hornL3.setRotationPoint(6.1375F, -13.4875F, 2.025F);
		setRotationAngle(hornL3, -0.5084F, 0.2276F, 0.9183F);
		bipedHead.addChild(hornL3);
		hornL3.cubeList.add(new ModelBox(hornL3, 50, 50, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F));

        ModelRenderer hornR1 = new ModelRenderer(this);
		hornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(hornR1, -0.4098F, -0.0948F, -0.403F);
		bipedHead.addChild(hornR1);
		hornR1.cubeList.add(new ModelBox(hornR1, 0, 16, -1.1F, -10.4F, -6.0F, 3, 5, 2, 0.0F));

        ModelRenderer hornR2 = new ModelRenderer(this);
		hornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(hornR2, -0.5918F, -0.182F, -0.4098F);
		bipedHead.addChild(hornR2);
		hornR2.cubeList.add(new ModelBox(hornR2, 0, 0, -0.4F, -12.3F, -7.6F, 2, 4, 2, 0.0F));

        ModelRenderer hornR3 = new ModelRenderer(this);
		hornR3.setRotationPoint(-6.1375F, -13.4875F, 2.025F);
		setRotationAngle(hornR3, -0.5084F, -0.2276F, -0.9183F);
		bipedHead.addChild(hornR3);
		hornR3.cubeList.add(new ModelBox(hornR3, 50, 50, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 24, 26, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

        ModelRenderer tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail, -0.3491F, 0.0F, 0.0F);
		bipedBody.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 0, 16, -2.0F, 7.0F, 3.0F, 3, 3, 11, 0.0F));

        ModelRenderer neckguardleft = new ModelRenderer(this);
		neckguardleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(neckguardleft, 0.0F, 0.0F, 0.5918F);
		bipedBody.addChild(neckguardleft);
		neckguardleft.cubeList.add(new ModelBox(neckguardleft, 44, 16, 3.0F, -4.5F, -3.6F, 2, 4, 7, 0.0F));

        ModelRenderer neckguardright = new ModelRenderer(this);
		neckguardright.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(neckguardright, 0.0F, 0.0F, -0.5918F);
		bipedBody.addChild(neckguardright);
		neckguardright.cubeList.add(new ModelBox(neckguardright, 41, 35, -4.9F, -4.5F, -3.6F, 2, 4, 7, 0.0F));

        ModelRenderer tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(-3.0F, 15.2F, 17.0F);
		setRotationAngle(tail2, 0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(tail2);
		tail2.cubeList.add(new ModelBox(tail2, 23, 7, 1.0F, -4.4717F, -7.8214F, 3, 2, 9, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedRightArm, 0.0F, 0.0F, 0.1F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 28, 42, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0F, 0.0F, -0.1F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 38, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 30, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 12, 42, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
