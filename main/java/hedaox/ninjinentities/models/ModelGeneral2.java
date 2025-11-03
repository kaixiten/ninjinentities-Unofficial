package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelGeneral2 extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer gohan;
    private final ModelRenderer gohan1;
    private final ModelRenderer gohan2;
    private final ModelRenderer gohan3;
    private final ModelRenderer gohan4;
    private final ModelRenderer gohan5;
    private final ModelRenderer gohan6;
    private final ModelRenderer gohan7;
    private final ModelRenderer gohan8;
    private final ModelRenderer gohan9;
    private final ModelRenderer gohan10;
    private final ModelRenderer gohan11;
    private final ModelRenderer gohan12;
    private final ModelRenderer gohan13;
    private final ModelRenderer gohan14;
    private final ModelRenderer gohan15;
    private final ModelRenderer gohan16;
    private final ModelRenderer gohan17;
    private final ModelRenderer gohanUltimate;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private final ModelRenderer Hair8;
    private final ModelRenderer Hair9;
    private final ModelRenderer Hair10;
    private final ModelRenderer Hair11;
    private final ModelRenderer hair12;
    private final ModelRenderer hair12_1;
    private final ModelRenderer hair12_2;
    private final ModelRenderer hair12_7;
    private final ModelRenderer hair5_5_r1_r1;
    private final ModelRenderer hair12_6;
    private final ModelRenderer hair5_4_r1_r1;
    private final ModelRenderer hair12_5;
    private final ModelRenderer hair5_3_r1_r1;
    private final ModelRenderer hair12_4;
    private final ModelRenderer hair12_3;
    private final ModelRenderer Hair14;
    private final ModelRenderer Hair13;
    private final ModelRenderer GohanBeast;
    private final ModelRenderer GohanBeast1;
    private final ModelRenderer GohanBeast2;
    private final ModelRenderer GohanBeast3;
    private final ModelRenderer GohanBeast4;
    private final ModelRenderer GohanBeast5;
    private final ModelRenderer GohanBeast6;
    private final ModelRenderer hair5_r2;
    private final ModelRenderer hair5_2;
    private final ModelRenderer hair5_5_r2;
    private final ModelRenderer hair5_4_r2;
    private final ModelRenderer hair5_3_r2;
    private final ModelRenderer hair5_2_r2;
    private final ModelRenderer hair5_1_r2;
    private final ModelRenderer GohanBeast7;
    private final ModelRenderer GohanBeast8;
    private final ModelRenderer GohanBeast9;
    private final ModelRenderer GohanBeast10;
    private final ModelRenderer GohanBeast11;
    private final ModelRenderer GohanBeast12;
    private final ModelRenderer GohanBeast13;
    private final ModelRenderer GohanBeast14;
    private final ModelRenderer GohanBeast15;
    private final ModelRenderer GohanBeast16;
    private final ModelRenderer GohanBeast17;
    private final ModelRenderer GohanBeast18;
    private final ModelRenderer GohanBeast19;
    private final ModelRenderer GohanBeast20;
    private final ModelRenderer GohanBeast21;
    private final ModelRenderer GohanBeast22;
    private final ModelRenderer GohanBeast23;
    private final ModelRenderer GohanBeast24;
    private final ModelRenderer GohanBeast25;
    private final ModelRenderer GohanBeast26;
    private final ModelRenderer GohanBeast27;
    private final ModelRenderer GohanBeast28;
    private final ModelRenderer GohanBeast29;
    private final ModelRenderer GohanBeast30;
    private final ModelRenderer GohanBeast31;
    private final ModelRenderer GohanBeast32;
    private final ModelRenderer GohanBeast33;
    private final ModelRenderer GohanBeast34;
    private final ModelRenderer GohanBeast35;
    private final ModelRenderer GohanBeast36;
    private final ModelRenderer GohanBeast37;
    private final ModelRenderer GohanBeast38;
    private final ModelRenderer GohanBeast39;
    private final ModelRenderer GohanBeast40;
    private final ModelRenderer GohanBeast41;
    private final ModelRenderer GohanBeast46;
    private final ModelRenderer GohanBeast42;
    private final ModelRenderer GohanBeast43;
    private final ModelRenderer GohanBeast44;
    private final ModelRenderer GohanBeast45;
    private final ModelRenderer FutureGohanSsj;
    private final ModelRenderer FutureGohanSsj2;
    private final ModelRenderer Hair1_r1;
    private final ModelRenderer FutureGohanSsj3;
    private final ModelRenderer Hair2_r1;
    private final ModelRenderer FutureGohanSsj4;
    private final ModelRenderer Hair3_r1;
    private final ModelRenderer Hair3_r2;
    private final ModelRenderer Hair3_r3;
    private final ModelRenderer FutureGohanSsj5;
    private final ModelRenderer Hair4_r1;
    private final ModelRenderer Hair4_r2;
    private final ModelRenderer FutureGohanSsj6;
    private final ModelRenderer Hair6_r1;
    private final ModelRenderer Hair6_r2;
    private final ModelRenderer Hair6_r3;
    private final ModelRenderer FutureGohanSsj7;
    private final ModelRenderer Hair7_r1;
    private final ModelRenderer Hair7_r2;
    private final ModelRenderer Hair7_r3;
    private final ModelRenderer FutureGohanSsj8;
    private final ModelRenderer Strand4_r1;
    private final ModelRenderer FutureGohanSsj9;
    private final ModelRenderer Hair6_r4;
    private final ModelRenderer Hair6_r5;
    private final ModelRenderer Hair6_r6;
    private final ModelRenderer FutureGohanSsj10;
    private final ModelRenderer Hair8_r4;
    private final ModelRenderer Hair8_r5;
    private final ModelRenderer Hair8_r6;
    private final ModelRenderer FutureGohanSsj11;
    private final ModelRenderer Hair20_r1;
    private final ModelRenderer Hair20_r2;
    private final ModelRenderer FutureGohanSsj12;
    private final ModelRenderer Hair20_r3;
    private final ModelRenderer Hair20_r4;
    private final ModelRenderer FutureGohanSsj13;
    private final ModelRenderer Hair20_r5;
    private final ModelRenderer Hair20_r6;
    private final ModelRenderer FutureGohanSsj14;
    private final ModelRenderer Hair20_r7;
    private final ModelRenderer Hair20_r8;
    private final ModelRenderer FutureGohanSsj15;
    private final ModelRenderer Hair7_r4;
    private final ModelRenderer Hair7_r5;
    private final ModelRenderer Hair7_r6;
    private final ModelRenderer FutureGohanSsj16;
    private final ModelRenderer Hair7_r7;
    private final ModelRenderer Hair7_r8;
    private final ModelRenderer FutureGohanSsj17;
    private final ModelRenderer Hair7_r9;
    private final ModelRenderer Hair7_r10;
    private final ModelRenderer FutureGohanSsj18;
    private final ModelRenderer Hair7_r11;
    private final ModelRenderer Hair7_r12;
    private final ModelRenderer FutureGohanSsj19;
    private final ModelRenderer FutureGohanSsj20;
    private final ModelRenderer FutureGohanSsj21;
    private final ModelRenderer FutureGohanSsj22;
    private final ModelRenderer FutureGohanSsj23;
    private final ModelRenderer FutureGohanSsj24;
    private final ModelRenderer FutureGohanSsj25;
    private final ModelRenderer FutureGohanSsj26;
    private final ModelRenderer FutureGohanSsj27;
    private final ModelRenderer FutureGohanSsj28;
    private final ModelRenderer FutureGohanSsj29;
    private final ModelRenderer FutureGohanSsj30;
    private final ModelRenderer Vegeto59;
    private final ModelRenderer Hair54_r2;
    private final ModelRenderer Vegeto60;
    private final ModelRenderer Hair55_r2;
    private final ModelRenderer FutureGohanSsj31;
    private final ModelRenderer Vegeto61;
    private final ModelRenderer Vegeto62;
    private final ModelRenderer Hair53_r2;
    private final ModelRenderer Hair53_r1_r2;
    private final ModelRenderer Gogeta;
    private final ModelRenderer Gogeta2;
    private final ModelRenderer Gogeta3;
    private final ModelRenderer Gogeta4;
    private final ModelRenderer Gogeta5;
    private final ModelRenderer Gogeta6;
    private final ModelRenderer Gogeta7;
    private final ModelRenderer Gogeta8;
    private final ModelRenderer Gogeta9;
    private final ModelRenderer Gogeta9_1;
    private final ModelRenderer Gogeta10;
    private final ModelRenderer Gogeta11;
    private final ModelRenderer Gogeta12;
    private final ModelRenderer Gogeta13;
    private final ModelRenderer Gogeta14;
    private final ModelRenderer Gogeta15;
    private final ModelRenderer Gogeta16;
    private final ModelRenderer Gogeta17;
    private final ModelRenderer Gogeta17_1;
    private final ModelRenderer Gogeta18;
    private final ModelRenderer Gogeta19;
    private final ModelRenderer Gogeta19_1;
    private final ModelRenderer Gogeta20;
    private final ModelRenderer Gogeta21;
    private final ModelRenderer Gogeta22;
    private final ModelRenderer Gogeta22_1;
    private final ModelRenderer Gogeta23;
    private final ModelRenderer Gogeta24;
    private final ModelRenderer Gogeta25;
    private final ModelRenderer Gogeta26;
    private final ModelRenderer Gogeta27;
    private final ModelRenderer Gogeta28;
    private final ModelRenderer Gogeta29;
    private final ModelRenderer Gogeta30;
    private final ModelRenderer Gogeta31;
    private final ModelRenderer Gogeta32;
    private final ModelRenderer Gogeta33;
    private final ModelRenderer Gogeta34;
    private final ModelRenderer Gogeta35;
    private final ModelRenderer Gogeta36;
    private final ModelRenderer Gogeta37;
    private final ModelRenderer Gogeta38;
    private final ModelRenderer Gogeta39;
    private final ModelRenderer Gogeta40;
    private final ModelRenderer Gogeta41;
    private final ModelRenderer Gogeta42;
    private final ModelRenderer Gogeta43;
    private final ModelRenderer Gogeta44;
    private final ModelRenderer Gogeta45;
    private final ModelRenderer Gogeta46;
    private final ModelRenderer Gogeta47;
    private final ModelRenderer Gogeta48;
    private final ModelRenderer Gogeta48_1;
    private final ModelRenderer Gogeta48_2;
    private final ModelRenderer Gogeta48_3;
    private final ModelRenderer Gogeta48_4;
    private final ModelRenderer Bang_1_2_r1_r1;
    private final ModelRenderer Gogeta49;
    private final ModelRenderer Gogeta50;
    private final ModelRenderer Gogeta50_1;
    private final ModelRenderer Vegeto;
    private final ModelRenderer Vegeto2;
    private final ModelRenderer Vegeto3;
    private final ModelRenderer Vegeto4;
    private final ModelRenderer Vegeto5;
    private final ModelRenderer Vegeto6;
    private final ModelRenderer Vegeto7;
    private final ModelRenderer Vegeto8;
    private final ModelRenderer Vegeto9;
    private final ModelRenderer Vegeto10;
    private final ModelRenderer Vegeto11;
    private final ModelRenderer Vegeto12;
    private final ModelRenderer Vegeto13;
    private final ModelRenderer Vegeto14;
    private final ModelRenderer Vegeto15;
    private final ModelRenderer Vegeto16;
    private final ModelRenderer Vegeto17;
    private final ModelRenderer Vegeto18;
    private final ModelRenderer Vegeto19;
    private final ModelRenderer Vegeto20;
    private final ModelRenderer Vegeto21;
    private final ModelRenderer Vegeto22;
    private final ModelRenderer Vegeto23;
    private final ModelRenderer Vegeto24;
    private final ModelRenderer Vegeto25;
    private final ModelRenderer Vegeto26;
    private final ModelRenderer Vegeto27;
    private final ModelRenderer Vegeto28;
    private final ModelRenderer Hair27_r1;
    private final ModelRenderer Vegeto29;
    private final ModelRenderer Vegeto30;
    private final ModelRenderer Vegeto31;
    private final ModelRenderer Vegeto32;
    private final ModelRenderer Vegeto33;
    private final ModelRenderer Vegeto34;
    private final ModelRenderer Vegeto35;
    private final ModelRenderer Vegeto36;
    private final ModelRenderer Vegeto37;
    private final ModelRenderer Vegeto38;
    private final ModelRenderer Vegeto39;
    private final ModelRenderer Vegeto40;
    private final ModelRenderer Vegeto41;
    private final ModelRenderer Vegeto42;
    private final ModelRenderer Vegeto43;
    private final ModelRenderer Vegeto44;
    private final ModelRenderer Vegeto45;
    private final ModelRenderer Vegeto46;
    private final ModelRenderer Vegeto47;
    private final ModelRenderer Vegeto48;
    private final ModelRenderer Vegeto49;
    private final ModelRenderer Vegeto50;
    private final ModelRenderer Vegeto51;
    private final ModelRenderer Vegeto52;
    private final ModelRenderer Vegeto53;
    private final ModelRenderer Hair53_r1;
    private final ModelRenderer Hair53_r1_r1;
    private final ModelRenderer Vegeto54;
    private final ModelRenderer Hair54_r1;
    private final ModelRenderer Vegeto55;
    private final ModelRenderer Hair55_r1;
    private final ModelRenderer Vegeto56;
    private final ModelRenderer Vegeto57;
    private final ModelRenderer Vegeto58;
    private final ModelRenderer Trunks;
    private final ModelRenderer Trunks2;
    private final ModelRenderer Trunks3;
    private final ModelRenderer Trunks4;
    private final ModelRenderer Trunks5;
    private final ModelRenderer Trunks6;
    private final ModelRenderer Trunks7;
    private final ModelRenderer Trunks8;
    private final ModelRenderer Hair7_r25;
    private final ModelRenderer Trunks9;
    private final ModelRenderer Hair8_r13;
    private final ModelRenderer Trunks10;
    private final ModelRenderer Trunks11;
    private final ModelRenderer TrunksSsj;
    private final ModelRenderer TrunksSsj2;
    private final ModelRenderer TrunksSsj3;
    private final ModelRenderer TrunksSsj4;
    private final ModelRenderer TrunksSsj5;
    private final ModelRenderer TrunksSsj6;
    private final ModelRenderer TrunksSsj7;
    private final ModelRenderer TrunksSsj8;
    private final ModelRenderer TrunksSsj9;
    private final ModelRenderer TrunksSsj10;
    private final ModelRenderer TrunksSsj11;
    private final ModelRenderer TrunksSsj12;
    private final ModelRenderer TrunksSsj13;
    private final ModelRenderer TrunksSsj14;
    private final ModelRenderer TrunksSsj15;
    private final ModelRenderer TrunksSsj16;
    private final ModelRenderer TrunksSsj17;
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
    public ModelGeneral2(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		gohan = new ModelRenderer(this);
		gohan.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(gohan);


		gohan1 = new ModelRenderer(this);
		gohan1.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan1);
		setRotationAngle(gohan1, -0.1745F, 0.0F, 0.0F);
		gohan1.cubeList.add(new ModelBox(gohan1, 23, 36, -1.0F, -10.0F, -5.0667F, 4, 4, 4, 0.0F));

		gohan2 = new ModelRenderer(this);
		gohan2.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan2);
		setRotationAngle(gohan2, -0.3665F, 0.0F, 0.0F);
		gohan2.cubeList.add(new ModelBox(gohan2, 17, 35, -0.5F, -11.0F, -6.0F, 3, 2, 3, 0.0F));

		gohan3 = new ModelRenderer(this);
		gohan3.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan3);
		setRotationAngle(gohan3, -0.5585F, 0.0F, 0.0F);
		gohan3.cubeList.add(new ModelBox(gohan3, 17, 35, 0.0F, -11.0F, -7.0F, 2, 2, 2, 0.0F));

		gohan4 = new ModelRenderer(this);
		gohan4.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan4);
		setRotationAngle(gohan4, -0.2618F, 0.0F, -0.3665F);
		gohan4.cubeList.add(new ModelBox(gohan4, 23, 33, -1.5333F, -10.3F, -5.4667F, 4, 5, 4, 0.0F));

		gohan5 = new ModelRenderer(this);
		gohan5.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan5);
		setRotationAngle(gohan5, -0.4189F, 0.0F, -0.3316F);
		gohan5.cubeList.add(new ModelBox(gohan5, 21, 40, -0.5F, -11.3F, -6.0F, 5, 4, 4, 0.0F));

		gohan6 = new ModelRenderer(this);
		gohan6.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan6);
		setRotationAngle(gohan6, -0.5236F, 0.0F, -0.2269F);
		gohan6.cubeList.add(new ModelBox(gohan6, 17, 35, -0.5F, -12.5F, -6.0F, 3, 3, 3, 0.0F));

		gohan7 = new ModelRenderer(this);
		gohan7.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan7);
		setRotationAngle(gohan7, -0.6283F, 0.0F, -0.0698F);
		gohan7.cubeList.add(new ModelBox(gohan7, 17, 35, 0.0F, -12.6667F, -7.0F, 2, 4, 2, 0.0F));

		gohan8 = new ModelRenderer(this);
		gohan8.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan8);
		setRotationAngle(gohan8, -0.2269F, 0.0F, 0.4014F);
		gohan8.cubeList.add(new ModelBox(gohan8, 17, 35, -1.3F, -9.3F, -5.0F, 3, 5, 3, 0.0F));

		gohan9 = new ModelRenderer(this);
		gohan9.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan9);
		setRotationAngle(gohan9, -0.4538F, 0.0F, 0.2618F);
		gohan9.cubeList.add(new ModelBox(gohan9, 21, 33, -0.8333F, -10.8F, -6.0F, 3, 4, 4, 0.0F));

		gohan10 = new ModelRenderer(this);
		gohan10.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan10);
		setRotationAngle(gohan10, -0.5411F, 0.0F, 0.1745F);
		gohan10.cubeList.add(new ModelBox(gohan10, 19, 33, -1.0F, -12.4667F, -6.0F, 3, 4, 3, 0.0F));

		gohan11 = new ModelRenderer(this);
		gohan11.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan11);
		setRotationAngle(gohan11, -0.2793F, 0.0F, 0.0F);
		gohan11.cubeList.add(new ModelBox(gohan11, 23, 33, -2.0F, -9.0F, -1.0F, 4, 5, 4, 0.0F));

		gohan12 = new ModelRenderer(this);
		gohan12.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan12);
		setRotationAngle(gohan12, -0.2443F, 0.2618F, 0.0175F);
		gohan12.cubeList.add(new ModelBox(gohan12, 17, 39, -0.8F, -10.0F, -1.0F, 4, 5, 4, 0.0F));

		gohan13 = new ModelRenderer(this);
		gohan13.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan13);
		setRotationAngle(gohan13, -0.2443F, -0.2618F, 0.0175F);
		gohan13.cubeList.add(new ModelBox(gohan13, 23, 36, -3.2667F, -10.0F, -1.0F, 4, 4, 4, 0.0F));

		gohan14 = new ModelRenderer(this);
		gohan14.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan14);
		setRotationAngle(gohan14, -0.1396F, 0.0F, 0.0F);
		gohan14.cubeList.add(new ModelBox(gohan14, 21, 33, -2.0F, -12.0F, -1.0F, 3, 4, 4, 0.0F));

		gohan15 = new ModelRenderer(this);
		gohan15.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan15);
		setRotationAngle(gohan15, -0.1222F, 0.1745F, 0.0F);
		gohan15.cubeList.add(new ModelBox(gohan15, 27, 33, -0.6F, -11.5F, 0.0F, 3, 2, 3, 0.0F));

		gohan16 = new ModelRenderer(this);
		gohan16.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan16);
		setRotationAngle(gohan16, -0.2443F, -0.2618F, 0.0175F);
		gohan16.cubeList.add(new ModelBox(gohan16, 17, 33, -2.8667F, -11.5333F, -0.6667F, 3, 4, 3, 0.0F));

		gohan17 = new ModelRenderer(this);
		gohan17.setRotationPoint(0.0F, 0.0F, 0.0F);
		gohan.addChild(gohan17);
		setRotationAngle(gohan17, 0.0F, 0.0F, -0.5934F);
		gohan17.cubeList.add(new ModelBox(gohan17, 17, 33, 4.4333F, -6.5F, -5.2667F, 2, 3, 3, 0.0F));

		gohanUltimate = new ModelRenderer(this);
		gohanUltimate.setRotationPoint(0.0F, 0.0F, -0.4F);
		bipedHead.addChild(gohanUltimate);


		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		gohanUltimate.addChild(Hair1);
		setRotationAngle(Hair1, -0.1309F, 0.0023F, -0.1572F);
		Hair1.cubeList.add(new ModelBox(Hair1, 42, 51, -0.5133F, -6.474F, -2.0714F, 3, 8, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-2.0F, -10.0F, 0.0F);
		gohanUltimate.addChild(Hair2);
		setRotationAngle(Hair2, -0.1745F, 0.0F, -0.349F);
		Hair2.cubeList.add(new ModelBox(Hair2, 43, 50, -1.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		gohanUltimate.addChild(Hair3);
		setRotationAngle(Hair3, -0.0524F, 0.0F, 0.3665F);
		Hair3.cubeList.add(new ModelBox(Hair3, 42, 50, 0.0603F, -5.342F, -3.0F, 3, 7, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		gohanUltimate.addChild(Hair4);
		setRotationAngle(Hair4, 0.0F, 0.0873F, 0.4363F);
		Hair4.cubeList.add(new ModelBox(Hair4, 45, 50, 1.0603F, -5.342F, -0.9F, 2, 7, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-4.6F, -6.4F, -2.0F);
		gohanUltimate.addChild(Hair5);
		setRotationAngle(Hair5, 2.7925F, 0.0873F, -0.4364F);
		Hair5.cubeList.add(new ModelBox(Hair5, 47, 50, -0.0028F, -2.171F, -3.2188F, 3, 7, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		gohanUltimate.addChild(Hair6);
		setRotationAngle(Hair6, -0.0873F, 0.0F, -0.4363F);
		Hair6.cubeList.add(new ModelBox(Hair6, 52, 52, 1.8099F, -5.1257F, -3.0188F, 3, 9, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		gohanUltimate.addChild(Hair7);
		setRotationAngle(Hair7, -0.3488F, -0.0149F, 0.0289F);
		Hair7.cubeList.add(new ModelBox(Hair7, 43, 51, 1.8099F, -4.0417F, -5.0982F, 3, 7, 4, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(-3.0F, -8.0F, 2.0F);
		gohanUltimate.addChild(Hair8);
		setRotationAngle(Hair8, 2.7925F, -0.0873F, -0.349F);
		Hair8.cubeList.add(new ModelBox(Hair8, 44, 53, -1.9972F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		gohanUltimate.addChild(Hair9);
		setRotationAngle(Hair9, 2.7925F, 0.0873F, 0.349F);
		Hair9.cubeList.add(new ModelBox(Hair9, 44, 53, -1.0028F, -3.571F, -3.2188F, 3, 7, 3, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(-0.7F, -4.2F, 1.3F);
		gohanUltimate.addChild(Hair10);
		setRotationAngle(Hair10, 2.8798F, 0.0873F, 0.0F);
		Hair10.cubeList.add(new ModelBox(Hair10, 42, 51, 0.9972F, -2.3391F, -4.0809F, 3, 10, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(-3.5F, -6.6F, 1.6F);
		gohanUltimate.addChild(Hair11);
		setRotationAngle(Hair11, 2.9671F, 0.0175F, 0.0524F);
		Hair11.cubeList.add(new ModelBox(Hair11, 48, 51, 0.9972F, -4.6289F, -4.1585F, 3, 10, 3, 0.0F));

		hair12 = new ModelRenderer(this);
		hair12.setRotationPoint(-0.0964F, -6.4F, -3.3536F);
		gohanUltimate.addChild(hair12);
		setRotationAngle(hair12, 1.1938F, 0.9183F, 0.327F);


		hair12_1 = new ModelRenderer(this);
		hair12_1.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
		hair12.addChild(hair12_1);
		setRotationAngle(hair12_1, 0.5542F, -0.24F, 0.1054F);
		hair12_1.cubeList.add(new ModelBox(hair12_1, 49, 54, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

		hair12_2 = new ModelRenderer(this);
		hair12_2.setRotationPoint(-0.3036F, -1.9F, 0.2536F);
		hair12.addChild(hair12_2);
		setRotationAngle(hair12_2, 0.0175F, 0.0F, 0.0F);


		hair12_7 = new ModelRenderer(this);
		hair12_7.setRotationPoint(0.8F, 0.295F, -3.25F);
		hair12_2.addChild(hair12_7);
		setRotationAngle(hair12_7, 2.4391F, -0.24F, 0.1054F);


		hair5_5_r1_r1 = new ModelRenderer(this);
		hair5_5_r1_r1.setRotationPoint(-0.09F, 0.555F, -0.1F);
		hair12_7.addChild(hair5_5_r1_r1);
		setRotationAngle(hair5_5_r1_r1, -0.4189F, 0.0F, 0.0F);
		hair5_5_r1_r1.cubeList.add(new ModelBox(hair5_5_r1_r1, 49, 54, -1.0F, -2.1F, -1.0F, 2, 3, 2, -0.6F));

		hair12_6 = new ModelRenderer(this);
		hair12_6.setRotationPoint(0.7F, -0.105F, -2.45F);
		hair12_2.addChild(hair12_6);
		setRotationAngle(hair12_6, 2.0988F, -0.24F, 0.1054F);


		hair5_4_r1_r1 = new ModelRenderer(this);
		hair5_4_r1_r1.setRotationPoint(-0.13F, 0.3293F, -0.0298F);
		hair12_6.addChild(hair5_4_r1_r1);
		setRotationAngle(hair5_4_r1_r1, -0.2443F, 0.0F, 0.0F);
		hair5_4_r1_r1.cubeList.add(new ModelBox(hair5_4_r1_r1, 49, 54, -1.0F, -1.0F, -0.9542F, 2, 2, 2, -0.52F));

		hair12_5 = new ModelRenderer(this);
		hair12_5.setRotationPoint(0.5F, -0.405F, -1.45F);
		hair12_2.addChild(hair12_5);
		setRotationAngle(hair12_5, 1.7323F, -0.24F, 0.1054F);


		hair5_3_r1_r1 = new ModelRenderer(this);
		hair5_3_r1_r1.setRotationPoint(-0.14F, 0.116F, 0.02F);
		hair12_5.addChild(hair5_3_r1_r1);
		setRotationAngle(hair5_3_r1_r1, -0.0873F, 0.0F, 0.0F);
		hair5_3_r1_r1.cubeList.add(new ModelBox(hair5_3_r1_r1, 49, 54, -1.0F, -1.0F, -0.988F, 2, 2, 2, -0.51F));

		hair12_4 = new ModelRenderer(this);
		hair12_4.setRotationPoint(0.2F, -0.505F, -0.65F);
		hair12_2.addChild(hair12_4);
		setRotationAngle(hair12_4, 1.3309F, -0.24F, 0.1054F);
		hair12_4.cubeList.add(new ModelBox(hair12_4, 49, 54, -1.03F, -0.9F, -1.075F, 2, 2, 2, -0.5F));

		hair12_3 = new ModelRenderer(this);
		hair12_3.setRotationPoint(0.0F, -0.105F, -0.15F);
		hair12_2.addChild(hair12_3);
		setRotationAngle(hair12_3, 0.5542F, -0.24F, 0.1054F);
		hair12_3.cubeList.add(new ModelBox(hair12_3, 49, 54, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.5F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(-3.0F, -8.0F, 2.5F);
		gohanUltimate.addChild(Hair14);
		setRotationAngle(Hair14, 2.7925F, -0.0873F, -0.5236F);
		Hair14.cubeList.add(new ModelBox(Hair14, 52, 55, -2.9972F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(3.0F, -8.0F, 2.5F);
		gohanUltimate.addChild(Hair13);
		setRotationAngle(Hair13, 2.7925F, 0.0873F, 0.5236F);
		Hair13.cubeList.add(new ModelBox(Hair13, 52, 50, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		GohanBeast = new ModelRenderer(this);
		GohanBeast.setRotationPoint(0.0F, 0.0F, 0.6F);
		bipedHead.addChild(GohanBeast);
		setRotationAngle(GohanBeast, -0.0436F, 0.0F, 0.0F);


		GohanBeast1 = new ModelRenderer(this);
		GohanBeast1.setRotationPoint(-1.25F, -9.25F, 0.0F);
		GohanBeast.addChild(GohanBeast1);


		GohanBeast2 = new ModelRenderer(this);
		GohanBeast2.setRotationPoint(0.0F, 0.2F, 0.3F);
		GohanBeast1.addChild(GohanBeast2);
		setRotationAngle(GohanBeast2, -0.2705F, 0.0023F, -0.1572F);


		GohanBeast3 = new ModelRenderer(this);
		GohanBeast3.setRotationPoint(-3.75F, 41.25F, 3.5F);
		GohanBeast2.addChild(GohanBeast3);
		setRotationAngle(GohanBeast3, 0.1304F, -0.0114F, 0.1302F);
		GohanBeast3.cubeList.add(new ModelBox(GohanBeast3, 66, 1, -2.1477F, -49.3863F, -2.9175F, 4, 10, 4, 0.0F));

		GohanBeast4 = new ModelRenderer(this);
		GohanBeast4.setRotationPoint(0.0F, -1.875F, 5.3125F);
		GohanBeast1.addChild(GohanBeast4);
		setRotationAngle(GohanBeast4, -0.3479F, 0.0298F, 0.1519F);
		GohanBeast4.cubeList.add(new ModelBox(GohanBeast4, 68, 1, 1.7624F, -5.8021F, -8.2477F, 3, 12, 3, 0.0F));

		GohanBeast5 = new ModelRenderer(this);
		GohanBeast5.setRotationPoint(2.5F, -1.875F, 5.3125F);
		GohanBeast1.addChild(GohanBeast5);
		setRotationAngle(GohanBeast5, -0.3479F, -0.0298F, -0.1519F);
		GohanBeast5.cubeList.add(new ModelBox(GohanBeast5, 68, 1, -4.7624F, -4.8021F, -8.2477F, 3, 11, 3, 0.0F));

		GohanBeast6 = new ModelRenderer(this);
		GohanBeast6.setRotationPoint(0.4536F, 3.35F, -4.3536F);
		GohanBeast1.addChild(GohanBeast6);
		setRotationAngle(GohanBeast6, 1.0286F, 0.8766F, 0.6657F);


		hair5_r2 = new ModelRenderer(this);
		hair5_r2.setRotationPoint(-0.6036F, -1.205F, 0.6036F);
		GohanBeast6.addChild(hair5_r2);
		setRotationAngle(hair5_r2, 0.5542F, -0.24F, 0.1054F);
		hair5_r2.cubeList.add(new ModelBox(hair5_r2, 71, 6, -0.96F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		hair5_2 = new ModelRenderer(this);
		hair5_2.setRotationPoint(-0.3036F, -2.1F, 0.0536F);
		GohanBeast6.addChild(hair5_2);
		setRotationAngle(hair5_2, 0.192F, 0.0F, 0.0F);


		hair5_5_r2 = new ModelRenderer(this);
		hair5_5_r2.setRotationPoint(0.8F, 0.195F, -3.45F);
		hair5_2.addChild(hair5_5_r2);
		setRotationAngle(hair5_5_r2, 2.4042F, -0.24F, 0.1054F);
		hair5_5_r2.cubeList.add(new ModelBox(hair5_5_r2, 71, 6, -1.0118F, -3.455F, -1.11F, 2, 4, 2, -0.3F));

		hair5_4_r2 = new ModelRenderer(this);
		hair5_4_r2.setRotationPoint(0.7F, -0.105F, -2.45F);
		hair5_2.addChild(hair5_4_r2);
		setRotationAngle(hair5_4_r2, 2.0988F, -0.24F, 0.1054F);
		hair5_4_r2.cubeList.add(new ModelBox(hair5_4_r2, 71, 6, -1.13F, -1.267F, -0.81F, 2, 2, 2, -0.3F));

		hair5_3_r2 = new ModelRenderer(this);
		hair5_3_r2.setRotationPoint(0.5F, -0.405F, -1.45F);
		hair5_2.addChild(hair5_3_r2);
		setRotationAngle(hair5_3_r2, 1.7323F, -0.24F, 0.1054F);
		hair5_3_r2.cubeList.add(new ModelBox(hair5_3_r2, 71, 6, -1.14F, -1.285F, -0.82F, 2, 2, 2, -0.3F));

		hair5_2_r2 = new ModelRenderer(this);
		hair5_2_r2.setRotationPoint(0.2F, -0.505F, -0.65F);
		hair5_2.addChild(hair5_2_r2);
		setRotationAngle(hair5_2_r2, 1.3309F, -0.24F, 0.1054F);
		hair5_2_r2.cubeList.add(new ModelBox(hair5_2_r2, 71, 6, -1.03F, -1.1F, -1.0F, 2, 2, 2, -0.3F));

		hair5_1_r2 = new ModelRenderer(this);
		hair5_1_r2.setRotationPoint(0.0F, -0.105F, -0.15F);
		hair5_2.addChild(hair5_1_r2);
		setRotationAngle(hair5_1_r2, 0.5542F, -0.24F, 0.1054F);
		hair5_1_r2.cubeList.add(new ModelBox(hair5_1_r2, 71, 6, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.3F));

		GohanBeast7 = new ModelRenderer(this);
		GohanBeast7.setRotationPoint(-0.875F, -7.5F, 1.625F);
		GohanBeast.addChild(GohanBeast7);
		setRotationAngle(GohanBeast7, 0.0F, 0.0F, 0.2182F);


		GohanBeast8 = new ModelRenderer(this);
		GohanBeast8.setRotationPoint(0.0F, 0.0F, 0.0F);
		GohanBeast7.addChild(GohanBeast8);
		setRotationAngle(GohanBeast8, 2.4826F, 0.1957F, 0.2441F);


		GohanBeast9 = new ModelRenderer(this);
		GohanBeast9.setRotationPoint(-1.625F, 37.75F, -1.125F);
		GohanBeast8.addChild(GohanBeast9);
		setRotationAngle(GohanBeast9, 0.028F, -0.0466F, 0.0676F);
		GohanBeast9.cubeList.add(new ModelBox(GohanBeast9, 66, 2, 1.4607F, -39.7225F, -2.6172F, 3, 5, 3, 0.0F));

		GohanBeast10 = new ModelRenderer(this);
		GohanBeast10.setRotationPoint(4.625F, -3.5F, 0.875F);
		GohanBeast7.addChild(GohanBeast10);
		setRotationAngle(GohanBeast10, 2.6616F, 0.0873F, 0.349F);
		GohanBeast10.cubeList.add(new ModelBox(GohanBeast10, 67, 4, 0.1215F, -6.2137F, -1.5235F, 3, 7, 3, 0.0F));

		GohanBeast11 = new ModelRenderer(this);
		GohanBeast11.setRotationPoint(4.625F, -3.5F, 1.5F);
		GohanBeast7.addChild(GohanBeast11);
		setRotationAngle(GohanBeast11, 2.5808F, 0.111F, 0.5896F);
		GohanBeast11.cubeList.add(new ModelBox(GohanBeast11, 69, 3, 0.7465F, -5.4638F, -4.0235F, 3, 6, 3, 0.0F));

		GohanBeast12 = new ModelRenderer(this);
		GohanBeast12.setRotationPoint(6.625F, -1.5F, -4.125F);
		GohanBeast7.addChild(GohanBeast12);
		setRotationAngle(GohanBeast12, 2.6471F, -0.0378F, 0.5289F);
		GohanBeast12.cubeList.add(new ModelBox(GohanBeast12, 66, 3, -2.9965F, -2.9637F, -2.7735F, 3, 7, 3, 0.0F));

		GohanBeast13 = new ModelRenderer(this);
		GohanBeast13.setRotationPoint(2.125F, -3.5F, -1.625F);
		GohanBeast7.addChild(GohanBeast13);
		setRotationAngle(GohanBeast13, -0.1571F, 0.0F, 0.3665F);
		GohanBeast13.cubeList.add(new ModelBox(GohanBeast13, 66, 3, 0.8254F, -3.9275F, -3.75F, 3, 7, 3, 0.0F));

		GohanBeast14 = new ModelRenderer(this);
		GohanBeast14.setRotationPoint(-1.875F, -8.5F, 1.625F);
		GohanBeast.addChild(GohanBeast14);
		setRotationAngle(GohanBeast14, 0.0F, 0.0F, -0.0873F);


		GohanBeast15 = new ModelRenderer(this);
		GohanBeast15.setRotationPoint(0.0F, 0.0F, 0.0F);
		GohanBeast14.addChild(GohanBeast15);
		setRotationAngle(GohanBeast15, 2.4826F, 0.1957F, 0.2441F);


		GohanBeast16 = new ModelRenderer(this);
		GohanBeast16.setRotationPoint(-1.625F, 37.75F, -1.125F);
		GohanBeast15.addChild(GohanBeast16);
		setRotationAngle(GohanBeast16, 0.028F, -0.0466F, 0.0676F);
		GohanBeast16.cubeList.add(new ModelBox(GohanBeast16, 66, 2, 1.3582F, -39.4122F, -2.9956F, 3, 9, 3, 0.0F));

		GohanBeast17 = new ModelRenderer(this);
		GohanBeast17.setRotationPoint(4.625F, -3.5F, 0.875F);
		GohanBeast14.addChild(GohanBeast17);
		setRotationAngle(GohanBeast17, 2.6616F, 0.0873F, 0.349F);
		GohanBeast17.cubeList.add(new ModelBox(GohanBeast17, 68, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		GohanBeast18 = new ModelRenderer(this);
		GohanBeast18.setRotationPoint(4.625F, -3.5F, 1.5F);
		GohanBeast14.addChild(GohanBeast18);
		setRotationAngle(GohanBeast18, 2.5808F, 0.111F, 0.5896F);
		GohanBeast18.cubeList.add(new ModelBox(GohanBeast18, 70, 3, 0.7465F, -5.4638F, -4.0235F, 3, 9, 3, 0.0F));

		GohanBeast19 = new ModelRenderer(this);
		GohanBeast19.setRotationPoint(6.625F, -1.5F, -4.125F);
		GohanBeast14.addChild(GohanBeast19);
		setRotationAngle(GohanBeast19, 2.6471F, -0.0378F, 0.5289F);
		GohanBeast19.cubeList.add(new ModelBox(GohanBeast19, 67, 3, -2.9965F, -2.9637F, -2.7735F, 3, 9, 3, 0.0F));

		GohanBeast20 = new ModelRenderer(this);
		GohanBeast20.setRotationPoint(1.875F, -8.5F, 1.625F);
		GohanBeast.addChild(GohanBeast20);
		setRotationAngle(GohanBeast20, 0.0F, 0.0F, 0.0873F);


		GohanBeast21 = new ModelRenderer(this);
		GohanBeast21.setRotationPoint(0.0F, 0.0F, 0.0F);
		GohanBeast20.addChild(GohanBeast21);
		setRotationAngle(GohanBeast21, 2.4826F, -0.1957F, -0.2441F);


		GohanBeast22 = new ModelRenderer(this);
		GohanBeast22.setRotationPoint(1.625F, 37.75F, -1.125F);
		GohanBeast21.addChild(GohanBeast22);
		setRotationAngle(GohanBeast22, 0.028F, 0.0466F, -0.0676F);
		GohanBeast22.cubeList.add(new ModelBox(GohanBeast22, 66, 2, -4.3582F, -39.4122F, -2.9956F, 3, 9, 3, 0.0F));

		GohanBeast23 = new ModelRenderer(this);
		GohanBeast23.setRotationPoint(-4.625F, -3.5F, 0.875F);
		GohanBeast20.addChild(GohanBeast23);
		setRotationAngle(GohanBeast23, 2.6616F, -0.0873F, -0.349F);
		GohanBeast23.cubeList.add(new ModelBox(GohanBeast23, 68, 4, -3.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		GohanBeast24 = new ModelRenderer(this);
		GohanBeast24.setRotationPoint(-4.625F, -3.5F, 1.5F);
		GohanBeast20.addChild(GohanBeast24);
		setRotationAngle(GohanBeast24, 2.5808F, -0.111F, -0.5896F);
		GohanBeast24.cubeList.add(new ModelBox(GohanBeast24, 70, 3, -3.7465F, -5.4638F, -4.0235F, 3, 9, 3, 0.0F));

		GohanBeast25 = new ModelRenderer(this);
		GohanBeast25.setRotationPoint(-3.125F, -2.75F, 2.125F);
		GohanBeast20.addChild(GohanBeast25);
		setRotationAngle(GohanBeast25, -0.537F, 0.0696F, -0.0448F);
		GohanBeast25.cubeList.add(new ModelBox(GohanBeast25, 68, 0, 0.5584F, -6.4925F, -4.9642F, 3, 12, 3, 0.0F));

		GohanBeast26 = new ModelRenderer(this);
		GohanBeast26.setRotationPoint(-6.625F, -1.5F, -4.125F);
		GohanBeast20.addChild(GohanBeast26);
		setRotationAngle(GohanBeast26, 2.6471F, 0.0378F, -0.5289F);
		GohanBeast26.cubeList.add(new ModelBox(GohanBeast26, 67, 3, -0.0035F, -2.9637F, -2.7735F, 3, 9, 3, 0.0F));

		GohanBeast27 = new ModelRenderer(this);
		GohanBeast27.setRotationPoint(-2.125F, -1.5F, -2.625F);
		GohanBeast20.addChild(GohanBeast27);
		setRotationAngle(GohanBeast27, -0.1571F, 0.0F, -0.3665F);
		GohanBeast27.cubeList.add(new ModelBox(GohanBeast27, 67, 3, -3.8218F, -5.9868F, -3.4559F, 3, 9, 3, 0.0F));

		GohanBeast28 = new ModelRenderer(this);
		GohanBeast28.setRotationPoint(-1.725F, -1.55F, -0.275F);
		GohanBeast20.addChild(GohanBeast28);
		setRotationAngle(GohanBeast28, -0.5375F, -0.065F, -0.2696F);
		GohanBeast28.cubeList.add(new ModelBox(GohanBeast28, 68, 0, -1.8584F, -8.3925F, -3.9643F, 3, 13, 3, 0.0F));

		GohanBeast29 = new ModelRenderer(this);
		GohanBeast29.setRotationPoint(-1.3151F, -3.5F, 2.375F);
		GohanBeast20.addChild(GohanBeast29);
		setRotationAngle(GohanBeast29, 2.314F, -0.0956F, 0.001F);
		GohanBeast29.cubeList.add(new ModelBox(GohanBeast29, 68, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		GohanBeast30 = new ModelRenderer(this);
		GohanBeast30.setRotationPoint(-3.3151F, -2.5F, 0.125F);
		GohanBeast20.addChild(GohanBeast30);
		setRotationAngle(GohanBeast30, 2.3153F, 0.0822F, -0.1914F);
		GohanBeast30.cubeList.add(new ModelBox(GohanBeast30, 66, 0, 0.1215F, -4.2137F, -1.5235F, 3, 11, 3, 0.0F));

		GohanBeast31 = new ModelRenderer(this);
		GohanBeast31.setRotationPoint(-2.4349F, -3.5F, 2.375F);
		GohanBeast20.addChild(GohanBeast31);
		setRotationAngle(GohanBeast31, 2.314F, 0.0956F, -0.001F);
		GohanBeast31.cubeList.add(new ModelBox(GohanBeast31, 68, 4, -3.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		GohanBeast32 = new ModelRenderer(this);
		GohanBeast32.setRotationPoint(-1.2676F, 4.8787F, 0.8348F);
		GohanBeast20.addChild(GohanBeast32);
		setRotationAngle(GohanBeast32, 2.5322F, 0.0956F, -0.001F);
		GohanBeast32.cubeList.add(new ModelBox(GohanBeast32, 67, 0, -2.6242F, -0.2444F, -1.0162F, 3, 11, 3, 0.0F));

		GohanBeast33 = new ModelRenderer(this);
		GohanBeast33.setRotationPoint(0.875F, -7.5F, 1.625F);
		GohanBeast.addChild(GohanBeast33);
		setRotationAngle(GohanBeast33, 0.0F, 0.0F, -0.2182F);


		GohanBeast34 = new ModelRenderer(this);
		GohanBeast34.setRotationPoint(0.0F, 0.0F, 0.0F);
		GohanBeast33.addChild(GohanBeast34);
		setRotationAngle(GohanBeast34, 2.4826F, -0.1957F, -0.2441F);


		GohanBeast35 = new ModelRenderer(this);
		GohanBeast35.setRotationPoint(1.625F, 37.75F, -1.125F);
		GohanBeast34.addChild(GohanBeast35);
		setRotationAngle(GohanBeast35, 0.028F, 0.0466F, -0.0676F);
		GohanBeast35.cubeList.add(new ModelBox(GohanBeast35, 66, 2, -4.4607F, -39.7225F, -2.6172F, 3, 5, 3, 0.0F));

		GohanBeast36 = new ModelRenderer(this);
		GohanBeast36.setRotationPoint(-4.625F, -3.5F, 0.875F);
		GohanBeast33.addChild(GohanBeast36);
		setRotationAngle(GohanBeast36, 2.6616F, -0.0873F, -0.349F);
		GohanBeast36.cubeList.add(new ModelBox(GohanBeast36, 67, 4, -3.1215F, -6.2137F, -1.5235F, 3, 7, 3, 0.0F));

		GohanBeast37 = new ModelRenderer(this);
		GohanBeast37.setRotationPoint(-4.625F, -3.5F, 1.5F);
		GohanBeast33.addChild(GohanBeast37);
		setRotationAngle(GohanBeast37, 2.5808F, -0.111F, -0.5896F);
		GohanBeast37.cubeList.add(new ModelBox(GohanBeast37, 69, 3, -3.7465F, -5.4638F, -4.0235F, 3, 6, 3, 0.0F));

		GohanBeast38 = new ModelRenderer(this);
		GohanBeast38.setRotationPoint(-6.625F, -1.5F, -4.125F);
		GohanBeast33.addChild(GohanBeast38);
		setRotationAngle(GohanBeast38, 2.6471F, 0.0378F, -0.5289F);
		GohanBeast38.cubeList.add(new ModelBox(GohanBeast38, 66, 3, -0.0035F, -2.9637F, -2.7735F, 3, 7, 3, 0.0F));

		GohanBeast39 = new ModelRenderer(this);
		GohanBeast39.setRotationPoint(-2.125F, -3.5F, -1.625F);
		GohanBeast33.addChild(GohanBeast39);
		setRotationAngle(GohanBeast39, -0.1571F, 0.0F, -0.3665F);
		GohanBeast39.cubeList.add(new ModelBox(GohanBeast39, 66, 3, -3.8254F, -3.9275F, -3.75F, 3, 7, 3, 0.0F));

		GohanBeast40 = new ModelRenderer(this);
		GohanBeast40.setRotationPoint(-1.875F, -8.5F, 1.625F);
		GohanBeast.addChild(GohanBeast40);
		setRotationAngle(GohanBeast40, 0.0F, 0.0F, -0.0873F);


		GohanBeast41 = new ModelRenderer(this);
		GohanBeast41.setRotationPoint(0.0F, 0.0F, 0.0F);
		GohanBeast40.addChild(GohanBeast41);
		setRotationAngle(GohanBeast41, 2.4826F, 0.1957F, 0.2441F);


		GohanBeast46 = new ModelRenderer(this);
		GohanBeast46.setRotationPoint(-1.625F, 37.75F, -1.125F);
		GohanBeast41.addChild(GohanBeast46);
		setRotationAngle(GohanBeast46, 0.028F, -0.0466F, 0.0676F);
		GohanBeast46.cubeList.add(new ModelBox(GohanBeast46, 66, 2, 1.3582F, -39.4122F, -2.9956F, 3, 9, 3, 0.0F));

		GohanBeast42 = new ModelRenderer(this);
		GohanBeast42.setRotationPoint(4.625F, -3.5F, 0.875F);
		GohanBeast40.addChild(GohanBeast42);
		setRotationAngle(GohanBeast42, 2.6616F, 0.0873F, 0.349F);
		GohanBeast42.cubeList.add(new ModelBox(GohanBeast42, 68, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, 0.0F));

		GohanBeast43 = new ModelRenderer(this);
		GohanBeast43.setRotationPoint(4.625F, -3.5F, 1.5F);
		GohanBeast40.addChild(GohanBeast43);
		setRotationAngle(GohanBeast43, 2.5808F, 0.111F, 0.5896F);
		GohanBeast43.cubeList.add(new ModelBox(GohanBeast43, 70, 3, 0.7465F, -5.4638F, -4.0235F, 3, 9, 3, 0.0F));

		GohanBeast44 = new ModelRenderer(this);
		GohanBeast44.setRotationPoint(6.625F, -1.5F, -4.125F);
		GohanBeast40.addChild(GohanBeast44);
		setRotationAngle(GohanBeast44, 2.6471F, -0.0378F, 0.5289F);
		GohanBeast44.cubeList.add(new ModelBox(GohanBeast44, 67, 3, -2.9965F, -2.9637F, -2.7735F, 3, 9, 3, 0.0F));

		GohanBeast45 = new ModelRenderer(this);
		GohanBeast45.setRotationPoint(2.125F, -1.5F, -2.625F);
		GohanBeast40.addChild(GohanBeast45);
		setRotationAngle(GohanBeast45, -0.1571F, 0.0F, 0.3665F);
		GohanBeast45.cubeList.add(new ModelBox(GohanBeast45, 66, 2, 0.8218F, -5.9868F, -3.3559F, 3, 9, 3, 0.0F));

		FutureGohanSsj = new ModelRenderer(this);
		FutureGohanSsj.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(FutureGohanSsj);


		FutureGohanSsj2 = new ModelRenderer(this);
		FutureGohanSsj2.setRotationPoint(1.3324F, -7.6865F, -3.1666F);
		FutureGohanSsj.addChild(FutureGohanSsj2);
		setRotationAngle(FutureGohanSsj2, -0.074F, -0.0738F, -0.2481F);


		Hair1_r1 = new ModelRenderer(this);
		Hair1_r1.setRotationPoint(1.0224F, -3.8521F, 1.8533F);
		FutureGohanSsj2.addChild(Hair1_r1);
		setRotationAngle(Hair1_r1, -0.774F, -0.1693F, 0.4127F);
		Hair1_r1.cubeList.add(new ModelBox(Hair1_r1, 115, 40, -1.0356F, -2.0F, -1.0F, 2, 4, 2, -0.03F));

		FutureGohanSsj3 = new ModelRenderer(this);
		FutureGohanSsj3.setRotationPoint(-1.4324F, -7.5865F, -2.7666F);
		FutureGohanSsj.addChild(FutureGohanSsj3);
		setRotationAngle(FutureGohanSsj3, 0.0392F, 0.1507F, 0.3877F);


		Hair2_r1 = new ModelRenderer(this);
		Hair2_r1.setRotationPoint(-1.0224F, -3.8522F, 1.8533F);
		FutureGohanSsj3.addChild(Hair2_r1);
		setRotationAngle(Hair2_r1, -0.8613F, 0.1693F, -0.4127F);
		Hair2_r1.cubeList.add(new ModelBox(Hair2_r1, 113, 43, -1.0644F, -1.6F, -0.7F, 2, 3, 2, -0.03F));

		FutureGohanSsj4 = new ModelRenderer(this);
		FutureGohanSsj4.setRotationPoint(3.1324F, -7.5865F, -2.7666F);
		FutureGohanSsj.addChild(FutureGohanSsj4);
		setRotationAngle(FutureGohanSsj4, -0.0446F, -0.1484F, -0.2886F);


		Hair3_r1 = new ModelRenderer(this);
		Hair3_r1.setRotationPoint(1.0224F, -3.8522F, 1.8533F);
		FutureGohanSsj4.addChild(Hair3_r1);
		setRotationAngle(Hair3_r1, -0.774F, -0.1693F, 0.4127F);
		Hair3_r1.cubeList.add(new ModelBox(Hair3_r1, 118, 40, -0.9356F, -1.0F, -1.0F, 2, 2, 2, -0.03F));

		Hair3_r2 = new ModelRenderer(this);
		Hair3_r2.setRotationPoint(0.5224F, -1.9521F, 0.4533F);
		FutureGohanSsj4.addChild(Hair3_r2);
		setRotationAngle(Hair3_r2, -0.5297F, -0.1693F, 0.4127F);
		Hair3_r2.cubeList.add(new ModelBox(Hair3_r2, 118, 40, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

		Hair3_r3 = new ModelRenderer(this);
		Hair3_r3.setRotationPoint(0.3165F, -1.2127F, 0.0666F);
		FutureGohanSsj4.addChild(Hair3_r3);
		setRotationAngle(Hair3_r3, -0.027F, -0.1901F, 0.404F);
		Hair3_r3.cubeList.add(new ModelBox(Hair3_r3, 118, 40, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj5 = new ModelRenderer(this);
		FutureGohanSsj5.setRotationPoint(-3.1324F, -6.5865F, -1.3666F);
		FutureGohanSsj.addChild(FutureGohanSsj5);
		setRotationAngle(FutureGohanSsj5, 0.6178F, 1.3512F, 0.1215F);


		Hair4_r1 = new ModelRenderer(this);
		Hair4_r1.setRotationPoint(-0.6206F, -2.1349F, 0.2548F);
		FutureGohanSsj5.addChild(Hair4_r1);
		setRotationAngle(Hair4_r1, -0.3218F, 0.1845F, -0.4214F);
		Hair4_r1.cubeList.add(new ModelBox(Hair4_r1, 118, 42, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair4_r2 = new ModelRenderer(this);
		Hair4_r2.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
		FutureGohanSsj5.addChild(Hair4_r2);
		setRotationAngle(Hair4_r2, -0.027F, 0.1901F, -0.404F);
		Hair4_r2.cubeList.add(new ModelBox(Hair4_r2, 118, 42, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj6 = new ModelRenderer(this);
		FutureGohanSsj6.setRotationPoint(-3.7713F, -8.8232F, 0.7767F);
		FutureGohanSsj.addChild(FutureGohanSsj6);
		setRotationAngle(FutureGohanSsj6, 0.7129F, 1.2204F, 0.5465F);


		Hair6_r1 = new ModelRenderer(this);
		Hair6_r1.setRotationPoint(-0.4854F, -1.518F, 0.4569F);
		FutureGohanSsj6.addChild(Hair6_r1);
		setRotationAngle(Hair6_r1, -0.7057F, 0.1845F, -0.4214F);
		Hair6_r1.cubeList.add(new ModelBox(Hair6_r1, 113, 35, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		Hair6_r2 = new ModelRenderer(this);
		Hair6_r2.setRotationPoint(-0.248F, -0.7009F, 0.0996F);
		FutureGohanSsj6.addChild(Hair6_r2);
		setRotationAngle(Hair6_r2, -0.2869F, 0.1845F, -0.4214F);
		Hair6_r2.cubeList.add(new ModelBox(Hair6_r2, 113, 35, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair6_r3 = new ModelRenderer(this);
		Hair6_r3.setRotationPoint(0.0578F, 0.2385F, -0.0871F);
		FutureGohanSsj6.addChild(Hair6_r3);
		setRotationAngle(Hair6_r3, -0.027F, 0.1901F, -0.404F);
		Hair6_r3.cubeList.add(new ModelBox(Hair6_r3, 113, 35, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj7 = new ModelRenderer(this);
		FutureGohanSsj7.setRotationPoint(-2.9713F, -9.1232F, 1.9767F);
		FutureGohanSsj.addChild(FutureGohanSsj7);
		setRotationAngle(FutureGohanSsj7, 0.8176F, 1.2204F, 0.5465F);


		Hair7_r1 = new ModelRenderer(this);
		Hair7_r1.setRotationPoint(-0.6854F, -1.618F, 0.5569F);
		FutureGohanSsj7.addChild(Hair7_r1);
		setRotationAngle(Hair7_r1, -0.7057F, 0.1845F, -0.4214F);
		Hair7_r1.cubeList.add(new ModelBox(Hair7_r1, 110, 36, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		Hair7_r2 = new ModelRenderer(this);
		Hair7_r2.setRotationPoint(-0.248F, -0.7009F, 0.0996F);
		FutureGohanSsj7.addChild(Hair7_r2);
		setRotationAngle(Hair7_r2, -0.2869F, 0.1845F, -0.4214F);
		Hair7_r2.cubeList.add(new ModelBox(Hair7_r2, 110, 36, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair7_r3 = new ModelRenderer(this);
		Hair7_r3.setRotationPoint(0.0579F, 0.2385F, -0.0871F);
		FutureGohanSsj7.addChild(Hair7_r3);
		setRotationAngle(Hair7_r3, -0.027F, 0.1901F, -0.404F);
		Hair7_r3.cubeList.add(new ModelBox(Hair7_r3, 110, 36, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj8 = new ModelRenderer(this);
		FutureGohanSsj8.setRotationPoint(-2.6163F, -7.5498F, -3.8265F);
		FutureGohanSsj.addChild(FutureGohanSsj8);
		setRotationAngle(FutureGohanSsj8, -0.4651F, 0.2457F, 0.3449F);


		Strand4_r1 = new ModelRenderer(this);
		Strand4_r1.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
		FutureGohanSsj8.addChild(Strand4_r1);
		setRotationAngle(Strand4_r1, 0.3046F, -0.3684F, 0.2431F);
		Strand4_r1.cubeList.add(new ModelBox(Strand4_r1, 110, 41, -0.5926F, -2.4717F, -0.8594F, 2, 3, 2, 0.0F));

		FutureGohanSsj9 = new ModelRenderer(this);
		FutureGohanSsj9.setRotationPoint(3.5713F, -8.8232F, -0.6233F);
		FutureGohanSsj.addChild(FutureGohanSsj9);
		setRotationAngle(FutureGohanSsj9, 0.7129F, -1.2204F, -0.5465F);


		Hair6_r4 = new ModelRenderer(this);
		Hair6_r4.setRotationPoint(0.4854F, -1.518F, 0.4569F);
		FutureGohanSsj9.addChild(Hair6_r4);
		setRotationAngle(Hair6_r4, -0.7057F, -0.1845F, 0.4214F);
		Hair6_r4.cubeList.add(new ModelBox(Hair6_r4, 110, 40, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		Hair6_r5 = new ModelRenderer(this);
		Hair6_r5.setRotationPoint(0.248F, -0.7009F, 0.0996F);
		FutureGohanSsj9.addChild(Hair6_r5);
		setRotationAngle(Hair6_r5, -0.2869F, -0.1845F, 0.4214F);
		Hair6_r5.cubeList.add(new ModelBox(Hair6_r5, 110, 40, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair6_r6 = new ModelRenderer(this);
		Hair6_r6.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
		FutureGohanSsj9.addChild(Hair6_r6);
		setRotationAngle(Hair6_r6, -0.027F, -0.1901F, 0.404F);
		Hair6_r6.cubeList.add(new ModelBox(Hair6_r6, 110, 40, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj10 = new ModelRenderer(this);
		FutureGohanSsj10.setRotationPoint(3.6713F, -7.3232F, 1.4767F);
		FutureGohanSsj.addChild(FutureGohanSsj10);
		setRotationAngle(FutureGohanSsj10, -0.1122F, -1.304F, 0.4749F);


		Hair8_r4 = new ModelRenderer(this);
		Hair8_r4.setRotationPoint(0.6854F, -1.718F, 0.2569F);
		FutureGohanSsj10.addChild(Hair8_r4);
		setRotationAngle(Hair8_r4, -0.5661F, -0.1845F, 0.4214F);
		Hair8_r4.cubeList.add(new ModelBox(Hair8_r4, 114, 44, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		Hair8_r5 = new ModelRenderer(this);
		Hair8_r5.setRotationPoint(0.248F, -0.7009F, -0.0004F);
		FutureGohanSsj10.addChild(Hair8_r5);
		setRotationAngle(Hair8_r5, -0.1123F, -0.1845F, 0.4214F);
		Hair8_r5.cubeList.add(new ModelBox(Hair8_r5, 114, 44, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair8_r6 = new ModelRenderer(this);
		Hair8_r6.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
		FutureGohanSsj10.addChild(Hair8_r6);
		setRotationAngle(Hair8_r6, -0.027F, -0.1901F, 0.404F);
		Hair8_r6.cubeList.add(new ModelBox(Hair8_r6, 114, 44, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj11 = new ModelRenderer(this);
		FutureGohanSsj11.setRotationPoint(-2.1324F, -8.7865F, 0.0834F);
		FutureGohanSsj.addChild(FutureGohanSsj11);
		setRotationAngle(FutureGohanSsj11, -0.2792F, -0.0018F, -0.0175F);
		FutureGohanSsj11.cubeList.add(new ModelBox(FutureGohanSsj11, 113, 36, -1.3147F, -1.6955F, -1.0319F, 2, 2, 2, 0.0F));

		Hair20_r1 = new ModelRenderer(this);
		Hair20_r1.setRotationPoint(0.0014F, -3.2509F, -0.0452F);
		FutureGohanSsj11.addChild(Hair20_r1);
		setRotationAngle(Hair20_r1, 0.0F, 0.0F, 0.2618F);
		Hair20_r1.cubeList.add(new ModelBox(Hair20_r1, 113, 36, -1.1736F, -1.9848F, -1.0F, 2, 2, 2, -0.08F));

		Hair20_r2 = new ModelRenderer(this);
		Hair20_r2.setRotationPoint(-0.2206F, -2.5349F, -0.0452F);
		FutureGohanSsj11.addChild(Hair20_r2);
		setRotationAngle(Hair20_r2, 0.0F, 0.0F, 0.1396F);
		Hair20_r2.cubeList.add(new ModelBox(Hair20_r2, 113, 36, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.02F));

		FutureGohanSsj12 = new ModelRenderer(this);
		FutureGohanSsj12.setRotationPoint(-0.3324F, -7.3865F, -0.8166F);
		FutureGohanSsj.addChild(FutureGohanSsj12);
		setRotationAngle(FutureGohanSsj12, -0.3088F, -0.059F, -0.1828F);
		FutureGohanSsj12.cubeList.add(new ModelBox(FutureGohanSsj12, 118, 43, -1.3147F, -1.6955F, -1.0319F, 2, 2, 2, 0.0F));

		Hair20_r3 = new ModelRenderer(this);
		Hair20_r3.setRotationPoint(0.1794F, -5.3349F, -0.0452F);
		FutureGohanSsj12.addChild(Hair20_r3);
		setRotationAngle(Hair20_r3, 0.0F, 0.0F, 0.3316F);
		Hair20_r3.cubeList.add(new ModelBox(Hair20_r3, 118, 43, -1.0044F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

		Hair20_r4 = new ModelRenderer(this);
		Hair20_r4.setRotationPoint(-0.2206F, -2.5349F, -0.0452F);
		FutureGohanSsj12.addChild(Hair20_r4);
		setRotationAngle(Hair20_r4, 0.0F, 0.0F, 0.1396F);
		Hair20_r4.cubeList.add(new ModelBox(Hair20_r4, 118, 43, -1.0044F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

		FutureGohanSsj13 = new ModelRenderer(this);
		FutureGohanSsj13.setRotationPoint(1.8324F, -7.8865F, -0.8166F);
		FutureGohanSsj.addChild(FutureGohanSsj13);
		setRotationAngle(FutureGohanSsj13, -0.3483F, 0.0239F, 0.0656F);
		FutureGohanSsj13.cubeList.add(new ModelBox(FutureGohanSsj13, 118, 40, -0.6853F, -1.6955F, -1.0319F, 2, 2, 2, 0.0F));

		Hair20_r5 = new ModelRenderer(this);
		Hair20_r5.setRotationPoint(-0.1794F, -5.3349F, -0.0452F);
		FutureGohanSsj13.addChild(Hair20_r5);
		setRotationAngle(Hair20_r5, 0.0F, 0.0F, -0.1745F);
		Hair20_r5.cubeList.add(new ModelBox(Hair20_r5, 118, 40, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

		Hair20_r6 = new ModelRenderer(this);
		Hair20_r6.setRotationPoint(0.2206F, -2.5349F, -0.0452F);
		FutureGohanSsj13.addChild(Hair20_r6);
		setRotationAngle(Hair20_r6, 0.0F, 0.0F, -0.1396F);
		Hair20_r6.cubeList.add(new ModelBox(Hair20_r6, 118, 40, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

		FutureGohanSsj14 = new ModelRenderer(this);
		FutureGohanSsj14.setRotationPoint(2.4324F, -8.2865F, 0.0834F);
		FutureGohanSsj.addChild(FutureGohanSsj14);
		setRotationAngle(FutureGohanSsj14, -0.2442F, 0.0067F, 0.0343F);
		FutureGohanSsj14.cubeList.add(new ModelBox(FutureGohanSsj14, 118, 37, -0.6853F, -1.6955F, -1.0319F, 2, 2, 2, 0.0F));

		Hair20_r7 = new ModelRenderer(this);
		Hair20_r7.setRotationPoint(-0.3794F, -5.0349F, -0.0452F);
		FutureGohanSsj14.addChild(Hair20_r7);
		setRotationAngle(Hair20_r7, 0.0F, 0.0F, -0.5061F);
		Hair20_r7.cubeList.add(new ModelBox(Hair20_r7, 118, 37, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair20_r8 = new ModelRenderer(this);
		Hair20_r8.setRotationPoint(0.2206F, -2.5349F, -0.0452F);
		FutureGohanSsj14.addChild(Hair20_r8);
		setRotationAngle(Hair20_r8, 0.0F, 0.0F, -0.1396F);
		Hair20_r8.cubeList.add(new ModelBox(Hair20_r8, 118, 37, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

		FutureGohanSsj15 = new ModelRenderer(this);
		FutureGohanSsj15.setRotationPoint(2.9713F, -9.1232F, 1.9767F);
		FutureGohanSsj.addChild(FutureGohanSsj15);
		setRotationAngle(FutureGohanSsj15, 0.8176F, -1.2204F, -0.5465F);


		Hair7_r4 = new ModelRenderer(this);
		Hair7_r4.setRotationPoint(0.6854F, -1.618F, 0.5569F);
		FutureGohanSsj15.addChild(Hair7_r4);
		setRotationAngle(Hair7_r4, -0.7057F, -0.1845F, 0.4214F);
		Hair7_r4.cubeList.add(new ModelBox(Hair7_r4, 113, 33, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

		Hair7_r5 = new ModelRenderer(this);
		Hair7_r5.setRotationPoint(0.248F, -0.7009F, 0.0996F);
		FutureGohanSsj15.addChild(Hair7_r5);
		setRotationAngle(Hair7_r5, -0.2869F, -0.1845F, 0.4214F);
		Hair7_r5.cubeList.add(new ModelBox(Hair7_r5, 113, 33, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

		Hair7_r6 = new ModelRenderer(this);
		Hair7_r6.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
		FutureGohanSsj15.addChild(Hair7_r6);
		setRotationAngle(Hair7_r6, -0.027F, -0.1901F, 0.404F);
		Hair7_r6.cubeList.add(new ModelBox(Hair7_r6, 113, 33, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

		FutureGohanSsj16 = new ModelRenderer(this);
		FutureGohanSsj16.setRotationPoint(2.6713F, -9.2232F, 3.1767F);
		FutureGohanSsj.addChild(FutureGohanSsj16);
		FutureGohanSsj16.cubeList.add(new ModelBox(FutureGohanSsj16, 111, 33, -1.0578F, -0.2615F, -1.0871F, 2, 2, 2, 0.0F));

		Hair7_r7 = new ModelRenderer(this);
		Hair7_r7.setRotationPoint(-0.0519F, -0.7009F, -0.2004F);
		FutureGohanSsj16.addChild(Hair7_r7);
		setRotationAngle(Hair7_r7, 0.3142F, 0.0F, 0.0F);
		Hair7_r7.cubeList.add(new ModelBox(Hair7_r7, 111, 33, -0.9994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

		Hair7_r8 = new ModelRenderer(this);
		Hair7_r8.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
		FutureGohanSsj16.addChild(Hair7_r8);
		setRotationAngle(Hair7_r8, 0.2967F, 0.0F, 0.0F);
		Hair7_r8.cubeList.add(new ModelBox(Hair7_r8, 118, 38, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

		FutureGohanSsj17 = new ModelRenderer(this);
		FutureGohanSsj17.setRotationPoint(0.6713F, -9.7232F, 2.7767F);
		FutureGohanSsj.addChild(FutureGohanSsj17);
		setRotationAngle(FutureGohanSsj17, -0.0348F, -0.003F, -0.0872F);
		FutureGohanSsj17.cubeList.add(new ModelBox(FutureGohanSsj17, 114, 40, -1.0579F, -0.2615F, -1.0871F, 2, 2, 2, 0.0F));

		Hair7_r9 = new ModelRenderer(this);
		Hair7_r9.setRotationPoint(-0.0519F, -0.7009F, -0.2004F);
		FutureGohanSsj17.addChild(Hair7_r9);
		setRotationAngle(Hair7_r9, 0.2094F, 0.0F, 0.0F);
		Hair7_r9.cubeList.add(new ModelBox(Hair7_r9, 114, 40, -0.9994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

		Hair7_r10 = new ModelRenderer(this);
		Hair7_r10.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
		FutureGohanSsj17.addChild(Hair7_r10);
		setRotationAngle(Hair7_r10, 0.192F, 0.0F, 0.0F);
		Hair7_r10.cubeList.add(new ModelBox(Hair7_r10, 114, 40, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

		FutureGohanSsj18 = new ModelRenderer(this);
		FutureGohanSsj18.setRotationPoint(-1.6287F, -9.3232F, 3.1767F);
		FutureGohanSsj.addChild(FutureGohanSsj18);
		setRotationAngle(FutureGohanSsj18, 0.1572F, -0.003F, -0.0872F);
		FutureGohanSsj18.cubeList.add(new ModelBox(FutureGohanSsj18, 115, 42, -1.0579F, -0.0615F, -1.0871F, 2, 2, 2, 0.0F));

		Hair7_r11 = new ModelRenderer(this);
		Hair7_r11.setRotationPoint(-0.0519F, -0.5009F, -0.2004F);
		FutureGohanSsj18.addChild(Hair7_r11);
		setRotationAngle(Hair7_r11, 0.2094F, 0.0F, 0.0F);
		Hair7_r11.cubeList.add(new ModelBox(Hair7_r11, 115, 42, -0.9994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

		Hair7_r12 = new ModelRenderer(this);
		Hair7_r12.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
		FutureGohanSsj18.addChild(Hair7_r12);
		setRotationAngle(Hair7_r12, 0.192F, 0.0F, 0.0F);
		Hair7_r12.cubeList.add(new ModelBox(Hair7_r12, 115, 42, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

		FutureGohanSsj19 = new ModelRenderer(this);
		FutureGohanSsj19.setRotationPoint(1.0F, -7.3F, -3.0F);
		FutureGohanSsj.addChild(FutureGohanSsj19);
		setRotationAngle(FutureGohanSsj19, 0.0744F, 0.0F, -2.9557F);
		FutureGohanSsj19.cubeList.add(new ModelBox(FutureGohanSsj19, 116, 32, -1.0F, 0.0F, -1.0F, 3, 4, 2, -0.19F));

		FutureGohanSsj20 = new ModelRenderer(this);
		FutureGohanSsj20.setRotationPoint(-1.0F, -7.3F, -3.0F);
		FutureGohanSsj.addChild(FutureGohanSsj20);
		setRotationAngle(FutureGohanSsj20, 0.1494F, 0.2172F, 3.0268F);
		FutureGohanSsj20.cubeList.add(new ModelBox(FutureGohanSsj20, 115, 32, -2.0F, 0.0F, -1.0F, 3, 4, 2, -0.19F));

		FutureGohanSsj21 = new ModelRenderer(this);
		FutureGohanSsj21.setRotationPoint(-3.0F, -6.3F, -3.0F);
		FutureGohanSsj.addChild(FutureGohanSsj21);
		setRotationAngle(FutureGohanSsj21, 0.5809F, -0.6414F, 2.9602F);
		FutureGohanSsj21.cubeList.add(new ModelBox(FutureGohanSsj21, 116, 32, -1.0F, 1.0F, -1.0F, 2, 5, 2, -0.19F));

		FutureGohanSsj22 = new ModelRenderer(this);
		FutureGohanSsj22.setRotationPoint(-3.0F, -2.3F, 3.0F);
		FutureGohanSsj.addChild(FutureGohanSsj22);
		setRotationAngle(FutureGohanSsj22, 0.2231F, 0.0F, 2.7884F);
		FutureGohanSsj22.cubeList.add(new ModelBox(FutureGohanSsj22, 116, 32, -1.3F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		FutureGohanSsj23 = new ModelRenderer(this);
		FutureGohanSsj23.setRotationPoint(-3.0F, -9.6F, -2.0F);
		FutureGohanSsj.addChild(FutureGohanSsj23);
		setRotationAngle(FutureGohanSsj23, -0.1093F, -0.3245F, 1.1471F);
		FutureGohanSsj23.cubeList.add(new ModelBox(FutureGohanSsj23, 116, 32, -0.7F, 0.0F, -0.7F, 2, 4, 2, -0.19F));

		FutureGohanSsj24 = new ModelRenderer(this);
		FutureGohanSsj24.setRotationPoint(-3.0F, -4.3F, 3.0F);
		FutureGohanSsj.addChild(FutureGohanSsj24);
		setRotationAngle(FutureGohanSsj24, 0.2033F, 0.0F, 2.7884F);
		FutureGohanSsj24.cubeList.add(new ModelBox(FutureGohanSsj24, 116, 32, -1.0F, 0.2F, -1.0F, 2, 4, 2, -0.19F));

		FutureGohanSsj25 = new ModelRenderer(this);
		FutureGohanSsj25.setRotationPoint(1.0F, -9.3F, 4.0F);
		FutureGohanSsj.addChild(FutureGohanSsj25);
		setRotationAngle(FutureGohanSsj25, -0.1662F, 0.0F, 0.0F);
		FutureGohanSsj25.cubeList.add(new ModelBox(FutureGohanSsj25, 110, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		FutureGohanSsj26 = new ModelRenderer(this);
		FutureGohanSsj26.setRotationPoint(-1.0F, -9.3F, 4.0F);
		FutureGohanSsj.addChild(FutureGohanSsj26);
		setRotationAngle(FutureGohanSsj26, -0.1487F, 0.0F, 0.0F);
		FutureGohanSsj26.cubeList.add(new ModelBox(FutureGohanSsj26, 110, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		FutureGohanSsj27 = new ModelRenderer(this);
		FutureGohanSsj27.setRotationPoint(-3.0F, -9.3F, 4.0F);
		FutureGohanSsj.addChild(FutureGohanSsj27);
		setRotationAngle(FutureGohanSsj27, -0.1115F, 0.0F, -0.1487F);
		FutureGohanSsj27.cubeList.add(new ModelBox(FutureGohanSsj27, 110, 38, -1.0F, -1.0F, -1.1F, 2, 8, 2, -0.19F));

		FutureGohanSsj28 = new ModelRenderer(this);
		FutureGohanSsj28.setRotationPoint(3.0F, -4.3F, 3.0F);
		FutureGohanSsj.addChild(FutureGohanSsj28);
		setRotationAngle(FutureGohanSsj28, 0.2033F, 0.0F, -2.7884F);
		FutureGohanSsj28.cubeList.add(new ModelBox(FutureGohanSsj28, 116, 35, -1.0F, 0.2F, -1.0F, 2, 4, 2, -0.19F));

		FutureGohanSsj29 = new ModelRenderer(this);
		FutureGohanSsj29.setRotationPoint(-3.0F, -5.3F, -2.0F);
		FutureGohanSsj.addChild(FutureGohanSsj29);
		setRotationAngle(FutureGohanSsj29, 0.0F, 0.4461F, 2.8256F);
		FutureGohanSsj29.cubeList.add(new ModelBox(FutureGohanSsj29, 114, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		FutureGohanSsj30 = new ModelRenderer(this);
		FutureGohanSsj30.setRotationPoint(-2.1F, -8.0F, -4.0F);
		FutureGohanSsj.addChild(FutureGohanSsj30);
		setRotationAngle(FutureGohanSsj30, 0.0F, 0.0F, -0.5236F);


		Vegeto59 = new ModelRenderer(this);
		Vegeto59.setRotationPoint(0.0F, -0.7F, 3.0F);
		FutureGohanSsj30.addChild(Vegeto59);
		setRotationAngle(Vegeto59, -1.1393F, 0.0F, 0.1859F);


		Hair54_r2 = new ModelRenderer(this);
		Hair54_r2.setRotationPoint(0.0F, 2.5F, 0.0F);
		Vegeto59.addChild(Hair54_r2);
		setRotationAngle(Hair54_r2, 0.0F, 0.0F, 0.1309F);
		Hair54_r2.cubeList.add(new ModelBox(Hair54_r2, 110, 34, -1.0F, -2.5F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto60 = new ModelRenderer(this);
		Vegeto60.setRotationPoint(-0.3F, 1.5F, -1.3F);
		FutureGohanSsj30.addChild(Vegeto60);
		setRotationAngle(Vegeto60, -0.0909F, 0.1075F, 0.0623F);


		Hair55_r2 = new ModelRenderer(this);
		Hair55_r2.setRotationPoint(-0.4985F, 0.3439F, 0.2023F);
		Vegeto60.addChild(Hair55_r2);
		setRotationAngle(Hair55_r2, -0.0436F, 0.0F, 0.1745F);
		Hair55_r2.cubeList.add(new ModelBox(Hair55_r2, 116, 32, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.19F));

		FutureGohanSsj31 = new ModelRenderer(this);
		FutureGohanSsj31.setRotationPoint(2.0F, -8.0F, -4.0F);
		FutureGohanSsj.addChild(FutureGohanSsj31);
		setRotationAngle(FutureGohanSsj31, 0.1239F, 0.3736F, 0.3289F);


		Vegeto61 = new ModelRenderer(this);
		Vegeto61.setRotationPoint(-1.5273F, -0.4725F, 2.7F);
		FutureGohanSsj31.addChild(Vegeto61);
		setRotationAngle(Vegeto61, -1.1022F, -0.4833F, -0.1115F);
		Vegeto61.cubeList.add(new ModelBox(Vegeto61, 110, 32, -0.9727F, 1.7725F, -1.1F, 2, 3, 2, -0.19F));

		Vegeto62 = new ModelRenderer(this);
		Vegeto62.setRotationPoint(1.1901F, 1.569F, -1.5863F);
		FutureGohanSsj31.addChild(Vegeto62);
		setRotationAngle(Vegeto62, -0.2625F, -0.4843F, -0.0372F);


		Hair53_r2 = new ModelRenderer(this);
		Hair53_r2.setRotationPoint(0.0099F, -0.069F, 0.7863F);
		Vegeto62.addChild(Hair53_r2);
		setRotationAngle(Hair53_r2, -0.0873F, 0.0F, -0.0873F);


		Hair53_r1_r2 = new ModelRenderer(this);
		Hair53_r1_r2.setRotationPoint(-0.15F, -0.2F, 0.1F);
		Hair53_r2.addChild(Hair53_r1_r2);
		setRotationAngle(Hair53_r1_r2, 0.0003F, 0.0175F, 0.0175F);
		Hair53_r1_r2.cubeList.add(new ModelBox(Hair53_r1_r2, 118, 36, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.19F));

		Gogeta = new ModelRenderer(this);
		Gogeta.setRotationPoint(0.0F, -0.2F, 0.0F);
		bipedHead.addChild(Gogeta);


		Gogeta2 = new ModelRenderer(this);
		Gogeta2.setRotationPoint(-3.0F, -8.0F, 0.0F);
		Gogeta.addChild(Gogeta2);
		setRotationAngle(Gogeta2, 2.4166F, 0.0F, -0.1487F);
		Gogeta2.cubeList.add(new ModelBox(Gogeta2, 96, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta3 = new ModelRenderer(this);
		Gogeta3.setRotationPoint(-3.0F, -8.0F, 4.0F);
		Gogeta.addChild(Gogeta3);
		setRotationAngle(Gogeta3, -3.1416F, 0.0F, 0.0744F);
		Gogeta3.cubeList.add(new ModelBox(Gogeta3, 96, 53, -1.0F, -0.5F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta4 = new ModelRenderer(this);
		Gogeta4.setRotationPoint(3.0F, -8.0F, 0.0F);
		Gogeta.addChild(Gogeta4);
		setRotationAngle(Gogeta4, 2.7489F, 0.0F, 0.2974F);
		Gogeta4.cubeList.add(new ModelBox(Gogeta4, 96, 53, -1.0F, -0.25F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta5 = new ModelRenderer(this);
		Gogeta5.setRotationPoint(1.0F, -8.0F, 0.0F);
		Gogeta.addChild(Gogeta5);
		setRotationAngle(Gogeta5, 2.9371F, 0.0F, 0.1859F);
		Gogeta5.cubeList.add(new ModelBox(Gogeta5, 96, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta6 = new ModelRenderer(this);
		Gogeta6.setRotationPoint(0.0F, -8.0F, -1.0F);
		Gogeta.addChild(Gogeta6);
		setRotationAngle(Gogeta6, 2.843F, 0.0372F, 0.1115F);
		Gogeta6.cubeList.add(new ModelBox(Gogeta6, 96, 53, -1.0F, 0.0F, -1.0F, 2, 9, 2, -0.18F));

		Gogeta7 = new ModelRenderer(this);
		Gogeta7.setRotationPoint(0.0F, -7.6667F, 4.0F);
		Gogeta.addChild(Gogeta7);
		setRotationAngle(Gogeta7, -3.0858F, 0.0F, 0.1859F);
		Gogeta7.cubeList.add(new ModelBox(Gogeta7, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta8 = new ModelRenderer(this);
		Gogeta8.setRotationPoint(-2.0F, -7.1333F, 3.0F);
		Gogeta.addChild(Gogeta8);
		setRotationAngle(Gogeta8, 2.9743F, 0.0F, 0.1487F);
		Gogeta8.cubeList.add(new ModelBox(Gogeta8, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta9 = new ModelRenderer(this);
		Gogeta9.setRotationPoint(2.0F, -8.0F, 3.0F);
		Gogeta.addChild(Gogeta9);
		setRotationAngle(Gogeta9, -3.1416F, 0.0F, 0.1487F);


		Gogeta9_1 = new ModelRenderer(this);
		Gogeta9_1.setRotationPoint(0.0F, 3.5F, 0.0F);
		Gogeta9.addChild(Gogeta9_1);
		setRotationAngle(Gogeta9_1, 0.0F, 0.0F, 0.0873F);
		Gogeta9_1.cubeList.add(new ModelBox(Gogeta9_1, 96, 53, -1.0F, -3.5F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta10 = new ModelRenderer(this);
		Gogeta10.setRotationPoint(-1.0F, -8.0F, 0.0F);
		Gogeta.addChild(Gogeta10);
		setRotationAngle(Gogeta10, 2.714F, 0.0F, -0.0744F);
		Gogeta10.cubeList.add(new ModelBox(Gogeta10, 96, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta11 = new ModelRenderer(this);
		Gogeta11.setRotationPoint(-3.0F, -7.0F, -3.0F);
		Gogeta.addChild(Gogeta11);
		setRotationAngle(Gogeta11, 2.5282F, 0.0F, 0.2033F);
		Gogeta11.cubeList.add(new ModelBox(Gogeta11, 96, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta12 = new ModelRenderer(this);
		Gogeta12.setRotationPoint(2.0F, -7.2F, 4.0F);
		Gogeta.addChild(Gogeta12);
		setRotationAngle(Gogeta12, 2.9557F, 0.0F, -0.1859F);
		Gogeta12.cubeList.add(new ModelBox(Gogeta12, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta13 = new ModelRenderer(this);
		Gogeta13.setRotationPoint(-2.0F, -8.0F, 4.0F);
		Gogeta.addChild(Gogeta13);
		setRotationAngle(Gogeta13, 2.9943F, 0.0F, 0.2231F);
		Gogeta13.cubeList.add(new ModelBox(Gogeta13, 96, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta14 = new ModelRenderer(this);
		Gogeta14.setRotationPoint(-3.0F, -8.0F, 4.0F);
		Gogeta.addChild(Gogeta14);
		setRotationAngle(Gogeta14, 3.0672F, 0.0F, 0.1859F);
		Gogeta14.cubeList.add(new ModelBox(Gogeta14, 96, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta15 = new ModelRenderer(this);
		Gogeta15.setRotationPoint(0.0F, -8.0F, 0.0F);
		Gogeta.addChild(Gogeta15);
		setRotationAngle(Gogeta15, 2.7512F, 0.0F, 0.0F);
		Gogeta15.cubeList.add(new ModelBox(Gogeta15, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta16 = new ModelRenderer(this);
		Gogeta16.setRotationPoint(3.0F, -7.2F, 4.0F);
		Gogeta.addChild(Gogeta16);
		setRotationAngle(Gogeta16, 3.0301F, 0.0F, -0.0744F);
		Gogeta16.cubeList.add(new ModelBox(Gogeta16, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta17 = new ModelRenderer(this);
		Gogeta17.setRotationPoint(0.0F, -8.0F, -1.0F);
		Gogeta.addChild(Gogeta17);
		setRotationAngle(Gogeta17, 2.8628F, 0.1487F, -0.1115F);


		Gogeta17_1 = new ModelRenderer(this);
		Gogeta17_1.setRotationPoint(0.0F, 4.0F, 0.0F);
		Gogeta17.addChild(Gogeta17_1);
		setRotationAngle(Gogeta17_1, 0.0F, 0.0F, -0.0873F);
		Gogeta17_1.cubeList.add(new ModelBox(Gogeta17_1, 96, 53, -1.0F, -4.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta18 = new ModelRenderer(this);
		Gogeta18.setRotationPoint(-3.0F, -7.0F, -3.0F);
		Gogeta.addChild(Gogeta18);
		setRotationAngle(Gogeta18, 2.5922F, 0.0372F, 0.3346F);
		Gogeta18.cubeList.add(new ModelBox(Gogeta18, 96, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta19 = new ModelRenderer(this);
		Gogeta19.setRotationPoint(0.0F, -7.0F, -3.1F);
		Gogeta.addChild(Gogeta19);


		Gogeta19_1 = new ModelRenderer(this);
		Gogeta19_1.setRotationPoint(0.0F, -1.0F, 1.0F);
		Gogeta19.addChild(Gogeta19_1);
		setRotationAngle(Gogeta19_1, -0.3924F, -0.0167F, -0.0403F);
		Gogeta19_1.cubeList.add(new ModelBox(Gogeta19_1, 104, 53, -1.0F, -5.9489F, -1.6498F, 2, 7, 2, -0.18F));

		Gogeta20 = new ModelRenderer(this);
		Gogeta20.setRotationPoint(3.0F, -7.0F, -3.0F);
		Gogeta.addChild(Gogeta20);
		setRotationAngle(Gogeta20, 2.6571F, -0.0372F, -0.0744F);
		Gogeta20.cubeList.add(new ModelBox(Gogeta20, 96, 53, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.18F));

		Gogeta21 = new ModelRenderer(this);
		Gogeta21.setRotationPoint(-2.0F, -7.0F, -3.0F);
		Gogeta.addChild(Gogeta21);
		setRotationAngle(Gogeta21, 2.6025F, -0.0744F, 0.3718F);
		Gogeta21.cubeList.add(new ModelBox(Gogeta21, 96, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta22 = new ModelRenderer(this);
		Gogeta22.setRotationPoint(1.0F, -7.0F, -3.1F);
		Gogeta.addChild(Gogeta22);
		setRotationAngle(Gogeta22, 2.7884F, 0.0F, 0.1115F);


		Gogeta22_1 = new ModelRenderer(this);
		Gogeta22_1.setRotationPoint(0.0F, 0.15F, 0.0F);
		Gogeta22.addChild(Gogeta22_1);
		setRotationAngle(Gogeta22_1, -0.0436F, 0.0F, 0.0F);
		Gogeta22_1.cubeList.add(new ModelBox(Gogeta22_1, 104, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta23 = new ModelRenderer(this);
		Gogeta23.setRotationPoint(-3.0F, -5.0F, -2.0F);
		Gogeta.addChild(Gogeta23);
		setRotationAngle(Gogeta23, 2.3794F, 0.0F, -0.3346F);
		Gogeta23.cubeList.add(new ModelBox(Gogeta23, 88, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta24 = new ModelRenderer(this);
		Gogeta24.setRotationPoint(-3.0F, -3.0F, 2.0F);
		Gogeta.addChild(Gogeta24);
		setRotationAngle(Gogeta24, 2.7884F, 0.0F, -0.1487F);
		Gogeta24.cubeList.add(new ModelBox(Gogeta24, 96, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta25 = new ModelRenderer(this);
		Gogeta25.setRotationPoint(-3.0F, -1.0F, 3.0F);
		Gogeta.addChild(Gogeta25);
		setRotationAngle(Gogeta25, 2.8999F, 0.0F, -0.2231F);
		Gogeta25.cubeList.add(new ModelBox(Gogeta25, 88, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta26 = new ModelRenderer(this);
		Gogeta26.setRotationPoint(3.0F, -4.0F, -2.0F);
		Gogeta.addChild(Gogeta26);
		setRotationAngle(Gogeta26, 2.5653F, 0.0F, 0.1859F);
		Gogeta26.cubeList.add(new ModelBox(Gogeta26, 88, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta27 = new ModelRenderer(this);
		Gogeta27.setRotationPoint(-3.0F, -1.0F, 1.0F);
		Gogeta.addChild(Gogeta27);
		setRotationAngle(Gogeta27, 2.8999F, 0.0F, -0.2974F);
		Gogeta27.cubeList.add(new ModelBox(Gogeta27, 88, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta28 = new ModelRenderer(this);
		Gogeta28.setRotationPoint(-3.0F, -6.0F, -3.2F);
		Gogeta.addChild(Gogeta28);
		setRotationAngle(Gogeta28, 2.4166F, 0.0F, -0.1487F);
		Gogeta28.cubeList.add(new ModelBox(Gogeta28, 96, 53, -1.0F, 0.0F, -1.2F, 2, 7, 2, -0.18F));

		Gogeta29 = new ModelRenderer(this);
		Gogeta29.setRotationPoint(-3.0F, -4.0F, 1.0F);
		Gogeta.addChild(Gogeta29);
		setRotationAngle(Gogeta29, 2.8999F, 0.0F, -0.1487F);
		Gogeta29.cubeList.add(new ModelBox(Gogeta29, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta30 = new ModelRenderer(this);
		Gogeta30.setRotationPoint(-3.0F, -2.0F, -1.0F);
		Gogeta.addChild(Gogeta30);
		setRotationAngle(Gogeta30, 2.5653F, 0.0F, -0.3346F);
		Gogeta30.cubeList.add(new ModelBox(Gogeta30, 88, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta31 = new ModelRenderer(this);
		Gogeta31.setRotationPoint(2.9F, -5.0F, -2.0F);
		Gogeta.addChild(Gogeta31);
		setRotationAngle(Gogeta31, 2.7884F, 0.0F, 0.0372F);
		Gogeta31.cubeList.add(new ModelBox(Gogeta31, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta32 = new ModelRenderer(this);
		Gogeta32.setRotationPoint(3.0F, -3.0F, 2.0F);
		Gogeta.addChild(Gogeta32);
		setRotationAngle(Gogeta32, 2.6769F, 0.0F, 0.2603F);
		Gogeta32.cubeList.add(new ModelBox(Gogeta32, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta33 = new ModelRenderer(this);
		Gogeta33.setRotationPoint(3.0F, -1.0F, 3.0F);
		Gogeta.addChild(Gogeta33);
		setRotationAngle(Gogeta33, 2.8999F, 0.0F, 0.2231F);
		Gogeta33.cubeList.add(new ModelBox(Gogeta33, 88, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta34 = new ModelRenderer(this);
		Gogeta34.setRotationPoint(3.0F, -4.0F, -2.0F);
		Gogeta.addChild(Gogeta34);
		setRotationAngle(Gogeta34, 2.5281F, 0.0F, 0.409F);
		Gogeta34.cubeList.add(new ModelBox(Gogeta34, 88, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta35 = new ModelRenderer(this);
		Gogeta35.setRotationPoint(3.0F, -1.0F, 1.0F);
		Gogeta.addChild(Gogeta35);
		setRotationAngle(Gogeta35, 2.6571F, 0.0F, 0.5321F);
		Gogeta35.cubeList.add(new ModelBox(Gogeta35, 88, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta36 = new ModelRenderer(this);
		Gogeta36.setRotationPoint(3.0F, -6.0F, -3.2F);
		Gogeta.addChild(Gogeta36);
		setRotationAngle(Gogeta36, 2.5653F, 0.0F, 0.1859F);
		Gogeta36.cubeList.add(new ModelBox(Gogeta36, 96, 53, -1.0F, 0.0F, -1.2F, 2, 6, 2, -0.18F));

		Gogeta37 = new ModelRenderer(this);
		Gogeta37.setRotationPoint(3.5F, -4.0F, 1.0F);
		Gogeta.addChild(Gogeta37);
		setRotationAngle(Gogeta37, 2.7512F, 0.0F, 0.1115F);
		Gogeta37.cubeList.add(new ModelBox(Gogeta37, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta38 = new ModelRenderer(this);
		Gogeta38.setRotationPoint(3.0F, -2.0F, -1.0F);
		Gogeta.addChild(Gogeta38);
		setRotationAngle(Gogeta38, 2.4166F, 0.0F, 0.3718F);
		Gogeta38.cubeList.add(new ModelBox(Gogeta38, 88, 53, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.18F));

		Gogeta39 = new ModelRenderer(this);
		Gogeta39.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gogeta.addChild(Gogeta39);
		setRotationAngle(Gogeta39, 2.4166F, 0.0F, 0.3718F);
		Gogeta39.cubeList.add(new ModelBox(Gogeta39, 88, 53, 0.0F, 0.0F, 0.0F, 2, 7, 2, -0.18F));

		Gogeta40 = new ModelRenderer(this);
		Gogeta40.setRotationPoint(0.0F, -6.0F, 3.5F);
		Gogeta.addChild(Gogeta40);
		setRotationAngle(Gogeta40, 2.8442F, 0.0F, 0.0F);
		Gogeta40.cubeList.add(new ModelBox(Gogeta40, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta41 = new ModelRenderer(this);
		Gogeta41.setRotationPoint(3.0F, -8.0F, 4.0F);
		Gogeta.addChild(Gogeta41);
		setRotationAngle(Gogeta41, -0.1047F, 0.0F, 0.1115F);
		Gogeta41.cubeList.add(new ModelBox(Gogeta41, 88, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta42 = new ModelRenderer(this);
		Gogeta42.setRotationPoint(-3.0F, -8.0F, 4.0F);
		Gogeta.addChild(Gogeta42);
		setRotationAngle(Gogeta42, -0.1047F, 0.0F, -0.1115F);
		Gogeta42.cubeList.add(new ModelBox(Gogeta42, 88, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta43 = new ModelRenderer(this);
		Gogeta43.setRotationPoint(0.0F, -8.0F, 4.0F);
		Gogeta.addChild(Gogeta43);
		setRotationAngle(Gogeta43, -0.1115F, 0.0F, 0.0F);
		Gogeta43.cubeList.add(new ModelBox(Gogeta43, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta44 = new ModelRenderer(this);
		Gogeta44.setRotationPoint(1.0F, -1.0F, 3.0F);
		Gogeta.addChild(Gogeta44);
		setRotationAngle(Gogeta44, 2.9557F, 0.0F, 0.1859F);
		Gogeta44.cubeList.add(new ModelBox(Gogeta44, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta45 = new ModelRenderer(this);
		Gogeta45.setRotationPoint(-1.0F, -1.0F, 3.0F);
		Gogeta.addChild(Gogeta45);
		setRotationAngle(Gogeta45, 2.9557F, 0.0F, -0.1859F);
		Gogeta45.cubeList.add(new ModelBox(Gogeta45, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta46 = new ModelRenderer(this);
		Gogeta46.setRotationPoint(0.0F, -3.0F, 3.0F);
		Gogeta.addChild(Gogeta46);
		setRotationAngle(Gogeta46, 2.8442F, 0.0F, 0.1115F);
		Gogeta46.cubeList.add(new ModelBox(Gogeta46, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta47 = new ModelRenderer(this);
		Gogeta47.setRotationPoint(0.0F, -3.0F, 3.0F);
		Gogeta.addChild(Gogeta47);
		setRotationAngle(Gogeta47, 2.8442F, 0.0F, -0.1859F);
		Gogeta47.cubeList.add(new ModelBox(Gogeta47, 96, 53, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.18F));

		Gogeta48 = new ModelRenderer(this);
		Gogeta48.setRotationPoint(1.4049F, -6.6474F, -4.4568F);
		Gogeta.addChild(Gogeta48);
		setRotationAngle(Gogeta48, 0.5067F, -0.6F, -0.0727F);


		Gogeta48_1 = new ModelRenderer(this);
		Gogeta48_1.setRotationPoint(-0.257F, -0.085F, 1.6388F);
		Gogeta48.addChild(Gogeta48_1);
		setRotationAngle(Gogeta48_1, -1.2881F, 0.0F, -0.2231F);


		Gogeta48_2 = new ModelRenderer(this);
		Gogeta48_2.setRotationPoint(0.5F, 2.3667F, 0.0F);
		Gogeta48_1.addChild(Gogeta48_2);
		setRotationAngle(Gogeta48_2, -0.0755F, -0.138F, -0.0878F);
		Gogeta48_2.cubeList.add(new ModelBox(Gogeta48_2, 102, 55, -1.0F, -2.5F, -1.0F, 2, 3, 2, -0.18F));

		Gogeta48_3 = new ModelRenderer(this);
		Gogeta48_3.setRotationPoint(0.8996F, 0.8334F, -3.7045F);
		Gogeta48.addChild(Gogeta48_3);
		setRotationAngle(Gogeta48_3, -0.3866F, -0.1299F, -0.1245F);


		Gogeta48_4 = new ModelRenderer(this);
		Gogeta48_4.setRotationPoint(-0.0765F, -0.5F, 2.3F);
		Gogeta48_3.addChild(Gogeta48_4);
		setRotationAngle(Gogeta48_4, -0.3927F, 0.0F, 0.0F);


		Bang_1_2_r1_r1 = new ModelRenderer(this);
		Bang_1_2_r1_r1.setRotationPoint(0.0F, -0.029F, -0.1F);
		Gogeta48_4.addChild(Bang_1_2_r1_r1);
		setRotationAngle(Bang_1_2_r1_r1, 0.0003F, -0.0175F, -0.0175F);
		Bang_1_2_r1_r1.cubeList.add(new ModelBox(Bang_1_2_r1_r1, 104, 54, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.18F));

		Gogeta49 = new ModelRenderer(this);
		Gogeta49.setRotationPoint(-3.0F, -1.0F, 1.0F);
		Gogeta.addChild(Gogeta49);
		setRotationAngle(Gogeta49, 2.6571F, 0.0F, -0.5321F);
		Gogeta49.cubeList.add(new ModelBox(Gogeta49, 88, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Gogeta50 = new ModelRenderer(this);
		Gogeta50.setRotationPoint(-1.0F, -7.0F, -3.1F);
		Gogeta.addChild(Gogeta50);
		setRotationAngle(Gogeta50, 2.7011F, 0.0F, -0.1115F);


		Gogeta50_1 = new ModelRenderer(this);
		Gogeta50_1.setRotationPoint(0.0F, 0.15F, 0.0F);
		Gogeta50.addChild(Gogeta50_1);
		setRotationAngle(Gogeta50_1, -0.0436F, 0.0019F, 0.0436F);
		Gogeta50_1.cubeList.add(new ModelBox(Gogeta50_1, 104, 53, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.18F));

		Vegeto = new ModelRenderer(this);
		Vegeto.setRotationPoint(0.0F, 24.7F, 0.0F);
		bipedHead.addChild(Vegeto);


		Vegeto2 = new ModelRenderer(this);
		Vegeto2.setRotationPoint(3.0F, -33.0F, -3.0F);
		Vegeto.addChild(Vegeto2);
		setRotationAngle(Vegeto2, -0.0744F, 0.2428F, 2.9929F);
		Vegeto2.cubeList.add(new ModelBox(Vegeto2, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto3 = new ModelRenderer(this);
		Vegeto3.setRotationPoint(1.0F, -32.0F, -3.0F);
		Vegeto.addChild(Vegeto3);
		setRotationAngle(Vegeto3, 0.0744F, 0.0F, -2.9557F);
		Vegeto3.cubeList.add(new ModelBox(Vegeto3, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto4 = new ModelRenderer(this);
		Vegeto4.setRotationPoint(-1.0F, -32.0F, -3.0F);
		Vegeto.addChild(Vegeto4);
		setRotationAngle(Vegeto4, 0.1487F, 0.2974F, -3.0292F);
		Vegeto4.cubeList.add(new ModelBox(Vegeto4, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto5 = new ModelRenderer(this);
		Vegeto5.setRotationPoint(-3.0F, -33.0F, -3.0F);
		Vegeto.addChild(Vegeto5);
		setRotationAngle(Vegeto5, -0.1115F, 0.0F, -2.9185F);
		Vegeto5.cubeList.add(new ModelBox(Vegeto5, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto6 = new ModelRenderer(this);
		Vegeto6.setRotationPoint(3.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto6);
		setRotationAngle(Vegeto6, 0.1115F, 0.2974F, 3.0301F);
		Vegeto6.cubeList.add(new ModelBox(Vegeto6, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto7 = new ModelRenderer(this);
		Vegeto7.setRotationPoint(1.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto7);
		setRotationAngle(Vegeto7, 0.2974F, -0.5949F, -3.0103F);
		Vegeto7.cubeList.add(new ModelBox(Vegeto7, 90, 38, 0.0F, -1.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto8 = new ModelRenderer(this);
		Vegeto8.setRotationPoint(-1.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto8);
		setRotationAngle(Vegeto8, 0.2974F, 0.0F, 3.1416F);
		Vegeto8.cubeList.add(new ModelBox(Vegeto8, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto9 = new ModelRenderer(this);
		Vegeto9.setRotationPoint(-3.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto9);
		setRotationAngle(Vegeto9, 0.1859F, 0.8551F, 3.1416F);
		Vegeto9.cubeList.add(new ModelBox(Vegeto9, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto10 = new ModelRenderer(this);
		Vegeto10.setRotationPoint(3.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto10);
		setRotationAngle(Vegeto10, 0.1093F, 0.0F, 3.1241F);
		Vegeto10.cubeList.add(new ModelBox(Vegeto10, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto11 = new ModelRenderer(this);
		Vegeto11.setRotationPoint(1.0F, -32.0F, 0.0F);
		Vegeto.addChild(Vegeto11);
		setRotationAngle(Vegeto11, 0.1115F, -0.8179F, -2.9929F);
		Vegeto11.cubeList.add(new ModelBox(Vegeto11, 100, 37, 1.0F, 0.0F, -2.0F, 2, 9, 2, -0.19F));

		Vegeto12 = new ModelRenderer(this);
		Vegeto12.setRotationPoint(-1.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto12);
		setRotationAngle(Vegeto12, 0.3421F, 0.0F, -3.1416F);
		Vegeto12.cubeList.add(new ModelBox(Vegeto12, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto13 = new ModelRenderer(this);
		Vegeto13.setRotationPoint(-3.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto13);
		setRotationAngle(Vegeto13, 0.1859F, 0.0F, -3.0672F);
		Vegeto13.cubeList.add(new ModelBox(Vegeto13, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto14 = new ModelRenderer(this);
		Vegeto14.setRotationPoint(3.0F, -33.0F, 2.0F);
		Vegeto.addChild(Vegeto14);
		setRotationAngle(Vegeto14, 0.0744F, 0.0F, 3.1044F);
		Vegeto14.cubeList.add(new ModelBox(Vegeto14, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto15 = new ModelRenderer(this);
		Vegeto15.setRotationPoint(1.0F, -32.0F, 2.0F);
		Vegeto.addChild(Vegeto15);
		setRotationAngle(Vegeto15, 0.1115F, 0.0F, 3.1416F);
		Vegeto15.cubeList.add(new ModelBox(Vegeto15, 97, 36, -1.0F, 0.0F, -1.0F, 2, 10, 2, -0.19F));

		Vegeto16 = new ModelRenderer(this);
		Vegeto16.setRotationPoint(-1.0F, -33.0F, 2.0F);
		Vegeto.addChild(Vegeto16);
		setRotationAngle(Vegeto16, 0.1487F, 0.0F, -3.1044F);
		Vegeto16.cubeList.add(new ModelBox(Vegeto16, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto17 = new ModelRenderer(this);
		Vegeto17.setRotationPoint(-3.0F, -33.0F, 2.0F);
		Vegeto.addChild(Vegeto17);
		setRotationAngle(Vegeto17, 0.0372F, 0.9666F, 3.1044F);
		Vegeto17.cubeList.add(new ModelBox(Vegeto17, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto18 = new ModelRenderer(this);
		Vegeto18.setRotationPoint(-3.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto18);
		setRotationAngle(Vegeto18, -0.0744F, -0.7436F, -2.9185F);
		Vegeto18.cubeList.add(new ModelBox(Vegeto18, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto19 = new ModelRenderer(this);
		Vegeto19.setRotationPoint(-1.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto19);
		setRotationAngle(Vegeto19, 0.1115F, 0.0F, 3.1416F);
		Vegeto19.cubeList.add(new ModelBox(Vegeto19, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto20 = new ModelRenderer(this);
		Vegeto20.setRotationPoint(1.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto20);
		setRotationAngle(Vegeto20, 0.1859F, -0.632F, 3.0126F);
		Vegeto20.cubeList.add(new ModelBox(Vegeto20, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto21 = new ModelRenderer(this);
		Vegeto21.setRotationPoint(3.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto21);
		setRotationAngle(Vegeto21, 0.1487F, 0.0F, 2.9929F);
		Vegeto21.cubeList.add(new ModelBox(Vegeto21, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto22 = new ModelRenderer(this);
		Vegeto22.setRotationPoint(-3.0F, -33.0F, -3.0F);
		Vegeto.addChild(Vegeto22);
		setRotationAngle(Vegeto22, 0.2231F, 0.0F, 0.4833F);
		Vegeto22.cubeList.add(new ModelBox(Vegeto22, 94, 36, -1.0F, 0.0F, -1.0F, 2, 3, 2, -0.19F));

		Vegeto23 = new ModelRenderer(this);
		Vegeto23.setRotationPoint(-3.0F, -31.0F, -3.0F);
		Vegeto.addChild(Vegeto23);
		setRotationAngle(Vegeto23, 0.1115F, -0.5949F, 3.0858F);
		Vegeto23.cubeList.add(new ModelBox(Vegeto23, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto24 = new ModelRenderer(this);
		Vegeto24.setRotationPoint(-3.0F, -28.0F, 1.0F);
		Vegeto.addChild(Vegeto24);
		setRotationAngle(Vegeto24, 0.2231F, 0.0F, 2.7884F);
		Vegeto24.cubeList.add(new ModelBox(Vegeto24, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto25 = new ModelRenderer(this);
		Vegeto25.setRotationPoint(-3.0F, -29.0F, -1.0F);
		Vegeto.addChild(Vegeto25);
		setRotationAngle(Vegeto25, 0.2231F, 0.0F, 2.6769F);
		Vegeto25.cubeList.add(new ModelBox(Vegeto25, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto26 = new ModelRenderer(this);
		Vegeto26.setRotationPoint(-3.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto26);
		setRotationAngle(Vegeto26, 0.1662F, 0.0F, 3.1044F);
		Vegeto26.cubeList.add(new ModelBox(Vegeto26, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto27 = new ModelRenderer(this);
		Vegeto27.setRotationPoint(-3.0F, -31.0F, 2.0F);
		Vegeto.addChild(Vegeto27);
		setRotationAngle(Vegeto27, 0.0372F, 0.5949F, 2.7884F);
		Vegeto27.cubeList.add(new ModelBox(Vegeto27, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto28 = new ModelRenderer(this);
		Vegeto28.setRotationPoint(-3.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto28);
		setRotationAngle(Vegeto28, 0.2231F, -0.3718F, 3.1056F);


		Hair27_r1 = new ModelRenderer(this);
		Hair27_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Vegeto28.addChild(Hair27_r1);
		setRotationAngle(Hair27_r1, -0.0172F, 0.1298F, -0.132F);
		Hair27_r1.cubeList.add(new ModelBox(Hair27_r1, 90, 39, -1.0F, -2.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto29 = new ModelRenderer(this);
		Vegeto29.setRotationPoint(-3.0F, -30.0F, -3.0F);
		Vegeto.addChild(Vegeto29);
		setRotationAngle(Vegeto29, 0.2231F, 0.0F, 2.9743F);
		Vegeto29.cubeList.add(new ModelBox(Vegeto29, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto30 = new ModelRenderer(this);
		Vegeto30.setRotationPoint(-3.0F, -29.0F, 2.0F);
		Vegeto.addChild(Vegeto30);
		setRotationAngle(Vegeto30, 0.2231F, 0.0F, 2.8256F);
		Vegeto30.cubeList.add(new ModelBox(Vegeto30, 94, 36, -0.7F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto31 = new ModelRenderer(this);
		Vegeto31.setRotationPoint(-3.0F, -27.0F, 3.0F);
		Vegeto.addChild(Vegeto31);
		setRotationAngle(Vegeto31, 0.2231F, 0.0F, 2.7884F);
		Vegeto31.cubeList.add(new ModelBox(Vegeto31, 94, 36, -1.3F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto32 = new ModelRenderer(this);
		Vegeto32.setRotationPoint(-4.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto32);
		setRotationAngle(Vegeto32, 0.2777F, -0.4461F, -3.1416F);
		Vegeto32.cubeList.add(new ModelBox(Vegeto32, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto33 = new ModelRenderer(this);
		Vegeto33.setRotationPoint(-3.0F, -30.0F, -2.0F);
		Vegeto.addChild(Vegeto33);
		setRotationAngle(Vegeto33, -0.1487F, 0.7064F, 2.7884F);
		Vegeto33.cubeList.add(new ModelBox(Vegeto33, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto34 = new ModelRenderer(this);
		Vegeto34.setRotationPoint(-3.0F, -29.0F, 3.0F);
		Vegeto.addChild(Vegeto34);
		setRotationAngle(Vegeto34, 0.2033F, 0.0F, 2.7884F);
		Vegeto34.cubeList.add(new ModelBox(Vegeto34, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto35 = new ModelRenderer(this);
		Vegeto35.setRotationPoint(-3.0F, -30.0F, 0.0F);
		Vegeto.addChild(Vegeto35);
		setRotationAngle(Vegeto35, 0.2231F, 0.3346F, 2.7884F);
		Vegeto35.cubeList.add(new ModelBox(Vegeto35, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto36 = new ModelRenderer(this);
		Vegeto36.setRotationPoint(3.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto36);
		setRotationAngle(Vegeto36, -0.1487F, 0.0F, 0.1487F);
		Vegeto36.cubeList.add(new ModelBox(Vegeto36, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto37 = new ModelRenderer(this);
		Vegeto37.setRotationPoint(1.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto37);
		setRotationAngle(Vegeto37, -0.1662F, 0.0F, 0.0F);
		Vegeto37.cubeList.add(new ModelBox(Vegeto37, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto38 = new ModelRenderer(this);
		Vegeto38.setRotationPoint(-1.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto38);
		setRotationAngle(Vegeto38, -0.1487F, 0.0F, 0.0F);
		Vegeto38.cubeList.add(new ModelBox(Vegeto38, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto39 = new ModelRenderer(this);
		Vegeto39.setRotationPoint(-3.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto39);
		setRotationAngle(Vegeto39, -0.1115F, 0.0F, -0.1487F);
		Vegeto39.cubeList.add(new ModelBox(Vegeto39, 90, 38, -1.0F, -1.0F, -1.1F, 2, 8, 2, -0.19F));

		Vegeto40 = new ModelRenderer(this);
		Vegeto40.setRotationPoint(3.0F, -31.0F, -3.0F);
		Vegeto.addChild(Vegeto40);
		setRotationAngle(Vegeto40, 0.0372F, 0.0F, -3.0487F);
		Vegeto40.cubeList.add(new ModelBox(Vegeto40, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto41 = new ModelRenderer(this);
		Vegeto41.setRotationPoint(3.094F, -27.966F, 1.0F);
		Vegeto.addChild(Vegeto41);
		setRotationAngle(Vegeto41, 0.2231F, 0.0F, -2.7942F);
		Vegeto41.cubeList.add(new ModelBox(Vegeto41, 94, 36, -0.8F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto42 = new ModelRenderer(this);
		Vegeto42.setRotationPoint(3.0894F, -28.9552F, -1.0F);
		Vegeto.addChild(Vegeto42);
		setRotationAngle(Vegeto42, 0.2231F, 0.0F, -2.6769F);
		Vegeto42.cubeList.add(new ModelBox(Vegeto42, 94, 36, -0.8F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto43 = new ModelRenderer(this);
		Vegeto43.setRotationPoint(3.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto43);
		setRotationAngle(Vegeto43, 0.1662F, 0.5205F, 3.1044F);
		Vegeto43.cubeList.add(new ModelBox(Vegeto43, 91, 37, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto44 = new ModelRenderer(this);
		Vegeto44.setRotationPoint(3.0F, -31.0F, 2.0F);
		Vegeto.addChild(Vegeto44);
		setRotationAngle(Vegeto44, 0.1859F, 0.4461F, -2.9743F);
		Vegeto44.cubeList.add(new ModelBox(Vegeto44, 99, 37, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto45 = new ModelRenderer(this);
		Vegeto45.setRotationPoint(3.0F, -32.5F, 0.0F);
		Vegeto.addChild(Vegeto45);
		setRotationAngle(Vegeto45, -0.1859F, -1.8218F, -2.9743F);
		Vegeto45.cubeList.add(new ModelBox(Vegeto45, 97, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto46 = new ModelRenderer(this);
		Vegeto46.setRotationPoint(3.0F, -30.0F, -3.0F);
		Vegeto.addChild(Vegeto46);
		setRotationAngle(Vegeto46, 0.2603F, 0.0F, -3.1416F);
		Vegeto46.cubeList.add(new ModelBox(Vegeto46, 99, 38, -1.0F, 1.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto47 = new ModelRenderer(this);
		Vegeto47.setRotationPoint(3.0F, -29.0F, 2.0F);
		Vegeto.addChild(Vegeto47);
		setRotationAngle(Vegeto47, 0.2231F, 0.0F, -2.8256F);
		Vegeto47.cubeList.add(new ModelBox(Vegeto47, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto48 = new ModelRenderer(this);
		Vegeto48.setRotationPoint(4.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto48);
		setRotationAngle(Vegeto48, 0.2405F, 0.409F, 3.1044F);
		Vegeto48.cubeList.add(new ModelBox(Vegeto48, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto49 = new ModelRenderer(this);
		Vegeto49.setRotationPoint(3.0F, -30.0F, -2.0F);
		Vegeto.addChild(Vegeto49);
		setRotationAngle(Vegeto49, 0.0F, -0.4461F, -2.8256F);
		Vegeto49.cubeList.add(new ModelBox(Vegeto49, 90, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto50 = new ModelRenderer(this);
		Vegeto50.setRotationPoint(3.0F, -29.0F, 3.0F);
		Vegeto.addChild(Vegeto50);
		setRotationAngle(Vegeto50, 0.2033F, 0.0F, -2.7884F);
		Vegeto50.cubeList.add(new ModelBox(Vegeto50, 96, 35, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto51 = new ModelRenderer(this);
		Vegeto51.setRotationPoint(3.0F, -30.0F, 0.0F);
		Vegeto.addChild(Vegeto51);
		setRotationAngle(Vegeto51, 0.2231F, 0.0F, -2.7884F);
		Vegeto51.cubeList.add(new ModelBox(Vegeto51, 100, 35, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto52 = new ModelRenderer(this);
		Vegeto52.setRotationPoint(-0.4727F, -33.1725F, -1.3F);
		Vegeto.addChild(Vegeto52);
		setRotationAngle(Vegeto52, -1.1022F, 0.4833F, 0.1115F);
		Vegeto52.cubeList.add(new ModelBox(Vegeto52, 100, 32, -1.0273F, -0.2275F, -1.1F, 2, 5, 2, -0.19F));

		Vegeto53 = new ModelRenderer(this);
		Vegeto53.setRotationPoint(-3.1901F, -31.131F, -5.5863F);
		Vegeto.addChild(Vegeto53);
		setRotationAngle(Vegeto53, -0.2625F, 0.4843F, 0.0372F);


		Hair53_r1 = new ModelRenderer(this);
		Hair53_r1.setRotationPoint(-0.0099F, -0.069F, 0.7863F);
		Vegeto53.addChild(Hair53_r1);
		setRotationAngle(Hair53_r1, -0.0873F, 0.0F, 0.0873F);


		Hair53_r1_r1 = new ModelRenderer(this);
		Hair53_r1_r1.setRotationPoint(0.15F, -0.2F, 0.1F);
		Hair53_r1.addChild(Hair53_r1_r1);
		setRotationAngle(Hair53_r1_r1, 0.0003F, -0.0175F, -0.0175F);
		Hair53_r1_r1.cubeList.add(new ModelBox(Hair53_r1_r1, 90, 36, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.19F));

		Vegeto54 = new ModelRenderer(this);
		Vegeto54.setRotationPoint(1.5F, -33.4F, -1.0F);
		Vegeto.addChild(Vegeto54);
		setRotationAngle(Vegeto54, -1.1393F, 0.0F, -0.1859F);


		Hair54_r1 = new ModelRenderer(this);
		Hair54_r1.setRotationPoint(0.0F, 2.5F, 0.0F);
		Vegeto54.addChild(Hair54_r1);
		setRotationAngle(Hair54_r1, 0.0F, 0.0F, -0.1309F);
		Hair54_r1.cubeList.add(new ModelBox(Hair54_r1, 98, 32, -1.0F, -2.5F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto55 = new ModelRenderer(this);
		Vegeto55.setRotationPoint(1.8F, -31.2F, -6.1F);
		Vegeto.addChild(Vegeto55);
		setRotationAngle(Vegeto55, -0.0766F, 0.0F, -0.0372F);


		Hair55_r1 = new ModelRenderer(this);
		Hair55_r1.setRotationPoint(0.4F, 0.3F, 1.0F);
		Vegeto55.addChild(Hair55_r1);
		setRotationAngle(Hair55_r1, -0.0436F, 0.0F, -0.1745F);
		Hair55_r1.cubeList.add(new ModelBox(Hair55_r1, 94, 36, -0.9F, -1.5F, -1.0F, 2, 3, 2, -0.19F));

		Vegeto56 = new ModelRenderer(this);
		Vegeto56.setRotationPoint(-3.0F, -30.0F, -2.0F);
		Vegeto.addChild(Vegeto56);
		setRotationAngle(Vegeto56, 0.0F, 0.4461F, 2.8256F);
		Vegeto56.cubeList.add(new ModelBox(Vegeto56, 94, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto57 = new ModelRenderer(this);
		Vegeto57.setRotationPoint(-3.0F, -28.0F, 1.0F);
		Vegeto.addChild(Vegeto57);
		setRotationAngle(Vegeto57, 0.2231F, 0.0F, 2.7942F);
		Vegeto57.cubeList.add(new ModelBox(Vegeto57, 94, 35, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto58 = new ModelRenderer(this);
		Vegeto58.setRotationPoint(-3.0F, -29.0F, -1.0F);
		Vegeto.addChild(Vegeto58);
		setRotationAngle(Vegeto58, 0.2231F, 0.0F, 2.6769F);
		Vegeto58.cubeList.add(new ModelBox(Vegeto58, 90, 32, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Trunks = new ModelRenderer(this);
		Trunks.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(Trunks);


		Trunks2 = new ModelRenderer(this);
		Trunks2.setRotationPoint(-3.0F, -9.0F, 0.0F);
		Trunks.addChild(Trunks2);
		setRotationAngle(Trunks2, -0.0873F, 0.0F, -2.2689F);
		Trunks2.cubeList.add(new ModelBox(Trunks2, 92, 3, -2.5133F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Trunks3 = new ModelRenderer(this);
		Trunks3.setRotationPoint(3.0F, -9.0F, 0.0F);
		Trunks.addChild(Trunks3);
		setRotationAngle(Trunks3, -0.0873F, 0.0F, 2.2689F);
		Trunks3.cubeList.add(new ModelBox(Trunks3, 92, 3, -0.4867F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Trunks4 = new ModelRenderer(this);
		Trunks4.setRotationPoint(3.4F, -9.0F, -1.8F);
		Trunks.addChild(Trunks4);
		setRotationAngle(Trunks4, 0.5236F, -0.3491F, 2.1816F);
		Trunks4.cubeList.add(new ModelBox(Trunks4, 92, 3, -0.4867F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Trunks5 = new ModelRenderer(this);
		Trunks5.setRotationPoint(-3.4F, -9.0F, -1.8F);
		Trunks.addChild(Trunks5);
		setRotationAngle(Trunks5, 0.5236F, 0.3491F, -2.1816F);
		Trunks5.cubeList.add(new ModelBox(Trunks5, 92, 3, -2.5133F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Trunks6 = new ModelRenderer(this);
		Trunks6.setRotationPoint(-2.8F, -9.0F, 2.9F);
		Trunks.addChild(Trunks6);
		setRotationAngle(Trunks6, -0.0873F, 0.0F, -2.1816F);
		Trunks6.cubeList.add(new ModelBox(Trunks6, 92, 3, -2.5133F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Trunks7 = new ModelRenderer(this);
		Trunks7.setRotationPoint(2.8F, -9.0F, 2.9F);
		Trunks.addChild(Trunks7);
		setRotationAngle(Trunks7, -0.0873F, 0.0F, 2.1816F);
		Trunks7.cubeList.add(new ModelBox(Trunks7, 92, 3, -0.4867F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Trunks8 = new ModelRenderer(this);
		Trunks8.setRotationPoint(2.8F, -8.9F, 2.9F);
		Trunks.addChild(Trunks8);
		setRotationAngle(Trunks8, -0.7855F, -0.6981F, 3.0543F);


		Hair7_r25 = new ModelRenderer(this);
		Hair7_r25.setRotationPoint(1.0133F, 0.526F, -1.0714F);
		Trunks8.addChild(Hair7_r25);
		setRotationAngle(Hair7_r25, -0.192F, 0.0F, 0.0F);
		Hair7_r25.cubeList.add(new ModelBox(Hair7_r25, 92, 3, -1.5F, -5.0F, -1.0F, 3, 6, 2, 0.0F));

		Trunks9 = new ModelRenderer(this);
		Trunks9.setRotationPoint(-2.8F, -8.9F, 2.9F);
		Trunks.addChild(Trunks9);
		setRotationAngle(Trunks9, -0.7855F, 0.6981F, -3.0543F);


		Hair8_r13 = new ModelRenderer(this);
		Hair8_r13.setRotationPoint(-1.0133F, 0.526F, -1.0714F);
		Trunks9.addChild(Hair8_r13);
		setRotationAngle(Hair8_r13, -0.192F, 0.0F, 0.0F);
		Hair8_r13.cubeList.add(new ModelBox(Hair8_r13, 92, 3, -1.5F, -5.0F, -1.0F, 3, 6, 2, 0.0F));

		Trunks10 = new ModelRenderer(this);
		Trunks10.setRotationPoint(-4.0F, -8.0F, -2.0F);
		Trunks.addChild(Trunks10);
		setRotationAngle(Trunks10, -0.3491F, 0.0F, 0.7854F);
		Trunks10.cubeList.add(new ModelBox(Trunks10, 88, 3, 1.6436F, -1.6388F, -3.0979F, 1, 5, 1, 0.0F));
		Trunks10.cubeList.add(new ModelBox(Trunks10, 88, 3, 0.6436F, -1.5388F, -2.5979F, 1, 3, 1, 0.0F));

		Trunks11 = new ModelRenderer(this);
		Trunks11.setRotationPoint(4.0F, -8.0F, -2.0F);
		Trunks.addChild(Trunks11);
		setRotationAngle(Trunks11, -0.3491F, 0.0F, -0.7854F);
		Trunks11.cubeList.add(new ModelBox(Trunks11, 88, 3, -2.6436F, -1.6388F, -3.0979F, 1, 5, 1, 0.0F));
		Trunks11.cubeList.add(new ModelBox(Trunks11, 88, 3, -1.6436F, -1.4388F, -2.5979F, 1, 3, 1, 0.0F));

		TrunksSsj = new ModelRenderer(this);
		TrunksSsj.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(TrunksSsj);


		TrunksSsj2 = new ModelRenderer(this);
		TrunksSsj2.setRotationPoint(-1.0F, -9.0F, 0.0F);
		TrunksSsj.addChild(TrunksSsj2);
		setRotationAngle(TrunksSsj2, -0.0873F, 0.0F, -0.6981F);
		TrunksSsj2.cubeList.add(new ModelBox(TrunksSsj2, 113, 20, -2.5133F, -4.474F, -1.9714F, 3, 6, 3, 0.0F));

		TrunksSsj3 = new ModelRenderer(this);
		TrunksSsj3.setRotationPoint(1.0F, -9.0F, 0.0F);
		TrunksSsj.addChild(TrunksSsj3);
		setRotationAngle(TrunksSsj3, -0.0873F, 0.0F, 0.6981F);
		TrunksSsj3.cubeList.add(new ModelBox(TrunksSsj3, 113, 20, -0.4867F, -4.474F, -1.9714F, 3, 6, 3, 0.0F));

		TrunksSsj4 = new ModelRenderer(this);
		TrunksSsj4.setRotationPoint(1.8F, -9.0F, -1.6F);
		TrunksSsj.addChild(TrunksSsj4);
		setRotationAngle(TrunksSsj4, -0.0873F, 0.0F, 0.8726F);
		TrunksSsj4.cubeList.add(new ModelBox(TrunksSsj4, 113, 20, -0.4867F, -3.474F, -2.0714F, 3, 5, 3, 0.0F));

		TrunksSsj5 = new ModelRenderer(this);
		TrunksSsj5.setRotationPoint(-1.8F, -9.0F, -1.6F);
		TrunksSsj.addChild(TrunksSsj5);
		setRotationAngle(TrunksSsj5, -0.0873F, 0.0F, -0.8726F);
		TrunksSsj5.cubeList.add(new ModelBox(TrunksSsj5, 113, 20, -2.5133F, -3.474F, -2.0714F, 3, 5, 3, 0.0F));

		TrunksSsj6 = new ModelRenderer(this);
		TrunksSsj6.setRotationPoint(-1.8F, -9.0F, 2.9F);
		TrunksSsj.addChild(TrunksSsj6);
		setRotationAngle(TrunksSsj6, -0.0873F, 0.0F, -0.4363F);
		TrunksSsj6.cubeList.add(new ModelBox(TrunksSsj6, 113, 20, -2.5133F, -3.474F, -1.8714F, 3, 5, 3, 0.0F));

		TrunksSsj7 = new ModelRenderer(this);
		TrunksSsj7.setRotationPoint(1.8F, -9.0F, 2.9F);
		TrunksSsj.addChild(TrunksSsj7);
		setRotationAngle(TrunksSsj7, -0.0873F, 0.0F, 0.4363F);
		TrunksSsj7.cubeList.add(new ModelBox(TrunksSsj7, 113, 20, -0.4867F, -3.474F, -1.8714F, 3, 5, 3, 0.0F));

		TrunksSsj8 = new ModelRenderer(this);
		TrunksSsj8.setRotationPoint(-0.2F, -9.0F, 2.9F);
		TrunksSsj.addChild(TrunksSsj8);
		setRotationAngle(TrunksSsj8, -0.4364F, -0.6981F, 0.6981F);
		TrunksSsj8.cubeList.add(new ModelBox(TrunksSsj8, 113, 20, 0.5133F, -4.474F, -2.0714F, 2, 6, 2, 0.0F));

		TrunksSsj9 = new ModelRenderer(this);
		TrunksSsj9.setRotationPoint(0.2F, -9.0F, 2.9F);
		TrunksSsj.addChild(TrunksSsj9);
		setRotationAngle(TrunksSsj9, -0.4364F, 0.6981F, -0.6981F);
		TrunksSsj9.cubeList.add(new ModelBox(TrunksSsj9, 113, 20, -2.5133F, -4.474F, -2.0714F, 2, 6, 2, 0.0F));

		TrunksSsj10 = new ModelRenderer(this);
		TrunksSsj10.setRotationPoint(1.8F, -9.0F, -1.6F);
		TrunksSsj.addChild(TrunksSsj10);
		setRotationAngle(TrunksSsj10, -0.0873F, 0.0F, 0.8726F);
		TrunksSsj10.cubeList.add(new ModelBox(TrunksSsj10, 113, 20, 1.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		TrunksSsj11 = new ModelRenderer(this);
		TrunksSsj11.setRotationPoint(-1.8F, -9.0F, -1.6F);
		TrunksSsj.addChild(TrunksSsj11);
		setRotationAngle(TrunksSsj11, -0.0873F, 0.0F, -0.8726F);
		TrunksSsj11.cubeList.add(new ModelBox(TrunksSsj11, 113, 20, -4.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		TrunksSsj12 = new ModelRenderer(this);
		TrunksSsj12.setRotationPoint(-2.8F, -9.0F, 1.1F);
		TrunksSsj.addChild(TrunksSsj12);
		setRotationAngle(TrunksSsj12, -0.0873F, 0.0F, -1.2217F);
		TrunksSsj12.cubeList.add(new ModelBox(TrunksSsj12, 113, 20, -4.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		TrunksSsj13 = new ModelRenderer(this);
		TrunksSsj13.setRotationPoint(2.8F, -9.0F, 1.1F);
		TrunksSsj.addChild(TrunksSsj13);
		setRotationAngle(TrunksSsj13, -0.0873F, 0.0F, 1.2217F);
		TrunksSsj13.cubeList.add(new ModelBox(TrunksSsj13, 113, 20, 1.4882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		TrunksSsj14 = new ModelRenderer(this);
		TrunksSsj14.setRotationPoint(-1.2F, -7.0F, 2.1F);
		TrunksSsj.addChild(TrunksSsj14);
		setRotationAngle(TrunksSsj14, -0.4364F, 0.0F, 0.0872F);
		TrunksSsj14.cubeList.add(new ModelBox(TrunksSsj14, 113, 20, 0.6882F, -3.1308F, -0.0337F, 4, 5, 3, 0.0F));

		TrunksSsj15 = new ModelRenderer(this);
		TrunksSsj15.setRotationPoint(1.2F, -7.0F, 2.1F);
		TrunksSsj.addChild(TrunksSsj15);
		setRotationAngle(TrunksSsj15, -0.4364F, 0.0F, -0.0872F);
		TrunksSsj15.cubeList.add(new ModelBox(TrunksSsj15, 113, 20, -4.6882F, -3.1308F, -0.0337F, 4, 5, 3, 0.0F));

		TrunksSsj16 = new ModelRenderer(this);
		TrunksSsj16.setRotationPoint(-4.0F, -8.0F, -2.0F);
		TrunksSsj.addChild(TrunksSsj16);
		setRotationAngle(TrunksSsj16, -0.3491F, 0.0F, 0.7854F);
		TrunksSsj16.cubeList.add(new ModelBox(TrunksSsj16, 109, 20, 1.6436F, -1.6388F, -3.0979F, 1, 5, 1, 0.0F));

		TrunksSsj17 = new ModelRenderer(this);
		TrunksSsj17.setRotationPoint(4.0F, -8.0F, -2.0F);
		TrunksSsj.addChild(TrunksSsj17);
		setRotationAngle(TrunksSsj17, -0.3491F, 0.0F, -0.7854F);
		TrunksSsj17.cubeList.add(new ModelBox(TrunksSsj17, 110, 21, -2.6436F, -1.6388F, -3.0979F, 1, 5, 1, 0.0F));

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
        bipedBody.setRotationPoint(0.0F, 5.4F, 0.0F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, -5.4F, -2.0F, 8, 12, 4, 0.0F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, -2.4F, 0.0F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(5.0F, -2.4F, 0.0F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 32, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.0F, 6.6F, 0.0F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(2.0F, 6.6F, 0.0F);
        bipedLeftLeg.mirror = true;
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 32, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
    }


    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.0399999618530273 + 5.5 / (1.0 + Math.pow(scale / 0.45F, 1.8799999952316284))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        bipedBody.render(scaleFactor);
        renderHairs(0.0625F, "FR", limbSwingAmount);
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
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
