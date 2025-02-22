package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGohanBeast extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hair;
	private final ModelRenderer bone;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair1_r1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair7;
	private final ModelRenderer Hair26;
	private final ModelRenderer hair12;
	private final ModelRenderer hair5_r1;
	private final ModelRenderer hair5_1;
	private final ModelRenderer hair5_5_r1;
	private final ModelRenderer hair5_4_r1;
	private final ModelRenderer hair5_3_r1;
	private final ModelRenderer hair5_2_r1;
	private final ModelRenderer hair5_1_r1;
	private final ModelRenderer LeftHair1;
	private final ModelRenderer Hair10;
	private final ModelRenderer Hair10_r1;
	private final ModelRenderer Hair9;
	private final ModelRenderer Hair13;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair3;
	private final ModelRenderer LeftHair2;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair10_r2;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair8;
	private final ModelRenderer Hair11;
	private final ModelRenderer RightHair2;
	private final ModelRenderer Hair15;
	private final ModelRenderer Hair10_r3;
	private final ModelRenderer Hair16;
	private final ModelRenderer Hair17;
	private final ModelRenderer Hair18;
	private final ModelRenderer Hair19;
	private final ModelRenderer Hair20;
	private final ModelRenderer Hair27;
	private final ModelRenderer Hair33;
	private final ModelRenderer Hair34;
	private final ModelRenderer Hair35;
	private final ModelRenderer Hair36;
	private final ModelRenderer RightHair1;
	private final ModelRenderer Hair21;
	private final ModelRenderer Hair10_r4;
	private final ModelRenderer Hair22;
	private final ModelRenderer Hair23;
	private final ModelRenderer Hair24;
	private final ModelRenderer Hair25;
	private final ModelRenderer LeftHair3;
	private final ModelRenderer Hair28;
	private final ModelRenderer Hair10_r5;
	private final ModelRenderer Hair29;
	private final ModelRenderer Hair30;
	private final ModelRenderer Hair31;
	private final ModelRenderer Hair32;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private float scale = 1.0F;

	public ModelGohanBeast(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

        scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 0.0F, 0.6F);
		Head.addChild(Hair);
		setRotationAngle(Hair, -0.0436F, 0.0F, 0.0F);


		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.25F, -9.25F, 0.0F);
		Hair.addChild(bone);


		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, 0.2F, 0.3F);
		bone.addChild(Hair1);
		setRotationAngle(Hair1, -0.2705F, 0.0023F, -0.1572F);


		Hair1_r1 = new ModelRenderer(this);
		Hair1_r1.setRotationPoint(-3.75F, 41.25F, 3.5F);
		Hair1.addChild(Hair1_r1);
		setRotationAngle(Hair1_r1, 0.1304F, -0.0114F, 0.1302F);
		Hair1_r1.cubeList.add(new ModelBox(Hair1_r1, 42, 2, -2.1477F, -49.3863F, -2.9175F, 4, 10, 4, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-0.25F, -1.25F, 0.0F);
		bone.addChild(Hair2);
		setRotationAngle(Hair2, -0.173F, 0.0227F, -0.2201F);


		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(0.0F, -1.875F, 5.3125F);
		bone.addChild(Hair7);
		setRotationAngle(Hair7, -0.3479F, 0.0298F, 0.1519F);
		Hair7.cubeList.add(new ModelBox(Hair7, 45, 1, 1.7624F, -5.8021F, -8.2477F, 3, 12, 3, 0.0F));

		Hair26 = new ModelRenderer(this);
		Hair26.setRotationPoint(2.5F, -1.875F, 5.3125F);
		bone.addChild(Hair26);
		setRotationAngle(Hair26, -0.3479F, -0.0298F, -0.1519F);
		Hair26.cubeList.add(new ModelBox(Hair26, 45, 1, -4.7624F, -4.8021F, -8.2477F, 3, 11, 3, 0.0F));

		hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(0.4536F, 3.35F, -4.3536F);
		bone.addChild(hair12);
		setRotationAngle(hair12, 1.0286F, 0.8766F, 0.6657F);


		hair5_r1 = new ModelRenderer(this);
		hair5_r1.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
		hair12.addChild(hair5_r1);
		setRotationAngle(hair5_r1, 0.5542F, -0.24F, 0.1054F);
		hair5_r1.cubeList.add(new ModelBox(hair5_r1, 49, 6, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		hair5_1 = new ModelRenderer(this);
		hair5_1.setRotationPoint(-0.3036F, -2.1F, 0.0536F);
		hair12.addChild(hair5_1);
		setRotationAngle(hair5_1, 0.192F, 0.0F, 0.0F);


		hair5_5_r1 = new ModelRenderer(this);
		hair5_5_r1.setRotationPoint(0.8F, 0.195F, -3.45F);
		hair5_1.addChild(hair5_5_r1);
		setRotationAngle(hair5_5_r1, 2.4042F, -0.24F, 0.1054F);
		hair5_5_r1.cubeList.add(new ModelBox(hair5_5_r1, 49, 6, -1.0118F, -3.455F, -1.11F, 2, 4, 2, -0.3F));

		hair5_4_r1 = new ModelRenderer(this);
		hair5_4_r1.setRotationPoint(0.7F, -0.105F, -2.45F);
		hair5_1.addChild(hair5_4_r1);
		setRotationAngle(hair5_4_r1, 2.0988F, -0.24F, 0.1054F);
		hair5_4_r1.cubeList.add(new ModelBox(hair5_4_r1, 49, 6, -1.13F, -1.267F, -0.81F, 2, 2, 2, -0.3F));

		hair5_3_r1 = new ModelRenderer(this);
		hair5_3_r1.setRotationPoint(0.5F, -0.405F, -1.45F);
		hair5_1.addChild(hair5_3_r1);
		setRotationAngle(hair5_3_r1, 1.7323F, -0.24F, 0.1054F);
		hair5_3_r1.cubeList.add(new ModelBox(hair5_3_r1, 49, 6, -1.14F, -1.285F, -0.82F, 2, 2, 2, -0.3F));

		hair5_2_r1 = new ModelRenderer(this);
		hair5_2_r1.setRotationPoint(0.2F, -0.505F, -0.65F);
		hair5_1.addChild(hair5_2_r1);
		setRotationAngle(hair5_2_r1, 1.3309F, -0.24F, 0.1054F);
		hair5_2_r1.cubeList.add(new ModelBox(hair5_2_r1, 49, 6, -1.03F, -1.1F, -1.0F, 2, 2, 2, -0.3F));

		hair5_1_r1 = new ModelRenderer(this);
		hair5_1_r1.setRotationPoint(0.0F, -0.105F, -0.15F);
		hair5_1.addChild(hair5_1_r1);
		setRotationAngle(hair5_1_r1, 0.5542F, -0.24F, 0.1054F);
		hair5_1_r1.cubeList.add(new ModelBox(hair5_1_r1, 49, 6, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F));

		LeftHair1 = new ModelRenderer(this);
		LeftHair1.setRotationPoint(-0.875F, -7.5F, 1.625F);
		Hair.addChild(LeftHair1);
		setRotationAngle(LeftHair1, 0.0F, 0.0F, 0.2182F);


		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftHair1.addChild(Hair10);
		setRotationAngle(Hair10, 2.4826F, 0.1957F, 0.2441F);


		Hair10_r1 = new ModelRenderer(this);
		Hair10_r1.setRotationPoint(-1.625F, 37.75F, -1.125F);
		Hair10.addChild(Hair10_r1);
		setRotationAngle(Hair10_r1, 0.028F, -0.0466F, 0.0676F);
		Hair10_r1.cubeList.add(new ModelBox(Hair10_r1, 44, 2, 1.4607F, -39.7225F, -2.6172F, 3, 5, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(4.625F, -3.5F, 0.875F);
		LeftHair1.addChild(Hair9);
		setRotationAngle(Hair9, 2.6616F, 0.0873F, 0.349F);
		Hair9.cubeList.add(new ModelBox(Hair9, 45, 4, 0.1215F, -6.2137F, -1.5235F, 3, 7, 3, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(4.625F, -3.5F, 1.5F);
		LeftHair1.addChild(Hair13);
		setRotationAngle(Hair13, 2.5808F, 0.111F, 0.5896F);
		Hair13.cubeList.add(new ModelBox(Hair13, 47, 3, 0.7465F, -5.4638F, -4.0235F, 3, 6, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(6.625F, -1.5F, -4.125F);
		LeftHair1.addChild(Hair4);
		setRotationAngle(Hair4, 2.6471F, -0.0378F, 0.5289F);
		Hair4.cubeList.add(new ModelBox(Hair4, 44, 3, -2.9965F, -2.9637F, -2.7735F, 3, 7, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(2.125F, -3.5F, -1.625F);
		LeftHair1.addChild(Hair3);
		setRotationAngle(Hair3, -0.1571F, 0.0F, 0.3665F);
		Hair3.cubeList.add(new ModelBox(Hair3, 44, 3, 0.8254F, -3.9275F, -3.75F, 3, 7, 3, 0.0F));

		LeftHair2 = new ModelRenderer(this);
		LeftHair2.setRotationPoint(-1.875F, -8.5F, 1.625F);
		Hair.addChild(LeftHair2);
		setRotationAngle(LeftHair2, 0.0F, 0.0F, -0.0873F);


		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftHair2.addChild(Hair5);
		setRotationAngle(Hair5, 2.4826F, 0.1957F, 0.2441F);


		Hair10_r2 = new ModelRenderer(this);
		Hair10_r2.setRotationPoint(-1.625F, 37.75F, -1.125F);
		Hair5.addChild(Hair10_r2);
		setRotationAngle(Hair10_r2, 0.028F, -0.0466F, 0.0676F);
		Hair10_r2.cubeList.add(new ModelBox(Hair10_r2, 44, 2, 1.3582F, -39.4122F, -2.9956F, 3, 9, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(4.625F, -3.5F, 0.875F);
		LeftHair2.addChild(Hair6);
		setRotationAngle(Hair6, 2.6616F, 0.0873F, 0.349F);
		Hair6.cubeList.add(new ModelBox(Hair6, 45, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(4.625F, -3.5F, 1.5F);
		LeftHair2.addChild(Hair8);
		setRotationAngle(Hair8, 2.5808F, 0.111F, 0.5896F);
		Hair8.cubeList.add(new ModelBox(Hair8, 47, 3, 0.7465F, -5.4638F, -4.0235F, 3, 9, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(6.625F, -1.5F, -4.125F);
		LeftHair2.addChild(Hair11);
		setRotationAngle(Hair11, 2.6471F, -0.0378F, 0.5289F);
		Hair11.cubeList.add(new ModelBox(Hair11, 44, 3, -2.9965F, -2.9637F, -2.7735F, 3, 9, 3, 0.0F));

		RightHair2 = new ModelRenderer(this);
		RightHair2.setRotationPoint(1.875F, -8.5F, 1.625F);
		Hair.addChild(RightHair2);
		setRotationAngle(RightHair2, 0.0F, 0.0F, 0.0873F);


		Hair15 = new ModelRenderer(this);
		Hair15.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightHair2.addChild(Hair15);
		setRotationAngle(Hair15, 2.4826F, -0.1957F, -0.2441F);


		Hair10_r3 = new ModelRenderer(this);
		Hair10_r3.setRotationPoint(1.625F, 37.75F, -1.125F);
		Hair15.addChild(Hair10_r3);
		setRotationAngle(Hair10_r3, 0.028F, 0.0466F, -0.0676F);
		Hair10_r3.cubeList.add(new ModelBox(Hair10_r3, 44, 2, -4.3582F, -39.4122F, -2.9956F, 3, 9, 3, 0.0F));

		Hair16 = new ModelRenderer(this);
		Hair16.setRotationPoint(-4.625F, -3.5F, 0.875F);
		RightHair2.addChild(Hair16);
		setRotationAngle(Hair16, 2.6616F, -0.0873F, -0.349F);
		Hair16.cubeList.add(new ModelBox(Hair16, 45, 4, -3.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		Hair17 = new ModelRenderer(this);
		Hair17.setRotationPoint(-4.625F, -3.5F, 1.5F);
		RightHair2.addChild(Hair17);
		setRotationAngle(Hair17, 2.5808F, -0.111F, -0.5896F);
		Hair17.cubeList.add(new ModelBox(Hair17, 47, 3, -3.7465F, -5.4638F, -4.0235F, 3, 9, 3, 0.0F));

		Hair18 = new ModelRenderer(this);
		Hair18.setRotationPoint(-3.125F, -2.75F, 2.125F);
		RightHair2.addChild(Hair18);
		setRotationAngle(Hair18, -0.537F, 0.0696F, -0.0448F);
		Hair18.cubeList.add(new ModelBox(Hair18, 45, 0, 0.5584F, -6.4925F, -4.9642F, 3, 12, 3, 0.0F));

		Hair19 = new ModelRenderer(this);
		Hair19.setRotationPoint(-6.625F, -1.5F, -4.125F);
		RightHair2.addChild(Hair19);
		setRotationAngle(Hair19, 2.6471F, 0.0378F, -0.5289F);
		Hair19.cubeList.add(new ModelBox(Hair19, 44, 3, -0.0035F, -2.9637F, -2.7735F, 3, 9, 3, 0.0F));

		Hair20 = new ModelRenderer(this);
		Hair20.setRotationPoint(-2.125F, -1.5F, -2.625F);
		RightHair2.addChild(Hair20);
		setRotationAngle(Hair20, -0.1571F, 0.0F, -0.3665F);
		Hair20.cubeList.add(new ModelBox(Hair20, 44, 3, -3.8218F, -5.9868F, -3.4559F, 3, 9, 3, 0.0F));

		Hair27 = new ModelRenderer(this);
		Hair27.setRotationPoint(-1.725F, -1.55F, -0.275F);
		RightHair2.addChild(Hair27);
		setRotationAngle(Hair27, -0.5375F, -0.065F, -0.2696F);
		Hair27.cubeList.add(new ModelBox(Hair27, 45, 0, -1.8584F, -8.3925F, -3.9643F, 3, 13, 3, 0.0F));

		Hair33 = new ModelRenderer(this);
		Hair33.setRotationPoint(-1.3151F, -3.5F, 2.375F);
		RightHair2.addChild(Hair33);
		setRotationAngle(Hair33, 2.314F, -0.0956F, 0.001F);
		Hair33.cubeList.add(new ModelBox(Hair33, 45, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		Hair34 = new ModelRenderer(this);
		Hair34.setRotationPoint(-3.3151F, -2.5F, 0.125F);
		RightHair2.addChild(Hair34);
		setRotationAngle(Hair34, 2.3153F, 0.0822F, -0.1914F);
		Hair34.cubeList.add(new ModelBox(Hair34, 44, 0, 0.1215F, -4.2137F, -1.5235F, 3, 11, 3, 0.0F));

		Hair35 = new ModelRenderer(this);
		Hair35.setRotationPoint(-2.4349F, -3.5F, 2.375F);
		RightHair2.addChild(Hair35);
		setRotationAngle(Hair35, 2.314F, 0.0956F, -0.001F);
		Hair35.cubeList.add(new ModelBox(Hair35, 45, 4, -3.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		Hair36 = new ModelRenderer(this);
		Hair36.setRotationPoint(-1.2676F, 4.8787F, 0.8348F);
		RightHair2.addChild(Hair36);
		setRotationAngle(Hair36, 2.5322F, 0.0956F, -0.001F);
		Hair36.cubeList.add(new ModelBox(Hair36, 45, 0, -2.6242F, -0.2444F, -1.0162F, 3, 11, 3, 0.0F));

		RightHair1 = new ModelRenderer(this);
		RightHair1.setRotationPoint(0.875F, -7.5F, 1.625F);
		Hair.addChild(RightHair1);
		setRotationAngle(RightHair1, 0.0F, 0.0F, -0.2182F);


		Hair21 = new ModelRenderer(this);
		Hair21.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightHair1.addChild(Hair21);
		setRotationAngle(Hair21, 2.4826F, -0.1957F, -0.2441F);


		Hair10_r4 = new ModelRenderer(this);
		Hair10_r4.setRotationPoint(1.625F, 37.75F, -1.125F);
		Hair21.addChild(Hair10_r4);
		setRotationAngle(Hair10_r4, 0.028F, 0.0466F, -0.0676F);
		Hair10_r4.cubeList.add(new ModelBox(Hair10_r4, 44, 2, -4.4607F, -39.7225F, -2.6172F, 3, 5, 3, 0.0F));

		Hair22 = new ModelRenderer(this);
		Hair22.setRotationPoint(-4.625F, -3.5F, 0.875F);
		RightHair1.addChild(Hair22);
		setRotationAngle(Hair22, 2.6616F, -0.0873F, -0.349F);
		Hair22.cubeList.add(new ModelBox(Hair22, 45, 4, -3.1215F, -6.2137F, -1.5235F, 3, 7, 3, 0.0F));

		Hair23 = new ModelRenderer(this);
		Hair23.setRotationPoint(-4.625F, -3.5F, 1.5F);
		RightHair1.addChild(Hair23);
		setRotationAngle(Hair23, 2.5808F, -0.111F, -0.5896F);
		Hair23.cubeList.add(new ModelBox(Hair23, 47, 3, -3.7465F, -5.4638F, -4.0235F, 3, 6, 3, 0.0F));

		Hair24 = new ModelRenderer(this);
		Hair24.setRotationPoint(-6.625F, -1.5F, -4.125F);
		RightHair1.addChild(Hair24);
		setRotationAngle(Hair24, 2.6471F, 0.0378F, -0.5289F);
		Hair24.cubeList.add(new ModelBox(Hair24, 44, 3, -0.0035F, -2.9637F, -2.7735F, 3, 7, 3, 0.0F));

		Hair25 = new ModelRenderer(this);
		Hair25.setRotationPoint(-2.125F, -3.5F, -1.625F);
		RightHair1.addChild(Hair25);
		setRotationAngle(Hair25, -0.1571F, 0.0F, -0.3665F);
		Hair25.cubeList.add(new ModelBox(Hair25, 44, 3, -3.8254F, -3.9275F, -3.75F, 3, 7, 3, 0.0F));

		LeftHair3 = new ModelRenderer(this);
		LeftHair3.setRotationPoint(-1.875F, -8.5F, 1.625F);
		Hair.addChild(LeftHair3);
		setRotationAngle(LeftHair3, 0.0F, 0.0F, -0.0873F);


		Hair28 = new ModelRenderer(this);
		Hair28.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftHair3.addChild(Hair28);
		setRotationAngle(Hair28, 2.4826F, 0.1957F, 0.2441F);


		Hair10_r5 = new ModelRenderer(this);
		Hair10_r5.setRotationPoint(-1.625F, 37.75F, -1.125F);
		Hair28.addChild(Hair10_r5);
		setRotationAngle(Hair10_r5, 0.028F, -0.0466F, 0.0676F);
		Hair10_r5.cubeList.add(new ModelBox(Hair10_r5, 44, 2, 1.3582F, -39.4122F, -2.9956F, 3, 9, 3, 0.0F));

		Hair29 = new ModelRenderer(this);
		Hair29.setRotationPoint(4.625F, -3.5F, 0.875F);
		LeftHair3.addChild(Hair29);
		setRotationAngle(Hair29, 2.6616F, 0.0873F, 0.349F);
		Hair29.cubeList.add(new ModelBox(Hair29, 45, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		Hair30 = new ModelRenderer(this);
		Hair30.setRotationPoint(4.625F, -3.5F, 1.5F);
		LeftHair3.addChild(Hair30);
		setRotationAngle(Hair30, 2.5808F, 0.111F, 0.5896F);
		Hair30.cubeList.add(new ModelBox(Hair30, 47, 3, 0.7465F, -5.4638F, -4.0235F, 3, 9, 3, 0.0F));

		Hair31 = new ModelRenderer(this);
		Hair31.setRotationPoint(6.625F, -1.5F, -4.125F);
		LeftHair3.addChild(Hair31);
		setRotationAngle(Hair31, 2.6471F, -0.0378F, 0.5289F);
		Hair31.cubeList.add(new ModelBox(Hair31, 44, 3, -2.9965F, -2.9637F, -2.7735F, 3, 9, 3, 0.0F));

		Hair32 = new ModelRenderer(this);
		Hair32.setRotationPoint(2.125F, -1.5F, -2.625F);
		LeftHair3.addChild(Hair32);
		setRotationAngle(Hair32, -0.1571F, 0.0F, 0.3665F);
		Hair32.cubeList.add(new ModelBox(Hair32, 44, 3, 0.8218F, -5.9868F, -3.3559F, 3, 9, 3, 0.0F));

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
