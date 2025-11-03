package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKogu extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelKogu(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 30, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earR, 0.0F, -0.5236F, 0.0F);
		earR.mirror = true;
		Head.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 26, 23, -4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 26, 23, 4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer headBand = new ModelRenderer(this);
		headBand.setRotationPoint(-5.0F, -2.0F, -3.0F);
		setRotationAngle(headBand, 0.0F, -0.3491F, 0.3491F);
		Head.addChild(headBand);
		headBand.cubeList.add(new ModelBox(headBand, 0, 0, -0.1406F, -5.4111F, 0.0512F, 0, 5, 2, 0.0F));

        ModelRenderer headBand2 = new ModelRenderer(this);
		headBand2.setRotationPoint(-4.0F, -1.0F, -2.0F);
		setRotationAngle(headBand2, 0.0873F, -0.6109F, 0.1745F);
		Head.addChild(headBand2);
		headBand2.cubeList.add(new ModelBox(headBand2, 0, 0, -0.1244F, -5.8508F, 0.1619F, 0, 4, 2, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.1493F, -7.2362F, -2.6078F);
		setRotationAngle(hair1, 1.0472F, 0.5236F, -0.5236F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 12, 3, -1.8507F, -4.0F, 0.0F, 2, 6, 2, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-2.1493F, -6.2362F, 0.3922F);
		setRotationAngle(hair2, 0.8727F, 1.2217F, 0.0F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 12, 3, -2.8507F, -4.0F, 0.0F, 3, 5, 2, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-2.1493F, -6.2362F, 2.3922F);
		setRotationAngle(hair3, 0.8727F, 1.9199F, 0.0F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 12, 3, -1.4396F, -3.8854F, 0.0962F, 2, 4, 1, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-0.1493F, -6.2362F, 2.3922F);
		setRotationAngle(hair4, 0.8727F, 2.9671F, 0.0F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 12, 3, -1.8507F, -4.0F, 0.0F, 3, 4, 1, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(0.8507F, -7.1737F, -3.2953F);
		setRotationAngle(hair5, 1.3963F, -0.2618F, 0.0F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 12, 3, -1.8507F, -2.0F, 0.0F, 2, 4, 2, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(2.8507F, -7.2362F, -2.6078F);
		setRotationAngle(hair6, 1.3963F, -0.7854F, 0.0F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 12, 3, -1.8507F, -3.0F, 0.0F, 2, 6, 1, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-0.1493F, -6.2362F, -0.6078F);
		setRotationAngle(hair7, -0.2618F, 0.5236F, -0.6109F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 12, 3, -2.8507F, -5.0F, 0.0F, 3, 5, 2, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(2.1493F, -6.2362F, 2.3922F);
		setRotationAngle(hair8, 0.8727F, -1.9199F, 0.0F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 12, 3, -2.1493F, -4.0F, 0.0F, 2, 4, 1, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(2.1493F, -6.2362F, 0.3922F);
		setRotationAngle(hair9, 0.8727F, -1.2217F, 0.0F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 12, 3, -2.1493F, -4.0F, 0.0F, 3, 5, 2, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.1493F, -6.2362F, -0.6078F);
		setRotationAngle(hair10, -0.2618F, -0.5236F, 0.6109F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 12, 3, -1.1493F, -5.0F, 0.0F, 2, 5, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 40, 0, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(-0.2F, 18.6F, 0.2F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 75, -4.5F, -23.6F, -2.4F, 9, 10, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 54, 54, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, 22.0F, 0.0F);
		RArm.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 40, 16, -9.0F, -25.0F, -3.0F, 5, 4, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 56, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, 22.0F, 0.0F);
		LArm.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 46, 4.0F, -25.0F, -3.0F, 5, 4, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 22, 47, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 38, 47, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer sword = new ModelRenderer(this);
		sword.setRotationPoint(-4.2F, 4.6F, -3.8F);
		setRotationAngle(sword, -0.4363F, -0.3491F, 0.0F);
		Body.addChild(sword);

        ModelRenderer blade = new ModelRenderer(this);
		blade.setRotationPoint(0.0F, 1.0F, 0.0F);
		sword.addChild(blade);
		blade.cubeList.add(new ModelBox(blade, 33, 26, 0.0F, -1.0F, 0.0F, 0, 1, 18, 0.0F));

        ModelRenderer grip = new ModelRenderer(this);
		grip.setRotationPoint(1.0F, 1.0F, -6.0F);
		sword.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 41, 36, -1.5F, -1.0F, -1.0F, 1, 1, 7, 0.0F));

        ModelRenderer guard = new ModelRenderer(this);
		guard.setRotationPoint(2.0F, 2.0F, 0.0F);
		sword.addChild(guard);
		guard.cubeList.add(new ModelBox(guard, 57, 32, -4.0F, -3.5F, 0.0F, 4, 4, 0, 0.0F));
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
