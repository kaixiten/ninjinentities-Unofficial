package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCoolerFifthForm extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer headChild_3;
    private final ModelRenderer headChild_5;
    private final ModelRenderer headChild_9;
    private final ModelRenderer headChild_8;
    private final ModelRenderer headChild;
    private final ModelRenderer headChild_1;
    private final ModelRenderer headChild_4;
    private final ModelRenderer headChild_6;
    private final ModelRenderer headChild_2;
    private final ModelRenderer headChild_7;
    private final ModelRenderer headChild_10;
    private final ModelRenderer headChild_11;
    private final ModelRenderer crown1;
    private final ModelRenderer crown2;
    private final ModelRenderer crown3;
    private final ModelRenderer crown4;
    private final ModelRenderer crown5;
    private final ModelRenderer crown6;
    private final ModelRenderer crown7;
    private final ModelRenderer crown8;
    private final ModelRenderer crowngem;
    private final ModelRenderer earR;
    private final ModelRenderer earL;
    private final ModelRenderer bipedBody;
    private final ModelRenderer breasts;
    private final ModelRenderer shoulderGuard1;
    private final ModelRenderer shoulderGuard1_r1;
    private final ModelRenderer shoulderGuard1_r2;
    private final ModelRenderer shoulderGuard2;
    private final ModelRenderer shoulderGuard3;
    private final ModelRenderer shoulderGuard1_r3;
    private final ModelRenderer shoulderGuard1_r4;
    private final ModelRenderer shoulderGuard4;
    private final ModelRenderer shoulderGuard1_r5;
    private final ModelRenderer shoulderGuard1_r6;
    private final ModelRenderer shoulderGuard5;
    private final ModelRenderer shoulderGuard6;
    private final ModelRenderer shoulderGuard1_r7;
    private final ModelRenderer shoulderGuard1_r8;
    private final ModelRenderer backspike2;
    private final ModelRenderer wristspike1_r1;
    private final ModelRenderer backspike1;
    private final ModelRenderer wristspike1_r2;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer wristspike2;
    private final ModelRenderer wristspike1_r3;
    private final ModelRenderer wristspike1_r4;
    private final ModelRenderer wristspike1_r5;
    private final ModelRenderer wristspike1_r6;
    private final ModelRenderer wristspike1_r7;
    private final ModelRenderer wristspike1_r8;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer wristspike1;
    private final ModelRenderer wristspike1_r9;
    private final ModelRenderer wristspike1_r10;
    private final ModelRenderer wristspike1_r11;
    private final ModelRenderer wristspike1_r12;
    private final ModelRenderer wristspike1_r13;
    private final ModelRenderer wristspike1_r14;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private final ModelRenderer FroB;
    private final ModelRenderer ftailS1;
    private final ModelRenderer ftailS2;
    private final ModelRenderer ftailS3;
    private final ModelRenderer ftailS4;
    private final ModelRenderer ftailS5;
    private final ModelRenderer ftailS6;
    private float scale = 1.0F;

    public ModelCoolerFifthForm(float _scale) {
        textureWidth = 64;
        textureHeight = 64;
        scale = _scale;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 24, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        headChild_3 = new ModelRenderer(this);
        headChild_3.setRotationPoint(2.0F, -7.0F, 0.0F);
        bipedHead.addChild(headChild_3);
        setRotationAngle(headChild_3, 0.0F, 0.0873F, 0.2618F);


        headChild_5 = new ModelRenderer(this);
        headChild_5.setRotationPoint(-5.0F, -7.0F, 4.0F);
        bipedHead.addChild(headChild_5);
        setRotationAngle(headChild_5, -0.3491F, 0.0F, -0.4363F);


        headChild_9 = new ModelRenderer(this);
        headChild_9.setRotationPoint(0.0F, -2.0F, 6.0F);
        bipedHead.addChild(headChild_9);
        setRotationAngle(headChild_9, -0.5236F, 0.3491F, 0.0F);


        headChild_8 = new ModelRenderer(this);
        headChild_8.setRotationPoint(3.0F, -8.0F, 2.0F);
        bipedHead.addChild(headChild_8);
        setRotationAngle(headChild_8, 2.7925F, 0.0873F, 0.5236F);


        headChild = new ModelRenderer(this);
        headChild.setRotationPoint(-1.0F, -9.0F, 0.0F);
        bipedHead.addChild(headChild);
        setRotationAngle(headChild, -0.0873F, 0.0F, -0.1745F);


        headChild_1 = new ModelRenderer(this);
        headChild_1.setRotationPoint(-3.0F, -10.0F, 0.0F);
        bipedHead.addChild(headChild_1);
        setRotationAngle(headChild_1, 0.0F, 0.0F, 0.2618F);


        headChild_4 = new ModelRenderer(this);
        headChild_4.setRotationPoint(-5.0F, -6.0F, -2.0F);
        bipedHead.addChild(headChild_4);
        setRotationAngle(headChild_4, 2.7925F, 0.0873F, -0.6109F);


        headChild_6 = new ModelRenderer(this);
        headChild_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
        bipedHead.addChild(headChild_6);
        setRotationAngle(headChild_6, -0.3491F, 0.0F, 0.5236F);


        headChild_2 = new ModelRenderer(this);
        headChild_2.setRotationPoint(1.0F, -8.0F, 0.0F);
        bipedHead.addChild(headChild_2);
        setRotationAngle(headChild_2, 0.0F, 0.0F, -0.0873F);


        headChild_7 = new ModelRenderer(this);
        headChild_7.setRotationPoint(-5.0F, -7.0F, 2.0F);
        bipedHead.addChild(headChild_7);
        setRotationAngle(headChild_7, 2.7925F, 0.0873F, -0.4363F);


        headChild_10 = new ModelRenderer(this);
        headChild_10.setRotationPoint(-4.0F, -2.0F, 4.0F);
        bipedHead.addChild(headChild_10);
        setRotationAngle(headChild_10, -0.5236F, -0.2618F, 0.0F);


        headChild_11 = new ModelRenderer(this);
        headChild_11.setRotationPoint(-3.0F, -7.0F, -1.0F);
        bipedHead.addChild(headChild_11);
        setRotationAngle(headChild_11, -0.2618F, 0.0F, 0.0F);


        crown1 = new ModelRenderer(this);
        crown1.setRotationPoint(0.5F, -0.9F, -4.2F);
        bipedHead.addChild(crown1);
        setRotationAngle(crown1, -0.6981F, 0.0F, 0.0F);
        crown1.cubeList.add(new ModelBox(crown1, 20, 16, -4.0F, -8.0F, -4.0F, 7, 4, 1, 0.5F));

        crown2 = new ModelRenderer(this);
        crown2.setRotationPoint(-3.0F, -5.4375F, -4.5F);
        bipedHead.addChild(crown2);
        setRotationAngle(crown2, 0.0F, 0.0F, -1.3273F);
        crown2.cubeList.add(new ModelBox(crown2, 0, 6, -0.3787F, -2.5301F, -0.5F, 1, 5, 1, 0.5F));

        crown3 = new ModelRenderer(this);
        crown3.setRotationPoint(3.0F, -5.4375F, -4.5F);
        bipedHead.addChild(crown3);
        setRotationAngle(crown3, 0.0F, 0.0F, 1.3273F);
        crown3.cubeList.add(new ModelBox(crown3, 0, 6, -0.6213F, -2.5301F, -0.5F, 1, 5, 1, 0.5F));

        crown4 = new ModelRenderer(this);
        crown4.setRotationPoint(-6.0625F, -6.25F, -3.7375F);
        bipedHead.addChild(crown4);
        setRotationAngle(crown4, -0.8727F, 0.0F, -1.309F);
        crown4.cubeList.add(new ModelBox(crown4, 0, 22, -0.4396F, -3.0104F, -0.5124F, 1, 4, 1, 0.5F));

        crown5 = new ModelRenderer(this);
        crown5.setRotationPoint(6.0625F, -6.25F, -3.7375F);
        bipedHead.addChild(crown5);
        setRotationAngle(crown5, -0.8727F, 0.0F, 1.309F);
        crown5.cubeList.add(new ModelBox(crown5, 0, 22, -0.5604F, -3.0104F, -0.5124F, 1, 4, 1, 0.5F));

        crown6 = new ModelRenderer(this);
        crown6.setRotationPoint(-2.5F, -10.1412F, -1.8591F);
        bipedHead.addChild(crown6);
        setRotationAngle(crown6, -1.0448F, -0.0906F, -0.0525F);
        crown6.cubeList.add(new ModelBox(crown6, 0, 22, -0.5F, -4.1613F, 0.2867F, 1, 4, 1, 0.5F));

        crown7 = new ModelRenderer(this);
        crown7.setRotationPoint(2.5F, -10.1412F, -1.8591F);
        bipedHead.addChild(crown7);
        setRotationAngle(crown7, -1.0448F, 0.0906F, 0.0525F);
        crown7.cubeList.add(new ModelBox(crown7, 0, 22, -0.5F, -4.1613F, 0.2867F, 1, 4, 1, 0.5F));

        crown8 = new ModelRenderer(this);
        crown8.setRotationPoint(0.0625F, -5.4875F, -4.375F);
        bipedHead.addChild(crown8);
        setRotationAngle(crown8, 0.0F, 0.0F, 1.5708F);
        crown8.cubeList.add(new ModelBox(crown8, 0, 22, -0.5F, -2.0F, -0.5625F, 1, 4, 1, 0.5F));

        crowngem = new ModelRenderer(this);
        crowngem.setRotationPoint(3.5F, -0.9F, -4.7F);
        bipedHead.addChild(crowngem);
        setRotationAngle(crowngem, -0.6894F, 0.0F, 0.0F);
        crowngem.cubeList.add(new ModelBox(crowngem, 6, 0, -4.5F, -7.2085F, -4.0619F, 2, 3, 1, 0.3F));

        earR = new ModelRenderer(this);
        earR.setRotationPoint(-4.0F, -3.0F, -1.0F);
        bipedHead.addChild(earR);
        earR.cubeList.add(new ModelBox(earR, 49, 0, -0.7F, -2.0F, -1.0F, 1, 3, 2, 0.0F));

        earL = new ModelRenderer(this);
        earL.setRotationPoint(4.0F, -3.0F, -1.0F);
        bipedHead.addChild(earL);
        earL.cubeList.add(new ModelBox(earL, 49, 0, -0.3F, -2.0F, -1.0F, 1, 3, 2, 0.0F));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 32, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

        breasts = new ModelRenderer(this);
        breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(breasts);
        setRotationAngle(breasts, -0.1745F, 0.0F, 0.0F);
        breasts.cubeList.add(new ModelBox(breasts, 36, 16, -3.5F, 1.0F, -1.8F, 7, 4, 1, 0.0F));

        shoulderGuard1 = new ModelRenderer(this);
        shoulderGuard1.setRotationPoint(9.8F, -0.3F, -0.3F);
        bipedBody.addChild(shoulderGuard1);
        setRotationAngle(shoulderGuard1, 0.0F, 0.0F, 0.6981F);


        shoulderGuard1_r1 = new ModelRenderer(this);
        shoulderGuard1_r1.setRotationPoint(-3.2428F, 3.3339F, -2.2F);
        shoulderGuard1.addChild(shoulderGuard1_r1);
        setRotationAngle(shoulderGuard1_r1, -0.3142F, 0.0F, 0.0F);
        shoulderGuard1_r1.cubeList.add(new ModelBox(shoulderGuard1_r1, 0, 16, -1.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F));

        shoulderGuard1_r2 = new ModelRenderer(this);
        shoulderGuard1_r2.setRotationPoint(-3.2428F, 5.1339F, -0.8F);
        shoulderGuard1.addChild(shoulderGuard1_r2);
        setRotationAngle(shoulderGuard1_r2, 0.5236F, 0.0F, 0.0F);
        shoulderGuard1_r2.cubeList.add(new ModelBox(shoulderGuard1_r2, 0, 16, -1.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F));

        shoulderGuard2 = new ModelRenderer(this);
        shoulderGuard2.setRotationPoint(9.8F, -0.3F, -0.3F);
        bipedBody.addChild(shoulderGuard2);
        setRotationAngle(shoulderGuard2, 0.0F, 0.0F, 0.6981F);
        shoulderGuard2.cubeList.add(new ModelBox(shoulderGuard2, 48, 7, -4.2428F, 0.1339F, -2.2F, 2, 1, 5, 0.0F));

        shoulderGuard3 = new ModelRenderer(this);
        shoulderGuard3.setRotationPoint(9.8F, -0.3F, -4.3F);
        bipedBody.addChild(shoulderGuard3);
        setRotationAngle(shoulderGuard3, 0.0F, 0.0F, 0.6981F);


        shoulderGuard1_r3 = new ModelRenderer(this);
        shoulderGuard1_r3.setRotationPoint(-3.2428F, 3.3339F, 6.8F);
        shoulderGuard3.addChild(shoulderGuard1_r3);
        setRotationAngle(shoulderGuard1_r3, 0.3142F, 0.0F, 0.0F);
        shoulderGuard1_r3.cubeList.add(new ModelBox(shoulderGuard1_r3, 0, 16, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F));

        shoulderGuard1_r4 = new ModelRenderer(this);
        shoulderGuard1_r4.setRotationPoint(-3.2428F, 5.1339F, 5.4F);
        shoulderGuard3.addChild(shoulderGuard1_r4);
        setRotationAngle(shoulderGuard1_r4, -0.5236F, 0.0F, 0.0F);
        shoulderGuard1_r4.cubeList.add(new ModelBox(shoulderGuard1_r4, 0, 16, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F));

        shoulderGuard4 = new ModelRenderer(this);
        shoulderGuard4.setRotationPoint(-9.8F, -0.3F, -0.3F);
        bipedBody.addChild(shoulderGuard4);
        setRotationAngle(shoulderGuard4, 0.0F, 0.0F, -0.6981F);


        shoulderGuard1_r5 = new ModelRenderer(this);
        shoulderGuard1_r5.setRotationPoint(3.2428F, 5.1339F, -0.8F);
        shoulderGuard4.addChild(shoulderGuard1_r5);
        setRotationAngle(shoulderGuard1_r5, 0.5236F, 0.0F, 0.0F);
        shoulderGuard1_r5.cubeList.add(new ModelBox(shoulderGuard1_r5, 0, 16, -1.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F));

        shoulderGuard1_r6 = new ModelRenderer(this);
        shoulderGuard1_r6.setRotationPoint(3.2428F, 3.3339F, -2.2F);
        shoulderGuard4.addChild(shoulderGuard1_r6);
        setRotationAngle(shoulderGuard1_r6, -0.3142F, 0.0F, 0.0F);
        shoulderGuard1_r6.cubeList.add(new ModelBox(shoulderGuard1_r6, 0, 16, -1.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F));

        shoulderGuard5 = new ModelRenderer(this);
        shoulderGuard5.setRotationPoint(-9.8F, -0.3F, -0.3F);
        bipedBody.addChild(shoulderGuard5);
        setRotationAngle(shoulderGuard5, 0.0F, 0.0F, -0.6981F);
        shoulderGuard5.cubeList.add(new ModelBox(shoulderGuard5, 48, 7, 2.2428F, 0.1339F, -2.2F, 2, 1, 5, 0.0F));

        shoulderGuard6 = new ModelRenderer(this);
        shoulderGuard6.setRotationPoint(-9.8F, -0.3F, 4.3F);
        bipedBody.addChild(shoulderGuard6);
        setRotationAngle(shoulderGuard6, 0.0F, 0.0F, -0.6981F);


        shoulderGuard1_r7 = new ModelRenderer(this);
        shoulderGuard1_r7.setRotationPoint(3.2428F, 3.3339F, -1.8F);
        shoulderGuard6.addChild(shoulderGuard1_r7);
        setRotationAngle(shoulderGuard1_r7, 0.3142F, 0.0F, 0.0F);
        shoulderGuard1_r7.cubeList.add(new ModelBox(shoulderGuard1_r7, 0, 16, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F));

        shoulderGuard1_r8 = new ModelRenderer(this);
        shoulderGuard1_r8.setRotationPoint(3.2428F, 5.1339F, -3.2F);
        shoulderGuard6.addChild(shoulderGuard1_r8);
        setRotationAngle(shoulderGuard1_r8, -0.5236F, 0.0F, 0.0F);
        shoulderGuard1_r8.cubeList.add(new ModelBox(shoulderGuard1_r8, 0, 16, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F));

        backspike2 = new ModelRenderer(this);
        backspike2.setRotationPoint(-2.7F, 8.0F, -3.1F);
        bipedBody.addChild(backspike2);
        setRotationAngle(backspike2, -1.309F, 0.0F, 0.0F);
        backspike2.cubeList.add(new ModelBox(backspike2, 0, 22, 0.2F, -9.1F, -4.0F, 1, 4, 1, 0.5F));

        wristspike1_r1 = new ModelRenderer(this);
        wristspike1_r1.setRotationPoint(0.7031F, -9.2342F, -4.0169F);
        backspike2.addChild(wristspike1_r1);
        setRotationAngle(wristspike1_r1, 0.5585F, 0.0F, 0.0F);
        wristspike1_r1.cubeList.add(new ModelBox(wristspike1_r1, 1, 17, -0.5F, -1.0267F, 0.0F, 1, 1, 1, 0.5F));

        backspike1 = new ModelRenderer(this);
        backspike1.setRotationPoint(5.5F, 8.0F, -3.1F);
        bipedBody.addChild(backspike1);
        setRotationAngle(backspike1, -1.309F, 0.0017F, 0.0F);
        backspike1.cubeList.add(new ModelBox(backspike1, 0, 22, -4.0F, -9.1F, -4.0F, 1, 4, 1, 0.5F));

        wristspike1_r2 = new ModelRenderer(this);
        wristspike1_r2.setRotationPoint(-3.4969F, -9.2342F, -4.0169F);
        backspike1.addChild(wristspike1_r2);
        setRotationAngle(wristspike1_r2, 0.5585F, 0.0F, 0.0F);
        wristspike1_r2.cubeList.add(new ModelBox(wristspike1_r2, 1, 17, -0.5F, -1.0267F, 0.0F, 1, 1, 1, 0.5F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 48, -3.0031F, -2.079F, -2.0018F, 4, 12, 4, 0.0F));

        wristspike2 = new ModelRenderer(this);
        wristspike2.setRotationPoint(0.5F, 11.7F, 5.9F);
        bipedRightArm.addChild(wristspike2);


        wristspike1_r3 = new ModelRenderer(this);
        wristspike1_r3.setRotationPoint(-1.5031F, -6.7333F, -2.3717F);
        wristspike2.addChild(wristspike1_r3);
        setRotationAngle(wristspike1_r3, 0.5585F, 0.0F, 0.0F);
        wristspike1_r3.cubeList.add(new ModelBox(wristspike1_r3, 0, 16, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.1F));

        wristspike1_r4 = new ModelRenderer(this);
        wristspike1_r4.setRotationPoint(-1.5031F, -5.9333F, -2.2717F);
        wristspike2.addChild(wristspike1_r4);
        setRotationAngle(wristspike1_r4, 0.733F, 0.0F, 0.0F);
        wristspike1_r4.cubeList.add(new ModelBox(wristspike1_r4, 1, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r5 = new ModelRenderer(this);
        wristspike1_r5.setRotationPoint(-1.5031F, -6.5333F, -1.5717F);
        wristspike2.addChild(wristspike1_r5);
        setRotationAngle(wristspike1_r5, 0.7156F, 0.0F, 0.0F);
        wristspike1_r5.cubeList.add(new ModelBox(wristspike1_r5, 1, 17, -0.5F, -1.0267F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r6 = new ModelRenderer(this);
        wristspike1_r6.setRotationPoint(-1.5031F, -5.1333F, -3.9717F);
        wristspike2.addChild(wristspike1_r6);
        setRotationAngle(wristspike1_r6, 0.2967F, 0.0F, 0.0F);
        wristspike1_r6.cubeList.add(new ModelBox(wristspike1_r6, 1, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r7 = new ModelRenderer(this);
        wristspike1_r7.setRotationPoint(-1.5031F, -5.4333F, -3.0717F);
        wristspike2.addChild(wristspike1_r7);
        setRotationAngle(wristspike1_r7, 0.5411F, 0.0F, 0.0F);
        wristspike1_r7.cubeList.add(new ModelBox(wristspike1_r7, 1, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r8 = new ModelRenderer(this);
        wristspike1_r8.setRotationPoint(-1.5031F, -6.5333F, -3.6717F);
        wristspike2.addChild(wristspike1_r8);
        setRotationAngle(wristspike1_r8, 0.0873F, 0.0F, 0.0F);
        wristspike1_r8.cubeList.add(new ModelBox(wristspike1_r8, 0, 16, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.1F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 48, -0.9938F, -2.158F, -1.9964F, 4, 12, 4, 0.0F));

        wristspike1 = new ModelRenderer(this);
        wristspike1.setRotationPoint(-0.5F, 11.7F, 5.9F);
        bipedLeftArm.addChild(wristspike1);


        wristspike1_r9 = new ModelRenderer(this);
        wristspike1_r9.setRotationPoint(1.5031F, -6.7333F, -2.3717F);
        wristspike1.addChild(wristspike1_r9);
        setRotationAngle(wristspike1_r9, 0.5585F, 0.0F, 0.0F);
        wristspike1_r9.cubeList.add(new ModelBox(wristspike1_r9, 0, 16, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.1F));

        wristspike1_r10 = new ModelRenderer(this);
        wristspike1_r10.setRotationPoint(1.5031F, -5.9333F, -2.2717F);
        wristspike1.addChild(wristspike1_r10);
        setRotationAngle(wristspike1_r10, 0.733F, 0.0F, 0.0F);
        wristspike1_r10.cubeList.add(new ModelBox(wristspike1_r10, 1, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r11 = new ModelRenderer(this);
        wristspike1_r11.setRotationPoint(1.5031F, -6.5333F, -1.5717F);
        wristspike1.addChild(wristspike1_r11);
        setRotationAngle(wristspike1_r11, 0.7156F, 0.0F, 0.0F);
        wristspike1_r11.cubeList.add(new ModelBox(wristspike1_r11, 1, 17, -0.5F, -1.0267F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r12 = new ModelRenderer(this);
        wristspike1_r12.setRotationPoint(1.5031F, -5.1333F, -3.9717F);
        wristspike1.addChild(wristspike1_r12);
        setRotationAngle(wristspike1_r12, 0.2967F, 0.0F, 0.0F);
        wristspike1_r12.cubeList.add(new ModelBox(wristspike1_r12, 1, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r13 = new ModelRenderer(this);
        wristspike1_r13.setRotationPoint(1.5031F, -5.4333F, -3.0717F);
        wristspike1.addChild(wristspike1_r13);
        setRotationAngle(wristspike1_r13, 0.5411F, 0.0F, 0.0F);
        wristspike1_r13.cubeList.add(new ModelBox(wristspike1_r13, 1, 17, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.1F));

        wristspike1_r14 = new ModelRenderer(this);
        wristspike1_r14.setRotationPoint(1.5031F, -6.5333F, -3.6717F);
        wristspike1.addChild(wristspike1_r14);
        setRotationAngle(wristspike1_r14, 0.0873F, 0.0F, 0.0F);
        wristspike1_r14.cubeList.add(new ModelBox(wristspike1_r14, 0, 16, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.1F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 40, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.mirror = true;
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 40, 40, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        FroB = new ModelRenderer(this);
        FroB.setRotationPoint(0.0F, 10.0F, 2.0F);


        ftailS1 = new ModelRenderer(this);
        ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
        FroB.addChild(ftailS1);
        ftailS1.cubeList.add(new ModelBox(ftailS1, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

        ftailS2 = new ModelRenderer(this);
        ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS1.addChild(ftailS2);
        ftailS2.cubeList.add(new ModelBox(ftailS2, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

        ftailS3 = new ModelRenderer(this);
        ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS2.addChild(ftailS3);
        ftailS3.cubeList.add(new ModelBox(ftailS3, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

        ftailS4 = new ModelRenderer(this);
        ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS3.addChild(ftailS4);
        ftailS4.cubeList.add(new ModelBox(ftailS4, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

        ftailS5 = new ModelRenderer(this);
        ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS4.addChild(ftailS5);
        ftailS5.cubeList.add(new ModelBox(ftailS5, 6, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

        ftailS6 = new ModelRenderer(this);
        ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS5.addChild(ftailS6);
        ftailS6.cubeList.add(new ModelBox(ftailS6, 26, 6, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));
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
        bipedRightArm.render(scaleFactor);
        bipedLeftArm.render(scaleFactor);
        renderHairs(0.0625F, "FR", ageInTicks);
        GL11.glPopMatrix();
    }
    private void transRot(float f5, ModelRenderer m)
    {
        GL11.glTranslatef(m.rotationPointX * f5, m.rotationPointY * f5, m.rotationPointZ * f5);
        if (m.rotateAngleZ != 0.0F) {
            GL11.glRotatef(m.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
        }
        if (m.rotateAngleY != 0.0F) {
            GL11.glRotatef(m.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
        }
        if (m.rotateAngleX != 0.0F) {
            GL11.glRotatef(m.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
        }
    }
    public String renderHairs(float par1, String hair, float par3)
    {
        if (hair.equals("FR"))
        {
            GL11.glPushMatrix();
            transRot(par1, bipedBody);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            FroB.render(par1);
            float r = MathHelper.sin(par3 * 0.02F) * 0.1F;
            float r2 = MathHelper.cos(par3 * 0.02F) * 0.1F;
            float r3 = MathHelper.cos(par3 * 0.14F) * 0.1F;
            ftailS1.rotateAngleY = 0.2F;
            ftailS1.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r;
            ftailS1.rotateAngleX = -0.3F;
            ftailS2.rotateAngleY = 0.2F;
            ftailS2.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r2 + r3;
            ftailS2.rotateAngleX = 0.4F;
            ftailS3.rotateAngleY = 0.1F;
            ftailS3.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.1F - 0.1F + r + r3;
            ftailS3.rotateAngleX = 0.6F;
            ftailS3.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F + 0.3F;
            ftailS4.rotateAngleY = 0.1F;
            ftailS4.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.1F + r2;
            ftailS4.rotateAngleX = 0.3F;
            ftailS4.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.2F;
            ftailS5.rotateAngleY = 0.2F;
            ftailS5.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r + r3;
            ftailS5.rotateAngleX = -0.2F;
            ftailS5.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.3F;
            ftailS6.rotateAngleY = 0.2F;
            ftailS6.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r2 + r3;
            ftailS6.rotateAngleX = -0.4F;
            ftailS6.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F - 0.4F;
            GL11.glPopMatrix();
        }
        return "";
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

