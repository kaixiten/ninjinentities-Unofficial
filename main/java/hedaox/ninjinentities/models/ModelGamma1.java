package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGamma1 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer tb;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LArm;
	private final ModelRenderer RArm;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	private float scale = 1.0F;

	public ModelGamma1(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		tb = new ModelRenderer(this);
		tb.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(tb);
		tb.cubeList.add(new ModelBox(tb, 44, 2, -0.5F, -12.87F, 0.0F, 1, 5, 3, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -7.316F, -3.4661F);
		tb.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.2654F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 3, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -9.5F, -3.5F);
		tb.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.0472F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 0, -0.5F, -4.75F, -1.15F, 1, 3, 5, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 1, -0.5F, -2.75F, -1.15F, 1, 3, 4, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -9.5F, -3.5F);
		tb.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 2, -0.5F, -0.6F, -1.0F, 1, 2, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, -4.9F, 3.0F);
		Body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 98, 0, -7.5F, -0.6F, -0.7F, 15, 21, 0, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(4.8F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(0.8F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -1.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
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