package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSansho extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSansho(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 2, 0, 4.0F, -1.0F, -4.0F, 0, 7, 1, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -1.0F, -4.0F, 0, 7, 1, 0.0F));

        ModelRenderer headChild_6 = new ModelRenderer(this);
		headChild_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(headChild_6, -0.3491F, 0.0F, 0.6982F);
		Head.addChild(headChild_6);

        ModelRenderer headChild_14 = new ModelRenderer(this);
		headChild_14.setRotationPoint(-6.0F, -7.5F, -0.9F);
		setRotationAngle(headChild_14, -0.3491F, 0.0F, 0.4363F);
		Head.addChild(headChild_14);

        ModelRenderer headChild_3 = new ModelRenderer(this);
		headChild_3.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(headChild_3, 0.0F, 0.0873F, 0.7854F);
		Head.addChild(headChild_3);

        ModelRenderer headChild = new ModelRenderer(this);
		headChild.setRotationPoint(-1.0F, -8.7F, 0.0F);
		setRotationAngle(headChild, -0.0873F, 0.0F, -0.6108F);
		Head.addChild(headChild);

        ModelRenderer headChild_5 = new ModelRenderer(this);
		headChild_5.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(headChild_5, -0.3491F, 0.0F, -0.7854F);
		Head.addChild(headChild_5);

        ModelRenderer headChild_7 = new ModelRenderer(this);
		headChild_7.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(headChild_7, 2.7925F, 0.0873F, -1.309F);
		Head.addChild(headChild_7);

        ModelRenderer headChild_4 = new ModelRenderer(this);
		headChild_4.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(headChild_4, 2.7925F, 0.0873F, -1.1345F);
		Head.addChild(headChild_4);

        ModelRenderer headChild_13 = new ModelRenderer(this);
		headChild_13.setRotationPoint(2.0F, -5.0F, -1.0F);
		setRotationAngle(headChild_13, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(headChild_13);

        ModelRenderer headChild_12 = new ModelRenderer(this);
		headChild_12.setRotationPoint(0.0F, -5.0F, -2.0F);
		setRotationAngle(headChild_12, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(headChild_12);

        ModelRenderer headChild_2 = new ModelRenderer(this);
		headChild_2.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(headChild_2, 0.0F, 0.0F, 0.6981F);
		Head.addChild(headChild_2);

        ModelRenderer headChild_9 = new ModelRenderer(this);
		headChild_9.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(headChild_9, -0.5236F, 0.3491F, 0.0F);
		Head.addChild(headChild_9);

        ModelRenderer headChild_10 = new ModelRenderer(this);
		headChild_10.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(headChild_10, -0.5236F, -0.2618F, 0.0F);
		Head.addChild(headChild_10);

        ModelRenderer headChild_1 = new ModelRenderer(this);
		headChild_1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(headChild_1, 0.0F, 0.0F, -0.6981F);
		Head.addChild(headChild_1);

        ModelRenderer headChild_8 = new ModelRenderer(this);
		headChild_8.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(headChild_8, 2.7925F, 0.0873F, 0.9599F);
		Head.addChild(headChild_8);

        ModelRenderer headChild_11 = new ModelRenderer(this);
		headChild_11.setRotationPoint(-4.0F, -8.0F, -2.0F);
		setRotationAngle(headChild_11, -0.3491F, 0.0F, 0.3491F);
		Head.addChild(headChild_11);

        ModelRenderer headChild_15 = new ModelRenderer(this);
		headChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_15, 0.0F, 0.5236F, 0.0F);
		Head.addChild(headChild_15);
		headChild_15.cubeList.add(new ModelBox(headChild_15, 12, 26, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer headChild_16 = new ModelRenderer(this);
		headChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_16, 0.0F, -0.5236F, 0.0F);
		Head.addChild(headChild_16);
		headChild_16.cubeList.add(new ModelBox(headChild_16, 24, 14, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        ModelRenderer cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(cape, 0.1745F, 0.0F, 0.0F);
		Body.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 24, 24, -4.2F, -5.0F, 3.0F, 8, 23, 0, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(4.8F, -3.4F, -0.3F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		Body.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, -1.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 24, 4, 4.2745F, -5.4858F, -2.0F, 1, 3, 1, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 16, 1.2895F, -5.7853F, 0.0F, 1, 3, 1, 0.0F));

        ModelRenderer rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-5.2F, -3.4F, -0.4F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		Body.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 32, 0, -6.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 4, 0, -5.2795F, -5.5857F, -2.0F, 1, 3, 1, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 4, 4, -2.2945F, -5.8852F, 0.0F, 1, 3, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.0873F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 40, -3.9128F, -1.0038F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.0873F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 12, 44, 7.9128F, -1.0038F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 32, 0, -2.5F, 0.4F, -2.4F, 4, 5, 5, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.0873F);
		RLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 24, 2, -3.091F, 8.9166F, 0.0F, 2, 1, 1, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 24, 0, -3.2653F, 6.9243F, 0.0F, 2, 1, 1, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 40, 20, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 0, 2.5F, 0.4F, -2.4F, 4, 5, 5, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 12.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.0873F);
		LLeg.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 20, 18, 4.0F, -3.0F, 0.0F, 2, 1, 1, 0.0F));

        ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, 10.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.0873F);
		LLeg.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 20, 16, 4.0F, -3.0F, 0.0F, 2, 1, 1, 0.0F));
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
