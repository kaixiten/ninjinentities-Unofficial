package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;



public class ModelGeneral3 extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer FutreGohan;
	private final ModelRenderer FutreGohan12;
	private final ModelRenderer FutreGohan11;
	private final ModelRenderer FutreGohan10;
	private final ModelRenderer FutreGohan9;
	private final ModelRenderer FutreGohan8;
	private final ModelRenderer FutreGohan7;
	private final ModelRenderer FutreGohan6;
	private final ModelRenderer FutreGohan5;
	private final ModelRenderer FutreGohan3;
	private final ModelRenderer FutreGohan4;
	private final ModelRenderer FutreGohan2;
	private final ModelRenderer Strand4_r1;
	private final ModelRenderer FroB;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;
    public ModelGeneral3(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		FutreGohan = new ModelRenderer(this);
		FutreGohan.setRotationPoint(0.0F, -8.0F, 0.0F);
		bipedHead.addChild(FutreGohan);


		FutreGohan12 = new ModelRenderer(this);
		FutreGohan12.setRotationPoint(0.0F, 8.0F, 0.0F);
		FutreGohan.addChild(FutreGohan12);
		setRotationAngle(FutreGohan12, 0.1745F, 0.0F, -0.4363F);
		FutreGohan12.cubeList.add(new ModelBox(FutreGohan12, 33, 0, -0.4562F, -9.7503F, -0.044F, 4, 4, 4, 0.0F));

		FutreGohan11 = new ModelRenderer(this);
		FutreGohan11.setRotationPoint(3.6F, 2.5F, -1.1F);
		FutreGohan.addChild(FutreGohan11);
		setRotationAngle(FutreGohan11, 0.139F, -0.1059F, -0.5746F);
		FutreGohan11.cubeList.add(new ModelBox(FutreGohan11, 33, 9, -7.6042F, -4.6016F, 1.6979F, 4, 3, 3, 0.0F));

		FutreGohan10 = new ModelRenderer(this);
		FutreGohan10.setRotationPoint(0.0F, 8.0F, 0.0F);
		FutreGohan.addChild(FutreGohan10);
		setRotationAngle(FutreGohan10, 0.3491F, 0.0F, -0.6109F);
		FutreGohan10.cubeList.add(new ModelBox(FutreGohan10, 35, 6, 1.4915F, -10.6766F, 1.8823F, 3, 3, 3, 0.0F));

		FutreGohan9 = new ModelRenderer(this);
		FutreGohan9.setRotationPoint(0.0F, 8.0F, 0.0F);
		FutreGohan.addChild(FutreGohan9);
		setRotationAngle(FutreGohan9, 0.5236F, 0.0F, -0.7854F);
		FutreGohan9.cubeList.add(new ModelBox(FutreGohan9, 33, 8, 3.6243F, -11.1326F, 3.7879F, 2, 3, 2, 0.0F));

		FutreGohan8 = new ModelRenderer(this);
		FutreGohan8.setRotationPoint(3.6F, 2.5F, -1.1F);
		FutreGohan.addChild(FutreGohan8);
		setRotationAngle(FutreGohan8, 0.2811F, -0.2098F, -0.6843F);
		FutreGohan8.cubeList.add(new ModelBox(FutreGohan8, 39, 11, -8.3987F, -4.5511F, 3.1329F, 3, 2, 2, 0.0F));

		FutreGohan7 = new ModelRenderer(this);
		FutreGohan7.setRotationPoint(-3.846F, 1.1409F, -0.9554F);
		FutreGohan.addChild(FutreGohan7);
		setRotationAngle(FutreGohan7, 0.2783F, -0.2681F, -0.2961F);
		FutreGohan7.cubeList.add(new ModelBox(FutreGohan7, 33, 0, -3.0973F, -0.7019F, 0.9995F, 5, 2, 2, 0.0F));

		FutreGohan6 = new ModelRenderer(this);
		FutreGohan6.setRotationPoint(-0.1524F, 1.4604F, -3.5F);
		FutreGohan.addChild(FutreGohan6);
		setRotationAngle(FutreGohan6, 0.0F, 0.0F, -0.3927F);
		FutreGohan6.cubeList.add(new ModelBox(FutreGohan6, 39, 0, -1.0F, -1.3F, -1.5F, 2, 3, 3, 0.0F));

		FutreGohan5 = new ModelRenderer(this);
		FutreGohan5.setRotationPoint(-1.4631F, 0.2931F, -4.0F);
		FutreGohan.addChild(FutreGohan5);
		setRotationAngle(FutreGohan5, 0.0F, 0.0F, 0.4363F);
		FutreGohan5.cubeList.add(new ModelBox(FutreGohan5, 34, 3, -0.4031F, -0.123F, -1.0F, 1, 3, 2, 0.0F));

		FutreGohan3 = new ModelRenderer(this);
		FutreGohan3.setRotationPoint(0.0F, 7.5F, 0.0F);
		FutreGohan.addChild(FutreGohan3);
		setRotationAngle(FutreGohan3, 0.0F, -0.384F, 0.5271F);
		FutreGohan3.cubeList.add(new ModelBox(FutreGohan3, 33, 0, -11.0F, -5.2F, 1.0F, 6, 2, 2, 0.0F));

		FutreGohan4 = new ModelRenderer(this);
		FutreGohan4.setRotationPoint(1.0861F, 1.4797F, -4.0F);
		FutreGohan.addChild(FutreGohan4);
		setRotationAngle(FutreGohan4, 0.0F, 0.0F, -0.576F);
		FutreGohan4.cubeList.add(new ModelBox(FutreGohan4, 34, 0, 0.0F, -1.5F, -1.0F, 1, 3, 2, 0.0F));

		FutreGohan2 = new ModelRenderer(this);
		FutreGohan2.setRotationPoint(-2.6163F, 0.4502F, -3.8265F);
		FutreGohan.addChild(FutreGohan2);
		setRotationAngle(FutreGohan2, -0.4651F, 0.2457F, 0.3449F);


		Strand4_r1 = new ModelRenderer(this);
		Strand4_r1.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
		FutreGohan2.addChild(Strand4_r1);
		setRotationAngle(Strand4_r1, 0.3046F, -0.3684F, 0.2431F);
		Strand4_r1.cubeList.add(new ModelBox(Strand4_r1, 33, 1, -0.5926F, -2.4717F, -0.8594F, 2, 3, 2, 0.0F));

		FroB = new ModelRenderer(this);
		FroB.setRotationPoint(0.0F, 10.0F, 2.0F);


		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 3.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 3.0F, 0.0F);
        bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 32, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.mirror = true;
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 32, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        bipedBody.render(scaleFactor);
        renderHairs(0.0625F, "FR", limbSwingAmount);
        GL11.glPopMatrix();
    }
    private void transRot(float f5, ModelRenderer m)
    {
        GL11.glTranslatef(m.rotationPointX * f5, m.rotationPointY * f5, m.rotationPointZ * f5);
        if (m.rotateAngleZ != 0.0F) {
            GL11.glRotatef(m.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
        }
        if (m.rotateAngleY != 0.0F) {
            GL11.glRotatef(m.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
        }
        if (m.rotateAngleX != 0.0F) {
            GL11.glRotatef(m.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
        }
    }
    public String renderHairs(float par1, String hair, float par3)
    {
        if (hair.equals("FR"))
        {
            GL11.glPushMatrix();
            transRot(par1, bipedBody);
            GL11.glScalef(1.0F, 0.35F, 1.0F);
            FroB.render(par1);
            GL11.glScaled(0.1D, 0.1D, 0.1D);
            float r = MathHelper.sin(par3 * 0.02F) * 0.1F;
            float r2 = MathHelper.cos(par3 * 0.02F) * 0.1F;
            float r3 = MathHelper.cos(par3 * 0.14F) * 0.1F;
            ftailS1.rotateAngleY = 0.2F;
            ftailS1.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r;
            ftailS1.rotateAngleX = -0.3F;
            ftailS2.rotateAngleY = 0.2F;
            ftailS2.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r2 + r3;
            ftailS2.rotateAngleX = 0.4F;
            ftailS3.rotateAngleY = 0.1F;
            ftailS3.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.1F - 0.1F + r + r3;
            ftailS3.rotateAngleX = 0.6F;
            ftailS3.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F + 0.3F;
            ftailS4.rotateAngleY = 0.1F;
            ftailS4.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.1F + r2;
            ftailS4.rotateAngleX = 0.3F;
            ftailS4.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.2F;
            ftailS5.rotateAngleY = 0.2F;
            ftailS5.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r + r3;
            ftailS5.rotateAngleX = -0.2F;
            ftailS5.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.3F;
            ftailS6.rotateAngleY = 0.2F;
            ftailS6.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r2 + r3;
            ftailS6.rotateAngleX = -0.4F;
            ftailS6.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F - 0.4F;
            GL11.glPopMatrix();
        }
        return "";
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
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
