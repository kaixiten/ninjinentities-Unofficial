package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelParagus extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelParagus(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer scarf = new ModelRenderer(this);
		scarf.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(scarf);
		scarf.cubeList.add(new ModelBox(scarf, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -8.5F, 1.4F);
		setRotationAngle(hair1, -0.0873F, 0.0F, 0.5237F);
		bipedHead.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 52, 32, -0.5133F, -6.474F, -2.0714F, 3, 9, 3, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair2, -0.5236F, -0.2618F, 0.0F);
		bipedHead.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 0, 54, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(hair3, 2.7925F, 0.0873F, -0.2269F);
		bipedHead.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 48, 63, 0.4972F, -3.071F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-5.0F, -8.8F, 4.0F);
		setRotationAngle(hair4, -0.3491F, 0.0F, 0.2618F);
		bipedHead.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 62, 9, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(2.0F, -6.0F, 0.0F);
		setRotationAngle(hair5, 0.0F, 0.0873F, 0.2792F);
		bipedHead.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 62, 0, -0.5666F, -4.6684F, -2.2431F, 3, 6, 3, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair6, -0.3491F, 0.0F, 0.5236F);
		bipedHead.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 52, 52, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(hair7, -0.5236F, 0.3491F, 0.0F);
		bipedHead.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 32, 0, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair8, 0.0F, 0.0F, -0.0873F);
		bipedHead.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 36, 60, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(-5.0F, -8.0F, -2.0F);
		setRotationAngle(hair9, 2.7925F, 0.0873F, -0.0873F);
		bipedHead.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 24, 60, 0.7972F, -2.171F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(hair10, 0.0F, 0.0F, 0.2618F);
		bipedHead.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 12, 60, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(1.4F, -8.0F, 2.0F);
		setRotationAngle(hair11, 2.7925F, 0.0873F, 0.0873F);
		bipedHead.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 52, 43, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 48, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 36, 44, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(1.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, -1.0F, -3.0F, -3.0F, 6, 4, 6, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 20, 44, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 46, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 2.0F, -3.75F);
		setRotationAngle(cape, 0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 0, 32, -5.0F, -1.0F, 6.0F, 10, 22, 0, 0.0F));
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
