package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Modelglnl extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer LArm;
	private final ModelRenderer RArm;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;

    public Modelglnl(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer SSJ3 = new ModelRenderer(this);
		SSJ3.setRotationPoint(0.0F, -8.0F, 1.0F);
		Head.addChild(SSJ3);
		setRotationAngle(SSJ3, 0.0436F, 0.0F, 0.0F);


        ModelRenderer hair24 = new ModelRenderer(this);
		hair24.setRotationPoint(2.0F, -7.0F, 0.0F);
		SSJ3.addChild(hair24);
		setRotationAngle(hair24, 0.0F, 0.0873F, 0.2618F);
		hair24.cubeList.add(new ModelBox(hair24, 47, 2, 3.1514F, 4.3781F, -3.167F, 2, 6, 3, 0.0F));

        ModelRenderer hair25 = new ModelRenderer(this);
		hair25.setRotationPoint(-5.0F, -6.0F, -2.0F);
		SSJ3.addChild(hair25);
		setRotationAngle(hair25, 2.7925F, 0.0873F, -0.6109F);
		hair25.cubeList.add(new ModelBox(hair25, 47, 2, -4.5394F, -10.3785F, -4.7561F, 3, 6, 3, 0.0F));

        ModelRenderer hair26 = new ModelRenderer(this);
		hair26.setRotationPoint(-5.0F, -7.0F, 4.0F);
		SSJ3.addChild(hair26);
		setRotationAngle(hair26, -1.2218F, 0.0F, -0.4363F);
		hair26.cubeList.add(new ModelBox(hair26, 47, 2, -1.5676F, 0.679F, 4.469F, 3, 6, 3, 0.0F));

        ModelRenderer hair27 = new ModelRenderer(this);
		hair27.setRotationPoint(-1.0F, -10.0F, 4.0F);
		SSJ3.addChild(hair27);
		setRotationAngle(hair27, -0.8727F, 0.0F, 0.5236F);
		hair27.cubeList.add(new ModelBox(hair27, 47, 2, 5.8061F, 3.2744F, -0.0199F, 3, 5, 5, 0.0F));

        ModelRenderer hair28 = new ModelRenderer(this);
		hair28.setRotationPoint(-5.0F, -7.0F, 2.0F);
		SSJ3.addChild(hair28);
		setRotationAngle(hair28, 2.7925F, 0.0873F, -0.4363F);
		hair28.cubeList.add(new ModelBox(hair28, 47, 2, -3.337F, -10.9973F, -5.0933F, 3, 6, 3, 0.0F));

        ModelRenderer hair29 = new ModelRenderer(this);
		hair29.setRotationPoint(3.0F, -8.0F, 2.0F);
		SSJ3.addChild(hair29);
		setRotationAngle(hair29, 2.7925F, 0.0873F, 0.5236F);
		hair29.cubeList.add(new ModelBox(hair29, 47, 2, 4.0086F, -10.4748F, -5.5873F, 3, 6, 3, 0.0F));

        ModelRenderer hair30 = new ModelRenderer(this);
		hair30.setRotationPoint(0.0F, -2.0F, 6.0F);
		SSJ3.addChild(hair30);
		setRotationAngle(hair30, -2.7053F, 0.3491F, 0.0F);
		hair30.cubeList.add(new ModelBox(hair30, 45, 2, 1.1165F, -8.7341F, 3.5159F, 3, 5, 3, 0.0F));

        ModelRenderer hair31 = new ModelRenderer(this);
		hair31.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair31);
		setRotationAngle(hair31, -2.7053F, -0.2618F, 0.0F);
		hair31.cubeList.add(new ModelBox(hair31, 44, 2, 0.907F, -7.7303F, 2.5242F, 3, 5, 3, 0.0F));

        ModelRenderer hair32 = new ModelRenderer(this);
		hair32.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair32);
		setRotationAngle(hair32, -2.7053F, 0.0F, 0.0F);
		hair32.cubeList.add(new ModelBox(hair32, 44, 2, 1.9972F, -6.7253F, -0.465F, 4, 4, 3, 0.0F));

        ModelRenderer hair34 = new ModelRenderer(this);
		hair34.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair34);
		setRotationAngle(hair34, -2.7053F, 0.1745F, -0.2618F);
		hair34.cubeList.add(new ModelBox(hair34, 44, 2, 3.0206F, -10.3289F, 1.7406F, 4, 5, 3, 0.0F));

        ModelRenderer hair35 = new ModelRenderer(this);
		hair35.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair35);
		setRotationAngle(hair35, -2.7053F, -0.1745F, 0.5236F);
		hair35.cubeList.add(new ModelBox(hair35, 44, 2, -4.1222F, -9.4638F, 1.7065F, 3, 5, 3, 0.0F));

        ModelRenderer hair36 = new ModelRenderer(this);
		hair36.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair36);
		setRotationAngle(hair36, -2.7053F, -0.1745F, 0.9599F);
		hair36.cubeList.add(new ModelBox(hair36, 44, 2, -2.6103F, -9.1585F, 4.1202F, 3, 4, 3, 0.0F));

        ModelRenderer hair37 = new ModelRenderer(this);
		hair37.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair37);
		setRotationAngle(hair37, -2.7053F, 0.1745F, -0.9599F);
		hair37.cubeList.add(new ModelBox(hair37, 44, 2, -0.3897F, -9.1585F, 4.1202F, 3, 4, 3, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-2.1F, -0.7F, 0.5F);
		SSJ3.addChild(hair1);
		setRotationAngle(hair1, -0.3054F, 0.0F, -0.3491F);
		hair1.cubeList.add(new ModelBox(hair1, 42, 4, -2.4F, -0.6987F, -3.9075F, 4, 3, 4, 0.0F));

        ModelRenderer hair20 = new ModelRenderer(this);
		hair20.setRotationPoint(1.3892F, -2.2882F, 3.4164F);
		SSJ3.addChild(hair20);
		setRotationAngle(hair20, -1.2217F, 0.0F, -0.0873F);
		hair20.cubeList.add(new ModelBox(hair20, 40, 4, -1.0F, -0.6206F, -1.684F, 2, 5, 2, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(0.5F, -0.5F, -1.0F);
		SSJ3.addChild(hair2);
		setRotationAngle(hair2, -0.4363F, 0.0F, 0.0436F);
		hair2.cubeList.add(new ModelBox(hair2, 42, 4, -1.5F, -0.6132F, -3.1126F, 4, 3, 2, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(5.0F, 1.0F, -1.0F);
		SSJ3.addChild(hair8);
		setRotationAngle(hair8, -0.48F, 0.0F, 0.3927F);
		hair8.cubeList.add(new ModelBox(hair8, 47, 3, -4.3F, -0.2764F, -2.2006F, 4, 4, 3, 0.0F));

        ModelRenderer bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-6.0F, -1.6F, 2.5F);
		hair8.addChild(bone4);
		setRotationAngle(bone4, -0.3491F, 0.0873F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 43, 5, -3.7459F, -0.9408F, -2.8677F, 4, 5, 3, 0.0F));

        ModelRenderer bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-6.3827F, -3.343F, 3.8474F);
		hair8.addChild(bone19);
		setRotationAngle(bone19, -0.3491F, 0.3491F, -0.6545F);
		bone19.cubeList.add(new ModelBox(bone19, 43, 5, -2.6388F, -0.8539F, -2.8734F, 3, 5, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(hair4);
		setRotationAngle(hair4, -0.5236F, 0.0F, 0.0F);
		hair4.cubeList.add(new ModelBox(hair4, 48, 4, -1.5F, -1.0F, -2.032F, 3, 3, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(hair5);
		setRotationAngle(hair5, -0.6545F, 0.0F, 0.0F);
		hair5.cubeList.add(new ModelBox(hair5, 40, 4, -1.0F, -3.1485F, -1.2207F, 2, 3, 2, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(5.0F, 0.0F, -2.0F);
		SSJ3.addChild(hair6);
		setRotationAngle(hair6, -0.4799F, 0.0F, 0.1745F);
		hair6.cubeList.add(new ModelBox(hair6, 48, 2, -4.4F, -2.0766F, -0.2741F, 4, 3, 3, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(1.0F, -1.5F, 3.5F);
		SSJ3.addChild(hair7);
		setRotationAngle(hair7, -0.0436F, 0.0F, 0.0F);
		hair7.cubeList.add(new ModelBox(hair7, 42, 3, -2.2F, -1.6128F, -3.5981F, 4, 4, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(2.2F, 0.0F, 2.6F);
		SSJ3.addChild(hair9);
		setRotationAngle(hair9, -0.672F, 0.0F, 0.2182F);
		hair9.cubeList.add(new ModelBox(hair9, 50, 2, -1.7F, -1.1549F, -3.6652F, 3, 6, 3, 0.0F));

        ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(0.0F, 1.5F, 5.0F);
		SSJ3.addChild(hair13);
		setRotationAngle(hair13, -0.3927F, 0.0F, 0.0F);
		hair13.cubeList.add(new ModelBox(hair13, 41, 7, -2.0F, -0.7346F, -3.1578F, 4, 4, 2, 0.0F));

        ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(3.5F, -0.5F, 4.5F);
		SSJ3.addChild(hair14);
		setRotationAngle(hair14, -0.2182F, 0.1187F, 0.0F);
		hair14.cubeList.add(new ModelBox(hair14, 49, 5, -3.0632F, 0.4299F, -3.9888F, 4, 5, 3, 0.0F));

        ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(-3.0F, 0.0F, 3.5F);
		SSJ3.addChild(hair15);
		setRotationAngle(hair15, -0.2182F, -0.1833F, 0.0F);
		hair15.cubeList.add(new ModelBox(hair15, 49, 5, -1.3646F, -1.5743F, -3.3199F, 4, 6, 3, 0.0F));

        ModelRenderer hair16 = new ModelRenderer(this);
		hair16.setRotationPoint(-3.0F, 0.0F, 3.5F);
		SSJ3.addChild(hair16);
		setRotationAngle(hair16, -0.2182F, -0.1833F, 0.0F);
		hair16.cubeList.add(new ModelBox(hair16, 49, 5, -0.2646F, -3.5269F, -3.7528F, 3, 4, 3, 0.0F));

        ModelRenderer hair17 = new ModelRenderer(this);
		hair17.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(hair17);
		setRotationAngle(hair17, -0.5236F, 0.0F, -0.0873F);


        ModelRenderer hair17_r1 = new ModelRenderer(this);
		hair17_r1.setRotationPoint(-1.5F, -3.2902F, 3.2F);
		hair17.addChild(hair17_r1);
		setRotationAngle(hair17_r1, -0.4363F, 0.0F, 0.0F);
		hair17_r1.cubeList.add(new ModelBox(hair17_r1, 40, 4, -1.0F, -0.8617F, -2.1472F, 2, 5, 2, 0.0F));

        ModelRenderer hair18 = new ModelRenderer(this);
		hair18.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(hair18);
		setRotationAngle(hair18, -2.0071F, 0.0F, 0.0F);
		hair18.cubeList.add(new ModelBox(hair18, 48, 4, -1.5F, 0.8126F, -0.4548F, 3, 2, 3, 0.0F));

        ModelRenderer hair19 = new ModelRenderer(this);
		hair19.setRotationPoint(-1.2151F, -2.3399F, 0.2173F);
		SSJ3.addChild(hair19);
		setRotationAngle(hair19, -0.2753F, 0.5737F, 0.1595F);
		hair19.cubeList.add(new ModelBox(hair19, 40, 4, 0.0855F, -1.0434F, -2.6165F, 2, 3, 2, 0.0F));

        ModelRenderer bone1 = new ModelRenderer(this);
		bone1.setRotationPoint(-0.3171F, -1.3105F, -3.52F);
		SSJ3.addChild(bone1);
		setRotationAngle(bone1, -0.7941F, 0.476F, 0.6803F);


        ModelRenderer bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(0.3171F, 33.3105F, 2.52F);
		bone1.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, -0.0436F, 0.0F);


        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.7141F, -1.4245F, -5.1921F);
		SSJ3.addChild(bone3);
		setRotationAngle(bone3, -0.7778F, -0.4431F, 1.5161F);


        ModelRenderer bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-0.6141F, 0.0F, 1.3921F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.6109F, 0.0F);


        ModelRenderer bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5284F, -2.1338F, -4.9196F);
		SSJ3.addChild(bone5);
		setRotationAngle(bone5, -0.8459F, 0.5578F, 0.5784F);


        ModelRenderer bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(2.2785F, -0.4162F, -2.1804F);
		bone5.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.2182F, 0.0F);


		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(4.8F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(0.8F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -1.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
        float scale = 1.0F;
        GL11.glScalef(scale, scale, scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale /0.45F,1.88F)))), 0.0F);
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
