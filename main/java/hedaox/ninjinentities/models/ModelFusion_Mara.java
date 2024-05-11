package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelFusion_Mara extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone2;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer bone;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer Body;
	private final ModelRenderer bone3;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer Body_r7;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private float scale = 1.0F;

	public ModelFusion_Mara(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -7.75F, -3.25F, 8, 8, 8, -0.2F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.5F, 25.0F, 0.0F);
		head.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.1745F, 0.1745F);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(head_r1);
		setRotationAngle(head_r1, 0.6563F, -0.0692F, -0.0532F);
		head_r1.cubeList.add(new ModelBox(head_r1, 40, 17, -5.7411F, -23.5995F, 15.1368F, 2, 2, 5, 0.0F));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.0436F);
		head_r2.cubeList.add(new ModelBox(head_r2, 24, 0, -8.6735F, -30.9924F, 1.0152F, 3, 2, 2, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.5F, 25.0F, 0.0F);
		head.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.1745F, -0.1745F);
		

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(head_r3);
		setRotationAngle(head_r3, 0.6563F, 0.0692F, 0.0532F);
		head_r3.cubeList.add(new ModelBox(head_r3, 43, 44, 3.7411F, -23.5995F, 15.1368F, 2, 2, 5, 0.0F));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, -0.0436F);
		head_r4.cubeList.add(new ModelBox(head_r4, 44, 0, 5.6735F, -30.9924F, 1.0152F, 3, 2, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 20, 22, -4.0F, 9.0F, -2.0F, 8, 3, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 26, -3.5F, 5.0F, -1.5F, 7, 7, 3, 0.0F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(bone3);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0873F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 0, 0, -1.0F, -24.0F, 3.0F, 2, 5, 2, 0.0F));

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0873F, -0.0873F, 0.0436F);
		Body_r2.cubeList.add(new ModelBox(Body_r2, 0, 0, -3.0F, -24.0F, 3.0F, 2, 5, 2, 0.0F));

		Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0873F, -0.1309F, 0.1309F);
		Body_r3.cubeList.add(new ModelBox(Body_r3, 0, 0, -7.0F, -23.25F, 3.1F, 2, 3, 2, 0.0F));

		Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0873F, 0.1309F, -0.0873F);
		Body_r4.mirror = true;
		Body_r4.cubeList.add(new ModelBox(Body_r4, 0, 0, 3.0F, -23.75F, 3.1F, 2, 4, 2, 0.0F));

		Body_r5 = new ModelRenderer(this);
		Body_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.0873F, 0.0873F, -0.0436F);
		Body_r5.mirror = true;
		Body_r5.cubeList.add(new ModelBox(Body_r5, 0, 0, 1.0F, -24.0F, 3.0F, 2, 5, 2, 0.0F));

		Body_r6 = new ModelRenderer(this);
		Body_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.0873F, 0.1309F, -0.1309F);
		Body_r6.mirror = true;
		Body_r6.cubeList.add(new ModelBox(Body_r6, 0, 0, 5.0F, -23.25F, 3.1F, 2, 3, 2, 0.0F));

		Body_r7 = new ModelRenderer(this);
		Body_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(Body_r7);
		setRotationAngle(Body_r7, 0.0873F, -0.1309F, 0.0873F);
		Body_r7.cubeList.add(new ModelBox(Body_r7, 0, 0, -5.0F, -23.75F, 3.1F, 2, 4, 2, 0.0F));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 44, 7, -3.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F));
		RightArm.cubeList.add(new ModelBox(RightArm, 28, 12, -3.0F, 3.75F, -2.0F, 4, 6, 4, -0.1F));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 40, -1.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 36, -1.0F, 3.75F, -2.0F, 4, 6, 4, -0.1F));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		Body.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 0, -2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 32, 39, -2.0F, 6.0F, -2.0F, 4, 6, 4, -0.2F));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		Body.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 29, -2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 36, 29, -2.0F, 6.0F, -2.0F, 4, 6, 4, -0.2F));
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