package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBbssj extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private final ModelRenderer hair1;
    private final ModelRenderer hair2;
    private final ModelRenderer hair3;
    private final ModelRenderer hair4;
    private final ModelRenderer hair5;
    private final ModelRenderer hair6;
    private final ModelRenderer hair7;
    private final ModelRenderer hair8;
    private final ModelRenderer hair9;
    private final ModelRenderer hair10;
    private final ModelRenderer hair11;
    private final ModelRenderer hair12;
    private final ModelRenderer hair13;
    private final ModelRenderer hair14;
    private final ModelRenderer hair15;
    private final ModelRenderer belt;
    private final ModelRenderer belt2;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone21;
    private final ModelRenderer bone25;
    private final ModelRenderer bone20;
    private final ModelRenderer bone24;
    private final ModelRenderer hj;
    private float scale = 1.0F;

    public ModelBbssj(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        hair1 = new ModelRenderer(this);
        hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
        setRotationAngle(hair1, -0.0873F, 0.0F, -0.1745F);
        bipedHead.addChild(hair1);

        hair1.cubeList.add(new ModelBox(hair1, 42, 2, -0.5133F, -5.474F, -2.0714F, 4, 8, 4, 0.0F));
        hair2 = new ModelRenderer(this);
        hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
        setRotationAngle(hair2, 0.0F, 0.0F, 0.2618F);
        bipedHead.addChild(hair2);
        hair2.cubeList.add(new ModelBox(hair2, 45, 2, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

        hair3 = new ModelRenderer(this);
        hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
        setRotationAngle(hair3, 0.0F, 0.0F, -0.0873F);
        bipedHead.addChild(hair3);
        hair3.cubeList.add(new ModelBox(hair3, 45, 2, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

        hair4 = new ModelRenderer(this);
        hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
        setRotationAngle(hair4, 0.0F, 0.0873F, 0.2618F);
        bipedHead.addChild(hair4);
        hair4.cubeList.add(new ModelBox(hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));
        hair5 = new ModelRenderer(this);
        hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
        setRotationAngle(hair5, 2.7925F, 0.0873F, -0.6109F);
        bipedHead.addChild(hair5);
        hair5.cubeList.add(new ModelBox(hair5, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 8, 3, 0.0F));
        hair6 = new ModelRenderer(this);
        hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
        setRotationAngle(hair6, -0.3491F, 0.0F, -0.4363F);
        bipedHead.addChild(hair6);
        hair6.cubeList.add(new ModelBox(hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));
        hair7 = new ModelRenderer(this);
        hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
        setRotationAngle(hair7, -0.3491F, 0.0F, 0.5236F);
        bipedHead.addChild(hair7);
        hair7.cubeList.add(new ModelBox(hair7, 45, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));
        hair8 = new ModelRenderer(this);
        hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
        setRotationAngle(hair8, 2.7925F, 0.0873F, -0.4363F);
        bipedHead.addChild(hair8);
        hair8.cubeList.add(new ModelBox(hair8, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));
        hair9 = new ModelRenderer(this);
        hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
        setRotationAngle(hair9, 2.7925F, 0.0873F, 0.5236F);
        bipedHead.addChild(hair9);
        hair9.cubeList.add(new ModelBox(hair9, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));
        hair10 = new ModelRenderer(this);
        hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
        setRotationAngle(hair10, -0.5236F, 0.3491F, 0.0F);
        bipedHead.addChild(hair10);
        hair10.cubeList.add(new ModelBox(hair10, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
        hair11 = new ModelRenderer(this);
        hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
        setRotationAngle(hair11, -0.5236F, -0.2618F, 0.0F);
        bipedHead.addChild(hair11);
        hair11.cubeList.add(new ModelBox(hair11, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
        hair12 = new ModelRenderer(this);
        hair12.setRotationPoint(-3.0F, -2.0F, 3.0F);
        setRotationAngle(hair12, -0.5236F, -0.2618F, 0.0F);
        bipedHead.addChild(hair12);
        hair12.cubeList.add(new ModelBox(hair12, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
        hair13 = new ModelRenderer(this);
        hair13.setRotationPoint(-2.0F, -3.0F, 2.0F);
        setRotationAngle(hair13, -0.5236F, -0.2618F, 0.0F);
        bipedHead.addChild(hair13);
        hair13.cubeList.add(new ModelBox(hair13, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
        hair14 = new ModelRenderer(this);
        hair14.setRotationPoint(-5.0F, -2.0F, 3.0F);
        setRotationAngle(hair14, -0.5236F, -0.2618F, 0.0F);
        bipedHead.addChild(hair14);
        hair14.cubeList.add(new ModelBox(hair14, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));
        hair15 = new ModelRenderer(this);
        hair15.setRotationPoint(-6.0F, -3.0F, 2.0F);
        setRotationAngle(hair15, -0.5236F, -0.2618F, 0.0F);
        bipedHead.addChild(hair15);
        hair15.cubeList.add(new ModelBox(hair15, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        belt = new ModelRenderer(this);
        belt.setRotationPoint(-0.8F, -1.6F, -2.2F);
        setRotationAngle(belt, -0.0698F, 0.0873F, 0.0F);
        bipedRightLeg.addChild(belt);
        belt.cubeList.add(new ModelBox(belt, 56, 20, -1.2857F, -1.145F, -0.1004F, 2, 8, 0, 0.0F));

        belt2 = new ModelRenderer(this);
        belt2.setRotationPoint(-0.8F, -1.6F, -2.2F);
        setRotationAngle(belt2, -0.0698F, 1.2217F, 0.0F);
        bipedRightLeg.addChild(belt2);
        belt2.cubeList.add(new ModelBox(belt2, 56, 20, -2.2857F, -1.145F, -1.1004F, 2, 8, 0, 0.0F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
        bipedLeftLeg.mirror = true;
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        hj = new ModelRenderer(this);
        hj.setRotationPoint(0.0F, -0.5F, 0.0F);
        hj.cubeList.add(new ModelBox(hj, 79, 26, 6.0F, -0.5F, 2.0F, 1, 3, 1, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 26, 4.0F, -0.5F, -3.0F, 3, 3, 1, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 26, -7.0F, -0.5F, 2.0F, 1, 3, 1, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 26, -5.0F, -0.5F, 2.0F, 10, 5, 2, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 26, -7.0F, -0.5F, -3.0F, 3, 3, 1, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 25, -7.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 25, 4.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 19, -6.0F, -1.0F, -3.5F, 1, 4, 7, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 19, 5.0F, -1.0F, -3.5F, 1, 4, 7, 0.0F));
        hj.cubeList.add(new ModelBox(hj, 79, 28, -5.0F, -2.0F, 4.0F, 10, 3, 1, 0.0F));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(-6.5F, -5.02F, 3.5F);
        hj.addChild(bone22);
        setRotationAngle(bone22, -1.0036F, -0.0436F, -0.1745F);
        bone22.cubeList.add(new ModelBox(bone22, 83, 12, -0.28F, -4.48F, -0.9F, 1, 5, 2, 0.0F));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(6.5F, -5.0F, 3.5F);
        hj.addChild(bone23);
        setRotationAngle(bone23, -1.0036F, 0.0F, 0.1745F);
        bone23.cubeList.add(new ModelBox(bone23, 83, 12, -0.75F, -4.5F, -0.95F, 1, 5, 2, 0.0F));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(6.5F, -5.0F, 3.5F);
        hj.addChild(bone26);
        setRotationAngle(bone26, -1.0036F, 0.0F, 0.1745F);
        bone26.cubeList.add(new ModelBox(bone26, 93, 12, -0.75F, -4.5F, 0.6143F, 1, 4, 1, 0.0F));

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(-5.5F, -5.0F, 3.5F);
        hj.addChild(bone27);
        setRotationAngle(bone27, -1.0036F, -0.0436F, -0.2182F);
        bone27.cubeList.add(new ModelBox(bone27, 93, 12, -1.2F, -4.55F, 0.5F, 1, 4, 1, 0.0F));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(6.5F, -7.0F, 1.5F);
        hj.addChild(bone21);
        setRotationAngle(bone21, -0.6545F, 0.0F, 0.1745F);
        bone21.cubeList.add(new ModelBox(bone21, 99, 11, -0.4F, 0.4635F, 1.7358F, 1, 6, 2, 0.0F));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(6.5F, -7.0F, 2.5F);
        hj.addChild(bone25);
        setRotationAngle(bone25, -0.6545F, 0.0F, 0.1745F);
        bone25.cubeList.add(new ModelBox(bone25, 93, 11, -0.4F, 0.4635F, 2.7358F, 1, 6, 1, 0.0F));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(-6.5F, -7.0F, 1.5F);
        hj.addChild(bone20);
        setRotationAngle(bone20, -0.6545F, 0.0F, -0.1745F);
        bone20.cubeList.add(new ModelBox(bone20, 97, 11, -0.6F, 0.4635F, 1.7358F, 1, 6, 2, 0.0F));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(-6.5F, -7.0F, 2.5F);
        hj.addChild(bone24);
        setRotationAngle(bone24, -0.6545F, 0.0F, -0.1745F);
        bone24.cubeList.add(new ModelBox(bone24, 93, 11, -0.6F, 0.4635F, 2.7358F, 1, 6, 1, 0.0F));
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
        hj.render(scaleFactor);
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

