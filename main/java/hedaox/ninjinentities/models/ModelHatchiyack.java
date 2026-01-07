package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHatchiyack extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHatchiyack(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -4.0F, -33.0F, -2.0F, 8, 1, 6, 0.0F));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.5F));

        ModelRenderer crown1 = new ModelRenderer(this);
		crown1.setRotationPoint(0.5F, -0.9F, -4.2F);
		setRotationAngle(crown1, -0.6981F, 0.0F, 0.0F);
		bipedHead.addChild(crown1);
		crown1.cubeList.add(new ModelBox(crown1, 42, 19, -4.0F, -10.4088F, -3.8767F, 7, 5, 1, 0.5F));

        ModelRenderer crown2_1 = new ModelRenderer(this);
		crown2_1.setRotationPoint(-1.9F, -0.8F, -1.0F);
		setRotationAngle(crown2_1, 0.0F, 0.0F, 1.3271F);
		bipedHead.addChild(crown2_1);
		crown2_1.cubeList.add(new ModelBox(crown2_1, 0, 26, -5.9409F, -6.4826F, -4.0F, 1, 3, 1, 0.5F));

        ModelRenderer crown2 = new ModelRenderer(this);
		crown2.setRotationPoint(3.5F, -7.5F, -1.0F);
		setRotationAngle(crown2, 0.0F, 0.0F, -1.3273F);
		bipedHead.addChild(crown2);
		crown2.cubeList.add(new ModelBox(crown2, 0, 16, -2.059F, -6.4822F, -4.0F, 1, 3, 1, 0.5F));

        ModelRenderer crowngem = new ModelRenderer(this);
		crowngem.setRotationPoint(3.5F, -0.9F, -4.7F);
		setRotationAngle(crowngem, -0.6894F, 0.0F, 0.0F);
		bipedHead.addChild(crowngem);
		crowngem.cubeList.add(new ModelBox(crowngem, 25, 16, -4.5F, -9.5433F, -5.2721F, 2, 3, 1, 0.3F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -5.0F, 0.0F, -2.0F, 10, 5, 5, 0.0F));

        ModelRenderer bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_1);
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 0, 26, -3.5F, 5.0F, -2.0F, 7, 7, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedRightArm, -0.0231F, 0.0F, 0.0791F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 37, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 24, 0, -9.3553F, -16.7112F, -0.8085F, 1, 3, 2, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		bipedRightArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 26, 25, -5.0F, -2.8398F, -1.9984F, 5, 3, 5, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0231F, 0.0F, -0.0791F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 0, 0.0031F, -2.079F, -1.9982F, 4, 12, 4, 0.0F));

        ModelRenderer bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-5.0F, 22.0F, 0.0F);
		bipedLeftArm.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 8.3522F, -16.6322F, -1.1934F, 1, 3, 2, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 43, 10, 0.0815F, -2.7938F, -2.0021F, 5, 3, 5, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 18, 33, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bipedRightLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 18, 26, -3.0F, -6.0F, -3.0F, 2, 3, 1, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 34, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 24, 26, -3.0F, -6.0F, -3.0F, 2, 3, 1, 0.0F));
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
