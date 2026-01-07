package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHirudegarnPost extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHirudegarnPost(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 256;
		textureHeight = 256;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(2.0F, -30.0F, -4.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -9.0F, -12.0F, -7.0F, 14, 15, 14, -1.0F));

        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.0F, 57.0F, 4.0F);
		bipedHead.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 41, 127, -2.0F, -69.0F, -11.0F, 4, 4, 8, 0.0F));

        ModelRenderer globl_horns = new ModelRenderer(this);
		globl_horns.setRotationPoint(-2.0F, -13.0F, -10.0F);
		bipedHead.addChild(globl_horns);
		globl_horns.cubeList.add(new ModelBox(globl_horns, 18, 128, 3.0F, -3.0F, 6.0F, 3, 3, 4, 0.0F));
		globl_horns.cubeList.add(new ModelBox(globl_horns, 19, 129, -6.0F, -3.0F, 6.0F, 3, 3, 3, 0.0F));
		globl_horns.cubeList.add(new ModelBox(globl_horns, 69, 64, 2.0F, 0.0F, 6.0F, 5, 4, 4, 0.0F));
		globl_horns.cubeList.add(new ModelBox(globl_horns, 68, 64, -7.0F, 0.0F, 6.0F, 5, 4, 4, 0.0F));

        ModelRenderer globl_horns2 = new ModelRenderer(this);
		globl_horns2.setRotationPoint(10.0F, -17.0F, -12.0F);
		bipedHead.addChild(globl_horns2);

        ModelRenderer horns3 = new ModelRenderer(this);
		horns3.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns3, -0.3054F, 0.0F, 0.0F);
		globl_horns2.addChild(horns3);
		horns3.cubeList.add(new ModelBox(horns3, 18, 128, -2.5F, 1.7456F, 2.1603F, 3, 5, 2, 0.0F));

        ModelRenderer horns4 = new ModelRenderer(this);
		horns4.setRotationPoint(-6.5F, -6.0F, 11.5F);
		setRotationAngle(horns4, -0.829F, 0.0F, 0.0F);
		globl_horns2.addChild(horns4);
		horns4.cubeList.add(new ModelBox(horns4, 16, 125, -2.5F, -1.7373F, 3.4756F, 3, 9, 2, 0.0F));

        ModelRenderer globl_horns4 = new ModelRenderer(this);
		globl_horns4.setRotationPoint(1.0F, -17.0F, -12.0F);
		bipedHead.addChild(globl_horns4);

        ModelRenderer horns2 = new ModelRenderer(this);
		horns2.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns2, -0.3054F, 0.0F, 0.0F);
		globl_horns4.addChild(horns2);
		horns2.cubeList.add(new ModelBox(horns2, 23, 128, -2.5F, 1.7456F, 2.1603F, 3, 5, 2, 0.0F));

        ModelRenderer horns7 = new ModelRenderer(this);
		horns7.setRotationPoint(-6.5F, -6.0F, 11.5F);
		setRotationAngle(horns7, -0.829F, 0.0F, 0.0F);
		globl_horns4.addChild(horns7);
		horns7.cubeList.add(new ModelBox(horns7, 20, 126, -2.5F, -1.7373F, 3.4756F, 3, 9, 2, 0.0F));

        ModelRenderer globl_horns3 = new ModelRenderer(this);
		globl_horns3.setRotationPoint(-3.0F, -17.0F, -12.0F);
		bipedHead.addChild(globl_horns3);

        ModelRenderer horns6_r1 = new ModelRenderer(this);
		horns6_r1.setRotationPoint(-6.5F, -9.0F, 11.5F);
		setRotationAngle(horns6_r1, -0.829F, 0.0F, 0.0F);
		globl_horns3.addChild(horns6_r1);

        ModelRenderer horns5_r1 = new ModelRenderer(this);
		horns5_r1.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns5_r1, -0.3054F, 0.0F, 0.0F);
		globl_horns3.addChild(horns5_r1);

        ModelRenderer horns5 = new ModelRenderer(this);
		horns5.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns5, -0.3054F, 0.0F, 0.0F);
		globl_horns3.addChild(horns5);

        ModelRenderer horns6 = new ModelRenderer(this);
		horns6.setRotationPoint(-6.5F, -9.0F, 11.5F);
		setRotationAngle(horns6, -0.829F, 0.0F, 0.0F);
		globl_horns3.addChild(horns6);

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 15.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 60, 0, -8.0F, -46.0F, -4.0F, 16, 12, 8, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 9.0F, 0.0F);
		bipedBody.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 56, 24, -7.0F, -43.0F, -4.0F, 14, 5, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 56, 64, -6.0F, -38.0F, -4.0F, 12, 7, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 134, 0, -2.0F, -32.0F, -4.0F, 4, 3, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 95, 71, -3.0F, -29.0F, -4.0F, 6, 3, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 80, -9.0F, -35.0F, -5.0F, 7, 7, 10, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 70, 79, 2.0F, -35.0F, -5.0F, 7, 7, 10, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 92, 149, -7.0F, -52.0F, 3.0F, 13, 4, 2, 0.0F));

        ModelRenderer bodyChild_7 = new ModelRenderer(this);
		bodyChild_7.setRotationPoint(0.0F, -24.0F, 0.0F);
		setRotationAngle(bodyChild_7, -0.3491F, 0.0F, 0.0F);
		bone.addChild(bodyChild_7);
		bodyChild_7.cubeList.add(new ModelBox(bodyChild_7, 210, 54, -3.0F, -10.0611F, 1.3468F, 6, 5, 17, 0.0F));

        ModelRenderer bodyChild_8 = new ModelRenderer(this);
		bodyChild_8.setRotationPoint(0.0F, -26.0F, 0.0F);
		setRotationAngle(bodyChild_8, 0.5236F, 0.0F, 0.0F);
		bone.addChild(bodyChild_8);
		bodyChild_8.cubeList.add(new ModelBox(bodyChild_8, 204, 0, -3.0F, 7.5096F, 14.4904F, 6, 5, 20, 0.0F));

        ModelRenderer bodyChildChild = new ModelRenderer(this);
		bodyChildChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		bodyChild_8.addChild(bodyChildChild);
		bodyChildChild.cubeList.add(new ModelBox(bodyChildChild, 227, 56, -2.0F, 9.1436F, 33.9904F, 4, 2, 6, 0.0F));

        ModelRenderer bodyChild_5 = new ModelRenderer(this);
		bodyChild_5.setRotationPoint(-4.0F, -13.0F, 0.0F);
		setRotationAngle(bodyChild_5, 0.1571F, -0.0349F, 0.3665F);
		bipedBody.addChild(bodyChild_5);
		bodyChild_5.mirror = true;
		bodyChild_5.cubeList.add(new ModelBox(bodyChild_5, 118, 223, -16.4177F, -25.9507F, 8.6613F, 11, 33, 0, 0.0F));

        ModelRenderer bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(-21.0F, -13.0F, 0.0F);
		setRotationAngle(bodyChild_2, 0.1571F, -0.0349F, 0.8901F);
		bipedBody.addChild(bodyChild_2);
		bodyChild_2.mirror = true;
		bodyChild_2.cubeList.add(new ModelBox(bodyChild_2, 0, 223, -16.4493F, -30.0006F, 10.3169F, 11, 33, 0, 0.0F));

        ModelRenderer bodyChild_4 = new ModelRenderer(this);
		bodyChild_4.setRotationPoint(0.0F, -15.0F, 0.0F);
		setRotationAngle(bodyChild_4, 0.1571F, 0.0349F, -0.3665F);
		bipedBody.addChild(bodyChild_4);
		bodyChild_4.cubeList.add(new ModelBox(bodyChild_4, 52, 223, 6.9702F, -23.0333F, 8.2728F, 12, 33, 0, 0.0F));

        ModelRenderer bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(20.0F, -18.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.1571F, 0.0349F, -0.8901F);
		bipedBody.addChild(bodyChild_3);
		bodyChild_3.cubeList.add(new ModelBox(bodyChild_3, 175, 223, 1.5696F, -27.0346F, 9.7288F, 12, 33, 0, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-9.0F, -43.0F, 0.0F);
		setRotationAngle(bipedRightArm, 0.0F, 0.0F, 0.0873F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 32, 32, -6.1364F, -2.6492F, -4.0F, 7, 30, 8, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(8.7802F, 32.4418F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		bipedRightArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 0, 163, -24.0175F, -35.2881F, -4.0F, 15, 6, 11, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(8.0F, -43.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0F, 0.0F, -0.0873F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 31, 0.1402F, -2.7364F, -4.0F, 7, 30, 8, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(-7.7802F, 32.4418F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		bipedLeftArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 183, 8.3714F, -35.5608F, -4.0F, 15, 6, 11, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-6.0F, -19.0F, -2.0F);
		setRotationAngle(bipedRightLeg, -0.1309F, 0.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 34, 89, -4.0F, -0.8394F, -1.4501F, 6, 15, 6, 0.0F));

        ModelRenderer rightLeg3 = new ModelRenderer(this);
		rightLeg3.setRotationPoint(-7.0F, 28.0129F, 8.8024F);
		setRotationAngle(rightLeg3, 0.1745F, 0.0F, 0.0F);
		bipedRightLeg.addChild(rightLeg3);
		rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 29, 5.0F, -2.9738F, -7.771F, 2, 2, 7, 0.0F));
		rightLeg3.cubeList.add(new ModelBox(rightLeg3, 58, 96, 3.0F, -15.4166F, -7.637F, 6, 14, 6, 0.0F));
		rightLeg3.cubeList.add(new ModelBox(rightLeg3, 96, 129, 7.0F, -2.0607F, -9.7634F, 3, 1, 7, 0.0F));
		rightLeg3.cubeList.add(new ModelBox(rightLeg3, 96, 129, 2.0F, -2.0607F, -9.7634F, 3, 1, 7, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(7.0F, -19.0F, -2.0F);
		setRotationAngle(bipedLeftLeg, -0.1309F, 0.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 92, 39, -3.0F, -0.5271F, -1.2162F, 6, 15, 6, 0.0F));

        ModelRenderer leftLeg3 = new ModelRenderer(this);
		leftLeg3.setRotationPoint(-6.0F, 28.274F, 7.8195F);
		setRotationAngle(leftLeg3, 0.1745F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(leftLeg3);
		leftLeg3.cubeList.add(new ModelBox(leftLeg3, 82, 96, 3.0F, -16.2601F, -6.6395F, 6, 15, 6, 0.0F));
		leftLeg3.cubeList.add(new ModelBox(leftLeg3, 96, 129, 2.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));
		leftLeg3.cubeList.add(new ModelBox(leftLeg3, 96, 129, 7.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));
		leftLeg3.cubeList.add(new ModelBox(leftLeg3, 238, 159, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
		leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 29, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
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
