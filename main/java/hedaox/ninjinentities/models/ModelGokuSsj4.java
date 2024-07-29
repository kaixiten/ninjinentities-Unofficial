package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGokuSsj4 extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Head;
	private final ModelRenderer SSJ4;
	private final ModelRenderer Hair1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Hair2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Hair3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer Hair4;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer Hair5;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer Hair6;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer Hair7;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer Hair8;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer Hair10;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer Hair11;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer Hair12;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer Hair13;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer Hair14;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer Hair16;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer Hair17;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer Hair18;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer Hair19;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer Hair20;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer Hair21;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer Hair22;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer Hair23;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer Hair24;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer Hair25;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer Hair26;
	private final ModelRenderer Hair27;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer Hair28;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer Hair29;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer Hair15;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer Hair30;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer Hair31;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r102;
	private final ModelRenderer Hair32;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r106;
	private final ModelRenderer Hair33;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer Hair34;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer Hair35;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r119;
	private final ModelRenderer Hair36;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer Hair37;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer Hair38;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer Hair39;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer Hair40;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer Hair41;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer Hair42;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer Hair43;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer Hair44;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer Hair45;
	private final ModelRenderer cube_r149;
	private final ModelRenderer cube_r150;
	private final ModelRenderer cube_r151;
	private final ModelRenderer Hair46;
	private final ModelRenderer cube_r152;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer Hair47;
	private final ModelRenderer cube_r155;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer Hair48;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;
	private final ModelRenderer Hair49;
	private final ModelRenderer cube_r161;
	private final ModelRenderer cube_r162;
	private final ModelRenderer cube_r163;
	private final ModelRenderer cube_r164;
	private final ModelRenderer Hair50;
	private final ModelRenderer cube_r165;
	private final ModelRenderer cube_r166;
	private final ModelRenderer cube_r167;
	private final ModelRenderer cube_r168;
	private final ModelRenderer Hair51;
	private final ModelRenderer cube_r169;
	private final ModelRenderer cube_r170;
	private final ModelRenderer cube_r171;
	private final ModelRenderer Hair52;
	private final ModelRenderer cube_r172;
	private final ModelRenderer cube_r172_r1;
	private final ModelRenderer cube_r173;
	private final ModelRenderer Hair53;
	private final ModelRenderer cube_r174;
	private final ModelRenderer cube_r174_r1;
	private final ModelRenderer cube_r175;
	private final ModelRenderer Hair54;
	private final ModelRenderer cube_r176;
	private final ModelRenderer cube_r177;
	private final ModelRenderer Hair55;
	private final ModelRenderer cube_r178;
	private final ModelRenderer cube_r178_r1;
	private final ModelRenderer cube_r178_r2;
	private final ModelRenderer cube_r179;
	private final ModelRenderer Hair56;
	private final ModelRenderer cube_r180;
	private final ModelRenderer cube_r181;
	private final ModelRenderer Hair9;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer Hair57;
	private final ModelRenderer cube_r182;
	private final ModelRenderer cube_r183;
	private final ModelRenderer Hair58;
	private final ModelRenderer cube_r184;
	private final ModelRenderer cube_r185;
	private final ModelRenderer cube_r186;
	private final ModelRenderer cube_r187;
	private final ModelRenderer Hair59;
	private final ModelRenderer cube_r188;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer Hair60;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;
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

	public ModelGokuSsj4(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.1F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.1F));

		SSJ4 = new ModelRenderer(this);
		SSJ4.setRotationPoint(-1.0F, -6.2F, -4.0F);
		Head.addChild(SSJ4);


		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SSJ4.addChild(Hair1);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.9172F, -0.9908F, -3.6974F);
		Hair1.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.7601F, 0.5562F, 0.2819F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 1, -1.0F, -2.2092F, -1.5026F, 2, 3, 2, -0.1F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0087F, -2.5822F, -1.5532F);
		Hair1.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.6427F, 0.5478F, 0.3134F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9216F, 0.5621F, 0.3511F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(2.0F, 0.0F, 0.0F);
		SSJ4.addChild(Hair2);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.6714F, -0.7419F, -2.3177F);
		Hair2.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.7624F, 0.5576F, 0.2788F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 1, -1.5286F, -2.3581F, -0.3823F, 2, 3, 2, -0.1F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0385F, -2.0894F, -1.2631F);
		Hair2.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.7376F, 0.5634F, 0.1615F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 1, -1.1215F, -2.1106F, -1.4369F, 2, 3, 2, -0.1F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5605F, -0.8174F, 0.0875F);
		Hair2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7976F, 0.5013F, 0.1984F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 0, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.1F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
		SSJ4.addChild(Hair3);


		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.3155F, -0.8548F, -2.0055F);
		Hair3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7835F, 0.3305F, 0.2912F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 1, -1.0F, -1.0F, -1.8945F, 2, 2, 3, -0.1F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair3.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3372F, 0.2285F, 0.247F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 1, -1.0F, -1.4F, -2.0F, 2, 2, 3, -0.1F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		SSJ4.addChild(Hair4);


		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.0F, -1.0F, 0.0F);
		Hair4.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.0103F, -0.4396F, -0.2615F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 3, -1.1F, -1.0F, -2.8F, 2, 2, 3, -0.1F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.0F, -1.0F, 0.0F);
		Hair4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0525F, -0.6389F, -0.2728F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 4, -0.5F, -0.9F, -1.0F, 2, 2, 2, -0.1F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-2.7F, 0.0F, 2.5F);
		SSJ4.addChild(Hair5);
		setRotationAngle(Hair5, 0.4375F, -0.0025F, -0.1061F);


		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0356F, 0.7844F, -0.7787F);
		Hair5.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.5874F, -0.0387F, -2.6612F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 1, -1.3F, -1.4837F, -2.175F, 2, 2, 3, -0.1F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.271F, -0.6993F, -0.2234F);
		Hair5.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1074F, -0.0387F, -2.6612F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(3.0F, -3.0F, 0.0F);
		SSJ4.addChild(Hair6);
		setRotationAngle(Hair6, -0.3007F, 0.3278F, -2.0016F);


		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.7356F, 0.4837F, 0.175F);
		Hair6.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.5874F, -0.0387F, -2.6612F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 1, -1.0F, -1.2837F, -2.175F, 2, 2, 3, -0.1F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.971F, -1.0F, 0.7303F);
		Hair6.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1074F, -0.0387F, -2.6612F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 2, -1.429F, -2.5F, -1.0F, 2, 3, 2, -0.1F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(5.3183F, 4.5644F, 6.2741F);
		SSJ4.addChild(Hair7);
		setRotationAngle(Hair7, 0.0F, 0.0873F, 0.0F);


		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.6817F, 1.4356F, 1.7259F);
		Hair7.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.3886F, 0.1231F, -0.124F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 2, -1.2F, -0.6566F, -1.0F, 2, 3, 2, -0.1F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair7.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.0832F, 0.1231F, -0.124F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair7.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.5159F, 0.1231F, -0.124F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair7.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.2541F, 0.1231F, -0.124F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 2, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(-1.6817F, 1.5644F, 3.2741F);
		SSJ4.addChild(Hair8);
		setRotationAngle(Hair8, 0.0F, 0.0F, 0.4363F);


		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.3547F, 1.581F, 2.7259F);
		Hair8.addChild(cube_r19);
		setRotationAngle(cube_r19, 1.0598F, 0.3148F, -0.2309F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 3, -2.6F, -0.9F, -1.3F, 2, 3, 2, -0.1F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.3547F, 4.581F, 4.7259F);
		Hair8.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.345F, 0.1231F, -0.124F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 3, -1.7F, -0.9F, -1.3F, 2, 3, 2, -0.1F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.3547F, 3.581F, 2.7259F);
		Hair8.addChild(cube_r21);
		setRotationAngle(cube_r21, 1.0832F, 0.1231F, -0.124F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 3, -2.1F, -0.9F, -1.3F, 2, 3, 2, -0.1F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.3547F, 2.581F, 1.7259F);
		Hair8.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.5159F, 0.1231F, -0.124F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 3, -2.3F, -1.6F, -1.3F, 2, 3, 2, -0.1F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.3547F, -0.419F, 0.7259F);
		Hair8.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.2541F, 0.1231F, -0.124F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 3, -2.7F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(4.8404F, 2.575F, 4.1614F);
		SSJ4.addChild(Hair10);
		setRotationAngle(Hair10, 1.8867F, -0.2393F, -0.3162F);


		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair10.addChild(cube_r27);
		setRotationAngle(cube_r27, 1.0832F, 0.1231F, -0.124F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 2, -1.3F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair10.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.5159F, 0.1231F, -0.124F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 2, -1.5F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair10.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.2541F, 0.1231F, -0.124F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 2, -1.9F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(5.3183F, 0.5644F, 4.2741F);
		SSJ4.addChild(Hair11);
		setRotationAngle(Hair11, 0.2347F, -0.8219F, 2.694F);


		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.7334F, 3.6312F, 1.6716F);
		Hair11.addChild(cube_r30);
		setRotationAngle(cube_r30, 1.0832F, 0.1231F, -0.124F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 2, -1.4F, -0.9F, -1.1F, 2, 2, 2, -0.1F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.7334F, 2.6312F, 0.6716F);
		Hair11.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.5159F, 0.1231F, -0.124F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.7334F, -0.3688F, -0.3284F);
		Hair11.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2541F, 0.1231F, -0.124F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 34, 2, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair12 = new ModelRenderer(this);
		Hair12.setRotationPoint(5.3183F, 1.5644F, 5.2741F);
		SSJ4.addChild(Hair12);
		setRotationAngle(Hair12, 0.1966F, -0.4407F, 2.9229F);


		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.6817F, 1.4356F, 1.7259F);
		Hair12.addChild(cube_r33);
		setRotationAngle(cube_r33, 1.8249F, 0.1231F, -0.124F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 34, 2, -1.5F, -0.9F, -1.0F, 2, 3, 2, -0.1F));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair12.addChild(cube_r34);
		setRotationAngle(cube_r34, 1.0832F, 0.1231F, -0.124F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 2, -1.9F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(4.3183F, 3.5644F, 7.2741F);
		SSJ4.addChild(Hair13);
		setRotationAngle(Hair13, -3.0837F, 0.4202F, -0.162F);


		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair13.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.0077F, 0.1231F, -0.124F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair13.addChild(cube_r36);
		setRotationAngle(cube_r36, 1.0832F, 0.1231F, -0.124F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair13.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.5159F, 0.1231F, -0.124F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair13.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.2541F, 0.1231F, -0.124F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(-2.6817F, 3.5644F, 7.2741F);
		SSJ4.addChild(Hair14);
		setRotationAngle(Hair14, 2.9832F, -0.3089F, -0.0472F);


		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair14.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.0077F, 0.1231F, -0.124F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair14.addChild(cube_r40);
		setRotationAngle(cube_r40, 1.0832F, 0.1231F, -0.124F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair14.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.5159F, 0.1231F, -0.124F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair14.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.2541F, 0.1231F, -0.124F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair16 = new ModelRenderer(this);
		Hair16.setRotationPoint(3.3183F, 2.5644F, 9.2741F);
		SSJ4.addChild(Hair16);
		setRotationAngle(Hair16, 3.0729F, 0.1951F, -0.1953F);


		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair16.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.0077F, 0.1231F, -0.124F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair16.addChild(cube_r44);
		setRotationAngle(cube_r44, 1.0832F, 0.1231F, -0.124F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair16.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.5159F, 0.1231F, -0.124F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair16.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.2541F, 0.1231F, -0.124F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair17 = new ModelRenderer(this);
		Hair17.setRotationPoint(5.3183F, -0.4356F, 6.2741F);
		SSJ4.addChild(Hair17);
		setRotationAngle(Hair17, 0.2347F, -0.8219F, 2.694F);


		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.7334F, 3.6312F, 1.6716F);
		Hair17.addChild(cube_r47);
		setRotationAngle(cube_r47, 1.0832F, 0.1231F, -0.124F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 34, 2, -1.4F, -0.9F, -1.1F, 2, 2, 2, -0.1F));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.7334F, 2.6312F, 0.6716F);
		Hair17.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.5159F, 0.1231F, -0.124F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.7334F, -0.3688F, -0.3284F);
		Hair17.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.2541F, 0.1231F, -0.124F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 2, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair18 = new ModelRenderer(this);
		Hair18.setRotationPoint(4.3183F, 0.5644F, 7.2741F);
		SSJ4.addChild(Hair18);
		setRotationAngle(Hair18, 1.4346F, -1.3078F, 1.2072F);


		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.6817F, 1.4356F, 1.7259F);
		Hair18.addChild(cube_r50);
		setRotationAngle(cube_r50, 1.8249F, 0.1231F, -0.124F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 34, 2, -1.5F, -0.9F, -1.0F, 2, 3, 2, -0.1F));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair18.addChild(cube_r51);
		setRotationAngle(cube_r51, 1.0832F, 0.1231F, -0.124F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 34, 2, -1.9F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		Hair19 = new ModelRenderer(this);
		Hair19.setRotationPoint(2.3183F, 1.5644F, 9.2741F);
		SSJ4.addChild(Hair19);
		setRotationAngle(Hair19, -3.008F, 0.0804F, -0.0471F);


		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair19.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.0077F, 0.1231F, -0.124F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair19.addChild(cube_r53);
		setRotationAngle(cube_r53, 1.0832F, 0.1231F, -0.124F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair19.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.5159F, 0.1231F, -0.124F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair19.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.2541F, 0.1231F, -0.124F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair20 = new ModelRenderer(this);
		Hair20.setRotationPoint(3.3183F, -0.4356F, 7.2741F);
		SSJ4.addChild(Hair20);
		setRotationAngle(Hair20, -2.6286F, -0.0984F, 0.1954F);


		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair20.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.0077F, 0.1231F, -0.124F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair20.addChild(cube_r57);
		setRotationAngle(cube_r57, 1.0832F, 0.1231F, -0.124F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair20.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.5159F, 0.1231F, -0.124F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair20.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.2541F, 0.1231F, -0.124F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair21 = new ModelRenderer(this);
		Hair21.setRotationPoint(1.3183F, -0.4356F, 7.2741F);
		SSJ4.addChild(Hair21);
		setRotationAngle(Hair21, -2.9208F, 0.0804F, -0.0471F);


		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
		Hair21.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.0077F, 0.1231F, -0.124F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-0.6622F, -3.8717F, -1.0745F);
		Hair21.addChild(cube_r61);
		setRotationAngle(cube_r61, 1.0832F, 0.1231F, -0.124F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-0.6622F, -4.8717F, -2.0745F);
		Hair21.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.5159F, 0.1231F, -0.124F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
		Hair21.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.2541F, 0.1231F, -0.124F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair22 = new ModelRenderer(this);
		Hair22.setRotationPoint(2.3183F, -1.4356F, 8.2741F);
		SSJ4.addChild(Hair22);
		setRotationAngle(Hair22, -2.8035F, 0.0397F, 0.1085F);


		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
		Hair22.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.2105F, 0.1231F, -0.124F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 34, 2, -2.1544F, -3.3148F, -1.0949F, 2, 3, 2, -0.1F));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.1104F, -0.4002F, 0.5208F);
		Hair22.addChild(cube_r65);
		setRotationAngle(cube_r65, 1.0832F, 0.1231F, -0.124F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 34, 2, -1.4F, -0.9F, -0.7949F, 2, 3, 2, -0.1F));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.1104F, -1.4002F, -0.4792F);
		Hair22.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.5159F, 0.1231F, -0.124F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 34, 2, -1.6F, -1.9F, -0.7949F, 2, 3, 2, -0.1F));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
		Hair22.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.2541F, 0.1231F, -0.124F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 34, 2, -2.1F, -0.8F, -0.9949F, 2, 3, 2, -0.1F));

		Hair23 = new ModelRenderer(this);
		Hair23.setRotationPoint(-0.6817F, 0.5644F, 7.2741F);
		SSJ4.addChild(Hair23);
		setRotationAngle(Hair23, -2.7223F, 0.0144F, -0.0266F);


		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.6817F, -8.5644F, -2.2741F);
		Hair23.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.1822F, 0.1231F, -0.124F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 34, 2, -2.75F, -3.5F, -1.76F, 2, 3, 2, -0.1F));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.6817F, -6.5644F, -2.2741F);
		Hair23.addChild(cube_r69);
		setRotationAngle(cube_r69, -0.0077F, 0.1231F, -0.124F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 34, 2, -2.5F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair23.addChild(cube_r70);
		setRotationAngle(cube_r70, -0.0077F, 0.1231F, -0.124F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair23.addChild(cube_r71);
		setRotationAngle(cube_r71, 1.0832F, 0.1231F, -0.124F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair23.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.5159F, 0.1231F, -0.124F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair23.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.2541F, 0.1231F, -0.124F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair24 = new ModelRenderer(this);
		Hair24.setRotationPoint(-2.6817F, -0.4356F, 8.2741F);
		SSJ4.addChild(Hair24);
		setRotationAngle(Hair24, -2.8446F, -0.736F, -0.4957F);


		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair24.addChild(cube_r74);
		setRotationAngle(cube_r74, -0.0077F, 0.1231F, -0.124F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.5479F, -0.5108F, 0.0197F);
		Hair24.addChild(cube_r75);
		setRotationAngle(cube_r75, 1.0832F, 0.1231F, -0.124F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
		Hair24.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.5159F, 0.1231F, -0.124F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair24.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.2541F, 0.1231F, -0.124F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair25 = new ModelRenderer(this);
		Hair25.setRotationPoint(-2.6817F, 0.5644F, 9.2741F);
		SSJ4.addChild(Hair25);
		setRotationAngle(Hair25, -2.8818F, -0.0214F, -0.231F);


		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair25.addChild(cube_r78);
		setRotationAngle(cube_r78, -0.0077F, 0.1231F, -0.124F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.5479F, -0.5108F, 0.0197F);
		Hair25.addChild(cube_r79);
		setRotationAngle(cube_r79, 1.0832F, 0.1231F, -0.124F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
		Hair25.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.5159F, 0.1231F, -0.124F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair25.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.2541F, 0.1231F, -0.124F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair26 = new ModelRenderer(this);
		Hair26.setRotationPoint(0.0F, 4.0F, -2.0F);
		SSJ4.addChild(Hair26);


		Hair27 = new ModelRenderer(this);
		Hair27.setRotationPoint(4.3183F, 3.5644F, 7.2741F);
		Hair26.addChild(Hair27);
		setRotationAngle(Hair27, 3.1155F, 0.1767F, -0.2045F);


		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair27.addChild(cube_r82);
		setRotationAngle(cube_r82, -0.0077F, 0.1231F, -0.124F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair27.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.5159F, 0.1231F, -0.124F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair27.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.2541F, 0.1231F, -0.124F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair28 = new ModelRenderer(this);
		Hair28.setRotationPoint(-2.6817F, 3.5644F, 7.2741F);
		Hair26.addChild(Hair28);
		setRotationAngle(Hair28, -3.1262F, -0.0035F, -0.0423F);


		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair28.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.0077F, 0.1231F, -0.124F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair28.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.5159F, 0.1231F, -0.124F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair28.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.2541F, 0.1231F, -0.124F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair29 = new ModelRenderer(this);
		Hair29.setRotationPoint(-1.6817F, 2.5644F, 8.2741F);
		Hair26.addChild(Hair29);
		setRotationAngle(Hair29, -2.7997F, -0.2934F, -0.1402F);


		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair29.addChild(cube_r88);
		setRotationAngle(cube_r88, -0.0077F, 0.1231F, -0.124F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair29.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.5159F, 0.1231F, -0.124F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair29.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.2541F, 0.1231F, -0.124F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair15 = new ModelRenderer(this);
		Hair15.setRotationPoint(3.3183F, 2.5644F, 9.2741F);
		Hair26.addChild(Hair15);
		setRotationAngle(Hair15, -3.123F, 0.1951F, -0.1953F);


		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair15.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.0077F, 0.1231F, -0.124F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair15.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.5159F, 0.1231F, -0.124F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair15.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.2541F, 0.1231F, -0.124F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair30 = new ModelRenderer(this);
		Hair30.setRotationPoint(2.3183F, 1.5644F, 9.2741F);
		Hair26.addChild(Hair30);
		setRotationAngle(Hair30, -2.9644F, 0.0804F, -0.0471F);


		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair30.addChild(cube_r95);
		setRotationAngle(cube_r95, -0.0077F, 0.1231F, -0.124F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair30.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.5159F, 0.1231F, -0.124F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair30.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.2541F, 0.1231F, -0.124F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair31 = new ModelRenderer(this);
		Hair31.setRotationPoint(3.3183F, -0.4356F, 7.2741F);
		Hair26.addChild(Hair31);
		setRotationAngle(Hair31, -2.6286F, -0.0984F, 0.1954F);


		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair31.addChild(cube_r99);
		setRotationAngle(cube_r99, -0.0077F, 0.1231F, -0.124F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair31.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.2541F, 0.1231F, -0.124F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair32 = new ModelRenderer(this);
		Hair32.setRotationPoint(2.3183F, -1.4356F, 8.2741F);
		Hair26.addChild(Hair32);
		setRotationAngle(Hair32, -2.8035F, 0.0397F, 0.1085F);


		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
		Hair32.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.2105F, 0.1231F, -0.124F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 34, 2, -2.1544F, -3.3148F, -1.0949F, 2, 3, 2, -0.1F));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.1104F, -4.4002F, -1.4792F);
		Hair32.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.2541F, 0.1231F, -0.124F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 34, 2, -2.1F, -0.8F, -0.9949F, 2, 3, 2, -0.1F));

		Hair33 = new ModelRenderer(this);
		Hair33.setRotationPoint(1.3183F, -0.4356F, 7.2741F);
		Hair26.addChild(Hair33);
		setRotationAngle(Hair33, -2.9208F, 0.0804F, -0.0471F);


		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
		Hair33.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.0077F, 0.1231F, -0.124F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.6622F, -4.8717F, -2.0745F);
		Hair33.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.5159F, 0.1231F, -0.124F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(-0.6622F, -7.8717F, -3.0745F);
		Hair33.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.2541F, 0.1231F, -0.124F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair34 = new ModelRenderer(this);
		Hair34.setRotationPoint(-2.6817F, 0.5644F, 9.2741F);
		Hair26.addChild(Hair34);
		setRotationAngle(Hair34, -2.925F, -0.0083F, -0.273F);


		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair34.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.0077F, 0.1231F, -0.124F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.5479F, -0.5108F, 0.0197F);
		Hair34.addChild(cube_r111);
		setRotationAngle(cube_r111, 1.0832F, 0.1231F, -0.124F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
		Hair34.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.5159F, 0.1231F, -0.124F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair34.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.2541F, 0.1231F, -0.124F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair35 = new ModelRenderer(this);
		Hair35.setRotationPoint(-0.6817F, 0.5644F, 7.2741F);
		Hair26.addChild(Hair35);
		setRotationAngle(Hair35, -2.7223F, 0.0144F, -0.0266F);


		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(0.6817F, -8.5644F, -2.2741F);
		Hair35.addChild(cube_r114);
		setRotationAngle(cube_r114, -0.1822F, 0.1231F, -0.124F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 34, 2, -2.75F, -3.5F, -1.76F, 2, 3, 2, -0.1F));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(0.6817F, -6.5644F, -2.2741F);
		Hair35.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.0077F, 0.1231F, -0.124F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 34, 2, -2.5F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair35.addChild(cube_r116);
		setRotationAngle(cube_r116, -0.0077F, 0.1231F, -0.124F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair35.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.2541F, 0.1231F, -0.124F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair36 = new ModelRenderer(this);
		Hair36.setRotationPoint(-2.6817F, -0.4356F, 8.2741F);
		Hair26.addChild(Hair36);
		setRotationAngle(Hair36, -2.6804F, -0.3273F, -0.4262F);


		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair36.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.0077F, 0.1231F, -0.124F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 34, 2, -2.1544F, -3.3148F, -1.641F, 2, 3, 2, -0.1F));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.5479F, -1.5108F, -0.9803F);
		Hair36.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.5159F, 0.1231F, -0.124F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(0.5479F, -4.5108F, -1.9803F);
		Hair36.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.2541F, 0.1231F, -0.124F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 34, 2, -2.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair37 = new ModelRenderer(this);
		Hair37.setRotationPoint(3.3183F, -1.4356F, 6.2741F);
		SSJ4.addChild(Hair37);
		setRotationAngle(Hair37, 0.3194F, -0.2359F, 0.1494F);


		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair37.addChild(cube_r124);
		setRotationAngle(cube_r124, -0.0077F, 0.1231F, -0.124F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 34, 2, -2.1544F, -1.3148F, -1.3F, 2, 2, 2, -0.1F));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(0.6817F, 0.4356F, -0.2741F);
		Hair37.addChild(cube_r125);
		setRotationAngle(cube_r125, 1.0832F, 0.1231F, -0.124F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(0.6817F, -0.5644F, -1.2741F);
		Hair37.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.5159F, 0.1231F, -0.124F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.6817F, -3.5644F, -2.2741F);
		Hair37.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.2541F, 0.1231F, -0.124F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 34, 2, -2.1F, 0.2F, -1.5F, 2, 2, 2, -0.1F));

		Hair38 = new ModelRenderer(this);
		Hair38.setRotationPoint(3.561F, -2.8068F, 2.7186F);
		SSJ4.addChild(Hair38);
		setRotationAngle(Hair38, -0.2089F, 0.1542F, 0.286F);


		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-0.4156F, -1.9205F, -1.1368F);
		Hair38.addChild(cube_r128);
		setRotationAngle(cube_r128, -1.753F, 0.1231F, -0.124F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 34, 2, -1.0F, -1.2727F, -1.0F, 2, 2, 2, -0.1F));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(0.8387F, 2.2452F, 1.3553F);
		Hair38.addChild(cube_r129);
		setRotationAngle(cube_r129, 1.0832F, 0.1231F, -0.124F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 34, 2, -1.4F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(0.8387F, 1.2452F, 0.3553F);
		Hair38.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.5159F, 0.1231F, -0.124F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(0.8387F, -1.7548F, -0.6447F);
		Hair38.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.2541F, 0.1231F, -0.124F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 34, 2, -2.1F, 0.2F, -1.5F, 2, 2, 2, -0.1F));

		Hair39 = new ModelRenderer(this);
		Hair39.setRotationPoint(-0.6964F, -4.0606F, -0.703F);
		SSJ4.addChild(Hair39);
		setRotationAngle(Hair39, -0.8526F, -0.0679F, 0.2424F);


		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-0.7963F, 0.0437F, -1.3942F);
		Hair39.addChild(cube_r132);
		setRotationAngle(cube_r132, 2.1493F, 0.5562F, 0.2819F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 33, 1, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(1.1121F, -1.5477F, 0.75F);
		Hair39.addChild(cube_r133);
		setRotationAngle(cube_r133, 1.6427F, 0.5478F, 0.3134F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
		Hair39.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.9216F, 0.5621F, 0.3511F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair40 = new ModelRenderer(this);
		Hair40.setRotationPoint(1.3036F, -3.0606F, 2.297F);
		SSJ4.addChild(Hair40);
		setRotationAngle(Hair40, -0.8424F, -0.0054F, 0.5049F);


		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(-0.7963F, 0.0437F, -1.3942F);
		Hair40.addChild(cube_r135);
		setRotationAngle(cube_r135, 2.1493F, 0.5562F, 0.2819F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 33, 1, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(1.1121F, -1.5477F, 0.75F);
		Hair40.addChild(cube_r136);
		setRotationAngle(cube_r136, 1.6427F, 0.5478F, 0.3134F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
		Hair40.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.9216F, 0.5621F, 0.3511F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair41 = new ModelRenderer(this);
		Hair41.setRotationPoint(0.3036F, -1.0606F, 4.297F);
		SSJ4.addChild(Hair41);
		setRotationAngle(Hair41, -0.8873F, -0.2386F, 0.4278F);


		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-2.2263F, 0.0143F, -3.3828F);
		Hair41.addChild(cube_r138);
		setRotationAngle(cube_r138, 2.1493F, 0.5562F, 0.2819F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 33, 1, -1.0F, -3.0092F, -0.8026F, 2, 4, 2, -0.1F));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(-0.3178F, -1.5771F, -1.2386F);
		Hair41.addChild(cube_r139);
		setRotationAngle(cube_r139, 1.6427F, 0.5478F, 0.3134F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(-0.3091F, 1.0051F, 0.3146F);
		Hair41.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.9216F, 0.5621F, 0.3511F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair42 = new ModelRenderer(this);
		Hair42.setRotationPoint(-1.5426F, -0.1301F, 1.2965F);
		SSJ4.addChild(Hair42);
		setRotationAngle(Hair42, -1.1958F, -0.7726F, 0.3105F);


		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(-2.3728F, -1.0315F, -3.709F);
		Hair42.addChild(cube_r141);
		setRotationAngle(cube_r141, 1.8875F, 0.5562F, 0.2819F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 33, 1, -1.0F, -0.0092F, -0.8026F, 2, 2, 2, -0.1F));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-0.4644F, -2.6229F, -1.5648F);
		Hair42.addChild(cube_r142);
		setRotationAngle(cube_r142, 1.6427F, 0.5478F, 0.3134F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 33, 1, -1.0913F, -1.6178F, -2.3468F, 2, 2, 2, -0.1F));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-0.4557F, -0.0407F, -0.0116F);
		Hair42.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.9216F, 0.5621F, 0.3511F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair43 = new ModelRenderer(this);
		Hair43.setRotationPoint(2.3036F, -1.7606F, 1.297F);
		SSJ4.addChild(Hair43);
		setRotationAngle(Hair43, 0.3827F, 0.7943F, -0.3596F);


		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(1.1121F, -1.5477F, 0.75F);
		Hair43.addChild(cube_r144);
		setRotationAngle(cube_r144, 1.6427F, 0.5478F, 0.3134F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
		Hair43.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.9216F, 0.5621F, 0.3511F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair44 = new ModelRenderer(this);
		Hair44.setRotationPoint(4.9897F, -2.4241F, 0.7691F);
		SSJ4.addChild(Hair44);
		setRotationAngle(Hair44, -0.7313F, -0.455F, -0.5619F);


		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(1.0103F, 0.4241F, 0.2309F);
		Hair44.addChild(cube_r146);
		setRotationAngle(cube_r146, 1.4466F, -0.4396F, -0.2615F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 36, 4, -1.7F, -1.5F, -1.5F, 2, 2, 2, -0.1F));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0103F, -0.5759F, 0.2309F);
		Hair44.addChild(cube_r147);
		setRotationAngle(cube_r147, 1.0103F, -0.4396F, -0.2615F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 36, 4, -1.1F, -1.3F, -1.5F, 2, 2, 2, -0.1F));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(-0.9897F, -0.5759F, 0.2309F);
		Hair44.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0525F, -0.6389F, -0.2728F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 36, 4, -0.5F, -0.9F, -1.0F, 2, 2, 2, -0.1F));

		Hair45 = new ModelRenderer(this);
		Hair45.setRotationPoint(4.3183F, -1.4356F, 2.2741F);
		SSJ4.addChild(Hair45);
		setRotationAngle(Hair45, 2.9073F, 0.2829F, 0.1834F);


		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(0.7334F, 3.6312F, 1.6716F);
		Hair45.addChild(cube_r149);
		setRotationAngle(cube_r149, 1.0832F, 0.1231F, -0.124F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 34, 2, -1.4F, -0.9F, -1.1F, 2, 2, 2, -0.1F));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(0.7334F, 2.6312F, 0.6716F);
		Hair45.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.5159F, 0.1231F, -0.124F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 34, 2, -1.6F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(0.7334F, -0.3688F, -0.3284F);
		Hair45.addChild(cube_r151);
		setRotationAngle(cube_r151, 0.2541F, 0.1231F, -0.124F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 34, 2, -2.0F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair46 = new ModelRenderer(this);
		Hair46.setRotationPoint(1.3036F, -1.0606F, 6.297F);
		SSJ4.addChild(Hair46);
		setRotationAngle(Hair46, -0.46F, -0.2199F, 0.553F);


		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(-1.7745F, -1.7907F, -3.5571F);
		Hair46.addChild(cube_r152);
		setRotationAngle(cube_r152, 2.1493F, 0.5562F, 0.2819F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 33, 1, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(0.1339F, -3.3821F, -1.4129F);
		Hair46.addChild(cube_r153);
		setRotationAngle(cube_r153, 1.6427F, 0.5478F, 0.3134F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.1426F, -0.7999F, 0.1403F);
		Hair46.addChild(cube_r154);
		setRotationAngle(cube_r154, 0.9216F, 0.5621F, 0.3511F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair47 = new ModelRenderer(this);
		Hair47.setRotationPoint(2.3036F, -4.0606F, 7.297F);
		SSJ4.addChild(Hair47);
		setRotationAngle(Hair47, -0.8729F, -0.4088F, 0.1806F);


		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(-2.943F, 0.6147F, -1.1381F);
		Hair47.addChild(cube_r155);
		setRotationAngle(cube_r155, 2.1493F, 0.5562F, 0.2819F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 33, 1, -1.0F, -2.0092F, -0.8026F, 2, 3, 2, -0.1F));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(-1.0346F, -0.9767F, 1.0061F);
		Hair47.addChild(cube_r156);
		setRotationAngle(cube_r156, 1.6427F, 0.5478F, 0.3134F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 33, 1, -1.0913F, -2.6178F, -2.3468F, 2, 3, 2, -0.1F));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(-1.0259F, 1.6055F, 2.5593F);
		Hair47.addChild(cube_r157);
		setRotationAngle(cube_r157, 0.9216F, 0.5621F, 0.3511F);
		cube_r157.cubeList.add(new ModelBox(cube_r157, 32, 0, -1.1F, -2.3F, -0.8F, 2, 3, 2, -0.1F));

		Hair48 = new ModelRenderer(this);
		Hair48.setRotationPoint(-0.6964F, -4.0606F, 6.297F);
		SSJ4.addChild(Hair48);
		setRotationAngle(Hair48, -1.1127F, -0.292F, 0.2435F);


		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(-1.2523F, 0.2727F, -1.9962F);
		Hair48.addChild(cube_r158);
		setRotationAngle(cube_r158, 1.7566F, 0.5562F, 0.2819F);
		cube_r158.cubeList.add(new ModelBox(cube_r158, 33, 1, -1.0F, -1.5F, 0.2992F, 2, 3, 2, -0.1F));

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.0402F, -0.1886F, -0.0593F);
		Hair48.addChild(cube_r159);
		setRotationAngle(cube_r159, 1.3809F, 0.5478F, 0.3134F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 33, 1, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(1.1208F, 1.0345F, 2.3032F);
		Hair48.addChild(cube_r160);
		setRotationAngle(cube_r160, 0.9216F, 0.5621F, 0.3511F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 32, 0, -1.1F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

		Hair49 = new ModelRenderer(this);
		Hair49.setRotationPoint(-1.8367F, -4.2777F, 4.2945F);
		SSJ4.addChild(Hair49);
		setRotationAngle(Hair49, -0.8532F, 0.6174F, 0.2288F);


		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(-1.7726F, 1.2733F, -2.7716F);
		Hair49.addChild(cube_r161);
		setRotationAngle(cube_r161, 1.6257F, 0.5562F, 0.2819F);
		cube_r161.cubeList.add(new ModelBox(cube_r161, 33, 1, -1.2513F, -2.1121F, 1.4992F, 2, 3, 2, -0.1F));

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(-0.7726F, 1.2733F, -0.7716F);
		Hair49.addChild(cube_r162);
		setRotationAngle(cube_r162, 1.4075F, 0.5562F, 0.2819F);
		cube_r162.cubeList.add(new ModelBox(cube_r162, 33, 1, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

		cube_r163 = new ModelRenderer(this);
		cube_r163.setRotationPoint(0.5199F, 0.812F, 1.1653F);
		Hair49.addChild(cube_r163);
		setRotationAngle(cube_r163, 1.2064F, 0.5478F, 0.3134F);
		cube_r163.cubeList.add(new ModelBox(cube_r163, 33, 1, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

		cube_r164 = new ModelRenderer(this);
		cube_r164.setRotationPoint(1.6005F, 2.035F, 3.5278F);
		Hair49.addChild(cube_r164);
		setRotationAngle(cube_r164, 0.9216F, 0.5621F, 0.3511F);
		cube_r164.cubeList.add(new ModelBox(cube_r164, 32, 0, -1.1F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

		Hair50 = new ModelRenderer(this);
		Hair50.setRotationPoint(-3.5367F, -4.6777F, 5.2945F);
		SSJ4.addChild(Hair50);
		setRotationAngle(Hair50, -0.6309F, 0.7057F, 0.1852F);


		cube_r165 = new ModelRenderer(this);
		cube_r165.setRotationPoint(-1.7726F, 1.2733F, -2.7716F);
		Hair50.addChild(cube_r165);
		setRotationAngle(cube_r165, 1.6257F, 0.5562F, 0.2819F);
		cube_r165.cubeList.add(new ModelBox(cube_r165, 33, 1, -1.2513F, -2.1121F, 1.4992F, 2, 3, 2, -0.1F));

		cube_r166 = new ModelRenderer(this);
		cube_r166.setRotationPoint(-0.7726F, 1.2733F, -0.7716F);
		Hair50.addChild(cube_r166);
		setRotationAngle(cube_r166, 1.4075F, 0.5562F, 0.2819F);
		cube_r166.cubeList.add(new ModelBox(cube_r166, 33, 1, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

		cube_r167 = new ModelRenderer(this);
		cube_r167.setRotationPoint(0.5199F, 0.812F, 1.1653F);
		Hair50.addChild(cube_r167);
		setRotationAngle(cube_r167, 1.2064F, 0.5478F, 0.3134F);
		cube_r167.cubeList.add(new ModelBox(cube_r167, 33, 1, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

		cube_r168 = new ModelRenderer(this);
		cube_r168.setRotationPoint(1.6005F, 2.035F, 3.5278F);
		Hair50.addChild(cube_r168);
		setRotationAngle(cube_r168, 0.9216F, 0.5621F, 0.3511F);
		cube_r168.cubeList.add(new ModelBox(cube_r168, 32, 0, -1.1F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

		Hair51 = new ModelRenderer(this);
		Hair51.setRotationPoint(-3.7087F, -2.277F, 3.1786F);
		SSJ4.addChild(Hair51);
		setRotationAngle(Hair51, -1.1844F, -0.4824F, -0.2858F);


		cube_r169 = new ModelRenderer(this);
		cube_r169.setRotationPoint(-0.2539F, 1.3727F, -1.7743F);
		Hair51.addChild(cube_r169);
		setRotationAngle(cube_r169, 1.6257F, 0.5562F, 0.2819F);
		cube_r169.cubeList.add(new ModelBox(cube_r169, 33, 1, -0.9606F, -2.4581F, 1.7133F, 2, 3, 2, -0.1F));

		cube_r170 = new ModelRenderer(this);
		cube_r170.setRotationPoint(0.7461F, 1.3727F, 0.2257F);
		Hair51.addChild(cube_r170);
		setRotationAngle(cube_r170, 1.4075F, 0.5562F, 0.2819F);
		cube_r170.cubeList.add(new ModelBox(cube_r170, 33, 1, -0.7093F, -2.4581F, 1.1133F, 2, 3, 2, -0.1F));

		cube_r171 = new ModelRenderer(this);
		cube_r171.setRotationPoint(2.0386F, 0.9114F, 2.1626F);
		Hair51.addChild(cube_r171);
		setRotationAngle(cube_r171, 1.2064F, 0.5478F, 0.3134F);
		cube_r171.cubeList.add(new ModelBox(cube_r171, 33, 1, -0.7093F, -1.846F, -0.3236F, 2, 3, 2, -0.1F));

		Hair52 = new ModelRenderer(this);
		Hair52.setRotationPoint(-2.5616F, -2.1176F, 4.188F);
		SSJ4.addChild(Hair52);
		setRotationAngle(Hair52, 1.6782F, -1.0392F, 0.4671F);


		cube_r172 = new ModelRenderer(this);
		cube_r172.setRotationPoint(-0.274F, 0.0801F, -0.1493F);
		Hair52.addChild(cube_r172);
		setRotationAngle(cube_r172, -0.5874F, -0.0387F, -2.6612F);


		cube_r172_r1 = new ModelRenderer(this);
		cube_r172_r1.setRotationPoint(0.0F, 0.3163F, -0.275F);
		cube_r172.addChild(cube_r172_r1);
		setRotationAngle(cube_r172_r1, 0.3054F, 0.0F, 0.0F);
		cube_r172_r1.cubeList.add(new ModelBox(cube_r172_r1, 34, 1, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

		cube_r173 = new ModelRenderer(this);
		cube_r173.setRotationPoint(0.4907F, -1.4036F, 0.406F);
		Hair52.addChild(cube_r173);
		setRotationAngle(cube_r173, -0.1074F, -0.0387F, -2.6612F);
		cube_r173.cubeList.add(new ModelBox(cube_r173, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair53 = new ModelRenderer(this);
		Hair53.setRotationPoint(-3.8616F, -1.6176F, 5.188F);
		SSJ4.addChild(Hair53);
		setRotationAngle(Hair53, 2.3327F, -1.0392F, 0.4671F);


		cube_r174 = new ModelRenderer(this);
		cube_r174.setRotationPoint(-0.274F, 0.0801F, -0.1493F);
		Hair53.addChild(cube_r174);
		setRotationAngle(cube_r174, -0.5874F, -0.0387F, -2.6612F);


		cube_r174_r1 = new ModelRenderer(this);
		cube_r174_r1.setRotationPoint(-0.4F, 0.2163F, 0.325F);
		cube_r174.addChild(cube_r174_r1);
		setRotationAngle(cube_r174_r1, 0.3927F, 0.0F, 0.0F);
		cube_r174_r1.cubeList.add(new ModelBox(cube_r174_r1, 34, 1, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

		cube_r175 = new ModelRenderer(this);
		cube_r175.setRotationPoint(0.4907F, -1.4036F, 0.406F);
		Hair53.addChild(cube_r175);
		setRotationAngle(cube_r175, -0.1074F, -0.0387F, -2.6612F);
		cube_r175.cubeList.add(new ModelBox(cube_r175, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair54 = new ModelRenderer(this);
		Hair54.setRotationPoint(-4.4616F, -1.5176F, 5.188F);
		SSJ4.addChild(Hair54);
		setRotationAngle(Hair54, 1.6782F, -1.0392F, 0.4671F);


		cube_r176 = new ModelRenderer(this);
		cube_r176.setRotationPoint(0.726F, -1.9199F, -0.1493F);
		Hair54.addChild(cube_r176);
		setRotationAngle(cube_r176, -0.5874F, -0.0387F, -2.6612F);
		cube_r176.cubeList.add(new ModelBox(cube_r176, 34, 1, -1.0F, -1.4837F, -2.175F, 2, 2, 3, -0.1F));

		cube_r177 = new ModelRenderer(this);
		cube_r177.setRotationPoint(1.4907F, -3.4036F, 0.406F);
		Hair54.addChild(cube_r177);
		setRotationAngle(cube_r177, -0.1074F, -0.0387F, -2.6612F);
		cube_r177.cubeList.add(new ModelBox(cube_r177, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair55 = new ModelRenderer(this);
		Hair55.setRotationPoint(-4.5564F, -1.061F, 6.9119F);
		SSJ4.addChild(Hair55);
		setRotationAngle(Hair55, 2.016F, -1.2452F, 0.4519F);


		cube_r178 = new ModelRenderer(this);
		cube_r178.setRotationPoint(-0.274F, 0.0801F, -0.1493F);
		Hair55.addChild(cube_r178);
		setRotationAngle(cube_r178, -0.5874F, -0.0387F, -2.6612F);


		cube_r178_r1 = new ModelRenderer(this);
		cube_r178_r1.setRotationPoint(-0.3697F, -0.2191F, -1.2627F);
		cube_r178.addChild(cube_r178_r1);
		setRotationAngle(cube_r178_r1, 0.3491F, 0.0F, 0.0F);
		cube_r178_r1.cubeList.add(new ModelBox(cube_r178_r1, 35, 2, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.1F));

		cube_r178_r2 = new ModelRenderer(this);
		cube_r178_r2.setRotationPoint(-0.3697F, -0.2191F, -0.2627F);
		cube_r178.addChild(cube_r178_r2);
		setRotationAngle(cube_r178_r2, -0.0873F, 0.0F, 0.0F);
		cube_r178_r2.cubeList.add(new ModelBox(cube_r178_r2, 34, 1, -1.0F, -1.0F, -1.5F, 2, 2, 3, -0.1F));

		cube_r179 = new ModelRenderer(this);
		cube_r179.setRotationPoint(0.4907F, -1.4036F, 0.406F);
		Hair55.addChild(cube_r179);
		setRotationAngle(cube_r179, -0.1074F, -0.0387F, -2.6612F);
		cube_r179.cubeList.add(new ModelBox(cube_r179, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair56 = new ModelRenderer(this);
		Hair56.setRotationPoint(-3.9564F, -1.061F, 6.9119F);
		SSJ4.addChild(Hair56);
		setRotationAngle(Hair56, 1.8851F, -1.2452F, 0.4519F);


		cube_r180 = new ModelRenderer(this);
		cube_r180.setRotationPoint(-0.274F, -1.9199F, -1.1493F);
		Hair56.addChild(cube_r180);
		setRotationAngle(cube_r180, -0.5874F, -0.0387F, -2.6612F);
		cube_r180.cubeList.add(new ModelBox(cube_r180, 33, 0, -1.3697F, -1.2191F, -2.7627F, 2, 2, 4, -0.1F));

		cube_r181 = new ModelRenderer(this);
		cube_r181.setRotationPoint(0.4907F, -3.4036F, -0.594F);
		Hair56.addChild(cube_r181);
		setRotationAngle(cube_r181, -0.1074F, -0.0387F, -2.6612F);
		cube_r181.cubeList.add(new ModelBox(cube_r181, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(-2.8404F, 2.575F, 4.1614F);
		SSJ4.addChild(Hair9);
		setRotationAngle(Hair9, 1.92F, 0.2544F, 0.274F);


		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.6817F, 0.4356F, -0.2741F);
		Hair9.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.0832F, -0.1231F, 0.124F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 34, 2, -0.7F, -0.9F, -1.1F, 2, 3, 2, -0.1F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.6817F, -0.5644F, -1.2741F);
		Hair9.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.5159F, -0.1231F, 0.124F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 2, -0.5F, -1.9F, -1.2F, 2, 3, 2, -0.1F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.6817F, -3.5644F, -2.2741F);
		Hair9.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.2541F, -0.1231F, 0.124F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 2, -0.1F, -0.8F, -1.5F, 2, 3, 2, -0.1F));

		Hair57 = new ModelRenderer(this);
		Hair57.setRotationPoint(-2.7F, -1.0F, 2.9F);
		SSJ4.addChild(Hair57);
		setRotationAngle(Hair57, -0.3047F, -0.021F, -0.0666F);

		cube_r182 = new ModelRenderer(this);
		cube_r182.setRotationPoint(-1.0356F, 0.7844F, -0.7787F);
		Hair57.addChild(cube_r182);
		setRotationAngle(cube_r182, -0.5874F, -0.0387F, -2.6612F);
		cube_r182.cubeList.add(new ModelBox(cube_r182, 34, 1, -1.3F, -1.4837F, -2.175F, 2, 2, 3, -0.1F));

		cube_r183 = new ModelRenderer(this);
		cube_r183.setRotationPoint(-0.271F, -0.6993F, -0.2234F);
		Hair57.addChild(cube_r183);
		setRotationAngle(cube_r183, -0.1074F, -0.0387F, -2.6612F);
		cube_r183.cubeList.add(new ModelBox(cube_r183, 35, 2, -1.429F, -2.0F, -1.0F, 2, 3, 2, -0.1F));

		Hair58 = new ModelRenderer(this);
		Hair58.setRotationPoint(3.0367F, -2.0777F, 4.2945F);
		SSJ4.addChild(Hair58);
		setRotationAngle(Hair58, 1.8921F, -0.8072F, -2.6364F);


		cube_r184 = new ModelRenderer(this);
		cube_r184.setRotationPoint(2.6417F, 0.1985F, -4.2171F);
		Hair58.addChild(cube_r184);
		setRotationAngle(cube_r184, 1.6257F, -0.5562F, -0.2819F);
		cube_r184.cubeList.add(new ModelBox(cube_r184, 33, 1, -0.7487F, -2.1121F, 1.4992F, 2, 3, 2, -0.1F));

		cube_r185 = new ModelRenderer(this);
		cube_r185.setRotationPoint(1.6417F, 0.1985F, -2.2171F);
		Hair58.addChild(cube_r185);
		setRotationAngle(cube_r185, 1.4075F, -0.5562F, -0.2819F);
		cube_r185.cubeList.add(new ModelBox(cube_r185, 33, 1, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

		cube_r186 = new ModelRenderer(this);
		cube_r186.setRotationPoint(0.3492F, -0.2628F, -0.2802F);
		Hair58.addChild(cube_r186);
		setRotationAngle(cube_r186, 1.2064F, -0.5478F, -0.3134F);
		cube_r186.cubeList.add(new ModelBox(cube_r186, 33, 1, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

		cube_r187 = new ModelRenderer(this);
		cube_r187.setRotationPoint(-0.7314F, 0.9602F, 2.0823F);
		Hair58.addChild(cube_r187);
		setRotationAngle(cube_r187, 0.9216F, -0.5621F, -0.3511F);
		cube_r187.cubeList.add(new ModelBox(cube_r187, 32, 0, -0.9F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

		Hair59 = new ModelRenderer(this);
		Hair59.setRotationPoint(1.2367F, -1.8777F, 3.2945F);
		SSJ4.addChild(Hair59);
		setRotationAngle(Hair59, 1.8235F, -0.9323F, -2.5528F);


		cube_r188 = new ModelRenderer(this);
		cube_r188.setRotationPoint(2.6417F, 0.1985F, -4.2171F);
		Hair59.addChild(cube_r188);
		setRotationAngle(cube_r188, 1.6257F, -0.5562F, -0.2819F);
		cube_r188.cubeList.add(new ModelBox(cube_r188, 33, 1, -0.7487F, -1.9121F, 1.4992F, 2, 3, 2, -0.2F));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(1.6417F, 0.1985F, -2.2171F);
		Hair59.addChild(cube_r189);
		setRotationAngle(cube_r189, 1.4075F, -0.5562F, -0.2819F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 33, 1, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(0.3492F, -0.2628F, -0.2802F);
		Hair59.addChild(cube_r190);
		setRotationAngle(cube_r190, 1.2064F, -0.5478F, -0.3134F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 33, 1, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(-0.7314F, 0.9602F, 2.0823F);
		Hair59.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.9216F, -0.5621F, -0.3511F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 32, 0, -0.9F, -2.3F, -1.1002F, 2, 3, 2, -0.1F));

		Hair60 = new ModelRenderer(this);
		Hair60.setRotationPoint(3.4367F, -0.5777F, 5.1945F);
		SSJ4.addChild(Hair60);
		setRotationAngle(Hair60, 1.398F, -0.9224F, -2.2616F);


		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(2.6417F, 0.1985F, -4.2171F);
		Hair60.addChild(cube_r192);
		setRotationAngle(cube_r192, 1.6257F, -0.5562F, -0.2819F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 33, 1, -0.7487F, -1.9121F, 1.4992F, 2, 3, 2, -0.2F));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(1.6417F, 0.1985F, -2.2171F);
		Hair60.addChild(cube_r193);
		setRotationAngle(cube_r193, 1.4075F, -0.5562F, -0.2819F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 33, 1, -1.0F, -2.1121F, 0.8992F, 2, 3, 2, -0.1F));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(0.3492F, -0.2628F, -0.2802F);
		Hair60.addChild(cube_r194);
		setRotationAngle(cube_r194, 1.2064F, -0.5478F, -0.3134F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 33, 1, -1.0F, -1.5F, -0.5377F, 2, 3, 2, -0.1F));

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
		this.Head.rotateAngleY = p_78087_4_  / (180F / (float)Math.PI);
		this.Head.rotateAngleX = p_78087_5_  / (180F / (float)Math.PI);
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