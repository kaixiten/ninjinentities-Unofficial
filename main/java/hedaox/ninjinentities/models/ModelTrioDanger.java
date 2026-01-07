package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelTrioDanger extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public ModelTrioDanger(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -7.0F, -4.0F, 8, 7, 8, 0.0F));

        ModelRenderer snout = new ModelRenderer(this);
		snout.setRotationPoint(1.0F, -5.0F, -2.0F);
		bipedHead.addChild(snout);
		snout.cubeList.add(new ModelBox(snout, 50, 2, -3.0F, 2.0F, -5.0F, 4, 3, 3, 0.0F));

        ModelRenderer REar = new ModelRenderer(this);
		REar.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(REar, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(REar);
		REar.cubeList.add(new ModelBox(REar, 32, 0, -4.0F, -10.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer LEar = new ModelRenderer(this);
		LEar.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(LEar, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(LEar);
		LEar.cubeList.add(new ModelBox(LEar, 32, 0, 4.0F, -10.0F, -1.0F, 0, 6, 6, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(-3.8F, 5.4F, 3.8F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
		bipedLeftLeg.mirror = true;
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer tail = new ModelRenderer(this);
		tail.setRotationPoint(4.0F, 6.0F, -2.0F);
		setRotationAngle(tail, -0.7854F, 0.0F, 0.0F);
		bipedBody.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 32, 0, -1.7F, -2.4F, -0.8F, 3, 3, 12, 0.0F));
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
