package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelXicorSsj extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair1_r1;
	private final ModelRenderer Hair1_r2;
	private final ModelRenderer Hair1_r3;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair3_r1;
	private final ModelRenderer Hair4;
	private final ModelRenderer Head4_r1;
	private final ModelRenderer Head4_r2;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair5_r1;
	private final ModelRenderer Hair5_r2;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair6_r1;
	private final ModelRenderer Hair6_r2;
	private final ModelRenderer Hair7;
	private final ModelRenderer Hair7_r1;
	private final ModelRenderer Hair7_r2;
	private final ModelRenderer Hair8;
	private final ModelRenderer Hair8_r1;
	private final ModelRenderer Hair8_r2;
	private final ModelRenderer Hair9;
	private final ModelRenderer Hair9_r1;
	private final ModelRenderer Hair9_r2;
	private final ModelRenderer Hair10;
	private final ModelRenderer Hair10_r1;
	private final ModelRenderer Hair10_r2;
	private final ModelRenderer Hair11;
	private final ModelRenderer Hair11_r1;
	private final ModelRenderer Hair11_r2;
	private final ModelRenderer Hair12;
	private final ModelRenderer Hair13;
	private final ModelRenderer Hair13_r1;
	private final ModelRenderer Hair13_r2;
	private final ModelRenderer Hair14;
	private final ModelRenderer Hair14_r1;
	private final ModelRenderer Hair14_r2;
	private final ModelRenderer Hair15;
	private final ModelRenderer Hair15_r1;
	private final ModelRenderer Hair15_r2;
	private final ModelRenderer Hair17;
	private final ModelRenderer Hair18;
	private final ModelRenderer Hair18_r1;
	private final ModelRenderer Hair18_r2;
	private final ModelRenderer Hair19;
	private final ModelRenderer Hair19_r1;
	private final ModelRenderer Hair19_r2;
	private final ModelRenderer Hair20;
	private final ModelRenderer Hair20_r1;
	private final ModelRenderer Hair20_r2;
	private final ModelRenderer Hair22;
	private final ModelRenderer Hair23;
	private final ModelRenderer Hair23_r1;
	private final ModelRenderer Hair23_r2;
	private final ModelRenderer Hair24;
	private final ModelRenderer Hair24_r1;
	private final ModelRenderer Hair24_r2;
	private final ModelRenderer Hair25;
	private final ModelRenderer Hair25_r1;
	private final ModelRenderer Hair25_r2;
	private final ModelRenderer Hair27;
	private final ModelRenderer Hair28;
	private final ModelRenderer Hair28_r1;
	private final ModelRenderer Hair30;
	private final ModelRenderer Hair30_r1;
	private final ModelRenderer Hair30_r2;
	private final ModelRenderer Hair31;
	private final ModelRenderer Hair31_r1;
	private final ModelRenderer Hair31_r2;
	private final ModelRenderer Hair32;
	private final ModelRenderer Hair32_r1;
	private final ModelRenderer Hair32_r2;
	private final ModelRenderer Hair33;
	private final ModelRenderer Hair33_r1;
	private final ModelRenderer Hair33_r2;
	private final ModelRenderer Hair34;
	private final ModelRenderer Hair34_r1;
	private final ModelRenderer Hair34_r2;
	private final ModelRenderer Hair35;
	private final ModelRenderer Hair35_r1;
	private final ModelRenderer Hair35_r2;
	private final ModelRenderer Hair36;
	private final ModelRenderer Hair36_r1;
	private final ModelRenderer Hair36_r2;
	private final ModelRenderer Hair37;
	private final ModelRenderer Hair37_r1;
	private final ModelRenderer Hair37_r2;
	private final ModelRenderer Hair38;
	private final ModelRenderer Hair39;
	private final ModelRenderer Hair40;
	private final ModelRenderer Hair41;
	private final ModelRenderer Hair42;
	private final ModelRenderer Hair43;
	private final ModelRenderer Hair44;
	private final ModelRenderer Hair45;
	private final ModelRenderer Hair46;
	private final ModelRenderer Hair47;
	private final ModelRenderer Hair16;
	private final ModelRenderer Head4_r3;
	private final ModelRenderer Head4_r4;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public ModelXicorSsj(float _scale) {
        textureWidth = 128;
        textureHeight = 128;

        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.4F, 0.5F, -3.5F);
		bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, -0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 3, 69, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.4F, 0.5F, -3.5F);
		bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 69, -1.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, -10.0F, 0.5F);
		bipedHead.addChild(Hair1);


		Hair1_r1 = new ModelRenderer(this);
		Hair1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair1.addChild(Hair1_r1);
		setRotationAngle(Hair1_r1, -0.8727F, 0.0F, 0.0F);
		Hair1_r1.cubeList.add(new ModelBox(Hair1_r1, 20, 16, -1.0F, -3.8434F, -1.9395F, 2, 2, 2, 0.25F));

		Hair1_r2 = new ModelRenderer(this);
		Hair1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair1.addChild(Hair1_r2);
		setRotationAngle(Hair1_r2, -0.6109F, 0.0F, 0.0F);
		Hair1_r2.cubeList.add(new ModelBox(Hair1_r2, 40, 26, -2.0F, -2.8434F, -2.1895F, 4, 3, 4, 0.0F));

		Hair1_r3 = new ModelRenderer(this);
		Hair1_r3.setRotationPoint(0.0F, 3.0F, -1.0F);
		Hair1.addChild(Hair1_r3);
		setRotationAngle(Hair1_r3, -0.2618F, 0.0F, 0.0F);
		Hair1_r3.cubeList.add(new ModelBox(Hair1_r3, 24, 16, -3.0F, -4.0F, -3.0F, 6, 4, 6, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(0.0F, 34.0F, -0.5F);
		Hair1.addChild(Hair2);


		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(2.0F, -31.0F, -3.75F);
		Hair2.addChild(Hair3);
		setRotationAngle(Hair3, 0.6921F, -0.6034F, 0.2497F);


		Hair3_r1 = new ModelRenderer(this);
		Hair3_r1.setRotationPoint(2.0F, -0.4F, 0.0F);
		Hair3.addChild(Hair3_r1);
		setRotationAngle(Hair3_r1, -0.3054F, 0.0F, 0.0F);
		Hair3_r1.cubeList.add(new ModelBox(Hair3_r1, 8, 50, -2.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(1.0F, -26.7F, 2.8F);
		Hair2.addChild(Hair4);
		setRotationAngle(Hair4, -1.4138F, 0.5906F, 0.5367F);


		Head4_r1 = new ModelRenderer(this);
		Head4_r1.setRotationPoint(3.0F, -2.0F, 0.0F);
		Hair4.addChild(Head4_r1);
		setRotationAngle(Head4_r1, -0.3054F, 0.0F, 0.0F);
		Head4_r1.cubeList.add(new ModelBox(Head4_r1, 48, 20, -2.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F));

		Head4_r2 = new ModelRenderer(this);
		Head4_r2.setRotationPoint(3.0F, -2.0F, 0.0F);
		Hair4.addChild(Head4_r2);
		setRotationAngle(Head4_r2, -0.7854F, 0.0F, 0.0F);
		Head4_r2.cubeList.add(new ModelBox(Head4_r2, 48, 33, -2.0F, 1.0F, -6.0F, 2, 2, 4, -0.25F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(2.0F, -30.0F, 0.0F);
		Hair2.addChild(Hair5);
		setRotationAngle(Hair5, -0.4832F, -0.1201F, 0.4524F);


		Hair5_r1 = new ModelRenderer(this);
		Hair5_r1.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair5.addChild(Hair5_r1);
		setRotationAngle(Hair5_r1, -0.3054F, 0.0F, 0.0F);
		Hair5_r1.cubeList.add(new ModelBox(Hair5_r1, 48, 6, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair5_r2 = new ModelRenderer(this);
		Hair5_r2.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair5.addChild(Hair5_r2);
		setRotationAngle(Hair5_r2, -0.7854F, 0.0F, 0.0F);
		Hair5_r2.cubeList.add(new ModelBox(Hair5_r2, 48, 12, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(3.0F, -29.0F, 0.5F);
		Hair2.addChild(Hair6);
		setRotationAngle(Hair6, -0.948F, 0.0979F, 0.4651F);


		Hair6_r1 = new ModelRenderer(this);
		Hair6_r1.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair6.addChild(Hair6_r1);
		setRotationAngle(Hair6_r1, -0.3054F, 0.0F, 0.0F);
		Hair6_r1.cubeList.add(new ModelBox(Hair6_r1, 0, 48, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair6_r2 = new ModelRenderer(this);
		Hair6_r2.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair6.addChild(Hair6_r2);
		setRotationAngle(Hair6_r2, -0.7854F, 0.0F, 0.0F);
		Hair6_r2.cubeList.add(new ModelBox(Hair6_r2, 48, 0, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(3.0F, -30.0F, -1.75F);
		Hair2.addChild(Hair7);
		setRotationAngle(Hair7, -0.496F, -1.1006F, 1.1855F);


		Hair7_r1 = new ModelRenderer(this);
		Hair7_r1.setRotationPoint(2.0F, 0.0F, 0.0F);
		Hair7.addChild(Hair7_r1);
		setRotationAngle(Hair7_r1, -0.3054F, 0.0F, 0.0F);
		Hair7_r1.cubeList.add(new ModelBox(Hair7_r1, 14, 46, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair7_r2 = new ModelRenderer(this);
		Hair7_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
		Hair7.addChild(Hair7_r2);
		setRotationAngle(Hair7_r2, -0.7854F, 0.0F, 0.0F);
		Hair7_r2.cubeList.add(new ModelBox(Hair7_r2, 28, 46, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(2.0F, -31.0F, 1.25F);
		Hair2.addChild(Hair8);
		setRotationAngle(Hair8, -0.2779F, -1.1006F, 1.1855F);


		Hair8_r1 = new ModelRenderer(this);
		Hair8_r1.setRotationPoint(2.0F, 0.0F, 0.0F);
		Hair8.addChild(Hair8_r1);
		setRotationAngle(Hair8_r1, -0.3054F, 0.0F, 0.0F);
		Hair8_r1.cubeList.add(new ModelBox(Hair8_r1, 0, 0, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair8_r2 = new ModelRenderer(this);
		Hair8_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
		Hair8.addChild(Hair8_r2);
		setRotationAngle(Hair8_r2, -0.7854F, 0.0F, 0.0F);
		Hair8_r2.cubeList.add(new ModelBox(Hair8_r2, 0, 0, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(2.0F, -30.0F, -2.5F);
		Hair2.addChild(Hair9);
		setRotationAngle(Hair9, 0.2305F, -0.7924F, 0.5005F);


		Hair9_r1 = new ModelRenderer(this);
		Hair9_r1.setRotationPoint(2.0F, 0.0F, 0.0F);
		Hair9.addChild(Hair9_r1);
		setRotationAngle(Hair9_r1, -0.3054F, 0.0F, 0.0F);
		Hair9_r1.cubeList.add(new ModelBox(Hair9_r1, 42, 16, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair9_r2 = new ModelRenderer(this);
		Hair9_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
		Hair9.addChild(Hair9_r2);
		setRotationAngle(Hair9_r2, -0.7854F, 0.0F, 0.0F);
		Hair9_r2.cubeList.add(new ModelBox(Hair9_r2, 22, 42, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(3.25F, -28.0F, -3.0F);
		Hair2.addChild(Hair10);
		setRotationAngle(Hair10, 0.0196F, -0.8854F, 1.145F);


		Hair10_r1 = new ModelRenderer(this);
		Hair10_r1.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair10.addChild(Hair10_r1);
		setRotationAngle(Hair10_r1, -0.3054F, 0.0F, 0.0F);
		Hair10_r1.cubeList.add(new ModelBox(Hair10_r1, 16, 32, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair10_r2 = new ModelRenderer(this);
		Hair10_r2.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair10.addChild(Hair10_r2);
		setRotationAngle(Hair10_r2, -0.7854F, 0.0F, 0.0F);
		Hair10_r2.cubeList.add(new ModelBox(Hair10_r2, 16, 38, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(3.0F, -28.0F, -2.0F);
		Hair2.addChild(Hair11);
		setRotationAngle(Hair11, -0.2643F, -0.2351F, 1.2298F);


		Hair11_r1 = new ModelRenderer(this);
		Hair11_r1.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair11.addChild(Hair11_r1);
		setRotationAngle(Hair11_r1, -0.3054F, 0.0F, 0.0F);
		Hair11_r1.cubeList.add(new ModelBox(Hair11_r1, 0, 0, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair11_r2 = new ModelRenderer(this);
		Hair11_r2.setRotationPoint(3.0F, 0.0F, 2.0F);
		Hair11.addChild(Hair11_r2);
		setRotationAngle(Hair11_r2, -0.7854F, 0.0F, 0.0F);
		Hair11_r2.cubeList.add(new ModelBox(Hair11_r2, 24, 0, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair12 = new ModelRenderer(this);
		Hair12.setRotationPoint(0.0F, 5.0F, 0.0F);
		Hair1.addChild(Hair12);
		setRotationAngle(Hair12, -0.0453F, 0.478F, -0.0983F);


		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(1.0F, -2.0F, 2.5F);
		Hair12.addChild(Hair13);
		setRotationAngle(Hair13, -0.4456F, 0.1974F, -0.0934F);


		Hair13_r1 = new ModelRenderer(this);
		Hair13_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair13.addChild(Hair13_r1);
		setRotationAngle(Hair13_r1, -0.3054F, 0.0F, 0.0F);
		Hair13_r1.cubeList.add(new ModelBox(Hair13_r1, 14, 54, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair13_r2 = new ModelRenderer(this);
		Hair13_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair13.addChild(Hair13_r2);
		setRotationAngle(Hair13_r2, -0.7854F, 0.0F, 0.0F);
		Hair13_r2.cubeList.add(new ModelBox(Hair13_r2, 54, 16, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(1.0F, -2.0F, 2.5F);
		Hair12.addChild(Hair14);
		setRotationAngle(Hair14, -1.3526F, 0.0F, 0.0F);


		Hair14_r1 = new ModelRenderer(this);
		Hair14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair14.addChild(Hair14_r1);
		setRotationAngle(Hair14_r1, -0.3054F, 0.0F, 0.0F);
		Hair14_r1.cubeList.add(new ModelBox(Hair14_r1, 50, 52, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair14_r2 = new ModelRenderer(this);
		Hair14_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair14.addChild(Hair14_r2);
		setRotationAngle(Hair14_r2, -0.7854F, 0.0F, 0.0F);
		Hair14_r2.cubeList.add(new ModelBox(Hair14_r2, 0, 54, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair15 = new ModelRenderer(this);
		Hair15.setRotationPoint(1.0F, 0.0F, 2.5F);
		Hair12.addChild(Hair15);
		setRotationAngle(Hair15, -1.8328F, 0.0421F, -0.0113F);


		Hair15_r1 = new ModelRenderer(this);
		Hair15_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair15.addChild(Hair15_r1);
		setRotationAngle(Hair15_r1, -0.3054F, 0.0F, 0.0F);
		Hair15_r1.cubeList.add(new ModelBox(Hair15_r1, 52, 39, -2.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair15_r2 = new ModelRenderer(this);
		Hair15_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair15.addChild(Hair15_r2);
		setRotationAngle(Hair15_r2, -0.7854F, 0.0F, 0.0F);
		Hair15_r2.cubeList.add(new ModelBox(Hair15_r2, 52, 45, -2.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair17 = new ModelRenderer(this);
		Hair17.setRotationPoint(0.0F, 5.0F, 0.0F);
		Hair1.addChild(Hair17);
		setRotationAngle(Hair17, -0.0453F, -0.478F, 0.0983F);


		Hair18 = new ModelRenderer(this);
		Hair18.setRotationPoint(-1.0F, -2.0F, 2.5F);
		Hair17.addChild(Hair18);
		setRotationAngle(Hair18, -0.4456F, -0.1974F, 0.0934F);


		Hair18_r1 = new ModelRenderer(this);
		Hair18_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair18.addChild(Hair18_r1);
		setRotationAngle(Hair18_r1, -0.3054F, 0.0F, 0.0F);
		Hair18_r1.cubeList.add(new ModelBox(Hair18_r1, 44, 56, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair18_r2 = new ModelRenderer(this);
		Hair18_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair18.addChild(Hair18_r2);
		setRotationAngle(Hair18_r2, -0.7854F, 0.0F, 0.0F);
		Hair18_r2.cubeList.add(new ModelBox(Hair18_r2, 56, 56, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair19 = new ModelRenderer(this);
		Hair19.setRotationPoint(-1.0F, -2.0F, 2.5F);
		Hair17.addChild(Hair19);
		setRotationAngle(Hair19, -1.3526F, 0.0F, 0.0F);


		Hair19_r1 = new ModelRenderer(this);
		Hair19_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair19.addChild(Hair19_r1);
		setRotationAngle(Hair19_r1, -0.3054F, 0.0F, 0.0F);
		Hair19_r1.cubeList.add(new ModelBox(Hair19_r1, 22, 56, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair19_r2 = new ModelRenderer(this);
		Hair19_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair19.addChild(Hair19_r2);
		setRotationAngle(Hair19_r2, -0.7854F, 0.0F, 0.0F);
		Hair19_r2.cubeList.add(new ModelBox(Hair19_r2, 56, 30, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair20 = new ModelRenderer(this);
		Hair20.setRotationPoint(-1.0F, 0.0F, 2.5F);
		Hair17.addChild(Hair20);
		setRotationAngle(Hair20, -1.8328F, -0.0421F, 0.0113F);


		Hair20_r1 = new ModelRenderer(this);
		Hair20_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair20.addChild(Hair20_r1);
		setRotationAngle(Hair20_r1, -0.3054F, 0.0F, 0.0F);
		Hair20_r1.cubeList.add(new ModelBox(Hair20_r1, 56, 0, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair20_r2 = new ModelRenderer(this);
		Hair20_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair20.addChild(Hair20_r2);
		setRotationAngle(Hair20_r2, -0.7854F, 0.0F, 0.0F);
		Hair20_r2.cubeList.add(new ModelBox(Hair20_r2, 56, 6, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair22 = new ModelRenderer(this);
		Hair22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair1.addChild(Hair22);


		Hair23 = new ModelRenderer(this);
		Hair23.setRotationPoint(-1.0F, 3.0F, 2.5F);
		Hair22.addChild(Hair23);
		setRotationAngle(Hair23, -0.3054F, 0.0F, 0.0F);


		Hair23_r1 = new ModelRenderer(this);
		Hair23_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair23.addChild(Hair23_r1);
		setRotationAngle(Hair23_r1, -0.3054F, 0.0F, 0.0F);
		Hair23_r1.cubeList.add(new ModelBox(Hair23_r1, 60, 36, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair23_r2 = new ModelRenderer(this);
		Hair23_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair23.addChild(Hair23_r2);
		setRotationAngle(Hair23_r2, -0.7854F, 0.0F, 0.0F);
		Hair23_r2.cubeList.add(new ModelBox(Hair23_r2, 38, 60, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair24 = new ModelRenderer(this);
		Hair24.setRotationPoint(-1.0F, 2.0F, 2.5F);
		Hair22.addChild(Hair24);
		setRotationAngle(Hair24, 1.5708F, 0.0F, 0.0F);


		Hair24_r1 = new ModelRenderer(this);
		Hair24_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair24.addChild(Hair24_r1);
		setRotationAngle(Hair24_r1, 0.3054F, 0.0F, 0.0F);
		Hair24_r1.cubeList.add(new ModelBox(Hair24_r1, 14, 60, 0.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair24_r2 = new ModelRenderer(this);
		Hair24_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair24.addChild(Hair24_r2);
		setRotationAngle(Hair24_r2, 0.6109F, 0.0F, 0.0F);
		Hair24_r2.cubeList.add(new ModelBox(Hair24_r2, 60, 20, 0.0F, 2.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair25 = new ModelRenderer(this);
		Hair25.setRotationPoint(-1.0F, 5.0F, 2.5F);
		Hair22.addChild(Hair25);
		setRotationAngle(Hair25, -1.8326F, 0.0F, 0.0F);


		Hair25_r1 = new ModelRenderer(this);
		Hair25_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair25.addChild(Hair25_r1);
		setRotationAngle(Hair25_r1, -0.3054F, 0.0F, 0.0F);
		Hair25_r1.cubeList.add(new ModelBox(Hair25_r1, 58, 49, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair25_r2 = new ModelRenderer(this);
		Hair25_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair25.addChild(Hair25_r2);
		setRotationAngle(Hair25_r2, -0.7854F, 0.0F, 0.0F);
		Hair25_r2.cubeList.add(new ModelBox(Hair25_r2, 60, 12, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair27 = new ModelRenderer(this);
		Hair27.setRotationPoint(0.0F, 34.0F, -0.5F);
		Hair1.addChild(Hair27);


		Hair28 = new ModelRenderer(this);
		Hair28.setRotationPoint(-2.0F, -31.0F, -3.75F);
		Hair27.addChild(Hair28);
		setRotationAngle(Hair28, 0.6921F, 0.6034F, -0.2497F);


		Hair28_r1 = new ModelRenderer(this);
		Hair28_r1.setRotationPoint(-2.0F, -0.4F, 0.0F);
		Hair28.addChild(Hair28_r1);
		setRotationAngle(Hair28_r1, -0.3054F, 0.0F, 0.0F);
		Hair28_r1.cubeList.add(new ModelBox(Hair28_r1, 64, 0, 0.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		Hair30 = new ModelRenderer(this);
		Hair30.setRotationPoint(-2.0F, -30.0F, 0.0F);
		Hair27.addChild(Hair30);
		setRotationAngle(Hair30, -0.4832F, 0.1201F, -0.4524F);


		Hair30_r1 = new ModelRenderer(this);
		Hair30_r1.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair30.addChild(Hair30_r1);
		setRotationAngle(Hair30_r1, -0.3054F, 0.0F, 0.0F);
		Hair30_r1.cubeList.add(new ModelBox(Hair30_r1, 0, 62, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair30_r2 = new ModelRenderer(this);
		Hair30_r2.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair30.addChild(Hair30_r2);
		setRotationAngle(Hair30_r2, -0.7854F, 0.0F, 0.0F);
		Hair30_r2.cubeList.add(new ModelBox(Hair30_r2, 22, 62, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair31 = new ModelRenderer(this);
		Hair31.setRotationPoint(-3.0F, -29.0F, 0.5F);
		Hair27.addChild(Hair31);
		setRotationAngle(Hair31, -0.948F, -0.0979F, -0.4651F);


		Hair31_r1 = new ModelRenderer(this);
		Hair31_r1.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair31.addChild(Hair31_r1);
		setRotationAngle(Hair31_r1, -0.3054F, 0.0F, 0.0F);
		Hair31_r1.cubeList.add(new ModelBox(Hair31_r1, 62, 26, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair31_r2 = new ModelRenderer(this);
		Hair31_r2.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair31.addChild(Hair31_r2);
		setRotationAngle(Hair31_r2, -0.7854F, 0.0F, 0.0F);
		Hair31_r2.cubeList.add(new ModelBox(Hair31_r2, 58, 62, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair32 = new ModelRenderer(this);
		Hair32.setRotationPoint(-3.0F, -30.0F, -1.75F);
		Hair27.addChild(Hair32);
		setRotationAngle(Hair32, -0.496F, 1.1006F, -1.1855F);


		Hair32_r1 = new ModelRenderer(this);
		Hair32_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair32.addChild(Hair32_r1);
		setRotationAngle(Hair32_r1, -0.3054F, 0.0F, 0.0F);
		Hair32_r1.cubeList.add(new ModelBox(Hair32_r1, 64, 6, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair32_r2 = new ModelRenderer(this);
		Hair32_r2.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair32.addChild(Hair32_r2);
		setRotationAngle(Hair32_r2, -0.7854F, 0.0F, 0.0F);
		Hair32_r2.cubeList.add(new ModelBox(Hair32_r2, 8, 64, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair33 = new ModelRenderer(this);
		Hair33.setRotationPoint(-2.0F, -31.0F, 1.25F);
		Hair27.addChild(Hair33);
		setRotationAngle(Hair33, -0.2779F, 1.1006F, -1.1855F);


		Hair33_r1 = new ModelRenderer(this);
		Hair33_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair33.addChild(Hair33_r1);
		setRotationAngle(Hair33_r1, -0.3054F, 0.0F, 0.0F);
		Hair33_r1.cubeList.add(new ModelBox(Hair33_r1, 0, 0, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair33_r2 = new ModelRenderer(this);
		Hair33_r2.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair33.addChild(Hair33_r2);
		setRotationAngle(Hair33_r2, -0.7854F, 0.0F, 0.0F);
		Hair33_r2.cubeList.add(new ModelBox(Hair33_r2, 0, 0, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair34 = new ModelRenderer(this);
		Hair34.setRotationPoint(-2.0F, -30.0F, -2.5F);
		Hair27.addChild(Hair34);
		setRotationAngle(Hair34, 0.2305F, 0.7924F, -0.5005F);


		Hair34_r1 = new ModelRenderer(this);
		Hair34_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair34.addChild(Hair34_r1);
		setRotationAngle(Hair34_r1, -0.3054F, 0.0F, 0.0F);
		Hair34_r1.cubeList.add(new ModelBox(Hair34_r1, 30, 64, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair34_r2 = new ModelRenderer(this);
		Hair34_r2.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Hair34.addChild(Hair34_r2);
		setRotationAngle(Hair34_r2, -0.7854F, 0.0F, 0.0F);
		Hair34_r2.cubeList.add(new ModelBox(Hair34_r2, 44, 64, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair35 = new ModelRenderer(this);
		Hair35.setRotationPoint(-3.25F, -28.0F, -3.0F);
		Hair27.addChild(Hair35);
		setRotationAngle(Hair35, 0.0196F, 0.8854F, -1.145F);


		Hair35_r1 = new ModelRenderer(this);
		Hair35_r1.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair35.addChild(Hair35_r1);
		setRotationAngle(Hair35_r1, -0.3054F, 0.0F, 0.0F);
		Hair35_r1.cubeList.add(new ModelBox(Hair35_r1, 66, 16, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair35_r2 = new ModelRenderer(this);
		Hair35_r2.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair35.addChild(Hair35_r2);
		setRotationAngle(Hair35_r2, -0.7854F, 0.0F, 0.0F);
		Hair35_r2.cubeList.add(new ModelBox(Hair35_r2, 66, 32, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair36 = new ModelRenderer(this);
		Hair36.setRotationPoint(-3.0F, -28.0F, -2.0F);
		Hair27.addChild(Hair36);
		setRotationAngle(Hair36, -0.2643F, 0.2351F, -1.2298F);


		Hair36_r1 = new ModelRenderer(this);
		Hair36_r1.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair36.addChild(Hair36_r1);
		setRotationAngle(Hair36_r1, -0.3054F, 0.0F, 0.0F);
		Hair36_r1.cubeList.add(new ModelBox(Hair36_r1, 64, 53, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair36_r2 = new ModelRenderer(this);
		Hair36_r2.setRotationPoint(-3.0F, 0.0F, 2.0F);
		Hair36.addChild(Hair36_r2);
		setRotationAngle(Hair36_r2, -0.7854F, 0.0F, 0.0F);
		Hair36_r2.cubeList.add(new ModelBox(Hair36_r2, 16, 66, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair37 = new ModelRenderer(this);
		Hair37.setRotationPoint(-1.0F, 3.0F, -4.5F);
		Hair1.addChild(Hair37);


		Hair37_r1 = new ModelRenderer(this);
		Hair37_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair37.addChild(Hair37_r1);
		setRotationAngle(Hair37_r1, -0.3054F, 0.0F, 0.0F);
		Hair37_r1.cubeList.add(new ModelBox(Hair37_r1, 52, 66, 0.0F, -4.0F, -2.0F, 2, 4, 2, 0.0F));

		Hair37_r2 = new ModelRenderer(this);
		Hair37_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair37.addChild(Hair37_r2);
		setRotationAngle(Hair37_r2, -0.7854F, 0.0F, 0.0F);
		Hair37_r2.cubeList.add(new ModelBox(Hair37_r2, 66, 46, 0.0F, -6.0F, -3.0F, 2, 4, 2, -0.25F));

		Hair38 = new ModelRenderer(this);
		Hair38.setRotationPoint(0.0F, 3.0F, -4.5F);
		Hair1.addChild(Hair38);
		setRotationAngle(Hair38, -0.5236F, 0.0F, 0.0F);


		Hair39 = new ModelRenderer(this);
		Hair39.setRotationPoint(1.6F, -1.0F, -1.0F);
		Hair38.addChild(Hair39);
		setRotationAngle(Hair39, 0.6981F, 0.0F, 0.6981F);
		Hair39.cubeList.add(new ModelBox(Hair39, 68, 22, 0.0F, -3.0F, -1.0F, 2, 4, 2, 0.0F));

		Hair40 = new ModelRenderer(this);
		Hair40.setRotationPoint(0.0F, -3.0F, -1.0F);
		Hair39.addChild(Hair40);
		setRotationAngle(Hair40, -0.5323F, -0.1309F, -0.2618F);
		Hair40.cubeList.add(new ModelBox(Hair40, 0, 68, -0.2825F, -3.0782F, 0.4928F, 2, 4, 2, -0.25F));

		Hair41 = new ModelRenderer(this);
		Hair41.setRotationPoint(-1.8F, -1.0F, -1.0F);
		Hair38.addChild(Hair41);
		setRotationAngle(Hair41, 0.6981F, 0.0F, -0.6981F);
		Hair41.cubeList.add(new ModelBox(Hair41, 64, 66, -2.0F, -3.0F, -1.0F, 2, 4, 2, 0.0F));

		Hair42 = new ModelRenderer(this);
		Hair42.setRotationPoint(0.0F, -3.0F, -1.0F);
		Hair41.addChild(Hair42);
		setRotationAngle(Hair42, -0.5323F, 0.1309F, 0.2618F);
		Hair42.cubeList.add(new ModelBox(Hair42, 66, 59, -1.7175F, -3.0782F, 0.4928F, 2, 4, 2, -0.25F));

		Hair43 = new ModelRenderer(this);
		Hair43.setRotationPoint(0.0F, 1.0F, -1.5F);
		Hair1.addChild(Hair43);
		setRotationAngle(Hair43, 0.0F, 0.0F, -3.1416F);


		Hair44 = new ModelRenderer(this);
		Hair44.setRotationPoint(0.5F, 0.0F, -1.0F);
		Hair43.addChild(Hair44);
		setRotationAngle(Hair44, -0.6811F, -0.1671F, -0.5951F);
		Hair44.cubeList.add(new ModelBox(Hair44, 36, 68, 0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F));

		Hair45 = new ModelRenderer(this);
		Hair45.setRotationPoint(0.0F, 3.0F, -1.0F);
		Hair44.addChild(Hair45);
		setRotationAngle(Hair45, 0.829F, -0.1309F, 0.2618F);
		Hair45.cubeList.add(new ModelBox(Hair45, 24, 68, -0.2825F, 0.0783F, 0.4928F, 2, 4, 2, -0.25F));

		Hair46 = new ModelRenderer(this);
		Hair46.setRotationPoint(-0.5F, 0.0F, -1.0F);
		Hair43.addChild(Hair46);
		setRotationAngle(Hair46, -0.6811F, 0.1671F, 0.5951F);
		Hair46.cubeList.add(new ModelBox(Hair46, 8, 70, -2.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F));

		Hair47 = new ModelRenderer(this);
		Hair47.setRotationPoint(0.0F, 3.0F, -1.0F);
		Hair46.addChild(Hair47);
		setRotationAngle(Hair47, 0.829F, 0.1309F, -0.2618F);
		Hair47.cubeList.add(new ModelBox(Hair47, 68, 38, -1.7175F, 0.0783F, 0.4928F, 2, 4, 2, -0.25F));

		Hair16 = new ModelRenderer(this);
		Hair16.setRotationPoint(-1.0F, -2.7F, 2.8F);
		bipedHead.addChild(Hair16);
		setRotationAngle(Hair16, -1.4138F, -0.5906F, -0.5367F);


		Head4_r3 = new ModelRenderer(this);
		Head4_r3.setRotationPoint(-3.0F, -2.0F, 0.0F);
		Hair16.addChild(Head4_r3);
		setRotationAngle(Head4_r3, -0.3054F, 0.0F, 0.0F);
		Head4_r3.cubeList.add(new ModelBox(Head4_r3, 48, 20, 0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F));

		Head4_r4 = new ModelRenderer(this);
		Head4_r4.setRotationPoint(-3.0F, -2.0F, 0.0F);
		Hair16.addChild(Head4_r4);
		setRotationAngle(Head4_r4, -0.7854F, 0.0F, 0.0F);
		Head4_r4.cubeList.add(new ModelBox(Head4_r4, 48, 33, 0.0F, 1.0F, -6.0F, 2, 2, 4, -0.25F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 3.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 36, 38, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 3.0F, 0.0F);
        bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 0, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 32, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.mirror = true;
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 24, 26, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(this.scale, this.scale, this.scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
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
