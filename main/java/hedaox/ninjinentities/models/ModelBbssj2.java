package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelBbssj2 extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer hair;
    private final ModelRenderer hair12;
    private final ModelRenderer hair16;
    private final ModelRenderer bone2_r1_r1;
    private final ModelRenderer hair10;
    private final ModelRenderer hair14;
    private final ModelRenderer hair3;
    private final ModelRenderer hair18;
    private final ModelRenderer hair17;
    private final ModelRenderer hair6;
    private final ModelRenderer hair9;
    private final ModelRenderer hair5;
    private final ModelRenderer hair4;
    private final ModelRenderer hair15;
    private final ModelRenderer hair13;
    private final ModelRenderer hair11;
    private final ModelRenderer hair1;
    private final ModelRenderer hair21;
    private final ModelRenderer hair20;
    private final ModelRenderer hair19;
    private final ModelRenderer bone3_r1_r1;
    private final ModelRenderer hair23;
    private final ModelRenderer bone7_r1;
    private final ModelRenderer bone7_r1_r1;
    private final ModelRenderer hair22;
    private final ModelRenderer hair24;
    private final ModelRenderer hair25;
    private final ModelRenderer hair26;
    private final ModelRenderer bone11_r1;
    private final ModelRenderer hair2;
    private final ModelRenderer hair7;
    private final ModelRenderer hair8;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer RShoulder2;
    private final ModelRenderer RShoulder_r1;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer LShoulder2;
    private final ModelRenderer LShoulder_r1;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

    public ModelBbssj2(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        hair = new ModelRenderer(this);
        hair.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(hair);


        hair12 = new ModelRenderer(this);
        hair12.setRotationPoint(-0.3171F, -9.3105F, -4.52F);
        hair.addChild(hair12);
        setRotationAngle(hair12, -0.7941F, 0.476F, 0.6803F);


        hair16 = new ModelRenderer(this);
        hair16.setRotationPoint(0.3171F, 33.3105F, 2.52F);
        hair12.addChild(hair16);
        setRotationAngle(hair16, 0.0F, -0.0436F, 0.0F);


        bone2_r1_r1 = new ModelRenderer(this);
        bone2_r1_r1.setRotationPoint(0.7082F, -33.7232F, -4.6976F);
        hair16.addChild(bone2_r1_r1);
        setRotationAngle(bone2_r1_r1, 0.0724F, -0.0719F, -0.0266F);
        bone2_r1_r1.cubeList.add(new ModelBox(bone2_r1_r1, 54, 5, -1.7001F, -0.8678F, -0.2698F, 2, 2, 3, 0.0F));

        hair10 = new ModelRenderer(this);
        hair10.setRotationPoint(3.5F, -5.5F, 1.5F);
        hair.addChild(hair10);
        setRotationAngle(hair10, -0.1745F, 0.0F, 0.7854F);
        hair10.cubeList.add(new ModelBox(hair10, 48, 1, -1.4388F, -0.9F, -1.4F, 3, 2, 3, 0.0F));

        hair14 = new ModelRenderer(this);
        hair14.setRotationPoint(3.5F, -8.5F, 3.5F);
        hair.addChild(hair14);
        setRotationAngle(hair14, -0.2182F, 0.1187F, 0.0F);
        hair14.cubeList.add(new ModelBox(hair14, 47, 5, -3.3F, 0.0F, -2.05F, 4, 5, 3, 0.0F));

        hair3 = new ModelRenderer(this);
        hair3.setRotationPoint(5.0F, -7.0F, -2.0F);
        hair.addChild(hair3);
        setRotationAngle(hair3, -0.48F, 0.0F, 0.3927F);
        hair3.cubeList.add(new ModelBox(hair3, 45, 3, -4.3F, -1.2F, -0.4266F, 4, 4, 3, 0.0F));

        hair18 = new ModelRenderer(this);
        hair18.setRotationPoint(-6.0F, -1.6F, 2.5F);
        hair3.addChild(hair18);
        setRotationAngle(hair18, -0.3491F, 0.0873F, -0.7854F);
        hair18.cubeList.add(new ModelBox(hair18, 41, 5, -3.25F, -2.1784F, -1.3769F, 4, 5, 3, 0.0F));

        hair17 = new ModelRenderer(this);
        hair17.setRotationPoint(-6.3827F, -3.343F, 3.8474F);
        hair3.addChild(hair17);
        setRotationAngle(hair17, -0.3491F, 0.3491F, -0.6545F);
        hair17.cubeList.add(new ModelBox(hair17, 41, 5, -2.7173F, -2.1784F, -1.3769F, 3, 5, 3, 0.0F));

        hair6 = new ModelRenderer(this);
        hair6.setRotationPoint(5.0F, -8.0F, -3.0F);
        hair.addChild(hair6);
        setRotationAngle(hair6, -0.4799F, 0.0F, 0.1745F);
        hair6.cubeList.add(new ModelBox(hair6, 46, 2, -4.4F, -3.0F, 1.5F, 4, 3, 3, 0.0F));

        hair9 = new ModelRenderer(this);
        hair9.setRotationPoint(2.2F, -8.0F, 1.6F);
        hair.addChild(hair9);
        setRotationAngle(hair9, -0.672F, 0.0F, 0.2182F);
        hair9.cubeList.add(new ModelBox(hair9, 47, 2, -2.7F, -2.4F, -2.1F, 4, 6, 3, 0.0F));

        hair5 = new ModelRenderer(this);
        hair5.setRotationPoint(1.0F, -10.0F, -1.0F);
        hair.addChild(hair5);
        setRotationAngle(hair5, -0.6545F, 0.0F, 0.0F);
        hair5.cubeList.add(new ModelBox(hair5, 38, 4, -1.0F, -4.366F, 0.366F, 2, 4, 2, 0.0F));

        hair4 = new ModelRenderer(this);
        hair4.setRotationPoint(1.0F, -8.0F, -1.0F);
        hair.addChild(hair4);
        setRotationAngle(hair4, -0.5236F, 0.0F, 0.0F);
        hair4.cubeList.add(new ModelBox(hair4, 46, 4, -1.5F, -2.0F, -0.3F, 3, 3, 3, 0.0F));

        hair15 = new ModelRenderer(this);
        hair15.setRotationPoint(-3.0F, -8.0F, 2.5F);
        hair.addChild(hair15);
        setRotationAngle(hair15, -0.2182F, -0.1833F, 0.0F);
        hair15.cubeList.add(new ModelBox(hair15, 47, 5, -1.0F, -2.0F, -1.4F, 4, 6, 3, 0.0F));

        hair13 = new ModelRenderer(this);
        hair13.setRotationPoint(0.0F, -6.5F, 4.0F);
        hair.addChild(hair13);
        setRotationAngle(hair13, -0.3927F, 0.0F, 0.0F);
        hair13.cubeList.add(new ModelBox(hair13, 39, 7, -2.0F, -1.5F, -1.31F, 4, 4, 2, 0.0F));

        hair11 = new ModelRenderer(this);
        hair11.setRotationPoint(-3.5929F, -5.9F, 1.3044F);
        hair.addChild(hair11);
        setRotationAngle(hair11, -1.4835F, 0.0F, 0.7854F);
        hair11.cubeList.add(new ModelBox(hair11, 48, 1, -0.9071F, -1.4F, -1.5F, 3, 3, 3, 0.0F));

        hair1 = new ModelRenderer(this);
        hair1.setRotationPoint(-2.1F, -8.7F, -0.5F);
        hair.addChild(hair1);
        setRotationAngle(hair1, -0.3054F, 0.0F, -0.3491F);
        hair1.cubeList.add(new ModelBox(hair1, 40, 4, -2.4F, -1.3F, -2.0F, 4, 3, 4, 0.0F));

        hair21 = new ModelRenderer(this);
        hair21.setRotationPoint(-0.0036F, -6.8F, -3.8536F);
        hair.addChild(hair21);
        setRotationAngle(hair21, 0.656F, -0.683F, -0.4463F);
        hair21.cubeList.add(new ModelBox(hair21, 54, 5, -0.3964F, -2.505F, -0.3964F, 2, 3, 2, 0.0F));

        hair20 = new ModelRenderer(this);
        hair20.setRotationPoint(1.7141F, -9.4245F, -6.1921F);
        hair.addChild(hair20);
        setRotationAngle(hair20, -0.7778F, -0.4431F, 1.5161F);


        hair19 = new ModelRenderer(this);
        hair19.setRotationPoint(-0.6141F, 0.0F, 1.3921F);
        hair20.addChild(hair19);
        setRotationAngle(hair19, 0.0F, 0.6109F, 0.0F);


        bone3_r1_r1 = new ModelRenderer(this);
        bone3_r1_r1.setRotationPoint(0.2335F, -0.0225F, -0.7852F);
        hair19.addChild(bone3_r1_r1);
        setRotationAngle(bone3_r1_r1, 0.0495F, -0.0713F, -0.0604F);
        bone3_r1_r1.cubeList.add(new ModelBox(bone3_r1_r1, 54, 5, -1.6109F, -0.8685F, -1.3108F, 2, 2, 2, 0.0F));

        hair23 = new ModelRenderer(this);
        hair23.setRotationPoint(0.5284F, -10.1338F, -5.9196F);
        hair.addChild(hair23);
        setRotationAngle(hair23, -0.8459F, 0.5578F, 0.5784F);


        bone7_r1 = new ModelRenderer(this);
        bone7_r1.setRotationPoint(2.2785F, -0.4162F, -2.1804F);
        hair23.addChild(bone7_r1);
        setRotationAngle(bone7_r1, 0.0F, 0.2182F, 0.0F);


        bone7_r1_r1 = new ModelRenderer(this);
        bone7_r1_r1.setRotationPoint(-2.099F, -0.0159F, 1.3371F);
        bone7_r1.addChild(bone7_r1_r1);
        setRotationAngle(bone7_r1_r1, 0.0752F, -0.0728F, 0.0016F);
        bone7_r1_r1.cubeList.add(new ModelBox(bone7_r1_r1, 54, 5, 0.1458F, -0.8747F, -2.0909F, 3, 2, 2, 0.0F));

        hair22 = new ModelRenderer(this);
        hair22.setRotationPoint(0.9964F, -6.8F, -1.8536F);
        hair.addChild(hair22);
        setRotationAngle(hair22, 0.656F, -0.683F, -0.4463F);
        hair22.cubeList.add(new ModelBox(hair22, 54, 5, -0.3964F, -2.505F, -0.3964F, 2, 2, 2, 0.0F));

        hair24 = new ModelRenderer(this);
        hair24.setRotationPoint(1.5052F, -9.3102F, -2.7932F);
        hair.addChild(hair24);
        setRotationAngle(hair24, 0.2284F, -0.683F, -0.4463F);
        hair24.cubeList.add(new ModelBox(hair24, 54, 5, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F));

        hair25 = new ModelRenderer(this);
        hair25.setRotationPoint(2.871F, -9.2022F, -4.2502F);
        hair.addChild(hair25);
        setRotationAngle(hair25, 0.6211F, -0.683F, -0.4463F);
        hair25.cubeList.add(new ModelBox(hair25, 55, 6, -0.9F, -0.8978F, -1.0998F, 2, 2, 2, 0.0F));

        hair26 = new ModelRenderer(this);
        hair26.setRotationPoint(4.3576F, -9.2548F, -5.3957F);
        hair.addChild(hair26);
        setRotationAngle(hair26, 0.6211F, -0.683F, -0.4463F);


        bone11_r1 = new ModelRenderer(this);
        bone11_r1.setRotationPoint(-0.1348F, 1.0367F, 0.0929F);
        hair26.addChild(bone11_r1);
        setRotationAngle(bone11_r1, 0.2793F, 0.0F, 0.0F);
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 54, 5, -1.07F, -1.1609F, -1.089F, 2, 2, 2, 0.0F));

        hair2 = new ModelRenderer(this);
        hair2.setRotationPoint(1.0F, -10.0F, -1.0F);
        hair.addChild(hair2);
        setRotationAngle(hair2, -2.0071F, 0.0F, 0.0F);
        hair2.cubeList.add(new ModelBox(hair2, 45, 3, -1.5F, -1.0F, -1.0F, 3, 3, 4, 0.0F));

        hair7 = new ModelRenderer(this);
        hair7.setRotationPoint(-2.0F, -8.4422F, -2.1716F);
        hair.addChild(hair7);
        setRotationAngle(hair7, -0.2926F, 0.6575F, 0.1295F);
        hair7.cubeList.add(new ModelBox(hair7, 38, 4, -0.41F, -1.6F, -0.7F, 2, 3, 2, 0.0F));

        hair8 = new ModelRenderer(this);
        hair8.setRotationPoint(-1.2151F, -10.3399F, -0.7827F);
        hair.addChild(hair8);
        setRotationAngle(hair8, -0.2753F, 0.5737F, 0.1595F);
        hair8.cubeList.add(new ModelBox(hair8, 38, 4, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        RShoulder2 = new ModelRenderer(this);
        RShoulder2.setRotationPoint(-14.0F, -2.0F, 0.5F);
        bipedRightArm.addChild(RShoulder2);
        setRotationAngle(RShoulder2, 0.0F, 3.1416F, 0.0873F);


        RShoulder_r1 = new ModelRenderer(this);
        RShoulder_r1.setRotationPoint(-10.6503F, -1.7769F, 0.0F);
        RShoulder_r1.mirror = true;
        RShoulder2.addChild(RShoulder_r1);
        setRotationAngle(RShoulder_r1, 0.0F, 0.0F, -0.3054F);
        RShoulder_r1.cubeList.add(new ModelBox(RShoulder_r1, 64, 0, -3.5F, -2.5F, -2.5F, 7, 5, 6, 0.0F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(5.0F, 3.0F, 0.0F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 32, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        LShoulder2 = new ModelRenderer(this);
        LShoulder2.setRotationPoint(14.0F, -2.0F, 0.5F);
        bipedLeftArm.addChild(LShoulder2);
        setRotationAngle(LShoulder2, 0.0F, -3.1416F, -0.0873F);


        LShoulder_r1 = new ModelRenderer(this);
        LShoulder_r1.setRotationPoint(10.6503F, -1.7769F, 0.0F);
        LShoulder2.addChild(LShoulder_r1);
        setRotationAngle(LShoulder_r1, 0.0F, 0.0F, 0.3054F);
        LShoulder_r1.cubeList.add(new ModelBox(LShoulder_r1, 64, 0, -3.5F, -2.5F, -2.5F, 7, 5, 6, 0.0F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.mirror = true;
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 32, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
        bipedHead.render(f5);
        bipedBody.render(f5);
        GL11.glPopMatrix();
        this.bipedHead.rotateAngleY = f3 / (220F / (float)Math.PI);
        this.bipedHead.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.bipedRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
