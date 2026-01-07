package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelPESSMonster3 extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelPESSMonster3(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -6.0F, 8, 8, 8, 0.0F));

        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 54, -1.0F, -34.0F, -6.0F, 2, 2, 8, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 120, 53, -1.0F, -34.0F, 2.0F, 2, 10, 2, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 64, 0, -5.0F, 0.0F, -2.0F, 10, 5, 5, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -3.5F, 5.0F, -2.0F, 7, 7, 4, 0.0F));

        ModelRenderer bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_1);
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 69, 59, -1.0F, 5.0F, 2.0F, 2, 3, 2, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 120, 57, -1.0F, 0.0F, 3.0F, 2, 5, 2, 0.0F));

        ModelRenderer bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.5236F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_3);
		bodyChild_3.cubeList.add(new ModelBox(bodyChild_3, 32, 48, -2.0F, 15.0F, 2.0F, 4, 4, 12, 0.0F));

        ModelRenderer bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_2, -0.3491F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_2);
		bodyChild_2.cubeList.add(new ModelBox(bodyChild_2, 32, 48, -2.0F, 7.0F, 4.0F, 4, 4, 12, 0.0F));

        ModelRenderer bodyChild = new ModelRenderer(this);
		bodyChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild, -0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild);
		bodyChild.cubeList.add(new ModelBox(bodyChild, 64, 12, -4.5F, 1.0F, -1.9333F, 9, 4, 1, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedRightArm, -0.0231F, 0.0F, 0.0791F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -5.0F, -2.0F, -2.0F, 5, 12, 5, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		bipedRightArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 38, 0, -5.984F, -2.8398F, -1.9984F, 6, 3, 6, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0231F, 0.0F, -0.0791F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 0.0F, -2.0F, -2.0F, 5, 12, 5, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.mirror = true;
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 38, 0, 0.0815F, -2.7938F, -2.0021F, 6, 3, 6, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bipedRightLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -7.0F, -5.0F, 2, 1, 3, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -3.0F, -7.0F, -5.0F, 2, 1, 3, 0.0F));
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
