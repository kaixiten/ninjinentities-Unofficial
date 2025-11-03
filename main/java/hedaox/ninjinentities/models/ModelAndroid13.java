package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAndroid13 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelAndroid13(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		ModelRenderer visor = new ModelRenderer(this);
		visor.setRotationPoint(-0.1875F, 24.0F, 0.0F);
		Head.addChild(visor);
		visor.cubeList.add(new ModelBox(visor, 0, 0, -3.0F, -30.0F, -6.0F, 6, 1, 2, 0.0F));

		ModelRenderer hat = new ModelRenderer(this);
		hat.setRotationPoint(-0.0875F, 0.0F, 0.75F);
		Head.addChild(hat);
		hat.cubeList.add(new ModelBox(hat, 36, 0, -3.9125F, -9.0F, -4.75F, 8, 4, 8, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(4.0F, 0.0F, 3.375F);
		setRotationAngle(hair1, 0.6109F, 0.1745F, -1.9199F);
		hair1.cubeList.add(new ModelBox(hair1, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-4.0F, 0.0F, 3.375F);
		setRotationAngle(hair2, 0.6109F, -0.1745F, 1.9199F);
		hair2.cubeList.add(new ModelBox(hair2, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-3.0F, 0.0F, 3.375F);
		setRotationAngle(hair3, 0.4363F, -0.4363F, 1.8326F);
		hair3.cubeList.add(new ModelBox(hair3, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(3.0F, 0.0F, 3.375F);
		setRotationAngle(hair4, 0.4363F, 0.4363F, -1.8326F);
		hair4.cubeList.add(new ModelBox(hair4, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(2.0F, 0.0F, 3.375F);
		setRotationAngle(hair5, 0.4363F, 0.1745F, -1.8326F);
		hair5.cubeList.add(new ModelBox(hair5, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-2.0F, 0.0F, 3.375F);
		setRotationAngle(hair6, 0.4363F, -0.1745F, 1.8326F);
		hair6.cubeList.add(new ModelBox(hair6, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, 0.0F, 3.375F);
		setRotationAngle(hair7, 0.4363F, -0.4363F, 1.8326F);
		hair7.cubeList.add(new ModelBox(hair7, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(2.0F, 0.0F, 3.375F);
		setRotationAngle(hair8, 0.4363F, 0.1745F, -1.8326F);
		hair8.cubeList.add(new ModelBox(hair8, 45, 13, -4.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F));

		ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(1.0F, 0.0F, 3.375F);
		setRotationAngle(hair9, 0.4363F, 0.4363F, -1.8326F);
		hair9.cubeList.add(new ModelBox(hair9, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-5.0F, 0.0F, 3.375F);
		setRotationAngle(hair10, 0.4363F, 0.0F, 1.8326F);
		hair10.cubeList.add(new ModelBox(hair10, 45, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));

		ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(5.0F, 0.0F, 3.375F);
		setRotationAngle(hair11, 0.4363F, 0.0F, -1.8326F);
		hair11.cubeList.add(new ModelBox(hair11, 44, 13, -4.0F, -1.0F, -1.0F, 8, 1, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
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
