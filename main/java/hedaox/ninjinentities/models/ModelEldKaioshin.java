package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelEldKaioshin extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer RArm;
	private final ModelRenderer RArm1_r1;
	private final ModelRenderer LArm;
	private final ModelRenderer LArm1_r1;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Head;
	private final ModelRenderer Ear2_r1;
	private final ModelRenderer Ear1_r1;
	private final ModelRenderer Head_r1;
	private final float scale = 1.0F;

	public ModelEldKaioshin(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 24, 0, -4.2F, 2.6F, -1.8F, 8, 4, 4, 0.01F));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(-0.2F, 3.9F, 0.4F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.2705F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 0, 16, -4.0F, -8.7F, -1.83F, 8, 8, 4, -0.07F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-3.8639F, -3.5778F, -1.0958F);
		Body.addChild(RArm);
		setRotationAngle(RArm, 0.7462F, 0.0891F, -0.096F);
		RArm.cubeList.add(new ModelBox(RArm, 36, 8, -4.2607F, -1.8179F, -1.8301F, 4, 6, 4, -0.1F));

		RArm1_r1 = new ModelRenderer(this);
		RArm1_r1.setRotationPoint(-2.2607F, 4.0821F, 0.1699F);
		RArm.addChild(RArm1_r1);
		setRotationAngle(RArm1_r1, 0.0F, 0.0F, -0.5236F);
		RArm1_r1.cubeList.add(new ModelBox(RArm1_r1, 40, 18, -1.7454F, -1.0443F, -1.996F, 4, 6, 4, -0.11F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(3.4639F, -3.5778F, -1.0958F);
		Body.addChild(LArm);
		setRotationAngle(LArm, 0.7462F, -0.0891F, 0.096F);
		LArm.cubeList.add(new ModelBox(LArm, 36, 8, 0.2607F, -1.8179F, -1.8301F, 4, 6, 4, -0.1F));

		LArm1_r1 = new ModelRenderer(this);
		LArm1_r1.setRotationPoint(2.2607F, 4.0821F, 0.1699F);
		LArm.addChild(LArm1_r1);
		setRotationAngle(LArm1_r1, 0.0F, 0.0F, 0.5236F);
		LArm1_r1.mirror = true;
		LArm1_r1.cubeList.add(new ModelBox(LArm1_r1, 40, 18, -2.2446F, -1.0543F, -1.996F, 4, 6, 4, -0.11F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 24, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.2F, 0.0F);


		Ear2_r1 = new ModelRenderer(this);
		Ear2_r1.setRotationPoint(2.8F, -1.0F, -3.0F);
		Head.addChild(Ear2_r1);
		setRotationAngle(Ear2_r1, 0.0F, -0.5236F, 0.0F);
		Ear2_r1.mirror = true;
		Ear2_r1.cubeList.add(new ModelBox(Ear2_r1, 0, 30, 0.1F, -4.0F, -0.4F, 5, 5, 0, -0.19F));

		Ear1_r1 = new ModelRenderer(this);
		Ear1_r1.setRotationPoint(-2.8F, -1.0F, -3.0F);
		Head.addChild(Ear1_r1);
		setRotationAngle(Ear1_r1, 0.0F, 0.5236F, 0.0F);
		Ear1_r1.cubeList.add(new ModelBox(Ear1_r1, 0, 30, -5.1F, -4.0F, -0.4F, 5, 5, 0, -0.19F));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -3.0F, -1.7F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0436F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 0, -4.0F, -3.7F, -4.1F, 8, 8, 8, -0.19F));
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
