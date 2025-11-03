package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSlugGiant extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSlugGiant(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(head2);
		head2.cubeList.add(new ModelBox(head2, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(-4.0F, -3.0F, -3.0F);
		setRotationAngle(earR, 0.0F, -0.4363F, 0.0F);
		Head.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 24, 16, 0.4226F, -4.0F, 0.9063F, 0, 4, 4, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(4.0F, -3.0F, -3.0F);
		setRotationAngle(earL, 0.0F, 0.4363F, 0.0F);
		Head.addChild(earL);
		earL.mirror = true;
		earL.cubeList.add(new ModelBox(earL, 24, 16, -0.4226F, -4.0F, 0.9063F, 0, 4, 4, 0.0F));

        ModelRenderer antennaR = new ModelRenderer(this);
		antennaR.setRotationPoint(-1.25F, -6.0F, -4.5F);
		setRotationAngle(antennaR, 0.1745F, 0.6981F, 0.0F);
		Head.addChild(antennaR);
		antennaR.cubeList.add(new ModelBox(antennaR, 28, 16, -1.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F));

        ModelRenderer antennaL = new ModelRenderer(this);
		antennaL.setRotationPoint(1.25F, -6.0F, -4.5F);
		setRotationAngle(antennaL, 0.1745F, -0.6981F, 0.0F);
		Head.addChild(antennaL);
		antennaL.mirror = true;
		antennaL.cubeList.add(new ModelBox(antennaL, 28, 16, 0.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 32, 44, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 16, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
