package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNicky extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNicky(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 86, -4.0F, -10.0F, -4.0F, 8, 10, 8, 0.5F));

        ModelRenderer headChild_15 = new ModelRenderer(this);
		headChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_15, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(headChild_15);
		headChild_15.cubeList.add(new ModelBox(headChild_15, 12, 39, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer headChild_16 = new ModelRenderer(this);
		headChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_16, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(headChild_16);
		headChild_16.cubeList.add(new ModelBox(headChild_16, 32, 16, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, -8.0F, -4.0F);
		setRotationAngle(hair1, -0.1745F, 0.0F, 0.0F);
		bipedHead.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 51, 83, -3.0F, -4.0F, 0.0F, 6, 4, 8, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-2.6875F, -7.0F, -4.0F);
		setRotationAngle(hair2, -0.1745F, 0.0F, -0.733F);
		bipedHead.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 51, 83, -2.0F, -3.0F, 0.0F, 5, 3, 8, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(2.6875F, -7.0F, -4.0F);
		setRotationAngle(hair3, -0.1745F, 0.0F, 0.733F);
		bipedHead.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 51, 83, -3.0F, -3.0F, 0.0F, 5, 3, 8, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 29, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 27, 27, -4.7F, -6.0F, -2.2F, 9, 11, 5, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 27, 11, -4.7F, 4.6875F, -2.2F, 9, 5, 5, 0.0F));

        ModelRenderer bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(bone4);

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 16, 53, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 44, 44, -4.7512F, 0.8794F, -2.4F, 5, 8, 5, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-1.0F, 0.0F, -0.6F);
		bipedRightArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 18, 43, -6.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 3, 3, -5.2795F, -5.5857F, -2.0F, 1, 3, 1, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 0, 0, -2.2945F, -5.8852F, 0.0F, 1, 3, 1, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 55, 6, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(9.0F, 0.0F, -0.5F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 32, 0, -1.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 4, 16, 4.2745F, -5.4858F, -2.0F, 1, 3, 1, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 16, 1.2895F, -5.7853F, 0.0F, 1, 3, 1, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 45, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0F, 0.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.2618F);
		bipedRightLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, 6.2805F, -1.0F, 2, 1, 1, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 53, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, 1.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.1745F);
		bipedLeftLeg.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, 6.0F, 6.0F, -1.0F, 3, 1, 1, 0.0F));
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
