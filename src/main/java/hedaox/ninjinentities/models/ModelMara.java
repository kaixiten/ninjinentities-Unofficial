package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelMara extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer bone3;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer head_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer head_r2;
	private float scale = 1.0F;

	public ModelMara(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 24, -4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 24, 0, -4.0F, 9.0F, -2.0F, 8, 3, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 34, -3.0F, 6.0F, -1.5F, 6, 6, 3, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.5F, 9.0F, -2.25F, 9, 3, 5, 0.02F));
		Body.cubeList.add(new ModelBox(Body, 24, 19, -4.5F, 11.0F, -2.25F, 5, 6, 5, 0.0F));


		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(bone3);
		bone3.mirror = true;
		bone3.cubeList.add(new ModelBox(bone3, 24, 19, -0.5F, 11.0F, -2.25F, 5, 6, 5, 0.0F));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		Body.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 32, 7, -2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 52, 45, -1.5F, 7.0F, -1.5F, 3, 5, 3, 0.0F));
		RightLeg.mirror = true;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		Body.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 7, -2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 52, 45, -1.5F, 7.0F, -1.5F, 3, 5, 3, 0.0F));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RightArm);
		RightArm.mirror = true;
		RightArm.cubeList.add(new ModelBox(RightArm, 44, 14, -3.0F, -2.25F, -2.0F, 4, 6, 4, 0.0F));
		RightArm.mirror = true;
		RightArm.cubeList.add(new ModelBox(RightArm, 36, 38, -2.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 44, 14, -1.0F, -2.25F, -2.0F, 4, 6, 4, 0.0F));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 38, -0.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -7.75F, -3.25F, 8, 8, 8, -0.2F));
		head.cubeList.add(new ModelBox(head, 48, 37, -3.5F, 0.0F, -3.0F, 7, 7, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 43, -1.5F, -2.75F, -5.75F, 3, 3, 4, -0.25F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, 25.0F, 0.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 48, 10, 3.5F, -31.0F, 2.0F, 3, 2, 2, 0.0F));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(head_r1);
		setRotationAngle(head_r1, 0.6563F, 0.0692F, 0.0532F);
		head_r1.cubeList.add(new ModelBox(head_r1, 42, 47, 3.5F, -23.0F, 14.9F, 2, 2, 6, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 48, 10, -6.5F, -31.0F, 2.0F, 3, 2, 2, 0.0F));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(head_r2);
		setRotationAngle(head_r2, 0.6563F, -0.0692F, -0.0532F);
		head_r2.cubeList.add(new ModelBox(head_r2, 42, 47, -5.5F, -23.0F, 14.9F, 2, 2, 6, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
		head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
		this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.RightArm.rotateAngleZ = 0.0F;
		this.LeftArm.rotateAngleZ = 0.0F;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.RightLeg.rotateAngleY = 0.0F;
		this.LeftLeg.rotateAngleY = 0.0F;
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}