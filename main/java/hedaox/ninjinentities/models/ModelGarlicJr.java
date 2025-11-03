package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGarlicJr extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelGarlicJr(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, 0.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer headChild_2 = new ModelRenderer(this);
		headChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_2, 0.0F, 0.5236F, 0.0F);
		Head.addChild(headChild_2);
		headChild_2.cubeList.add(new ModelBox(headChild_2, 0, 54, 4.0F, 1.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer headChild_1 = new ModelRenderer(this);
		headChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_1, 0.0F, -0.5236F, 0.0F);
		Head.addChild(headChild_1);
		headChild_1.cubeList.add(new ModelBox(headChild_1, 0, 54, -4.0F, 1.0F, -1.0F, 0, 4, 6, 0.0F));

        ModelRenderer tooth = new ModelRenderer(this);
		tooth.setRotationPoint(0.625F, 6.3125F, -4.125F);
		setRotationAngle(tooth, -0.2618F, 0.2618F, 0.7854F);
		Head.addChild(tooth);
		tooth.cubeList.add(new ModelBox(tooth, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.2F, 2.6F, -1.8F, 8, 8, 4, 0.0F));

        ModelRenderer cape = new ModelRenderer(this);
		cape.setRotationPoint(-0.2F, -5.4F, 0.2F);
		setRotationAngle(cape, 0.0873F, 0.0F, 0.0F);
		Body.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 46, 48, -4.0F, 9.0F, 3.0F, 8, 15, 0, 0.0F));

        ModelRenderer scarf = new ModelRenderer(this);
		scarf.setRotationPoint(-0.2F, 18.6F, 0.2F);
		Body.addChild(scarf);
		scarf.cubeList.add(new ModelBox(scarf, 13, 55, -4.0F, -16.0F, -4.0F, 8, 1, 8, 0.5F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 28, 12, -4.0F, 6.0F, -2.0F, 4, 8, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 32, 32, 8.0F, 6.0F, -2.0F, 4, 8, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 20, 24, -2.0F, 4.0F, -2.0F, 4, 8, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 28, 2.0F, 4.0F, -2.0F, 4, 8, 4, 0.0F));
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
