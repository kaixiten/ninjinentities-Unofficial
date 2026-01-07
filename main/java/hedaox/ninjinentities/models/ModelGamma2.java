// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGamma2 extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedRightLeg;
    private final ModelRenderer eye;
	private float scale = 1.0F;

	public ModelGamma2(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer tb = new ModelRenderer(this);
		tb.setRotationPoint(-1.0F, -5.0F, 0.0F);
		bipedHead.addChild(tb);
		setRotationAngle(tb, 0.0F, 0.0F, -0.3491F);
		tb.cubeList.add(new ModelBox(tb, 44, 2, -0.5F, -7.87F, 0.0F, 1, 5, 3, 0.0F));

        eye = new ModelRenderer(this);
        eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(eye);
        eye.cubeList.add(new ModelBox(eye, 0, 0, -4.5F, -4.5F, -1.0F, 2, 2, 2, 0.0F));
        eye.cubeList.add(new ModelBox(eye, 0, 0, 2.5F, -4.5F, -1.0F, 2, 2, 2, 0.0F));

        ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -2.316F, -3.4661F);
		tb.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.2654F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 3, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F));

        ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -4.5F, -3.5F);
		tb.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.0472F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 0, -0.5F, -4.75F, -1.15F, 1, 3, 5, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 1, -0.5F, -2.75F, -1.15F, 1, 3, 4, 0.0F));

        ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.5F, -3.5F);
		tb.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 2, -0.5F, -0.6F, -1.0F, 1, 2, 3, 0.0F));

        ModelRenderer tb2 = new ModelRenderer(this);
		tb2.setRotationPoint(1.0F, -5.0F, 0.0F);
		bipedHead.addChild(tb2);
		setRotationAngle(tb2, 0.0F, 0.0F, 0.3491F);
		tb2.cubeList.add(new ModelBox(tb2, 44, 2, -0.5F, -7.87F, 0.0F, 1, 5, 3, 0.0F));

        ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -2.316F, -3.4661F);
		tb2.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.2654F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 3, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F));

        ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -4.5F, -3.5F);
		tb2.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.0472F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 0, -0.5F, -4.75F, -1.15F, 1, 3, 5, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 1, -0.5F, -2.75F, -1.15F, 1, 3, 4, 0.0F));

        ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -4.5F, -3.5F);
		tb2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 2, -0.5F, -0.6F, -1.0F, 1, 2, 3, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -4.9F, 3.0F);
		bipedBody.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 98, 0, -7.5F, -0.6F, -0.7F, 15, 21, 0, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(4.8F, -3.4F, 0.2F);
		bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(0.8F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -1.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netbipedHeadYaw / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = headPitch / (180F / (float)Math.PI);

        this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;

        this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
        this.bipedRightArm.rotateAngleY = 0.0F;

        float animProgress = this.onGround;
        this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(animProgress) * (float)Math.PI * 2.0F) * 0.2F;

        float animCurve = 1.0F - animProgress;
        animCurve *= animCurve;
        animCurve *= animCurve;
        animCurve = 1.0F - animCurve;

        float sinCurve = MathHelper.sin(animCurve * (float)Math.PI);
        float headOffset = MathHelper.sin(animProgress * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
        this.bipedRightArm.rotateAngleX -= (sinCurve * 1.2F + headOffset);
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
        this.bipedRightArm.rotateAngleZ = MathHelper.sin(animProgress * 2.1415927F) * -0.4F;
    }
}
