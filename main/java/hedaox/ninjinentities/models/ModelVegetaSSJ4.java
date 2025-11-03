package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelVegetaSSJ4 extends ModelBase {
	private final ModelRenderer FroB;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
	private final ModelRenderer Head;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer Body;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final float scale = 1.0F;

	public ModelVegetaSSJ4(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		FroB = new ModelRenderer(this);
		FroB.setRotationPoint(0.0F, 10.0F, 2.0F);

		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.1F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.1F));

        ModelRenderer bipedHeadsvChild_9 = new ModelRenderer(this);
		bipedHeadsvChild_9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_9);
		setRotationAngle(bipedHeadsvChild_9, -0.4363F, 0.0F, -0.4014F);
		bipedHeadsvChild_9.cubeList.add(new ModelBox(bipedHeadsvChild_9, 32, 0, -1.0F, -10.0F, -6.2F, 4, 6, 4, -0.1F));

        ModelRenderer bipedHeadsvChild_11 = new ModelRenderer(this);
		bipedHeadsvChild_11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_11);
		setRotationAngle(bipedHeadsvChild_11, -0.6109F, 0.0F, -0.2443F);
		bipedHeadsvChild_11.cubeList.add(new ModelBox(bipedHeadsvChild_11, 32, 0, -0.5F, -14.0F, -6.0F, 3, 3, 3, -0.1F));

        ModelRenderer SSJ3Parte2 = new ModelRenderer(this);
		SSJ3Parte2.setRotationPoint(0.0F, -9.3F, -5.2F);
		Head.addChild(SSJ3Parte2);
		SSJ3Parte2.cubeList.add(new ModelBox(SSJ3Parte2, 0, 0, 0.0F, 0.0F, 0.0F, 0, 0, 0, -0.1F));

        ModelRenderer bipedHeadssj3lChild_6 = new ModelRenderer(this);
		bipedHeadssj3lChild_6.setRotationPoint(0.1745F, 4.5618F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_6);
		bipedHeadssj3lChild_6.cubeList.add(new ModelBox(bipedHeadssj3lChild_6, 32, 0, -0.9F, 1.2667F, 4.0F, 4, 5, 4, -0.1F));

        ModelRenderer bipedHeadssj3lChild_4 = new ModelRenderer(this);
		bipedHeadssj3lChild_4.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_4);
		setRotationAngle(bipedHeadssj3lChild_4, 0.1571F, -0.2618F, 0.0F);
		bipedHeadssj3lChild_4.cubeList.add(new ModelBox(bipedHeadssj3lChild_4, 32, 0, -2.4667F, 2.0F, 4.0F, 4, 6, 4, -0.1F));

        ModelRenderer bipedHeadssj3lChild_3 = new ModelRenderer(this);
		bipedHeadssj3lChild_3.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_3);
		setRotationAngle(bipedHeadssj3lChild_3, 0.2269F, 0.0F, -0.2094F);
		bipedHeadssj3lChild_3.cubeList.add(new ModelBox(bipedHeadssj3lChild_3, 32, 0, 2.17F, 1.73F, 3.0F, 3, 5, 3, -0.1F));

        ModelRenderer bipedHeadssj3lChild_1 = new ModelRenderer(this);
		bipedHeadssj3lChild_1.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_1);
		setRotationAngle(bipedHeadssj3lChild_1, 0.1396F, 0.0F, 0.0873F);
		bipedHeadssj3lChild_1.cubeList.add(new ModelBox(bipedHeadssj3lChild_1, 32, 0, -5.4667F, 4.2F, 3.0F, 3, 5, 3, -0.1F));

        ModelRenderer bipedHeadssj3lChild_8 = new ModelRenderer(this);
		bipedHeadssj3lChild_8.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_8);
		setRotationAngle(bipedHeadssj3lChild_8, 0.2793F, 0.0F, 0.0F);
		bipedHeadssj3lChild_8.cubeList.add(new ModelBox(bipedHeadssj3lChild_8, 32, 0, -2.0F, 1.0F, 4.0F, 4, 6, 4, -0.1F));

        ModelRenderer bipedHeadssj3lChild_10 = new ModelRenderer(this);
		bipedHeadssj3lChild_10.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_10);
		setRotationAngle(bipedHeadssj3lChild_10, -0.9425F, 0.1222F, 0.0F);
		bipedHeadssj3lChild_10.cubeList.add(new ModelBox(bipedHeadssj3lChild_10, 32, 0, -5.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));

        ModelRenderer bipedHeadssj3lChild_7 = new ModelRenderer(this);
		bipedHeadssj3lChild_7.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_7);
		setRotationAngle(bipedHeadssj3lChild_7, 0.1745F, 0.0F, 0.0F);
		bipedHeadssj3lChild_7.cubeList.add(new ModelBox(bipedHeadssj3lChild_7, 33, 1, -1.9333F, 6.0F, 5.0F, 4, 6, 3, -0.1F));

        ModelRenderer bipedHeadssj3lChild = new ModelRenderer(this);
		bipedHeadssj3lChild.setRotationPoint(0.1396F, 4.3F, 2.1127F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild);
		setRotationAngle(bipedHeadssj3lChild, 0.1396F, 0.0F, -0.0873F);
		bipedHeadssj3lChild.cubeList.add(new ModelBox(bipedHeadssj3lChild, 32, 0, 2.5333F, 4.2F, 3.0F, 2, 5, 3, -0.1F));

        ModelRenderer bipedHeadssj3lChild_5 = new ModelRenderer(this);
		bipedHeadssj3lChild_5.setRotationPoint(0.1047F, 4.5618F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_5);
		setRotationAngle(bipedHeadssj3lChild_5, 0.1047F, 0.2618F, 0.0F);
		bipedHeadssj3lChild_5.cubeList.add(new ModelBox(bipedHeadssj3lChild_5, 32, 0, -1.0F, 4.9667F, 4.0F, 4, 4, 4, -0.1F));

        ModelRenderer bipedHeadssj3lChild_9 = new ModelRenderer(this);
		bipedHeadssj3lChild_9.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_9);
		setRotationAngle(bipedHeadssj3lChild_9, -0.9425F, -0.1222F, 0.0F);
		bipedHeadssj3lChild_9.cubeList.add(new ModelBox(bipedHeadssj3lChild_9, 32, 0, 3.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));

        ModelRenderer bipedHeadssj3lChild_2 = new ModelRenderer(this);
		bipedHeadssj3lChild_2.setRotationPoint(0.0F, 4.3F, 2.2F);
		SSJ3Parte2.addChild(bipedHeadssj3lChild_2);
		setRotationAngle(bipedHeadssj3lChild_2, 0.2269F, 0.0F, 0.2094F);
		bipedHeadssj3lChild_2.cubeList.add(new ModelBox(bipedHeadssj3lChild_2, 32, 0, -5.17F, 1.73F, 3.0F, 3, 5, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_7 = new ModelRenderer(this);
		bipedHeadsvChild_7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_7);
		setRotationAngle(bipedHeadsvChild_7, -0.5934F, 0.0F, 0.0F);
		bipedHeadsvChild_7.cubeList.add(new ModelBox(bipedHeadsvChild_7, 32, 0, 0.0F, -14.0F, -7.0F, 2, 3, 2, -0.1F));

        ModelRenderer bipedHeadsvChild_5 = new ModelRenderer(this);
		bipedHeadsvChild_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_5);
		setRotationAngle(bipedHeadsvChild_5, 0.0F, -0.3491F, -0.925F);
		bipedHeadsvChild_5.cubeList.add(new ModelBox(bipedHeadsvChild_5, 32, 0, 7.0F, -2.0F, -1.5F, 3, 2, 2, -0.1F));

        ModelRenderer bipedHeadsvChild_15 = new ModelRenderer(this);
		bipedHeadsvChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_15);
		setRotationAngle(bipedHeadsvChild_15, -0.576F, 0.0F, 0.1396F);
		bipedHeadsvChild_15.cubeList.add(new ModelBox(bipedHeadsvChild_15, 32, 0, -1.0F, -12.0F, -6.0F, 3, 3, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_19 = new ModelRenderer(this);
		bipedHeadsvChild_19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_19);
		setRotationAngle(bipedHeadsvChild_19, -0.1396F, 0.0F, 0.0F);
		bipedHeadsvChild_19.cubeList.add(new ModelBox(bipedHeadsvChild_19, 32, 0, -2.0F, -13.0F, -1.0F, 3, 5, 4, -0.1F));

        ModelRenderer bipedHeadsvChild_17 = new ModelRenderer(this);
		bipedHeadsvChild_17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_17);
		setRotationAngle(bipedHeadsvChild_17, -0.2443F, 0.2618F, 0.0175F);
		bipedHeadsvChild_17.cubeList.add(new ModelBox(bipedHeadsvChild_17, 32, 0, -1.0F, -10.0F, -1.0F, 4, 5, 4, -0.1F));

        ModelRenderer bipedHeadsvChild_6 = new ModelRenderer(this);
		bipedHeadsvChild_6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_6);
		setRotationAngle(bipedHeadsvChild_6, -0.4363F, 0.0F, 0.0F);
		bipedHeadsvChild_6.cubeList.add(new ModelBox(bipedHeadsvChild_6, 32, 0, -0.5F, -12.0F, -6.0F, 3, 3, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_3 = new ModelRenderer(this);
		bipedHeadsvChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_3);
		setRotationAngle(bipedHeadsvChild_3, 0.0F, -0.1745F, -0.6109F);
		bipedHeadsvChild_3.cubeList.add(new ModelBox(bipedHeadsvChild_3, 32, 0, 4.0F, -4.0F, -1.0F, 4, 3, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_10 = new ModelRenderer(this);
		bipedHeadsvChild_10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_10);
		setRotationAngle(bipedHeadsvChild_10, -0.5411F, 0.0F, -0.3665F);
		bipedHeadsvChild_10.cubeList.add(new ModelBox(bipedHeadsvChild_10, 32, 0, -0.5F, -12.0F, -6.0F, 5, 4, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_16 = new ModelRenderer(this);
		bipedHeadsvChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_16);
		setRotationAngle(bipedHeadsvChild_16, -0.2793F, 0.0F, 0.0F);
		bipedHeadsvChild_16.cubeList.add(new ModelBox(bipedHeadsvChild_16, 32, 0, -2.0F, -9.0F, -1.0F, 4, 5, 4, -0.1F));

        ModelRenderer bipedHeadsvChild_12 = new ModelRenderer(this);
		bipedHeadsvChild_12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_12);
		setRotationAngle(bipedHeadsvChild_12, -0.6981F, 0.0F, -0.1222F);
		bipedHeadsvChild_12.cubeList.add(new ModelBox(bipedHeadsvChild_12, 32, 0, 0.0F, -15.4F, -7.0F, 2, 5, 2, -0.1F));

        ModelRenderer bipedHeadsvChild = new ModelRenderer(this);
		bipedHeadsvChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild);
		setRotationAngle(bipedHeadsvChild, -0.3142F, 0.0F, 0.0F);
		bipedHeadsvChild.cubeList.add(new ModelBox(bipedHeadsvChild, 32, 0, -1.0F, -10.0F, -6.05F, 4, 4, 4, -0.1F));

        ModelRenderer bipedHeadsvChild_14 = new ModelRenderer(this);
		bipedHeadsvChild_14.setRotationPoint(-0.5411F, 0.0F, 0.2455F);
		Head.addChild(bipedHeadsvChild_14);
		setRotationAngle(bipedHeadsvChild_14, -0.5411F, 0.0F, 0.2455F);
		bipedHeadsvChild_14.cubeList.add(new ModelBox(bipedHeadsvChild_14, 32, 0, -0.5F, -10.0F, -6.0F, 3, 3, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_8 = new ModelRenderer(this);
		bipedHeadsvChild_8.setRotationPoint(0.0F, 0.3491F, 0.8901F);
		Head.addChild(bipedHeadsvChild_8);
		setRotationAngle(bipedHeadsvChild_8, 0.0F, 0.3491F, 0.8901F);
		bipedHeadsvChild_8.cubeList.add(new ModelBox(bipedHeadsvChild_8, 32, 0, -10.0F, -2.1667F, -1.5F, 3, 2, 2, -0.1F));

        ModelRenderer bipedHeadsvChild_18 = new ModelRenderer(this);
		bipedHeadsvChild_18.setRotationPoint(-0.2443F, -0.2618F, 0.0175F);
		Head.addChild(bipedHeadsvChild_18);
		setRotationAngle(bipedHeadsvChild_18, -0.2443F, -0.2618F, 0.0175F);
		bipedHeadsvChild_18.cubeList.add(new ModelBox(bipedHeadsvChild_18, 32, 0, -4.0F, -11.0F, -1.0F, 4, 6, 4, -0.1F));

        ModelRenderer bipedHeadsvChild_13 = new ModelRenderer(this);
		bipedHeadsvChild_13.setRotationPoint(-0.3665F, 0.0F, 0.4363F);
		Head.addChild(bipedHeadsvChild_13);
		setRotationAngle(bipedHeadsvChild_13, -0.3665F, 0.0F, 0.4363F);
		bipedHeadsvChild_13.cubeList.add(new ModelBox(bipedHeadsvChild_13, 32, 0, -1.5F, -9.0F, -5.5F, 3, 5, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_20 = new ModelRenderer(this);
		bipedHeadsvChild_20.setRotationPoint(-0.1222F, 0.1745F, 0.0F);
		Head.addChild(bipedHeadsvChild_20);
		setRotationAngle(bipedHeadsvChild_20, -0.1222F, 0.1745F, 0.0F);
		bipedHeadsvChild_20.cubeList.add(new ModelBox(bipedHeadsvChild_20, 32, 0, -1.0F, -14.0F, 0.0F, 3, 5, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_21 = new ModelRenderer(this);
		bipedHeadsvChild_21.setRotationPoint(-0.2443F, -0.2618F, 0.0175F);
		Head.addChild(bipedHeadsvChild_21);
		setRotationAngle(bipedHeadsvChild_21, -0.2443F, -0.2618F, 0.0175F);
		bipedHeadsvChild_21.cubeList.add(new ModelBox(bipedHeadsvChild_21, 32, 0, -2.8667F, -13.2F, -0.6667F, 3, 4, 3, -0.1F));

        ModelRenderer bipedHeadsvChild_4 = new ModelRenderer(this);
		bipedHeadsvChild_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bipedHeadsvChild_4);
		setRotationAngle(bipedHeadsvChild_4, 0.0F, 0.1745F, 0.6109F);
		bipedHeadsvChild_4.cubeList.add(new ModelBox(bipedHeadsvChild_4, 32, 0, -8.0F, -4.0F, -1.0F, 4, 3, 3, -0.1F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(this.scale, this.scale, this.scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
        Head.render(f5);
        Body.render(f5);
        RArm.render(f5);
        LArm.render(f5);
        renderHairs(0.0625F, "FR", f2);
        GL11.glPopMatrix();
        this.Head.rotateAngleY = f3 / (160F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (160F / (float)Math.PI);
        this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.RArm.rotateAngleZ = 0.0F;
        this.LArm.rotateAngleZ = 0.0F;
        this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.RLeg.rotateAngleY = 0.0F;
        this.LLeg.rotateAngleY = 0.0F;
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
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
            transRot(par1, Body);
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
}
