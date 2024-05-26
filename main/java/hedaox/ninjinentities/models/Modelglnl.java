package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Modelglnl extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer SSJ3;
	private final ModelRenderer hair24;
	private final ModelRenderer hair25;
	private final ModelRenderer hair26;
	private final ModelRenderer hair27;
	private final ModelRenderer hair28;
	private final ModelRenderer hair29;
	private final ModelRenderer hair30;
	private final ModelRenderer hair31;
	private final ModelRenderer hair32;
	private final ModelRenderer hair34;
	private final ModelRenderer hair35;
	private final ModelRenderer hair36;
	private final ModelRenderer hair37;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair20;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair8;
	private final ModelRenderer bone4;
	private final ModelRenderer bone19;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair7;
	private final ModelRenderer Hair9;
	private final ModelRenderer Hair13;
	private final ModelRenderer Hair14;
	private final ModelRenderer Hair15;
	private final ModelRenderer Hair16;
	private final ModelRenderer Hair17;
	private final ModelRenderer Hair17_r1;
	private final ModelRenderer Hair18;
	private final ModelRenderer Hair19;
	private final ModelRenderer bone1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer Body;
	private final ModelRenderer LArm;
	private final ModelRenderer RArm;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	private float scale = 1.0F;

	public Modelglnl(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		SSJ3 = new ModelRenderer(this);
		SSJ3.setRotationPoint(0.0F, -8.0F, 1.0F);
		Head.addChild(SSJ3);
		setRotationAngle(SSJ3, 0.0436F, 0.0F, 0.0F);


		hair24 = new ModelRenderer(this);
		hair24.setRotationPoint(2.0F, -7.0F, 0.0F);
		SSJ3.addChild(hair24);
		setRotationAngle(hair24, 0.0F, 0.0873F, 0.2618F);
		hair24.cubeList.add(new ModelBox(hair24, 47, 2, 3.1514F, 4.3781F, -3.167F, 2, 6, 3, 0.0F));

		hair25 = new ModelRenderer(this);
		hair25.setRotationPoint(-5.0F, -6.0F, -2.0F);
		SSJ3.addChild(hair25);
		setRotationAngle(hair25, 2.7925F, 0.0873F, -0.6109F);
		hair25.cubeList.add(new ModelBox(hair25, 47, 2, -4.5394F, -10.3785F, -4.7561F, 3, 6, 3, 0.0F));

		hair26 = new ModelRenderer(this);
		hair26.setRotationPoint(-5.0F, -7.0F, 4.0F);
		SSJ3.addChild(hair26);
		setRotationAngle(hair26, -1.2218F, 0.0F, -0.4363F);
		hair26.cubeList.add(new ModelBox(hair26, 47, 2, -1.5676F, 0.679F, 4.469F, 3, 6, 3, 0.0F));

		hair27 = new ModelRenderer(this);
		hair27.setRotationPoint(-1.0F, -10.0F, 4.0F);
		SSJ3.addChild(hair27);
		setRotationAngle(hair27, -0.8727F, 0.0F, 0.5236F);
		hair27.cubeList.add(new ModelBox(hair27, 47, 2, 5.8061F, 3.2744F, -0.0199F, 3, 5, 5, 0.0F));

		hair28 = new ModelRenderer(this);
		hair28.setRotationPoint(-5.0F, -7.0F, 2.0F);
		SSJ3.addChild(hair28);
		setRotationAngle(hair28, 2.7925F, 0.0873F, -0.4363F);
		hair28.cubeList.add(new ModelBox(hair28, 47, 2, -3.337F, -10.9973F, -5.0933F, 3, 6, 3, 0.0F));

		hair29 = new ModelRenderer(this);
		hair29.setRotationPoint(3.0F, -8.0F, 2.0F);
		SSJ3.addChild(hair29);
		setRotationAngle(hair29, 2.7925F, 0.0873F, 0.5236F);
		hair29.cubeList.add(new ModelBox(hair29, 47, 2, 4.0086F, -10.4748F, -5.5873F, 3, 6, 3, 0.0F));

		hair30 = new ModelRenderer(this);
		hair30.setRotationPoint(0.0F, -2.0F, 6.0F);
		SSJ3.addChild(hair30);
		setRotationAngle(hair30, -2.7053F, 0.3491F, 0.0F);
		hair30.cubeList.add(new ModelBox(hair30, 45, 2, 1.1165F, -8.7341F, 3.5159F, 3, 5, 3, 0.0F));

		hair31 = new ModelRenderer(this);
		hair31.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair31);
		setRotationAngle(hair31, -2.7053F, -0.2618F, 0.0F);
		hair31.cubeList.add(new ModelBox(hair31, 44, 2, 0.907F, -7.7303F, 2.5242F, 3, 5, 3, 0.0F));

		hair32 = new ModelRenderer(this);
		hair32.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair32);
		setRotationAngle(hair32, -2.7053F, 0.0F, 0.0F);
		hair32.cubeList.add(new ModelBox(hair32, 44, 2, 1.9972F, -6.7253F, -0.465F, 4, 4, 3, 0.0F));

		hair34 = new ModelRenderer(this);
		hair34.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair34);
		setRotationAngle(hair34, -2.7053F, 0.1745F, -0.2618F);
		hair34.cubeList.add(new ModelBox(hair34, 44, 2, 3.0206F, -10.3289F, 1.7406F, 4, 5, 3, 0.0F));

		hair35 = new ModelRenderer(this);
		hair35.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair35);
		setRotationAngle(hair35, -2.7053F, -0.1745F, 0.5236F);
		hair35.cubeList.add(new ModelBox(hair35, 44, 2, -4.1222F, -9.4638F, 1.7065F, 3, 5, 3, 0.0F));

		hair36 = new ModelRenderer(this);
		hair36.setRotationPoint(4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair36);
		setRotationAngle(hair36, -2.7053F, -0.1745F, 0.9599F);
		hair36.cubeList.add(new ModelBox(hair36, 44, 2, -2.6103F, -9.1585F, 4.1202F, 3, 4, 3, 0.0F));

		hair37 = new ModelRenderer(this);
		hair37.setRotationPoint(-4.0F, -2.0F, 4.0F);
		SSJ3.addChild(hair37);
		setRotationAngle(hair37, -2.7053F, 0.1745F, -0.9599F);
		hair37.cubeList.add(new ModelBox(hair37, 44, 2, -0.3897F, -9.1585F, 4.1202F, 3, 4, 3, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-2.1F, -0.7F, 0.5F);
		SSJ3.addChild(Hair1);
		setRotationAngle(Hair1, -0.3054F, 0.0F, -0.3491F);
		Hair1.cubeList.add(new ModelBox(Hair1, 42, 4, -2.4F, -0.6987F, -3.9075F, 4, 3, 4, 0.0F));

		Hair20 = new ModelRenderer(this);
		Hair20.setRotationPoint(1.3892F, -2.2882F, 3.4164F);
		SSJ3.addChild(Hair20);
		setRotationAngle(Hair20, -1.2217F, 0.0F, -0.0873F);
		Hair20.cubeList.add(new ModelBox(Hair20, 40, 4, -1.0F, -0.6206F, -1.684F, 2, 5, 2, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(0.5F, -0.5F, -1.0F);
		SSJ3.addChild(Hair2);
		setRotationAngle(Hair2, -0.4363F, 0.0F, 0.0436F);
		Hair2.cubeList.add(new ModelBox(Hair2, 42, 4, -1.5F, -0.6132F, -3.1126F, 4, 3, 2, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(5.0F, 1.0F, -1.0F);
		SSJ3.addChild(Hair8);
		setRotationAngle(Hair8, -0.48F, 0.0F, 0.3927F);
		Hair8.cubeList.add(new ModelBox(Hair8, 47, 3, -4.3F, -0.2764F, -2.2006F, 4, 4, 3, 0.0F));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-6.0F, -1.6F, 2.5F);
		Hair8.addChild(bone4);
		setRotationAngle(bone4, -0.3491F, 0.0873F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 43, 5, -3.7459F, -0.9408F, -2.8677F, 4, 5, 3, 0.0F));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-6.3827F, -3.343F, 3.8474F);
		Hair8.addChild(bone19);
		setRotationAngle(bone19, -0.3491F, 0.3491F, -0.6545F);
		bone19.cubeList.add(new ModelBox(bone19, 43, 5, -2.6388F, -0.8539F, -2.8734F, 3, 5, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(Hair4);
		setRotationAngle(Hair4, -0.5236F, 0.0F, 0.0F);
		Hair4.cubeList.add(new ModelBox(Hair4, 48, 4, -1.5F, -1.0F, -2.032F, 3, 3, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(Hair5);
		setRotationAngle(Hair5, -0.6545F, 0.0F, 0.0F);
		Hair5.cubeList.add(new ModelBox(Hair5, 40, 4, -1.0F, -3.1485F, -1.2207F, 2, 3, 2, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(5.0F, 0.0F, -2.0F);
		SSJ3.addChild(Hair6);
		setRotationAngle(Hair6, -0.4799F, 0.0F, 0.1745F);
		Hair6.cubeList.add(new ModelBox(Hair6, 48, 2, -4.4F, -2.0766F, -0.2741F, 4, 3, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(1.0F, -1.5F, 3.5F);
		SSJ3.addChild(Hair7);
		setRotationAngle(Hair7, -0.0436F, 0.0F, 0.0F);
		Hair7.cubeList.add(new ModelBox(Hair7, 42, 3, -2.2F, -1.6128F, -3.5981F, 4, 4, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(2.2F, 0.0F, 2.6F);
		SSJ3.addChild(Hair9);
		setRotationAngle(Hair9, -0.672F, 0.0F, 0.2182F);
		Hair9.cubeList.add(new ModelBox(Hair9, 50, 2, -1.7F, -1.1549F, -3.6652F, 3, 6, 3, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(0.0F, 1.5F, 5.0F);
		SSJ3.addChild(Hair13);
		setRotationAngle(Hair13, -0.3927F, 0.0F, 0.0F);
		Hair13.cubeList.add(new ModelBox(Hair13, 41, 7, -2.0F, -0.7346F, -3.1578F, 4, 4, 2, 0.0F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(3.5F, -0.5F, 4.5F);
		SSJ3.addChild(Hair14);
		setRotationAngle(Hair14, -0.2182F, 0.1187F, 0.0F);
		Hair14.cubeList.add(new ModelBox(Hair14, 49, 5, -3.0632F, 0.4299F, -3.9888F, 4, 5, 3, 0.0F));

		Hair15 = new ModelRenderer(this);
		Hair15.setRotationPoint(-3.0F, 0.0F, 3.5F);
		SSJ3.addChild(Hair15);
		setRotationAngle(Hair15, -0.2182F, -0.1833F, 0.0F);
		Hair15.cubeList.add(new ModelBox(Hair15, 49, 5, -1.3646F, -1.5743F, -3.3199F, 4, 6, 3, 0.0F));

		Hair16 = new ModelRenderer(this);
		Hair16.setRotationPoint(-3.0F, 0.0F, 3.5F);
		SSJ3.addChild(Hair16);
		setRotationAngle(Hair16, -0.2182F, -0.1833F, 0.0F);
		Hair16.cubeList.add(new ModelBox(Hair16, 49, 5, -0.2646F, -3.5269F, -3.7528F, 3, 4, 3, 0.0F));

		Hair17 = new ModelRenderer(this);
		Hair17.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(Hair17);
		setRotationAngle(Hair17, -0.5236F, 0.0F, -0.0873F);


		Hair17_r1 = new ModelRenderer(this);
		Hair17_r1.setRotationPoint(-1.5F, -3.2902F, 3.2F);
		Hair17.addChild(Hair17_r1);
		setRotationAngle(Hair17_r1, -0.4363F, 0.0F, 0.0F);
		Hair17_r1.cubeList.add(new ModelBox(Hair17_r1, 40, 4, -1.0F, -0.8617F, -2.1472F, 2, 5, 2, 0.0F));

		Hair18 = new ModelRenderer(this);
		Hair18.setRotationPoint(1.0F, -2.0F, 0.0F);
		SSJ3.addChild(Hair18);
		setRotationAngle(Hair18, -2.0071F, 0.0F, 0.0F);
		Hair18.cubeList.add(new ModelBox(Hair18, 48, 4, -1.5F, 0.8126F, -0.4548F, 3, 2, 3, 0.0F));

		Hair19 = new ModelRenderer(this);
		Hair19.setRotationPoint(-1.2151F, -2.3399F, 0.2173F);
		SSJ3.addChild(Hair19);
		setRotationAngle(Hair19, -0.2753F, 0.5737F, 0.1595F);
		Hair19.cubeList.add(new ModelBox(Hair19, 40, 4, 0.0855F, -1.0434F, -2.6165F, 2, 3, 2, 0.0F));

		bone1 = new ModelRenderer(this);
		bone1.setRotationPoint(-0.3171F, -1.3105F, -3.52F);
		SSJ3.addChild(bone1);
		setRotationAngle(bone1, -0.7941F, 0.476F, 0.6803F);


		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(0.3171F, 33.3105F, 2.52F);
		bone1.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, -0.0436F, 0.0F);


		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.7141F, -1.4245F, -5.1921F);
		SSJ3.addChild(bone3);
		setRotationAngle(bone3, -0.7778F, -0.4431F, 1.5161F);


		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-0.6141F, 0.0F, 1.3921F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.6109F, 0.0F);


		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5284F, -2.1338F, -4.9196F);
		SSJ3.addChild(bone5);
		setRotationAngle(bone5, -0.8459F, 0.5578F, 0.5784F);


		bone7_r1 = new ModelRenderer(this);
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