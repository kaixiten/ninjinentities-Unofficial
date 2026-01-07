package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;



public class ModelGeneral3 extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer FutreGohan;
	private final ModelRenderer FutreGohan12;
	private final ModelRenderer FutreGohan11;
	private final ModelRenderer FutreGohan10;
	private final ModelRenderer FutreGohan9;
	private final ModelRenderer FutreGohan8;
	private final ModelRenderer FutreGohan7;
	private final ModelRenderer FutreGohan6;
	private final ModelRenderer FutreGohan5;
	private final ModelRenderer FutreGohan3;
	private final ModelRenderer FutreGohan4;
	private final ModelRenderer FutreGohan2;
	private final ModelRenderer Strand4_r1;
	private final ModelRenderer XENOGohan;
	private final ModelRenderer XENOGohan2;
	private final ModelRenderer XENOGohan3;
	private final ModelRenderer XENOGohan4;
	private final ModelRenderer XENOGohan5;
	private final ModelRenderer XENOGohan6;
	private final ModelRenderer XENOGohan7;
	private final ModelRenderer gohan6_r1;
	private final ModelRenderer XENOGohan8;
	private final ModelRenderer XENOGohan9;
	private final ModelRenderer XENOGohan10;
	private final ModelRenderer XENOGohan11;
	private final ModelRenderer gohan10_r1;
	private final ModelRenderer XENOGohan12;
	private final ModelRenderer XENOGohan13;
	private final ModelRenderer XENOGohan14;
	private final ModelRenderer XENOGohan15;
	private final ModelRenderer XENOGohan16;
	private final ModelRenderer XENOGohan17;
	private final ModelRenderer XENOGohan18;
	private final ModelRenderer XENOGohan19;
	private final ModelRenderer XENOGohan20;
	private final ModelRenderer XENOGohan21;
	private final ModelRenderer XENOGohan23;
	private final ModelRenderer XENOGohan22;
	private final ModelRenderer XENOGohan24;
	private final ModelRenderer XENOGohan25;
	private final ModelRenderer XENOGohan26;
	private final ModelRenderer XENOGohan27;
	private final ModelRenderer XENOGohan28;
	private final ModelRenderer XENOGohanSsjThree;
	private final ModelRenderer XENOGohanSsjThree2;
	private final ModelRenderer hair1_r7;
	private final ModelRenderer XENOGohanSsjThree3;
	private final ModelRenderer XENOGohanSsjThree4;
	private final ModelRenderer XENOGohanSsjThree5;
	private final ModelRenderer XENOGohanSsjThree7;
	private final ModelRenderer XENOGohanSsjThree6;
	private final ModelRenderer XENOGohanSsjThree8;
	private final ModelRenderer XENOGohanSsjThree9;
	private final ModelRenderer XENOGohanSsjThree10;
	private final ModelRenderer XENOGohanSsjThree11;
	private final ModelRenderer XENOGohanSsjThree12;
	private final ModelRenderer XENOGohanSsjThree13;
	private final ModelRenderer XENOGohanSsjThree14;
	private final ModelRenderer XENOGohanSsjThree15;
	private final ModelRenderer XENOGohanSsjThree16;
	private final ModelRenderer XENOGohanSsjThree17;
	private final ModelRenderer XENOGohanSsjThree18;
	private final ModelRenderer XENOGohanSsjThree19;
	private final ModelRenderer hair19_3_r1;
	private final ModelRenderer hair19_2_r1;
	private final ModelRenderer XENOGohanSsjThree20;
	private final ModelRenderer XENOGohanSsjThree21;
	private final ModelRenderer XENOGohanSsjThree22;
	private final ModelRenderer XENOGohanSsjThree23;
	private final ModelRenderer XENOGohanSsjThree24;
	private final ModelRenderer XENOGohanSsjThree25;
	private final ModelRenderer XENOGohanSsjThree26;
	private final ModelRenderer XENOGohanSsjThree27;
	private final ModelRenderer XENOGohanSsjThree28;
	private final ModelRenderer XENOGohanSsjThree29;
	private final ModelRenderer XENOGohanSsjThree30;
	private final ModelRenderer XENOGohanSsjThree31;
	private final ModelRenderer XENOGohanSsjThree32;
	private final ModelRenderer XENOGohanSsjThree33;
	private final ModelRenderer hair34_2_r1;
	private final ModelRenderer hair34_r1;
	private final ModelRenderer XENOGohanSsjThree34;
	private final ModelRenderer hair33_2_r1;
	private final ModelRenderer XENOGohanSsjThree35;
	private final ModelRenderer XENOGohanSsjThree36;
	private final ModelRenderer XENOGohanSsjThree37;
	private final ModelRenderer XENOGohanSsjThree38;
	private final ModelRenderer XENOGohanSsjThree39;
	private final ModelRenderer XENOGohanSsjThree40;
	private final ModelRenderer XENOGohanSsjThree41;
	private final ModelRenderer XENOGohan30;
	private final ModelRenderer XENOGohan31;
	private final ModelRenderer XENOGohan32;
	private final ModelRenderer XENOGohan33;
	private final ModelRenderer XENOGohan34;
	private final ModelRenderer XENOGohan35;
	private final ModelRenderer XENOGohan36;
	private final ModelRenderer XENOGohan37;
	private final ModelRenderer XENOGohan38;
	private final ModelRenderer XENOGohan39;
	private final ModelRenderer XENOGohanSsjThree42;
	private final ModelRenderer XENOGohan41;
	private final ModelRenderer XENOGohan42;
	private final ModelRenderer XENOGohan43;
	private final ModelRenderer XENOGohan44;
	private final ModelRenderer XENOGohan45;
	private final ModelRenderer XENOGohan46;
	private final ModelRenderer XENOGohan47;
	private final ModelRenderer XENOGohan48;
	private final ModelRenderer XENOGohan49;
	private final ModelRenderer XENOGohan50;
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
    public ModelGeneral3(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		FutreGohan = new ModelRenderer(this);
		FutreGohan.setRotationPoint(0.0F, -8.0F, 0.0F);
		bipedHead.addChild(FutreGohan);


		FutreGohan12 = new ModelRenderer(this);
		FutreGohan12.setRotationPoint(0.0F, 8.0F, 0.0F);
		FutreGohan.addChild(FutreGohan12);
		setRotationAngle(FutreGohan12, 0.1745F, 0.0F, -0.4363F);
		FutreGohan12.cubeList.add(new ModelBox(FutreGohan12, 33, 0, -0.4562F, -9.7503F, -0.044F, 4, 4, 4, 0.0F));

		FutreGohan11 = new ModelRenderer(this);
		FutreGohan11.setRotationPoint(3.6F, 2.5F, -1.1F);
		FutreGohan.addChild(FutreGohan11);
		setRotationAngle(FutreGohan11, 0.139F, -0.1059F, -0.5746F);
		FutreGohan11.cubeList.add(new ModelBox(FutreGohan11, 33, 9, -7.6042F, -4.6016F, 1.6979F, 4, 3, 3, 0.0F));

		FutreGohan10 = new ModelRenderer(this);
		FutreGohan10.setRotationPoint(0.0F, 8.0F, 0.0F);
		FutreGohan.addChild(FutreGohan10);
		setRotationAngle(FutreGohan10, 0.3491F, 0.0F, -0.6109F);
		FutreGohan10.cubeList.add(new ModelBox(FutreGohan10, 35, 6, 1.4915F, -10.6766F, 1.8823F, 3, 3, 3, 0.0F));

		FutreGohan9 = new ModelRenderer(this);
		FutreGohan9.setRotationPoint(0.0F, 8.0F, 0.0F);
		FutreGohan.addChild(FutreGohan9);
		setRotationAngle(FutreGohan9, 0.5236F, 0.0F, -0.7854F);
		FutreGohan9.cubeList.add(new ModelBox(FutreGohan9, 33, 8, 3.6243F, -11.1326F, 3.7879F, 2, 3, 2, 0.0F));

		FutreGohan8 = new ModelRenderer(this);
		FutreGohan8.setRotationPoint(3.6F, 2.5F, -1.1F);
		FutreGohan.addChild(FutreGohan8);
		setRotationAngle(FutreGohan8, 0.2811F, -0.2098F, -0.6843F);
		FutreGohan8.cubeList.add(new ModelBox(FutreGohan8, 39, 11, -8.3987F, -4.5511F, 3.1329F, 3, 2, 2, 0.0F));

		FutreGohan7 = new ModelRenderer(this);
		FutreGohan7.setRotationPoint(-3.846F, 1.1409F, -0.9554F);
		FutreGohan.addChild(FutreGohan7);
		setRotationAngle(FutreGohan7, 0.2783F, -0.2681F, -0.2961F);
		FutreGohan7.cubeList.add(new ModelBox(FutreGohan7, 33, 0, -3.0973F, -0.7019F, 0.9995F, 5, 2, 2, 0.0F));

		FutreGohan6 = new ModelRenderer(this);
		FutreGohan6.setRotationPoint(-0.1524F, 1.4604F, -3.5F);
		FutreGohan.addChild(FutreGohan6);
		setRotationAngle(FutreGohan6, 0.0F, 0.0F, -0.3927F);
		FutreGohan6.cubeList.add(new ModelBox(FutreGohan6, 39, 0, -1.0F, -1.3F, -1.5F, 2, 3, 3, 0.0F));

		FutreGohan5 = new ModelRenderer(this);
		FutreGohan5.setRotationPoint(-1.4631F, 0.2931F, -4.0F);
		FutreGohan.addChild(FutreGohan5);
		setRotationAngle(FutreGohan5, 0.0F, 0.0F, 0.4363F);
		FutreGohan5.cubeList.add(new ModelBox(FutreGohan5, 34, 3, -0.4031F, -0.123F, -1.0F, 1, 3, 2, 0.0F));

		FutreGohan3 = new ModelRenderer(this);
		FutreGohan3.setRotationPoint(0.0F, 7.5F, 0.0F);
		FutreGohan.addChild(FutreGohan3);
		setRotationAngle(FutreGohan3, 0.0F, -0.384F, 0.5271F);
		FutreGohan3.cubeList.add(new ModelBox(FutreGohan3, 33, 0, -11.0F, -5.2F, 1.0F, 6, 2, 2, 0.0F));

		FutreGohan4 = new ModelRenderer(this);
		FutreGohan4.setRotationPoint(1.0861F, 1.4797F, -4.0F);
		FutreGohan.addChild(FutreGohan4);
		setRotationAngle(FutreGohan4, 0.0F, 0.0F, -0.576F);
		FutreGohan4.cubeList.add(new ModelBox(FutreGohan4, 34, 0, 0.0F, -1.5F, -1.0F, 1, 3, 2, 0.0F));

		FutreGohan2 = new ModelRenderer(this);
		FutreGohan2.setRotationPoint(-2.6163F, 0.4502F, -3.8265F);
		FutreGohan.addChild(FutreGohan2);
		setRotationAngle(FutreGohan2, -0.4651F, 0.2457F, 0.3449F);


		Strand4_r1 = new ModelRenderer(this);
		Strand4_r1.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
		FutreGohan2.addChild(Strand4_r1);
		setRotationAngle(Strand4_r1, 0.3046F, -0.3684F, 0.2431F);
		Strand4_r1.cubeList.add(new ModelBox(Strand4_r1, 33, 1, -0.5926F, -2.4717F, -0.8594F, 2, 3, 2, 0.0F));

		XENOGohan = new ModelRenderer(this);
		XENOGohan.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(XENOGohan);


		XENOGohan2 = new ModelRenderer(this);
		XENOGohan2.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan2);
		setRotationAngle(XENOGohan2, -0.1745F, 0.0F, 0.0F);
		XENOGohan2.cubeList.add(new ModelBox(XENOGohan2, 6, 52, -1.0F, -10.0F, -5.0667F, 4, 4, 4, 0.0F));

		XENOGohan3 = new ModelRenderer(this);
		XENOGohan3.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan3);
		setRotationAngle(XENOGohan3, -0.3665F, 0.0F, 0.0F);
		XENOGohan3.cubeList.add(new ModelBox(XENOGohan3, 0, 51, -0.5F, -11.0F, -6.0F, 3, 2, 3, 0.0F));

		XENOGohan4 = new ModelRenderer(this);
		XENOGohan4.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan4);
		setRotationAngle(XENOGohan4, -0.5585F, 0.0F, 0.0F);
		XENOGohan4.cubeList.add(new ModelBox(XENOGohan4, 0, 51, 0.0F, -11.0F, -7.0F, 2, 2, 2, 0.0F));

		XENOGohan5 = new ModelRenderer(this);
		XENOGohan5.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan5);
		setRotationAngle(XENOGohan5, -0.2618F, 0.0F, -0.3665F);
		XENOGohan5.cubeList.add(new ModelBox(XENOGohan5, 6, 49, -1.5333F, -10.3F, -5.4667F, 4, 5, 4, 0.0F));

		XENOGohan6 = new ModelRenderer(this);
		XENOGohan6.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan6);
		setRotationAngle(XENOGohan6, -0.4189F, 0.0F, -0.3316F);
		XENOGohan6.cubeList.add(new ModelBox(XENOGohan6, 4, 56, -0.5F, -11.3F, -6.0F, 5, 4, 4, 0.0F));

		XENOGohan7 = new ModelRenderer(this);
		XENOGohan7.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan7);
		setRotationAngle(XENOGohan7, -0.5236F, 0.0F, -0.2269F);


		gohan6_r1 = new ModelRenderer(this);
		gohan6_r1.setRotationPoint(0.2F, -11.0F, -4.5F);
		XENOGohan7.addChild(gohan6_r1);
		setRotationAngle(gohan6_r1, 0.0F, 0.0F, -0.1745F);
		gohan6_r1.cubeList.add(new ModelBox(gohan6_r1, 0, 51, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F));

		XENOGohan8 = new ModelRenderer(this);
		XENOGohan8.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan8);
		setRotationAngle(XENOGohan8, -0.6283F, 0.0F, -0.0698F);
		XENOGohan8.cubeList.add(new ModelBox(XENOGohan8, 0, 51, 0.0F, -12.6667F, -7.0F, 2, 4, 2, 0.0F));

		XENOGohan9 = new ModelRenderer(this);
		XENOGohan9.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan9);
		setRotationAngle(XENOGohan9, -0.2269F, 0.0F, 0.4014F);
		XENOGohan9.cubeList.add(new ModelBox(XENOGohan9, 0, 51, -1.3F, -9.3F, -5.0F, 3, 5, 3, 0.0F));

		XENOGohan10 = new ModelRenderer(this);
		XENOGohan10.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan10);
		setRotationAngle(XENOGohan10, -0.4538F, 0.0F, 0.2618F);
		XENOGohan10.cubeList.add(new ModelBox(XENOGohan10, 4, 49, -0.8333F, -10.8F, -6.0F, 3, 4, 4, 0.0F));

		XENOGohan11 = new ModelRenderer(this);
		XENOGohan11.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan11);
		setRotationAngle(XENOGohan11, -0.5411F, 0.0F, 0.1745F);


		gohan10_r1 = new ModelRenderer(this);
		gohan10_r1.setRotationPoint(0.5F, -10.4667F, -4.5F);
		XENOGohan11.addChild(gohan10_r1);
		setRotationAngle(gohan10_r1, 0.0F, 0.0F, 0.1222F);
		gohan10_r1.cubeList.add(new ModelBox(gohan10_r1, 2, 49, -1.5F, -2.0F, -1.5F, 3, 4, 3, 0.0F));

		XENOGohan12 = new ModelRenderer(this);
		XENOGohan12.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan12);
		setRotationAngle(XENOGohan12, -0.2793F, 0.0F, 0.0F);
		XENOGohan12.cubeList.add(new ModelBox(XENOGohan12, 6, 49, -2.0F, -9.0F, -1.0F, 4, 5, 4, 0.0F));

		XENOGohan13 = new ModelRenderer(this);
		XENOGohan13.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan13);
		setRotationAngle(XENOGohan13, -0.2443F, 0.2618F, 0.0175F);
		XENOGohan13.cubeList.add(new ModelBox(XENOGohan13, 0, 55, -0.8F, -10.0F, -1.0F, 4, 5, 4, 0.0F));

		XENOGohan14 = new ModelRenderer(this);
		XENOGohan14.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan14);
		setRotationAngle(XENOGohan14, -0.2443F, -0.2618F, 0.0175F);
		XENOGohan14.cubeList.add(new ModelBox(XENOGohan14, 6, 52, -3.2667F, -10.0F, -1.0F, 4, 4, 4, 0.0F));

		XENOGohan15 = new ModelRenderer(this);
		XENOGohan15.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan15);
		setRotationAngle(XENOGohan15, -0.1396F, 0.0F, 0.0F);
		XENOGohan15.cubeList.add(new ModelBox(XENOGohan15, 4, 49, -2.0F, -12.0F, -1.0F, 3, 4, 4, 0.0F));

		XENOGohan16 = new ModelRenderer(this);
		XENOGohan16.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan16);
		setRotationAngle(XENOGohan16, -0.1222F, 0.1745F, 0.0F);
		XENOGohan16.cubeList.add(new ModelBox(XENOGohan16, 10, 49, -0.6F, -11.5F, 0.0F, 3, 2, 3, 0.0F));

		XENOGohan17 = new ModelRenderer(this);
		XENOGohan17.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohan.addChild(XENOGohan17);
		setRotationAngle(XENOGohan17, -0.2443F, -0.2618F, 0.0175F);
		XENOGohan17.cubeList.add(new ModelBox(XENOGohan17, 0, 49, -2.8667F, -11.5333F, -0.6667F, 3, 4, 3, 0.0F));

		XENOGohan18 = new ModelRenderer(this);
		XENOGohan18.setRotationPoint(-0.0964F, -6.4F, -3.7536F);
		XENOGohan.addChild(XENOGohan18);
		setRotationAngle(XENOGohan18, 1.1938F, 0.9183F, 0.327F);


		XENOGohan19 = new ModelRenderer(this);
		XENOGohan19.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
		XENOGohan18.addChild(XENOGohan19);
		setRotationAngle(XENOGohan19, 0.5542F, -0.24F, 0.1054F);
		XENOGohan19.cubeList.add(new ModelBox(XENOGohan19, 3, 56, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

		XENOGohan20 = new ModelRenderer(this);
		XENOGohan20.setRotationPoint(-0.3036F, -1.9F, 0.2536F);
		XENOGohan18.addChild(XENOGohan20);
		setRotationAngle(XENOGohan20, 0.0175F, 0.0F, 0.0F);


		XENOGohan21 = new ModelRenderer(this);
		XENOGohan21.setRotationPoint(0.8F, 0.295F, -3.25F);
		XENOGohan20.addChild(XENOGohan21);
		setRotationAngle(XENOGohan21, 2.4391F, -0.24F, 0.1054F);


		XENOGohan23 = new ModelRenderer(this);
		XENOGohan23.setRotationPoint(-0.09F, 0.555F, -0.1F);
		XENOGohan21.addChild(XENOGohan23);
		setRotationAngle(XENOGohan23, -0.4189F, 0.0F, 0.0F);
		XENOGohan23.cubeList.add(new ModelBox(XENOGohan23, 3, 56, -1.0F, -2.1F, -1.0F, 2, 3, 2, -0.6F));

		XENOGohan22 = new ModelRenderer(this);
		XENOGohan22.setRotationPoint(0.7F, -0.105F, -2.45F);
		XENOGohan20.addChild(XENOGohan22);
		setRotationAngle(XENOGohan22, 2.0988F, -0.24F, 0.1054F);


		XENOGohan24 = new ModelRenderer(this);
		XENOGohan24.setRotationPoint(-0.13F, 0.3293F, -0.0298F);
		XENOGohan22.addChild(XENOGohan24);
		setRotationAngle(XENOGohan24, -0.2443F, 0.0F, 0.0F);
		XENOGohan24.cubeList.add(new ModelBox(XENOGohan24, 1, 55, -1.0F, -1.0F, -0.9542F, 2, 2, 2, -0.52F));

		XENOGohan25 = new ModelRenderer(this);
		XENOGohan25.setRotationPoint(0.5F, -0.405F, -1.45F);
		XENOGohan20.addChild(XENOGohan25);
		setRotationAngle(XENOGohan25, 1.7323F, -0.24F, 0.1054F);


		XENOGohan26 = new ModelRenderer(this);
		XENOGohan26.setRotationPoint(-0.14F, 0.116F, 0.02F);
		XENOGohan25.addChild(XENOGohan26);
		setRotationAngle(XENOGohan26, -0.0873F, 0.0F, 0.0F);
		XENOGohan26.cubeList.add(new ModelBox(XENOGohan26, 5, 56, -1.0F, -1.0F, -0.988F, 2, 2, 2, -0.51F));

		XENOGohan27 = new ModelRenderer(this);
		XENOGohan27.setRotationPoint(0.2F, -0.505F, -0.65F);
		XENOGohan20.addChild(XENOGohan27);
		setRotationAngle(XENOGohan27, 1.3309F, -0.24F, 0.1054F);
		XENOGohan27.cubeList.add(new ModelBox(XENOGohan27, 3, 53, -1.03F, -0.9F, -1.075F, 2, 2, 2, -0.5F));

		XENOGohan28 = new ModelRenderer(this);
		XENOGohan28.setRotationPoint(0.0F, -0.105F, -0.15F);
		XENOGohan20.addChild(XENOGohan28);
		setRotationAngle(XENOGohan28, 0.5542F, -0.24F, 0.1054F);
		XENOGohan28.cubeList.add(new ModelBox(XENOGohan28, 3, 54, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.5F));


		XENOGohanSsjThree = new ModelRenderer(this);
		XENOGohanSsjThree.setRotationPoint(2.0F, -9.3F, -3.3F);
		bipedHead.addChild(XENOGohanSsjThree);


		XENOGohanSsjThree2 = new ModelRenderer(this);
		XENOGohanSsjThree2.setRotationPoint(-4.0F, 7.4669F, 12.0102F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree2);
		setRotationAngle(XENOGohanSsjThree2, -0.9587F, -0.2133F, -0.0902F);


		hair1_r7 = new ModelRenderer(this);
		hair1_r7.setRotationPoint(2.0F, 25.4331F, -9.8102F);
		XENOGohanSsjThree2.addChild(hair1_r7);
		setRotationAngle(hair1_r7, -0.0175F, 0.0175F, -0.0003F);
		hair1_r7.cubeList.add(new ModelBox(hair1_r7, 57, 33, -4.0F, -25.7F, 2.8102F, 4, 3, 12, -0.1F));

		XENOGohanSsjThree3 = new ModelRenderer(this);
		XENOGohanSsjThree3.setRotationPoint(0.0F, 7.6669F, 11.7102F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree3);
		setRotationAngle(XENOGohanSsjThree3, -0.9214F, 0.5763F, 0.0981F);
		XENOGohanSsjThree3.cubeList.add(new ModelBox(XENOGohanSsjThree3, 57, 33, -2.0F, -0.1669F, -7.0F, 4, 3, 12, -0.1F));

		XENOGohanSsjThree4 = new ModelRenderer(this);
		XENOGohanSsjThree4.setRotationPoint(0.0F, 0.0F, 0.0F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree4);
		setRotationAngle(XENOGohanSsjThree4, -0.4887F, 0.0F, 0.0F);
		XENOGohanSsjThree4.cubeList.add(new ModelBox(XENOGohanSsjThree4, 70, 39, -4.0F, -1.0F, 10.0F, 4, 2, 5, -0.1F));

		XENOGohanSsjThree5 = new ModelRenderer(this);
		XENOGohanSsjThree5.setRotationPoint(-2.0F, 0.9F, 10.6F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree5);
		setRotationAngle(XENOGohanSsjThree5, -0.9425F, 0.0F, 0.0F);
		XENOGohanSsjThree5.cubeList.add(new ModelBox(XENOGohanSsjThree5, 67, 37, -2.0F, 0.5059F, -3.0957F, 4, 4, 7, -0.1F));

		XENOGohanSsjThree7 = new ModelRenderer(this);
		XENOGohanSsjThree7.setRotationPoint(-4.6421F, 4.7574F, 3.8009F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree7);
		setRotationAngle(XENOGohanSsjThree7, -1.1974F, -0.844F, -0.2703F);
		XENOGohanSsjThree7.cubeList.add(new ModelBox(XENOGohanSsjThree7, 76, 38, -1.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

		XENOGohanSsjThree6 = new ModelRenderer(this);
		XENOGohanSsjThree6.setRotationPoint(-4.8748F, 9.3493F, 4.8122F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree6);
		setRotationAngle(XENOGohanSsjThree6, -2.0007F, -1.0092F, -0.3326F);
		XENOGohanSsjThree6.cubeList.add(new ModelBox(XENOGohanSsjThree6, 76, 39, 0.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

		XENOGohanSsjThree8 = new ModelRenderer(this);
		XENOGohanSsjThree8.setRotationPoint(-6.0542F, 5.7674F, 2.9604F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree8);
		setRotationAngle(XENOGohanSsjThree8, -1.5453F, -0.616F, -0.4275F);
		XENOGohanSsjThree8.cubeList.add(new ModelBox(XENOGohanSsjThree8, 77, 38, 0.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

		XENOGohanSsjThree9 = new ModelRenderer(this);
		XENOGohanSsjThree9.setRotationPoint(-6.1F, 3.3F, 1.7F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree9);
		setRotationAngle(XENOGohanSsjThree9, -0.8888F, -0.6641F, -0.0678F);
		XENOGohanSsjThree9.cubeList.add(new ModelBox(XENOGohanSsjThree9, 76, 38, 0.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

		XENOGohanSsjThree10 = new ModelRenderer(this);
		XENOGohanSsjThree10.setRotationPoint(-6.4909F, 14.7945F, 12.6914F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree10);
		setRotationAngle(XENOGohanSsjThree10, -2.8559F, -0.4654F, -0.3194F);
		XENOGohanSsjThree10.cubeList.add(new ModelBox(XENOGohanSsjThree10, 75, 39, 0.0F, -6.0F, 0.0F, 4, 6, 3, -0.15F));

		XENOGohanSsjThree11 = new ModelRenderer(this);
		XENOGohanSsjThree11.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree11);
		setRotationAngle(XENOGohanSsjThree11, -2.3269F, -0.9898F, -0.4286F);
		XENOGohanSsjThree11.cubeList.add(new ModelBox(XENOGohanSsjThree11, 77, 33, -0.8F, -10.0F, 1.0F, 3, 12, 3, -0.1F));

		XENOGohanSsjThree12 = new ModelRenderer(this);
		XENOGohanSsjThree12.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree12);
		setRotationAngle(XENOGohanSsjThree12, -2.4986F, -0.4604F, -0.3381F);
		XENOGohanSsjThree12.cubeList.add(new ModelBox(XENOGohanSsjThree12, 73, 32, 0.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

		XENOGohanSsjThree13 = new ModelRenderer(this);
		XENOGohanSsjThree13.setRotationPoint(-6.9326F, 6.5612F, 6.9193F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree13);
		setRotationAngle(XENOGohanSsjThree13, -2.1931F, -0.4604F, -0.3381F);
		XENOGohanSsjThree13.cubeList.add(new ModelBox(XENOGohanSsjThree13, 75, 39, 0.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

		XENOGohanSsjThree14 = new ModelRenderer(this);
		XENOGohanSsjThree14.setRotationPoint(-4.1834F, 1.7815F, 9.8741F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree14);
		setRotationAngle(XENOGohanSsjThree14, -1.8438F, -0.0747F, -0.5456F);
		XENOGohanSsjThree14.cubeList.add(new ModelBox(XENOGohanSsjThree14, 75, 39, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

		XENOGohanSsjThree15 = new ModelRenderer(this);
		XENOGohanSsjThree15.setRotationPoint(-7.9673F, 2.7138F, 5.9609F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree15);
		setRotationAngle(XENOGohanSsjThree15, -1.2846F, 0.1617F, -1.1107F);
		XENOGohanSsjThree15.cubeList.add(new ModelBox(XENOGohanSsjThree15, 74, 39, 0.0F, -5.0F, 0.5F, 4, 5, 3, -0.1F));

		XENOGohanSsjThree16 = new ModelRenderer(this);
		XENOGohanSsjThree16.setRotationPoint(-6.1158F, 2.3386F, 3.6304F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree16);
		setRotationAngle(XENOGohanSsjThree16, -0.7848F, 0.1116F, -0.5843F);
		XENOGohanSsjThree16.cubeList.add(new ModelBox(XENOGohanSsjThree16, 79, 41, 0.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

		XENOGohanSsjThree17 = new ModelRenderer(this);
		XENOGohanSsjThree17.setRotationPoint(-7.3049F, 0.386F, 5.2482F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree17);
		setRotationAngle(XENOGohanSsjThree17, -0.8358F, 0.3467F, -0.643F);
		XENOGohanSsjThree17.cubeList.add(new ModelBox(XENOGohanSsjThree17, 70, 33, 0.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

		XENOGohanSsjThree18 = new ModelRenderer(this);
		XENOGohanSsjThree18.setRotationPoint(-5.4154F, 0.4016F, 1.2309F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree18);
		setRotationAngle(XENOGohanSsjThree18, -0.6023F, -0.067F, -0.2533F);
		XENOGohanSsjThree18.cubeList.add(new ModelBox(XENOGohanSsjThree18, 57, 32, 1.4F, -6.0F, 0.1691F, 3, 7, 2, -0.1F));

		XENOGohanSsjThree19 = new ModelRenderer(this);
		XENOGohanSsjThree19.setRotationPoint(-1.6F, 1.0F, -0.6F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree19);
		setRotationAngle(XENOGohanSsjThree19, -0.2792F, -0.1205F, -0.5114F);
		XENOGohanSsjThree19.cubeList.add(new ModelBox(XENOGohanSsjThree19, 77, 41, -3.2744F, -3.0523F, 0.1913F, 3, 3, 2, -0.1F));

		hair19_3_r1 = new ModelRenderer(this);
		hair19_3_r1.setRotationPoint(-1.4F, -3.8F, 0.2F);
		XENOGohanSsjThree19.addChild(hair19_3_r1);
		setRotationAngle(hair19_3_r1, -0.1571F, 0.0F, 0.4363F);
		hair19_3_r1.cubeList.add(new ModelBox(hair19_3_r1, 68, 32, -1.9939F, -3.0579F, 0.1913F, 3, 3, 2, -0.5F));

		hair19_2_r1 = new ModelRenderer(this);
		hair19_2_r1.setRotationPoint(-2.4F, -2.4F, 1.0F);
		XENOGohanSsjThree19.addChild(hair19_2_r1);
		setRotationAngle(hair19_2_r1, -0.1222F, 0.0F, 0.192F);
		hair19_2_r1.cubeList.add(new ModelBox(hair19_2_r1, 79, 32, -0.9939F, -3.0579F, -0.8087F, 3, 3, 2, -0.35F));

		XENOGohanSsjThree20 = new ModelRenderer(this);
		XENOGohanSsjThree20.setRotationPoint(0.6421F, 4.9574F, 3.3009F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree20);
		setRotationAngle(XENOGohanSsjThree20, -1.2253F, 0.7601F, 0.2358F);
		XENOGohanSsjThree20.cubeList.add(new ModelBox(XENOGohanSsjThree20, 76, 38, -2.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

		XENOGohanSsjThree21 = new ModelRenderer(this);
		XENOGohanSsjThree21.setRotationPoint(0.8748F, 9.3493F, 4.8122F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree21);
		setRotationAngle(XENOGohanSsjThree21, -2.0007F, 1.0092F, 0.3326F);
		XENOGohanSsjThree21.cubeList.add(new ModelBox(XENOGohanSsjThree21, 76, 39, -3.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

		XENOGohanSsjThree22 = new ModelRenderer(this);
		XENOGohanSsjThree22.setRotationPoint(2.0542F, 5.7674F, 2.9604F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree22);
		setRotationAngle(XENOGohanSsjThree22, -1.5453F, 0.616F, 0.4275F);
		XENOGohanSsjThree22.cubeList.add(new ModelBox(XENOGohanSsjThree22, 77, 38, -2.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

		XENOGohanSsjThree23 = new ModelRenderer(this);
		XENOGohanSsjThree23.setRotationPoint(2.1F, 3.3F, 1.7F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree23);
		setRotationAngle(XENOGohanSsjThree23, -0.8888F, 0.6641F, 0.0678F);
		XENOGohanSsjThree23.cubeList.add(new ModelBox(XENOGohanSsjThree23, 76, 38, -2.2F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

		XENOGohanSsjThree24 = new ModelRenderer(this);
		XENOGohanSsjThree24.setRotationPoint(2.7909F, 14.9945F, 12.7914F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree24);
		setRotationAngle(XENOGohanSsjThree24, -2.8476F, 0.4604F, 0.3381F);
		XENOGohanSsjThree24.cubeList.add(new ModelBox(XENOGohanSsjThree24, 75, 38, -4.0F, -6.8F, 0.0F, 4, 7, 3, -0.18F));

		XENOGohanSsjThree25 = new ModelRenderer(this);
		XENOGohanSsjThree25.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree25);
		setRotationAngle(XENOGohanSsjThree25, -2.3269F, 0.9898F, 0.4286F);
		XENOGohanSsjThree25.cubeList.add(new ModelBox(XENOGohanSsjThree25, 77, 32, -2.0F, -9.8F, 1.0F, 3, 12, 3, -0.1F));

		XENOGohanSsjThree26 = new ModelRenderer(this);
		XENOGohanSsjThree26.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree26);
		setRotationAngle(XENOGohanSsjThree26, -2.4986F, 0.4604F, 0.3381F);
		XENOGohanSsjThree26.cubeList.add(new ModelBox(XENOGohanSsjThree26, 73, 32, -4.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

		XENOGohanSsjThree27 = new ModelRenderer(this);
		XENOGohanSsjThree27.setRotationPoint(2.9326F, 6.5612F, 6.9193F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree27);
		setRotationAngle(XENOGohanSsjThree27, -2.1931F, 0.4604F, 0.3381F);
		XENOGohanSsjThree27.cubeList.add(new ModelBox(XENOGohanSsjThree27, 71, 38, -4.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

		XENOGohanSsjThree28 = new ModelRenderer(this);
		XENOGohanSsjThree28.setRotationPoint(0.1834F, 1.7815F, 9.8741F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree28);
		setRotationAngle(XENOGohanSsjThree28, -1.7391F, 0.0747F, 0.5456F);
		XENOGohanSsjThree28.cubeList.add(new ModelBox(XENOGohanSsjThree28, 75, 39, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

		XENOGohanSsjThree29 = new ModelRenderer(this);
		XENOGohanSsjThree29.setRotationPoint(3.9673F, 2.7138F, 5.9609F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree29);
		setRotationAngle(XENOGohanSsjThree29, -1.3179F, -0.1955F, 1.1019F);
		XENOGohanSsjThree29.cubeList.add(new ModelBox(XENOGohanSsjThree29, 74, 39, -4.0F, -4.5F, 0.5F, 4, 5, 3, -0.1F));

		XENOGohanSsjThree30 = new ModelRenderer(this);
		XENOGohanSsjThree30.setRotationPoint(2.1158F, 2.3386F, 3.6304F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree30);
		setRotationAngle(XENOGohanSsjThree30, -0.7848F, -0.1116F, 0.5843F);
		XENOGohanSsjThree30.cubeList.add(new ModelBox(XENOGohanSsjThree30, 79, 41, -3.0F, -7.0F, -1.0F, 3, 8, 2, -0.1F));

		XENOGohanSsjThree31 = new ModelRenderer(this);
		XENOGohanSsjThree31.setRotationPoint(3.3049F, 0.386F, 5.2482F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree31);
		setRotationAngle(XENOGohanSsjThree31, -0.8358F, -0.3467F, 0.643F);
		XENOGohanSsjThree31.cubeList.add(new ModelBox(XENOGohanSsjThree31, 62, 38, -4.0F, -4.8F, 1.0F, 4, 7, 3, -0.1F));

		XENOGohanSsjThree32 = new ModelRenderer(this);
		XENOGohanSsjThree32.setRotationPoint(1.4154F, 0.4016F, 1.2309F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree32);
		setRotationAngle(XENOGohanSsjThree32, -0.6023F, 0.067F, 0.2533F);
		XENOGohanSsjThree32.cubeList.add(new ModelBox(XENOGohanSsjThree32, 62, 32, -4.0F, -5.0F, -0.7309F, 3, 7, 2, -0.1F));

		XENOGohanSsjThree33 = new ModelRenderer(this);
		XENOGohanSsjThree33.setRotationPoint(-1.775F, 1.9057F, 0.3382F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree33);
		setRotationAngle(XENOGohanSsjThree33, -0.226F, -0.0149F, -0.1213F);


		hair34_2_r1 = new ModelRenderer(this);
		hair34_2_r1.setRotationPoint(0.075F, -2.5057F, -0.0382F);
		XENOGohanSsjThree33.addChild(hair34_2_r1);
		setRotationAngle(hair34_2_r1, -0.1916F, 0.1523F, -0.2527F);
		hair34_2_r1.cubeList.add(new ModelBox(hair34_2_r1, 57, 40, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.3F));

		hair34_r1 = new ModelRenderer(this);
		hair34_r1.setRotationPoint(0.275F, -0.1057F, -0.0382F);
		XENOGohanSsjThree33.addChild(hair34_r1);
		setRotationAngle(hair34_r1, -0.0266F, 0.2955F, -0.0912F);
		hair34_r1.cubeList.add(new ModelBox(hair34_r1, 57, 40, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.15F));

		XENOGohanSsjThree34 = new ModelRenderer(this);
		XENOGohanSsjThree34.setRotationPoint(-2.0F, 1.0F, -0.5F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree34);
		setRotationAngle(XENOGohanSsjThree34, -0.253F, 0.0501F, 0.2577F);
		XENOGohanSsjThree34.cubeList.add(new ModelBox(XENOGohanSsjThree34, 77, 42, 0.0F, -2.0F, 0.2F, 3, 2, 2, 0.0F));

		hair33_2_r1 = new ModelRenderer(this);
		hair33_2_r1.setRotationPoint(1.5F, -1.8F, 1.0F);
		XENOGohanSsjThree34.addChild(hair33_2_r1);
		setRotationAngle(hair33_2_r1, 0.0F, 0.0F, 0.1571F);
		hair33_2_r1.cubeList.add(new ModelBox(hair33_2_r1, 77, 42, -1.5F, -3.0F, -1.0F, 3, 4, 2, -0.3F));

		XENOGohanSsjThree35 = new ModelRenderer(this);
		XENOGohanSsjThree35.setRotationPoint(-1.2706F, -1.3339F, 7.2587F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree35);
		setRotationAngle(XENOGohanSsjThree35, -0.7042F, 0.2118F, -0.2571F);
		XENOGohanSsjThree35.cubeList.add(new ModelBox(XENOGohanSsjThree35, 57, 32, -2.6F, -3.1F, -1.9F, 4, 6, 3, -0.1F));

		XENOGohanSsjThree36 = new ModelRenderer(this);
		XENOGohanSsjThree36.setRotationPoint(-6.0F, 7.0F, 7.0F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree36);
		setRotationAngle(XENOGohanSsjThree36, -2.5744F, 0.0F, 0.0F);
		XENOGohanSsjThree36.cubeList.add(new ModelBox(XENOGohanSsjThree36, 57, 34, 0.9972F, -11.6289F, -3.1585F, 6, 10, 3, -0.1F));

		XENOGohanSsjThree37 = new ModelRenderer(this);
		XENOGohanSsjThree37.setRotationPoint(-6.3578F, 5.4795F, 5.8429F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree37);
		setRotationAngle(XENOGohanSsjThree37, -2.671F, -0.1142F, 0.5972F);
		XENOGohanSsjThree37.cubeList.add(new ModelBox(XENOGohanSsjThree37, 57, 34, -1.2582F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

		XENOGohanSsjThree38 = new ModelRenderer(this);
		XENOGohanSsjThree38.setRotationPoint(2.0F, 7.0F, 6.2F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree38);
		setRotationAngle(XENOGohanSsjThree38, -2.7053F, -0.1745F, 0.9599F);
		XENOGohanSsjThree38.cubeList.add(new ModelBox(XENOGohanSsjThree38, 57, 34, -8.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

		XENOGohanSsjThree39 = new ModelRenderer(this);
		XENOGohanSsjThree39.setRotationPoint(2.3578F, 5.4795F, 5.8429F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree39);
		setRotationAngle(XENOGohanSsjThree39, -2.671F, 0.1142F, -0.5972F);
		XENOGohanSsjThree39.cubeList.add(new ModelBox(XENOGohanSsjThree39, 57, 34, -1.7418F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

		XENOGohanSsjThree40 = new ModelRenderer(this);
		XENOGohanSsjThree40.setRotationPoint(-6.0F, 7.0F, 6.2F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree40);
		setRotationAngle(XENOGohanSsjThree40, -2.7053F, 0.1745F, -0.9599F);
		XENOGohanSsjThree40.cubeList.add(new ModelBox(XENOGohanSsjThree40, 57, 34, 5.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

		XENOGohanSsjThree41 = new ModelRenderer(this);
		XENOGohanSsjThree41.setRotationPoint(-2.0964F, 2.9F, -0.4536F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree41);
		setRotationAngle(XENOGohanSsjThree41, 1.1938F, 0.9183F, 0.327F);


		XENOGohan30 = new ModelRenderer(this);
		XENOGohan30.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
		XENOGohanSsjThree41.addChild(XENOGohan30);
		setRotationAngle(XENOGohan30, 0.5542F, -0.24F, 0.1054F);
		XENOGohan30.cubeList.add(new ModelBox(XENOGohan30, 66, 38, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

		XENOGohan31 = new ModelRenderer(this);
		XENOGohan31.setRotationPoint(-0.3036F, -1.9F, 0.2536F);
		XENOGohanSsjThree41.addChild(XENOGohan31);
		setRotationAngle(XENOGohan31, 0.0175F, 0.0F, 0.0F);


		XENOGohan32 = new ModelRenderer(this);
		XENOGohan32.setRotationPoint(0.8F, 0.295F, -3.25F);
		XENOGohan31.addChild(XENOGohan32);
		setRotationAngle(XENOGohan32, 2.4391F, -0.24F, 0.1054F);


		XENOGohan33 = new ModelRenderer(this);
		XENOGohan33.setRotationPoint(-0.09F, 0.555F, -0.1F);
		XENOGohan32.addChild(XENOGohan33);
		setRotationAngle(XENOGohan33, -0.4189F, 0.0F, 0.0F);
		XENOGohan33.cubeList.add(new ModelBox(XENOGohan33, 66, 38, -1.0F, -2.1F, -1.0F, 2, 3, 2, -0.6F));

		XENOGohan34 = new ModelRenderer(this);
		XENOGohan34.setRotationPoint(0.7F, -0.105F, -2.45F);
		XENOGohan31.addChild(XENOGohan34);
		setRotationAngle(XENOGohan34, 2.0988F, -0.24F, 0.1054F);


		XENOGohan35 = new ModelRenderer(this);
		XENOGohan35.setRotationPoint(-0.13F, 0.3293F, -0.0298F);
		XENOGohan34.addChild(XENOGohan35);
		setRotationAngle(XENOGohan35, -0.2443F, 0.0F, 0.0F);
		XENOGohan35.cubeList.add(new ModelBox(XENOGohan35, 64, 37, -1.0F, -1.0F, -0.9542F, 2, 2, 2, -0.52F));

		XENOGohan36 = new ModelRenderer(this);
		XENOGohan36.setRotationPoint(0.5F, -0.405F, -1.45F);
		XENOGohan31.addChild(XENOGohan36);
		setRotationAngle(XENOGohan36, 1.7323F, -0.24F, 0.1054F);


		XENOGohan37 = new ModelRenderer(this);
		XENOGohan37.setRotationPoint(-0.14F, 0.116F, 0.02F);
		XENOGohan36.addChild(XENOGohan37);
		setRotationAngle(XENOGohan37, -0.0873F, 0.0F, 0.0F);
		XENOGohan37.cubeList.add(new ModelBox(XENOGohan37, 68, 38, -1.0F, -1.0F, -0.988F, 2, 2, 2, -0.51F));

		XENOGohan38 = new ModelRenderer(this);
		XENOGohan38.setRotationPoint(0.2F, -0.505F, -0.65F);
		XENOGohan31.addChild(XENOGohan38);
		setRotationAngle(XENOGohan38, 1.3309F, -0.24F, 0.1054F);
		XENOGohan38.cubeList.add(new ModelBox(XENOGohan38, 66, 35, -1.03F, -0.9F, -1.075F, 2, 2, 2, -0.5F));

		XENOGohan39 = new ModelRenderer(this);
		XENOGohan39.setRotationPoint(0.0F, -0.105F, -0.15F);
		XENOGohan31.addChild(XENOGohan39);
		setRotationAngle(XENOGohan39, 0.5542F, -0.24F, 0.1054F);
		XENOGohan39.cubeList.add(new ModelBox(XENOGohan39, 66, 36, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.5F));

		XENOGohanSsjThree42 = new ModelRenderer(this);
		XENOGohanSsjThree42.setRotationPoint(-1.9036F, 2.9F, -0.4536F);
		XENOGohanSsjThree.addChild(XENOGohanSsjThree42);
		setRotationAngle(XENOGohanSsjThree42, 1.1938F, -0.9183F, -0.327F);


		XENOGohan41 = new ModelRenderer(this);
		XENOGohan41.setRotationPoint(0.6036F, -1.205F, 0.6036F);
		XENOGohanSsjThree42.addChild(XENOGohan41);
		setRotationAngle(XENOGohan41, 0.5542F, 0.24F, -0.1054F);
		XENOGohan41.cubeList.add(new ModelBox(XENOGohan41, 66, 38, -1.04F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

		XENOGohan42 = new ModelRenderer(this);
		XENOGohan42.setRotationPoint(0.3036F, -1.9F, 0.2536F);
		XENOGohanSsjThree42.addChild(XENOGohan42);
		setRotationAngle(XENOGohan42, 0.0175F, 0.0F, 0.0F);


		XENOGohan43 = new ModelRenderer(this);
		XENOGohan43.setRotationPoint(-0.8F, 0.295F, -3.25F);
		XENOGohan42.addChild(XENOGohan43);
		setRotationAngle(XENOGohan43, 2.4391F, 0.24F, -0.1054F);


		XENOGohan44 = new ModelRenderer(this);
		XENOGohan44.setRotationPoint(0.09F, 0.555F, -0.1F);
		XENOGohan43.addChild(XENOGohan44);
		setRotationAngle(XENOGohan44, -0.4189F, 0.0F, 0.0F);
		XENOGohan44.cubeList.add(new ModelBox(XENOGohan44, 66, 38, -1.0F, -2.1F, -1.0F, 2, 3, 2, -0.6F));

		XENOGohan45 = new ModelRenderer(this);
		XENOGohan45.setRotationPoint(-0.7F, -0.105F, -2.45F);
		XENOGohan42.addChild(XENOGohan45);
		setRotationAngle(XENOGohan45, 2.0988F, 0.24F, -0.1054F);


		XENOGohan46 = new ModelRenderer(this);
		XENOGohan46.setRotationPoint(0.13F, 0.3293F, -0.0298F);
		XENOGohan45.addChild(XENOGohan46);
		setRotationAngle(XENOGohan46, -0.2443F, 0.0F, 0.0F);
		XENOGohan46.cubeList.add(new ModelBox(XENOGohan46, 64, 37, -1.0F, -1.0F, -0.9542F, 2, 2, 2, -0.52F));

		XENOGohan47 = new ModelRenderer(this);
		XENOGohan47.setRotationPoint(-0.5F, -0.405F, -1.45F);
		XENOGohan42.addChild(XENOGohan47);
		setRotationAngle(XENOGohan47, 1.7323F, 0.24F, -0.1054F);


		XENOGohan48 = new ModelRenderer(this);
		XENOGohan48.setRotationPoint(0.14F, 0.116F, 0.02F);
		XENOGohan47.addChild(XENOGohan48);
		setRotationAngle(XENOGohan48, -0.0873F, 0.0F, 0.0F);
		XENOGohan48.cubeList.add(new ModelBox(XENOGohan48, 68, 38, -1.0F, -1.0F, -0.988F, 2, 2, 2, -0.51F));

		XENOGohan49 = new ModelRenderer(this);
		XENOGohan49.setRotationPoint(-0.2F, -0.505F, -0.65F);
		XENOGohan42.addChild(XENOGohan49);
		setRotationAngle(XENOGohan49, 1.3309F, 0.24F, -0.1054F);
		XENOGohan49.cubeList.add(new ModelBox(XENOGohan49, 66, 35, -0.97F, -0.9F, -1.075F, 2, 2, 2, -0.5F));

		XENOGohan50 = new ModelRenderer(this);
		XENOGohan50.setRotationPoint(0.0F, -0.105F, -0.15F);
		XENOGohan42.addChild(XENOGohan50);
		setRotationAngle(XENOGohan50, 0.5542F, 0.24F, -0.1054F);
		XENOGohan50.cubeList.add(new ModelBox(XENOGohan50, 66, 36, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.5F));

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
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
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
