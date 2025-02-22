package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGohanUltimate extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Hair;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private final ModelRenderer Hair8;
    private final ModelRenderer Hair9;
    private final ModelRenderer Hair10;
    private final ModelRenderer Hair11;
    private final ModelRenderer hair12;
    private final ModelRenderer hair12_1;
    private final ModelRenderer hair12_2;
    private final ModelRenderer hair12_7;
    private final ModelRenderer hair5_5_r1_r1;
    private final ModelRenderer hair12_6;
    private final ModelRenderer hair5_4_r1_r1;
    private final ModelRenderer hair12_5;
    private final ModelRenderer hair5_3_r1_r1;
    private final ModelRenderer hair12_4;
    private final ModelRenderer hair12_3;
    private final ModelRenderer Hair14;
    private final ModelRenderer Hair13;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scale = 1.0F;

    public ModelGohanUltimate(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

        scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 0.0F, -0.4F);
		Head.addChild(Hair);


		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		Hair.addChild(Hair1);
		setRotationAngle(Hair1, -0.1309F, 0.0023F, -0.1572F);
		Hair1.cubeList.add(new ModelBox(Hair1, 42, 2, -0.5133F, -6.474F, -2.0714F, 3, 8, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-2.0F, -10.0F, 0.0F);
		Hair.addChild(Hair2);
		setRotationAngle(Hair2, -0.1745F, 0.0F, -0.349F);
		Hair2.cubeList.add(new ModelBox(Hair2, 43, 2, -1.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		Hair.addChild(Hair3);
		setRotationAngle(Hair3, -0.0524F, 0.0F, 0.3665F);
		Hair3.cubeList.add(new ModelBox(Hair3, 43, 2, 0.0603F, -5.342F, -3.0F, 3, 7, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		Hair.addChild(Hair4);
		setRotationAngle(Hair4, 0.0F, 0.0873F, 0.4363F);
		Hair4.cubeList.add(new ModelBox(Hair4, 45, 2, 1.0603F, -5.342F, -0.9F, 2, 7, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-4.6F, -6.4F, -2.0F);
		Hair.addChild(Hair5);
		setRotationAngle(Hair5, 2.7925F, 0.0873F, -0.4364F);
		Hair5.cubeList.add(new ModelBox(Hair5, 42, 2, -0.0028F, -2.171F, -3.2188F, 3, 7, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		Hair.addChild(Hair6);
		setRotationAngle(Hair6, -0.0873F, 0.0F, -0.4363F);
		Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, 1.8099F, -5.1257F, -3.0188F, 3, 9, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		Hair.addChild(Hair7);
		setRotationAngle(Hair7, -0.3488F, -0.0149F, 0.0289F);
		Hair7.cubeList.add(new ModelBox(Hair7, 43, 2, 1.8099F, -4.0417F, -5.0982F, 3, 7, 4, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(-3.0F, -8.0F, 2.0F);
		Hair.addChild(Hair8);
		setRotationAngle(Hair8, 2.7925F, -0.0873F, -0.349F);
		Hair8.cubeList.add(new ModelBox(Hair8, 43, 4, -1.9972F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		Hair.addChild(Hair9);
		setRotationAngle(Hair9, 2.7925F, 0.0873F, 0.349F);
		Hair9.cubeList.add(new ModelBox(Hair9, 43, 4, -1.0028F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(-0.7F, -4.2F, 1.3F);
		Hair.addChild(Hair10);
		setRotationAngle(Hair10, 2.8798F, 0.0873F, 0.0F);
		Hair10.cubeList.add(new ModelBox(Hair10, 42, 2, 0.9972F, -2.3391F, -4.0809F, 3, 10, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(-3.5F, -6.6F, 1.6F);
		Hair.addChild(Hair11);
		setRotationAngle(Hair11, 2.9671F, 0.0175F, 0.0524F);
		Hair11.cubeList.add(new ModelBox(Hair11, 42, 2, 0.9972F, -4.6289F, -4.1585F, 3, 10, 3, 0.0F));

		hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(0.0964F, -6.4F, -3.2536F);
		Hair.addChild(hair12);
		setRotationAngle(hair12, 1.1938F, -0.9183F, -0.327F);


		hair12_1 = new ModelRenderer(this);
		hair12_1.setRotationPoint(0.6036F, -1.205F, 0.6036F);
		hair12.addChild(hair12_1);
		setRotationAngle(hair12_1, 0.5542F, 0.24F, -0.1054F);
		hair12_1.cubeList.add(new ModelBox(hair12_1, 48, 6, -1.04F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

		hair12_2 = new ModelRenderer(this);
		hair12_2.setRotationPoint(0.3036F, -1.9F, 0.2536F);
		hair12.addChild(hair12_2);
		setRotationAngle(hair12_2, 0.192F, 0.0F, 0.0F);


		hair12_7 = new ModelRenderer(this);
		hair12_7.setRotationPoint(-0.8F, 0.295F, -3.25F);
		hair12_2.addChild(hair12_7);
		setRotationAngle(hair12_7, 2.4391F, 0.24F, -0.1054F);


		hair5_5_r1_r1 = new ModelRenderer(this);
		hair5_5_r1_r1.setRotationPoint(0.09F, 0.555F, -0.1F);
		hair12_7.addChild(hair5_5_r1_r1);
		setRotationAngle(hair5_5_r1_r1, -0.4189F, 0.0F, 0.0F);
		hair5_5_r1_r1.cubeList.add(new ModelBox(hair5_5_r1_r1, 48, 6, -1.0F, -2.1F, -1.0F, 2, 3, 2, -0.6F));

		hair12_6 = new ModelRenderer(this);
		hair12_6.setRotationPoint(-0.7F, -0.105F, -2.45F);
		hair12_2.addChild(hair12_6);
		setRotationAngle(hair12_6, 2.0988F, 0.24F, -0.1054F);


		hair5_4_r1_r1 = new ModelRenderer(this);
		hair5_4_r1_r1.setRotationPoint(0.13F, 0.3293F, -0.0298F);
		hair12_6.addChild(hair5_4_r1_r1);
		setRotationAngle(hair5_4_r1_r1, -0.2443F, 0.0F, 0.0F);
		hair5_4_r1_r1.cubeList.add(new ModelBox(hair5_4_r1_r1, 48, 6, -1.0F, -1.0F, -0.9542F, 2, 2, 2, -0.52F));

		hair12_5 = new ModelRenderer(this);
		hair12_5.setRotationPoint(-0.5F, -0.405F, -1.45F);
		hair12_2.addChild(hair12_5);
		setRotationAngle(hair12_5, 1.7323F, 0.24F, -0.1054F);


		hair5_3_r1_r1 = new ModelRenderer(this);
		hair5_3_r1_r1.setRotationPoint(0.14F, 0.116F, 0.02F);
		hair12_5.addChild(hair5_3_r1_r1);
		setRotationAngle(hair5_3_r1_r1, -0.0873F, 0.0F, 0.0F);
		hair5_3_r1_r1.cubeList.add(new ModelBox(hair5_3_r1_r1, 48, 6, -1.0F, -1.0F, -0.988F, 2, 2, 2, -0.51F));

		hair12_4 = new ModelRenderer(this);
		hair12_4.setRotationPoint(-0.2F, -0.505F, -0.65F);
		hair12_2.addChild(hair12_4);
		setRotationAngle(hair12_4, 1.3309F, 0.24F, -0.1054F);
		hair12_4.cubeList.add(new ModelBox(hair12_4, 48, 6, -0.97F, -0.9F, -1.075F, 2, 2, 2, -0.5F));

		hair12_3 = new ModelRenderer(this);
		hair12_3.setRotationPoint(0.0F, -0.105F, -0.15F);
		hair12_2.addChild(hair12_3);
		setRotationAngle(hair12_3, 0.5542F, 0.24F, -0.1054F);
		hair12_3.cubeList.add(new ModelBox(hair12_3, 48, 6, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.5F));

        Hair14 = new ModelRenderer(this);
        Hair14.setRotationPoint(-3.0F, -8.0F, 2.5F);
        Hair.addChild(Hair14);
        setRotationAngle(Hair14, 2.7925F, -0.0873F, -0.5236F);
        Hair14.cubeList.add(new ModelBox(Hair14, 45, 2, -2.9972F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        Hair13 = new ModelRenderer(this);
        Hair13.setRotationPoint(3.0F, -8.0F, 2.5F);
        Hair.addChild(Hair13);
        setRotationAngle(Hair13, 2.7925F, 0.0873F, 0.5236F);
        Hair13.cubeList.add(new ModelBox(Hair13, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
        LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

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
}
