package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKanbaSsj3 extends ModelBase {
    private final ModelRenderer Body;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer Head;
    private final ModelRenderer hair;
    private final ModelRenderer hair1;
    private final ModelRenderer hair1_r1;
    private final ModelRenderer hair2;
    private final ModelRenderer hair3;
    private final ModelRenderer hair4;
    private final ModelRenderer hair5;
    private final ModelRenderer hair5_r1;
    private final ModelRenderer hair5_1;
    private final ModelRenderer hair5_5_r1;
    private final ModelRenderer hair5_4_r1;
    private final ModelRenderer hair5_3_r1;
    private final ModelRenderer hair5_2_r1;
    private final ModelRenderer hair5_1_r1;
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
    private final ModelRenderer hair16;
    private final ModelRenderer hair17;
    private final ModelRenderer hair18;
    private final ModelRenderer hair19;
    private final ModelRenderer hair19_3_r1;
    private final ModelRenderer hair19_2_r1;
    private final ModelRenderer hair20;
    private final ModelRenderer hair21;
    private final ModelRenderer hair22;
    private final ModelRenderer hair23;
    private final ModelRenderer hair24;
    private final ModelRenderer hair25;
    private final ModelRenderer hair26;
    private final ModelRenderer hair27;
    private final ModelRenderer hair28;
    private final ModelRenderer hair29;
    private final ModelRenderer hair30;
    private final ModelRenderer hair31;
    private final ModelRenderer hair32;
    private final ModelRenderer hair34;
    private final ModelRenderer hair34_2_r1;
    private final ModelRenderer hair34_r1;
    private final ModelRenderer hair33;
    private final ModelRenderer hair33_2_r1;
    private final ModelRenderer hair35;
    private final ModelRenderer hair36;
    private final ModelRenderer hair38;
    private final ModelRenderer hair39;
    private final ModelRenderer hair40;
    private final ModelRenderer hair41;
    private final ModelRenderer mz;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer FroB;
    private final ModelRenderer ftailS1;
    private final ModelRenderer ftailS2;
    private final ModelRenderer ftailS3;
    private final ModelRenderer ftailS4;
    private final ModelRenderer ftailS5;
    private final ModelRenderer ftailS6;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private float scale = 1.0F;

    public ModelKanbaSsj3(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.2F, 5.4F, -0.2F);
        Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        RLeg = new ModelRenderer(this);
        RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
        Body.addChild(RLeg);
        RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        LLeg = new ModelRenderer(this);
        LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
        LLeg.mirror = true;
        Body.addChild(LLeg);
        LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.1F, 0.0F);
        Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.1F));

        hair = new ModelRenderer(this);
        hair.setRotationPoint(2.0F, -9.0F, -2.2F);
        Head.addChild(hair);


        hair1 = new ModelRenderer(this);
        hair1.setRotationPoint(-4.0F, 7.4669F, 12.0102F);
        hair.addChild(hair1);
        setRotationAngle(hair1, -0.9587F, -0.2133F, -0.0902F);


        hair1_r1 = new ModelRenderer(this);
        hair1_r1.setRotationPoint(2.0F, 25.4331F, -9.8102F);
        hair1.addChild(hair1_r1);
        setRotationAngle(hair1_r1, -0.0175F, 0.0175F, -0.0003F);
        hair1_r1.cubeList.add(new ModelBox(hair1_r1, 32, 1, -4.0F, -25.7F, 2.8102F, 4, 3, 12, -0.1F));

        hair2 = new ModelRenderer(this);
        hair2.setRotationPoint(0.0F, 7.6669F, 11.7102F);
        hair.addChild(hair2);
        setRotationAngle(hair2, -0.9214F, 0.5763F, 0.0981F);
        hair2.cubeList.add(new ModelBox(hair2, 32, 1, -2.0F, -0.1669F, -7.0F, 4, 3, 12, -0.1F));

        hair3 = new ModelRenderer(this);
        hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
        hair.addChild(hair3);
        setRotationAngle(hair3, -0.4887F, 0.0F, 0.0F);
        hair3.cubeList.add(new ModelBox(hair3, 45, 7, -4.0F, -1.0F, 10.0F, 4, 2, 5, -0.1F));

        hair4 = new ModelRenderer(this);
        hair4.setRotationPoint(-2.0F, 0.9F, 10.6F);
        hair.addChild(hair4);
        setRotationAngle(hair4, -0.9425F, 0.0F, 0.0F);
        hair4.cubeList.add(new ModelBox(hair4, 42, 5, -2.0F, 0.5059F, -3.0957F, 4, 4, 7, -0.1F));

        hair5 = new ModelRenderer(this);
        hair5.setRotationPoint(-2.7964F, 2.3F, 0.0464F);
        hair.addChild(hair5);
        setRotationAngle(hair5, 0.8028F, 0.7047F, 0.3506F);


        hair5_r1 = new ModelRenderer(this);
        hair5_r1.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
        hair5.addChild(hair5_r1);
        setRotationAngle(hair5_r1, 0.5542F, -0.24F, 0.1054F);
        hair5_r1.cubeList.add(new ModelBox(hair5_r1, 54, 5, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.3F));

        hair5_1 = new ModelRenderer(this);
        hair5_1.setRotationPoint(-0.3036F, -1.9F, 0.2536F);
        hair5.addChild(hair5_1);
        setRotationAngle(hair5_1, 0.192F, 0.0F, 0.0F);


        hair5_5_r1 = new ModelRenderer(this);
        hair5_5_r1.setRotationPoint(0.8F, 0.495F, -3.25F);
        hair5_1.addChild(hair5_5_r1);
        setRotationAngle(hair5_5_r1, 2.4391F, -0.24F, 0.1054F);
        hair5_5_r1.cubeList.add(new ModelBox(hair5_5_r1, 54, 5, -1.09F, -1.845F, -1.1F, 2, 3, 2, -0.44F));

        hair5_4_r1 = new ModelRenderer(this);
        hair5_4_r1.setRotationPoint(0.7F, -0.105F, -2.45F);
        hair5_1.addChild(hair5_4_r1);
        setRotationAngle(hair5_4_r1, 2.0988F, -0.24F, 0.1054F);
        hair5_4_r1.cubeList.add(new ModelBox(hair5_4_r1, 54, 5, -1.13F, -0.967F, -0.988F, 2, 2, 2, -0.42F));

        hair5_3_r1 = new ModelRenderer(this);
        hair5_3_r1.setRotationPoint(0.5F, -0.405F, -1.45F);
        hair5_1.addChild(hair5_3_r1);
        setRotationAngle(hair5_3_r1, 1.7323F, -0.24F, 0.1054F);
        hair5_3_r1.cubeList.add(new ModelBox(hair5_3_r1, 54, 5, -1.14F, -1.085F, -0.91F, 2, 2, 2, -0.41F));

        hair5_2_r1 = new ModelRenderer(this);
        hair5_2_r1.setRotationPoint(0.2F, -0.505F, -0.65F);
        hair5_1.addChild(hair5_2_r1);
        setRotationAngle(hair5_2_r1, 1.3309F, -0.24F, 0.1054F);
        hair5_2_r1.cubeList.add(new ModelBox(hair5_2_r1, 54, 5, -1.03F, -1.0F, -1.035F, 2, 2, 2, -0.4F));

        hair5_1_r1 = new ModelRenderer(this);
        hair5_1_r1.setRotationPoint(0.0F, -0.105F, -0.15F);
        hair5_1.addChild(hair5_1_r1);
        setRotationAngle(hair5_1_r1, 0.5542F, -0.24F, 0.1054F);
        hair5_1_r1.cubeList.add(new ModelBox(hair5_1_r1, 54, 5, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

        hair6 = new ModelRenderer(this);
        hair6.setRotationPoint(-4.6421F, 4.7574F, 3.8009F);
        hair.addChild(hair6);
        setRotationAngle(hair6, -1.1974F, -0.844F, -0.2703F);
        hair6.cubeList.add(new ModelBox(hair6, 51, 6, -1.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

        hair7 = new ModelRenderer(this);
        hair7.setRotationPoint(-4.8748F, 9.3493F, 4.8122F);
        hair.addChild(hair7);
        setRotationAngle(hair7, -2.0007F, -1.0092F, -0.3326F);
        hair7.cubeList.add(new ModelBox(hair7, 51, 7, 0.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        hair8 = new ModelRenderer(this);
        hair8.setRotationPoint(-6.0542F, 5.7674F, 2.9604F);
        hair.addChild(hair8);
        setRotationAngle(hair8, -1.5453F, -0.616F, -0.4275F);
        hair8.cubeList.add(new ModelBox(hair8, 52, 6, 0.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

        hair9 = new ModelRenderer(this);
        hair9.setRotationPoint(-6.1F, 3.3F, 1.7F);
        hair.addChild(hair9);
        setRotationAngle(hair9, -0.8888F, -0.6641F, -0.0678F);
        hair9.cubeList.add(new ModelBox(hair9, 51, 6, 0.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

        hair10 = new ModelRenderer(this);
        hair10.setRotationPoint(-6.4909F, 14.7945F, 12.6914F);
        hair.addChild(hair10);
        setRotationAngle(hair10, -2.8559F, -0.4654F, -0.3194F);
        hair10.cubeList.add(new ModelBox(hair10, 50, 7, 0.0F, -6.0F, 0.0F, 4, 6, 3, -0.15F));

        hair11 = new ModelRenderer(this);
        hair11.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair11);
        setRotationAngle(hair11, -2.3269F, -0.9898F, -0.4286F);
        hair11.cubeList.add(new ModelBox(hair11, 52, 1, -0.8F, -10.0F, 1.0F, 3, 12, 3, -0.1F));

        hair12 = new ModelRenderer(this);
        hair12.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair12);
        setRotationAngle(hair12, -2.4986F, -0.4604F, -0.3381F);
        hair12.cubeList.add(new ModelBox(hair12, 48, 0, 0.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        hair13 = new ModelRenderer(this);
        hair13.setRotationPoint(-6.9326F, 6.5612F, 6.9193F);
        hair.addChild(hair13);
        setRotationAngle(hair13, -2.1931F, -0.4604F, -0.3381F);
        hair13.cubeList.add(new ModelBox(hair13, 50, 7, 0.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        hair14 = new ModelRenderer(this);
        hair14.setRotationPoint(-4.1834F, 1.7815F, 9.8741F);
        hair.addChild(hair14);
        setRotationAngle(hair14, -1.8438F, -0.0747F, -0.5456F);
        hair14.cubeList.add(new ModelBox(hair14, 50, 7, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

        hair15 = new ModelRenderer(this);
        hair15.setRotationPoint(-7.9673F, 2.7138F, 5.9609F);
        hair.addChild(hair15);
        setRotationAngle(hair15, -1.2846F, 0.1617F, -1.1107F);
        hair15.cubeList.add(new ModelBox(hair15, 49, 7, 0.0F, -5.0F, 0.5F, 4, 5, 3, -0.1F));

        hair16 = new ModelRenderer(this);
        hair16.setRotationPoint(-6.1158F, 2.3386F, 3.6304F);
        hair.addChild(hair16);
        setRotationAngle(hair16, -0.7848F, 0.1116F, -0.5843F);
        hair16.cubeList.add(new ModelBox(hair16, 54, 9, 0.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

        hair17 = new ModelRenderer(this);
        hair17.setRotationPoint(-7.3049F, 0.386F, 5.2482F);
        hair.addChild(hair17);
        setRotationAngle(hair17, -0.8358F, 0.3467F, -0.643F);
        hair17.cubeList.add(new ModelBox(hair17, 45, 1, 0.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

        hair18 = new ModelRenderer(this);
        hair18.setRotationPoint(-5.4154F, 0.4016F, 1.2309F);
        hair.addChild(hair18);
        setRotationAngle(hair18, -0.6023F, -0.067F, -0.2533F);
        hair18.cubeList.add(new ModelBox(hair18, 46, 3, 1.4F, -6.0F, 0.1691F, 3, 7, 2, -0.1F));

        hair19 = new ModelRenderer(this);
        hair19.setRotationPoint(-1.6F, 1.0F, -0.6F);
        hair.addChild(hair19);
        setRotationAngle(hair19, -0.2792F, -0.1205F, -0.5114F);
        hair19.cubeList.add(new ModelBox(hair19, 52, 9, -3.2744F, -3.0523F, 0.1913F, 3, 3, 2, -0.1F));

        hair19_3_r1 = new ModelRenderer(this);
        hair19_3_r1.setRotationPoint(-1.4F, -3.8F, 0.2F);
        hair19.addChild(hair19_3_r1);
        setRotationAngle(hair19_3_r1, -0.1571F, 0.0F, 0.4363F);
        hair19_3_r1.cubeList.add(new ModelBox(hair19_3_r1, 32, 1, -1.9939F, -3.0579F, 0.1913F, 3, 3, 2, -0.5F));

        hair19_2_r1 = new ModelRenderer(this);
        hair19_2_r1.setRotationPoint(-2.4F, -2.4F, 1.0F);
        hair19.addChild(hair19_2_r1);
        setRotationAngle(hair19_2_r1, -0.1222F, 0.0F, 0.192F);
        hair19_2_r1.cubeList.add(new ModelBox(hair19_2_r1, 33, 0, -0.9939F, -3.0579F, -0.8087F, 3, 3, 2, -0.35F));

        hair20 = new ModelRenderer(this);
        hair20.setRotationPoint(0.6421F, 4.9574F, 3.3009F);
        hair.addChild(hair20);
        setRotationAngle(hair20, -1.2253F, 0.7601F, 0.2358F);
        hair20.cubeList.add(new ModelBox(hair20, 51, 6, -2.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

        hair21 = new ModelRenderer(this);
        hair21.setRotationPoint(0.8748F, 9.3493F, 4.8122F);
        hair.addChild(hair21);
        setRotationAngle(hair21, -2.0007F, 1.0092F, 0.3326F);
        hair21.cubeList.add(new ModelBox(hair21, 51, 7, -3.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        hair22 = new ModelRenderer(this);
        hair22.setRotationPoint(2.0542F, 5.7674F, 2.9604F);
        hair.addChild(hair22);
        setRotationAngle(hair22, -1.5453F, 0.616F, 0.4275F);
        hair22.cubeList.add(new ModelBox(hair22, 52, 6, -2.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

        hair23 = new ModelRenderer(this);
        hair23.setRotationPoint(2.1F, 3.3F, 1.7F);
        hair.addChild(hair23);
        setRotationAngle(hair23, -0.8888F, 0.6641F, 0.0678F);
        hair23.cubeList.add(new ModelBox(hair23, 51, 6, -2.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

        hair24 = new ModelRenderer(this);
        hair24.setRotationPoint(2.7909F, 14.9945F, 12.7914F);
        hair.addChild(hair24);
        setRotationAngle(hair24, -2.8476F, 0.4604F, 0.3381F);
        hair24.cubeList.add(new ModelBox(hair24, 50, 6, -4.0F, -6.8F, 0.0F, 4, 7, 3, -0.18F));

        hair25 = new ModelRenderer(this);
        hair25.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair25);
        setRotationAngle(hair25, -2.3269F, 0.9898F, 0.4286F);
        hair25.cubeList.add(new ModelBox(hair25, 52, 0, -2.0F, -9.8F, 1.0F, 3, 12, 3, -0.1F));

        hair26 = new ModelRenderer(this);
        hair26.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair26);
        setRotationAngle(hair26, -2.4986F, 0.4604F, 0.3381F);
        hair26.cubeList.add(new ModelBox(hair26, 48, 0, -4.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        hair27 = new ModelRenderer(this);
        hair27.setRotationPoint(2.9326F, 6.5612F, 6.9193F);
        hair.addChild(hair27);
        setRotationAngle(hair27, -2.1931F, 0.4604F, 0.3381F);
        hair27.cubeList.add(new ModelBox(hair27, 46, 6, -4.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        hair28 = new ModelRenderer(this);
        hair28.setRotationPoint(0.1834F, 1.7815F, 9.8741F);
        hair.addChild(hair28);
        setRotationAngle(hair28, -1.7391F, 0.0747F, 0.5456F);
        hair28.cubeList.add(new ModelBox(hair28, 50, 7, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

        hair29 = new ModelRenderer(this);
        hair29.setRotationPoint(3.9673F, 2.7138F, 5.9609F);
        hair.addChild(hair29);
        setRotationAngle(hair29, -1.3179F, -0.1955F, 1.1019F);
        hair29.cubeList.add(new ModelBox(hair29, 49, 7, -4.0F, -4.5F, 0.5F, 4, 5, 3, -0.1F));

        hair30 = new ModelRenderer(this);
        hair30.setRotationPoint(2.1158F, 2.3386F, 3.6304F);
        hair.addChild(hair30);
        setRotationAngle(hair30, -0.7848F, -0.1116F, 0.5843F);
        hair30.cubeList.add(new ModelBox(hair30, 54, 9, -3.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

        hair31 = new ModelRenderer(this);
        hair31.setRotationPoint(3.3049F, 0.386F, 5.2482F);
        hair.addChild(hair31);
        setRotationAngle(hair31, -0.8358F, -0.3467F, 0.643F);
        hair31.cubeList.add(new ModelBox(hair31, 45, 1, -4.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

        hair32 = new ModelRenderer(this);
        hair32.setRotationPoint(1.4154F, 0.4016F, 1.2309F);
        hair.addChild(hair32);
        setRotationAngle(hair32, -0.6023F, 0.067F, 0.2533F);
        hair32.cubeList.add(new ModelBox(hair32, 51, 1, -4.0F, -5.0F, -0.7309F, 3, 7, 2, -0.1F));

        hair34 = new ModelRenderer(this);
        hair34.setRotationPoint(-1.775F, 1.9057F, 0.3382F);
        hair.addChild(hair34);
        setRotationAngle(hair34, -0.226F, -0.0149F, -0.1213F);


        hair34_2_r1 = new ModelRenderer(this);
        hair34_2_r1.setRotationPoint(0.075F, -2.5057F, -0.0382F);
        hair34.addChild(hair34_2_r1);
        setRotationAngle(hair34_2_r1, -0.1916F, 0.1523F, -0.2527F);
        hair34_2_r1.cubeList.add(new ModelBox(hair34_2_r1, 32, 7, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.3F));

        hair34_r1 = new ModelRenderer(this);
        hair34_r1.setRotationPoint(0.275F, -0.1057F, -0.0382F);
        hair34.addChild(hair34_r1);
        setRotationAngle(hair34_r1, -0.0266F, 0.2955F, -0.0912F);
        hair34_r1.cubeList.add(new ModelBox(hair34_r1, 32, 7, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.15F));

        hair33 = new ModelRenderer(this);
        hair33.setRotationPoint(-2.0F, 1.0F, -0.5F);
        hair.addChild(hair33);
        setRotationAngle(hair33, -0.253F, 0.0501F, 0.2577F);
        hair33.cubeList.add(new ModelBox(hair33, 52, 10, 0.0F, -2.0F, 0.2F, 3, 2, 2, 0.0F));

        hair33_2_r1 = new ModelRenderer(this);
        hair33_2_r1.setRotationPoint(1.5F, -1.8F, 1.0F);
        hair33.addChild(hair33_2_r1);
        setRotationAngle(hair33_2_r1, 0.0F, 0.0F, 0.1571F);
        hair33_2_r1.cubeList.add(new ModelBox(hair33_2_r1, 52, 10, -1.5F, -3.0F, -1.0F, 3, 4, 2, -0.3F));

        hair35 = new ModelRenderer(this);
        hair35.setRotationPoint(-1.2706F, -1.3339F, 7.2587F);
        hair.addChild(hair35);
        setRotationAngle(hair35, -0.7042F, 0.2118F, -0.2571F);
        hair35.cubeList.add(new ModelBox(hair35, 45, 1, -2.6F, -3.1F, -1.9F, 4, 6, 3, -0.1F));

        hair36 = new ModelRenderer(this);
        hair36.setRotationPoint(-6.0F, 7.0F, 7.0F);
        hair.addChild(hair36);
        setRotationAngle(hair36, -2.5744F, 0.0F, 0.0F);
        hair36.cubeList.add(new ModelBox(hair36, 42, 2, 0.9972F, -11.6289F, -3.1585F, 6, 10, 3, -0.1F));

        hair38 = new ModelRenderer(this);
        hair38.setRotationPoint(-6.3578F, 5.4795F, 5.8429F);
        hair.addChild(hair38);
        setRotationAngle(hair38, -2.671F, -0.1142F, 0.5972F);
        hair38.cubeList.add(new ModelBox(hair38, 42, 2, -1.2582F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

        hair39 = new ModelRenderer(this);
        hair39.setRotationPoint(2.0F, 7.0F, 6.2F);
        hair.addChild(hair39);
        setRotationAngle(hair39, -2.7053F, -0.1745F, 0.9599F);
        hair39.cubeList.add(new ModelBox(hair39, 42, 2, -8.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

        hair40 = new ModelRenderer(this);
        hair40.setRotationPoint(2.3578F, 5.4795F, 5.8429F);
        hair.addChild(hair40);
        setRotationAngle(hair40, -2.671F, 0.1142F, -0.5972F);
        hair40.cubeList.add(new ModelBox(hair40, 42, 2, -1.7418F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

        hair41 = new ModelRenderer(this);
        hair41.setRotationPoint(-6.0F, 7.0F, 6.2F);
        hair.addChild(hair41);
        setRotationAngle(hair41, -2.7053F, 0.1745F, -0.9599F);
        hair41.cubeList.add(new ModelBox(hair41, 42, 2, 5.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

        mz = new ModelRenderer(this);
        mz.setRotationPoint(0.0F, 0.0F, -0.95F);
        Head.addChild(mz);
        mz.cubeList.add(new ModelBox(mz, 90, 61, -1.0F, -2.0F, -3.75F, 2, 2, 1, 0.0F));
        mz.cubeList.add(new ModelBox(mz, 77, 61, -2.0F, -2.1F, -3.5F, 4, 2, 1, 0.0F));
        mz.cubeList.add(new ModelBox(mz, 55, 60, -4.0F, -2.0F, -3.25F, 8, 2, 2, 0.0F));
        mz.cubeList.add(new ModelBox(mz, 23, 58, -2.15F, -1.2F, -3.75F, 1, 1, 1, 0.0F));
        mz.cubeList.add(new ModelBox(mz, 23, 62, 1.15F, -1.2F, -3.75F, 1, 1, 1, 0.0F));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-3.7F, -3.2F, -1.0F);
        mz.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 57, -1.0F, -2.0F, -1.5F, 2, 4, 3, 0.0F));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 57, 6.4F, -2.0F, -1.5F, 2, 4, 3, 0.0F));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -1.9498F, -3.699F);
        mz.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.9687F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 53, -1.0F, -1.0068F, -0.0605F, 2, 1, 1, 0.0F));

        FroB = new ModelRenderer(this);
        FroB.setRotationPoint(0.0F, 10.0F, 2.0F);


        ftailS1 = new ModelRenderer(this);
        ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
        FroB.addChild(ftailS1);
        ftailS1.cubeList.add(new ModelBox(ftailS1, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

        ftailS2 = new ModelRenderer(this);
        ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS1.addChild(ftailS2);
        ftailS2.cubeList.add(new ModelBox(ftailS2, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

        ftailS3 = new ModelRenderer(this);
        ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS2.addChild(ftailS3);
        ftailS3.cubeList.add(new ModelBox(ftailS3, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

        ftailS4 = new ModelRenderer(this);
        ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS3.addChild(ftailS4);
        ftailS4.cubeList.add(new ModelBox(ftailS4, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

        ftailS5 = new ModelRenderer(this);
        ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS4.addChild(ftailS5);
        ftailS5.cubeList.add(new ModelBox(ftailS5, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

        ftailS6 = new ModelRenderer(this);
        ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS5.addChild(ftailS6);
        ftailS6.cubeList.add(new ModelBox(ftailS6, 94, 7, -1.5F, -2.0F, 0.0F, 3, 4, 6, 0.0F));

        RArm = new ModelRenderer(this);
        RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        LArm = new ModelRenderer(this);
        LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LArm.mirror = true;
        LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float scale = 1.5F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / scale, 1.5F / scale, 1.5F / scale);
            GL11.glTranslatef(0.0F, 16.0F * f5, 0.0F);
            this.Head.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / scale, 1.0F / scale, 1.0F / scale);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            this.Body.render(f5);
            GL11.glPopMatrix();
        } else {
            this.Head.render(f5);
            this.Body.render(f5);
            renderHairs(0.0625F, "FR", f2);
            this.RArm.render(f5);
            this.LArm.render(f5);
        }
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
            transRot(par1, Body);
            GL11.glScalef(1.0F, 0.35F, 1.0F);
            FroB.render(par1);
            GL11.glScaled(0.1D, 0.1D, 0.1D);
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

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        this.Head.rotateAngleY = p_78087_4_  / (110F / (float)Math.PI);
        this.Head.rotateAngleX = p_78087_5_  / (90F / (float)Math.PI);
        this.RArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
        this.LArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
        this.RArm.rotateAngleZ = 0.0F;
        this.LArm.rotateAngleZ = 0.0F;
        this.RLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.LLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.RLeg.rotateAngleY = 0.0F;
        this.LLeg.rotateAngleY = 0.0F;
        this.RArm.rotateAngleY = 0.0F;
        if (this.onGround > -9990.0F)
        {
            float f6 = this.onGround;
            this.Body.rotateAngleY = (MathHelper.sin(MathHelper.sqrt_float(f6) * 3.1415927F * 2.0F) * 0.2F);
            this.RArm.rotationPointZ = (-MathHelper.sin(this.Body.rotateAngleY) * 5.0F);
            this.RArm.rotationPointX = (-MathHelper.cos(this.Body.rotateAngleY) * 6.0F);
            this.LArm.rotationPointZ = (-MathHelper.sin(this.Body.rotateAngleY) * 5.0F);
            this.LArm.rotationPointX = (MathHelper.cos(this.Body.rotateAngleY) * 5.0F);

            f6 = 1.0F - this.onGround;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            float f7 = MathHelper.sin(f6 * 3.1415927F);
            float f8 = MathHelper.sin(this.onGround * 3.1415927F) * -(this.Head.rotateAngleX - 0.7F) * 0.75F;
            this.RArm.rotateAngleX = ((float)(this.RArm.rotateAngleX - (f7 * 1.2D + f8)));
            this.RArm.rotateAngleY += this.Body.rotateAngleY * 2.0F;
            this.RArm.rotateAngleZ = (MathHelper.sin(this.onGround * 2.1415927F) * -0.4F);

            this.RArm.offsetX = 0.063F;
            this.RArm.offsetZ = 0.0F;
            this.LArm.offsetX = -0.063F;
            this.LArm.offsetZ = 0.0F;

        }
    }
}
