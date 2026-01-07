package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHatchiyackSuper extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHatchiyackSuper(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer crown1 = new ModelRenderer(this);
		crown1.setRotationPoint(0.5F, -0.9F, -4.2F);
		setRotationAngle(crown1, -0.6981F, 0.0F, 0.0F);
		bipedHead.addChild(crown1);
		crown1.cubeList.add(new ModelBox(crown1, 48, 9, -4.0F, -10.4088F, -3.8767F, 7, 5, 1, 0.5F));

        ModelRenderer crown2_1 = new ModelRenderer(this);
		crown2_1.setRotationPoint(-1.9F, -0.8F, -1.0F);
		setRotationAngle(crown2_1, 0.0F, 0.0F, 1.3271F);
		bipedHead.addChild(crown2_1);
		crown2_1.cubeList.add(new ModelBox(crown2_1, 20, 34, -5.9409F, -6.4826F, -4.0F, 1, 3, 1, 0.5F));

        ModelRenderer crown2 = new ModelRenderer(this);
		crown2.setRotationPoint(3.5F, -7.5F, -1.0F);
		setRotationAngle(crown2, 0.0F, 0.0F, -1.3273F);
		bipedHead.addChild(crown2);
		crown2.cubeList.add(new ModelBox(crown2, 20, 30, -2.059F, -6.4822F, -4.0F, 1, 3, 1, 0.5F));

        ModelRenderer crowngem = new ModelRenderer(this);
		crowngem.setRotationPoint(3.5F, -0.9F, -4.7F);
		setRotationAngle(crowngem, -0.6894F, 0.0F, 0.0F);
		bipedHead.addChild(crowngem);
		crowngem.cubeList.add(new ModelBox(crowngem, 32, 54, -4.5F, -9.5433F, -5.2721F, 2, 3, 1, 0.3F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -5.0F, 0.0F, -2.0F, 10, 5, 5, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 71, -4.0F, 0.0F, -3.0F, 8, 5, 5, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 26, -3.0F, 5.0F, -3.0F, 1, 3, 1, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, 2.0F, 5.0F, -3.0F, 1, 3, 1, 0.0F));

        ModelRenderer bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_1);
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 46, 19, -3.5F, 5.0F, -2.0F, 7, 7, 4, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 55, 38, 3.0F, 8.0F, -2.0F, 1, 2, 4, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 54, 0, -4.0F, 8.0F, -2.0F, 1, 2, 4, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 46, 52, -4.0F, 8.0F, -3.0F, 8, 2, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 24, 4, -3.0F, 10.0F, -3.0F, 6, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 52, 30, -2.0F, 11.0F, -3.0F, 4, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 0, 6, -1.0F, 5.0F, -3.0F, 2, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 12, 43, -1.0F, 1.0F, -4.0F, 2, 3, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 24, 2, -3.0F, 5.0F, 2.0F, 6, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 28, 52, -2.0F, 6.0F, 2.0F, 4, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 20, 26, -2.0F, 11.0F, 2.0F, 4, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 24, 0, -3.0F, 10.0F, 2.0F, 6, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 50, 35, -4.0F, 8.0F, 2.0F, 8, 2, 1, 0.0F));

        ModelRenderer bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.5236F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_3);

        ModelRenderer bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_2, -0.3491F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_2);

        ModelRenderer bodyChild = new ModelRenderer(this);
		bodyChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild, -0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild);

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedRightArm, -0.0231F, 0.0F, 0.0791F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 20, 35, -5.0F, -2.0F, -2.0F, 5, 12, 5, 0.0F));

        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0F, 22.0F, 0.0F);
		bipedRightArm.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 50, 62, -10.3522F, -16.6322F, -0.8067F, 1, 3, 2, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 40, 40, -11.1487F, -17.7562F, -3.0406F, 4, 5, 7, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 52, 32, -10.6683F, -18.6186F, -0.8988F, 1, 1, 2, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 40, 40, -11.3491F, -16.5532F, -0.8048F, 1, 3, 2, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		bipedRightArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 32, 0, -8.0F, -2.8398F, -1.9984F, 8, 3, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 30, 19, -7.0F, -3.595F, -1.0654F, 6, 1, 3, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0231F, 0.0F, -0.0791F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 26, 0.0F, -2.0F, -2.0F, 5, 12, 5, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 59, 4.3491F, 5.4468F, -1.1952F, 1, 3, 3, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 52, 2.0F, 4.1648F, -2.9576F, 4, 5, 6, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 15, 26, 4.6652F, 3.4604F, -1.1031F, 1, 1, 3, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 0, 5.346F, 5.5258F, -1.197F, 1, 3, 3, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, 0.0815F, -2.7938F, -2.0021F, 8, 3, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 35, 35, 1.0F, -3.4169F, -0.9364F, 6, 1, 3, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 43, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 54, 15, -1.0F, 7.0F, -3.0F, 2, 3, 1, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 8, 59, -3.0F, 4.0F, -1.0F, 1, 3, 2, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bipedRightLeg.addChild(bone);

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 16, 52, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 60, 0, -1.0F, 7.0F, -3.0F, 2, 3, 1, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 60, 30, 2.0F, 4.0F, -1.0F, 1, 3, 2, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(bone2);
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
