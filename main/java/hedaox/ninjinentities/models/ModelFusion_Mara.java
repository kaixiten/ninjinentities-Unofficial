package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelFusion_Mara extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer bone2;
    private final ModelRenderer bipedHead_r1;
    private final ModelRenderer bipedHead_r2;
    private final ModelRenderer bone;
    private final ModelRenderer bipedHead_r3;
    private final ModelRenderer bipedHead_r4;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bone3;
    private final ModelRenderer bipedBody_r1;
    private final ModelRenderer bipedBody_r2;
    private final ModelRenderer bipedBody_r3;
    private final ModelRenderer bipedBody_r4;
    private final ModelRenderer bipedBody_r5;
    private final ModelRenderer bipedBody_r6;
    private final ModelRenderer bipedBody_r7;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedLeftArm1;
    private final ModelRenderer bipedLeftLeg;
    private final ModelRenderer bipedRightLeg;
	private float scale = 1.0F;

	public ModelFusion_Mara(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, -1.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -7.75F, -3.25F, 8, 8, 8, -0.2F));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-4.5F, 25.0F, 0.0F);
        bipedHead.addChild(bone2);
        setRotationAngle(bone2, 0.0F, -0.1745F, 0.1745F);


        bipedHead_r1 = new ModelRenderer(this);
        bipedHead_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(bipedHead_r1);
        setRotationAngle(bipedHead_r1, 0.6563F, -0.0692F, -0.0532F);
        bipedHead_r1.cubeList.add(new ModelBox(bipedHead_r1, 40, 17, -5.7411F, -23.5995F, 15.1368F, 2, 2, 5, 0.0F));

        bipedHead_r2 = new ModelRenderer(this);
        bipedHead_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(bipedHead_r2);
        setRotationAngle(bipedHead_r2, 0.0F, 0.0F, 0.0436F);
        bipedHead_r2.cubeList.add(new ModelBox(bipedHead_r2, 24, 0, -8.6735F, -30.9924F, 1.0152F, 3, 2, 2, 0.0F));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(4.5F, 25.0F, 0.0F);
        bipedHead.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.1745F, -0.1745F);


        bipedHead_r3 = new ModelRenderer(this);
        bipedHead_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(bipedHead_r3);
        setRotationAngle(bipedHead_r3, 0.6563F, 0.0692F, 0.0532F);
        bipedHead_r3.cubeList.add(new ModelBox(bipedHead_r3, 43, 44, 3.7411F, -23.5995F, 15.1368F, 2, 2, 5, 0.0F));

        bipedHead_r4 = new ModelRenderer(this);
        bipedHead_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(bipedHead_r4);
        setRotationAngle(bipedHead_r4, 0.0F, 0.0F, -0.0436F);
        bipedHead_r4.cubeList.add(new ModelBox(bipedHead_r4, 44, 0, 5.6735F, -30.9924F, 1.0152F, 3, 2, 2, 0.0F));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F));
        bipedBody.cubeList.add(new ModelBox(bipedBody, 20, 22, -4.0F, 9.0F, -2.0F, 8, 3, 4, 0.0F));
        bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 26, -3.5F, 5.0F, -1.5F, 7, 7, 3, 0.0F));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
        bipedBody.addChild(bone3);


        bipedBody_r1 = new ModelRenderer(this);
        bipedBody_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r1);
        setRotationAngle(bipedBody_r1, 0.0873F, 0.0F, 0.0F);
        bipedBody_r1.cubeList.add(new ModelBox(bipedBody_r1, 0, 0, -1.0F, -24.0F, 3.0F, 2, 5, 2, 0.0F));

        bipedBody_r2 = new ModelRenderer(this);
        bipedBody_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r2);
        setRotationAngle(bipedBody_r2, 0.0873F, -0.0873F, 0.0436F);
        bipedBody_r2.cubeList.add(new ModelBox(bipedBody_r2, 0, 0, -3.0F, -24.0F, 3.0F, 2, 5, 2, 0.0F));

        bipedBody_r3 = new ModelRenderer(this);
        bipedBody_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r3);
        setRotationAngle(bipedBody_r3, 0.0873F, -0.1309F, 0.1309F);
        bipedBody_r3.cubeList.add(new ModelBox(bipedBody_r3, 0, 0, -7.0F, -23.25F, 3.1F, 2, 3, 2, 0.0F));

        bipedBody_r4 = new ModelRenderer(this);
        bipedBody_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r4);
        setRotationAngle(bipedBody_r4, 0.0873F, 0.1309F, -0.0873F);
        bipedBody_r4.cubeList.add(new ModelBox(bipedBody_r4, 0, 0, 3.0F, -23.75F, 3.1F, 2, 4, 2, 0.0F));

        bipedBody_r5 = new ModelRenderer(this);
        bipedBody_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r5);
        setRotationAngle(bipedBody_r5, 0.0873F, 0.0873F, -0.0436F);
        bipedBody_r5.cubeList.add(new ModelBox(bipedBody_r5, 0, 0, 1.0F, -24.0F, 3.0F, 2, 5, 2, 0.0F));

        bipedBody_r6 = new ModelRenderer(this);
        bipedBody_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r6);
        setRotationAngle(bipedBody_r6, 0.0873F, 0.1309F, -0.1309F);
        bipedBody_r6.cubeList.add(new ModelBox(bipedBody_r6, 0, 0, 5.0F, -23.25F, 3.1F, 2, 3, 2, 0.0F));

        bipedBody_r7 = new ModelRenderer(this);
        bipedBody_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bipedBody_r7);
        setRotationAngle(bipedBody_r7, 0.0873F, -0.1309F, 0.0873F);
        bipedBody_r7.cubeList.add(new ModelBox(bipedBody_r7, 0, 0, -5.0F, -23.75F, 3.1F, 2, 4, 2, 0.0F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 44, 7, -3.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F));
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 28, 12, -3.0F, 3.75F, -2.0F, 4, 6, 4, -0.1F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 44, 7, -1.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F));

        bipedLeftArm1 = new ModelRenderer(this);
        bipedLeftArm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftArm.addChild(bipedLeftArm1);
        bipedLeftArm1.cubeList.add(new ModelBox(bipedLeftArm1, 0, 36, -1.0F, 3.75F, -2.0F, 4, 6, 4, -0.1F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 0, -1.9F, 0.0F, -2.0F, 4, 7, 4, 0.0F));
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 39, -2.0F, 6.0F, -2.0F, 4, 6, 4, -0.2F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 20, 29, -2.1F, 0.0F, -2.0F, 4, 7, 4, 0.0F));
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 36, 29, -2.0F, 6.0F, -2.0F, 4, 6, 4, -0.2F));
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
