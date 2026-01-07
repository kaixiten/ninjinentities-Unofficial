package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelWings extends ModelBase {
	private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedHead;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelWings(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -6.0F, 0.0F, -3.0F, 12, 12, 6, 0.0F));

        ModelRenderer leftWing = new ModelRenderer(this);
		leftWing.setRotationPoint(2.3F, 2.2F, 0.8F);
		setRotationAngle(leftWing, 0.4098F, -0.0911F, -0.4098F);
		bipedBody.addChild(leftWing);
		leftWing.cubeList.add(new ModelBox(leftWing, 24, 24, 0.091F, 0.3968F, 0.9134F, 1, 16, 11, 0.0F));

        ModelRenderer rightWing = new ModelRenderer(this);
		rightWing.setRotationPoint(-2.3F, 2.2F, 0.8F);
		setRotationAngle(rightWing, 0.4098F, 0.0911F, 0.4098F);
		bipedBody.addChild(rightWing);
		rightWing.mirror = true;
		rightWing.cubeList.add(new ModelBox(rightWing, 24, 24, -1.091F, 0.3968F, 0.9134F, 1, 16, 11, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedRightArm, -0.0086F, 0.0F, 0.0873F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 58, 32, -5.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		bipedRightArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 0, 106, -6.0F, -3.0F, -2.0F, 7, 4, 6, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0086F, 0.0F, -0.0873F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 22, 51, 1.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.mirror = true;
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 95, -1.0F, -3.0F, -2.0F, 7, 4, 6, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 45, -3.0F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 42, 45, -1.9F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 37, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));

        ModelRenderer headChild_2 = new ModelRenderer(this);
		headChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_2, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(headChild_2);

        ModelRenderer headChild_3 = new ModelRenderer(this);
		headChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_3, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(headChild_3);
		headChild_3.cubeList.add(new ModelBox(headChild_3, 117, 49, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer headChild_1 = new ModelRenderer(this);
		headChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_1, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(headChild_1);
		headChild_1.cubeList.add(new ModelBox(headChild_1, 117, 62, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 1.0F, -1.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bipedHead.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -8.0F, -6.0F, 1, 1, 2, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.0F, -8.0F, -6.0F, 1, 1, 2, 0.0F));
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
