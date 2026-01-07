package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Model7StarsPan extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Line_r1;
	private final ModelRenderer Line_r2;
	private final ModelRenderer bipedBody;
	private final ModelRenderer RTail2;
	private final ModelRenderer Tail5;
	private final ModelRenderer Tail6;
	private final ModelRenderer Tail7;
	private final ModelRenderer RTail;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail3;
	private final ModelRenderer Tail4;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public Model7StarsPan(float _scale) {
		textureWidth = 128;
		textureHeight = 128;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 7.0F, -1.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 44, -2.5F, -8.0F, 0.5F, 1, 3, 1, 0.01F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 50, 11, 1.5F, -8.0F, 0.5F, 1, 3, 1, 0.01F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 50, -3.0F, -5.0F, -2.5F, 6, 5, 5, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 34, 17, -0.5F, -4.5F, -2.6F, 1, 1, 0, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 34, 11, -2.0F, -2.0F, -6.5F, 4, 2, 4, 0.0F));

		Line_r1 = new ModelRenderer(this);
		Line_r1.setRotationPoint(2.5F, -3.0F, 1.5F);
		bipedHead.addChild(Line_r1);
		setRotationAngle(Line_r1, -0.5698F, 0.9137F, -0.429F);
		Line_r1.cubeList.add(new ModelBox(Line_r1, 0, 52, 0.0F, -6.0F, -2.0F, 0, 8, 7, 0.0F));

		Line_r2 = new ModelRenderer(this);
		Line_r2.setRotationPoint(-2.5F, -3.0F, 1.5F);
		bipedHead.addChild(Line_r2);
		setRotationAngle(Line_r2, -0.5698F, -0.9137F, 0.429F);
		Line_r2.cubeList.add(new ModelBox(Line_r2, 46, 50, 0.0F, -6.0F, -2.0F, 0, 8, 7, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 18, -4.0F, 7.0F, -3.0F, 8, 7, 6, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 14.0F, -4.0F, 8, 9, 9, 0.0F));

		RTail2 = new ModelRenderer(this);
		RTail2.setRotationPoint(1.0F, 21.0F, 5.0F);
		bipedBody.addChild(RTail2);
		setRotationAngle(RTail2, -0.3348F, 0.4149F, -0.1393F);
		RTail2.cubeList.add(new ModelBox(RTail2, 0, 31, -3.5F, -4.0F, -2.0F, 7, 6, 7, 0.0F));

		Tail5 = new ModelRenderer(this);
		Tail5.setRotationPoint(1.0F, -0.75F, 7.0F);
		RTail2.addChild(Tail5);
		setRotationAngle(Tail5, 0.3927F, 0.0F, 0.0F);
		Tail5.cubeList.add(new ModelBox(Tail5, 34, 0, -4.0F, -4.0F, -3.0F, 6, 5, 6, 0.0F));

		Tail6 = new ModelRenderer(this);
		Tail6.setRotationPoint(-1.0F, -1.75F, 3.0F);
		Tail5.addChild(Tail6);
		setRotationAngle(Tail6, 0.3927F, 0.0F, 0.0F);
		Tail6.cubeList.add(new ModelBox(Tail6, 56, 11, -2.0F, -3.0F, -1.0F, 4, 5, 5, 0.0F));

		Tail7 = new ModelRenderer(this);
		Tail7.setRotationPoint(1.0F, -0.75F, 6.0F);
		Tail6.addChild(Tail7);
		setRotationAngle(Tail7, 0.3927F, 0.0F, 0.0F);
		Tail7.cubeList.add(new ModelBox(Tail7, 14, 60, -2.5F, -3.0F, -3.0F, 3, 3, 5, 0.0F));

		RTail = new ModelRenderer(this);
		RTail.setRotationPoint(-1.0F, 21.25F, 5.0F);
		bipedBody.addChild(RTail);
		setRotationAngle(RTail, -0.3348F, -0.4149F, 0.1393F);
		RTail.cubeList.add(new ModelBox(RTail, 28, 18, -3.5F, -4.0F, -2.0F, 7, 6, 7, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(-1.0F, -0.75F, 7.0F);
		RTail.addChild(Tail2);
		setRotationAngle(Tail2, 0.3927F, 0.0F, 0.0F);
		Tail2.cubeList.add(new ModelBox(Tail2, 28, 31, -2.0F, -4.0F, -3.0F, 6, 5, 6, 0.0F));

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(1.0F, -1.75F, 3.0F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, 0.3927F, 0.0F, 0.0F);
		Tail3.cubeList.add(new ModelBox(Tail3, 52, 31, -2.0F, -3.0F, -1.0F, 4, 5, 5, 0.0F));

		Tail4 = new ModelRenderer(this);
		Tail4.setRotationPoint(-1.0F, -0.75F, 6.0F);
		Tail3.addChild(Tail4);
		setRotationAngle(Tail4, 0.3927F, 0.0F, 0.0F);
		Tail4.cubeList.add(new ModelBox(Tail4, 58, 0, -0.5F, -3.0F, -3.0F, 3, 3, 5, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 10.0F, -1.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 30, 60, -1.0F, -2.0F, -1.5F, 2, 10, 3, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 10.0F, -1.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 60, 50, -1.0F, -2.0F, -1.5F, 2, 10, 3, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 21.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 28, 42, -4.5F, 2.0F, -6.0F, 5, 1, 7, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 52, 41, -3.5F, -2.0F, -4.0F, 3, 4, 5, 0.25F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 21.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 44, -0.5F, 2.0F, -6.0F, 5, 1, 7, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 56, 21, 0.5F, -2.0F, -4.0F, 3, 4, 5, 0.25F));
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
