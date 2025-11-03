package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDore extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDore(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer headGear = new ModelRenderer(this);
		headGear.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headGear);
		headGear.cubeList.add(new ModelBox(headGear, 32, 44, -4.0F, -8.0F, -4.0F, 8, 7, 8, 0.5F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

        ModelRenderer leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(5.0F, 2.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		Body.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 27, 11, -1.0F, -3.0F, -2.0F, 7, 4, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 46, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 40, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(1.0F, 0.0F, 3.0F);
		setRotationAngle(hair1, 0.3491F, 0.0F, 0.0F);
		Body.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 5, 18, -5.0F, -1.1496F, -0.4111F, 8, 11, 2, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(3.1875F, 0.9375F, 3.0F);
		setRotationAngle(hair2, 0.3491F, -0.2618F, 0.7854F);
		Body.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 7, 24, -3.0F, -1.1496F, -0.4111F, 6, 3, 2, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(3.1875F, 5.9375F, 5.0F);
		setRotationAngle(hair3, 0.3491F, -0.2618F, 0.7854F);
		Body.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 7, 22, -3.0F, -1.1496F, -0.4111F, 6, 7, 2, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(-3.1875F, 0.9375F, 3.0F);
		setRotationAngle(hair4, 0.3491F, 0.2618F, -0.7854F);
		Body.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 7, 24, -3.0F, -1.1496F, -0.4111F, 6, 3, 2, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(-3.1875F, 5.9375F, 5.0F);
		setRotationAngle(hair5, 0.3491F, 0.2618F, -0.7854F);
		Body.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 7, 21, -3.0F, -1.1496F, -0.4111F, 6, 7, 2, 0.0F));

        ModelRenderer hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(-0.1875F, 0.9375F, 4.0F);
		setRotationAngle(hair6, 0.0F, 0.6109F, -1.5708F);
		Body.addChild(hair6);
		hair6.cubeList.add(new ModelBox(hair6, 5, 21, -3.0F, -2.1496F, -2.4111F, 6, 6, 4, 0.0F));

        ModelRenderer hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-0.1875F, 5.9375F, 6.0F);
		setRotationAngle(hair7, 0.0F, 0.6109F, -1.5708F);
		Body.addChild(hair7);
		hair7.cubeList.add(new ModelBox(hair7, 6, 22, -3.0F, -2.1496F, -1.4111F, 6, 6, 3, 0.0F));
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
