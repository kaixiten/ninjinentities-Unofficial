package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelParagus extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelParagus(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer scarf = new ModelRenderer(this);
		scarf.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(scarf);
		scarf.cubeList.add(new ModelBox(scarf, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -8.5F, 1.4F);
		setRotationAngle(hair1, -0.0873F, 0.0F, 0.5237F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 52, 32, -0.5133F, -6.474F, -2.0714F, 3, 9, 3, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair2, -0.5236F, -0.2618F, 0.0F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 0, 54, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(hair3, 2.7925F, 0.0873F, -0.2269F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 48, 63, 0.4972F, -3.071F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-5.0F, -8.8F, 4.0F);
		setRotationAngle(hair4, -0.3491F, 0.0F, 0.2618F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 62, 9, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(2.0F, -6.0F, 0.0F);
		setRotationAngle(hair5, 0.0F, 0.0873F, 0.2792F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 62, 0, -0.5666F, -4.6684F, -2.2431F, 3, 6, 3, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair6, -0.3491F, 0.0F, 0.5236F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 52, 52, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(hair7, -0.5236F, 0.3491F, 0.0F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 32, 0, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair8, 0.0F, 0.0F, -0.0873F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 36, 60, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(-5.0F, -8.0F, -2.0F);
		setRotationAngle(hair9, 2.7925F, 0.0873F, -0.0873F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 24, 60, 0.7972F, -2.171F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(hair10, 0.0F, 0.0F, 0.2618F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 12, 60, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(1.4F, -8.0F, 2.0F);
		setRotationAngle(hair11, 2.7925F, 0.0873F, 0.0873F);
		Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 52, 43, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 48, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 36, 44, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(1.0F, 0.0F, 0.0F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, -1.0F, -3.0F, -3.0F, 6, 4, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 20, 44, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 46, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 2.0F, -3.75F);
		setRotationAngle(cape, 0.1745F, 0.0F, 0.0F);
		Body.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 0, 32, -5.0F, -1.0F, 6.0F, 10, 22, 0, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
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
