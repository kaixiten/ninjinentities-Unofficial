package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelVegeto extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hair;
	private final ModelRenderer Hair_1;
	private final ModelRenderer Hair_2;
	private final ModelRenderer Hair_3;
	private final ModelRenderer Hair_4;
	private final ModelRenderer Hair_5;
	private final ModelRenderer Hair_6;
	private final ModelRenderer Hair_7;
	private final ModelRenderer Hair_8;
	private final ModelRenderer Hair_9;
	private final ModelRenderer Hair_10;
	private final ModelRenderer Hair_11;
	private final ModelRenderer Hair_12;
	private final ModelRenderer Hair_13;
	private final ModelRenderer Hair_14;
	private final ModelRenderer Hair_15;
	private final ModelRenderer Hair_16;
	private final ModelRenderer Hair_17;
	private final ModelRenderer Hair_18;
	private final ModelRenderer Hair_19;
	private final ModelRenderer Hair_20;
	private final ModelRenderer Hair_21;
	private final ModelRenderer Hair_22;
	private final ModelRenderer Hair_23;
	private final ModelRenderer Hair_24;
	private final ModelRenderer Hair_25;
	private final ModelRenderer Hair_26;
	private final ModelRenderer Hair_27;
	private final ModelRenderer Hair27_r1;
	private final ModelRenderer Hair_28;
	private final ModelRenderer Hair_29;
	private final ModelRenderer Hair_30;
	private final ModelRenderer Hair_31;
	private final ModelRenderer Hair_32;
	private final ModelRenderer Hair_33;
	private final ModelRenderer Hair_34;
	private final ModelRenderer Hair_35;
	private final ModelRenderer Hair_36;
	private final ModelRenderer Hair_37;
	private final ModelRenderer Hair_38;
	private final ModelRenderer Hair_39;
	private final ModelRenderer Hair_40;
	private final ModelRenderer Hair_41;
	private final ModelRenderer Hair_42;
	private final ModelRenderer Hair_43;
	private final ModelRenderer Hair_44;
	private final ModelRenderer Hair_45;
	private final ModelRenderer Hair_46;
	private final ModelRenderer Hair_48;
	private final ModelRenderer Hair_49;
	private final ModelRenderer Hair_50;
	private final ModelRenderer Hair_51;
	private final ModelRenderer Hair_52;
	private final ModelRenderer Hair_53;
	private final ModelRenderer Hair53_r1;
	private final ModelRenderer Hair_54;
	private final ModelRenderer Hair54_r1;
	private final ModelRenderer Hair_55;
	private final ModelRenderer Hair55_r1;
	private final ModelRenderer Hair_56;
	private final ModelRenderer Hair_57;
	private final ModelRenderer Hair_58;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelVegeto(float _scale) {
		textureWidth = 64;
		textureHeight = 32;
		
		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.2F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.19F));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 25.0F, 0.0F);
		Head.addChild(Hair);


		Hair_1 = new ModelRenderer(this);
		Hair_1.setRotationPoint(3.0F, -33.0F, -3.0F);
		Hair.addChild(Hair_1);
		setRotationAngle(Hair_1, -0.0744F, 0.2428F, 2.9929F);
		Hair_1.cubeList.add(new ModelBox(Hair_1, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_2 = new ModelRenderer(this);
		Hair_2.setRotationPoint(1.0F, -32.0F, -3.0F);
		Hair.addChild(Hair_2);
		setRotationAngle(Hair_2, 0.0744F, 0.0F, -2.9557F);
		Hair_2.cubeList.add(new ModelBox(Hair_2, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_3 = new ModelRenderer(this);
		Hair_3.setRotationPoint(-1.0F, -32.0F, -3.0F);
		Hair.addChild(Hair_3);
		setRotationAngle(Hair_3, 0.1487F, 0.2974F, -3.0292F);
		Hair_3.cubeList.add(new ModelBox(Hair_3, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_4 = new ModelRenderer(this);
		Hair_4.setRotationPoint(-3.0F, -33.0F, -3.0F);
		Hair.addChild(Hair_4);
		setRotationAngle(Hair_4, -0.1115F, 0.0F, -2.9185F);
		Hair_4.cubeList.add(new ModelBox(Hair_4, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_5 = new ModelRenderer(this);
		Hair_5.setRotationPoint(3.0F, -33.0F, -2.0F);
		Hair.addChild(Hair_5);
		setRotationAngle(Hair_5, 0.1115F, 0.2974F, 3.0301F);
		Hair_5.cubeList.add(new ModelBox(Hair_5, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_6 = new ModelRenderer(this);
		Hair_6.setRotationPoint(1.0F, -33.0F, -2.0F);
		Hair.addChild(Hair_6);
		setRotationAngle(Hair_6, 0.2974F, -0.5949F, -3.0103F);
		Hair_6.cubeList.add(new ModelBox(Hair_6, 56, 0, 0.0F, -1.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_7 = new ModelRenderer(this);
		Hair_7.setRotationPoint(-1.0F, -33.0F, -2.0F);
		Hair.addChild(Hair_7);
		setRotationAngle(Hair_7, 0.2974F, 0.0F, 3.1416F);
		Hair_7.cubeList.add(new ModelBox(Hair_7, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_8 = new ModelRenderer(this);
		Hair_8.setRotationPoint(-3.0F, -33.0F, -2.0F);
		Hair.addChild(Hair_8);
		setRotationAngle(Hair_8, 0.1859F, 0.8551F, 3.1416F);
		Hair_8.cubeList.add(new ModelBox(Hair_8, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_9 = new ModelRenderer(this);
		Hair_9.setRotationPoint(3.0F, -33.0F, 0.0F);
		Hair.addChild(Hair_9);
		setRotationAngle(Hair_9, 0.1093F, 0.0F, 3.1241F);
		Hair_9.cubeList.add(new ModelBox(Hair_9, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_10 = new ModelRenderer(this);
		Hair_10.setRotationPoint(1.0F, -32.0F, 0.0F);
		Hair.addChild(Hair_10);
		setRotationAngle(Hair_10, 0.1115F, -0.8179F, -2.9929F);
		Hair_10.cubeList.add(new ModelBox(Hair_10, 56, 0, 1.0F, 0.0F, -2.0F, 2, 9, 2, -0.19F));

		Hair_11 = new ModelRenderer(this);
		Hair_11.setRotationPoint(-1.0F, -33.0F, 0.0F);
		Hair.addChild(Hair_11);
		setRotationAngle(Hair_11, 0.3421F, 0.0F, -3.1416F);
		Hair_11.cubeList.add(new ModelBox(Hair_11, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_12 = new ModelRenderer(this);
		Hair_12.setRotationPoint(-3.0F, -33.0F, 0.0F);
		Hair.addChild(Hair_12);
		setRotationAngle(Hair_12, 0.1859F, 0.0F, -3.0672F);
		Hair_12.cubeList.add(new ModelBox(Hair_12, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_13 = new ModelRenderer(this);
		Hair_13.setRotationPoint(3.0F, -33.0F, 2.0F);
		Hair.addChild(Hair_13);
		setRotationAngle(Hair_13, 0.0744F, 0.0F, 3.1044F);
		Hair_13.cubeList.add(new ModelBox(Hair_13, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_14 = new ModelRenderer(this);
		Hair_14.setRotationPoint(1.0F, -32.0F, 2.0F);
		Hair.addChild(Hair_14);
		setRotationAngle(Hair_14, 0.1115F, 0.0F, 3.1416F);
		Hair_14.cubeList.add(new ModelBox(Hair_14, 56, 0, -1.0F, 0.0F, -1.0F, 2, 10, 2, -0.19F));

		Hair_15 = new ModelRenderer(this);
		Hair_15.setRotationPoint(-1.0F, -33.0F, 2.0F);
		Hair.addChild(Hair_15);
		setRotationAngle(Hair_15, 0.1487F, 0.0F, -3.1044F);
		Hair_15.cubeList.add(new ModelBox(Hair_15, 56, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Hair_16 = new ModelRenderer(this);
		Hair_16.setRotationPoint(-3.0F, -33.0F, 2.0F);
		Hair.addChild(Hair_16);
		setRotationAngle(Hair_16, 0.0372F, 0.9666F, 3.1044F);
		Hair_16.cubeList.add(new ModelBox(Hair_16, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_17 = new ModelRenderer(this);
		Hair_17.setRotationPoint(-3.0F, -33.0F, 4.0F);
		Hair.addChild(Hair_17);
		setRotationAngle(Hair_17, -0.0744F, -0.7436F, -2.9185F);
		Hair_17.cubeList.add(new ModelBox(Hair_17, 56, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Hair_18 = new ModelRenderer(this);
		Hair_18.setRotationPoint(-1.0F, -33.0F, 4.0F);
		Hair.addChild(Hair_18);
		setRotationAngle(Hair_18, 0.1115F, 0.0F, 3.1416F);
		Hair_18.cubeList.add(new ModelBox(Hair_18, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_19 = new ModelRenderer(this);
		Hair_19.setRotationPoint(1.0F, -33.0F, 4.0F);
		Hair.addChild(Hair_19);
		setRotationAngle(Hair_19, 0.1859F, -0.632F, 3.0126F);
		Hair_19.cubeList.add(new ModelBox(Hair_19, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_20 = new ModelRenderer(this);
		Hair_20.setRotationPoint(3.0F, -33.0F, 4.0F);
		Hair.addChild(Hair_20);
		setRotationAngle(Hair_20, 0.1487F, 0.0F, 2.9929F);
		Hair_20.cubeList.add(new ModelBox(Hair_20, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_21 = new ModelRenderer(this);
		Hair_21.setRotationPoint(-3.0F, -33.0F, -3.0F);
		Hair.addChild(Hair_21);
		setRotationAngle(Hair_21, 0.2231F, 0.0F, 0.4833F);
		Hair_21.cubeList.add(new ModelBox(Hair_21, 56, 0, -1.0F, 0.0F, -1.0F, 2, 3, 2, -0.19F));

		Hair_22 = new ModelRenderer(this);
		Hair_22.setRotationPoint(-3.0F, -31.0F, -3.0F);
		Hair.addChild(Hair_22);
		setRotationAngle(Hair_22, 0.1115F, -0.5949F, 3.0858F);
		Hair_22.cubeList.add(new ModelBox(Hair_22, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_23 = new ModelRenderer(this);
		Hair_23.setRotationPoint(-3.0F, -28.0F, 1.0F);
		Hair.addChild(Hair_23);
		setRotationAngle(Hair_23, 0.2231F, 0.0F, 2.7884F);
		Hair_23.cubeList.add(new ModelBox(Hair_23, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_24 = new ModelRenderer(this);
		Hair_24.setRotationPoint(-3.0F, -29.0F, -1.0F);
		Hair.addChild(Hair_24);
		setRotationAngle(Hair_24, 0.2231F, 0.0F, 2.6769F);
		Hair_24.cubeList.add(new ModelBox(Hair_24, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_25 = new ModelRenderer(this);
		Hair_25.setRotationPoint(-3.0F, -31.0F, 3.0F);
		Hair.addChild(Hair_25);
		setRotationAngle(Hair_25, 0.1662F, 0.0F, 3.1044F);
		Hair_25.cubeList.add(new ModelBox(Hair_25, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_26 = new ModelRenderer(this);
		Hair_26.setRotationPoint(-3.0F, -31.0F, 2.0F);
		Hair.addChild(Hair_26);
		setRotationAngle(Hair_26, 0.0372F, 0.5949F, 2.7884F);
		Hair_26.cubeList.add(new ModelBox(Hair_26, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_27 = new ModelRenderer(this);
		Hair_27.setRotationPoint(-3.0F, -33.0F, 0.0F);
		Hair.addChild(Hair_27);
		setRotationAngle(Hair_27, 0.2231F, -0.3718F, 3.1056F);


		Hair27_r1 = new ModelRenderer(this);
		Hair27_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair_27.addChild(Hair27_r1);
		setRotationAngle(Hair27_r1, -0.0172F, 0.1298F, -0.132F);
		Hair27_r1.cubeList.add(new ModelBox(Hair27_r1, 56, 1, -1.0F, -2.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_28 = new ModelRenderer(this);
		Hair_28.setRotationPoint(-3.0F, -30.0F, -3.0F);
		Hair.addChild(Hair_28);
		setRotationAngle(Hair_28, 0.2231F, 0.0F, 2.9743F);
		Hair_28.cubeList.add(new ModelBox(Hair_28, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_29 = new ModelRenderer(this);
		Hair_29.setRotationPoint(-3.0F, -29.0F, 2.0F);
		Hair.addChild(Hair_29);
		setRotationAngle(Hair_29, 0.2231F, 0.0F, 2.8256F);
		Hair_29.cubeList.add(new ModelBox(Hair_29, 56, 0, -0.7F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_30 = new ModelRenderer(this);
		Hair_30.setRotationPoint(-3.0F, -27.0F, 3.0F);
		Hair.addChild(Hair_30);
		setRotationAngle(Hair_30, 0.2231F, 0.0F, 2.7884F);
		Hair_30.cubeList.add(new ModelBox(Hair_30, 56, 0, -1.3F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_31 = new ModelRenderer(this);
		Hair_31.setRotationPoint(-4.0F, -31.0F, 3.0F);
		Hair.addChild(Hair_31);
		setRotationAngle(Hair_31, 0.2777F, -0.4461F, -3.1416F);
		Hair_31.cubeList.add(new ModelBox(Hair_31, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_32 = new ModelRenderer(this);
		Hair_32.setRotationPoint(-3.0F, -30.0F, -2.0F);
		Hair.addChild(Hair_32);
		setRotationAngle(Hair_32, -0.1487F, 0.7064F, 2.7884F);
		Hair_32.cubeList.add(new ModelBox(Hair_32, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_33 = new ModelRenderer(this);
		Hair_33.setRotationPoint(-3.0F, -29.0F, 3.0F);
		Hair.addChild(Hair_33);
		setRotationAngle(Hair_33, 0.2033F, 0.0F, 2.7884F);
		Hair_33.cubeList.add(new ModelBox(Hair_33, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_34 = new ModelRenderer(this);
		Hair_34.setRotationPoint(-3.0F, -30.0F, 0.0F);
		Hair.addChild(Hair_34);
		setRotationAngle(Hair_34, 0.2231F, 0.3346F, 2.7884F);
		Hair_34.cubeList.add(new ModelBox(Hair_34, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_35 = new ModelRenderer(this);
		Hair_35.setRotationPoint(3.0F, -34.0F, 4.0F);
		Hair.addChild(Hair_35);
		setRotationAngle(Hair_35, -0.1487F, 0.0F, 0.1487F);
		Hair_35.cubeList.add(new ModelBox(Hair_35, 56, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Hair_36 = new ModelRenderer(this);
		Hair_36.setRotationPoint(1.0F, -34.0F, 4.0F);
		Hair.addChild(Hair_36);
		setRotationAngle(Hair_36, -0.1662F, 0.0F, 0.0F);
		Hair_36.cubeList.add(new ModelBox(Hair_36, 56, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Hair_37 = new ModelRenderer(this);
		Hair_37.setRotationPoint(-1.0F, -34.0F, 4.0F);
		Hair.addChild(Hair_37);
		setRotationAngle(Hair_37, -0.1487F, 0.0F, 0.0F);
		Hair_37.cubeList.add(new ModelBox(Hair_37, 56, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Hair_38 = new ModelRenderer(this);
		Hair_38.setRotationPoint(-3.0F, -34.0F, 4.0F);
		Hair.addChild(Hair_38);
		setRotationAngle(Hair_38, -0.1115F, 0.0F, -0.1487F);
		Hair_38.cubeList.add(new ModelBox(Hair_38, 56, 0, -1.0F, -1.0F, -1.1F, 2, 8, 2, -0.19F));

		Hair_39 = new ModelRenderer(this);
		Hair_39.setRotationPoint(3.0F, -31.0F, -3.0F);
		Hair.addChild(Hair_39);
		setRotationAngle(Hair_39, 0.0372F, 0.0F, -3.0487F);
		Hair_39.cubeList.add(new ModelBox(Hair_39, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_40 = new ModelRenderer(this);
		Hair_40.setRotationPoint(3.094F, -27.966F, 1.0F);
		Hair.addChild(Hair_40);
		setRotationAngle(Hair_40, 0.2231F, 0.0F, -2.7942F);
		Hair_40.cubeList.add(new ModelBox(Hair_40, 56, 0, -0.8F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_41 = new ModelRenderer(this);
		Hair_41.setRotationPoint(3.0894F, -28.9552F, -1.0F);
		Hair.addChild(Hair_41);
		setRotationAngle(Hair_41, 0.2231F, 0.0F, -2.6769F);
		Hair_41.cubeList.add(new ModelBox(Hair_41, 56, 0, -0.8F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_42 = new ModelRenderer(this);
		Hair_42.setRotationPoint(3.0F, -31.0F, 3.0F);
		Hair.addChild(Hair_42);
		setRotationAngle(Hair_42, 0.1662F, 0.5205F, 3.1044F);
		Hair_42.cubeList.add(new ModelBox(Hair_42, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_43 = new ModelRenderer(this);
		Hair_43.setRotationPoint(3.0F, -31.0F, 2.0F);
		Hair.addChild(Hair_43);
		setRotationAngle(Hair_43, 0.1859F, 0.4461F, -2.9743F);
		Hair_43.cubeList.add(new ModelBox(Hair_43, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_44 = new ModelRenderer(this);
		Hair_44.setRotationPoint(3.0F, -32.5F, 0.0F);
		Hair.addChild(Hair_44);
		setRotationAngle(Hair_44, -0.1859F, -1.8218F, -2.9743F);
		Hair_44.cubeList.add(new ModelBox(Hair_44, 56, 0, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_45 = new ModelRenderer(this);
		Hair_45.setRotationPoint(3.0F, -30.0F, -3.0F);
		Hair.addChild(Hair_45);
		setRotationAngle(Hair_45, 0.2603F, 0.0F, -3.1416F);
		Hair_45.cubeList.add(new ModelBox(Hair_45, 56, 0, -1.0F, 1.0F, -1.0F, 2, 7, 2, -0.19F));

		Hair_46 = new ModelRenderer(this);
		Hair_46.setRotationPoint(3.0F, -29.0F, 2.0F);
		Hair.addChild(Hair_46);
		setRotationAngle(Hair_46, 0.2231F, 0.0F, -2.8256F);
		Hair_46.cubeList.add(new ModelBox(Hair_46, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_48 = new ModelRenderer(this);
		Hair_48.setRotationPoint(4.0F, -31.0F, 3.0F);
		Hair.addChild(Hair_48);
		setRotationAngle(Hair_48, 0.2405F, 0.409F, 3.1044F);
		Hair_48.cubeList.add(new ModelBox(Hair_48, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_49 = new ModelRenderer(this);
		Hair_49.setRotationPoint(3.0F, -30.0F, -2.0F);
		Hair.addChild(Hair_49);
		setRotationAngle(Hair_49, 0.0F, -0.4461F, -2.8256F);
		Hair_49.cubeList.add(new ModelBox(Hair_49, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_50 = new ModelRenderer(this);
		Hair_50.setRotationPoint(3.0F, -29.0F, 3.0F);
		Hair.addChild(Hair_50);
		setRotationAngle(Hair_50, 0.2033F, 0.0F, -2.7884F);
		Hair_50.cubeList.add(new ModelBox(Hair_50, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Hair_51 = new ModelRenderer(this);
		Hair_51.setRotationPoint(3.0F, -30.0F, 0.0F);
		Hair.addChild(Hair_51);
		setRotationAngle(Hair_51, 0.2231F, 0.0F, -2.7884F);
		Hair_51.cubeList.add(new ModelBox(Hair_51, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_52 = new ModelRenderer(this);
		Hair_52.setRotationPoint(-0.4727F, -33.1725F, -1.3F);
		Hair.addChild(Hair_52);
		setRotationAngle(Hair_52, -1.1022F, 0.4833F, 0.1115F);
		Hair_52.cubeList.add(new ModelBox(Hair_52, 56, 0, -1.0273F, -0.2275F, -1.1F, 2, 5, 2, -0.19F));

		Hair_53 = new ModelRenderer(this);
		Hair_53.setRotationPoint(-3.1901F, -31.131F, -5.5863F);
		Hair.addChild(Hair_53);
		setRotationAngle(Hair_53, -0.2625F, 0.4843F, 0.0372F);


		Hair53_r1 = new ModelRenderer(this);
		Hair53_r1.setRotationPoint(-0.0099F, -0.069F, 0.7863F);
		Hair_53.addChild(Hair53_r1);
		setRotationAngle(Hair53_r1, -0.0873F, 0.0F, 0.0873F);
		Hair53_r1.cubeList.add(new ModelBox(Hair53_r1, 56, 0, -0.95F, -1.1F, -1.1F, 2, 2, 2, -0.19F));

		Hair_54 = new ModelRenderer(this);
		Hair_54.setRotationPoint(1.5F, -33.4F, -1.0F);
		Hair.addChild(Hair_54);
		setRotationAngle(Hair_54, -1.1393F, 0.0F, -0.1859F);


		Hair54_r1 = new ModelRenderer(this);
		Hair54_r1.setRotationPoint(0.0F, 2.5F, 0.0F);
		Hair_54.addChild(Hair54_r1);
		setRotationAngle(Hair54_r1, 0.0F, 0.0F, -0.1309F);
		Hair54_r1.cubeList.add(new ModelBox(Hair54_r1, 56, 0, -1.0F, -2.5F, -1.0F, 2, 5, 2, -0.19F));

		Hair_55 = new ModelRenderer(this);
		Hair_55.setRotationPoint(1.8F, -31.2F, -6.1F);
		Hair.addChild(Hair_55);
		setRotationAngle(Hair_55, -0.0766F, 0.0F, -0.0372F);


		Hair55_r1 = new ModelRenderer(this);
		Hair55_r1.setRotationPoint(0.4F, 0.3F, 1.0F);
		Hair_55.addChild(Hair55_r1);
		setRotationAngle(Hair55_r1, -0.0436F, 0.0F, -0.1745F);
		Hair55_r1.cubeList.add(new ModelBox(Hair55_r1, 56, 0, -0.9F, -1.5F, -1.0F, 2, 3, 2, -0.19F));

		Hair_56 = new ModelRenderer(this);
		Hair_56.setRotationPoint(-3.0F, -30.0F, -2.0F);
		Hair.addChild(Hair_56);
		Hair_56.mirror = true;
		setRotationAngle(Hair_56, 0.0F, 0.4461F, 2.8256F);
		Hair_56.cubeList.add(new ModelBox(Hair_56, 56, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Hair_57 = new ModelRenderer(this);
		Hair_57.setRotationPoint(-3.0F, -28.0F, 1.0F);
		Hair.addChild(Hair_57);
		Hair_57.mirror = true;
		setRotationAngle(Hair_57, 0.2231F, 0.0F, 2.7942F);
		Hair_57.cubeList.add(new ModelBox(Hair_57, 56, 0, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Hair_58 = new ModelRenderer(this);
		Hair_58.setRotationPoint(-3.0F, -29.0F, -1.0F);
		Hair.addChild(Hair_58);
		Hair_58.mirror = true;
		setRotationAngle(Hair_58, 0.2231F, 0.0F, 2.6769F);
		Hair_58.cubeList.add(new ModelBox(Hair_58, 56, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
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
        this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
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
