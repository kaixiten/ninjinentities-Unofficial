package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBiomen extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;

    public ModelBiomen(float _scaleX, float _scaleY, float _scaleZ) {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, 0.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer headChild_2 = new ModelRenderer(this);
		headChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_2, 0.0F, 0.5236F, 0.0F);
		Head.addChild(headChild_2);

        ModelRenderer headChild_1 = new ModelRenderer(this);
		headChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_1, 0.0F, -0.5236F, 0.0F);
		Head.addChild(headChild_1);

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(-4.6F, 3.0F, 0.0F);
		setRotationAngle(earR, 0.0F, -0.4363F, 0.0F);
		Head.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 32, 0, 0.0F, -2.0F, -2.0F, 0, 6, 4, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(4.6F, 3.0F, 0.0F);
		setRotationAngle(earL, 0.0F, 0.4363F, 0.0F);
		Head.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 32, 0, 0.0F, -2.0F, -2.0F, 0, 6, 4, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.2F, 2.6F, -1.8F, 8, 8, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, 3.6F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 28, 12, -4.0F, -1.0F, -2.0F, 4, 8, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(3.8F, 3.6F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 32, 32, 0.0F, -1.0F, -2.0F, 4, 8, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 10.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 20, 24, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.8F, 10.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 28, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
        float scaleZ = 1.0F;
        float scaleY = 1.0F;
        float scaleX = 1.0F;
        GL11.glScalef(scaleX, scaleY, scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scaleY /0.45F,1.88F)))), 0.0F);
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
