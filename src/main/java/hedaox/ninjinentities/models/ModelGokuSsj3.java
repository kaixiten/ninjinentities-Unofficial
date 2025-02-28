package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGokuSsj3 extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer LArm;
    private float scale = 1.0F;

    public ModelGokuSsj3(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.1F, 0.0F);
        Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -3.0F, 8, 8, 8, -0.1F));

        ModelRenderer hair = new ModelRenderer(this);
        hair.setRotationPoint(2.0F, -9.0F, -2.2F);
        Head.addChild(hair);


        ModelRenderer hair1 = new ModelRenderer(this);
        hair1.setRotationPoint(-4.0F, 7.4669F, 12.0102F);
        hair.addChild(hair1);
        setRotationAngle(hair1, -0.9587F, -0.2133F, -0.0902F);
        hair1.cubeList.add(new ModelBox(hair1, 32, 1, -2.0F, -0.2669F, -7.0F, 4, 3, 12, -0.1F));

        ModelRenderer hair2 = new ModelRenderer(this);
        hair2.setRotationPoint(0.0F, 7.4669F, 12.0102F);
        hair.addChild(hair2);
        setRotationAngle(hair2, -0.9777F, 0.4342F, -0.0179F);
        hair2.cubeList.add(new ModelBox(hair2, 32, 1, -2.0F, -0.1669F, -7.0F, 4, 3, 12, -0.1F));

        ModelRenderer hair3 = new ModelRenderer(this);
        hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
        hair.addChild(hair3);
        setRotationAngle(hair3, -0.4887F, 0.0F, 0.0F);
        hair3.cubeList.add(new ModelBox(hair3, 45, 7, -4.0F, -1.0F, 10.0F, 4, 2, 5, -0.1F));

        ModelRenderer hair4 = new ModelRenderer(this);
        hair4.setRotationPoint(-2.0F, 0.9F, 10.6F);
        hair.addChild(hair4);
        setRotationAngle(hair4, -0.9425F, 0.0F, 0.0F);
        hair4.cubeList.add(new ModelBox(hair4, 42, 5, -2.0F, 0.5059F, -3.0957F, 4, 4, 7, -0.1F));

        ModelRenderer hair5 = new ModelRenderer(this);
        hair5.setRotationPoint(-1.2036F, 2.3F, 0.0464F);
        hair.addChild(hair5);
        setRotationAngle(hair5, 0.8028F, -0.7047F, -0.3506F);


        ModelRenderer hair5_r1 = new ModelRenderer(this);
        hair5_r1.setRotationPoint(0.6036F, -1.205F, 0.6036F);
        hair5.addChild(hair5_r1);
        setRotationAngle(hair5_r1, 0.5542F, 0.24F, -0.1054F);
        hair5_r1.cubeList.add(new ModelBox(hair5_r1, 54, 5, -1.04F, -1.0F, -1.0F, 2, 2, 2, -0.3F));

        ModelRenderer hair5_1 = new ModelRenderer(this);
        hair5_1.setRotationPoint(0.3036F, -1.9F, 0.2536F);
        hair5.addChild(hair5_1);
        setRotationAngle(hair5_1, 0.192F, 0.0F, 0.0F);


        ModelRenderer hair5_5_r1 = new ModelRenderer(this);
        hair5_5_r1.setRotationPoint(-0.8F, 0.495F, -3.25F);
        hair5_1.addChild(hair5_5_r1);
        setRotationAngle(hair5_5_r1, 2.4391F, 0.24F, -0.1054F);
        hair5_5_r1.cubeList.add(new ModelBox(hair5_5_r1, 54, 5, -0.91F, -1.845F, -1.1F, 2, 3, 2, -0.44F));

        ModelRenderer hair5_4_r1 = new ModelRenderer(this);
        hair5_4_r1.setRotationPoint(-0.7F, -0.105F, -2.45F);
        hair5_1.addChild(hair5_4_r1);
        setRotationAngle(hair5_4_r1, 2.0988F, 0.24F, -0.1054F);
        hair5_4_r1.cubeList.add(new ModelBox(hair5_4_r1, 54, 5, -0.87F, -0.967F, -0.988F, 2, 2, 2, -0.42F));

        ModelRenderer hair5_3_r1 = new ModelRenderer(this);
        hair5_3_r1.setRotationPoint(-0.5F, -0.405F, -1.45F);
        hair5_1.addChild(hair5_3_r1);
        setRotationAngle(hair5_3_r1, 1.7323F, 0.24F, -0.1054F);
        hair5_3_r1.cubeList.add(new ModelBox(hair5_3_r1, 54, 5, -0.86F, -1.085F, -0.91F, 2, 2, 2, -0.41F));

        ModelRenderer hair5_2_r1 = new ModelRenderer(this);
        hair5_2_r1.setRotationPoint(-0.2F, -0.505F, -0.65F);
        hair5_1.addChild(hair5_2_r1);
        setRotationAngle(hair5_2_r1, 1.3309F, 0.24F, -0.1054F);
        hair5_2_r1.cubeList.add(new ModelBox(hair5_2_r1, 54, 5, -0.97F, -1.0F, -1.035F, 2, 2, 2, -0.4F));

        ModelRenderer hair5_1_r1 = new ModelRenderer(this);
        hair5_1_r1.setRotationPoint(0.0F, -0.105F, -0.15F);
        hair5_1.addChild(hair5_1_r1);
        setRotationAngle(hair5_1_r1, 0.5542F, 0.24F, -0.1054F);
        hair5_1_r1.cubeList.add(new ModelBox(hair5_1_r1, 54, 5, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

        ModelRenderer hair6 = new ModelRenderer(this);
        hair6.setRotationPoint(-4.6421F, 4.7574F, 3.8009F);
        hair.addChild(hair6);
        setRotationAngle(hair6, -1.1974F, -0.844F, -0.2703F);
        hair6.cubeList.add(new ModelBox(hair6, 51, 6, -1.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

        ModelRenderer hair7 = new ModelRenderer(this);
        hair7.setRotationPoint(-4.8748F, 9.3493F, 4.8122F);
        hair.addChild(hair7);
        setRotationAngle(hair7, -2.0007F, -1.0092F, -0.3326F);
        hair7.cubeList.add(new ModelBox(hair7, 51, 7, 0.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        ModelRenderer hair8 = new ModelRenderer(this);
        hair8.setRotationPoint(-6.0542F, 5.7674F, 2.9604F);
        hair.addChild(hair8);
        setRotationAngle(hair8, -1.5453F, -0.616F, -0.4275F);
        hair8.cubeList.add(new ModelBox(hair8, 52, 6, 0.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

        ModelRenderer hair9 = new ModelRenderer(this);
        hair9.setRotationPoint(-6.1F, 3.3F, 1.7F);
        hair.addChild(hair9);
        setRotationAngle(hair9, -0.8888F, -0.6641F, -0.0678F);
        hair9.cubeList.add(new ModelBox(hair9, 51, 6, 0.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

        ModelRenderer hair10 = new ModelRenderer(this);
        hair10.setRotationPoint(-6.7909F, 14.7945F, 12.6914F);
        hair.addChild(hair10);
        setRotationAngle(hair10, -2.8559F, -0.4654F, -0.3194F);
        hair10.cubeList.add(new ModelBox(hair10, 50, 7, 0.0F, -6.0F, 0.0F, 4, 6, 3, -0.1F));

        ModelRenderer hair11 = new ModelRenderer(this);
        hair11.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair11);
        setRotationAngle(hair11, -2.3269F, -0.9898F, -0.4286F);
        hair11.cubeList.add(new ModelBox(hair11, 52, 1, -1.0F, -10.0F, 1.0F, 3, 12, 3, -0.1F));

        ModelRenderer hair12 = new ModelRenderer(this);
        hair12.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair12);
        setRotationAngle(hair12, -2.4986F, -0.4604F, -0.3381F);
        hair12.cubeList.add(new ModelBox(hair12, 48, 0, 0.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        ModelRenderer hair13 = new ModelRenderer(this);
        hair13.setRotationPoint(-6.9326F, 6.5612F, 6.9193F);
        hair.addChild(hair13);
        setRotationAngle(hair13, -2.1931F, -0.4604F, -0.3381F);
        hair13.cubeList.add(new ModelBox(hair13, 50, 7, 0.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        ModelRenderer hair14 = new ModelRenderer(this);
        hair14.setRotationPoint(-7.9673F, 2.7138F, 5.9609F);
        hair.addChild(hair14);
        setRotationAngle(hair14, -1.4773F, -0.0747F, -0.5456F);
        hair14.cubeList.add(new ModelBox(hair14, 50, 7, 2.0F, -6.0F, 0.0F, 4, 5, 3, -0.1F));

        ModelRenderer hair15 = new ModelRenderer(this);
        hair15.setRotationPoint(-7.9673F, 2.7138F, 5.9609F);
        hair.addChild(hair15);
        setRotationAngle(hair15, -1.2846F, 0.1617F, -1.1107F);
        hair15.cubeList.add(new ModelBox(hair15, 49, 7, 0.0F, -5.0F, 0.5F, 4, 5, 3, -0.1F));

        ModelRenderer hair16 = new ModelRenderer(this);
        hair16.setRotationPoint(-6.1158F, 2.3386F, 3.6304F);
        hair.addChild(hair16);
        setRotationAngle(hair16, -0.7848F, 0.1116F, -0.5843F);
        hair16.cubeList.add(new ModelBox(hair16, 54, 9, 0.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

        ModelRenderer hair17 = new ModelRenderer(this);
        hair17.setRotationPoint(-7.3049F, 0.386F, 5.2482F);
        hair.addChild(hair17);
        setRotationAngle(hair17, -0.8358F, 0.3467F, -0.643F);
        hair17.cubeList.add(new ModelBox(hair17, 45, 1, 0.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

        ModelRenderer hair18 = new ModelRenderer(this);
        hair18.setRotationPoint(-5.4154F, 0.4016F, 1.2309F);
        hair.addChild(hair18);
        setRotationAngle(hair18, -0.6023F, -0.067F, -0.2533F);
        hair18.cubeList.add(new ModelBox(hair18, 46, 3, 1.4F, -6.0F, 0.1691F, 3, 7, 2, -0.1F));

        ModelRenderer hair19 = new ModelRenderer(this);
        hair19.setRotationPoint(-1.6F, 1.0F, -0.6F);
        hair.addChild(hair19);
        setRotationAngle(hair19, -0.2792F, -0.1205F, -0.5114F);
        hair19.cubeList.add(new ModelBox(hair19, 52, 9, -3.2744F, -3.0523F, 0.1913F, 3, 3, 2, -0.1F));

        ModelRenderer hair19_3_r1 = new ModelRenderer(this);
        hair19_3_r1.setRotationPoint(-1.4F, -3.8F, 0.2F);
        hair19.addChild(hair19_3_r1);
        setRotationAngle(hair19_3_r1, -0.1571F, 0.0F, 0.4363F);
        hair19_3_r1.cubeList.add(new ModelBox(hair19_3_r1, 32, 1, -1.9939F, -3.0579F, 0.1913F, 3, 3, 2, -0.5F));

        ModelRenderer hair19_2_r1 = new ModelRenderer(this);
        hair19_2_r1.setRotationPoint(-2.4F, -2.4F, 1.0F);
        hair19.addChild(hair19_2_r1);
        setRotationAngle(hair19_2_r1, -0.1222F, 0.0F, 0.192F);
        hair19_2_r1.cubeList.add(new ModelBox(hair19_2_r1, 33, 0, -0.9939F, -3.0579F, -0.8087F, 3, 3, 2, -0.35F));

        ModelRenderer hair20 = new ModelRenderer(this);
        hair20.setRotationPoint(0.6421F, 4.9574F, 3.3009F);
        hair.addChild(hair20);
        setRotationAngle(hair20, -1.2253F, 0.7601F, 0.2358F);
        hair20.cubeList.add(new ModelBox(hair20, 51, 6, -2.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

        ModelRenderer hair21 = new ModelRenderer(this);
        hair21.setRotationPoint(0.8748F, 9.3493F, 4.8122F);
        hair.addChild(hair21);
        setRotationAngle(hair21, -2.0007F, 1.0092F, 0.3326F);
        hair21.cubeList.add(new ModelBox(hair21, 51, 7, -3.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        ModelRenderer hair22 = new ModelRenderer(this);
        hair22.setRotationPoint(2.0542F, 5.7674F, 2.9604F);
        hair.addChild(hair22);
        setRotationAngle(hair22, -1.5453F, 0.616F, 0.4275F);
        hair22.cubeList.add(new ModelBox(hair22, 52, 6, -2.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

        ModelRenderer hair23 = new ModelRenderer(this);
        hair23.setRotationPoint(2.1F, 3.3F, 1.7F);
        hair.addChild(hair23);
        setRotationAngle(hair23, -0.8888F, 0.6641F, 0.0678F);
        hair23.cubeList.add(new ModelBox(hair23, 51, 6, -2.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

        ModelRenderer hair24 = new ModelRenderer(this);
        hair24.setRotationPoint(2.7909F, 14.9945F, 12.7914F);
        hair.addChild(hair24);
        setRotationAngle(hair24, -2.8476F, 0.4604F, 0.3381F);
        hair24.cubeList.add(new ModelBox(hair24, 50, 7, -4.0F, -5.8F, 0.0F, 4, 6, 3, -0.1F));

        ModelRenderer hair25 = new ModelRenderer(this);
        hair25.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair25);
        setRotationAngle(hair25, -2.3269F, 0.9898F, 0.4286F);
        hair25.cubeList.add(new ModelBox(hair25, 52, 0, -2.0F, -10.0F, 1.0F, 3, 12, 3, -0.1F));

        ModelRenderer hair26 = new ModelRenderer(this);
        hair26.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
        hair.addChild(hair26);
        setRotationAngle(hair26, -2.4986F, 0.4604F, 0.3381F);
        hair26.cubeList.add(new ModelBox(hair26, 48, 0, -4.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        ModelRenderer hair27 = new ModelRenderer(this);
        hair27.setRotationPoint(2.9326F, 6.5612F, 6.9193F);
        hair.addChild(hair27);
        setRotationAngle(hair27, -2.1931F, 0.4604F, 0.3381F);
        hair27.cubeList.add(new ModelBox(hair27, 46, 6, -4.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        ModelRenderer hair28 = new ModelRenderer(this);
        hair28.setRotationPoint(3.9673F, 2.7138F, 5.9609F);
        hair.addChild(hair28);
        setRotationAngle(hair28, -1.4773F, 0.0747F, 0.5456F);
        hair28.cubeList.add(new ModelBox(hair28, 50, 7, -6.0F, -6.0F, 0.0F, 4, 5, 3, -0.1F));

        ModelRenderer hair29 = new ModelRenderer(this);
        hair29.setRotationPoint(3.9673F, 2.7138F, 5.9609F);
        hair.addChild(hair29);
        setRotationAngle(hair29, -1.3179F, -0.1955F, 1.1019F);
        hair29.cubeList.add(new ModelBox(hair29, 49, 7, -4.0F, -4.5F, 0.5F, 4, 5, 3, -0.1F));

        ModelRenderer hair30 = new ModelRenderer(this);
        hair30.setRotationPoint(2.1158F, 2.3386F, 3.6304F);
        hair.addChild(hair30);
        setRotationAngle(hair30, -0.7848F, -0.1116F, 0.5843F);
        hair30.cubeList.add(new ModelBox(hair30, 54, 9, -3.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

        ModelRenderer hair31 = new ModelRenderer(this);
        hair31.setRotationPoint(3.3049F, 0.386F, 5.2482F);
        hair.addChild(hair31);
        setRotationAngle(hair31, -0.8358F, -0.3467F, 0.643F);
        hair31.cubeList.add(new ModelBox(hair31, 45, 1, -4.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

        ModelRenderer hair32 = new ModelRenderer(this);
        hair32.setRotationPoint(1.4154F, 0.4016F, 1.2309F);
        hair.addChild(hair32);
        setRotationAngle(hair32, -0.6023F, 0.067F, 0.2533F);
        hair32.cubeList.add(new ModelBox(hair32, 51, 1, -4.0F, -5.0F, -0.7309F, 3, 7, 2, -0.1F));

        ModelRenderer hair34 = new ModelRenderer(this);
        hair34.setRotationPoint(-1.775F, 1.9057F, 0.3382F);
        hair.addChild(hair34);
        setRotationAngle(hair34, -0.226F, -0.0149F, -0.1213F);


        ModelRenderer hair34_2_r1 = new ModelRenderer(this);
        hair34_2_r1.setRotationPoint(0.075F, -2.5057F, -0.0382F);
        hair34.addChild(hair34_2_r1);
        setRotationAngle(hair34_2_r1, -0.1916F, 0.1523F, -0.2527F);
        hair34_2_r1.cubeList.add(new ModelBox(hair34_2_r1, 32, 7, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.3F));

        ModelRenderer hair34_r1 = new ModelRenderer(this);
        hair34_r1.setRotationPoint(0.275F, -0.1057F, -0.0382F);
        hair34.addChild(hair34_r1);
        setRotationAngle(hair34_r1, -0.0266F, 0.2955F, -0.0912F);
        hair34_r1.cubeList.add(new ModelBox(hair34_r1, 32, 7, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.15F));

        ModelRenderer hair33 = new ModelRenderer(this);
        hair33.setRotationPoint(-2.0F, 1.0F, -0.5F);
        hair.addChild(hair33);
        setRotationAngle(hair33, -0.253F, 0.0501F, 0.2577F);
        hair33.cubeList.add(new ModelBox(hair33, 52, 10, 0.0F, -2.0F, 0.2F, 3, 2, 2, 0.0F));

        ModelRenderer hair33_2_r1 = new ModelRenderer(this);
        hair33_2_r1.setRotationPoint(1.5F, -1.8F, 1.0F);
        hair33.addChild(hair33_2_r1);
        setRotationAngle(hair33_2_r1, 0.0F, 0.0F, 0.1571F);
        hair33_2_r1.cubeList.add(new ModelBox(hair33_2_r1, 52, 10, -1.5F, -3.0F, -1.0F, 3, 4, 2, -0.3F));

        ModelRenderer hair35 = new ModelRenderer(this);
        hair35.setRotationPoint(-1.2706F, -1.3339F, 7.2587F);
        hair.addChild(hair35);
        setRotationAngle(hair35, -0.7042F, 0.2118F, -0.2571F);
        hair35.cubeList.add(new ModelBox(hair35, 45, 1, -2.6F, -3.1F, -1.9F, 4, 6, 3, -0.1F));

        ModelRenderer hair36 = new ModelRenderer(this);
        hair36.setRotationPoint(-6.0F, 7.0F, 7.0F);
        hair.addChild(hair36);
        setRotationAngle(hair36, -2.5744F, 0.0F, 0.0F);
        hair36.cubeList.add(new ModelBox(hair36, 42, 2, 0.9972F, -11.6289F, -3.1585F, 6, 10, 3, -0.1F));

        ModelRenderer hair37 = new ModelRenderer(this);
        hair37.setRotationPoint(-6.0F, 4.9F, 6.2F);
        hair.addChild(hair37);
        setRotationAngle(hair37, -2.7053F, 0.1745F, -0.2618F);
        hair37.cubeList.add(new ModelBox(hair37, 42, 2, 4.8972F, -8.6289F, -2.2585F, 4, 6, 3, -0.1F));

        ModelRenderer hair38 = new ModelRenderer(this);
        hair38.setRotationPoint(-6.3578F, 5.4795F, 5.8429F);
        hair.addChild(hair38);
        setRotationAngle(hair38, -2.671F, -0.1142F, 0.5972F);
        hair38.cubeList.add(new ModelBox(hair38, 42, 2, -1.2582F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

        ModelRenderer hair39 = new ModelRenderer(this);
        hair39.setRotationPoint(2.0F, 7.0F, 6.2F);
        hair.addChild(hair39);
        setRotationAngle(hair39, -2.7053F, -0.1745F, 0.9599F);
        hair39.cubeList.add(new ModelBox(hair39, 42, 2, -8.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

        ModelRenderer hair40 = new ModelRenderer(this);
        hair40.setRotationPoint(2.3578F, 5.4795F, 5.8429F);
        hair.addChild(hair40);
        setRotationAngle(hair40, -2.671F, 0.1142F, -0.5972F);
        hair40.cubeList.add(new ModelBox(hair40, 42, 2, -1.7418F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

        ModelRenderer hair41 = new ModelRenderer(this);
        hair41.setRotationPoint(-6.0F, 7.0F, 6.2F);
        hair.addChild(hair41);
        setRotationAngle(hair41, -2.7053F, 0.1745F, -0.9599F);
        hair41.cubeList.add(new ModelBox(hair41, 42, 2, 5.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, -24.0F, -1.0F, 8, 12, 4, 0.0F));

        LLeg = new ModelRenderer(this);
        LLeg.setRotationPoint(2.0F, -11.0F, 0.0F);
        Body.addChild(LLeg);
        LLeg.cubeList.add(new ModelBox(LLeg, 0, 32, -2.0F, -1.0F, -1.0F, 4, 12, 4, 0.0F));

        RLeg = new ModelRenderer(this);
        RLeg.setRotationPoint(-2.0F, -12.0F, 1.0F);
        Body.addChild(RLeg);
        RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        RArm = new ModelRenderer(this);
        RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -1.0F, 4, 12, 4, 0.0F));

        LArm = new ModelRenderer(this);
        LArm.setRotationPoint(7.0F, 2.0F, 0.0F);
        LArm.cubeList.add(new ModelBox(LArm, 40, 32, -3.0F, -2.0F, -1.0F, 4, 12, 4, 0.0F));
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float)(-1.0399999618530273 + 5.5 / (1.0 + Math.pow(scale / 0.45F, 1.8799999952316284))), 0.0F);
        Head.render(f5);
        Body.render(f5);
        RArm.render(f5);
        LArm.render(f5);
        GL11.glPopMatrix();
        Head.rotateAngleY = f3 / 57.295776F;
        Head.rotateAngleX = f4 / 57.295776F;
        RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F;
        LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        RArm.rotateAngleZ = 0.0F;
        LArm.rotateAngleZ = 0.0F;
        RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1;
        RLeg.rotateAngleY = 0.0F;
        LLeg.rotateAngleY = 0.0F;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
