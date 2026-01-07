package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAndroid13 extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelAndroid13(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		ModelRenderer visor = new ModelRenderer(this);
		visor.setRotationPoint(-0.1875F, 24.0F, 0.0F);
		bipedHead.addChild(visor);
		visor.cubeList.add(new ModelBox(visor, 0, 0, -3.0F, -30.0F, -6.0F, 6, 1, 2, 0.0F));

		ModelRenderer hat = new ModelRenderer(this);
		hat.setRotationPoint(-0.0875F, 0.0F, 0.75F);
		bipedHead.addChild(hat);
		hat.cubeList.add(new ModelBox(hat, 36, 0, -3.9125F, -9.0F, -4.75F, 8, 4, 8, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(4.0F, 0.0F, 3.375F);
		setRotationAngle(hair1, 0.6109F, 0.1745F, -1.9199F);
		hair1.cubeList.add(new ModelBox(hair1, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-4.0F, 0.0F, 3.375F);
		setRotationAngle(hair2, 0.6109F, -0.1745F, 1.9199F);
		hair2.cubeList.add(new ModelBox(hair2, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-3.0F, 0.0F, 3.375F);
		setRotationAngle(hair3, 0.4363F, -0.4363F, 1.8326F);
		hair3.cubeList.add(new ModelBox(hair3, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(3.0F, 0.0F, 3.375F);
		setRotationAngle(hair4, 0.4363F, 0.4363F, -1.8326F);
		hair4.cubeList.add(new ModelBox(hair4, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(2.0F, 0.0F, 3.375F);
		setRotationAngle(hair5, 0.4363F, 0.1745F, -1.8326F);
		hair5.cubeList.add(new ModelBox(hair5, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-2.0F, 0.0F, 3.375F);
		setRotationAngle(hair6, 0.4363F, -0.1745F, 1.8326F);
		hair6.cubeList.add(new ModelBox(hair6, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, 0.0F, 3.375F);
		setRotationAngle(hair7, 0.4363F, -0.4363F, 1.8326F);
		hair7.cubeList.add(new ModelBox(hair7, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(2.0F, 0.0F, 3.375F);
		setRotationAngle(hair8, 0.4363F, 0.1745F, -1.8326F);
		hair8.cubeList.add(new ModelBox(hair8, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(1.0F, 0.0F, 3.375F);
		setRotationAngle(hair9, 0.4363F, 0.4363F, -1.8326F);
		hair9.cubeList.add(new ModelBox(hair9, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-5.0F, 0.0F, 3.375F);
		setRotationAngle(hair10, 0.4363F, 0.0F, 1.8326F);
		hair10.cubeList.add(new ModelBox(hair10, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(5.0F, 0.0F, 3.375F);
		setRotationAngle(hair11, 0.4363F, 0.0F, -1.8326F);
		hair11.cubeList.add(new ModelBox(hair11, 44, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));
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
