package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGogeta extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer hair;
	private final ModelRenderer hair1;
	private final ModelRenderer hair2;
	private final ModelRenderer hair3;
	private final ModelRenderer hair4;
	private final ModelRenderer hair5;
	private final ModelRenderer hair6;
	private final ModelRenderer hair7;
	private final ModelRenderer hair8;
	private final ModelRenderer hair8_r1;
	private final ModelRenderer hair9;
	private final ModelRenderer hair10;
	private final ModelRenderer hair11;
	private final ModelRenderer hair12;
	private final ModelRenderer hair13;
	private final ModelRenderer hair15;
	private final ModelRenderer hair14;
	private final ModelRenderer hair16;
	private final ModelRenderer hair16_r1;
	private final ModelRenderer hair17;
	private final ModelRenderer hair18;
	private final ModelRenderer hair18_r1;
	private final ModelRenderer hair19;
	private final ModelRenderer hair20;
	private final ModelRenderer hair21;
	private final ModelRenderer hair21_r1;
	private final ModelRenderer right1;
	private final ModelRenderer right2;
	private final ModelRenderer right3;
	private final ModelRenderer right4;
	private final ModelRenderer right5;
	private final ModelRenderer right6;
	private final ModelRenderer right7;
	private final ModelRenderer right8;
	private final ModelRenderer left1;
	private final ModelRenderer left2;
	private final ModelRenderer left3;
	private final ModelRenderer left4;
	private final ModelRenderer left5;
	private final ModelRenderer left6;
	private final ModelRenderer left7;
	private final ModelRenderer left8;
	private final ModelRenderer left9;
	private final ModelRenderer back1;
	private final ModelRenderer back2;
	private final ModelRenderer back3;
	private final ModelRenderer back4;
	private final ModelRenderer back5;
	private final ModelRenderer back6;
	private final ModelRenderer back7;
	private final ModelRenderer back8;
	private final ModelRenderer Bang;
	private final ModelRenderer Bang_1_1;
	private final ModelRenderer Bang_1_1_r1;
	private final ModelRenderer Bang_1_2;
	private final ModelRenderer Bang_1_2_r1;
	private final ModelRenderer left10;
	private final ModelRenderer hair22;
	private final ModelRenderer hair21_r2;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer Belt;
	private final ModelRenderer Belt2;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelGogeta(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.2F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.18F));

		hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(hair);


		hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(-3.0F, -8.0F, 0.0F);
		hair.addChild(hair1);
		setRotationAngle(hair1, 2.4166F, 0.0F, -0.1487F);
		hair1.cubeList.add(new ModelBox(hair1, 48, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(-3.0F, -8.0F, 4.0F);
		hair.addChild(hair2);
		setRotationAngle(hair2, -3.1416F, 0.0F, 0.0744F);
		hair2.cubeList.add(new ModelBox(hair2, 48, 0, -1.0F, -0.5F, -1.0F, 2, 7, 2, -0.18F));

		hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(3.0F, -8.0F, 0.0F);
		hair.addChild(hair3);
		setRotationAngle(hair3, 2.7489F, 0.0F, 0.2974F);
		hair3.cubeList.add(new ModelBox(hair3, 48, 0, -1.0F, -0.25F, -1.0F, 2, 6, 2, -0.18F));

		hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(1.0F, -8.0F, 0.0F);
		hair.addChild(hair4);
		setRotationAngle(hair4, 2.9371F, 0.0F, 0.1859F);
		hair4.cubeList.add(new ModelBox(hair4, 48, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(0.0F, -8.0F, -1.0F);
		hair.addChild(hair5);
		setRotationAngle(hair5, 2.843F, 0.0372F, 0.1115F);
		hair5.cubeList.add(new ModelBox(hair5, 48, 0, -1.0F, 0.0F, -1.0F, 2, 9, 2, -0.18F));

		hair6 = new ModelRenderer(this);
		hair6.setRotationPoint(0.0F, -7.6667F, 4.0F);
		hair.addChild(hair6);
		setRotationAngle(hair6, -3.0858F, 0.0F, 0.1859F);
		hair6.cubeList.add(new ModelBox(hair6, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		hair7 = new ModelRenderer(this);
		hair7.setRotationPoint(-2.0F, -7.1333F, 3.0F);
		hair.addChild(hair7);
		setRotationAngle(hair7, 2.9743F, 0.0F, 0.1487F);
		hair7.cubeList.add(new ModelBox(hair7, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		hair8 = new ModelRenderer(this);
		hair8.setRotationPoint(2.0F, -8.0F, 3.0F);
		hair.addChild(hair8);
		setRotationAngle(hair8, -3.1416F, 0.0F, 0.1487F);


		hair8_r1 = new ModelRenderer(this);
		hair8_r1.setRotationPoint(0.0F, 3.5F, 0.0F);
		hair8.addChild(hair8_r1);
		setRotationAngle(hair8_r1, 0.0F, 0.0F, 0.0873F);
		hair8_r1.cubeList.add(new ModelBox(hair8_r1, 48, 0, -1.0F, -3.5F, -1.0F, 2, 7, 2, -0.18F));

		hair9 = new ModelRenderer(this);
		hair9.setRotationPoint(-1.0F, -8.0F, 0.0F);
		hair.addChild(hair9);
		setRotationAngle(hair9, 2.714F, 0.0F, -0.0744F);
		hair9.cubeList.add(new ModelBox(hair9, 48, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		hair10 = new ModelRenderer(this);
		hair10.setRotationPoint(-3.0F, -7.0F, -3.0F);
		hair.addChild(hair10);
		setRotationAngle(hair10, 2.5282F, 0.0F, 0.2033F);
		hair10.cubeList.add(new ModelBox(hair10, 48, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		hair11 = new ModelRenderer(this);
		hair11.setRotationPoint(2.0F, -7.2F, 4.0F);
		hair.addChild(hair11);
		setRotationAngle(hair11, 2.9557F, 0.0F, -0.1859F);
		hair11.cubeList.add(new ModelBox(hair11, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-2.0F, -8.0F, 4.0F);
		hair.addChild(hair12);
		setRotationAngle(hair12, 2.9943F, 0.0F, 0.2231F);
		hair12.cubeList.add(new ModelBox(hair12, 48, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		hair13 = new ModelRenderer(this);
		hair13.setRotationPoint(-3.0F, -8.0F, 4.0F);
		hair.addChild(hair13);
		setRotationAngle(hair13, 3.0672F, 0.0F, 0.1859F);
		hair13.cubeList.add(new ModelBox(hair13, 48, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		hair15 = new ModelRenderer(this);
		hair15.setRotationPoint(0.0F, -8.0F, 0.0F);
		hair.addChild(hair15);
		setRotationAngle(hair15, 2.7512F, 0.0F, 0.0F);
		hair15.cubeList.add(new ModelBox(hair15, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		hair14 = new ModelRenderer(this);
		hair14.setRotationPoint(3.0F, -7.2F, 4.0F);
		hair.addChild(hair14);
		setRotationAngle(hair14, 3.0301F, 0.0F, -0.0744F);
		hair14.cubeList.add(new ModelBox(hair14, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		hair16 = new ModelRenderer(this);
		hair16.setRotationPoint(0.0F, -8.0F, -1.0F);
		hair.addChild(hair16);
		setRotationAngle(hair16, 2.8628F, 0.1487F, -0.1115F);


		hair16_r1 = new ModelRenderer(this);
		hair16_r1.setRotationPoint(0.0F, 4.0F, 0.0F);
		hair16.addChild(hair16_r1);
		setRotationAngle(hair16_r1, 0.0F, 0.0F, -0.0873F);
		hair16_r1.cubeList.add(new ModelBox(hair16_r1, 48, 0, -1.0F, -4.0F, -1.0F, 2, 8, 2, -0.18F));

		hair17 = new ModelRenderer(this);
		hair17.setRotationPoint(-3.0F, -7.0F, -3.0F);
		hair.addChild(hair17);
		setRotationAngle(hair17, 2.5922F, 0.0372F, 0.3346F);
		hair17.cubeList.add(new ModelBox(hair17, 48, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		hair18 = new ModelRenderer(this);
		hair18.setRotationPoint(0.0F, -7.0F, -3.1F);
		hair.addChild(hair18);


		hair18_r1 = new ModelRenderer(this);
		hair18_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		hair18.addChild(hair18_r1);
		setRotationAngle(hair18_r1, -0.3924F, -0.0167F, -0.0403F);
		hair18_r1.cubeList.add(new ModelBox(hair18_r1, 56, 0, -1.0F, -5.9489F, -1.6498F, 2, 7, 2, -0.18F));

		hair19 = new ModelRenderer(this);
		hair19.setRotationPoint(3.0F, -7.0F, -3.0F);
		hair.addChild(hair19);
		setRotationAngle(hair19, 2.6571F, -0.0372F, -0.0744F);
		hair19.cubeList.add(new ModelBox(hair19, 48, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.18F));

		hair20 = new ModelRenderer(this);
		hair20.setRotationPoint(-2.0F, -7.0F, -3.0F);
		hair.addChild(hair20);
		setRotationAngle(hair20, 2.6025F, -0.0744F, 0.3718F);
		hair20.cubeList.add(new ModelBox(hair20, 48, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		hair21 = new ModelRenderer(this);
		hair21.setRotationPoint(1.0F, -7.0F, -3.1F);
		hair.addChild(hair21);
		setRotationAngle(hair21, 2.7884F, 0.0F, 0.1115F);


		hair21_r1 = new ModelRenderer(this);
		hair21_r1.setRotationPoint(0.0F, 0.15F, 0.0F);
		hair21.addChild(hair21_r1);
		setRotationAngle(hair21_r1, -0.0436F, 0.0F, 0.0F);
		hair21_r1.cubeList.add(new ModelBox(hair21_r1, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		right1 = new ModelRenderer(this);
		right1.setRotationPoint(-3.0F, -5.0F, -2.0F);
		hair.addChild(right1);
		setRotationAngle(right1, 2.3794F, 0.0F, -0.3346F);
		right1.cubeList.add(new ModelBox(right1, 40, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		right2 = new ModelRenderer(this);
		right2.setRotationPoint(-3.0F, -3.0F, 2.0F);
		hair.addChild(right2);
		setRotationAngle(right2, 2.7884F, 0.0F, -0.1487F);
		right2.cubeList.add(new ModelBox(right2, 48, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		right3 = new ModelRenderer(this);
		right3.setRotationPoint(-3.0F, -1.0F, 3.0F);
		hair.addChild(right3);
		setRotationAngle(right3, 2.8999F, 0.0F, -0.2231F);
		right3.cubeList.add(new ModelBox(right3, 40, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		right4 = new ModelRenderer(this);
		right4.setRotationPoint(3.0F, -4.0F, -2.0F);
		hair.addChild(right4);
		setRotationAngle(right4, 2.5653F, 0.0F, 0.1859F);
		right4.cubeList.add(new ModelBox(right4, 40, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		right5 = new ModelRenderer(this);
		right5.setRotationPoint(-3.0F, -1.0F, 1.0F);
		hair.addChild(right5);
		setRotationAngle(right5, 2.8999F, 0.0F, -0.2974F);
		right5.cubeList.add(new ModelBox(right5, 40, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		right6 = new ModelRenderer(this);
		right6.setRotationPoint(-3.0F, -6.0F, -3.2F);
		hair.addChild(right6);
		setRotationAngle(right6, 2.4166F, 0.0F, -0.1487F);
		right6.cubeList.add(new ModelBox(right6, 48, 0, -1.0F, 0.0F, -1.2F, 2, 7, 2, -0.18F));

		right7 = new ModelRenderer(this);
		right7.setRotationPoint(-3.0F, -4.0F, 1.0F);
		hair.addChild(right7);
		setRotationAngle(right7, 2.8999F, 0.0F, -0.1487F);
		right7.cubeList.add(new ModelBox(right7, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		right8 = new ModelRenderer(this);
		right8.setRotationPoint(-3.0F, -2.0F, -1.0F);
		hair.addChild(right8);
		setRotationAngle(right8, 2.5653F, 0.0F, -0.3346F);
		right8.cubeList.add(new ModelBox(right8, 40, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		left1 = new ModelRenderer(this);
		left1.setRotationPoint(2.9F, -5.0F, -2.0F);
		hair.addChild(left1);
		setRotationAngle(left1, 2.7884F, 0.0F, 0.0372F);
		left1.cubeList.add(new ModelBox(left1, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		left2 = new ModelRenderer(this);
		left2.setRotationPoint(3.0F, -3.0F, 2.0F);
		hair.addChild(left2);
		setRotationAngle(left2, 2.6769F, 0.0F, 0.2603F);
		left2.cubeList.add(new ModelBox(left2, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		left3 = new ModelRenderer(this);
		left3.setRotationPoint(3.0F, -1.0F, 3.0F);
		hair.addChild(left3);
		setRotationAngle(left3, 2.8999F, 0.0F, 0.2231F);
		left3.cubeList.add(new ModelBox(left3, 40, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		left4 = new ModelRenderer(this);
		left4.setRotationPoint(3.0F, -4.0F, -2.0F);
		hair.addChild(left4);
		setRotationAngle(left4, 2.5281F, 0.0F, 0.409F);
		left4.cubeList.add(new ModelBox(left4, 40, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		left5 = new ModelRenderer(this);
		left5.setRotationPoint(3.0F, -1.0F, 1.0F);
		hair.addChild(left5);
		setRotationAngle(left5, 2.6571F, 0.0F, 0.5321F);
		left5.cubeList.add(new ModelBox(left5, 40, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		left6 = new ModelRenderer(this);
		left6.setRotationPoint(3.0F, -6.0F, -3.2F);
		hair.addChild(left6);
		setRotationAngle(left6, 2.5653F, 0.0F, 0.1859F);
		left6.cubeList.add(new ModelBox(left6, 48, 0, -1.0F, 0.0F, -1.2F, 2, 6, 2, -0.18F));

		left7 = new ModelRenderer(this);
		left7.setRotationPoint(3.5F, -4.0F, 1.0F);
		hair.addChild(left7);
		setRotationAngle(left7, 2.7512F, 0.0F, 0.1115F);
		left7.cubeList.add(new ModelBox(left7, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		left8 = new ModelRenderer(this);
		left8.setRotationPoint(3.0F, -2.0F, -1.0F);
		hair.addChild(left8);
		setRotationAngle(left8, 2.4166F, 0.0F, 0.3718F);
		left8.cubeList.add(new ModelBox(left8, 40, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		left9 = new ModelRenderer(this);
		left9.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(left9);
		setRotationAngle(left9, 2.4166F, 0.0F, 0.3718F);
		left9.cubeList.add(new ModelBox(left9, 40, 0, 0.0F, 0.0F, 0.0F, 2, 7, 2, -0.18F));

		back1 = new ModelRenderer(this);
		back1.setRotationPoint(0.0F, -6.0F, 3.5F);
		hair.addChild(back1);
		setRotationAngle(back1, 2.8442F, 0.0F, 0.0F);
		back1.cubeList.add(new ModelBox(back1, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back2 = new ModelRenderer(this);
		back2.setRotationPoint(3.0F, -8.0F, 4.0F);
		hair.addChild(back2);
		setRotationAngle(back2, -0.1047F, 0.0F, 0.1115F);
		back2.cubeList.add(new ModelBox(back2, 40, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back3 = new ModelRenderer(this);
		back3.setRotationPoint(-3.0F, -8.0F, 4.0F);
		hair.addChild(back3);
		setRotationAngle(back3, -0.1047F, 0.0F, -0.1115F);
		back3.cubeList.add(new ModelBox(back3, 40, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back4 = new ModelRenderer(this);
		back4.setRotationPoint(0.0F, -8.0F, 4.0F);
		hair.addChild(back4);
		setRotationAngle(back4, -0.1115F, 0.0F, 0.0F);
		back4.cubeList.add(new ModelBox(back4, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back5 = new ModelRenderer(this);
		back5.setRotationPoint(1.0F, -1.0F, 3.0F);
		hair.addChild(back5);
		setRotationAngle(back5, 2.9557F, 0.0F, 0.1859F);
		back5.cubeList.add(new ModelBox(back5, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back6 = new ModelRenderer(this);
		back6.setRotationPoint(-1.0F, -1.0F, 3.0F);
		hair.addChild(back6);
		setRotationAngle(back6, 2.9557F, 0.0F, -0.1859F);
		back6.cubeList.add(new ModelBox(back6, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back7 = new ModelRenderer(this);
		back7.setRotationPoint(0.0F, -3.0F, 3.0F);
		hair.addChild(back7);
		setRotationAngle(back7, 2.8442F, 0.0F, 0.1115F);
		back7.cubeList.add(new ModelBox(back7, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		back8 = new ModelRenderer(this);
		back8.setRotationPoint(0.0F, -3.0F, 3.0F);
		hair.addChild(back8);
		setRotationAngle(back8, 2.8442F, 0.0F, -0.1859F);
		back8.cubeList.add(new ModelBox(back8, 48, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Bang = new ModelRenderer(this);
		Bang.setRotationPoint(1.4049F, -6.6474F, -4.4568F);
		hair.addChild(Bang);
		setRotationAngle(Bang, 0.5067F, -0.6F, -0.0727F);


		Bang_1_1 = new ModelRenderer(this);
		Bang_1_1.setRotationPoint(-0.257F, -0.085F, 1.6388F);
		Bang.addChild(Bang_1_1);
		setRotationAngle(Bang_1_1, -1.2881F, 0.0F, -0.2231F);


		Bang_1_1_r1 = new ModelRenderer(this);
		Bang_1_1_r1.setRotationPoint(0.5F, 2.3667F, 0.0F);
		Bang_1_1.addChild(Bang_1_1_r1);
		setRotationAngle(Bang_1_1_r1, -0.0755F, -0.138F, -0.0878F);
		Bang_1_1_r1.cubeList.add(new ModelBox(Bang_1_1_r1, 54, 2, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.18F));

		Bang_1_2 = new ModelRenderer(this);
		Bang_1_2.setRotationPoint(0.8996F, 0.8334F, -3.7045F);
		Bang.addChild(Bang_1_2);
		setRotationAngle(Bang_1_2, -0.3866F, -0.1299F, -0.1245F);


		Bang_1_2_r1 = new ModelRenderer(this);
		Bang_1_2_r1.setRotationPoint(-0.0765F, -0.5F, 2.3F);
		Bang_1_2.addChild(Bang_1_2_r1);
		setRotationAngle(Bang_1_2_r1, -0.3927F, 0.0F, 0.0F);
		Bang_1_2_r1.cubeList.add(new ModelBox(Bang_1_2_r1, 56, 1, -1.0F, -1.529F, -1.1F, 2, 3, 2, -0.18F));

		left10 = new ModelRenderer(this);
		left10.setRotationPoint(-3.0F, -1.0F, 1.0F);
		hair.addChild(left10);
		setRotationAngle(left10, 2.6571F, 0.0F, -0.5321F);
		left10.mirror = true;
		left10.cubeList.add(new ModelBox(left10, 40, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		hair22 = new ModelRenderer(this);
		hair22.setRotationPoint(-1.0F, -7.0F, -3.1F);
		hair.addChild(hair22);
		setRotationAngle(hair22, 2.7011F, 0.0F, -0.1115F);


		hair21_r2 = new ModelRenderer(this);
		hair21_r2.setRotationPoint(0.0F, 0.15F, 0.0F);
		hair22.addChild(hair21_r2);
		setRotationAngle(hair21_r2, -0.0436F, 0.0019F, 0.0436F);
		hair21_r2.mirror = true;
		hair21_r2.cubeList.add(new ModelBox(hair21_r2, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(-0.8F, -1.6F, -2.2F);
		RLeg.addChild(Belt);
		setRotationAngle(Belt, -0.0698F, 0.0873F, 0.0F);
		Belt.cubeList.add(new ModelBox(Belt, 56, 20, -1.2857F, -1.545F, -0.1004F, 2, 8, 0, 0.0F));

		Belt2 = new ModelRenderer(this);
		Belt2.setRotationPoint(-0.8F, -1.6F, -2.2F);
		RLeg.addChild(Belt2);
		setRotationAngle(Belt2, -0.0698F, 1.2217F, 0.0F);
		Belt2.cubeList.add(new ModelBox(Belt2, 56, 20, -2.2857F, -1.345F, -1.1004F, 2, 8, 0, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
        this.Head.rotateAngleY = f3 / (160F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (160F / (float)Math.PI);
        this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.RArm.rotateAngleZ = 0.0F;
        this.LArm.rotateAngleZ = 0.0F;
        this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.RLeg.rotateAngleY = 0.0F;
        this.LLeg.rotateAngleY = 0.0F;
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
