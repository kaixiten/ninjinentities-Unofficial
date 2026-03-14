package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelEldKaioshin extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Head_r1_r1;
	private final ModelRenderer Ear2_r1;
	private final ModelRenderer Ear1_r1;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedBody2;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedRightArm2;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedLeftArm2;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scale = 1.0F;

	public ModelEldKaioshin(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

		scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);


		Head_r1_r1 = new ModelRenderer(this);
		Head_r1_r1.setRotationPoint(0.0F, -2.5F, -1.8F);
		bipedHead.addChild(Head_r1_r1);
		setRotationAngle(Head_r1_r1, 0.0436F, 0.0F, 0.0F);
		Head_r1_r1.cubeList.add(new ModelBox(Head_r1_r1, 0, 0, -4.0F, -4.0F, -4.0F, 8, 8, 8, -0.19F));

		Ear2_r1 = new ModelRenderer(this);
		Ear2_r1.setRotationPoint(2.8F, -0.8F, -3.0F);
		Ear2_r1.mirror = true;
		bipedHead.addChild(Ear2_r1);
		setRotationAngle(Ear2_r1, 0.0F, -0.5236F, 0.0F);
		Ear2_r1.cubeList.add(new ModelBox(Ear2_r1, 0, 30, 0.1F, -4.0F, -0.4F, 5, 5, 0, -0.19F));

		Ear1_r1 = new ModelRenderer(this);
		Ear1_r1.setRotationPoint(-2.8F, -0.8F, -3.0F);
		bipedHead.addChild(Ear1_r1);
		setRotationAngle(Ear1_r1, 0.0F, 0.5236F, 0.0F);
		Ear1_r1.cubeList.add(new ModelBox(Ear1_r1, 0, 30, -5.1F, -4.0F, -0.4F, 5, 5, 0, -0.19F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 24, 0, -4.2F, 2.6F, -1.8F, 8, 4, 4, 0.01F));

		bipedBody2 = new ModelRenderer(this);
		bipedBody2.setRotationPoint(-0.2F, 3.9F, 0.4F);
		bipedBody.addChild(bipedBody2);
		setRotationAngle(bipedBody2, 0.2705F, 0.0F, 0.0F);
		bipedBody2.cubeList.add(new ModelBox(bipedBody2, 0, 16, -4.0F, -8.7F, -1.83F, 8, 8, 4, -0.07F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-3.8639F, -3.5778F, -1.0958F);
		bipedBody.addChild(bipedRightArm);
		setRotationAngle(bipedRightArm, 0.7462F, 0.0891F, -0.096F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 36, 8, -4.2607F, -1.8179F, -1.8301F, 4, 6, 4, -0.1F));

		bipedRightArm2 = new ModelRenderer(this);
		bipedRightArm2.setRotationPoint(-2.2607F, 4.0821F, 0.1699F);
		bipedRightArm.addChild(bipedRightArm2);
		setRotationAngle(bipedRightArm2, 0.0F, 0.0F, -0.5236F);
		bipedRightArm2.cubeList.add(new ModelBox(bipedRightArm2, 40, 18, -1.7454F, -1.0443F, -1.996F, 4, 6, 4, -0.11F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(3.4639F, -3.5778F, -1.0958F);
		bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		setRotationAngle(bipedLeftArm, 0.7462F, -0.0891F, 0.096F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 36, 8, 0.2607F, -1.8179F, -1.8301F, 4, 6, 4, -0.1F));

		bipedLeftArm2 = new ModelRenderer(this);
		bipedLeftArm2.setRotationPoint(2.2607F, 4.0821F, 0.1699F);
		bipedLeftArm2.mirror = true;
		bipedLeftArm.addChild(bipedLeftArm2);
		setRotationAngle(bipedLeftArm2, 0.0F, 0.0F, 0.5236F);
		bipedLeftArm2.cubeList.add(new ModelBox(bipedLeftArm2, 40, 18, -2.2446F, -1.0543F, -1.996F, 4, 6, 4, -0.11F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedLeftLeg.mirror = true;
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 24, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
		// ★ 先计算动画角度
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
		GL11.glPushMatrix();
		GL11.glScalef(scale, scale, scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
		// 渲染带动画的部件
		bipedHead.render(scaleFactor);
		bipedBody.render(scaleFactor);
		GL11.glPopMatrix();
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
