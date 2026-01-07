package hedaox.ninjinentities.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGomahThirdEye extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hat;
	private final ModelRenderer HatHornRight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer HatHornLeft;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Ears;
	private final ModelRenderer EarRight_r1;
	private final ModelRenderer EarLeft_r1;
	private final ModelRenderer Body;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public ModelGomahThirdEye(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

        scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -10.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -5.0F, -8.0F, -4.0F, 10, 8, 8, 0.0F));

		Hat = new ModelRenderer(this);
		Hat.setRotationPoint(0.0F, -7.0F, 0.0F);
		Head.addChild(Hat);


		HatHornRight = new ModelRenderer(this);
		HatHornRight.setRotationPoint(0.0F, 1.0F, 0.0F);
		Hat.addChild(HatHornRight);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.95F, -4.5F, 0.0F);
		HatHornRight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0472F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 0, -1.0F, -2.0F, -2.0F, 2, 2, 4, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.0F, -3.05F, 0.0F);
		HatHornRight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 0, -1.5F, -2.0F, -3.0F, 3, 2, 6, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.0F, 0.5F, 0.0F);
		HatHornRight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.5236F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 0, -2.0F, -4.5F, -4.0F, 4, 4, 8, -0.025F));

		HatHornLeft = new ModelRenderer(this);
		HatHornLeft.setRotationPoint(-8.0F, 1.0F, 0.0F);
		Hat.addChild(HatHornLeft);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.9F, -4.4F, 0.0F);
		HatHornLeft.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.0472F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 0, -1.0F, -2.0F, -2.0F, 2, 2, 4, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.0F, -3.05F, 0.0F);
		HatHornLeft.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 0, -1.5F, -2.0F, -3.0F, 3, 2, 6, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(5.0F, 0.5F, 0.0F);
		HatHornLeft.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.5236F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 0, -2.0F, -4.5F, -4.0F, 4, 4, 8, -0.025F));

		Ears = new ModelRenderer(this);
		Ears.setRotationPoint(0.0F, -7.0F, 0.0F);
		Head.addChild(Ears);


		EarRight_r1 = new ModelRenderer(this);
		EarRight_r1.setRotationPoint(6.25F, 2.5F, -3.0F);
        EarRight_r1.mirror = true;
		Ears.addChild(EarRight_r1);
		setRotationAngle(EarRight_r1, -0.0475F, -0.346F, 0.4883F);
		EarRight_r1.cubeList.add(new ModelBox(EarRight_r1, 30, 1, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F));

		EarLeft_r1 = new ModelRenderer(this);
		EarLeft_r1.setRotationPoint(-6.25F, 2.5F, -3.0F);
		Ears.addChild(EarLeft_r1);
		setRotationAngle(EarLeft_r1, -0.0475F, 0.346F, -0.4883F);
		EarLeft_r1.cubeList.add(new ModelBox(EarLeft_r1, 30, 1, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);


		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, -15.0F, 0.0F);
		Body.addChild(bipedBody);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 17, -7.0F, -19.0F, -3.0F, 14, 8, 7, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 34, -5.5F, -11.0F, -2.5F, 11, 6, 6, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 48, -6.0F, -5.0F, -2.5F, 12, 5, 6, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 35, 33, -6.0F, -17.25F, -4.0F, 12, 6, 1, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-8.0F, -31.0F, 0.5F);
		Body.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 64, 18, -4.5F, 3.0F, -2.5F, 5, 4, 5, 0.0F));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 63, 28, -4.5F, 7.0F, -2.5F, 5, 9, 5, 0.0F));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 63, 5, -5.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(8.0F, -31.0F, 0.5F);
        bipedLeftArm.mirror = true;
		Body.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 63, 5, -1.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 64, 18, -0.5F, 3.0F, -2.5F, 5, 4, 5, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 63, 28, -0.5F, 7.0F, -2.5F, 5, 9, 5, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-3.0F, -14.5F, 0.5F);
		Body.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 41, 42, -3.0F, -0.5F, -3.0F, 6, 15, 6, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(3.0F, -14.5F, 0.5F);
        bipedLeftLeg.mirror = true;
		Body.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 41, 42, -3.0F, -0.5F, -3.0F, 6, 15, 6, 0.0F));
	}

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.0399999618530273 + 5.5 / (1.0 + Math.pow(scale / 0.45F, 1.8799999952316284))), 0.0F);
        Head.render(scaleFactor);
        Body.render(scaleFactor);
        GL11.glPopMatrix();
    }


    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.Head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.Head.rotateAngleX = headPitch / (180F / (float)Math.PI);

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
        float headOffset = MathHelper.sin(animProgress * (float)Math.PI) * -(this.Head.rotateAngleX - 0.7F) * 0.75F;
        this.bipedRightArm.rotateAngleX -= (sinCurve * 1.2F + headOffset);
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
        this.bipedRightArm.rotateAngleZ = MathHelper.sin(animProgress * 2.1415927F) * -0.4F;
    }
}
