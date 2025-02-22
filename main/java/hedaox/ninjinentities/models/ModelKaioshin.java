package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelKaioshin extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer ear2;
	private final ModelRenderer ear1;
	private final ModelRenderer hair;
	private final ModelRenderer hair1;
	private final ModelRenderer hair2_r1;
	private final ModelRenderer hair1_r1;
	private final ModelRenderer hair2;
	private final ModelRenderer hair1_r2;
	private final ModelRenderer hair2_1;
	private final ModelRenderer hair2_r2;
	private final ModelRenderer hair2_r3;
	private final ModelRenderer hair3;
	private final ModelRenderer hair1_r3;
	private final ModelRenderer hair2_2;
	private final ModelRenderer hair2_r4;
	private final ModelRenderer hair2_r5;
	private final ModelRenderer hair4;
	private final ModelRenderer hair5;
	private final ModelRenderer hair2_r6;
	private final ModelRenderer hair1_r4;
	private final ModelRenderer hair6;
	private final ModelRenderer hair2_r7;
	private final ModelRenderer hair1_r5;
	private final ModelRenderer hair7;
	private final ModelRenderer hair8;
	private final ModelRenderer hair2_r8;
	private final ModelRenderer hair9;
	private final ModelRenderer hair2_r9;
	private final ModelRenderer hair10;
	private final ModelRenderer hair2_r10;
	private final ModelRenderer hair11;
	private final ModelRenderer hair2_r11;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private float scale = 1.0F;

	public ModelKaioshin(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.2F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.19F));

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(2.8F, -1.5F, -2.0F);
		Head.addChild(ear2);
        ear2.mirror = true;
		setRotationAngle(ear2, 0.0F, -0.5236F, 0.0F);
		ear2.cubeList.add(new ModelBox(ear2, 25, 3, 0.1F, -5.5F, -0.4F, 5, 5, 0, -0.19F));

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(-2.8F, -1.5F, -2.0F);
		Head.addChild(ear1);
		setRotationAngle(ear1, 0.0F, 0.5236F, 0.0F);
		ear1.cubeList.add(new ModelBox(ear1, 25, 3, -5.1F, -5.5F, -0.4F, 5, 5, 0, -0.19F));

		hair = new ModelRenderer(this);
		hair.setRotationPoint(0.3F, 0.0F, 0.0F);
		Head.addChild(hair);


		hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-0.4F, -8.1F, -2.6F);
		hair.addChild(hair1);
		setRotationAngle(hair1, 0.1115F, 0.3033F, -0.0092F);


		hair2_r1 = new ModelRenderer(this);
		hair2_r1.setRotationPoint(-0.3699F, 1.079F, -1.7304F);
		hair1.addChild(hair2_r1);
		setRotationAngle(hair2_r1, 0.9516F, 0.2101F, 0.0863F);
		hair2_r1.cubeList.add(new ModelBox(hair2_r1, 45, -1, -0.7301F, -1.379F, -2.8347F, 2, 2, 3, -0.1F));

		hair1_r1 = new ModelRenderer(this);
		hair1_r1.setRotationPoint(0.0F, 1.6F, -1.1F);
		hair1.addChild(hair1_r1);
		setRotationAngle(hair1_r1, 0.428F, 0.2101F, 0.0863F);
		hair1_r1.cubeList.add(new ModelBox(hair1_r1, 46, -1, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F));

		hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-0.3F, -7.7F, -2.8F);
		hair.addChild(hair2);
		setRotationAngle(hair2, -0.4008F, 0.73F, 0.3088F);


		hair1_r2 = new ModelRenderer(this);
		hair1_r2.setRotationPoint(-0.3699F, 0.179F, -2.8304F);
		hair2.addChild(hair1_r2);
		setRotationAngle(hair1_r2, 0.428F, 0.2101F, 0.0863F);
		hair1_r2.cubeList.add(new ModelBox(hair1_r2, 44, -1, -0.8808F, 0.0039F, -0.9415F, 2, 2, 4, 0.0F));

		hair2_1 = new ModelRenderer(this);
		hair2_1.setRotationPoint(-0.5699F, 0.579F, -3.7304F);
		hair2.addChild(hair2_1);
		setRotationAngle(hair2_1, -0.1571F, 0.0F, 0.0F);


		hair2_r2 = new ModelRenderer(this);
		hair2_r2.setRotationPoint(-0.3F, 2.7F, -0.7F);
		hair2_1.addChild(hair2_r2);
		setRotationAngle(hair2_r2, 1.545F, 0.2101F, 0.0863F);
		hair2_r2.cubeList.add(new ModelBox(hair2_r2, 45, -1, -0.9628F, -0.4241F, -2.9338F, 2, 2, 3, -0.15F));

		hair2_r3 = new ModelRenderer(this);
		hair2_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair2_1.addChild(hair2_r3);
		setRotationAngle(hair2_r3, 1.161F, 0.2101F, 0.0863F);
		hair2_r3.cubeList.add(new ModelBox(hair2_r3, 45, -1, -0.8901F, 0.0307F, -2.9311F, 2, 2, 3, -0.05F));

		hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-0.6F, -7.2F, -2.0F);
		hair.addChild(hair3);
		setRotationAngle(hair3, -1.6205F, 0.8413F, -0.1285F);


		hair1_r3 = new ModelRenderer(this);
		hair1_r3.setRotationPoint(-0.3699F, 0.179F, -2.8304F);
		hair3.addChild(hair1_r3);
		setRotationAngle(hair1_r3, 0.428F, 0.2101F, 0.0863F);
		hair1_r3.cubeList.add(new ModelBox(hair1_r3, 44, -1, -0.8808F, 0.0039F, -0.9415F, 2, 2, 4, 0.0F));

		hair2_2 = new ModelRenderer(this);
		hair2_2.setRotationPoint(-0.5699F, 0.579F, -3.7304F);
		hair3.addChild(hair2_2);
		setRotationAngle(hair2_2, 0.0698F, 0.0F, 0.0F);


		hair2_r4 = new ModelRenderer(this);
		hair2_r4.setRotationPoint(-0.3F, 2.7F, -0.7F);
		hair2_2.addChild(hair2_r4);
		setRotationAngle(hair2_r4, 1.545F, 0.2101F, 0.0863F);
		hair2_r4.cubeList.add(new ModelBox(hair2_r4, 45, -1, -0.9628F, -0.4241F, -2.9338F, 2, 2, 3, -0.1F));

		hair2_r5 = new ModelRenderer(this);
		hair2_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair2_2.addChild(hair2_r5);
		setRotationAngle(hair2_r5, 1.161F, 0.2101F, 0.0863F);
		hair2_r5.cubeList.add(new ModelBox(hair2_r5, 45, -1, -0.8901F, 0.0307F, -2.9311F, 2, 2, 3, -0.05F));

		hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-3.2F, -0.8F, -2.0F);
		hair.addChild(hair4);
		setRotationAngle(hair4, -0.2094F, 0.0F, 0.4014F);


		hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(0.2F, -7.8F, -0.8F);
		hair4.addChild(hair5);
		setRotationAngle(hair5, 1.3263F, 0.0309F, 2.1911F);


		hair2_r6 = new ModelRenderer(this);
		hair2_r6.setRotationPoint(-0.3699F, 1.079F, -1.7304F);
		hair5.addChild(hair2_r6);
		setRotationAngle(hair2_r6, 0.9226F, 0.044F, -0.1403F);
		hair2_r6.cubeList.add(new ModelBox(hair2_r6, 44, -2, -0.7301F, -1.379F, -3.8347F, 2, 2, 4, -0.01F));

		hair1_r4 = new ModelRenderer(this);
		hair1_r4.setRotationPoint(0.0F, 1.6F, -1.1F);
		hair5.addChild(hair1_r4);
		setRotationAngle(hair1_r4, 0.428F, 0.2101F, 0.0863F);
		hair1_r4.cubeList.add(new ModelBox(hair1_r4, 45, -1, -1.0F, -2.0F, -1.0F, 2, 2, 3, 0.0F));

		hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(0.7F, -7.0F, 0.7F);
		hair4.addChild(hair6);
		setRotationAngle(hair6, 1.3905F, -0.0414F, 2.5833F);


		hair2_r7 = new ModelRenderer(this);
		hair2_r7.setRotationPoint(-0.3699F, 0.079F, -2.6304F);
		hair6.addChild(hair2_r7);
		setRotationAngle(hair2_r7, 1.039F, 0.072F, -0.1591F);
		hair2_r7.cubeList.add(new ModelBox(hair2_r7, 45, 0, -0.8336F, -0.0693F, -5.1247F, 2, 2, 5, -0.01F));

		hair1_r5 = new ModelRenderer(this);
		hair1_r5.setRotationPoint(0.0F, 1.6F, -1.1F);
		hair6.addChild(hair1_r5);
		setRotationAngle(hair1_r5, 0.428F, 0.2101F, 0.0863F);
		hair1_r5.cubeList.add(new ModelBox(hair1_r5, 46, -1, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F));

		hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.2F, -7.6F, 1.7F);
		hair.addChild(hair7);
		setRotationAngle(hair7, 0.4445F, 0.0984F, 3.0798F);


		hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-0.9032F, -2.6017F, 0.3049F);
		hair7.addChild(hair8);
		setRotationAngle(hair8, 1.3551F, -0.0112F, -0.0511F);


		hair2_r8 = new ModelRenderer(this);
		hair2_r8.setRotationPoint(-0.5699F, 0.879F, -1.7304F);
		hair8.addChild(hair2_r8);
		setRotationAngle(hair2_r8, 0.9382F, -0.008F, -0.0363F);
		hair2_r8.cubeList.add(new ModelBox(hair2_r8, 44, -2, -0.7301F, -1.379F, -3.8347F, 2, 2, 4, -0.01F));

		hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(-0.7032F, -3.5017F, 0.9049F);
		hair7.addChild(hair9);
		setRotationAngle(hair9, 1.3921F, 0.0F, 0.0F);


		hair2_r9 = new ModelRenderer(this);
		hair2_r9.setRotationPoint(-0.2699F, 0.079F, -2.6304F);
		hair9.addChild(hair2_r9);
		setRotationAngle(hair2_r9, 1.0798F, 0.1486F, 0.1199F);
		hair2_r9.cubeList.add(new ModelBox(hair2_r9, 45, -1, -0.8336F, -0.0693F, -3.1247F, 2, 2, 3, -0.01F));

		hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.1968F, -6.2017F, 1.1049F);
		hair7.addChild(hair10);
		setRotationAngle(hair10, 1.356F, 0.0224F, 0.1023F);


		hair2_r10 = new ModelRenderer(this);
		hair2_r10.setRotationPoint(-0.8699F, 1.079F, -1.7304F);
		hair10.addChild(hair2_r10);
		setRotationAngle(hair2_r10, 0.9516F, 0.0F, 0.0863F);
		hair2_r10.cubeList.add(new ModelBox(hair2_r10, 44, -2, -0.7301F, -1.379F, -3.8347F, 2, 2, 4, -0.01F));

		hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-0.5032F, -6.7017F, 2.3049F);
		hair7.addChild(hair11);
		setRotationAngle(hair11, 1.3925F, 0.0F, -0.0687F);


		hair2_r11 = new ModelRenderer(this);
		hair2_r11.setRotationPoint(-0.4699F, 0.079F, -2.6304F);
		hair11.addChild(hair2_r11);
		setRotationAngle(hair2_r11, 1.077F, 0.1794F, 0.1032F);
		hair2_r11.cubeList.add(new ModelBox(hair2_r11, 45, -1, -0.8336F, -0.0693F, -3.1247F, 2, 2, 3, -0.01F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(3.8F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 32, 48, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.8F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 16, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
