package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelMedamatcha extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HeadChild_2;
	private final ModelRenderer HeadChild_1;
	private final ModelRenderer Body;
	private final ModelRenderer Kilt;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelMedamatcha(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, 0.0F, -4.0F, 8, 8, 8, 0.0F));

		HeadChild_2 = new ModelRenderer(this);
		HeadChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_2, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_2);
		HeadChild_2.cubeList.add(new ModelBox(HeadChild_2, 12, 21, 4.0F, 1.0F, -1.0F, 0, 4, 6, 0.0F));

		HeadChild_1 = new ModelRenderer(this);
		HeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_1, 0.0F, -0.5236F, 0.0F);
		Head.addChild(HeadChild_1);
		HeadChild_1.cubeList.add(new ModelBox(HeadChild_1, 28, 30, -4.0F, 1.0F, -1.0F, 0, 4, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 24, 24, -4.2F, 2.6F, -1.8F, 8, 8, 4, 0.0F));

		Kilt = new ModelRenderer(this);
		Kilt.setRotationPoint(3.3F, 13.0F, -3.0F);
		Body.addChild(Kilt);
		Kilt.cubeList.add(new ModelBox(Kilt, 0, 48, -8.0F, -3.0F, 0.8F, 9, 6, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 32, 0, -4.0F, 6.0F, -2.0F, 4, 8, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 12, 35, 8.0F, 6.0F, -2.0F, 4, 8, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 27, -2.0F, 4.0F, -2.0F, 4, 8, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 28, 12, 2.0F, 4.0F, -2.0F, 4, 8, 4, 0.0F));
	}

	@Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Head.render(f5);
        Body.render(f5);
    }
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch, float scaleFactor, Entity entity) {
        this.Head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.Head.rotateAngleX = HeadPitch / (180F / (float)Math.PI);

        this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.LArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;

        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.RArm.rotateAngleZ = 0.0F;
        this.LArm.rotateAngleZ = 0.0F;
        this.RLeg.rotateAngleY = 0.0F;
        this.LLeg.rotateAngleY = 0.0F;
        this.RArm.rotateAngleY = 0.0F;

        float animProgress = this.onGround;
        this.Body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(animProgress) * (float)Math.PI * 2.0F) * 0.2F;

        float animCurve = 1.0F - animProgress;
        animCurve *= animCurve;
        animCurve *= animCurve;
        animCurve = 1.0F - animCurve;

        float sinCurve = MathHelper.sin(animCurve * (float)Math.PI);
        float HeadOffset = MathHelper.sin(animProgress * (float)Math.PI) * -(this.Head.rotateAngleX - 0.7F) * 0.75F;
        this.RArm.rotateAngleX -= (sinCurve * 1.2F + HeadOffset);
        this.RArm.rotateAngleY += this.Body.rotateAngleY * 2.0F;
        this.RArm.rotateAngleZ = MathHelper.sin(animProgress * 2.1415927F) * -0.4F;
    }
}
