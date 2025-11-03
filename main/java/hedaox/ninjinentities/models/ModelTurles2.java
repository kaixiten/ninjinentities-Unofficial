package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelTurles2 extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;

    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelTurles2(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 78;
		textureHeight = 52;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-1.0F, -8.7F, 0.0F);
		setRotationAngle(hair1, -0.0873F, 0.0F, -0.6108F);
		Head.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 42, 2, -0.5133F, -5.474F, -2.0714F, 3, 8, 4, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(hair2, 0.0F, 0.0F, -0.6981F);
		Head.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 45, 2, -1.9397F, -1.658F, -3.0F, 3, 5, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(hair3, 0.0F, 0.0F, 0.6981F);
		Head.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 45, 2, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(hair4, 0.0F, 0.0873F, 0.7854F);
		Head.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 6, 3, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(hair5, 2.7925F, 0.0873F, -1.1345F);
		Head.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 45, 2, -0.0028F, -1.971F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(hair6, -0.3491F, 0.0F, -0.7854F);
		Head.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -3.1257F, -2.2188F, 3, 7, 3, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(hair7, -0.3491F, 0.0F, 0.6982F);
		Head.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 45, 2, 1.8099F, -3.4417F, -5.0982F, 3, 6, 5, 0.0F));

        ModelRenderer hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(hair8, 2.7925F, 0.0873F, -1.309F);
		Head.addChild(hair8);
		hair8.cubeList.add(new ModelBox(hair8, 45, 2, -2.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(hair9, 2.7925F, 0.0873F, 0.9599F);
		Head.addChild(hair9);
		hair9.cubeList.add(new ModelBox(hair9, 45, 2, 0.9972F, -2.971F, -3.2188F, 3, 6, 3, 0.0F));

        ModelRenderer hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(hair10, -0.5236F, 0.3491F, 0.0F);
		Head.addChild(hair10);
		hair10.cubeList.add(new ModelBox(hair10, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(hair11, -0.5236F, -0.2618F, 0.0F);
		Head.addChild(hair11);
		hair11.cubeList.add(new ModelBox(hair11, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        ModelRenderer strand1 = new ModelRenderer(this);
		strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
		setRotationAngle(strand1, -0.3491F, 0.0F, 0.3491F);
		Head.addChild(strand1);
		strand1.cubeList.add(new ModelBox(strand1, 38, 2, 1.9972F, -1.971F, -3.2188F, 2, 5, 2, 0.0F));

        ModelRenderer strand2 = new ModelRenderer(this);
		strand2.setRotationPoint(0.0F, -5.0F, -2.0F);
		setRotationAngle(strand2, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(strand2);
		strand2.cubeList.add(new ModelBox(strand2, 38, 2, 1.9972F, -1.971F, -3.2188F, 2, 4, 2, 0.0F));

        ModelRenderer strand3 = new ModelRenderer(this);
		strand3.setRotationPoint(2.0F, -5.0F, -1.0F);
		setRotationAngle(strand3, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(strand3);
		strand3.cubeList.add(new ModelBox(strand3, 38, 2, 1.5441F, -0.9985F, -3.7609F, 2, 3, 2, 0.0F));

        ModelRenderer strand4 = new ModelRenderer(this);
		strand4.setRotationPoint(-6.0F, -7.5F, -0.9F);
		setRotationAngle(strand4, -0.3491F, 0.0F, 0.4363F);
		Head.addChild(strand4);
		strand4.cubeList.add(new ModelBox(strand4, 38, 2, 1.5441F, -0.9985F, -3.7609F, 2, 3, 2, 0.0F));

        ModelRenderer detector = new ModelRenderer(this);
		detector.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(detector);
		detector.cubeList.add(new ModelBox(detector, 49, 33, 4.0F, -5.0F, -2.0F, 1, 3, 3, 0.0F));
		detector.cubeList.add(new ModelBox(detector, 49, 36, 4.0F, -4.0F, -4.25F, 1, 1, 2, 0.0F));

        ModelRenderer screen = new ModelRenderer(this);
		screen.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(screen, 0.0F, -0.1745F, 0.0F);
		detector.addChild(screen);
		screen.cubeList.add(new ModelBox(screen, 45, 40, 0.0F, -5.0F, -5.0F, 4, 3, 0, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer RShoulder = new ModelRenderer(this);
		RShoulder.setRotationPoint(-15.0F, -1.0F, -0.5F);
		setRotationAngle(RShoulder, 0.0F, 3.1F, 0.0873F);
		RArm.addChild(RShoulder);
		RShoulder.cubeList.add(new ModelBox(RShoulder, 0, 35, -15.0F, -3.3F, -3.0F, 7, 4, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer LShoulder = new ModelRenderer(this);
		LShoulder.setRotationPoint(23.0F, -1.0F, -0.5F);
		setRotationAngle(LShoulder, 0.0F, -3.1F, -0.0873F);
		LArm.addChild(LShoulder);
		LShoulder.mirror = true;
		LShoulder.cubeList.add(new ModelBox(LShoulder, 0, 35, 8.0F, -3.3F, -3.0F, 7, 4, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer FDown = new ModelRenderer(this);
		FDown.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(FDown, -0.2094F, 0.0F, 0.0F);
		RLeg.addChild(FDown);
		FDown.cubeList.add(new ModelBox(FDown, 27, 33, -0.5F, -1.0F, -2.4F, 5, 6, 1, 0.0F));
		FDown.cubeList.add(new ModelBox(FDown, 40, 33, 0.5F, 5.0F, -2.4F, 3, 1, 1, 0.0F));

        ModelRenderer RDown = new ModelRenderer(this);
		RDown.setRotationPoint(0.0F, 0.0F, -3.0F);
		setRotationAngle(RDown, -0.2094F, 1.5708F, 0.0F);
		RLeg.addChild(RDown);
		RDown.cubeList.add(new ModelBox(RDown, 27, 33, -5.5F, -1.2F, -2.4F, 5, 6, 1, 0.0F));
		RDown.cubeList.add(new ModelBox(RDown, 40, 33, -4.5F, 4.8F, -2.4F, 3, 1, 1, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer LDown = new ModelRenderer(this);
		LDown.setRotationPoint(12.0F, 0.0F, 3.0F);
		setRotationAngle(LDown, -0.2094F, -1.5708F, 0.0F);
		LLeg.addChild(LDown);
		LDown.mirror = true;
		LDown.cubeList.add(new ModelBox(LDown, 27, 33, -5.5F, -2.8633F, 5.4252F, 5, 6, 1, 0.0F));
		LDown.cubeList.add(new ModelBox(LDown, 40, 33, -4.5F, 3.1367F, 5.4252F, 3, 1, 1, 0.0F));
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
