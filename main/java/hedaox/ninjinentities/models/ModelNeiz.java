package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNeiz extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNeiz(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 2, -4.0F, -6.0F, -4.0F, 8, 6, 8, 0.0F));

        ModelRenderer eyeBrowsL = new ModelRenderer(this);
		eyeBrowsL.setRotationPoint(0.5625F, -4.125F, -5.0F);
		setRotationAngle(eyeBrowsL, 0.0F, 0.0F, -0.1745F);
		Head.addChild(eyeBrowsL);
		eyeBrowsL.mirror = true;
		eyeBrowsL.cubeList.add(new ModelBox(eyeBrowsL, 24, 7, 0.0F, -2.0F, 0.8125F, 3, 2, 1, 0.0F));

        ModelRenderer eyeBrowsR = new ModelRenderer(this);
		eyeBrowsR.setRotationPoint(-0.5625F, -4.125F, -5.0F);
		setRotationAngle(eyeBrowsR, 0.0F, 0.0F, 0.1745F);
		Head.addChild(eyeBrowsR);
		eyeBrowsR.cubeList.add(new ModelBox(eyeBrowsR, 24, 7, -3.0F, -2.0F, 0.8125F, 3, 2, 1, 0.0F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(-4.0F, -3.0F, -3.0F);
		setRotationAngle(earR, 0.0F, -0.6109F, 0.0F);
		Head.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 0, 2, 0.0F, -4.0F, 0.0F, 0, 4, 4, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(5.0F, -4.0F, -3.0F);
		Head.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 0, 0, -1.0F, -2.0F, 0.0F, 1, 3, 2, 0.0F));

        ModelRenderer scouterScreen = new ModelRenderer(this);
		scouterScreen.setRotationPoint(4.375F, -3.375F, -3.0F);
		setRotationAngle(scouterScreen, 0.0F, -1.5708F, 0.0F);
		Head.addChild(scouterScreen);
		scouterScreen.cubeList.add(new ModelBox(scouterScreen, 26, 2, -1.8125F, -1.6476F, -0.1283F, 2, 2, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 46, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 40, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 27, 11, -1.0F, -3.0F, -2.0F, 7, 4, 5, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 44, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
