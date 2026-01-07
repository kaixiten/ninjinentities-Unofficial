package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelGeneralSsj4 extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer gokuSsj4;
    private final ModelRenderer Hair15;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Hair16;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Hair17;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Hair18;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r9_r1;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Hair19;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Hair20;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Hair21;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Hair22;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer Hair23;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer Hair24;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer Hair25;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer Hair26;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer Hair27;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer Hair28;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer Hair29;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer Hair30;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer Hair31;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer Hair32;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer Hair33;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer Hair34;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer Hair35;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer Hair36;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer Hair37;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer Hair38;
    private final ModelRenderer Hair39;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer Hair40;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer Hair41;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer Hair42;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer Hair43;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r98;
    private final ModelRenderer Hair44;
    private final ModelRenderer cube_r99;
    private final ModelRenderer Hair45;
    private final ModelRenderer cube_r103;
    private final ModelRenderer Hair46;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer Hair47;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer Hair48;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r119;
    private final ModelRenderer Hair49;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer Hair50;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer Hair51;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer Hair52;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer Hair53;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer Hair54;
    private final ModelRenderer cube_r138;
    private final ModelRenderer cube_r139;
    private final ModelRenderer cube_r140;
    private final ModelRenderer Hair55;
    private final ModelRenderer cube_r141;
    private final ModelRenderer cube_r142;
    private final ModelRenderer cube_r143;
    private final ModelRenderer Hair56;
    private final ModelRenderer cube_r144;
    private final ModelRenderer cube_r145;
    private final ModelRenderer Hair57;
    private final ModelRenderer cube_r146;
    private final ModelRenderer cube_r147;
    private final ModelRenderer cube_r148;
    private final ModelRenderer Hair58;
    private final ModelRenderer cube_r149;
    private final ModelRenderer cube_r150;
    private final ModelRenderer cube_r151;
    private final ModelRenderer Hair59;
    private final ModelRenderer cube_r152;
    private final ModelRenderer cube_r153;
    private final ModelRenderer cube_r154;
    private final ModelRenderer Hair60;
    private final ModelRenderer cube_r155;
    private final ModelRenderer cube_r156;
    private final ModelRenderer cube_r157;
    private final ModelRenderer Hair61;
    private final ModelRenderer cube_r158;
    private final ModelRenderer cube_r159;
    private final ModelRenderer cube_r160;
    private final ModelRenderer Hair62;
    private final ModelRenderer cube_r161;
    private final ModelRenderer cube_r162;
    private final ModelRenderer cube_r163;
    private final ModelRenderer cube_r164;
    private final ModelRenderer Hair63;
    private final ModelRenderer cube_r165;
    private final ModelRenderer cube_r166;
    private final ModelRenderer cube_r167;
    private final ModelRenderer cube_r168;
    private final ModelRenderer Hair64;
    private final ModelRenderer cube_r169;
    private final ModelRenderer cube_r170;
    private final ModelRenderer cube_r171;
    private final ModelRenderer Hair65;
    private final ModelRenderer cube_r172;
    private final ModelRenderer cube_r172_r1;
    private final ModelRenderer cube_r173;
    private final ModelRenderer Hair66;
    private final ModelRenderer cube_r174;
    private final ModelRenderer cube_r174_r1;
    private final ModelRenderer cube_r175;
    private final ModelRenderer Hair67;
    private final ModelRenderer cube_r176;
    private final ModelRenderer cube_r177;
    private final ModelRenderer Hair68;
    private final ModelRenderer cube_r178;
    private final ModelRenderer cube_r178_r1;
    private final ModelRenderer cube_r178_r2;
    private final ModelRenderer cube_r179;
    private final ModelRenderer Hair69;
    private final ModelRenderer cube_r180;
    private final ModelRenderer cube_r181;
    private final ModelRenderer Hair70;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer Hair71;
    private final ModelRenderer cube_r182;
    private final ModelRenderer cube_r183;
    private final ModelRenderer Hair72;
    private final ModelRenderer cube_r184;
    private final ModelRenderer cube_r185;
    private final ModelRenderer cube_r186;
    private final ModelRenderer cube_r187;
    private final ModelRenderer Hair73;
    private final ModelRenderer cube_r188;
    private final ModelRenderer cube_r189;
    private final ModelRenderer cube_r190;
    private final ModelRenderer cube_r191;
    private final ModelRenderer Hair74;
    private final ModelRenderer cube_r192;
    private final ModelRenderer cube_r193;
    private final ModelRenderer cube_r194;
    private final ModelRenderer VegetaSSJ4;
    private final ModelRenderer VegetaSSJ2;
    private final ModelRenderer VegetaSSJ3;
    private final ModelRenderer VegetaSSJ5;
    private final ModelRenderer bipedHeadssj3lChild_6;
    private final ModelRenderer bipedHeadssj3lChild_4;
    private final ModelRenderer bipedHeadssj3lChild_3;
    private final ModelRenderer bipedHeadssj3lChild_1;
    private final ModelRenderer bipedHeadssj3lChild_8;
    private final ModelRenderer bipedHeadssj3lChild_10;
    private final ModelRenderer bipedHeadssj3lChild_7;
    private final ModelRenderer bipedHeadssj3lChild;
    private final ModelRenderer bipedHeadssj3lChild_5;
    private final ModelRenderer bipedHeadssj3lChild_9;
    private final ModelRenderer bipedHeadssj3lChild_2;
    private final ModelRenderer VegetaSSJ6;
    private final ModelRenderer VegetaSSJ7;
    private final ModelRenderer VegetaSSJ8;
    private final ModelRenderer VegetaSSJ9;
    private final ModelRenderer VegetaSSJ11;
    private final ModelRenderer VegetaSSJ10;
    private final ModelRenderer VegetaSSJ12;
    private final ModelRenderer VegetaSSJ13;
    private final ModelRenderer VegetaSSJ14;
    private final ModelRenderer VegetaSSJ15;
    private final ModelRenderer VegetaSSJ16;
    private final ModelRenderer VegetaSSJ17;
    private final ModelRenderer VegetaSSJ18;
    private final ModelRenderer VegetaSSJ19;
    private final ModelRenderer VegetaSSJ20;
    private final ModelRenderer VegetaSSJ21;
    private final ModelRenderer VegetaSSJ22;
    private final ModelRenderer VegetaSSJ23;
    private final ModelRenderer GohanSSJ4;
    private final ModelRenderer GohanSSJ2;
    private final ModelRenderer GohanSSJ3;
    private final ModelRenderer GohanSSJ5;
    private final ModelRenderer GohanSSJ6;
    private final ModelRenderer GohanSSJ7;
    private final ModelRenderer GohanSSJ8;
    private final ModelRenderer GohanSSJ9;
    private final ModelRenderer GohanSSJ10;
    private final ModelRenderer GohanSSJ11;
    private final ModelRenderer GohanSSJ12;
    private final ModelRenderer GohanSSJ13;
    private final ModelRenderer GohanSSJ14;
    private final ModelRenderer GohanSSJ15;
    private final ModelRenderer GohanSSJ16;
    private final ModelRenderer GohanSSJ17;
    private final ModelRenderer GohanSSJ18;
    private final ModelRenderer GohanSSJ19;
    private final ModelRenderer GohanSSJ20;
    private final ModelRenderer GohanSSJ21;
    private final ModelRenderer GohanSSJ22;
    private final ModelRenderer GohanSSJ23;
    private final ModelRenderer GohanSSJ24;
    private final ModelRenderer GohanSSJ25;
    private final ModelRenderer GohanSSJ26;
    private final ModelRenderer GohanSSJ27;
    private final ModelRenderer GohanSSJ28;
    private final ModelRenderer GohanSSJ29;
    private final ModelRenderer GohanSSJ30;
    private final ModelRenderer GohanSSJ31;
    private final ModelRenderer GohanSSJ32;
    private final ModelRenderer GohanSSJ33;
    private final ModelRenderer GohanSSJ34;
    private final ModelRenderer GohanSSJ35;
    private final ModelRenderer GohanSSJ36;
    private final ModelRenderer GohanSSJ37;
    private final ModelRenderer GohanSSJ38;
    private final ModelRenderer GohanSSJ39;
    private final ModelRenderer GohanSSJ40;
    private final ModelRenderer GohanSSJ41;
    private final ModelRenderer GohanSSJ42;
    private final ModelRenderer GohanSSJ43;
    private final ModelRenderer GohanSSJ44;
    private final ModelRenderer GohanSSJ45;
    private final ModelRenderer GohanSSJ46;
    private final ModelRenderer GohanSSJ47;
    private final ModelRenderer GohanSSJ48;
    private final ModelRenderer FroB;
    private final ModelRenderer ftailS1;
    private final ModelRenderer ftailS2;
    private final ModelRenderer ftailS3;
    private final ModelRenderer ftailS4;
    private final ModelRenderer ftailS5;
    private final ModelRenderer ftailS6;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

    public ModelGeneralSsj4(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        gokuSsj4 = new ModelRenderer(this);
        gokuSsj4.setRotationPoint(-1.0F, -6.1F, -4.0F);
        bipedHead.addChild(gokuSsj4);


        Hair15 = new ModelRenderer(this);
        Hair15.setRotationPoint(0.0F, 0.0F, 0.0F);
        gokuSsj4.addChild(Hair15);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-1.9172F, -0.9908F, -3.6974F);
        Hair15.addChild(cube_r1);
        setRotationAngle(cube_r1, 2.7601F, 0.5562F, 0.2819F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 24, -1.0F, -2.2092F, -1.5026F, 2, 3, 2, -0.1F));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-0.0087F, -2.5822F, -1.5532F);
        Hair15.addChild(cube_r2);
        setRotationAngle(cube_r2, 1.6427F, 0.5478F, 0.3134F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        Hair15.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.9216F, 0.5621F, 0.3511F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair16 = new ModelRenderer(this);
        Hair16.setRotationPoint(2.0F, 0.0F, 0.0F);
        gokuSsj4.addChild(Hair16);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-1.6714F, -0.7419F, -2.3177F);
        Hair16.addChild(cube_r4);
        setRotationAngle(cube_r4, 2.7624F, 0.5576F, 0.2788F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 92, 24, -1.5286F, -2.3581F, -0.3823F, 2, 3, 2, -0.1F));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.0385F, -2.0894F, -1.2631F);
        Hair16.addChild(cube_r5);
        setRotationAngle(cube_r5, 1.7376F, 0.5634F, 0.1615F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 92, 24, -1.1215F, -2.1106F, -1.4369F, 2, 3, 2, -0.1F));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-0.5605F, -0.8174F, 0.0875F);
        Hair16.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.7976F, 0.5013F, 0.1984F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 90, 23, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.1F));

        Hair17 = new ModelRenderer(this);
        Hair17.setRotationPoint(0.0F, 0.0F, 0.0F);
        gokuSsj4.addChild(Hair17);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-2.3155F, -0.8548F, -2.0055F);
        Hair17.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.7835F, 0.3305F, 0.2912F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 97, 19, -1.0F, -1.0F, -1.8945F, 2, 2, 3, -0.1F));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-2.0F, 0.0F, 0.0F);
        Hair17.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.3372F, 0.2285F, 0.247F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 97, 19, -1.0F, -1.4F, -2.0F, 2, 2, 3, -0.1F));

        Hair18 = new ModelRenderer(this);
        Hair18.setRotationPoint(0.0F, 0.0F, 0.0F);
        gokuSsj4.addChild(Hair18);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(4.0F, -1.0F, 0.0F);
        Hair18.addChild(cube_r9);
        setRotationAngle(cube_r9, 1.0103F, -0.4396F, -0.2615F);


        cube_r9_r1 = new ModelRenderer(this);
        cube_r9_r1.setRotationPoint(-0.1F, -0.2F, -0.9F);
        cube_r9.addChild(cube_r9_r1);
        setRotationAngle(cube_r9_r1, -0.133F, -0.0906F, 0.1172F);
        cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 98, 21, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(3.0F, -1.0F, 0.0F);
        Hair18.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0525F, -0.6389F, -0.2728F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 94, 25, -0.5F, -0.9F, -1.0F, 2, 2, 2, -0.1F));

        Hair19 = new ModelRenderer(this);
        Hair19.setRotationPoint(-2.7F, 0.0F, 2.5F);
        gokuSsj4.addChild(Hair19);
        setRotationAngle(Hair19, 0.4375F, -0.0025F, -0.1061F);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-1.0356F, 0.7844F, -0.7787F);
        Hair19.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.5874F, -0.0387F, -2.6612F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 97, 19, -1.3F, -1.4837F, -2.175F, 2, 2, 3, -0.1F));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-0.271F, -0.6993F, -0.2234F);
        Hair19.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.1074F, -0.0387F, -2.6612F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair20 = new ModelRenderer(this);
        Hair20.setRotationPoint(3.0F, -3.0F, 0.0F);
        gokuSsj4.addChild(Hair20);
        setRotationAngle(Hair20, -0.3007F, 0.3278F, -2.0016F);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-3.7356F, 0.4837F, 0.175F);
        Hair20.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.5874F, -0.0387F, -2.6612F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 97, 19, -1.0F, -1.2837F, -2.175F, 2, 2, 3, -0.1F));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-2.971F, -1.0F, 0.7303F);
        Hair20.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.1074F, -0.0387F, -2.6612F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 98, 20, -1.429F, -2.5F, -1.0F, 2, 3, 2, -0.1F));

        Hair21 = new ModelRenderer(this);
        Hair21.setRotationPoint(5.3183F, 4.5644F, 6.2741F);
        gokuSsj4.addChild(Hair21);
        setRotationAngle(Hair21, 0.0F, 0.0873F, 0.0F);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.6817F, 1.4356F, 1.7259F);
        Hair21.addChild(cube_r15);
        setRotationAngle(cube_r15, 1.3886F, 0.1231F, -0.124F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 92, 25, -1.2F, -0.6566F, -1.0F, 2, 3, 2, -0.1F));

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair21.addChild(cube_r16);
        setRotationAngle(cube_r16, 1.0832F, 0.1231F, -0.124F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair21.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.5159F, 0.1231F, -0.124F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair21.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.2541F, 0.1231F, -0.124F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 92, 25, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair22 = new ModelRenderer(this);
        Hair22.setRotationPoint(-1.6817F, 1.5644F, 3.2741F);
        gokuSsj4.addChild(Hair22);
        setRotationAngle(Hair22, 0.0F, 0.0F, 0.4363F);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.3547F, 1.581F, 2.7259F);
        Hair22.addChild(cube_r19);
        setRotationAngle(cube_r19, 1.0598F, 0.3148F, -0.2309F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 92, 24, -2.6F, -0.9F, -1.3F, 2, 3, 2, -0.1F));

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(0.3547F, 4.581F, 4.7259F);
        Hair22.addChild(cube_r20);
        setRotationAngle(cube_r20, 1.345F, 0.1231F, -0.124F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 92, 24, -1.7F, -0.9F, -1.3F, 2, 3, 2, -0.1F));

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(0.3547F, 3.581F, 2.7259F);
        Hair22.addChild(cube_r21);
        setRotationAngle(cube_r21, 1.0832F, 0.1231F, -0.124F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 92, 24, -2.1F, -0.9F, -1.3F, 2, 3, 2, -0.1F));

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(0.3547F, 2.581F, 1.7259F);
        Hair22.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.5159F, 0.1231F, -0.124F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 92, 24, -2.3F, -1.6F, -1.3F, 2, 3, 2, -0.1F));

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(0.3547F, -0.419F, 0.7259F);
        Hair22.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.2541F, 0.1231F, -0.124F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 92, 24, -2.7F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair23 = new ModelRenderer(this);
        Hair23.setRotationPoint(4.8404F, 2.575F, 4.1614F);
        gokuSsj4.addChild(Hair23);
        setRotationAngle(Hair23, 1.8867F, -0.2393F, -0.3162F);


        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair23.addChild(cube_r27);
        setRotationAngle(cube_r27, 1.0832F, 0.1231F, -0.124F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 92, 25, -1.3F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair23.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.5159F, 0.1231F, -0.124F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 92, 25, -1.5F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair23.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.2541F, 0.1231F, -0.124F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 92, 25, -1.9F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair24 = new ModelRenderer(this);
        Hair24.setRotationPoint(5.3183F, 0.5644F, 4.2741F);
        gokuSsj4.addChild(Hair24);
        setRotationAngle(Hair24, 0.2347F, -0.8219F, 2.694F);


        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(0.7334F, 3.6312F, 1.6716F);
        Hair24.addChild(cube_r30);
        setRotationAngle(cube_r30, 1.0832F, 0.1231F, -0.124F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 92, 25, -1.4F, -0.9F, -1.1F, 2, 2, 2, -0.1F));

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.7334F, 2.6312F, 0.6716F);
        Hair24.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.5159F, 0.1231F, -0.124F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(0.7334F, -0.3688F, -0.3284F);
        Hair24.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.2541F, 0.1231F, -0.124F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 92, 25, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair25 = new ModelRenderer(this);
        Hair25.setRotationPoint(5.3183F, 1.5644F, 5.2741F);
        gokuSsj4.addChild(Hair25);
        setRotationAngle(Hair25, 0.1966F, -0.4407F, 2.9229F);


        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.6817F, 1.4356F, 1.7259F);
        Hair25.addChild(cube_r33);
        setRotationAngle(cube_r33, 1.8249F, 0.1231F, -0.124F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 92, 25, -1.5F, -0.9F, -1.0F, 2, 3, 2, -0.1F));

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair25.addChild(cube_r34);
        setRotationAngle(cube_r34, 1.0832F, 0.1231F, -0.124F);
        cube_r34.cubeList.add(new ModelBox(cube_r34, 92, 25, -1.9F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        Hair26 = new ModelRenderer(this);
        Hair26.setRotationPoint(4.3183F, 3.5644F, 7.2741F);
        gokuSsj4.addChild(Hair26);
        setRotationAngle(Hair26, -3.0837F, 0.4202F, -0.162F);


        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair26.addChild(cube_r35);
        setRotationAngle(cube_r35, -0.0077F, 0.1231F, -0.124F);
        cube_r35.cubeList.add(new ModelBox(cube_r35, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair26.addChild(cube_r36);
        setRotationAngle(cube_r36, 1.0832F, 0.1231F, -0.124F);
        cube_r36.cubeList.add(new ModelBox(cube_r36, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair26.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.5159F, 0.1231F, -0.124F);
        cube_r37.cubeList.add(new ModelBox(cube_r37, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair26.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.2541F, 0.1231F, -0.124F);
        cube_r38.cubeList.add(new ModelBox(cube_r38, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair27 = new ModelRenderer(this);
        Hair27.setRotationPoint(-2.6817F, 3.5644F, 7.2741F);
        gokuSsj4.addChild(Hair27);
        setRotationAngle(Hair27, 2.9832F, -0.3089F, -0.0472F);


        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair27.addChild(cube_r39);
        setRotationAngle(cube_r39, -0.0077F, 0.1231F, -0.124F);
        cube_r39.cubeList.add(new ModelBox(cube_r39, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair27.addChild(cube_r40);
        setRotationAngle(cube_r40, 1.0832F, 0.1231F, -0.124F);
        cube_r40.cubeList.add(new ModelBox(cube_r40, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair27.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.5159F, 0.1231F, -0.124F);
        cube_r41.cubeList.add(new ModelBox(cube_r41, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair27.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.2541F, 0.1231F, -0.124F);
        cube_r42.cubeList.add(new ModelBox(cube_r42, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair28 = new ModelRenderer(this);
        Hair28.setRotationPoint(3.3183F, 2.5644F, 9.2741F);
        gokuSsj4.addChild(Hair28);
        setRotationAngle(Hair28, 3.0729F, 0.1951F, -0.1953F);


        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair28.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.0077F, 0.1231F, -0.124F);
        cube_r43.cubeList.add(new ModelBox(cube_r43, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair28.addChild(cube_r44);
        setRotationAngle(cube_r44, 1.0832F, 0.1231F, -0.124F);
        cube_r44.cubeList.add(new ModelBox(cube_r44, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair28.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.5159F, 0.1231F, -0.124F);
        cube_r45.cubeList.add(new ModelBox(cube_r45, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair28.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.2541F, 0.1231F, -0.124F);
        cube_r46.cubeList.add(new ModelBox(cube_r46, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair29 = new ModelRenderer(this);
        Hair29.setRotationPoint(5.3183F, -0.4356F, 6.2741F);
        gokuSsj4.addChild(Hair29);
        setRotationAngle(Hair29, 0.2347F, -0.8219F, 2.694F);


        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(0.7334F, 3.6312F, 1.6716F);
        Hair29.addChild(cube_r47);
        setRotationAngle(cube_r47, 1.0832F, 0.1231F, -0.124F);
        cube_r47.cubeList.add(new ModelBox(cube_r47, 92, 25, -1.4F, -0.9F, -1.1F, 2, 2, 2, -0.1F));

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(0.7334F, 2.6312F, 0.6716F);
        Hair29.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.5159F, 0.1231F, -0.124F);
        cube_r48.cubeList.add(new ModelBox(cube_r48, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(0.7334F, -0.3688F, -0.3284F);
        Hair29.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.2541F, 0.1231F, -0.124F);
        cube_r49.cubeList.add(new ModelBox(cube_r49, 92, 25, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair30 = new ModelRenderer(this);
        Hair30.setRotationPoint(4.3183F, 0.5644F, 7.2741F);
        gokuSsj4.addChild(Hair30);
        setRotationAngle(Hair30, 1.4346F, -1.3078F, 1.2072F);


        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(0.6817F, 1.4356F, 1.7259F);
        Hair30.addChild(cube_r50);
        setRotationAngle(cube_r50, 1.8249F, 0.1231F, -0.124F);
        cube_r50.cubeList.add(new ModelBox(cube_r50, 92, 25, -1.5F, -0.9F, -1.0F, 2, 3, 2, -0.1F));

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair30.addChild(cube_r51);
        setRotationAngle(cube_r51, 1.0832F, 0.1231F, -0.124F);
        cube_r51.cubeList.add(new ModelBox(cube_r51, 92, 25, -1.9F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        Hair31 = new ModelRenderer(this);
        Hair31.setRotationPoint(2.3183F, 1.5644F, 9.2741F);
        gokuSsj4.addChild(Hair31);
        setRotationAngle(Hair31, -3.008F, 0.0804F, -0.0471F);


        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair31.addChild(cube_r52);
        setRotationAngle(cube_r52, -0.0077F, 0.1231F, -0.124F);
        cube_r52.cubeList.add(new ModelBox(cube_r52, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair31.addChild(cube_r53);
        setRotationAngle(cube_r53, 1.0832F, 0.1231F, -0.124F);
        cube_r53.cubeList.add(new ModelBox(cube_r53, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair31.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.5159F, 0.1231F, -0.124F);
        cube_r54.cubeList.add(new ModelBox(cube_r54, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair31.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.2541F, 0.1231F, -0.124F);
        cube_r55.cubeList.add(new ModelBox(cube_r55, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair32 = new ModelRenderer(this);
        Hair32.setRotationPoint(3.3183F, -0.4356F, 7.2741F);
        gokuSsj4.addChild(Hair32);
        setRotationAngle(Hair32, -2.6286F, -0.0984F, 0.1954F);


        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair32.addChild(cube_r56);
        setRotationAngle(cube_r56, -0.0077F, 0.1231F, -0.124F);
        cube_r56.cubeList.add(new ModelBox(cube_r56, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair32.addChild(cube_r57);
        setRotationAngle(cube_r57, 1.0832F, 0.1231F, -0.124F);
        cube_r57.cubeList.add(new ModelBox(cube_r57, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair32.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.5159F, 0.1231F, -0.124F);
        cube_r58.cubeList.add(new ModelBox(cube_r58, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair32.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.2541F, 0.1231F, -0.124F);
        cube_r59.cubeList.add(new ModelBox(cube_r59, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair33 = new ModelRenderer(this);
        Hair33.setRotationPoint(1.3183F, -0.4356F, 7.2741F);
        gokuSsj4.addChild(Hair33);
        setRotationAngle(Hair33, -2.9208F, 0.0804F, -0.0471F);


        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
        Hair33.addChild(cube_r60);
        setRotationAngle(cube_r60, -0.0077F, 0.1231F, -0.124F);
        cube_r60.cubeList.add(new ModelBox(cube_r60, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-0.6622F, -3.8717F, -1.0745F);
        Hair33.addChild(cube_r61);
        setRotationAngle(cube_r61, 1.0832F, 0.1231F, -0.124F);
        cube_r61.cubeList.add(new ModelBox(cube_r61, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(-0.6622F, -4.8717F, -2.0745F);
        Hair33.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.5159F, 0.1231F, -0.124F);
        cube_r62.cubeList.add(new ModelBox(cube_r62, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
        Hair33.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.2541F, 0.1231F, -0.124F);
        cube_r63.cubeList.add(new ModelBox(cube_r63, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair34 = new ModelRenderer(this);
        Hair34.setRotationPoint(2.3183F, -1.4356F, 8.2741F);
        gokuSsj4.addChild(Hair34);
        setRotationAngle(Hair34, -2.8035F, 0.0397F, 0.1085F);


        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
        Hair34.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.2105F, 0.1231F, -0.124F);
        cube_r64.cubeList.add(new ModelBox(cube_r64, 92, 25, -2.1544F, -3.3148F, -1.0949F, 2, 3, 2, -0.1F));

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(0.1104F, -0.4002F, 0.5208F);
        Hair34.addChild(cube_r65);
        setRotationAngle(cube_r65, 1.0832F, 0.1231F, -0.124F);
        cube_r65.cubeList.add(new ModelBox(cube_r65, 92, 25, -1.4F, -0.9F, -0.7949F, 2, 3, 2, -0.1F));

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(0.1104F, -1.4002F, -0.4792F);
        Hair34.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.5159F, 0.1231F, -0.124F);
        cube_r66.cubeList.add(new ModelBox(cube_r66, 92, 25, -1.6F, -1.9F, -0.7949F, 2, 3, 2, -0.1F));

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
        Hair34.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.2541F, 0.1231F, -0.124F);
        cube_r67.cubeList.add(new ModelBox(cube_r67, 92, 25, -2.1F, -0.8F, -0.9949F, 2, 3, 2, -0.1F));

        Hair35 = new ModelRenderer(this);
        Hair35.setRotationPoint(-0.6817F, 0.5644F, 7.2741F);
        gokuSsj4.addChild(Hair35);
        setRotationAngle(Hair35, -2.7223F, 0.0144F, -0.0266F);


        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(0.6817F, -8.5644F, -2.2741F);
        Hair35.addChild(cube_r68);
        setRotationAngle(cube_r68, -0.1822F, 0.1231F, -0.124F);
        cube_r68.cubeList.add(new ModelBox(cube_r68, 92, 25, -2.75F, -3.5F, -1.76F, 2, 3, 2, -0.1F));

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(0.6817F, -6.5644F, -2.2741F);
        Hair35.addChild(cube_r69);
        setRotationAngle(cube_r69, -0.0077F, 0.1231F, -0.124F);
        cube_r69.cubeList.add(new ModelBox(cube_r69, 92, 25, -2.5F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair35.addChild(cube_r70);
        setRotationAngle(cube_r70, -0.0077F, 0.1231F, -0.124F);
        cube_r70.cubeList.add(new ModelBox(cube_r70, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair35.addChild(cube_r71);
        setRotationAngle(cube_r71, 1.0832F, 0.1231F, -0.124F);
        cube_r71.cubeList.add(new ModelBox(cube_r71, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair35.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.5159F, 0.1231F, -0.124F);
        cube_r72.cubeList.add(new ModelBox(cube_r72, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair35.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.2541F, 0.1231F, -0.124F);
        cube_r73.cubeList.add(new ModelBox(cube_r73, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair36 = new ModelRenderer(this);
        Hair36.setRotationPoint(-2.6817F, -0.4356F, 8.2741F);
        gokuSsj4.addChild(Hair36);
        setRotationAngle(Hair36, -2.8446F, -0.736F, -0.4957F);


        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair36.addChild(cube_r74);
        setRotationAngle(cube_r74, -0.0077F, 0.1231F, -0.124F);
        cube_r74.cubeList.add(new ModelBox(cube_r74, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(0.5479F, -0.5108F, 0.0197F);
        Hair36.addChild(cube_r75);
        setRotationAngle(cube_r75, 1.0832F, 0.1231F, -0.124F);
        cube_r75.cubeList.add(new ModelBox(cube_r75, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r76 = new ModelRenderer(this);
        cube_r76.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
        Hair36.addChild(cube_r76);
        setRotationAngle(cube_r76, 0.5159F, 0.1231F, -0.124F);
        cube_r76.cubeList.add(new ModelBox(cube_r76, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r77 = new ModelRenderer(this);
        cube_r77.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair36.addChild(cube_r77);
        setRotationAngle(cube_r77, 0.2541F, 0.1231F, -0.124F);
        cube_r77.cubeList.add(new ModelBox(cube_r77, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair37 = new ModelRenderer(this);
        Hair37.setRotationPoint(-2.6817F, 0.5644F, 9.2741F);
        gokuSsj4.addChild(Hair37);
        setRotationAngle(Hair37, -2.8818F, -0.0214F, -0.231F);


        cube_r78 = new ModelRenderer(this);
        cube_r78.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair37.addChild(cube_r78);
        setRotationAngle(cube_r78, -0.0077F, 0.1231F, -0.124F);
        cube_r78.cubeList.add(new ModelBox(cube_r78, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r79 = new ModelRenderer(this);
        cube_r79.setRotationPoint(0.5479F, -0.5108F, 0.0197F);
        Hair37.addChild(cube_r79);
        setRotationAngle(cube_r79, 1.0832F, 0.1231F, -0.124F);
        cube_r79.cubeList.add(new ModelBox(cube_r79, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r80 = new ModelRenderer(this);
        cube_r80.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
        Hair37.addChild(cube_r80);
        setRotationAngle(cube_r80, 0.5159F, 0.1231F, -0.124F);
        cube_r80.cubeList.add(new ModelBox(cube_r80, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r81 = new ModelRenderer(this);
        cube_r81.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair37.addChild(cube_r81);
        setRotationAngle(cube_r81, 0.2541F, 0.1231F, -0.124F);
        cube_r81.cubeList.add(new ModelBox(cube_r81, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair38 = new ModelRenderer(this);
        Hair38.setRotationPoint(0.0F, 4.0F, -2.0F);
        gokuSsj4.addChild(Hair38);


        Hair39 = new ModelRenderer(this);
        Hair39.setRotationPoint(4.3183F, 3.5644F, 7.2741F);
        Hair38.addChild(Hair39);
        setRotationAngle(Hair39, 3.1155F, 0.1767F, -0.2045F);


        cube_r82 = new ModelRenderer(this);
        cube_r82.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair39.addChild(cube_r82);
        setRotationAngle(cube_r82, -0.0077F, 0.1231F, -0.124F);
        cube_r82.cubeList.add(new ModelBox(cube_r82, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r83 = new ModelRenderer(this);
        cube_r83.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair39.addChild(cube_r83);
        setRotationAngle(cube_r83, 0.5159F, 0.1231F, -0.124F);
        cube_r83.cubeList.add(new ModelBox(cube_r83, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r84 = new ModelRenderer(this);
        cube_r84.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair39.addChild(cube_r84);
        setRotationAngle(cube_r84, 0.2541F, 0.1231F, -0.124F);
        cube_r84.cubeList.add(new ModelBox(cube_r84, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair40 = new ModelRenderer(this);
        Hair40.setRotationPoint(-2.6817F, 3.5644F, 7.2741F);
        Hair38.addChild(Hair40);
        setRotationAngle(Hair40, -3.1262F, -0.0035F, -0.0423F);


        cube_r85 = new ModelRenderer(this);
        cube_r85.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair40.addChild(cube_r85);
        setRotationAngle(cube_r85, -0.0077F, 0.1231F, -0.124F);
        cube_r85.cubeList.add(new ModelBox(cube_r85, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r86 = new ModelRenderer(this);
        cube_r86.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair40.addChild(cube_r86);
        setRotationAngle(cube_r86, 0.5159F, 0.1231F, -0.124F);
        cube_r86.cubeList.add(new ModelBox(cube_r86, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r87 = new ModelRenderer(this);
        cube_r87.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair40.addChild(cube_r87);
        setRotationAngle(cube_r87, 0.2541F, 0.1231F, -0.124F);
        cube_r87.cubeList.add(new ModelBox(cube_r87, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair41 = new ModelRenderer(this);
        Hair41.setRotationPoint(-1.6817F, 2.5644F, 8.2741F);
        Hair38.addChild(Hair41);
        setRotationAngle(Hair41, -2.7997F, -0.2934F, -0.1402F);


        cube_r88 = new ModelRenderer(this);
        cube_r88.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair41.addChild(cube_r88);
        setRotationAngle(cube_r88, -0.0077F, 0.1231F, -0.124F);
        cube_r88.cubeList.add(new ModelBox(cube_r88, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r89 = new ModelRenderer(this);
        cube_r89.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair41.addChild(cube_r89);
        setRotationAngle(cube_r89, 0.5159F, 0.1231F, -0.124F);
        cube_r89.cubeList.add(new ModelBox(cube_r89, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r90 = new ModelRenderer(this);
        cube_r90.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair41.addChild(cube_r90);
        setRotationAngle(cube_r90, 0.2541F, 0.1231F, -0.124F);
        cube_r90.cubeList.add(new ModelBox(cube_r90, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair42 = new ModelRenderer(this);
        Hair42.setRotationPoint(3.3183F, 2.5644F, 9.2741F);
        Hair38.addChild(Hair42);
        setRotationAngle(Hair42, -3.123F, 0.1951F, -0.1953F);


        cube_r91 = new ModelRenderer(this);
        cube_r91.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair42.addChild(cube_r91);
        setRotationAngle(cube_r91, -0.0077F, 0.1231F, -0.124F);
        cube_r91.cubeList.add(new ModelBox(cube_r91, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r93 = new ModelRenderer(this);
        cube_r93.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair42.addChild(cube_r93);
        setRotationAngle(cube_r93, 0.5159F, 0.1231F, -0.124F);
        cube_r93.cubeList.add(new ModelBox(cube_r93, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r94 = new ModelRenderer(this);
        cube_r94.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair42.addChild(cube_r94);
        setRotationAngle(cube_r94, 0.2541F, 0.1231F, -0.124F);
        cube_r94.cubeList.add(new ModelBox(cube_r94, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair43 = new ModelRenderer(this);
        Hair43.setRotationPoint(2.3183F, 1.5644F, 9.2741F);
        Hair38.addChild(Hair43);
        setRotationAngle(Hair43, -2.9644F, 0.0804F, -0.0471F);


        cube_r95 = new ModelRenderer(this);
        cube_r95.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair43.addChild(cube_r95);
        setRotationAngle(cube_r95, -0.0077F, 0.1231F, -0.124F);
        cube_r95.cubeList.add(new ModelBox(cube_r95, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r98 = new ModelRenderer(this);
        cube_r98.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair43.addChild(cube_r98);
        setRotationAngle(cube_r98, 0.2541F, 0.1231F, -0.124F);
        cube_r98.cubeList.add(new ModelBox(cube_r98, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair44 = new ModelRenderer(this);
        Hair44.setRotationPoint(3.3183F, -0.4356F, 7.2741F);
        Hair38.addChild(Hair44);
        setRotationAngle(Hair44, -2.6286F, -0.0984F, 0.1954F);


        cube_r99 = new ModelRenderer(this);
        cube_r99.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair44.addChild(cube_r99);
        setRotationAngle(cube_r99, -0.0077F, 0.1231F, -0.124F);
        cube_r99.cubeList.add(new ModelBox(cube_r99, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        Hair45 = new ModelRenderer(this);
        Hair45.setRotationPoint(2.3183F, -1.4356F, 8.2741F);
        Hair38.addChild(Hair45);
        setRotationAngle(Hair45, -2.8035F, 0.0397F, 0.1085F);


        cube_r103 = new ModelRenderer(this);
        cube_r103.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
        Hair45.addChild(cube_r103);
        setRotationAngle(cube_r103, 0.2105F, 0.1231F, -0.124F);
        cube_r103.cubeList.add(new ModelBox(cube_r103, 92, 25, -2.1544F, -3.3148F, -1.0949F, 2, 3, 2, -0.1F));

        Hair46 = new ModelRenderer(this);
        Hair46.setRotationPoint(1.3183F, -0.4356F, 7.2741F);
        Hair38.addChild(Hair46);
        setRotationAngle(Hair46, -2.9208F, 0.0804F, -0.0471F);


        cube_r107 = new ModelRenderer(this);
        cube_r107.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
        Hair46.addChild(cube_r107);
        setRotationAngle(cube_r107, -0.0077F, 0.1231F, -0.124F);
        cube_r107.cubeList.add(new ModelBox(cube_r107, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r108 = new ModelRenderer(this);
        cube_r108.setRotationPoint(-0.6622F, -4.8717F, -2.0745F);
        Hair46.addChild(cube_r108);
        setRotationAngle(cube_r108, 0.5159F, 0.1231F, -0.124F);
        cube_r108.cubeList.add(new ModelBox(cube_r108, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r109 = new ModelRenderer(this);
        cube_r109.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
        Hair46.addChild(cube_r109);
        setRotationAngle(cube_r109, 0.2541F, 0.1231F, -0.124F);
        cube_r109.cubeList.add(new ModelBox(cube_r109, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair47 = new ModelRenderer(this);
        Hair47.setRotationPoint(-2.6817F, 0.5644F, 9.2741F);
        Hair38.addChild(Hair47);
        setRotationAngle(Hair47, -2.925F, -0.0083F, -0.273F);


        cube_r110 = new ModelRenderer(this);
        cube_r110.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair47.addChild(cube_r110);
        setRotationAngle(cube_r110, -0.0077F, 0.1231F, -0.124F);
        cube_r110.cubeList.add(new ModelBox(cube_r110, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r111 = new ModelRenderer(this);
        cube_r111.setRotationPoint(0.5479F, -0.5108F, 0.0197F);
        Hair47.addChild(cube_r111);
        setRotationAngle(cube_r111, 1.0832F, 0.1231F, -0.124F);
        cube_r111.cubeList.add(new ModelBox(cube_r111, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r112 = new ModelRenderer(this);
        cube_r112.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
        Hair47.addChild(cube_r112);
        setRotationAngle(cube_r112, 0.5159F, 0.1231F, -0.124F);
        cube_r112.cubeList.add(new ModelBox(cube_r112, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r113 = new ModelRenderer(this);
        cube_r113.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair47.addChild(cube_r113);
        setRotationAngle(cube_r113, 0.2541F, 0.1231F, -0.124F);
        cube_r113.cubeList.add(new ModelBox(cube_r113, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair48 = new ModelRenderer(this);
        Hair48.setRotationPoint(-0.6817F, 0.5644F, 7.2741F);
        Hair38.addChild(Hair48);
        setRotationAngle(Hair48, -2.7223F, 0.0144F, -0.0266F);


        cube_r114 = new ModelRenderer(this);
        cube_r114.setRotationPoint(0.6817F, -8.5644F, -2.2741F);
        Hair48.addChild(cube_r114);
        setRotationAngle(cube_r114, -0.1822F, 0.1231F, -0.124F);
        cube_r114.cubeList.add(new ModelBox(cube_r114, 92, 25, -2.75F, -3.5F, -1.76F, 2, 3, 2, -0.1F));

        cube_r115 = new ModelRenderer(this);
        cube_r115.setRotationPoint(0.6817F, -6.5644F, -2.2741F);
        Hair48.addChild(cube_r115);
        setRotationAngle(cube_r115, -0.0077F, 0.1231F, -0.124F);
        cube_r115.cubeList.add(new ModelBox(cube_r115, 92, 25, -2.5F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r116 = new ModelRenderer(this);
        cube_r116.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair48.addChild(cube_r116);
        setRotationAngle(cube_r116, -0.0077F, 0.1231F, -0.124F);
        cube_r116.cubeList.add(new ModelBox(cube_r116, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r119 = new ModelRenderer(this);
        cube_r119.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair48.addChild(cube_r119);
        setRotationAngle(cube_r119, 0.2541F, 0.1231F, -0.124F);
        cube_r119.cubeList.add(new ModelBox(cube_r119, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair49 = new ModelRenderer(this);
        Hair49.setRotationPoint(-2.6817F, -0.4356F, 8.2741F);
        Hair38.addChild(Hair49);
        setRotationAngle(Hair49, -2.6804F, -0.3273F, -0.4262F);


        cube_r120 = new ModelRenderer(this);
        cube_r120.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair49.addChild(cube_r120);
        setRotationAngle(cube_r120, -0.0077F, 0.1231F, -0.124F);
        cube_r120.cubeList.add(new ModelBox(cube_r120, 92, 25, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

        cube_r122 = new ModelRenderer(this);
        cube_r122.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
        Hair49.addChild(cube_r122);
        setRotationAngle(cube_r122, 0.5159F, 0.1231F, -0.124F);
        cube_r122.cubeList.add(new ModelBox(cube_r122, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r123 = new ModelRenderer(this);
        cube_r123.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
        Hair49.addChild(cube_r123);
        setRotationAngle(cube_r123, 0.2541F, 0.1231F, -0.124F);
        cube_r123.cubeList.add(new ModelBox(cube_r123, 92, 25, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair50 = new ModelRenderer(this);
        Hair50.setRotationPoint(3.3183F, -1.4356F, 6.2741F);
        gokuSsj4.addChild(Hair50);
        setRotationAngle(Hair50, 0.3194F, -0.2359F, 0.1494F);


        cube_r124 = new ModelRenderer(this);
        cube_r124.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair50.addChild(cube_r124);
        setRotationAngle(cube_r124, -0.0077F, 0.1231F, -0.124F);
        cube_r124.cubeList.add(new ModelBox(cube_r124, 92, 25, -2.1544F, -1.3148F, -1.3F, 2, 2, 2, -0.1F));

        cube_r125 = new ModelRenderer(this);
        cube_r125.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
        Hair50.addChild(cube_r125);
        setRotationAngle(cube_r125, 1.0832F, 0.1231F, -0.124F);
        cube_r125.cubeList.add(new ModelBox(cube_r125, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r126 = new ModelRenderer(this);
        cube_r126.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
        Hair50.addChild(cube_r126);
        setRotationAngle(cube_r126, 0.5159F, 0.1231F, -0.124F);
        cube_r126.cubeList.add(new ModelBox(cube_r126, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r127 = new ModelRenderer(this);
        cube_r127.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
        Hair50.addChild(cube_r127);
        setRotationAngle(cube_r127, 0.2541F, 0.1231F, -0.124F);
        cube_r127.cubeList.add(new ModelBox(cube_r127, 92, 25, -2.1F, 0.2F, -1.5F, 2, 2, 2, -0.1F));

        Hair51 = new ModelRenderer(this);
        Hair51.setRotationPoint(3.561F, -2.8068F, 2.7186F);
        gokuSsj4.addChild(Hair51);
        setRotationAngle(Hair51, -0.2089F, 0.1542F, 0.286F);


        cube_r128 = new ModelRenderer(this);
        cube_r128.setRotationPoint(-0.4156F, -1.9205F, -1.1368F);
        Hair51.addChild(cube_r128);
        setRotationAngle(cube_r128, -1.753F, 0.1231F, -0.124F);
        cube_r128.cubeList.add(new ModelBox(cube_r128, 92, 25, -1.0F, -1.2727F, -1.0F, 2, 2, 2, -0.1F));

        cube_r129 = new ModelRenderer(this);
        cube_r129.setRotationPoint(0.8387F, 2.2452F, 1.3553F);
        Hair51.addChild(cube_r129);
        setRotationAngle(cube_r129, 1.0832F, 0.1231F, -0.124F);
        cube_r129.cubeList.add(new ModelBox(cube_r129, 92, 25, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r130 = new ModelRenderer(this);
        cube_r130.setRotationPoint(0.8387F, 1.2452F, 0.3553F);
        Hair51.addChild(cube_r130);
        setRotationAngle(cube_r130, 0.5159F, 0.1231F, -0.124F);
        cube_r130.cubeList.add(new ModelBox(cube_r130, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r131 = new ModelRenderer(this);
        cube_r131.setRotationPoint(0.8387F, -1.7548F, -0.6447F);
        Hair51.addChild(cube_r131);
        setRotationAngle(cube_r131, 0.2541F, 0.1231F, -0.124F);
        cube_r131.cubeList.add(new ModelBox(cube_r131, 92, 25, -2.1F, 0.2F, -1.5F, 2, 2, 2, -0.1F));

        Hair52 = new ModelRenderer(this);
        Hair52.setRotationPoint(-0.6964F, -4.0606F, -0.703F);
        gokuSsj4.addChild(Hair52);
        setRotationAngle(Hair52, -0.8526F, -0.0679F, 0.2424F);


        cube_r132 = new ModelRenderer(this);
        cube_r132.setRotationPoint(-0.7963F, 0.0437F, -1.3942F);
        Hair52.addChild(cube_r132);
        setRotationAngle(cube_r132, 2.1493F, 0.5562F, 0.2819F);
        cube_r132.cubeList.add(new ModelBox(cube_r132, 91, 24, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

        cube_r133 = new ModelRenderer(this);
        cube_r133.setRotationPoint(1.1121F, -1.5477F, 0.75F);
        Hair52.addChild(cube_r133);
        setRotationAngle(cube_r133, 1.6427F, 0.5478F, 0.3134F);
        cube_r133.cubeList.add(new ModelBox(cube_r133, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r134 = new ModelRenderer(this);
        cube_r134.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
        Hair52.addChild(cube_r134);
        setRotationAngle(cube_r134, 0.9216F, 0.5621F, 0.3511F);
        cube_r134.cubeList.add(new ModelBox(cube_r134, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair53 = new ModelRenderer(this);
        Hair53.setRotationPoint(1.3036F, -3.0606F, 2.297F);
        gokuSsj4.addChild(Hair53);
        setRotationAngle(Hair53, -0.8424F, -0.0054F, 0.5049F);


        cube_r135 = new ModelRenderer(this);
        cube_r135.setRotationPoint(-0.7963F, 0.0437F, -1.3942F);
        Hair53.addChild(cube_r135);
        setRotationAngle(cube_r135, 2.1493F, 0.5562F, 0.2819F);
        cube_r135.cubeList.add(new ModelBox(cube_r135, 91, 24, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

        cube_r136 = new ModelRenderer(this);
        cube_r136.setRotationPoint(1.1121F, -1.5477F, 0.75F);
        Hair53.addChild(cube_r136);
        setRotationAngle(cube_r136, 1.6427F, 0.5478F, 0.3134F);
        cube_r136.cubeList.add(new ModelBox(cube_r136, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r137 = new ModelRenderer(this);
        cube_r137.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
        Hair53.addChild(cube_r137);
        setRotationAngle(cube_r137, 0.9216F, 0.5621F, 0.3511F);
        cube_r137.cubeList.add(new ModelBox(cube_r137, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair54 = new ModelRenderer(this);
        Hair54.setRotationPoint(0.3036F, -1.0606F, 4.297F);
        gokuSsj4.addChild(Hair54);
        setRotationAngle(Hair54, -0.8873F, -0.2386F, 0.4278F);


        cube_r138 = new ModelRenderer(this);
        cube_r138.setRotationPoint(-2.2263F, 0.0143F, -3.3828F);
        Hair54.addChild(cube_r138);
        setRotationAngle(cube_r138, 2.1493F, 0.5562F, 0.2819F);
        cube_r138.cubeList.add(new ModelBox(cube_r138, 91, 24, -1.0F, -3.0092F, -0.8026F, 2, 4, 2, -0.1F));

        cube_r139 = new ModelRenderer(this);
        cube_r139.setRotationPoint(-0.3178F, -1.5771F, -1.2386F);
        Hair54.addChild(cube_r139);
        setRotationAngle(cube_r139, 1.6427F, 0.5478F, 0.3134F);
        cube_r139.cubeList.add(new ModelBox(cube_r139, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r140 = new ModelRenderer(this);
        cube_r140.setRotationPoint(-0.3091F, 1.0051F, 0.3146F);
        Hair54.addChild(cube_r140);
        setRotationAngle(cube_r140, 0.9216F, 0.5621F, 0.3511F);
        cube_r140.cubeList.add(new ModelBox(cube_r140, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair55 = new ModelRenderer(this);
        Hair55.setRotationPoint(-1.5426F, -0.1301F, 1.2965F);
        gokuSsj4.addChild(Hair55);
        setRotationAngle(Hair55, -1.1958F, -0.7726F, 0.3105F);


        cube_r141 = new ModelRenderer(this);
        cube_r141.setRotationPoint(-2.3728F, -1.0315F, -3.709F);
        Hair55.addChild(cube_r141);
        setRotationAngle(cube_r141, 1.8875F, 0.5562F, 0.2819F);
        cube_r141.cubeList.add(new ModelBox(cube_r141, 91, 24, -1.0F, -0.0092F, -0.8026F, 2, 2, 2, -0.1F));

        cube_r142 = new ModelRenderer(this);
        cube_r142.setRotationPoint(-0.4644F, -2.6229F, -1.5648F);
        Hair55.addChild(cube_r142);
        setRotationAngle(cube_r142, 1.6427F, 0.5478F, 0.3134F);
        cube_r142.cubeList.add(new ModelBox(cube_r142, 91, 24, -1.0913F, -1.6178F, -2.3468F, 2, 2, 2, -0.1F));

        cube_r143 = new ModelRenderer(this);
        cube_r143.setRotationPoint(-0.4557F, -0.0407F, -0.0116F);
        Hair55.addChild(cube_r143);
        setRotationAngle(cube_r143, 0.9216F, 0.5621F, 0.3511F);
        cube_r143.cubeList.add(new ModelBox(cube_r143, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair56 = new ModelRenderer(this);
        Hair56.setRotationPoint(2.3036F, -1.7606F, 1.297F);
        gokuSsj4.addChild(Hair56);
        setRotationAngle(Hair56, 0.3827F, 0.7943F, -0.3596F);


        cube_r144 = new ModelRenderer(this);
        cube_r144.setRotationPoint(1.1121F, -1.5477F, 0.75F);
        Hair56.addChild(cube_r144);
        setRotationAngle(cube_r144, 1.6427F, 0.5478F, 0.3134F);
        cube_r144.cubeList.add(new ModelBox(cube_r144, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r145 = new ModelRenderer(this);
        cube_r145.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
        Hair56.addChild(cube_r145);
        setRotationAngle(cube_r145, 0.9216F, 0.5621F, 0.3511F);
        cube_r145.cubeList.add(new ModelBox(cube_r145, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair57 = new ModelRenderer(this);
        Hair57.setRotationPoint(4.9897F, -2.4241F, 0.7691F);
        gokuSsj4.addChild(Hair57);
        setRotationAngle(Hair57, -0.7313F, -0.455F, -0.5619F);


        cube_r146 = new ModelRenderer(this);
        cube_r146.setRotationPoint(1.0103F, 0.4241F, 0.2309F);
        Hair57.addChild(cube_r146);
        setRotationAngle(cube_r146, 1.4466F, -0.4396F, -0.2615F);
        cube_r146.cubeList.add(new ModelBox(cube_r146, 94, 25, -1.7F, -1.5F, -1.5F, 2, 2, 2, -0.1F));

        cube_r147 = new ModelRenderer(this);
        cube_r147.setRotationPoint(0.0103F, -0.5759F, 0.2309F);
        Hair57.addChild(cube_r147);
        setRotationAngle(cube_r147, 1.0103F, -0.4396F, -0.2615F);
        cube_r147.cubeList.add(new ModelBox(cube_r147, 94, 25, -1.1F, -1.3F, -1.5F, 2, 2, 2, -0.1F));

        cube_r148 = new ModelRenderer(this);
        cube_r148.setRotationPoint(-0.9897F, -0.5759F, 0.2309F);
        Hair57.addChild(cube_r148);
        setRotationAngle(cube_r148, 0.0525F, -0.6389F, -0.2728F);
        cube_r148.cubeList.add(new ModelBox(cube_r148, 94, 25, -0.5F, -0.9F, -1.0F, 2, 2, 2, -0.1F));

        Hair58 = new ModelRenderer(this);
        Hair58.setRotationPoint(4.3183F, -1.4356F, 2.2741F);
        gokuSsj4.addChild(Hair58);
        setRotationAngle(Hair58, 2.9073F, 0.2829F, 0.1834F);


        cube_r149 = new ModelRenderer(this);
        cube_r149.setRotationPoint(0.7334F, 3.6312F, 1.6716F);
        Hair58.addChild(cube_r149);
        setRotationAngle(cube_r149, 1.0832F, 0.1231F, -0.124F);
        cube_r149.cubeList.add(new ModelBox(cube_r149, 92, 25, -1.4F, -0.9F, -1.1F, 2, 2, 2, -0.1F));

        cube_r150 = new ModelRenderer(this);
        cube_r150.setRotationPoint(0.7334F, 2.6312F, 0.6716F);
        Hair58.addChild(cube_r150);
        setRotationAngle(cube_r150, 0.5159F, 0.1231F, -0.124F);
        cube_r150.cubeList.add(new ModelBox(cube_r150, 92, 25, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r151 = new ModelRenderer(this);
        cube_r151.setRotationPoint(0.7334F, -0.3688F, -0.3284F);
        Hair58.addChild(cube_r151);
        setRotationAngle(cube_r151, 0.2541F, 0.1231F, -0.124F);
        cube_r151.cubeList.add(new ModelBox(cube_r151, 92, 25, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair59 = new ModelRenderer(this);
        Hair59.setRotationPoint(1.3036F, -1.0606F, 6.297F);
        gokuSsj4.addChild(Hair59);
        setRotationAngle(Hair59, -0.46F, -0.2199F, 0.553F);


        cube_r152 = new ModelRenderer(this);
        cube_r152.setRotationPoint(-1.7745F, -1.7907F, -3.5571F);
        Hair59.addChild(cube_r152);
        setRotationAngle(cube_r152, 2.1493F, 0.5562F, 0.2819F);
        cube_r152.cubeList.add(new ModelBox(cube_r152, 91, 24, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

        cube_r153 = new ModelRenderer(this);
        cube_r153.setRotationPoint(0.1339F, -3.3821F, -1.4129F);
        Hair59.addChild(cube_r153);
        setRotationAngle(cube_r153, 1.6427F, 0.5478F, 0.3134F);
        cube_r153.cubeList.add(new ModelBox(cube_r153, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r154 = new ModelRenderer(this);
        cube_r154.setRotationPoint(0.1426F, -0.7999F, 0.1403F);
        Hair59.addChild(cube_r154);
        setRotationAngle(cube_r154, 0.9216F, 0.5621F, 0.3511F);
        cube_r154.cubeList.add(new ModelBox(cube_r154, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair60 = new ModelRenderer(this);
        Hair60.setRotationPoint(2.3036F, -4.0606F, 7.297F);
        gokuSsj4.addChild(Hair60);
        setRotationAngle(Hair60, -0.8729F, -0.4088F, 0.1806F);


        cube_r155 = new ModelRenderer(this);
        cube_r155.setRotationPoint(-2.943F, 0.6147F, -1.1381F);
        Hair60.addChild(cube_r155);
        setRotationAngle(cube_r155, 2.1493F, 0.5562F, 0.2819F);
        cube_r155.cubeList.add(new ModelBox(cube_r155, 91, 24, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

        cube_r156 = new ModelRenderer(this);
        cube_r156.setRotationPoint(-1.0346F, -0.9767F, 1.0061F);
        Hair60.addChild(cube_r156);
        setRotationAngle(cube_r156, 1.6427F, 0.5478F, 0.3134F);
        cube_r156.cubeList.add(new ModelBox(cube_r156, 91, 24, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

        cube_r157 = new ModelRenderer(this);
        cube_r157.setRotationPoint(-1.0259F, 1.6055F, 2.5593F);
        Hair60.addChild(cube_r157);
        setRotationAngle(cube_r157, 0.9216F, 0.5621F, 0.3511F);
        cube_r157.cubeList.add(new ModelBox(cube_r157, 90, 23, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

        Hair61 = new ModelRenderer(this);
        Hair61.setRotationPoint(-0.6964F, -4.0606F, 6.297F);
        gokuSsj4.addChild(Hair61);
        setRotationAngle(Hair61, -1.1127F, -0.292F, 0.2435F);


        cube_r158 = new ModelRenderer(this);
        cube_r158.setRotationPoint(-1.2523F, 0.2727F, -1.9962F);
        Hair61.addChild(cube_r158);
        setRotationAngle(cube_r158, 1.7566F, 0.5562F, 0.2819F);
        cube_r158.cubeList.add(new ModelBox(cube_r158, 91, 24, -1.0F, -1.5F, 0.2992F, 2, 3, 2, -0.1F));

        cube_r159 = new ModelRenderer(this);
        cube_r159.setRotationPoint(0.0402F, -0.1886F, -0.0593F);
        Hair61.addChild(cube_r159);
        setRotationAngle(cube_r159, 1.3809F, 0.5478F, 0.3134F);
        cube_r159.cubeList.add(new ModelBox(cube_r159, 91, 24, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

        cube_r160 = new ModelRenderer(this);
        cube_r160.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
        Hair61.addChild(cube_r160);
        setRotationAngle(cube_r160, 0.9216F, 0.5621F, 0.3511F);
        cube_r160.cubeList.add(new ModelBox(cube_r160, 90, 23, -1.1F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

        Hair62 = new ModelRenderer(this);
        Hair62.setRotationPoint(-1.8367F, -4.2777F, 4.2945F);
        gokuSsj4.addChild(Hair62);
        setRotationAngle(Hair62, -0.8532F, 0.6174F, 0.2288F);


        cube_r161 = new ModelRenderer(this);
        cube_r161.setRotationPoint(-1.7726F, 1.2733F, -2.7716F);
        Hair62.addChild(cube_r161);
        setRotationAngle(cube_r161, 1.6257F, 0.5562F, 0.2819F);
        cube_r161.cubeList.add(new ModelBox(cube_r161, 91, 24, -1.2513F, -2.1121F, 1.4992F, 2, 3, 2, -0.1F));

        cube_r162 = new ModelRenderer(this);
        cube_r162.setRotationPoint(-0.7726F, 1.2733F, -0.7716F);
        Hair62.addChild(cube_r162);
        setRotationAngle(cube_r162, 1.4075F, 0.5562F, 0.2819F);
        cube_r162.cubeList.add(new ModelBox(cube_r162, 91, 24, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

        cube_r163 = new ModelRenderer(this);
        cube_r163.setRotationPoint(0.5199F, 0.812F, 1.1653F);
        Hair62.addChild(cube_r163);
        setRotationAngle(cube_r163, 1.2064F, 0.5478F, 0.3134F);
        cube_r163.cubeList.add(new ModelBox(cube_r163, 91, 24, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

        cube_r164 = new ModelRenderer(this);
        cube_r164.setRotationPoint(1.6005F, 2.035F, 3.5278F);
        Hair62.addChild(cube_r164);
        setRotationAngle(cube_r164, 0.9216F, 0.5621F, 0.3511F);
        cube_r164.cubeList.add(new ModelBox(cube_r164, 90, 23, -1.1F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

        Hair63 = new ModelRenderer(this);
        Hair63.setRotationPoint(-3.5367F, -4.6777F, 5.2945F);
        gokuSsj4.addChild(Hair63);
        setRotationAngle(Hair63, -0.6309F, 0.7057F, 0.1852F);


        cube_r165 = new ModelRenderer(this);
        cube_r165.setRotationPoint(-1.7726F, 1.2733F, -2.7716F);
        Hair63.addChild(cube_r165);
        setRotationAngle(cube_r165, 1.6257F, 0.5562F, 0.2819F);
        cube_r165.cubeList.add(new ModelBox(cube_r165, 91, 24, -1.2513F, -2.1121F, 1.4992F, 2, 3, 2, -0.1F));

        cube_r166 = new ModelRenderer(this);
        cube_r166.setRotationPoint(-0.7726F, 1.2733F, -0.7716F);
        Hair63.addChild(cube_r166);
        setRotationAngle(cube_r166, 1.4075F, 0.5562F, 0.2819F);
        cube_r166.cubeList.add(new ModelBox(cube_r166, 91, 24, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

        cube_r167 = new ModelRenderer(this);
        cube_r167.setRotationPoint(0.5199F, 0.812F, 1.1653F);
        Hair63.addChild(cube_r167);
        setRotationAngle(cube_r167, 1.2064F, 0.5478F, 0.3134F);
        cube_r167.cubeList.add(new ModelBox(cube_r167, 91, 24, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

        cube_r168 = new ModelRenderer(this);
        cube_r168.setRotationPoint(1.6005F, 2.035F, 3.5278F);
        Hair63.addChild(cube_r168);
        setRotationAngle(cube_r168, 0.9216F, 0.5621F, 0.3511F);
        cube_r168.cubeList.add(new ModelBox(cube_r168, 90, 23, -1.1F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

        Hair64 = new ModelRenderer(this);
        Hair64.setRotationPoint(-3.7087F, -2.277F, 3.1786F);
        gokuSsj4.addChild(Hair64);
        setRotationAngle(Hair64, -1.1844F, -0.4824F, -0.2858F);


        cube_r169 = new ModelRenderer(this);
        cube_r169.setRotationPoint(-0.2539F, 1.3727F, -1.7743F);
        Hair64.addChild(cube_r169);
        setRotationAngle(cube_r169, 1.6257F, 0.5562F, 0.2819F);
        cube_r169.cubeList.add(new ModelBox(cube_r169, 90, 22, -0.9606F, -2.4581F, 1.7133F, 2, 3, 2, -0.1F));

        cube_r170 = new ModelRenderer(this);
        cube_r170.setRotationPoint(0.7461F, 1.3727F, 0.2257F);
        Hair64.addChild(cube_r170);
        setRotationAngle(cube_r170, 1.4075F, 0.5562F, 0.2819F);
        cube_r170.cubeList.add(new ModelBox(cube_r170, 100, 17, -0.7093F, -2.4581F, 1.1133F, 2, 3, 2, -0.1F));

        cube_r171 = new ModelRenderer(this);
        cube_r171.setRotationPoint(2.0386F, 0.9114F, 2.1626F);
        Hair64.addChild(cube_r171);
        setRotationAngle(cube_r171, 1.2064F, 0.5478F, 0.3134F);
        cube_r171.cubeList.add(new ModelBox(cube_r171, 99, 19, -0.7093F, -1.846F, -0.3236F, 2, 3, 2, -0.1F));

        Hair65 = new ModelRenderer(this);
        Hair65.setRotationPoint(-2.5616F, -2.1176F, 4.188F);
        gokuSsj4.addChild(Hair65);
        setRotationAngle(Hair65, 1.6782F, -1.0392F, 0.4671F);


        cube_r172 = new ModelRenderer(this);
        cube_r172.setRotationPoint(-0.274F, 0.0801F, -0.1493F);
        Hair65.addChild(cube_r172);
        setRotationAngle(cube_r172, -0.5874F, -0.0387F, -2.6612F);


        cube_r172_r1 = new ModelRenderer(this);
        cube_r172_r1.setRotationPoint(0.0F, 0.3163F, -0.275F);
        cube_r172.addChild(cube_r172_r1);
        setRotationAngle(cube_r172_r1, 0.3054F, 0.0F, 0.0F);
        cube_r172_r1.cubeList.add(new ModelBox(cube_r172_r1, 97, 19, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

        cube_r173 = new ModelRenderer(this);
        cube_r173.setRotationPoint(0.4907F, -1.4036F, 0.406F);
        Hair65.addChild(cube_r173);
        setRotationAngle(cube_r173, -0.1074F, -0.0387F, -2.6612F);
        cube_r173.cubeList.add(new ModelBox(cube_r173, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair66 = new ModelRenderer(this);
        Hair66.setRotationPoint(-3.8616F, -1.6176F, 5.188F);
        gokuSsj4.addChild(Hair66);
        setRotationAngle(Hair66, 2.3327F, -1.0392F, 0.4671F);


        cube_r174 = new ModelRenderer(this);
        cube_r174.setRotationPoint(-0.274F, 0.0801F, -0.1493F);
        Hair66.addChild(cube_r174);
        setRotationAngle(cube_r174, -0.5874F, -0.0387F, -2.6612F);


        cube_r174_r1 = new ModelRenderer(this);
        cube_r174_r1.setRotationPoint(-0.4F, 0.2163F, 0.325F);
        cube_r174.addChild(cube_r174_r1);
        setRotationAngle(cube_r174_r1, 0.3927F, 0.0F, 0.0F);
        cube_r174_r1.cubeList.add(new ModelBox(cube_r174_r1, 97, 19, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

        cube_r175 = new ModelRenderer(this);
        cube_r175.setRotationPoint(0.4907F, -1.4036F, 0.406F);
        Hair66.addChild(cube_r175);
        setRotationAngle(cube_r175, -0.1074F, -0.0387F, -2.6612F);
        cube_r175.cubeList.add(new ModelBox(cube_r175, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair67 = new ModelRenderer(this);
        Hair67.setRotationPoint(-4.4616F, -1.5176F, 5.188F);
        gokuSsj4.addChild(Hair67);
        setRotationAngle(Hair67, 1.6782F, -1.0392F, 0.4671F);


        cube_r176 = new ModelRenderer(this);
        cube_r176.setRotationPoint(0.726F, -1.9199F, -0.1493F);
        Hair67.addChild(cube_r176);
        setRotationAngle(cube_r176, -0.5874F, -0.0387F, -2.6612F);
        cube_r176.cubeList.add(new ModelBox(cube_r176, 97, 19, -1.0F, -1.4837F, -2.175F, 2, 2, 3, -0.1F));

        cube_r177 = new ModelRenderer(this);
        cube_r177.setRotationPoint(1.4907F, -3.4036F, 0.406F);
        Hair67.addChild(cube_r177);
        setRotationAngle(cube_r177, -0.1074F, -0.0387F, -2.6612F);
        cube_r177.cubeList.add(new ModelBox(cube_r177, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair68 = new ModelRenderer(this);
        Hair68.setRotationPoint(-4.5564F, -1.061F, 6.9119F);
        gokuSsj4.addChild(Hair68);
        setRotationAngle(Hair68, 2.016F, -1.2452F, 0.4519F);


        cube_r178 = new ModelRenderer(this);
        cube_r178.setRotationPoint(-0.274F, 0.0801F, -0.1493F);
        Hair68.addChild(cube_r178);
        setRotationAngle(cube_r178, -0.5874F, -0.0387F, -2.6612F);


        cube_r178_r1 = new ModelRenderer(this);
        cube_r178_r1.setRotationPoint(-0.3697F, -0.2191F, -1.2627F);
        cube_r178.addChild(cube_r178_r1);
        setRotationAngle(cube_r178_r1, 0.3491F, 0.0F, 0.0F);
        cube_r178_r1.cubeList.add(new ModelBox(cube_r178_r1, 98, 20, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.1F));

        cube_r178_r2 = new ModelRenderer(this);
        cube_r178_r2.setRotationPoint(-0.3697F, -0.2191F, -0.2627F);
        cube_r178.addChild(cube_r178_r2);
        setRotationAngle(cube_r178_r2, -0.0873F, 0.0F, 0.0F);
        cube_r178_r2.cubeList.add(new ModelBox(cube_r178_r2, 97, 19, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

        cube_r179 = new ModelRenderer(this);
        cube_r179.setRotationPoint(0.4907F, -1.4036F, 0.406F);
        Hair68.addChild(cube_r179);
        setRotationAngle(cube_r179, -0.1074F, -0.0387F, -2.6612F);
        cube_r179.cubeList.add(new ModelBox(cube_r179, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair69 = new ModelRenderer(this);
        Hair69.setRotationPoint(-3.9564F, -1.061F, 6.9119F);
        gokuSsj4.addChild(Hair69);
        setRotationAngle(Hair69, 1.8851F, -1.2452F, 0.4519F);


        cube_r180 = new ModelRenderer(this);
        cube_r180.setRotationPoint(-0.274F, -1.9199F, -1.1493F);
        Hair69.addChild(cube_r180);
        setRotationAngle(cube_r180, -0.5874F, -0.0387F, -2.6612F);
        cube_r180.cubeList.add(new ModelBox(cube_r180, 96, 18, -1.3697F, -1.2191F, -2.7627F, 2, 2, 4, -0.1F));

        cube_r181 = new ModelRenderer(this);
        cube_r181.setRotationPoint(0.4907F, -3.4036F, -0.594F);
        Hair69.addChild(cube_r181);
        setRotationAngle(cube_r181, -0.1074F, -0.0387F, -2.6612F);
        cube_r181.cubeList.add(new ModelBox(cube_r181, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair70 = new ModelRenderer(this);
        Hair70.setRotationPoint(-2.8404F, 2.575F, 4.1614F);
        gokuSsj4.addChild(Hair70);
        setRotationAngle(Hair70, 1.92F, 0.2544F, 0.274F);


        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-0.6817F, 0.4356F, -0.2741F);
        Hair70.addChild(cube_r24);
        setRotationAngle(cube_r24, 1.0832F, -0.1231F, 0.124F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 93, 18, -0.7F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(-0.6817F, -0.5644F, -1.2741F);
        Hair70.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.5159F, -0.1231F, 0.124F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 99, 24, -0.5F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-0.6817F, -3.5644F, -2.2741F);
        Hair70.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.2541F, -0.1231F, 0.124F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 95, 18, -0.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

        Hair71 = new ModelRenderer(this);
        Hair71.setRotationPoint(-2.7F, -1.0F, 2.9F);
        gokuSsj4.addChild(Hair71);
        setRotationAngle(Hair71, -0.3047F, -0.021F, -0.0666F);


        cube_r182 = new ModelRenderer(this);
        cube_r182.setRotationPoint(-1.0356F, 0.7844F, -0.7787F);
        Hair71.addChild(cube_r182);
        setRotationAngle(cube_r182, -0.5874F, -0.0387F, -2.6612F);
        cube_r182.cubeList.add(new ModelBox(cube_r182, 97, 19, -1.3F, -1.4837F, -2.175F, 2, 2, 3, -0.1F));

        cube_r183 = new ModelRenderer(this);
        cube_r183.setRotationPoint(-0.271F, -0.6993F, -0.2234F);
        Hair71.addChild(cube_r183);
        setRotationAngle(cube_r183, -0.1074F, -0.0387F, -2.6612F);
        cube_r183.cubeList.add(new ModelBox(cube_r183, 98, 20, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

        Hair72 = new ModelRenderer(this);
        Hair72.setRotationPoint(3.0367F, -2.0777F, 4.2945F);
        gokuSsj4.addChild(Hair72);
        setRotationAngle(Hair72, 1.8921F, -0.8072F, -2.6364F);


        cube_r184 = new ModelRenderer(this);
        cube_r184.setRotationPoint(2.6417F, 0.1985F, -4.2171F);
        Hair72.addChild(cube_r184);
        setRotationAngle(cube_r184, 1.6257F, -0.5562F, -0.2819F);
        cube_r184.cubeList.add(new ModelBox(cube_r184, 99, 25, -0.7487F, -2.1121F, 1.4992F, 2, 3, 2, -0.1F));

        cube_r185 = new ModelRenderer(this);
        cube_r185.setRotationPoint(1.6417F, 0.1985F, -2.2171F);
        Hair72.addChild(cube_r185);
        setRotationAngle(cube_r185, 1.4075F, -0.5562F, -0.2819F);
        cube_r185.cubeList.add(new ModelBox(cube_r185, 98, 17, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

        cube_r186 = new ModelRenderer(this);
        cube_r186.setRotationPoint(0.3492F, -0.2628F, -0.2802F);
        Hair72.addChild(cube_r186);
        setRotationAngle(cube_r186, 1.2064F, -0.5478F, -0.3134F);
        cube_r186.cubeList.add(new ModelBox(cube_r186, 100, 18, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

        cube_r187 = new ModelRenderer(this);
        cube_r187.setRotationPoint(-0.7314F, 0.9602F, 2.0823F);
        Hair72.addChild(cube_r187);
        setRotationAngle(cube_r187, 0.9216F, -0.5621F, -0.3511F);
        cube_r187.cubeList.add(new ModelBox(cube_r187, 94, 17, -0.9F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

        Hair73 = new ModelRenderer(this);
        Hair73.setRotationPoint(1.2367F, -1.8777F, 3.2945F);
        gokuSsj4.addChild(Hair73);
        setRotationAngle(Hair73, 1.8235F, -0.9323F, -2.5528F);


        cube_r188 = new ModelRenderer(this);
        cube_r188.setRotationPoint(2.6417F, 0.1985F, -4.2171F);
        Hair73.addChild(cube_r188);
        setRotationAngle(cube_r188, 1.6257F, -0.5562F, -0.2819F);
        cube_r188.cubeList.add(new ModelBox(cube_r188, 100, 23, -0.7487F, -1.9121F, 1.4992F, 2, 3, 2, -0.2F));

        cube_r189 = new ModelRenderer(this);
        cube_r189.setRotationPoint(1.6417F, 0.1985F, -2.2171F);
        Hair73.addChild(cube_r189);
        setRotationAngle(cube_r189, 1.4075F, -0.5562F, -0.2819F);
        cube_r189.cubeList.add(new ModelBox(cube_r189, 100, 26, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

        cube_r190 = new ModelRenderer(this);
        cube_r190.setRotationPoint(0.3492F, -0.2628F, -0.2802F);
        Hair73.addChild(cube_r190);
        setRotationAngle(cube_r190, 1.2064F, -0.5478F, -0.3134F);
        cube_r190.cubeList.add(new ModelBox(cube_r190, 96, 26, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

        cube_r191 = new ModelRenderer(this);
        cube_r191.setRotationPoint(-0.7314F, 0.9602F, 2.0823F);
        Hair73.addChild(cube_r191);
        setRotationAngle(cube_r191, 0.9216F, -0.5621F, -0.3511F);
        cube_r191.cubeList.add(new ModelBox(cube_r191, 90, 17, -0.9F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

        Hair74 = new ModelRenderer(this);
        Hair74.setRotationPoint(3.4367F, -0.5777F, 5.1945F);
        gokuSsj4.addChild(Hair74);
        setRotationAngle(Hair74, 1.398F, -0.9224F, -2.2616F);


        cube_r192 = new ModelRenderer(this);
        cube_r192.setRotationPoint(2.6417F, 0.1985F, -4.2171F);
        Hair74.addChild(cube_r192);
        setRotationAngle(cube_r192, 1.6257F, -0.5562F, -0.2819F);
        cube_r192.cubeList.add(new ModelBox(cube_r192, 90, 18, -0.7487F, -1.9121F, 1.4992F, 2, 3, 2, -0.2F));

        cube_r193 = new ModelRenderer(this);
        cube_r193.setRotationPoint(1.6417F, 0.1985F, -2.2171F);
        Hair74.addChild(cube_r193);
        setRotationAngle(cube_r193, 1.4075F, -0.5562F, -0.2819F);
        cube_r193.cubeList.add(new ModelBox(cube_r193, 90, 20, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

        cube_r194 = new ModelRenderer(this);
        cube_r194.setRotationPoint(0.3492F, -0.2628F, -0.2802F);
        Hair74.addChild(cube_r194);
        setRotationAngle(cube_r194, 1.2064F, -0.5478F, -0.3134F);
        cube_r194.cubeList.add(new ModelBox(cube_r194, 90, 26, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

        VegetaSSJ4 = new ModelRenderer(this);
        VegetaSSJ4.setRotationPoint(0.0F, 0.1F, 0.0F);
        bipedHead.addChild(VegetaSSJ4);


        VegetaSSJ2 = new ModelRenderer(this);
        VegetaSSJ2.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ2);
        setRotationAngle(VegetaSSJ2, -0.4363F, 0.0F, -0.4014F);
        VegetaSSJ2.cubeList.add(new ModelBox(VegetaSSJ2, 32, 0, -1.0F, -10.0F, -6.2F, 4, 6, 4, -0.1F));

        VegetaSSJ3 = new ModelRenderer(this);
        VegetaSSJ3.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ3);
        setRotationAngle(VegetaSSJ3, -0.6109F, 0.0F, -0.2443F);
        VegetaSSJ3.cubeList.add(new ModelBox(VegetaSSJ3, 34, 1, -0.5F, -14.0F, -6.0F, 3, 3, 3, -0.1F));

        VegetaSSJ5 = new ModelRenderer(this);
        VegetaSSJ5.setRotationPoint(0.0F, -9.3F, -5.2F);
        VegetaSSJ4.addChild(VegetaSSJ5);


        bipedHeadssj3lChild_6 = new ModelRenderer(this);
        bipedHeadssj3lChild_6.setRotationPoint(0.1745F, 4.5618F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_6);
        bipedHeadssj3lChild_6.cubeList.add(new ModelBox(bipedHeadssj3lChild_6, 32, 1, -0.9F, 1.2667F, 4.0F, 4, 5, 4, -0.1F));

        bipedHeadssj3lChild_4 = new ModelRenderer(this);
        bipedHeadssj3lChild_4.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_4);
        setRotationAngle(bipedHeadssj3lChild_4, 0.1571F, -0.2618F, 0.0F);
        bipedHeadssj3lChild_4.cubeList.add(new ModelBox(bipedHeadssj3lChild_4, 32, 0, -2.4667F, 2.0F, 4.0F, 4, 6, 4, -0.1F));

        bipedHeadssj3lChild_3 = new ModelRenderer(this);
        bipedHeadssj3lChild_3.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_3);
        setRotationAngle(bipedHeadssj3lChild_3, 0.2269F, 0.0F, -0.2094F);
        bipedHeadssj3lChild_3.cubeList.add(new ModelBox(bipedHeadssj3lChild_3, 34, 1, 2.17F, 1.73F, 3.0F, 3, 5, 3, -0.1F));

        bipedHeadssj3lChild_1 = new ModelRenderer(this);
        bipedHeadssj3lChild_1.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_1);
        setRotationAngle(bipedHeadssj3lChild_1, 0.1396F, 0.0F, 0.0873F);
        bipedHeadssj3lChild_1.cubeList.add(new ModelBox(bipedHeadssj3lChild_1, 34, 1, -5.4667F, 4.2F, 3.0F, 3, 5, 3, -0.1F));

        bipedHeadssj3lChild_8 = new ModelRenderer(this);
        bipedHeadssj3lChild_8.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_8);
        setRotationAngle(bipedHeadssj3lChild_8, 0.2793F, 0.0F, 0.0F);
        bipedHeadssj3lChild_8.cubeList.add(new ModelBox(bipedHeadssj3lChild_8, 32, 0, -2.0F, 1.0F, 4.0F, 4, 6, 4, -0.1F));

        bipedHeadssj3lChild_10 = new ModelRenderer(this);
        bipedHeadssj3lChild_10.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_10);
        setRotationAngle(bipedHeadssj3lChild_10, -0.9425F, 0.1222F, 0.0F);
        bipedHeadssj3lChild_10.cubeList.add(new ModelBox(bipedHeadssj3lChild_10, 34, 1, -5.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));
        bipedHeadssj3lChild_10.cubeList.add(new ModelBox(bipedHeadssj3lChild_10, 34, 1, -5.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));

        bipedHeadssj3lChild_7 = new ModelRenderer(this);
        bipedHeadssj3lChild_7.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_7);
        setRotationAngle(bipedHeadssj3lChild_7, 0.1745F, 0.0F, 0.0F);
        bipedHeadssj3lChild_7.cubeList.add(new ModelBox(bipedHeadssj3lChild_7, 33, 2, -1.9333F, 6.0F, 5.0F, 4, 6, 3, -0.1F));

        bipedHeadssj3lChild = new ModelRenderer(this);
        bipedHeadssj3lChild.setRotationPoint(0.1396F, 4.3F, 2.1127F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild);
        setRotationAngle(bipedHeadssj3lChild, 0.1396F, 0.0F, -0.0873F);
        bipedHeadssj3lChild.cubeList.add(new ModelBox(bipedHeadssj3lChild, 34, 1, 2.5333F, 4.2F, 3.0F, 2, 5, 3, -0.1F));

        bipedHeadssj3lChild_5 = new ModelRenderer(this);
        bipedHeadssj3lChild_5.setRotationPoint(0.1047F, 4.5618F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_5);
        setRotationAngle(bipedHeadssj3lChild_5, 0.1047F, 0.2618F, 0.0F);
        bipedHeadssj3lChild_5.cubeList.add(new ModelBox(bipedHeadssj3lChild_5, 32, 1, -1.0F, 3.9667F, 4.0F, 4, 5, 4, -0.1F));

        bipedHeadssj3lChild_9 = new ModelRenderer(this);
        bipedHeadssj3lChild_9.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_9);
        setRotationAngle(bipedHeadssj3lChild_9, -0.9425F, -0.1222F, 0.0F);
        bipedHeadssj3lChild_9.cubeList.add(new ModelBox(bipedHeadssj3lChild_9, 34, 1, 3.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));

        bipedHeadssj3lChild_2 = new ModelRenderer(this);
        bipedHeadssj3lChild_2.setRotationPoint(0.0F, 4.3F, 2.2F);
        VegetaSSJ5.addChild(bipedHeadssj3lChild_2);
        setRotationAngle(bipedHeadssj3lChild_2, 0.2269F, 0.0F, 0.2094F);
        bipedHeadssj3lChild_2.cubeList.add(new ModelBox(bipedHeadssj3lChild_2, 34, 1, -5.17F, 1.73F, 3.0F, 3, 5, 3, -0.1F));

        VegetaSSJ6 = new ModelRenderer(this);
        VegetaSSJ6.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ6);
        setRotationAngle(VegetaSSJ6, -0.5934F, 0.0F, 0.0F);
        VegetaSSJ6.cubeList.add(new ModelBox(VegetaSSJ6, 34, 1, 0.0F, -14.0F, -7.0F, 2, 3, 2, -0.1F));

        VegetaSSJ7 = new ModelRenderer(this);
        VegetaSSJ7.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ7);
        setRotationAngle(VegetaSSJ7, 0.0F, -0.3491F, -0.925F);
        VegetaSSJ7.cubeList.add(new ModelBox(VegetaSSJ7, 34, 1, 7.0F, -2.0F, -1.5F, 3, 2, 2, -0.1F));

        VegetaSSJ8 = new ModelRenderer(this);
        VegetaSSJ8.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ8);
        setRotationAngle(VegetaSSJ8, -0.576F, 0.0F, 0.1396F);
        VegetaSSJ8.cubeList.add(new ModelBox(VegetaSSJ8, 34, 1, -1.0F, -12.0F, -6.0F, 3, 3, 3, -0.1F));

        VegetaSSJ9 = new ModelRenderer(this);
        VegetaSSJ9.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ9);
        setRotationAngle(VegetaSSJ9, -0.1396F, 0.0F, 0.0F);
        VegetaSSJ9.cubeList.add(new ModelBox(VegetaSSJ9, 34, 1, -2.0F, -13.0F, -1.0F, 3, 5, 4, -0.1F));

        VegetaSSJ11 = new ModelRenderer(this);
        VegetaSSJ11.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ11);
        setRotationAngle(VegetaSSJ11, -0.2443F, 0.2618F, 0.0175F);
        VegetaSSJ11.cubeList.add(new ModelBox(VegetaSSJ11, 32, 1, -1.0F, -10.0F, -1.0F, 4, 5, 4, -0.1F));

        VegetaSSJ10 = new ModelRenderer(this);
        VegetaSSJ10.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ10);
        setRotationAngle(VegetaSSJ10, -0.4363F, 0.0F, 0.0F);
        VegetaSSJ10.cubeList.add(new ModelBox(VegetaSSJ10, 34, 1, -0.5F, -12.0F, -6.0F, 3, 3, 3, -0.1F));

        VegetaSSJ12 = new ModelRenderer(this);
        VegetaSSJ12.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ12);
        setRotationAngle(VegetaSSJ12, 0.0F, -0.1745F, -0.6109F);
        VegetaSSJ12.cubeList.add(new ModelBox(VegetaSSJ12, 34, 1, 4.0F, -4.0F, -1.0F, 4, 3, 3, -0.1F));

        VegetaSSJ13 = new ModelRenderer(this);
        VegetaSSJ13.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ13);
        setRotationAngle(VegetaSSJ13, -0.5411F, 0.0F, -0.3665F);
        VegetaSSJ13.cubeList.add(new ModelBox(VegetaSSJ13, 32, 1, -0.5F, -12.0F, -6.0F, 5, 4, 3, -0.1F));

        VegetaSSJ14 = new ModelRenderer(this);
        VegetaSSJ14.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ14);
        setRotationAngle(VegetaSSJ14, -0.2793F, 0.0F, 0.0F);
        VegetaSSJ14.cubeList.add(new ModelBox(VegetaSSJ14, 32, 1, -2.0F, -9.0F, -1.0F, 4, 5, 4, -0.1F));

        VegetaSSJ15 = new ModelRenderer(this);
        VegetaSSJ15.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ15);
        setRotationAngle(VegetaSSJ15, -0.6981F, 0.0F, -0.1222F);
        VegetaSSJ15.cubeList.add(new ModelBox(VegetaSSJ15, 34, 1, 0.0F, -15.4F, -7.0F, 2, 5, 2, -0.1F));

        VegetaSSJ16 = new ModelRenderer(this);
        VegetaSSJ16.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ16);
        setRotationAngle(VegetaSSJ16, -0.3142F, 0.0F, 0.0F);
        VegetaSSJ16.cubeList.add(new ModelBox(VegetaSSJ16, 32, 1, -1.0F, -10.0F, -6.05F, 4, 4, 4, -0.1F));

        VegetaSSJ17 = new ModelRenderer(this);
        VegetaSSJ17.setRotationPoint(-0.5411F, 0.0F, 0.2455F);
        VegetaSSJ4.addChild(VegetaSSJ17);
        setRotationAngle(VegetaSSJ17, -0.5411F, 0.0F, 0.2455F);
        VegetaSSJ17.cubeList.add(new ModelBox(VegetaSSJ17, 34, 1, -0.5F, -10.0F, -6.0F, 3, 3, 3, -0.1F));

        VegetaSSJ18 = new ModelRenderer(this);
        VegetaSSJ18.setRotationPoint(0.0F, 0.3491F, 0.8901F);
        VegetaSSJ4.addChild(VegetaSSJ18);
        setRotationAngle(VegetaSSJ18, 0.0F, 0.3491F, 0.8901F);
        VegetaSSJ18.cubeList.add(new ModelBox(VegetaSSJ18, 32, 0, -10.0F, -2.1667F, -1.5F, 3, 2, 2, -0.1F));

        VegetaSSJ19 = new ModelRenderer(this);
        VegetaSSJ19.setRotationPoint(-0.2443F, -0.2618F, 0.0175F);
        VegetaSSJ4.addChild(VegetaSSJ19);
        setRotationAngle(VegetaSSJ19, -0.2443F, -0.2618F, 0.0175F);
        VegetaSSJ19.cubeList.add(new ModelBox(VegetaSSJ19, 32, 0, -4.0F, -11.0F, -1.0F, 4, 6, 4, -0.1F));

        VegetaSSJ20 = new ModelRenderer(this);
        VegetaSSJ20.setRotationPoint(-0.3665F, 0.0F, 0.4363F);
        VegetaSSJ4.addChild(VegetaSSJ20);
        setRotationAngle(VegetaSSJ20, -0.3665F, 0.0F, 0.4363F);
        VegetaSSJ20.cubeList.add(new ModelBox(VegetaSSJ20, 34, 1, -1.5F, -9.0F, -5.5F, 3, 5, 3, -0.1F));

        VegetaSSJ21 = new ModelRenderer(this);
        VegetaSSJ21.setRotationPoint(-0.1222F, 0.1745F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ21);
        setRotationAngle(VegetaSSJ21, -0.1222F, 0.1745F, 0.0F);
        VegetaSSJ21.cubeList.add(new ModelBox(VegetaSSJ21, 34, 1, -1.0F, -14.0F, 0.0F, 3, 5, 3, -0.1F));

        VegetaSSJ22 = new ModelRenderer(this);
        VegetaSSJ22.setRotationPoint(-0.2443F, -0.2618F, 0.0175F);
        VegetaSSJ4.addChild(VegetaSSJ22);
        setRotationAngle(VegetaSSJ22, -0.2443F, -0.2618F, 0.0175F);
        VegetaSSJ22.cubeList.add(new ModelBox(VegetaSSJ22, 34, 1, -2.8667F, -13.2F, -0.6667F, 3, 4, 3, -0.1F));

        VegetaSSJ23 = new ModelRenderer(this);
        VegetaSSJ23.setRotationPoint(0.0F, 0.0F, 0.0F);
        VegetaSSJ4.addChild(VegetaSSJ23);
        setRotationAngle(VegetaSSJ23, 0.0F, 0.1745F, 0.6109F);
        VegetaSSJ23.cubeList.add(new ModelBox(VegetaSSJ23, 34, 1, -8.0F, -4.0F, -1.0F, 4, 3, 3, -0.1F));

        GohanSSJ4 = new ModelRenderer(this);
        GohanSSJ4.setRotationPoint(0.0F, 0.1F, 0.0F);
        bipedHead.addChild(GohanSSJ4);


        GohanSSJ2 = new ModelRenderer(this);
        GohanSSJ2.setRotationPoint(0.0F, -9.3F, -5.2F);
        GohanSSJ4.addChild(GohanSSJ2);


        GohanSSJ3 = new ModelRenderer(this);
        GohanSSJ3.setRotationPoint(0.1745F, 4.5618F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ3);
        GohanSSJ3.cubeList.add(new ModelBox(GohanSSJ3, 112, 54, -0.9F, 1.2667F, 4.0F, 4, 5, 4, -0.1F));

        GohanSSJ5 = new ModelRenderer(this);
        GohanSSJ5.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ5);
        setRotationAngle(GohanSSJ5, 0.1571F, -0.2618F, 0.0F);
        GohanSSJ5.cubeList.add(new ModelBox(GohanSSJ5, 112, 54, -2.4667F, 2.0F, 4.0F, 4, 6, 4, -0.1F));

        GohanSSJ6 = new ModelRenderer(this);
        GohanSSJ6.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ6);
        setRotationAngle(GohanSSJ6, 0.2269F, 0.0F, -0.2094F);
        GohanSSJ6.cubeList.add(new ModelBox(GohanSSJ6, 112, 54, 2.17F, 1.73F, 3.0F, 3, 5, 3, -0.1F));

        GohanSSJ7 = new ModelRenderer(this);
        GohanSSJ7.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ7);
        setRotationAngle(GohanSSJ7, 0.1396F, 0.0F, 0.0873F);
        GohanSSJ7.cubeList.add(new ModelBox(GohanSSJ7, 112, 54, -5.4667F, 4.2F, 3.0F, 3, 5, 3, -0.1F));

        GohanSSJ8 = new ModelRenderer(this);
        GohanSSJ8.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ8);
        setRotationAngle(GohanSSJ8, 0.2793F, 0.0F, 0.0F);
        GohanSSJ8.cubeList.add(new ModelBox(GohanSSJ8, 112, 54, -2.0F, 1.0F, 4.0F, 4, 6, 4, -0.1F));

        GohanSSJ9 = new ModelRenderer(this);
        GohanSSJ9.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ9);
        setRotationAngle(GohanSSJ9, -0.9425F, 0.1222F, 0.0F);
        GohanSSJ9.cubeList.add(new ModelBox(GohanSSJ9, 112, 54, -5.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));
        GohanSSJ9.cubeList.add(new ModelBox(GohanSSJ9, 112, 54, -5.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));

        GohanSSJ10 = new ModelRenderer(this);
        GohanSSJ10.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ10);
        setRotationAngle(GohanSSJ10, 0.1745F, 0.0F, 0.0F);
        GohanSSJ10.cubeList.add(new ModelBox(GohanSSJ10, 113, 55, -1.9333F, 6.0F, 5.0F, 4, 6, 3, -0.1F));

        GohanSSJ11 = new ModelRenderer(this);
        GohanSSJ11.setRotationPoint(0.1396F, 4.3F, 2.1127F);
        GohanSSJ2.addChild(GohanSSJ11);
        setRotationAngle(GohanSSJ11, 0.1396F, 0.0F, -0.0873F);
        GohanSSJ11.cubeList.add(new ModelBox(GohanSSJ11, 112, 54, 2.5333F, 4.2F, 3.0F, 2, 5, 3, -0.1F));

        GohanSSJ12 = new ModelRenderer(this);
        GohanSSJ12.setRotationPoint(0.1047F, 4.5618F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ12);
        setRotationAngle(GohanSSJ12, 0.1047F, 0.2618F, 0.0F);
        GohanSSJ12.cubeList.add(new ModelBox(GohanSSJ12, 112, 54, -1.0F, 4.9667F, 4.0F, 4, 4, 4, -0.1F));

        GohanSSJ13 = new ModelRenderer(this);
        GohanSSJ13.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ13);
        setRotationAngle(GohanSSJ13, -0.9425F, -0.1222F, 0.0F);
        GohanSSJ13.cubeList.add(new ModelBox(GohanSSJ13, 112, 54, 3.7F, -2.1F, 2.0F, 2, 5, 3, -0.1F));

        GohanSSJ14 = new ModelRenderer(this);
        GohanSSJ14.setRotationPoint(0.0F, 4.3F, 2.2F);
        GohanSSJ2.addChild(GohanSSJ14);
        setRotationAngle(GohanSSJ14, 0.2269F, 0.0F, 0.2094F);
        GohanSSJ14.cubeList.add(new ModelBox(GohanSSJ14, 112, 54, -5.17F, 1.73F, 3.0F, 3, 5, 3, -0.1F));

        GohanSSJ15 = new ModelRenderer(this);
        GohanSSJ15.setRotationPoint(-2.0F, 7.3669F, 13.9102F);
        GohanSSJ2.addChild(GohanSSJ15);
        setRotationAngle(GohanSSJ15, -0.9587F, -0.2133F, -0.0902F);


        GohanSSJ16 = new ModelRenderer(this);
        GohanSSJ16.setRotationPoint(2.0F, 25.4331F, -9.4102F);
        GohanSSJ15.addChild(GohanSSJ16);
        setRotationAngle(GohanSSJ16, -0.0175F, 0.0175F, -0.0003F);
        GohanSSJ16.cubeList.add(new ModelBox(GohanSSJ16, 96, 49, -4.0F, -25.7F, 2.8102F, 4, 3, 12, -0.1F));

        GohanSSJ17 = new ModelRenderer(this);
        GohanSSJ17.setRotationPoint(2.0F, 7.5669F, 13.6102F);
        GohanSSJ2.addChild(GohanSSJ17);
        setRotationAngle(GohanSSJ17, -0.9214F, 0.5763F, 0.0981F);
        GohanSSJ17.cubeList.add(new ModelBox(GohanSSJ17, 96, 49, -2.0F, -0.1669F, -7.0F, 4, 3, 12, -0.1F));

        GohanSSJ18 = new ModelRenderer(this);
        GohanSSJ18.setRotationPoint(2.0F, -0.1F, 1.9F);
        GohanSSJ2.addChild(GohanSSJ18);
        setRotationAngle(GohanSSJ18, -0.4887F, 0.0F, 0.0F);
        GohanSSJ18.cubeList.add(new ModelBox(GohanSSJ18, 109, 55, -4.0F, -1.0F, 10.0F, 4, 2, 5, -0.1F));

        GohanSSJ19 = new ModelRenderer(this);
        GohanSSJ19.setRotationPoint(0.0F, 0.8F, 12.5F);
        GohanSSJ2.addChild(GohanSSJ19);
        setRotationAngle(GohanSSJ19, -0.9425F, 0.0F, 0.0F);
        GohanSSJ19.cubeList.add(new ModelBox(GohanSSJ19, 107, 54, -2.0F, 0.5059F, -2.0957F, 4, 2, 6, -0.1F));

        GohanSSJ20 = new ModelRenderer(this);
        GohanSSJ20.setRotationPoint(-2.8748F, 9.2493F, 6.7122F);
        GohanSSJ2.addChild(GohanSSJ20);
        setRotationAngle(GohanSSJ20, -2.0007F, -1.0092F, -0.3326F);
        GohanSSJ20.cubeList.add(new ModelBox(GohanSSJ20, 115, 55, 0.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        GohanSSJ21 = new ModelRenderer(this);
        GohanSSJ21.setRotationPoint(-4.9326F, 6.4612F, 8.8193F);
        GohanSSJ2.addChild(GohanSSJ21);
        setRotationAngle(GohanSSJ21, -2.1931F, -0.4604F, -0.3381F);
        GohanSSJ21.cubeList.add(new ModelBox(GohanSSJ21, 114, 55, 0.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        GohanSSJ22 = new ModelRenderer(this);
        GohanSSJ22.setRotationPoint(2.8748F, 9.2493F, 6.7122F);
        GohanSSJ2.addChild(GohanSSJ22);
        setRotationAngle(GohanSSJ22, -2.0007F, 1.0092F, 0.3326F);
        GohanSSJ22.cubeList.add(new ModelBox(GohanSSJ22, 115, 55, -3.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        GohanSSJ23 = new ModelRenderer(this);
        GohanSSJ23.setRotationPoint(4.9326F, 6.4612F, 9.3193F);
        GohanSSJ2.addChild(GohanSSJ23);
        setRotationAngle(GohanSSJ23, -2.4986F, 0.4604F, 0.3381F);
        GohanSSJ23.cubeList.add(new ModelBox(GohanSSJ23, 112, 48, -4.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        GohanSSJ24 = new ModelRenderer(this);
        GohanSSJ24.setRotationPoint(4.9326F, 6.4612F, 8.8193F);
        GohanSSJ2.addChild(GohanSSJ24);
        setRotationAngle(GohanSSJ24, -2.1931F, 0.4604F, 0.3381F);
        GohanSSJ24.cubeList.add(new ModelBox(GohanSSJ24, 110, 54, -4.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        GohanSSJ25 = new ModelRenderer(this);
        GohanSSJ25.setRotationPoint(-1.0F, -9.1F, -0.4F);
        GohanSSJ4.addChild(GohanSSJ25);
        setRotationAngle(GohanSSJ25, -0.1309F, 0.0023F, -0.1572F);
        GohanSSJ25.cubeList.add(new ModelBox(GohanSSJ25, 106, 50, -0.5133F, -6.374F, -2.0714F, 3, 8, 3, 0.0F));

        GohanSSJ26 = new ModelRenderer(this);
        GohanSSJ26.setRotationPoint(-2.0F, -10.1F, -0.4F);
        GohanSSJ4.addChild(GohanSSJ26);
        setRotationAngle(GohanSSJ26, -0.1745F, 0.0F, -0.349F);
        GohanSSJ26.cubeList.add(new ModelBox(GohanSSJ26, 107, 49, -1.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));
        GohanSSJ26.cubeList.add(new ModelBox(GohanSSJ26, 108, 49, -0.9397F, -3.458F, -1.5F, 2, 7, 3, 0.1F));

        GohanSSJ27 = new ModelRenderer(this);
        GohanSSJ27.setRotationPoint(1.0F, -8.1F, -0.4F);
        GohanSSJ4.addChild(GohanSSJ27);
        setRotationAngle(GohanSSJ27, -0.0524F, 0.0F, 0.3665F);
        GohanSSJ27.cubeList.add(new ModelBox(GohanSSJ27, 106, 49, 0.0603F, -5.342F, -3.0F, 3, 7, 3, 0.0F));

        GohanSSJ28 = new ModelRenderer(this);
        GohanSSJ28.setRotationPoint(2.0F, -7.1F, -0.4F);
        GohanSSJ4.addChild(GohanSSJ28);
        setRotationAngle(GohanSSJ28, 0.0F, 0.0873F, 0.4363F);
        GohanSSJ28.cubeList.add(new ModelBox(GohanSSJ28, 109, 49, 1.0603F, -5.342F, -0.9F, 2, 7, 3, 0.0F));

        GohanSSJ29 = new ModelRenderer(this);
        GohanSSJ29.setRotationPoint(-4.6F, -6.5F, -2.4F);
        GohanSSJ4.addChild(GohanSSJ29);
        setRotationAngle(GohanSSJ29, 2.7925F, 0.0873F, -0.4364F);
        GohanSSJ29.cubeList.add(new ModelBox(GohanSSJ29, 111, 49, -0.0028F, -2.171F, -3.2188F, 3, 7, 3, 0.0F));

        GohanSSJ30 = new ModelRenderer(this);
        GohanSSJ30.setRotationPoint(-5.0F, -7.1F, 3.6F);
        GohanSSJ4.addChild(GohanSSJ30);
        setRotationAngle(GohanSSJ30, -0.0873F, 0.0F, -0.4363F);
        GohanSSJ30.cubeList.add(new ModelBox(GohanSSJ30, 116, 51, 1.8099F, -5.1257F, -3.0188F, 3, 9, 3, 0.0F));
        GohanSSJ30.cubeList.add(new ModelBox(GohanSSJ30, 116, 51, 4.7099F, -6.1257F, -3.0188F, 3, 10, 3, 0.0F));

        GohanSSJ31 = new ModelRenderer(this);
        GohanSSJ31.setRotationPoint(-1.0F, -10.1F, 3.6F);
        GohanSSJ4.addChild(GohanSSJ31);
        setRotationAngle(GohanSSJ31, -0.3488F, -0.0149F, 0.0289F);
        GohanSSJ31.cubeList.add(new ModelBox(GohanSSJ31, 107, 50, 1.8099F, -4.0417F, -5.0982F, 3, 7, 4, 0.0F));

        GohanSSJ32 = new ModelRenderer(this);
        GohanSSJ32.setRotationPoint(-3.0F, -8.1F, 1.6F);
        GohanSSJ4.addChild(GohanSSJ32);
        setRotationAngle(GohanSSJ32, 2.7925F, -0.0873F, -0.349F);
        GohanSSJ32.cubeList.add(new ModelBox(GohanSSJ32, 108, 52, -1.9972F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

        GohanSSJ33 = new ModelRenderer(this);
        GohanSSJ33.setRotationPoint(3.0F, -8.1F, 1.6F);
        GohanSSJ4.addChild(GohanSSJ33);
        setRotationAngle(GohanSSJ33, 2.7925F, 0.0873F, 0.349F);
        GohanSSJ33.cubeList.add(new ModelBox(GohanSSJ33, 108, 52, -1.0028F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

        GohanSSJ34 = new ModelRenderer(this);
        GohanSSJ34.setRotationPoint(-0.7F, -4.3F, 0.9F);
        GohanSSJ4.addChild(GohanSSJ34);
        setRotationAngle(GohanSSJ34, 2.8798F, 0.0873F, 0.0F);
        GohanSSJ34.cubeList.add(new ModelBox(GohanSSJ34, 106, 50, 0.9972F, -2.3391F, -4.0809F, 3, 10, 3, 0.0F));

        GohanSSJ35 = new ModelRenderer(this);
        GohanSSJ35.setRotationPoint(-3.5F, -6.7F, 1.2F);
        GohanSSJ4.addChild(GohanSSJ35);
        setRotationAngle(GohanSSJ35, 2.9671F, 0.0175F, 0.0524F);
        GohanSSJ35.cubeList.add(new ModelBox(GohanSSJ35, 112, 50, 0.9972F, -4.6289F, -4.1585F, 3, 10, 3, 0.0F));

        GohanSSJ36 = new ModelRenderer(this);
        GohanSSJ36.setRotationPoint(-0.0964F, -6.5F, -3.7536F);
        GohanSSJ4.addChild(GohanSSJ36);
        setRotationAngle(GohanSSJ36, 1.1938F, 0.9183F, 0.327F);


        GohanSSJ37 = new ModelRenderer(this);
        GohanSSJ37.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
        GohanSSJ36.addChild(GohanSSJ37);
        setRotationAngle(GohanSSJ37, 0.5542F, -0.24F, 0.1054F);
        GohanSSJ37.cubeList.add(new ModelBox(GohanSSJ37, 113, 53, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

        GohanSSJ38 = new ModelRenderer(this);
        GohanSSJ38.setRotationPoint(-0.3036F, -1.9F, 0.2536F);
        GohanSSJ36.addChild(GohanSSJ38);
        setRotationAngle(GohanSSJ38, 0.0175F, 0.0F, 0.0F);


        GohanSSJ39 = new ModelRenderer(this);
        GohanSSJ39.setRotationPoint(0.8F, 0.295F, -3.25F);
        GohanSSJ38.addChild(GohanSSJ39);
        setRotationAngle(GohanSSJ39, 2.4391F, -0.24F, 0.1054F);


        GohanSSJ40 = new ModelRenderer(this);
        GohanSSJ40.setRotationPoint(-0.09F, 0.555F, -0.1F);
        GohanSSJ39.addChild(GohanSSJ40);
        setRotationAngle(GohanSSJ40, -0.4189F, 0.0F, 0.0F);
        GohanSSJ40.cubeList.add(new ModelBox(GohanSSJ40, 113, 53, -1.0F, -2.1F, -1.0F, 2, 3, 2, -0.6F));

        GohanSSJ41 = new ModelRenderer(this);
        GohanSSJ41.setRotationPoint(0.7F, -0.105F, -2.45F);
        GohanSSJ38.addChild(GohanSSJ41);
        setRotationAngle(GohanSSJ41, 2.0988F, -0.24F, 0.1054F);


        GohanSSJ42 = new ModelRenderer(this);
        GohanSSJ42.setRotationPoint(-0.13F, 0.3293F, -0.0298F);
        GohanSSJ41.addChild(GohanSSJ42);
        setRotationAngle(GohanSSJ42, -0.2443F, 0.0F, 0.0F);
        GohanSSJ42.cubeList.add(new ModelBox(GohanSSJ42, 113, 53, -1.0F, -1.0F, -0.9542F, 2, 2, 2, -0.52F));

        GohanSSJ43 = new ModelRenderer(this);
        GohanSSJ43.setRotationPoint(0.5F, -0.405F, -1.45F);
        GohanSSJ38.addChild(GohanSSJ43);
        setRotationAngle(GohanSSJ43, 1.7323F, -0.24F, 0.1054F);


        GohanSSJ44 = new ModelRenderer(this);
        GohanSSJ44.setRotationPoint(-0.14F, 0.116F, 0.02F);
        GohanSSJ43.addChild(GohanSSJ44);
        setRotationAngle(GohanSSJ44, -0.0873F, 0.0F, 0.0F);
        GohanSSJ44.cubeList.add(new ModelBox(GohanSSJ44, 113, 53, -1.0F, -1.0F, -0.988F, 2, 2, 2, -0.51F));

        GohanSSJ45 = new ModelRenderer(this);
        GohanSSJ45.setRotationPoint(0.2F, -0.505F, -0.65F);
        GohanSSJ38.addChild(GohanSSJ45);
        setRotationAngle(GohanSSJ45, 1.3309F, -0.24F, 0.1054F);
        GohanSSJ45.cubeList.add(new ModelBox(GohanSSJ45, 113, 53, -1.03F, -0.9F, -1.075F, 2, 2, 2, -0.5F));

        GohanSSJ46 = new ModelRenderer(this);
        GohanSSJ46.setRotationPoint(0.0F, -0.105F, -0.15F);
        GohanSSJ38.addChild(GohanSSJ46);
        setRotationAngle(GohanSSJ46, 0.5542F, -0.24F, 0.1054F);
        GohanSSJ46.cubeList.add(new ModelBox(GohanSSJ46, 113, 53, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.5F));

        GohanSSJ47 = new ModelRenderer(this);
        GohanSSJ47.setRotationPoint(-3.0F, -8.1F, 2.1F);
        GohanSSJ4.addChild(GohanSSJ47);
        setRotationAngle(GohanSSJ47, 2.7925F, -0.0873F, -0.5236F);
        GohanSSJ47.cubeList.add(new ModelBox(GohanSSJ47, 116, 54, -2.9972F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        GohanSSJ48 = new ModelRenderer(this);
        GohanSSJ48.setRotationPoint(3.0F, -8.1F, 2.1F);
        GohanSSJ4.addChild(GohanSSJ48);
        setRotationAngle(GohanSSJ48, 2.7925F, 0.0873F, 0.5236F);
        GohanSSJ48.cubeList.add(new ModelBox(GohanSSJ48, 116, 49, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

        FroB = new ModelRenderer(this);
        FroB.setRotationPoint(0.0F, 10.0F, 2.0F);


        ftailS1 = new ModelRenderer(this);
        ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
        FroB.addChild(ftailS1);
        ftailS1.cubeList.add(new ModelBox(ftailS1, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

        ftailS2 = new ModelRenderer(this);
        ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS1.addChild(ftailS2);
        ftailS2.cubeList.add(new ModelBox(ftailS2, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

        ftailS3 = new ModelRenderer(this);
        ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS2.addChild(ftailS3);
        ftailS3.cubeList.add(new ModelBox(ftailS3, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

        ftailS4 = new ModelRenderer(this);
        ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS3.addChild(ftailS4);
        ftailS4.cubeList.add(new ModelBox(ftailS4, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

        ftailS5 = new ModelRenderer(this);
        ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS4.addChild(ftailS5);
        ftailS5.cubeList.add(new ModelBox(ftailS5, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

        ftailS6 = new ModelRenderer(this);
        ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
        ftailS5.addChild(ftailS6);
        ftailS6.cubeList.add(new ModelBox(ftailS6, 110, 0, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.2F, -2.4F, 0.2F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(4.8F, -2.4F, 0.2F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 32, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(1.8F, 6.6F, 0.2F);
        bipedLeftLeg.mirror = true;
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.0399999618530273 + 5.5 / (1.0 + Math.pow(scale / 0.45F, 1.8799999952316284))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        bipedBody.render(scaleFactor);
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
