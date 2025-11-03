package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelJs extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	public ModelJs(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		setRotationAngle(hair1, -1.309F, 0.0F, 0.6109F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 42, 2, -0.5133F, -7.474F, -2.0714F, 4, 9, 4, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(hair2, -0.3491F, 0.0F, 0.2618F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 45, 2, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair3, -0.3491F, 0.0F, -0.0873F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 45, 2, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(hair4, 0.0F, 0.0873F, 0.2618F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -3.342F, -3.0F, 2, 6, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(hair5, 2.7925F, 0.0873F, -0.6109F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(hair6, -1.2218F, 0.0F, -0.4363F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -2.1257F, -2.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair7, -0.8727F, 0.0F, 0.5236F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 45, 2, 1.8099F, -1.4417F, -5.0982F, 3, 5, 5, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(hair8, 2.7925F, 0.0873F, -0.4363F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(hair9, 2.7925F, 0.0873F, 0.5236F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(hair10, -2.7053F, 0.3491F, 0.0F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 43, 2, 0.9972F, -6.6289F, -0.1585F, 3, 10, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair11, -2.7053F, -0.2618F, 0.0F);
		Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 42, 2, 0.9972F, -5.6289F, -1.1585F, 3, 10, 3, 0.0F));

        ModelRenderer hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair12, -2.7053F, 0.0F, 0.0F);
		Head.addChild(hair12);
		hair12.cubeList.add(new ModelBox(hair12, 42, 2, 1.9972F, -5.6289F, -4.1585F, 4, 10, 3, 0.0F));

        ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair13, 3.1416F, 0.0F, 0.0F);
		Head.addChild(hair13);
		hair13.cubeList.add(new ModelBox(hair13, 42, 2, 0.9972F, -11.6289F, -3.1585F, 6, 10, 3, 0.0F));

        ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair14, -2.7053F, 0.1745F, -0.2618F);
		Head.addChild(hair14);
		hair14.cubeList.add(new ModelBox(hair14, 42, 2, 4.9972F, -8.6289F, -2.1585F, 4, 10, 3, 0.0F));

        ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(4.0F, -2.0F, 4.0F);
		setRotationAngle(hair15, -2.7053F, -0.1745F, 0.5236F);
		Head.addChild(hair15);
		hair15.cubeList.add(new ModelBox(hair15, 42, 2, -8.9972F, -8.6289F, -2.1585F, 4, 10, 3, 0.0F));

        ModelRenderer hair16 = new ModelRenderer(this);
		hair16.setRotationPoint(4.0F, -2.0F, 4.0F);
		setRotationAngle(hair16, -2.7053F, -0.1745F, 0.9599F);
		Head.addChild(hair16);
		hair16.cubeList.add(new ModelBox(hair16, 42, 2, -8.9972F, -8.6289F, 0.8415F, 3, 7, 3, 0.0F));

        ModelRenderer hair17 = new ModelRenderer(this);
		hair17.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair17, -2.7053F, 0.1745F, -0.9599F);
		Head.addChild(hair17);
		hair17.cubeList.add(new ModelBox(hair17, 42, 2, 5.9972F, -8.6289F, 0.8415F, 3, 7, 3, 0.0F));

        ModelRenderer hair18 = new ModelRenderer(this);
		hair18.setRotationPoint(0.3F, -6.0F, 4.0F);
		setRotationAngle(hair18, -2.9671F, -0.1745F, 0.0873F);
		Head.addChild(hair18);
		hair18.cubeList.add(new ModelBox(hair18, 42, 2, -3.9972F, -14.6289F, -2.1585F, 3, 9, 3, 0.0F));

        ModelRenderer hair19 = new ModelRenderer(this);
		hair19.setRotationPoint(0.0F, -4.0F, 4.0F);
		setRotationAngle(hair19, -2.9671F, 0.1745F, -0.0873F);
		Head.addChild(hair19);
		hair19.cubeList.add(new ModelBox(hair19, 42, 2, 0.9972F, -13.6289F, -2.1585F, 3, 8, 3, 0.0F));

        ModelRenderer strand1 = new ModelRenderer(this);
		strand1.setRotationPoint(-5.0F, -13.5F, -0.3F);
		setRotationAngle(strand1, -0.2618F, 0.0F, 0.0F);
		Head.addChild(strand1);
		strand1.cubeList.add(new ModelBox(strand1, 38, 2, 3.9972F, 3.029F, -2.2188F, 2, 5, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer RShoulderArmor = new ModelRenderer(this);
		RShoulderArmor.setRotationPoint(-3.0F, -1.7F, 0.0F);
		setRotationAngle(RShoulderArmor, -1.5708F, 0.0F, 0.1047F);
		RArm.addChild(RShoulderArmor);
		RShoulderArmor.cubeList.add(new ModelBox(RShoulderArmor, 24, 0, -3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer LShoulderArmor = new ModelRenderer(this);
		LShoulderArmor.setRotationPoint(11.0F, -1.7F, 0.0F);
		LShoulderArmor.mirror = true;
		setRotationAngle(LShoulderArmor, -1.5708F, 0.0F, -0.1047F);
		LArm.addChild(LShoulderArmor);
		LShoulderArmor.cubeList.add(new ModelBox(LShoulderArmor, 24, 0, -3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F));

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
        this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
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
