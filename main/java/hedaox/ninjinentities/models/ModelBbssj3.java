package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBbssj3 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;

	private float scale = 1.0F;

	public ModelBbssj3(float _scale) {
		this.textureWidth = 128;
		this.textureHeight = 64;

		scale = _scale;

		this.Head = new ModelRenderer(this);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.3171F, -9.3105F, -4.52F);
		Head.addChild(bone2);
		setRotationAngle(bone2, -0.7941F, 0.476F, 0.6803F);


		ModelRenderer bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(0.3171F, 33.3105F, 2.52F);
		bone2.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, -0.0436F, 0.0F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 54, 5, -1.17F, -34.7F, -4.73F, 2, 2, 3, 0.0F));

		ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(3.5F, -5.5F, 1.5F);
		Head.addChild(hair10);
		setRotationAngle(hair10, -0.1745F, 0.0F, 0.7854F);
		hair10.cubeList.add(new ModelBox(hair10, 48, 1, -1.4388F, -0.9F, -1.4F, 3, 2, 3, 0.0F));

		ModelRenderer hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(3.5F, -8.5F, 3.5F);
		Head.addChild(hair14);
		setRotationAngle(hair14, -0.2182F, 0.1187F, 0.0F);
		hair14.cubeList.add(new ModelBox(hair14, 47, 5, -3.3F, 0.0F, -2.05F, 4, 5, 3, 0.0F));

		ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(5.0F, -7.0F, -2.0F);
		Head.addChild(hair3);
		setRotationAngle(hair3, -0.48F, 0.0F, 0.3927F);
		hair3.cubeList.add(new ModelBox(hair3, 45, 3, -4.3F, -1.2F, -0.4266F, 4, 4, 3, 0.0F));

		ModelRenderer bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-6.0F, -1.6F, 2.5F);
		hair3.addChild(bone4);
		setRotationAngle(bone4, -0.3491F, 0.0873F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 41, 5, -3.25F, -2.1784F, -1.3769F, 4, 5, 3, 0.0F));

		ModelRenderer bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-6.3827F, -3.343F, 3.8474F);
		hair3.addChild(bone19);
		setRotationAngle(bone19, -0.3491F, 0.3491F, -0.6545F);
		bone19.cubeList.add(new ModelBox(bone19, 41, 5, -2.7173F, -2.1784F, -1.3769F, 3, 5, 3, 0.0F));

		ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(5.0F, -8.0F, -3.0F);
		Head.addChild(hair6);
		setRotationAngle(hair6, -0.4799F, 0.0F, 0.1745F);
		hair6.cubeList.add(new ModelBox(hair6, 46, 2, -4.4F, -3.0F, 1.5F, 4, 3, 3, 0.0F));

		ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(2.2F, -8.0F, 1.6F);
		Head.addChild(hair9);
		setRotationAngle(hair9, -0.672F, 0.0F, 0.2182F);
		hair9.cubeList.add(new ModelBox(hair9, 48, 2, -1.7F, -2.4F, -2.1F, 3, 6, 3, 0.0F));

		ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(1.0F, -10.0F, -1.0F);
		Head.addChild(hair5);
		setRotationAngle(hair5, -0.6545F, 0.0F, 0.0F);
		hair5.cubeList.add(new ModelBox(hair5, 38, 4, -1.0F, -4.366F, 0.366F, 2, 3, 2, 0.0F));

		ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(1.0F, -8.0F, -1.0F);
		Head.addChild(hair4);
		setRotationAngle(hair4, -0.5236F, 0.0F, 0.0F);
		hair4.cubeList.add(new ModelBox(hair4, 46, 4, -1.5F, -2.0F, -0.3F, 3, 3, 3, 0.0F));

		ModelRenderer hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(-3.0F, -8.0F, 2.5F);
		Head.addChild(hair15);
		setRotationAngle(hair15, -0.2182F, -0.1833F, 0.0F);
		hair15.cubeList.add(new ModelBox(hair15, 47, 5, -1.0F, -2.0F, -1.4F, 4, 6, 3, 0.0F));

		ModelRenderer hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(0.0F, -6.5F, 4.0F);
		Head.addChild(hair13);
		setRotationAngle(hair13, -0.3927F, 0.0F, 0.0F);
		hair13.cubeList.add(new ModelBox(hair13, 39, 7, -2.0F, -1.5F, -1.31F, 4, 4, 2, 0.0F));

		ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-3.5929F, -5.9F, 1.3044F);
		Head.addChild(hair11);
		setRotationAngle(hair11, -1.4835F, 0.0F, 0.7854F);
		hair11.cubeList.add(new ModelBox(hair11, 48, 1, -0.9071F, -1.4F, -1.5F, 3, 3, 3, 0.0F));

		ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-2.1F, -8.7F, -0.5F);
		Head.addChild(hair1);
		setRotationAngle(hair1, -0.3054F, 0.0F, -0.3491F);
		hair1.cubeList.add(new ModelBox(hair1, 40, 4, -2.4F, -1.3F, -2.0F, 4, 3, 4, 0.0F));

		ModelRenderer bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.0036F, -6.8F, -3.8536F);
		Head.addChild(bone6);
		setRotationAngle(bone6, 0.656F, -0.683F, -0.4463F);
		bone6.cubeList.add(new ModelBox(bone6, 54, 5, -0.3964F, -2.505F, -0.3964F, 2, 3, 2, 0.0F));

		ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.7141F, -9.4245F, -6.1921F);
		Head.addChild(bone3);
		setRotationAngle(bone3, -0.7778F, -0.4431F, 1.5161F);


		ModelRenderer bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-0.6141F, 0.0F, 1.3921F);
		bone3.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.6109F, 0.0F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 54, 5, -1.5F, -1.0F, -2.0F, 2, 2, 2, 0.0F));

		ModelRenderer bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.5284F, -10.1338F, -5.9196F);
		Head.addChild(bone7);
		setRotationAngle(bone7, -0.8459F, 0.5578F, 0.5784F);


		ModelRenderer bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(2.2785F, -0.4162F, -2.1804F);
		bone7.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.2182F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 54, 5, -2.2069F, -1.0F, -0.7F, 3, 2, 2, 0.0F));

		ModelRenderer bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.9964F, -6.8F, -1.8536F);
		Head.addChild(bone8);
		setRotationAngle(bone8, 0.656F, -0.683F, -0.4463F);
		bone8.cubeList.add(new ModelBox(bone8, 54, 5, -0.3964F, -2.505F, -0.3964F, 2, 2, 2, 0.0F));

		ModelRenderer bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.5052F, -9.3102F, -2.7932F);
		Head.addChild(bone9);
		setRotationAngle(bone9, 0.3506F, -0.683F, -0.4463F);
		bone9.cubeList.add(new ModelBox(bone9, 54, 5, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F));

		ModelRenderer bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(2.871F, -9.2022F, -4.2502F);
		Head.addChild(bone10);
		setRotationAngle(bone10, 0.7433F, -0.683F, -0.4463F);
		bone10.cubeList.add(new ModelBox(bone10, 54, 5, -1.0F, -0.8978F, -2.0998F, 2, 2, 3, 0.0F));

		ModelRenderer bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(4.3576F, -9.2548F, -5.3957F);
		Head.addChild(bone11);
		setRotationAngle(bone11, 0.7433F, -0.683F, -0.4463F);
		bone11.cubeList.add(new ModelBox(bone11, 54, 5, -1.3348F, -0.2751F, -1.8043F, 2, 2, 2, 0.0F));

		ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(1.0F, -10.0F, -1.0F);
		Head.addChild(hair2);
		setRotationAngle(hair2, -2.0071F, 0.0F, 0.0F);
		hair2.cubeList.add(new ModelBox(hair2, 46, 4, -1.5F, -1.0F, -1.3F, 3, 3, 3, 0.0F));

		ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-2.0F, -8.4422F, -2.1716F);
		this.Head.addChild(hair7);
		this.setRotationAngle(hair7, -0.2926F, 0.6575F, 0.1295F);
		hair7.cubeList.add(new ModelBox(hair7, 38, 4, -0.81F, -1.5F, -1.0F, 2, 3, 2, 0.0F));

		ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-1.2151F, -10.3399F, -0.7827F);
		this.Head.addChild(hair8);
		this.setRotationAngle(hair8, -0.2753F, 0.5737F, 0.1595F);
		hair8.cubeList.add(new ModelBox(hair8, 38, 4, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F));

		this.Body = new ModelRenderer(this);
		this.Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		this.LLeg = new ModelRenderer(this);
		this.LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		this.LLeg.mirror = true;
		this.Body.addChild(this.LLeg);
		this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		this.RLeg = new ModelRenderer(this);
		this.RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		this.Body.addChild(this.RLeg);
		this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		this.RArm = new ModelRenderer(this);
		this.RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		this.Body.addChild(this.RArm);
		this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		this.LArm = new ModelRenderer(this);
		this.LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		this.LArm.mirror = true;
		this.Body.addChild(this.LArm);
		this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		ModelRenderer right = new ModelRenderer(this);
		right.setRotationPoint(0.0F, -2.05F, -2.0F);
		this.LArm.addChild(right);
		right.cubeList.add(new ModelBox(right, 68, 13, -5.0F, -0.1F, -0.5F, 5, 0, 5, 0.0F));
		right.cubeList.add(new ModelBox(right, 72, 19, -6.2F, -0.1F, -0.5F, 5, 3, 0, 0.0F));
		right.cubeList.add(new ModelBox(right, 72, 29, -6.2F, -0.1F, 4.5F, 5, 3, 0, 0.0F));

		ModelRenderer left = new ModelRenderer(this);
		left.setRotationPoint(8.0F, -2.05F, -2.0F);
		this.RArm.addChild(left);
		left.mirror = true;
		left.cubeList.add(new ModelBox(left, 78, 29, 1.0F, -0.1F, -0.5F, 5, 3, 0, 0.0F));
		left.cubeList.add(new ModelBox(left, 78, 29, 1.0F, -0.1F, 4.5F, 5, 3, 0, 0.0F));
		left.cubeList.add(new ModelBox(left, 68, 23, -0.2F, -0.1F, -0.5F, 5, 0, 5, 0.0F));

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
		this.Head.render(f5);
		this.Body.render(f5);
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