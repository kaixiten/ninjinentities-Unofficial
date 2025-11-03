package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDaiz extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDaiz(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -2.3599F, 4.398F);
		setRotationAngle(bone, 0.3491F, 0.0F, 0.0F);
		Head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 10, 52, -0.5F, -0.5F, 0.5F, 1, 1, -1, 0.5F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 16, 34, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-1.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		RArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 26, 10, -6.0F, -3.0F, -2.4F, 7, 4, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 44, 46, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(9.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 24, 24, -1.0F, -3.0F, -2.5F, 7, 4, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 34, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, -0.7582F, 4.5047F);
		setRotationAngle(hair1, 0.1745F, 0.0F, 0.0F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 7, 52, -1.0F, -0.5F, -0.5F, 2, 9, 1, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(0.125F, -0.7582F, 4.5047F);
		setRotationAngle(hair2, 0.1745F, 0.0F, -0.2618F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 7, 52, -1.0F, -0.5F, -0.5F, 2, 8, 1, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(-0.125F, -0.7582F, 4.5047F);
		setRotationAngle(hair3, 0.1745F, 0.0F, 0.2618F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 7, 52, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(0.0F, -0.7582F, 4.5047F);
		setRotationAngle(hair4, 0.3491F, 0.0F, 0.0F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 7, 52, -1.0F, -0.5F, -0.5F, 2, 7, 1, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(0.0F, -0.7582F, 4.5047F);
		setRotationAngle(hair5, 0.0F, 0.0F, 0.1745F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 7, 52, -1.0F, -0.5F, -0.5F, 2, 8, 1, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(0.125F, -0.7582F, 4.5047F);
		setRotationAngle(hair6, 0.1745F, 0.0F, -0.5236F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 7, 52, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-0.125F, -0.7582F, 4.5047F);
		setRotationAngle(hair7, 0.1745F, 0.0F, 0.5236F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 7, 52, -1.0F, -0.5F, -0.5F, 2, 5, 1, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(0.0F, -0.7582F, 4.5047F);
		setRotationAngle(hair8, 0.5236F, 0.0F, 0.0F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 7, 52, -1.0F, -0.5F, -0.5F, 2, 4, 1, 0.0F));
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
