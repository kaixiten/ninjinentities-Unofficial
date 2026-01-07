package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelPESSMonster1 extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelPESSMonster1(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hornL = new ModelRenderer(this);
		hornL.setRotationPoint(-1.0F, 25.0F, -2.0F);
		setRotationAngle(hornL, 0.0F, 0.0F, 0.1745F);
		bipedHead.addChild(hornL);
		hornL.cubeList.add(new ModelBox(hornL, 0, 0, -1.9848F, -36.8264F, 0.0F, 1, 4, 1, 0.0F));

        ModelRenderer hornR = new ModelRenderer(this);
		hornR.setRotationPoint(1.0F, 25.0F, -2.0F);
		setRotationAngle(hornR, 0.0F, 0.0F, -0.1745F);
		bipedHead.addChild(hornR);
		hornR.mirror = true;
		hornR.cubeList.add(new ModelBox(hornR, 0, 0, 0.9848F, -36.8264F, 0.0F, 1, 4, 1, 0.0F));

        ModelRenderer hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, 1.0F, 7.0F);
		setRotationAngle(hair, 0.3491F, 0.0F, 0.0F);
		bipedHead.addChild(hair);

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, -2.0F, -1.0F);
		hair.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 108, 19, -4.0F, -4.786F, -0.76F, 8, 11, 2, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-3.0625F, -0.6875F, -1.0F);
		setRotationAngle(hair2, 0.0F, 0.0F, 0.5236F);
		hair.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 114, 24, -4.0F, -4.786F, -0.76F, 5, 5, 2, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(3.0625F, -0.6875F, -1.0F);
		setRotationAngle(hair3, 0.0F, 0.0F, -0.5236F);
		hair.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 114, 23, -1.0F, -4.786F, -0.76F, 5, 5, 2, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-1.75F, -3.25F, -1.0F);
		setRotationAngle(hair4, 0.0F, 0.0F, -1.9199F);
		hair.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 104, 27, -9.1875F, -4.8447F, -0.76F, 10, 5, 2, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(1.75F, -3.25F, -1.0F);
		setRotationAngle(hair5, 0.0F, 0.0F, 1.9199F);
		hair.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 104, 26, -0.9786F, -4.8447F, -0.76F, 10, 5, 2, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(0.0F, -2.342F, -0.9397F);
		setRotationAngle(hair6, 0.1745F, 0.0F, 0.0F);
		hair.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 114, 21, -3.0F, -4.0F, 0.0F, 6, 11, 1, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(0.0F, -6.5924F, -0.9224F);
		setRotationAngle(hair7, 0.1745F, 0.0F, 0.0F);
		hair.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 110, 26, -4.0F, -1.0F, 0.0F, 8, 8, 1, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 64, 0, -5.0F, 0.0F, -2.0F, 10, 5, 5, 0.0F));

        ModelRenderer bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(bodyChild_1);
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 16, 16, -3.5F, 5.0F, -2.0F, 7, 7, 4, 0.0F));

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
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 5, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0231F, 0.0F, -0.0791F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 5, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedLeftArm.addChild(leftarmshoulder);

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
