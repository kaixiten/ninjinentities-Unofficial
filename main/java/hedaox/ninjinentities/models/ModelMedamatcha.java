package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelMedamatcha extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedHeadChild_2;
	private final ModelRenderer bipedHeadChild_1;
	private final ModelRenderer bipedBody;
	private final ModelRenderer Kilt;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelMedamatcha(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, 0.0F, -4.0F, 8, 8, 8, 0.0F));

		bipedHeadChild_2 = new ModelRenderer(this);
		bipedHeadChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bipedHeadChild_2, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(bipedHeadChild_2);
		bipedHeadChild_2.cubeList.add(new ModelBox(bipedHeadChild_2, 12, 21, 4.0F, 1.0F, -1.0F, 0, 4, 6, 0.0F));

		bipedHeadChild_1 = new ModelRenderer(this);
		bipedHeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bipedHeadChild_1, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(bipedHeadChild_1);
		bipedHeadChild_1.cubeList.add(new ModelBox(bipedHeadChild_1, 28, 30, -4.0F, 1.0F, -1.0F, 0, 4, 6, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 24, 24, -4.2F, 2.6F, -1.8F, 8, 8, 4, 0.0F));

		Kilt = new ModelRenderer(this);
		Kilt.setRotationPoint(3.3F, 13.0F, -3.0F);
		bipedBody.addChild(Kilt);
		Kilt.cubeList.add(new ModelBox(Kilt, 0, 48, -8.0F, -3.0F, 0.8F, 9, 6, 5, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 32, 0, -4.0F, 6.0F, -2.0F, 4, 8, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 12, 35, 8.0F, 6.0F, -2.0F, 4, 8, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 27, -2.0F, 4.0F, -2.0F, 4, 8, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 28, 12, 2.0F, 4.0F, -2.0F, 4, 8, 4, 0.0F));
	}

	@Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        bipedHead.render(f5);
        bipedBody.render(f5);
    }
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float bipedHeadPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netbipedHeadYaw / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = bipedHeadPitch / (180F / (float)Math.PI);

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
        float bipedHeadOffset = MathHelper.sin(animProgress * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
        this.bipedRightArm.rotateAngleX -= (sinCurve * 1.2F + bipedHeadOffset);
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
        this.bipedRightArm.rotateAngleZ = MathHelper.sin(animProgress * 2.1415927F) * -0.4F;
    }
}
