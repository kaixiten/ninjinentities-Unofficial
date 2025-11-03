package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelGeneral1 extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer vegeta;
    private final ModelRenderer vegeta1;
    private final ModelRenderer vegeta2;
    private final ModelRenderer vegeta3;
    private final ModelRenderer vegeta4;
    private final ModelRenderer vegeta5;
    private final ModelRenderer vegeta6;
    private final ModelRenderer vegeta7;
    private final ModelRenderer vegeta8;
    private final ModelRenderer vegeta9;
    private final ModelRenderer vegeta10;
    private final ModelRenderer vegeta11;
    private final ModelRenderer vegeta12;
    private final ModelRenderer vegeta13;
    private final ModelRenderer vegeta14;
    private final ModelRenderer vegeta15;
    private final ModelRenderer vegeta16;
    private final ModelRenderer vegeta17;
    private final ModelRenderer vegeta18;
    private final ModelRenderer vegeta19;
    private final ModelRenderer vegeta20;
    private final ModelRenderer vegeta21;
    private final ModelRenderer vegeta22;
    private final ModelRenderer vegetaSsjThree;
    private final ModelRenderer vegetaSsjThree1;
    private final ModelRenderer vegetaSsjThree2;
    private final ModelRenderer vegetaSsjThree3;
    private final ModelRenderer vegetaSsjThree4;
    private final ModelRenderer vegetaSsjThree5;
    private final ModelRenderer vegetaSsjThree6;
    private final ModelRenderer vegetaSsjThree7;
    private final ModelRenderer vegetaSsjThree8;
    private final ModelRenderer vegetaSsjThree9;
    private final ModelRenderer vegetaSsjThree10;
    private final ModelRenderer vegetaSsjThree11;
    private final ModelRenderer vegetaSsjThree12;
    private final ModelRenderer vegetaSsjThree13;
    private final ModelRenderer vegetaSsjThree14;
    private final ModelRenderer vegetaSsjThree15;
    private final ModelRenderer vegetaSsjThree16;
    private final ModelRenderer vegetaSsjThree17;
    private final ModelRenderer vegetaSsjThree18;
    private final ModelRenderer vegetaSsjThree19;
    private final ModelRenderer vegetaSsjThree20;
    private final ModelRenderer vegetaSsjThree21;
    private final ModelRenderer vegetaSsjThree22;
    private final ModelRenderer vegetaSsjThree23;
    private final ModelRenderer vegetaSsjThree24;
    private final ModelRenderer vegetaSsjThree25;
    private final ModelRenderer vegetaSsjThree26;
    private final ModelRenderer vegetaSsjThree27;
    private final ModelRenderer vegetaSsjThree28;
    private final ModelRenderer vegetaSsjThree29;
    private final ModelRenderer vegetaSsjThree30;
    private final ModelRenderer vegetaSsjThree31;
    private final ModelRenderer vegetaSsjThree32;
    private final ModelRenderer vegetaSsjThree33;
    private final ModelRenderer vegetaSsjThree34;
    private final ModelRenderer vegetaSsjThree35;
    private final ModelRenderer vegetaSsjThree36;
    private final ModelRenderer vegetaSsjThree37;
    private final ModelRenderer vegetaSsjThree38;
    private final ModelRenderer vegetaSsjThree39;
    private final ModelRenderer vegetaSsjThree40;
    private final ModelRenderer vegetaSsjThree41;
    private final ModelRenderer vegetaSsjThree42;
    private final ModelRenderer vegetaSsjThree43;
    private final ModelRenderer vegetaSsjThree44;
    private final ModelRenderer Hair10_r6;
    private final ModelRenderer vegetaSsjThree45;
    private final ModelRenderer vegetaSsjThree46;
    private final ModelRenderer vegetaSsjThree47;
    private final ModelRenderer vegetaSsjThree48;
    private final ModelRenderer vegetaSsjThree49;
    private final ModelRenderer Hair10_r7;
    private final ModelRenderer vegetaSsjThree50;
    private final ModelRenderer vegetaSsjThree51;
    private final ModelRenderer vegetaSsjThree52;
    private final ModelRenderer vegetaSsjThree53;
    private final ModelRenderer vegetaSsjThree54;
    private final ModelRenderer Hair10_r8;
    private final ModelRenderer vegetaSsjThree55;
    private final ModelRenderer vegetaSsjThree56;
    private final ModelRenderer vegetaSsjThree57;
    private final ModelRenderer vegetaSsjThree58;
    private final ModelRenderer vegetaSsjThree59;
    private final ModelRenderer goku;
    private final ModelRenderer goku1;
    private final ModelRenderer goku2;
    private final ModelRenderer goku3;
    private final ModelRenderer goku4;
    private final ModelRenderer goku5;
    private final ModelRenderer goku6;
    private final ModelRenderer goku7;
    private final ModelRenderer goku8;
    private final ModelRenderer goku9;
    private final ModelRenderer goku10;
    private final ModelRenderer goku11;
    private final ModelRenderer goku12;
    private final ModelRenderer goku13;
    private final ModelRenderer goku14;
    private final ModelRenderer goku15;
    private final ModelRenderer goku16;
    private final ModelRenderer gokuSsj;
    private final ModelRenderer gokuSsj1;
    private final ModelRenderer Hair1_r1;
    private final ModelRenderer Hair1_r2;
    private final ModelRenderer Hair1_r3;
    private final ModelRenderer gokuSsj2;
    private final ModelRenderer Hair2_r1;
    private final ModelRenderer Hair2_r2;
    private final ModelRenderer Hair2_r3;
    private final ModelRenderer gokuSsj3;
    private final ModelRenderer Hair3_r1;
    private final ModelRenderer Hair3_r2;
    private final ModelRenderer Hair3_r3;
    private final ModelRenderer gokuSsj4;
    private final ModelRenderer Hair4_r1;
    private final ModelRenderer Hair4_r2;
    private final ModelRenderer gokuSsj5;
    private final ModelRenderer Hair5_r3;
    private final ModelRenderer Hair5_r4;
    private final ModelRenderer gokuSsj6;
    private final ModelRenderer Hair6_r1;
    private final ModelRenderer Hair6_r2;
    private final ModelRenderer gokuSsj7;
    private final ModelRenderer Hair7_r1;
    private final ModelRenderer Hair7_r2;
    private final ModelRenderer gokuSsj8;
    private final ModelRenderer Hair8_r1;
    private final ModelRenderer Hair8_r2;
    private final ModelRenderer gokuSsj10;
    private final ModelRenderer Hair9_r1;
    private final ModelRenderer Hair9_r2;
    private final ModelRenderer gokuSsj9;
    private final ModelRenderer Hair10_r1;
    private final ModelRenderer Hair10_r2;
    private final ModelRenderer gokuSsj11;
    private final ModelRenderer Hair11_r1;
    private final ModelRenderer Hair11_r2;
    private final ModelRenderer gokuSsj12;
    private final ModelRenderer Hair12_r1;
    private final ModelRenderer Hair12_r2;
    private final ModelRenderer gokuSsj13;
    private final ModelRenderer Hair10_r3;
    private final ModelRenderer gokuSsj14;
    private final ModelRenderer Strand1_r1;
    private final ModelRenderer gokuSsj15;
    private final ModelRenderer Strand1_r2;
    private final ModelRenderer gokuSsj16;
    private final ModelRenderer gokuSsj17;
    private final ModelRenderer Strand4_r1;
    private final ModelRenderer Strand4_r2;
    private final ModelRenderer gokuSsj18;
    private final ModelRenderer Hair4_r3;
    private final ModelRenderer Hair4_r4;
    private final ModelRenderer gokuSsj19;
    private final ModelRenderer Hair6_r4;
    private final ModelRenderer Hair6_r5;
    private final ModelRenderer Hair6_r6;
    private final ModelRenderer gokuSsj20;
    private final ModelRenderer Hair8_r4;
    private final ModelRenderer Hair8_r5;
    private final ModelRenderer Hair8_r6;
    private final ModelRenderer gokuSsj21;
    private final ModelRenderer Hair9_r3;
    private final ModelRenderer Hair9_r4;
    private final ModelRenderer gokuSsj23;
    private final ModelRenderer Hair10_r4;
    private final ModelRenderer Hair10_r5;
    private final ModelRenderer gokuSsj22;
    private final ModelRenderer Hair11_r3;
    private final ModelRenderer Hair11_r4;
    private final ModelRenderer gokuSsj24;
    private final ModelRenderer Hair20_r1;
    private final ModelRenderer Hair20_r2;
    private final ModelRenderer gokuSsj25;
    private final ModelRenderer Hair20_r3;
    private final ModelRenderer Hair20_r4;
    private final ModelRenderer gokuSsj26;
    private final ModelRenderer Hair20_r5;
    private final ModelRenderer Hair20_r6;
    private final ModelRenderer gokuSsj27;
    private final ModelRenderer Hair20_r7;
    private final ModelRenderer Hair20_r8;
    private final ModelRenderer gokuSsj28;
    private final ModelRenderer Hair7_r4;
    private final ModelRenderer Hair7_r5;
    private final ModelRenderer gokuSsj29;
    private final ModelRenderer Hair7_r7;
    private final ModelRenderer Hair7_r8;
    private final ModelRenderer gokuSsj30;
    private final ModelRenderer Hair7_r9;
    private final ModelRenderer Hair7_r10;
    private final ModelRenderer gokuSsj31;
    private final ModelRenderer Hair7_r11;
    private final ModelRenderer Hair7_r12;
    private final ModelRenderer gokuSsj32;
    private final ModelRenderer Hair10_r9;
    private final ModelRenderer Hair10_r10;
    private final ModelRenderer gokuSsj33;
    private final ModelRenderer Hair10_r11;
    private final ModelRenderer Hair10_r12;
    private final ModelRenderer gokuSsj34;
    private final ModelRenderer Hair10_r13;
    private final ModelRenderer Hair10_r14;
    private final ModelRenderer gokuSsj35;
    private final ModelRenderer Hair10_r15;
    private final ModelRenderer gokuSsj36;
    private final ModelRenderer Hair10_r17;
    private final ModelRenderer gokuSsj37;
    private final ModelRenderer Hair10_r18;
    private final ModelRenderer Hair10_r19;
    private final ModelRenderer gokuSsj38;
    private final ModelRenderer Hair10_r20;
    private final ModelRenderer gokuSsj39;
    private final ModelRenderer Strand4_r3;
    private final ModelRenderer gokuSsjtwo;
    private final ModelRenderer gokuSsjtwo1;
    private final ModelRenderer Hair1_r4;
    private final ModelRenderer Hair1_r5;
    private final ModelRenderer Hair1_r6;
    private final ModelRenderer gokuSsjtwo2;
    private final ModelRenderer Hair2_r4;
    private final ModelRenderer Hair2_r5;
    private final ModelRenderer Hair2_r6;
    private final ModelRenderer gokuSsjtwo3;
    private final ModelRenderer Hair3_r4;
    private final ModelRenderer Hair3_r5;
    private final ModelRenderer Hair3_r6;
    private final ModelRenderer gokuSsjtwo4;
    private final ModelRenderer Hair4_r5;
    private final ModelRenderer Hair4_r6;
    private final ModelRenderer gokuSsjtwo5;
    private final ModelRenderer Hair5_r5;
    private final ModelRenderer Hair5_r6;
    private final ModelRenderer gokuSsjtwo6;
    private final ModelRenderer Hair6_r7;
    private final ModelRenderer Hair6_r8;
    private final ModelRenderer Hair6_r9;
    private final ModelRenderer gokuSsjtwo7;
    private final ModelRenderer Hair7_r13;
    private final ModelRenderer Hair7_r14;
    private final ModelRenderer gokuSsjtwo8;
    private final ModelRenderer Hair8_r7;
    private final ModelRenderer Hair8_r8;
    private final ModelRenderer Hair8_r9;
    private final ModelRenderer gokuSsjtwo9;
    private final ModelRenderer Hair9_r5;
    private final ModelRenderer Hair9_r6;
    private final ModelRenderer gokuSsjtwo10;
    private final ModelRenderer Hair10_r21;
    private final ModelRenderer Hair10_r22;
    private final ModelRenderer gokuSsjtwo11;
    private final ModelRenderer Hair11_r5;
    private final ModelRenderer Hair11_r6;
    private final ModelRenderer gokuSsjtwo12;
    private final ModelRenderer Hair12_r3;
    private final ModelRenderer Hair12_r4;
    private final ModelRenderer gokuSsjtwo13;
    private final ModelRenderer Hair10_r23;
    private final ModelRenderer gokuSsjtwo14;
    private final ModelRenderer Strand1_r3;
    private final ModelRenderer gokuSsjtwo15;
    private final ModelRenderer gokuSsjtwo16;
    private final ModelRenderer Strand4_r4;
    private final ModelRenderer Strand4_r5;
    private final ModelRenderer gokuSsjtwo17;
    private final ModelRenderer Hair4_r7;
    private final ModelRenderer Hair4_r8;
    private final ModelRenderer gokuSsjtwo18;
    private final ModelRenderer Hair6_r10;
    private final ModelRenderer Hair6_r11;
    private final ModelRenderer Hair6_r12;
    private final ModelRenderer gokuSsjtwo19;
    private final ModelRenderer Hair8_r10;
    private final ModelRenderer Hair8_r11;
    private final ModelRenderer Hair8_r12;
    private final ModelRenderer gokuSsjtwo20;
    private final ModelRenderer Hair9_r7;
    private final ModelRenderer Hair9_r8;
    private final ModelRenderer gokuSsjtwo21;
    private final ModelRenderer Hair10_r24;
    private final ModelRenderer Hair10_r25;
    private final ModelRenderer gokuSsjtwo22;
    private final ModelRenderer Hair11_r7;
    private final ModelRenderer Hair11_r8;
    private final ModelRenderer gokuSsjtwo23;
    private final ModelRenderer Hair20_r9;
    private final ModelRenderer Hair20_r10;
    private final ModelRenderer gokuSsjtwo24;
    private final ModelRenderer Hair20_r11;
    private final ModelRenderer gokuSsjtwo25;
    private final ModelRenderer Hair20_r13;
    private final ModelRenderer gokuSsjtwo26;
    private final ModelRenderer Hair20_r15;
    private final ModelRenderer Hair20_r16;
    private final ModelRenderer gokuSsjtwo27;
    private final ModelRenderer Hair7_r16;
    private final ModelRenderer Hair7_r17;
    private final ModelRenderer gokuSsjtwo28;
    private final ModelRenderer Hair7_r19;
    private final ModelRenderer gokuSsjtwo29;
    private final ModelRenderer Hair7_r21;
    private final ModelRenderer Hair7_r22;
    private final ModelRenderer gokuSsjtwo30;
    private final ModelRenderer Hair7_r23;
    private final ModelRenderer Hair7_r24;
    private final ModelRenderer gokuSsjtwo31;
    private final ModelRenderer Hair10_r26;
    private final ModelRenderer Hair10_r27;
    private final ModelRenderer gokuSsjtwo32;
    private final ModelRenderer Hair10_r28;
    private final ModelRenderer Hair10_r29;
    private final ModelRenderer gokuSsjtwo33;
    private final ModelRenderer Hair10_r30;
    private final ModelRenderer Hair10_r31;
    private final ModelRenderer gokuSsjtwo34;
    private final ModelRenderer Hair10_r32;
    private final ModelRenderer Hair10_r33;
    private final ModelRenderer gokuSsjtwo35;
    private final ModelRenderer Hair10_r34;
    private final ModelRenderer gokuSsjtwo36;
    private final ModelRenderer Hair10_r35;
    private final ModelRenderer Hair10_r36;
    private final ModelRenderer gokuSsjtwo37;
    private final ModelRenderer Hair10_r37;
    private final ModelRenderer gokuSsjtwo38;
    private final ModelRenderer Strand4_r6;
    private final ModelRenderer gokuSsjtwo39;
    private final ModelRenderer Strand1_r4;
    private final ModelRenderer gokuSsjThree;
    private final ModelRenderer gokuSsjThree1;
    private final ModelRenderer hair1_r7;
    private final ModelRenderer gokuSsjThree2;
    private final ModelRenderer gokuSsjThree3;
    private final ModelRenderer gokuSsjThree4;
    private final ModelRenderer gokuSsjThree5;
    private final ModelRenderer hair5_r1;
    private final ModelRenderer hair5_1;
    private final ModelRenderer hair5_5_r1;
    private final ModelRenderer hair5_4_r1;
    private final ModelRenderer hair5_3_r1;
    private final ModelRenderer hair5_2_r1;
    private final ModelRenderer hair5_1_r1;
    private final ModelRenderer gokuSsjThree6;
    private final ModelRenderer gokuSsjThree7;
    private final ModelRenderer gokuSsjThree8;
    private final ModelRenderer gokuSsjThree9;
    private final ModelRenderer gokuSsjThree10;
    private final ModelRenderer gokuSsjThree11;
    private final ModelRenderer gokuSsjThree12;
    private final ModelRenderer gokuSsjThree13;
    private final ModelRenderer gokuSsjThree14;
    private final ModelRenderer gokuSsjThree15;
    private final ModelRenderer gokuSsjThree16;
    private final ModelRenderer gokuSsjThree18;
    private final ModelRenderer gokuSsjThree17;
    private final ModelRenderer gokuSsjThree19;
    private final ModelRenderer hair19_3_r1;
    private final ModelRenderer hair19_2_r1;
    private final ModelRenderer gokuSsjThree20;
    private final ModelRenderer gokuSsjThree21;
    private final ModelRenderer gokuSsjThree22;
    private final ModelRenderer gokuSsjThree23;
    private final ModelRenderer gokuSsjThree24;
    private final ModelRenderer gokuSsjThree25;
    private final ModelRenderer gokuSsjThree26;
    private final ModelRenderer gokuSsjThree28;
    private final ModelRenderer gokuSsjThree27;
    private final ModelRenderer gokuSsjThree29;
    private final ModelRenderer gokuSsjThree30;
    private final ModelRenderer gokuSsjThree31;
    private final ModelRenderer gokuSsjThree32;
    private final ModelRenderer gokuSsjThree33;
    private final ModelRenderer hair34_2_r1;
    private final ModelRenderer hair34_r1;
    private final ModelRenderer gokuSsjThree34;
    private final ModelRenderer hair33_2_r1;
    private final ModelRenderer gokuSsjThree35;
    private final ModelRenderer gokuSsjThree36;
    private final ModelRenderer gokuSsjThree37;
    private final ModelRenderer gokuSsjThree38;
    private final ModelRenderer gokuSsjThree39;
    private final ModelRenderer gokuSsjThree40;
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

    public ModelGeneral1(float _scale) {
        textureWidth = 128;
        textureHeight = 64;

        scale = _scale;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        vegeta = new ModelRenderer(this);
        vegeta.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(vegeta);


        vegeta1 = new ModelRenderer(this);
        vegeta1.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta1);
        setRotationAngle(vegeta1, -0.3142F, 0.0F, 0.0F);
        vegeta1.cubeList.add(new ModelBox(vegeta1, 32, 0, -1.0F, -10.0F, -6.05F, 4, 4, 4, 0.0F));

        vegeta2 = new ModelRenderer(this);
        vegeta2.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta2);
        setRotationAngle(vegeta2, 0.0F, 0.1745F, 0.576F);
        vegeta2.cubeList.add(new ModelBox(vegeta2, 32, 2, -8.0F, -4.5F, -1.0F, 4, 3, 3, 0.0F));

        vegeta3 = new ModelRenderer(this);
        vegeta3.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta3);
        setRotationAngle(vegeta3, 0.0F, 0.2618F, 0.5061F);
        vegeta3.cubeList.add(new ModelBox(vegeta3, 32, 0, -7.0F, -2.0F, 0.0F, 4, 2, 2, 0.0F));

        vegeta4 = new ModelRenderer(this);
        vegeta4.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta4);
        setRotationAngle(vegeta4, 0.0F, -0.1745F, -0.6109F);
        vegeta4.cubeList.add(new ModelBox(vegeta4, 32, 2, 4.0F, -4.0F, -1.0F, 4, 3, 3, 0.0F));

        vegeta5 = new ModelRenderer(this);
        vegeta5.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta5);
        setRotationAngle(vegeta5, 0.0F, -0.1745F, -0.5061F);
        vegeta5.cubeList.add(new ModelBox(vegeta5, 32, 0, 3.0F, -2.0F, 0.7F, 4, 2, 2, 0.0F));

        vegeta6 = new ModelRenderer(this);
        vegeta6.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta6);
        setRotationAngle(vegeta6, 0.0F, -0.3491F, -0.925F);
        vegeta6.cubeList.add(new ModelBox(vegeta6, 48, 0, 7.0F, -2.0F, -1.5F, 3, 2, 2, 0.0F));

        vegeta7 = new ModelRenderer(this);
        vegeta7.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta7);
        setRotationAngle(vegeta7, -0.4363F, 0.0F, 0.0F);
        vegeta7.cubeList.add(new ModelBox(vegeta7, 32, 10, -0.5F, -12.0F, -6.0F, 3, 3, 3, 0.0F));

        vegeta8 = new ModelRenderer(this);
        vegeta8.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta8);
        setRotationAngle(vegeta8, -0.5934F, 0.0F, 0.0F);
        vegeta8.cubeList.add(new ModelBox(vegeta8, 43, 11, 0.0F, -14.0F, -7.0F, 2, 3, 2, 0.0F));

        vegeta9 = new ModelRenderer(this);
        vegeta9.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta9);
        setRotationAngle(vegeta9, 0.0F, 0.3491F, 0.8901F);
        vegeta9.cubeList.add(new ModelBox(vegeta9, 48, 0, -10.0F, -2.1667F, -1.5F, 3, 2, 2, 0.0F));

        vegeta10 = new ModelRenderer(this);
        vegeta10.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta10);
        setRotationAngle(vegeta10, -0.4363F, 0.0F, -0.4014F);
        vegeta10.cubeList.add(new ModelBox(vegeta10, 48, 6, -1.0F, -10.0F, -6.2F, 4, 6, 4, 0.0F));

        vegeta11 = new ModelRenderer(this);
        vegeta11.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta11);
        setRotationAngle(vegeta11, -0.5411F, 0.0F, -0.3665F);
        vegeta11.cubeList.add(new ModelBox(vegeta11, 48, 0, -0.5F, -12.0F, -6.0F, 5, 4, 3, 0.0F));

        vegeta12 = new ModelRenderer(this);
        vegeta12.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta12);
        setRotationAngle(vegeta12, -0.6109F, 0.0F, -0.2443F);
        vegeta12.cubeList.add(new ModelBox(vegeta12, 40, 10, -0.5F, -14.0F, -6.0F, 3, 3, 3, 0.0F));

        vegeta13 = new ModelRenderer(this);
        vegeta13.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta13);
        setRotationAngle(vegeta13, -0.6981F, 0.0F, -0.1222F);
        vegeta13.cubeList.add(new ModelBox(vegeta13, 43, 9, 0.0F, -15.4F, -7.0F, 2, 5, 2, 0.0F));

        vegeta14 = new ModelRenderer(this);
        vegeta14.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta14);
        setRotationAngle(vegeta14, -0.3665F, 0.0F, 0.4363F);
        vegeta14.cubeList.add(new ModelBox(vegeta14, 32, 2, -1.5F, -9.0F, -5.5F, 3, 5, 3, 0.0F));

        vegeta15 = new ModelRenderer(this);
        vegeta15.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta15);
        setRotationAngle(vegeta15, -0.5411F, 0.0F, 0.2455F);
        vegeta15.cubeList.add(new ModelBox(vegeta15, 32, 7, -0.5F, -10.0F, -6.0F, 3, 3, 3, 0.0F));

        vegeta16 = new ModelRenderer(this);
        vegeta16.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta16);
        setRotationAngle(vegeta16, -0.576F, 0.0F, 0.1396F);
        vegeta16.cubeList.add(new ModelBox(vegeta16, 48, 0, -1.0F, -12.0F, -6.0F, 3, 3, 3, 0.0F));

        vegeta17 = new ModelRenderer(this);
        vegeta17.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta17);
        setRotationAngle(vegeta17, -0.2793F, 0.0F, 0.0F);
        vegeta17.cubeList.add(new ModelBox(vegeta17, 39, 7, -2.0F, -9.0F, -1.0F, 4, 5, 4, 0.0F));

        vegeta18 = new ModelRenderer(this);
        vegeta18.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta18);
        setRotationAngle(vegeta18, -0.2443F, 0.2618F, 0.0175F);
        vegeta18.cubeList.add(new ModelBox(vegeta18, 48, 0, -1.0F, -10.0F, -1.0F, 4, 5, 4, 0.0F));

        vegeta19 = new ModelRenderer(this);
        vegeta19.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta19);
        setRotationAngle(vegeta19, -0.2443F, -0.2618F, 0.0175F);
        vegeta19.cubeList.add(new ModelBox(vegeta19, 48, 0, -4.0F, -11.0F, -1.0F, 4, 6, 4, 0.0F));

        vegeta20 = new ModelRenderer(this);
        vegeta20.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta20);
        setRotationAngle(vegeta20, -0.1396F, 0.0F, 0.0F);
        vegeta20.cubeList.add(new ModelBox(vegeta20, 45, 1, -2.0F, -13.0F, -1.0F, 3, 5, 4, 0.0F));

        vegeta21 = new ModelRenderer(this);
        vegeta21.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta21);
        setRotationAngle(vegeta21, -0.1222F, 0.1745F, 0.0F);
        vegeta21.cubeList.add(new ModelBox(vegeta21, 46, 2, -1.0F, -14.0F, 0.0F, 3, 5, 3, 0.0F));

        vegeta22 = new ModelRenderer(this);
        vegeta22.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegeta.addChild(vegeta22);
        setRotationAngle(vegeta22, -0.2443F, -0.2618F, 0.0175F);
        vegeta22.cubeList.add(new ModelBox(vegeta22, 48, 0, -2.8667F, -13.2F, -0.6667F, 3, 4, 3, 0.0F));

        vegetaSsjThree = new ModelRenderer(this);
        vegetaSsjThree.setRotationPoint(0.0F, 1.1F, -0.15F);
        bipedHead.addChild(vegetaSsjThree);
        setRotationAngle(vegetaSsjThree, 0.1309F, 0.0F, 0.0F);


        vegetaSsjThree1 = new ModelRenderer(this);
        vegetaSsjThree1.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree.addChild(vegetaSsjThree1);
        setRotationAngle(vegetaSsjThree1, -0.2618F, 0.0F, 0.0F);


        vegetaSsjThree2 = new ModelRenderer(this);
        vegetaSsjThree2.setRotationPoint(-1.25F, -9.25F, 0.0F);
        vegetaSsjThree1.addChild(vegetaSsjThree2);


        vegetaSsjThree3 = new ModelRenderer(this);
        vegetaSsjThree3.setRotationPoint(0.4747F, 1.6924F, -1.7478F);
        vegetaSsjThree2.addChild(vegetaSsjThree3);
        setRotationAngle(vegetaSsjThree3, -0.1969F, 0.0F, 0.0F);
        vegetaSsjThree3.cubeList.add(new ModelBox(vegetaSsjThree3, 58, 18, -1.2642F, -9.5142F, -3.0819F, 4, 10, 4, -0.1F));

        vegetaSsjThree4 = new ModelRenderer(this);
        vegetaSsjThree4.setRotationPoint(0.0F, -1.875F, 5.3125F);
        vegetaSsjThree2.addChild(vegetaSsjThree4);
        setRotationAngle(vegetaSsjThree4, -0.3479F, 0.0298F, 0.1519F);
        vegetaSsjThree4.cubeList.add(new ModelBox(vegetaSsjThree4, 62, 17, 1.7624F, -5.8021F, -8.2477F, 3, 12, 3, -0.1F));

        vegetaSsjThree5 = new ModelRenderer(this);
        vegetaSsjThree5.setRotationPoint(2.5F, -1.875F, 5.3125F);
        vegetaSsjThree2.addChild(vegetaSsjThree5);
        setRotationAngle(vegetaSsjThree5, -0.3479F, -0.0298F, -0.1519F);
        vegetaSsjThree5.cubeList.add(new ModelBox(vegetaSsjThree5, 62, 17, -4.7624F, -5.8021F, -8.2477F, 3, 12, 3, -0.1F));

        vegetaSsjThree6 = new ModelRenderer(this);
        vegetaSsjThree6.setRotationPoint(-0.625F, -7.5F, 1.625F);
        vegetaSsjThree1.addChild(vegetaSsjThree6);
        setRotationAngle(vegetaSsjThree6, -0.1745F, 0.0F, 0.3491F);


        vegetaSsjThree7 = new ModelRenderer(this);
        vegetaSsjThree7.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree6.addChild(vegetaSsjThree7);
        setRotationAngle(vegetaSsjThree7, 2.4826F, 0.1957F, 0.2441F);


        vegetaSsjThree8 = new ModelRenderer(this);
        vegetaSsjThree8.setRotationPoint(-1.625F, 37.75F, -1.125F);
        vegetaSsjThree7.addChild(vegetaSsjThree8);
        setRotationAngle(vegetaSsjThree8, 0.028F, -0.0466F, 0.0676F);
        vegetaSsjThree8.cubeList.add(new ModelBox(vegetaSsjThree8, 62, 18, 1.4607F, -37.7225F, -2.6172F, 3, 3, 3, -0.1F));

        vegetaSsjThree9 = new ModelRenderer(this);
        vegetaSsjThree9.setRotationPoint(4.625F, -3.5F, 0.875F);
        vegetaSsjThree6.addChild(vegetaSsjThree9);
        setRotationAngle(vegetaSsjThree9, 2.6616F, 0.0873F, 0.349F);
        vegetaSsjThree9.cubeList.add(new ModelBox(vegetaSsjThree9, 61, 20, 0.1215F, -6.2137F, -1.5235F, 3, 7, 3, -0.1F));

        vegetaSsjThree10 = new ModelRenderer(this);
        vegetaSsjThree10.setRotationPoint(4.625F, -3.5F, 1.5F);
        vegetaSsjThree6.addChild(vegetaSsjThree10);
        setRotationAngle(vegetaSsjThree10, 2.5808F, 0.111F, 0.5896F);
        vegetaSsjThree10.cubeList.add(new ModelBox(vegetaSsjThree10, 62, 19, 0.7465F, -5.4638F, -4.0235F, 3, 6, 3, -0.1F));

        vegetaSsjThree11 = new ModelRenderer(this);
        vegetaSsjThree11.setRotationPoint(6.625F, -1.5F, -4.125F);
        vegetaSsjThree6.addChild(vegetaSsjThree11);
        setRotationAngle(vegetaSsjThree11, 2.6471F, -0.0378F, 0.5289F);
        vegetaSsjThree11.cubeList.add(new ModelBox(vegetaSsjThree11, 60, 19, -2.9965F, -2.9637F, -2.7735F, 3, 7, 3, -0.1F));

        vegetaSsjThree12 = new ModelRenderer(this);
        vegetaSsjThree12.setRotationPoint(2.125F, -3.5F, -1.625F);
        vegetaSsjThree6.addChild(vegetaSsjThree12);
        setRotationAngle(vegetaSsjThree12, -0.1571F, 0.0F, 0.3665F);
        vegetaSsjThree12.cubeList.add(new ModelBox(vegetaSsjThree12, 60, 19, 0.8254F, -3.9275F, -3.75F, 3, 7, 3, -0.1F));

        vegetaSsjThree13 = new ModelRenderer(this);
        vegetaSsjThree13.setRotationPoint(-1.875F, -8.5F, 1.625F);
        vegetaSsjThree1.addChild(vegetaSsjThree13);
        setRotationAngle(vegetaSsjThree13, 0.0F, 0.0F, -0.0873F);


        vegetaSsjThree14 = new ModelRenderer(this);
        vegetaSsjThree14.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree13.addChild(vegetaSsjThree14);
        setRotationAngle(vegetaSsjThree14, 2.4826F, 0.1957F, 0.2441F);


        vegetaSsjThree15 = new ModelRenderer(this);
        vegetaSsjThree15.setRotationPoint(-1.625F, 37.75F, -1.125F);
        vegetaSsjThree14.addChild(vegetaSsjThree15);
        setRotationAngle(vegetaSsjThree15, 0.028F, -0.0466F, 0.0676F);
        vegetaSsjThree15.cubeList.add(new ModelBox(vegetaSsjThree15, 60, 18, 1.3582F, -39.4122F, -2.9956F, 3, 9, 3, -0.1F));

        vegetaSsjThree16 = new ModelRenderer(this);
        vegetaSsjThree16.setRotationPoint(4.625F, -3.5F, 0.875F);
        vegetaSsjThree13.addChild(vegetaSsjThree16);
        setRotationAngle(vegetaSsjThree16, 2.6616F, 0.0873F, 0.349F);
        vegetaSsjThree16.cubeList.add(new ModelBox(vegetaSsjThree16, 61, 20, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, -0.1F));

        vegetaSsjThree17 = new ModelRenderer(this);
        vegetaSsjThree17.setRotationPoint(4.625F, -3.5F, 1.5F);
        vegetaSsjThree13.addChild(vegetaSsjThree17);
        setRotationAngle(vegetaSsjThree17, 2.5808F, 0.111F, 0.5896F);
        vegetaSsjThree17.cubeList.add(new ModelBox(vegetaSsjThree17, 62, 18, 0.7465F, -5.4638F, -4.0235F, 3, 11, 3, -0.1F));

        vegetaSsjThree18 = new ModelRenderer(this);
        vegetaSsjThree18.setRotationPoint(6.625F, -1.5F, -4.125F);
        vegetaSsjThree13.addChild(vegetaSsjThree18);
        setRotationAngle(vegetaSsjThree18, 2.6471F, -0.0378F, 0.5289F);
        vegetaSsjThree18.cubeList.add(new ModelBox(vegetaSsjThree18, 60, 19, -2.9965F, -2.9637F, -2.7735F, 3, 9, 3, -0.1F));

        vegetaSsjThree19 = new ModelRenderer(this);
        vegetaSsjThree19.setRotationPoint(2.125F, -1.5F, -2.625F);
        vegetaSsjThree13.addChild(vegetaSsjThree19);
        setRotationAngle(vegetaSsjThree19, -0.1571F, 0.0F, 0.3665F);
        vegetaSsjThree19.cubeList.add(new ModelBox(vegetaSsjThree19, 60, 19, 0.8039F, -6.086F, -3.2272F, 3, 9, 3, -0.1F));

        vegetaSsjThree20 = new ModelRenderer(this);
        vegetaSsjThree20.setRotationPoint(1.875F, -8.5F, 1.625F);
        vegetaSsjThree1.addChild(vegetaSsjThree20);
        setRotationAngle(vegetaSsjThree20, 0.0F, 0.0F, 0.0873F);


        vegetaSsjThree21 = new ModelRenderer(this);
        vegetaSsjThree21.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree20.addChild(vegetaSsjThree21);
        setRotationAngle(vegetaSsjThree21, 2.4826F, -0.1957F, -0.2441F);


        vegetaSsjThree22 = new ModelRenderer(this);
        vegetaSsjThree22.setRotationPoint(1.625F, 37.75F, -1.125F);
        vegetaSsjThree21.addChild(vegetaSsjThree22);
        setRotationAngle(vegetaSsjThree22, 0.028F, 0.0466F, -0.0676F);
        vegetaSsjThree22.cubeList.add(new ModelBox(vegetaSsjThree22, 60, 18, -4.3582F, -39.4122F, -2.9956F, 3, 9, 3, -0.1F));

        vegetaSsjThree23 = new ModelRenderer(this);
        vegetaSsjThree23.setRotationPoint(-4.625F, -3.5F, 0.875F);
        vegetaSsjThree20.addChild(vegetaSsjThree23);
        setRotationAngle(vegetaSsjThree23, 2.6616F, -0.0873F, -0.349F);
        vegetaSsjThree23.cubeList.add(new ModelBox(vegetaSsjThree23, 61, 20, -3.1215F, -4.2137F, -1.5235F, 3, 8, 3, -0.1F));

        vegetaSsjThree24 = new ModelRenderer(this);
        vegetaSsjThree24.setRotationPoint(-4.625F, -3.5F, 1.5F);
        vegetaSsjThree20.addChild(vegetaSsjThree24);
        setRotationAngle(vegetaSsjThree24, 2.5808F, -0.111F, -0.5896F);
        vegetaSsjThree24.cubeList.add(new ModelBox(vegetaSsjThree24, 62, 18, -3.7465F, -5.4638F, -4.0235F, 3, 11, 3, -0.1F));

        vegetaSsjThree25 = new ModelRenderer(this);
        vegetaSsjThree25.setRotationPoint(-6.625F, -1.5F, -4.125F);
        vegetaSsjThree20.addChild(vegetaSsjThree25);
        setRotationAngle(vegetaSsjThree25, 2.6471F, 0.0378F, -0.5289F);
        vegetaSsjThree25.cubeList.add(new ModelBox(vegetaSsjThree25, 60, 19, -0.0035F, -2.9637F, -2.7735F, 3, 9, 3, -0.1F));

        vegetaSsjThree26 = new ModelRenderer(this);
        vegetaSsjThree26.setRotationPoint(-2.125F, -1.5F, -2.625F);
        vegetaSsjThree20.addChild(vegetaSsjThree26);
        setRotationAngle(vegetaSsjThree26, -0.1571F, 0.0F, -0.3665F);
        vegetaSsjThree26.cubeList.add(new ModelBox(vegetaSsjThree26, 60, 19, -3.8039F, -6.086F, -3.2272F, 3, 9, 3, -0.1F));

        vegetaSsjThree27 = new ModelRenderer(this);
        vegetaSsjThree27.setRotationPoint(0.625F, -7.5F, 1.625F);
        vegetaSsjThree1.addChild(vegetaSsjThree27);
        setRotationAngle(vegetaSsjThree27, -0.1745F, 0.0F, -0.3491F);


        vegetaSsjThree28 = new ModelRenderer(this);
        vegetaSsjThree28.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree27.addChild(vegetaSsjThree28);
        setRotationAngle(vegetaSsjThree28, 2.4826F, -0.1957F, -0.2441F);


        vegetaSsjThree29 = new ModelRenderer(this);
        vegetaSsjThree29.setRotationPoint(1.625F, 37.75F, -1.125F);
        vegetaSsjThree28.addChild(vegetaSsjThree29);
        setRotationAngle(vegetaSsjThree29, 0.028F, 0.0466F, -0.0676F);
        vegetaSsjThree29.cubeList.add(new ModelBox(vegetaSsjThree29, 62, 18, -4.4607F, -37.7225F, -2.6172F, 3, 3, 3, -0.1F));

        vegetaSsjThree30 = new ModelRenderer(this);
        vegetaSsjThree30.setRotationPoint(-4.625F, -3.5F, 0.875F);
        vegetaSsjThree27.addChild(vegetaSsjThree30);
        setRotationAngle(vegetaSsjThree30, 2.6616F, -0.0873F, -0.349F);
        vegetaSsjThree30.cubeList.add(new ModelBox(vegetaSsjThree30, 61, 20, -3.1215F, -6.2137F, -1.5235F, 3, 7, 3, -0.1F));

        vegetaSsjThree31 = new ModelRenderer(this);
        vegetaSsjThree31.setRotationPoint(-4.625F, -3.5F, 1.5F);
        vegetaSsjThree27.addChild(vegetaSsjThree31);
        setRotationAngle(vegetaSsjThree31, 2.5808F, -0.111F, -0.5896F);
        vegetaSsjThree31.cubeList.add(new ModelBox(vegetaSsjThree31, 62, 19, -3.7465F, -5.4638F, -4.0235F, 3, 6, 3, -0.1F));

        vegetaSsjThree32 = new ModelRenderer(this);
        vegetaSsjThree32.setRotationPoint(-6.625F, -1.5F, -4.125F);
        vegetaSsjThree27.addChild(vegetaSsjThree32);
        setRotationAngle(vegetaSsjThree32, 2.6471F, 0.0378F, -0.5289F);
        vegetaSsjThree32.cubeList.add(new ModelBox(vegetaSsjThree32, 60, 19, -0.0035F, -2.9637F, -2.7735F, 3, 7, 3, -0.1F));

        vegetaSsjThree33 = new ModelRenderer(this);
        vegetaSsjThree33.setRotationPoint(-2.125F, -3.5F, -1.625F);
        vegetaSsjThree27.addChild(vegetaSsjThree33);
        setRotationAngle(vegetaSsjThree33, -0.1571F, 0.0F, -0.3665F);
        vegetaSsjThree33.cubeList.add(new ModelBox(vegetaSsjThree33, 60, 19, -3.8254F, -3.9275F, -3.75F, 3, 7, 3, -0.1F));

        vegetaSsjThree34 = new ModelRenderer(this);
        vegetaSsjThree34.setRotationPoint(0.0F, -3.0F, 1.0F);
        vegetaSsjThree.addChild(vegetaSsjThree34);
        setRotationAngle(vegetaSsjThree34, -0.7418F, 0.0F, 0.0F);


        vegetaSsjThree35 = new ModelRenderer(this);
        vegetaSsjThree35.setRotationPoint(-1.25F, -9.25F, 0.0F);
        vegetaSsjThree34.addChild(vegetaSsjThree35);


        vegetaSsjThree36 = new ModelRenderer(this);
        vegetaSsjThree36.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree35.addChild(vegetaSsjThree36);
        setRotationAngle(vegetaSsjThree36, -0.2356F, 0.0023F, -0.1572F);


        vegetaSsjThree37 = new ModelRenderer(this);
        vegetaSsjThree37.setRotationPoint(-3.75F, 41.25F, 3.5F);
        vegetaSsjThree36.addChild(vegetaSsjThree37);
        setRotationAngle(vegetaSsjThree37, 0.1304F, -0.0114F, 0.1302F);
        vegetaSsjThree37.cubeList.add(new ModelBox(vegetaSsjThree37, 59, 16, -2.1477F, -49.3863F, -2.9175F, 4, 12, 4, -0.1F));

        vegetaSsjThree38 = new ModelRenderer(this);
        vegetaSsjThree38.setRotationPoint(-0.875F, -7.5F, 1.625F);
        vegetaSsjThree34.addChild(vegetaSsjThree38);
        setRotationAngle(vegetaSsjThree38, 0.0F, 0.0F, 0.3927F);


        vegetaSsjThree39 = new ModelRenderer(this);
        vegetaSsjThree39.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree38.addChild(vegetaSsjThree39);
        setRotationAngle(vegetaSsjThree39, 2.4826F, 0.1957F, 0.2441F);


        vegetaSsjThree40 = new ModelRenderer(this);
        vegetaSsjThree40.setRotationPoint(-1.625F, 37.75F, -1.125F);
        vegetaSsjThree39.addChild(vegetaSsjThree40);
        setRotationAngle(vegetaSsjThree40, 0.028F, -0.0466F, 0.0676F);
        vegetaSsjThree40.cubeList.add(new ModelBox(vegetaSsjThree40, 60, 18, 1.4607F, -40.7225F, -2.6172F, 3, 9, 3, -0.1F));

        vegetaSsjThree41 = new ModelRenderer(this);
        vegetaSsjThree41.setRotationPoint(4.625F, -3.5F, 0.875F);
        vegetaSsjThree38.addChild(vegetaSsjThree41);
        setRotationAngle(vegetaSsjThree41, 2.6616F, 0.0873F, 0.349F);
        vegetaSsjThree41.cubeList.add(new ModelBox(vegetaSsjThree41, 62, 18, 0.1215F, -7.2137F, -1.5235F, 3, 11, 3, -0.1F));

        vegetaSsjThree42 = new ModelRenderer(this);
        vegetaSsjThree42.setRotationPoint(4.625F, -3.5F, 1.5F);
        vegetaSsjThree38.addChild(vegetaSsjThree42);
        setRotationAngle(vegetaSsjThree42, 2.5808F, 0.111F, 0.5896F);
        vegetaSsjThree42.cubeList.add(new ModelBox(vegetaSsjThree42, 62, 19, 0.7465F, -6.4638F, -4.0235F, 3, 10, 3, -0.1F));

        vegetaSsjThree43 = new ModelRenderer(this);
        vegetaSsjThree43.setRotationPoint(-1.875F, -8.5F, 1.625F);
        vegetaSsjThree34.addChild(vegetaSsjThree43);
        setRotationAngle(vegetaSsjThree43, 0.0F, 0.0F, -0.0873F);


        vegetaSsjThree44 = new ModelRenderer(this);
        vegetaSsjThree44.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree43.addChild(vegetaSsjThree44);
        setRotationAngle(vegetaSsjThree44, 2.4826F, 0.1957F, 0.2441F);


        Hair10_r6 = new ModelRenderer(this);
        Hair10_r6.setRotationPoint(-1.625F, 37.75F, -1.125F);
        vegetaSsjThree44.addChild(Hair10_r6);
        setRotationAngle(Hair10_r6, 0.028F, -0.0466F, 0.0676F);
        Hair10_r6.cubeList.add(new ModelBox(Hair10_r6, 61, 16, 1.3582F, -40.4122F, -2.9956F, 3, 13, 3, -0.1F));

        vegetaSsjThree45 = new ModelRenderer(this);
        vegetaSsjThree45.setRotationPoint(4.625F, -3.5F, 0.875F);
        vegetaSsjThree43.addChild(vegetaSsjThree45);
        setRotationAngle(vegetaSsjThree45, 2.6616F, 0.0873F, 0.349F);
        vegetaSsjThree45.cubeList.add(new ModelBox(vegetaSsjThree45, 61, 16, 0.1215F, -5.2137F, -1.5235F, 3, 12, 3, -0.1F));

        vegetaSsjThree46 = new ModelRenderer(this);
        vegetaSsjThree46.setRotationPoint(4.625F, -3.5F, 1.5F);
        vegetaSsjThree43.addChild(vegetaSsjThree46);
        setRotationAngle(vegetaSsjThree46, 2.5808F, 0.111F, 0.5896F);
        vegetaSsjThree46.cubeList.add(new ModelBox(vegetaSsjThree46, 63, 17, 0.7465F, -6.4638F, -4.0235F, 3, 12, 3, -0.1F));

        vegetaSsjThree47 = new ModelRenderer(this);
        vegetaSsjThree47.setRotationPoint(2.125F, -1.5F, -2.625F);
        vegetaSsjThree43.addChild(vegetaSsjThree47);
        setRotationAngle(vegetaSsjThree47, -0.1571F, 0.0F, 0.3665F);
        vegetaSsjThree47.cubeList.add(new ModelBox(vegetaSsjThree47, 59, 16, 0.8039F, -7.086F, -3.2272F, 3, 13, 3, -0.1F));

        vegetaSsjThree48 = new ModelRenderer(this);
        vegetaSsjThree48.setRotationPoint(1.875F, -8.5F, 1.625F);
        vegetaSsjThree34.addChild(vegetaSsjThree48);
        setRotationAngle(vegetaSsjThree48, 0.0F, 0.0F, 0.0873F);


        vegetaSsjThree49 = new ModelRenderer(this);
        vegetaSsjThree49.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree48.addChild(vegetaSsjThree49);
        setRotationAngle(vegetaSsjThree49, 2.4826F, -0.1957F, -0.2441F);


        Hair10_r7 = new ModelRenderer(this);
        Hair10_r7.setRotationPoint(1.625F, 37.75F, -1.125F);
        vegetaSsjThree49.addChild(Hair10_r7);
        setRotationAngle(Hair10_r7, 0.028F, 0.0466F, -0.0676F);
        Hair10_r7.cubeList.add(new ModelBox(Hair10_r7, 66, 16, -4.3582F, -40.4122F, -2.9956F, 3, 13, 3, -0.1F));

        vegetaSsjThree50 = new ModelRenderer(this);
        vegetaSsjThree50.setRotationPoint(-4.625F, -3.5F, 0.875F);
        vegetaSsjThree48.addChild(vegetaSsjThree50);
        setRotationAngle(vegetaSsjThree50, 2.6616F, -0.0873F, -0.349F);
        vegetaSsjThree50.cubeList.add(new ModelBox(vegetaSsjThree50, 62, 17, -3.1215F, -5.2137F, -1.5235F, 3, 12, 3, -0.1F));

        vegetaSsjThree51 = new ModelRenderer(this);
        vegetaSsjThree51.setRotationPoint(-4.625F, -3.5F, 1.5F);
        vegetaSsjThree48.addChild(vegetaSsjThree51);
        setRotationAngle(vegetaSsjThree51, 2.5808F, -0.111F, -0.5896F);
        vegetaSsjThree51.cubeList.add(new ModelBox(vegetaSsjThree51, 63, 17, -3.7465F, -6.4638F, -4.0235F, 3, 12, 3, -0.1F));

        vegetaSsjThree52 = new ModelRenderer(this);
        vegetaSsjThree52.setRotationPoint(-2.125F, -1.5F, -2.625F);
        vegetaSsjThree48.addChild(vegetaSsjThree52);
        setRotationAngle(vegetaSsjThree52, -0.1571F, 0.0F, -0.3665F);
        vegetaSsjThree52.cubeList.add(new ModelBox(vegetaSsjThree52, 67, 16, -3.8039F, -7.086F, -3.2272F, 3, 13, 3, -0.1F));

        vegetaSsjThree53 = new ModelRenderer(this);
        vegetaSsjThree53.setRotationPoint(0.875F, -7.5F, 1.625F);
        vegetaSsjThree34.addChild(vegetaSsjThree53);
        setRotationAngle(vegetaSsjThree53, 0.0F, 0.0F, -0.3927F);


        vegetaSsjThree54 = new ModelRenderer(this);
        vegetaSsjThree54.setRotationPoint(0.0F, 0.0F, 0.0F);
        vegetaSsjThree53.addChild(vegetaSsjThree54);
        setRotationAngle(vegetaSsjThree54, 2.4826F, -0.1957F, -0.2441F);


        Hair10_r8 = new ModelRenderer(this);
        Hair10_r8.setRotationPoint(1.625F, 37.75F, -1.125F);
        vegetaSsjThree54.addChild(Hair10_r8);
        setRotationAngle(Hair10_r8, 0.028F, 0.0466F, -0.0676F);
        Hair10_r8.cubeList.add(new ModelBox(Hair10_r8, 76, 16, -4.4607F, -40.7225F, -2.6172F, 3, 9, 3, -0.1F));

        vegetaSsjThree55 = new ModelRenderer(this);
        vegetaSsjThree55.setRotationPoint(-4.625F, -3.5F, 0.875F);
        vegetaSsjThree53.addChild(vegetaSsjThree55);
        setRotationAngle(vegetaSsjThree55, 2.6616F, -0.0873F, -0.349F);
        vegetaSsjThree55.cubeList.add(new ModelBox(vegetaSsjThree55, 67, 17, -3.1215F, -7.2137F, -1.5235F, 3, 11, 3, -0.1F));

        vegetaSsjThree56 = new ModelRenderer(this);
        vegetaSsjThree56.setRotationPoint(-4.625F, -3.5F, 1.5F);
        vegetaSsjThree53.addChild(vegetaSsjThree56);
        setRotationAngle(vegetaSsjThree56, 2.5808F, -0.111F, -0.5896F);
        vegetaSsjThree56.cubeList.add(new ModelBox(vegetaSsjThree56, 76, 17, -3.7465F, -6.4638F, -4.0235F, 3, 10, 3, -0.1F));

        vegetaSsjThree57 = new ModelRenderer(this);
        vegetaSsjThree57.setRotationPoint(-1.25F, -7.25F, 5.75F);
        vegetaSsjThree34.addChild(vegetaSsjThree57);
        setRotationAngle(vegetaSsjThree57, -0.7115F, 0.0696F, -0.0448F);
        vegetaSsjThree57.cubeList.add(new ModelBox(vegetaSsjThree57, 69, 16, -1.1416F, -7.0925F, -3.4643F, 5, 11, 5, -0.1F));

        vegetaSsjThree58 = new ModelRenderer(this);
        vegetaSsjThree58.setRotationPoint(-1.25F, -11.25F, 3.75F);
        vegetaSsjThree34.addChild(vegetaSsjThree58);
        setRotationAngle(vegetaSsjThree58, -0.0134F, -0.0177F, -0.0436F);
        vegetaSsjThree58.cubeList.add(new ModelBox(vegetaSsjThree58, 65, 16, -1.6416F, -8.6925F, -4.9642F, 6, 12, 4, -0.15F));

        vegetaSsjThree59 = new ModelRenderer(this);
        vegetaSsjThree59.setRotationPoint(1.3584F, 0.4075F, -2.9642F);
        vegetaSsjThree58.addChild(vegetaSsjThree59);
        setRotationAngle(vegetaSsjThree59, -0.6981F, 0.0F, 0.0F);
        vegetaSsjThree59.cubeList.add(new ModelBox(vegetaSsjThree59, 69, 16, -3.0F, -8.5F, -2.0F, 6, 12, 4, -0.1F));

        goku = new ModelRenderer(this);
        goku.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(goku);


        goku1 = new ModelRenderer(this);
        goku1.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku1);
        setRotationAngle(goku1, 0.1745F, 0.0F, -0.4363F);
        goku1.cubeList.add(new ModelBox(goku1, 0, 49, -1.0F, -10.0F, 0.0F, 4, 4, 4, 0.0F));

        goku2 = new ModelRenderer(this);
        goku2.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku2);
        setRotationAngle(goku2, 0.0F, -0.1745F, 0.3491F);
        goku2.cubeList.add(new ModelBox(goku2, 0, 58, -8.0F, -4.5F, 0.0F, 4, 3, 3, 0.0F));

        goku3 = new ModelRenderer(this);
        goku3.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku3);
        setRotationAngle(goku3, 0.0F, -0.2618F, 0.1943F);
        goku3.cubeList.add(new ModelBox(goku3, 3, 54, -7.0F, -2.6F, 1.0F, 4, 2, 2, 0.0F));

        goku4 = new ModelRenderer(this);
        goku4.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku4);
        setRotationAngle(goku4, 0.0F, 0.1745F, -0.3491F);
        goku4.cubeList.add(new ModelBox(goku4, 0, 58, 3.0F, -4.0F, 0.0F, 4, 3, 3, 0.0F));

        goku5 = new ModelRenderer(this);
        goku5.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku5);
        setRotationAngle(goku5, 0.0F, 0.1745F, -0.1152F);
        goku5.cubeList.add(new ModelBox(goku5, 0, 56, 3.0F, -2.3F, 0.7F, 3, 2, 2, 0.0F));

        goku6 = new ModelRenderer(this);
        goku6.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku6);
        setRotationAngle(goku6, 0.0F, 0.3491F, -0.2618F);
        goku6.cubeList.add(new ModelBox(goku6, 0, 56, 5.0F, -4.3F, 1.5F, 3, 2, 2, 0.0F));

        goku7 = new ModelRenderer(this);
        goku7.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku7);
        setRotationAngle(goku7, 0.3491F, 0.0F, -0.6109F);
        goku7.cubeList.add(new ModelBox(goku7, 2, 55, 1.0F, -11.0F, 2.0F, 3, 3, 3, 0.0F));

        goku8 = new ModelRenderer(this);
        goku8.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku8);
        setRotationAngle(goku8, 0.5236F, 0.0F, -0.7854F);
        goku8.cubeList.add(new ModelBox(goku8, 0, 57, 3.0F, -12.0F, 4.0F, 2, 3, 2, 0.0F));

        goku9 = new ModelRenderer(this);
        goku9.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku9);
        setRotationAngle(goku9, 0.0F, -0.3491F, 0.2618F);
        goku9.cubeList.add(new ModelBox(goku9, 6, 60, -9.0F, -4.7F, 1.5F, 3, 2, 2, 0.0F));

        goku10 = new ModelRenderer(this);
        goku10.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku10);
        setRotationAngle(goku10, 0.0F, -0.384F, 0.5271F);
        goku10.cubeList.add(new ModelBox(goku10, 0, 49, -10.0F, -4.8F, 1.0F, 5, 2, 2, 0.0F));

        goku11 = new ModelRenderer(this);
        goku11.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku11);
        setRotationAngle(goku11, 0.6807F, 0.0F, -0.1745F);
        goku11.cubeList.add(new ModelBox(goku11, 0, 55, 1.0F, -8.0F, 5.0F, 1, 4, 1, 0.0F));

        goku12 = new ModelRenderer(this);
        goku12.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku12);
        setRotationAngle(goku12, 0.0F, 0.0F, 0.4014F);
        goku12.cubeList.add(new ModelBox(goku12, 6, 49, -3.5F, -7.0F, -5.0F, 2, 3, 3, 0.0F));

        goku13 = new ModelRenderer(this);
        goku13.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku13);
        setRotationAngle(goku13, 0.0F, 0.0F, 0.5236F);
        goku13.cubeList.add(new ModelBox(goku13, 0, 52, -6.2F, -5.5F, -5.0F, 2, 3, 2, 0.0F));

        goku14 = new ModelRenderer(this);
        goku14.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku14);
        setRotationAngle(goku14, 0.0F, 0.0F, 0.6109F);
        goku14.cubeList.add(new ModelBox(goku14, 0, 49, -7.5F, -4.0F, -5.0F, 1, 3, 2, 0.0F));

        goku15 = new ModelRenderer(this);
        goku15.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku15);
        setRotationAngle(goku15, 0.0F, 0.0F, -0.3491F);
        goku15.cubeList.add(new ModelBox(goku15, 0, 49, 3.2F, -6.5F, -5.0F, 2, 3, 2, 0.0F));

        goku16 = new ModelRenderer(this);
        goku16.setRotationPoint(0.0F, 0.0F, 0.0F);
        goku.addChild(goku16);
        setRotationAngle(goku16, 0.0F, 0.0F, -0.6109F);
        goku16.cubeList.add(new ModelBox(goku16, 0, 49, 6.5F, -4.5F, -5.0F, 1, 3, 2, 0.0F));

        gokuSsj = new ModelRenderer(this);
        gokuSsj.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(gokuSsj);


        gokuSsj1 = new ModelRenderer(this);
        gokuSsj1.setRotationPoint(1.3324F, -7.6865F, -3.1666F);
        gokuSsj.addChild(gokuSsj1);
        setRotationAngle(gokuSsj1, -0.074F, -0.0738F, -0.2481F);


        Hair1_r1 = new ModelRenderer(this);
        Hair1_r1.setRotationPoint(1.0224F, -3.8521F, 1.8533F);
        gokuSsj1.addChild(Hair1_r1);
        setRotationAngle(Hair1_r1, -0.774F, -0.1693F, 0.4127F);
        Hair1_r1.cubeList.add(new ModelBox(Hair1_r1, 28, 53, -0.9356F, -2.0F, -1.0F, 2, 3, 2, -0.03F));

        Hair1_r2 = new ModelRenderer(this);
        Hair1_r2.setRotationPoint(0.5224F, -1.9521F, 0.4533F);
        gokuSsj1.addChild(Hair1_r2);
        setRotationAngle(Hair1_r2, -0.5297F, -0.1693F, 0.4127F);
        Hair1_r2.cubeList.add(new ModelBox(Hair1_r2, 28, 53, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

        Hair1_r3 = new ModelRenderer(this);
        Hair1_r3.setRotationPoint(0.3166F, -1.2127F, 0.0666F);
        gokuSsj1.addChild(Hair1_r3);
        setRotationAngle(Hair1_r3, -0.027F, -0.1901F, 0.404F);
        Hair1_r3.cubeList.add(new ModelBox(Hair1_r3, 28, 53, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj2 = new ModelRenderer(this);
        gokuSsj2.setRotationPoint(-1.3324F, -7.5865F, -2.7666F);
        gokuSsj.addChild(gokuSsj2);
        setRotationAngle(gokuSsj2, 0.0392F, 0.1507F, 0.3877F);


        Hair2_r1 = new ModelRenderer(this);
        Hair2_r1.setRotationPoint(-1.0224F, -3.8522F, 1.8533F);
        gokuSsj2.addChild(Hair2_r1);
        setRotationAngle(Hair2_r1, -0.8613F, 0.1693F, -0.4127F);
        Hair2_r1.cubeList.add(new ModelBox(Hair2_r1, 26, 56, -1.0644F, -2.0F, -1.0F, 2, 3, 2, -0.03F));

        Hair2_r2 = new ModelRenderer(this);
        Hair2_r2.setRotationPoint(-0.5224F, -1.9521F, 0.4533F);
        gokuSsj2.addChild(Hair2_r2);
        setRotationAngle(Hair2_r2, -0.5297F, 0.1693F, -0.4127F);
        Hair2_r2.cubeList.add(new ModelBox(Hair2_r2, 26, 56, -1.0044F, -2.0F, -1.0F, 2, 4, 2, -0.02F));

        Hair2_r3 = new ModelRenderer(this);
        Hair2_r3.setRotationPoint(-0.3165F, -1.2127F, 0.0666F);
        gokuSsj2.addChild(Hair2_r3);
        setRotationAngle(Hair2_r3, -0.027F, 0.1901F, -0.404F);


        gokuSsj3 = new ModelRenderer(this);
        gokuSsj3.setRotationPoint(3.1324F, -7.5865F, -2.7666F);
        gokuSsj.addChild(gokuSsj3);
        setRotationAngle(gokuSsj3, -0.0446F, -0.1484F, -0.2886F);


        Hair3_r1 = new ModelRenderer(this);
        Hair3_r1.setRotationPoint(1.0224F, -3.8522F, 1.8533F);
        gokuSsj3.addChild(Hair3_r1);
        setRotationAngle(Hair3_r1, -0.774F, -0.1693F, 0.4127F);
        Hair3_r1.cubeList.add(new ModelBox(Hair3_r1, 25, 49, -0.9356F, -1.0F, -1.0F, 2, 2, 2, -0.03F));

        Hair3_r2 = new ModelRenderer(this);
        Hair3_r2.setRotationPoint(0.5224F, -1.9521F, 0.4533F);
        gokuSsj3.addChild(Hair3_r2);
        setRotationAngle(Hair3_r2, -0.5297F, -0.1693F, 0.4127F);
        Hair3_r2.cubeList.add(new ModelBox(Hair3_r2, 25, 49, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

        Hair3_r3 = new ModelRenderer(this);
        Hair3_r3.setRotationPoint(0.3165F, -1.2127F, 0.0666F);
        gokuSsj3.addChild(Hair3_r3);
        setRotationAngle(Hair3_r3, -0.027F, -0.1901F, 0.404F);
        Hair3_r3.cubeList.add(new ModelBox(Hair3_r3, 25, 49, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj4 = new ModelRenderer(this);
        gokuSsj4.setRotationPoint(-3.1324F, -6.5865F, -1.3666F);
        gokuSsj.addChild(gokuSsj4);
        setRotationAngle(gokuSsj4, 0.6178F, 1.3512F, 0.1215F);


        Hair4_r1 = new ModelRenderer(this);
        Hair4_r1.setRotationPoint(-0.6206F, -2.1349F, 0.2548F);
        gokuSsj4.addChild(Hair4_r1);
        setRotationAngle(Hair4_r1, -0.3218F, 0.1845F, -0.4214F);
        Hair4_r1.cubeList.add(new ModelBox(Hair4_r1, 31, 55, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair4_r2 = new ModelRenderer(this);
        Hair4_r2.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsj4.addChild(Hair4_r2);
        setRotationAngle(Hair4_r2, -0.027F, 0.1901F, -0.404F);
        Hair4_r2.cubeList.add(new ModelBox(Hair4_r2, 31, 55, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj5 = new ModelRenderer(this);
        gokuSsj5.setRotationPoint(-2.3324F, -7.7865F, -3.0666F);
        gokuSsj.addChild(gokuSsj5);
        setRotationAngle(gokuSsj5, -1.7261F, 1.1313F, -2.2579F);


        Hair5_r3 = new ModelRenderer(this);
        Hair5_r3.setRotationPoint(-0.5206F, -1.9349F, 0.3548F);
        gokuSsj5.addChild(Hair5_r3);
        setRotationAngle(Hair5_r3, -0.5297F, 0.1693F, -0.4127F);
        Hair5_r3.cubeList.add(new ModelBox(Hair5_r3, 24, 55, -1.0044F, -3.0F, -1.0F, 2, 2, 2, -0.05F));
        Hair5_r3.cubeList.add(new ModelBox(Hair5_r3, 24, 55, -1.0044F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

        Hair5_r4 = new ModelRenderer(this);
        Hair5_r4.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsj5.addChild(Hair5_r4);
        setRotationAngle(Hair5_r4, -0.027F, 0.1901F, -0.404F);
        Hair5_r4.cubeList.add(new ModelBox(Hair5_r4, 24, 55, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj6 = new ModelRenderer(this);
        gokuSsj6.setRotationPoint(-3.7713F, -8.8232F, 0.7767F);
        gokuSsj.addChild(gokuSsj6);
        setRotationAngle(gokuSsj6, 0.7129F, 1.2204F, 0.5465F);


        Hair6_r1 = new ModelRenderer(this);
        Hair6_r1.setRotationPoint(-0.4854F, -1.518F, 0.4569F);
        gokuSsj6.addChild(Hair6_r1);
        setRotationAngle(Hair6_r1, -0.7057F, 0.1845F, -0.4214F);
        Hair6_r1.cubeList.add(new ModelBox(Hair6_r1, 31, 58, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair6_r2 = new ModelRenderer(this);
        Hair6_r2.setRotationPoint(-0.248F, -0.7009F, 0.0996F);
        gokuSsj6.addChild(Hair6_r2);
        setRotationAngle(Hair6_r2, -0.2869F, 0.1845F, -0.4214F);
        Hair6_r2.cubeList.add(new ModelBox(Hair6_r2, 31, 58, -1.0044F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsj7 = new ModelRenderer(this);
        gokuSsj7.setRotationPoint(-2.9713F, -9.1232F, 1.9767F);
        gokuSsj.addChild(gokuSsj7);
        setRotationAngle(gokuSsj7, 0.8176F, 1.2204F, 0.5465F);


        Hair7_r1 = new ModelRenderer(this);
        Hair7_r1.setRotationPoint(-0.6854F, -1.618F, 0.5569F);
        gokuSsj7.addChild(Hair7_r1);
        setRotationAngle(Hair7_r1, -0.7057F, 0.1845F, -0.4214F);
        Hair7_r1.cubeList.add(new ModelBox(Hair7_r1, 28, 59, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair7_r2 = new ModelRenderer(this);
        Hair7_r2.setRotationPoint(-0.248F, -0.7009F, 0.0996F);
        gokuSsj7.addChild(Hair7_r2);
        setRotationAngle(Hair7_r2, -0.2869F, 0.1845F, -0.4214F);
        Hair7_r2.cubeList.add(new ModelBox(Hair7_r2, 28, 59, -1.0044F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsj8 = new ModelRenderer(this);
        gokuSsj8.setRotationPoint(-4.0713F, -7.3232F, 1.4767F);
        gokuSsj.addChild(gokuSsj8);
        setRotationAngle(gokuSsj8, -0.1122F, 1.304F, -0.4749F);


        Hair8_r1 = new ModelRenderer(this);
        Hair8_r1.setRotationPoint(-0.6854F, -1.718F, 0.2569F);
        gokuSsj8.addChild(Hair8_r1);
        setRotationAngle(Hair8_r1, -0.5661F, 0.1845F, -0.4214F);
        Hair8_r1.cubeList.add(new ModelBox(Hair8_r1, 17, 52, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair8_r2 = new ModelRenderer(this);
        Hair8_r2.setRotationPoint(-0.248F, -0.7009F, -0.0004F);
        gokuSsj8.addChild(Hair8_r2);
        setRotationAngle(Hair8_r2, -0.1123F, 0.1845F, -0.4214F);
        Hair8_r2.cubeList.add(new ModelBox(Hair8_r2, 17, 52, -1.0044F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsj10 = new ModelRenderer(this);
        gokuSsj10.setRotationPoint(-3.2324F, -5.5365F, -0.5666F);
        gokuSsj.addChild(gokuSsj10);
        setRotationAngle(gokuSsj10, 0.8796F, 1.3512F, 0.1215F);


        Hair9_r1 = new ModelRenderer(this);
        Hair9_r1.setRotationPoint(-0.6206F, -2.1349F, 0.2548F);
        gokuSsj10.addChild(Hair9_r1);
        setRotationAngle(Hair9_r1, -0.4439F, 0.1845F, -0.4214F);
        Hair9_r1.cubeList.add(new ModelBox(Hair9_r1, 23, 51, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair9_r2 = new ModelRenderer(this);
        Hair9_r2.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsj10.addChild(Hair9_r2);
        setRotationAngle(Hair9_r2, -0.027F, 0.1901F, -0.404F);
        Hair9_r2.cubeList.add(new ModelBox(Hair9_r2, 23, 51, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj9 = new ModelRenderer(this);
        gokuSsj9.setRotationPoint(-3.3324F, -4.2365F, 0.9334F);
        gokuSsj.addChild(gokuSsj9);
        setRotationAngle(gokuSsj9, 0.932F, 1.3512F, 0.1215F);


        Hair10_r1 = new ModelRenderer(this);
        Hair10_r1.setRotationPoint(-0.6206F, -1.9349F, 0.2548F);
        gokuSsj9.addChild(Hair10_r1);
        setRotationAngle(Hair10_r1, -0.601F, 0.1845F, -0.4214F);
        Hair10_r1.cubeList.add(new ModelBox(Hair10_r1, 17, 49, -0.947F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair10_r2 = new ModelRenderer(this);
        Hair10_r2.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsj9.addChild(Hair10_r2);
        setRotationAngle(Hair10_r2, -0.027F, 0.1901F, -0.404F);
        Hair10_r2.cubeList.add(new ModelBox(Hair10_r2, 17, 49, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj11 = new ModelRenderer(this);
        gokuSsj11.setRotationPoint(-3.3324F, -5.7365F, 2.5334F);
        gokuSsj.addChild(gokuSsj11);
        setRotationAngle(gokuSsj11, 0.6514F, 1.2522F, -0.1591F);


        Hair11_r1 = new ModelRenderer(this);
        Hair11_r1.setRotationPoint(-0.6206F, -1.9349F, 0.2548F);
        gokuSsj11.addChild(Hair11_r1);
        setRotationAngle(Hair11_r1, -0.601F, 0.1845F, -0.4214F);
        Hair11_r1.cubeList.add(new ModelBox(Hair11_r1, 25, 49, -0.947F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair11_r2 = new ModelRenderer(this);
        Hair11_r2.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsj11.addChild(Hair11_r2);
        setRotationAngle(Hair11_r2, -0.027F, 0.1901F, -0.404F);
        Hair11_r2.cubeList.add(new ModelBox(Hair11_r2, 25, 49, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj12 = new ModelRenderer(this);
        gokuSsj12.setRotationPoint(-3.4324F, -4.0365F, 2.6334F);
        gokuSsj.addChild(gokuSsj12);
        setRotationAngle(gokuSsj12, -0.542F, 0.7709F, -0.9898F);


        Hair12_r1 = new ModelRenderer(this);
        Hair12_r1.setRotationPoint(-0.6206F, -1.9349F, 0.1548F);
        gokuSsj12.addChild(Hair12_r1);
        setRotationAngle(Hair12_r1, -0.4136F, 0.213F, -0.3564F);
        Hair12_r1.cubeList.add(new ModelBox(Hair12_r1, 18, 54, -0.947F, -2.0F, -0.9082F, 2, 2, 2, -0.05F));

        Hair12_r2 = new ModelRenderer(this);
        Hair12_r2.setRotationPoint(-0.1147F, -0.9955F, 0.2681F);
        gokuSsj12.addChild(Hair12_r2);
        setRotationAngle(Hair12_r2, -0.027F, 0.1901F, -0.404F);
        Hair12_r2.cubeList.add(new ModelBox(Hair12_r2, 18, 54, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsj13 = new ModelRenderer(this);
        gokuSsj13.setRotationPoint(-2.6669F, -2.6669F, 3.3604F);
        gokuSsj.addChild(gokuSsj13);
        setRotationAngle(gokuSsj13, -2.2098F, 0.3848F, 2.9592F);
        gokuSsj13.cubeList.add(new ModelBox(gokuSsj13, 17, 57, -1.0842F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r3 = new ModelRenderer(this);
        Hair10_r3.setRotationPoint(-0.1901F, -2.966F, 1.0181F);
        gokuSsj13.addChild(Hair10_r3);
        setRotationAngle(Hair10_r3, -0.601F, 0.0F, 0.0F);
        Hair10_r3.cubeList.add(new ModelBox(Hair10_r3, 17, 57, -0.897F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        gokuSsj14 = new ModelRenderer(this);
        gokuSsj14.setRotationPoint(-0.7F, -8.0F, -3.4F);
        gokuSsj.addChild(gokuSsj14);
        setRotationAngle(gokuSsj14, -1.1045F, 0.5025F, 0.3626F);
        gokuSsj14.cubeList.add(new ModelBox(gokuSsj14, 17, 56, -0.8913F, -0.5317F, -0.9572F, 2, 3, 2, 0.0F));

        Strand1_r1 = new ModelRenderer(this);
        Strand1_r1.setRotationPoint(0.1087F, 0.6683F, -0.8572F);
        gokuSsj14.addChild(Strand1_r1);
        setRotationAngle(Strand1_r1, 0.6283F, 0.0F, 0.0F);
        Strand1_r1.cubeList.add(new ModelBox(Strand1_r1, 17, 56, -1.0F, 1.2F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsj15 = new ModelRenderer(this);
        gokuSsj15.setRotationPoint(0.7F, -8.0F, -3.4F);
        gokuSsj.addChild(gokuSsj15);
        setRotationAngle(gokuSsj15, -1.071F, -0.2584F, -0.5F);
        gokuSsj15.cubeList.add(new ModelBox(gokuSsj15, 19, 58, -1.1087F, -0.5317F, -0.9572F, 2, 3, 2, 0.0F));

        Strand1_r2 = new ModelRenderer(this);
        Strand1_r2.setRotationPoint(-0.1087F, 0.6683F, -0.8572F);
        gokuSsj15.addChild(Strand1_r2);
        setRotationAngle(Strand1_r2, 0.6807F, 0.0F, 0.0F);
        Strand1_r2.cubeList.add(new ModelBox(Strand1_r2, 19, 58, -1.0F, 1.2F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj16 = new ModelRenderer(this);
        gokuSsj16.setRotationPoint(3.4024F, -7.3384F, -4.0017F);
        gokuSsj.addChild(gokuSsj16);
        setRotationAngle(gokuSsj16, -0.7009F, -0.0802F, -0.3688F);
        gokuSsj16.cubeList.add(new ModelBox(gokuSsj16, 17, 59, -1.0F, -1.95F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsj17 = new ModelRenderer(this);
        gokuSsj17.setRotationPoint(-2.6163F, -7.5498F, -3.8265F);
        gokuSsj.addChild(gokuSsj17);
        setRotationAngle(gokuSsj17, -0.4651F, 0.2457F, 0.3449F);


        Strand4_r1 = new ModelRenderer(this);
        Strand4_r1.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
        gokuSsj17.addChild(Strand4_r1);
        setRotationAngle(Strand4_r1, 0.3046F, -0.3684F, 0.2431F);
        Strand4_r1.cubeList.add(new ModelBox(Strand4_r1, 17, 53, -0.5926F, -2.4717F, -0.8594F, 2, 3, 2, 0.0F));

        Strand4_r2 = new ModelRenderer(this);
        Strand4_r2.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
        gokuSsj17.addChild(Strand4_r2);
        setRotationAngle(Strand4_r2, 0.0F, 0.0F, 0.192F);
        Strand4_r2.cubeList.add(new ModelBox(Strand4_r2, 17, 53, 0.3104F, -2.6512F, -2.0F, 2, 3, 2, 0.0F));

        gokuSsj18 = new ModelRenderer(this);
        gokuSsj18.setRotationPoint(3.1324F, -6.5865F, -1.3666F);
        gokuSsj.addChild(gokuSsj18);
        setRotationAngle(gokuSsj18, 0.6178F, -1.3512F, -0.1215F);


        Hair4_r3 = new ModelRenderer(this);
        Hair4_r3.setRotationPoint(0.6206F, -2.1349F, 0.2548F);
        gokuSsj18.addChild(Hair4_r3);
        setRotationAngle(Hair4_r3, -0.3218F, -0.1845F, 0.4214F);
        Hair4_r3.cubeList.add(new ModelBox(Hair4_r3, 30, 52, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair4_r4 = new ModelRenderer(this);
        Hair4_r4.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsj18.addChild(Hair4_r4);
        setRotationAngle(Hair4_r4, -0.027F, -0.1901F, 0.404F);
        Hair4_r4.cubeList.add(new ModelBox(Hair4_r4, 30, 52, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj19 = new ModelRenderer(this);
        gokuSsj19.setRotationPoint(3.5713F, -8.8232F, 0.7767F);
        gokuSsj.addChild(gokuSsj19);
        setRotationAngle(gokuSsj19, 0.7129F, -1.2204F, -0.5465F);


        Hair6_r4 = new ModelRenderer(this);
        Hair6_r4.setRotationPoint(0.4854F, -1.518F, 0.4569F);
        gokuSsj19.addChild(Hair6_r4);
        setRotationAngle(Hair6_r4, -0.7057F, -0.1845F, 0.4214F);
        Hair6_r4.cubeList.add(new ModelBox(Hair6_r4, 21, 54, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair6_r5 = new ModelRenderer(this);
        Hair6_r5.setRotationPoint(0.248F, -0.7009F, 0.0996F);
        gokuSsj19.addChild(Hair6_r5);
        setRotationAngle(Hair6_r5, -0.2869F, -0.1845F, 0.4214F);
        Hair6_r5.cubeList.add(new ModelBox(Hair6_r5, 21, 54, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair6_r6 = new ModelRenderer(this);
        Hair6_r6.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
        gokuSsj19.addChild(Hair6_r6);
        setRotationAngle(Hair6_r6, -0.027F, -0.1901F, 0.404F);
        Hair6_r6.cubeList.add(new ModelBox(Hair6_r6, 21, 54, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj20 = new ModelRenderer(this);
        gokuSsj20.setRotationPoint(4.0713F, -7.3232F, 1.4767F);
        gokuSsj.addChild(gokuSsj20);
        setRotationAngle(gokuSsj20, -0.1122F, -1.304F, 0.4749F);


        Hair8_r4 = new ModelRenderer(this);
        Hair8_r4.setRotationPoint(0.6854F, -1.718F, 0.2569F);
        gokuSsj20.addChild(Hair8_r4);
        setRotationAngle(Hair8_r4, -0.5661F, -0.1845F, 0.4214F);
        Hair8_r4.cubeList.add(new ModelBox(Hair8_r4, 27, 57, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair8_r5 = new ModelRenderer(this);
        Hair8_r5.setRotationPoint(0.248F, -0.7009F, -0.0004F);
        gokuSsj20.addChild(Hair8_r5);
        setRotationAngle(Hair8_r5, -0.1123F, -0.1845F, 0.4214F);
        Hair8_r5.cubeList.add(new ModelBox(Hair8_r5, 27, 57, -0.9956F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair8_r6 = new ModelRenderer(this);
        Hair8_r6.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
        gokuSsj20.addChild(Hair8_r6);
        setRotationAngle(Hair8_r6, -0.027F, -0.1901F, 0.404F);


        gokuSsj21 = new ModelRenderer(this);
        gokuSsj21.setRotationPoint(3.2324F, -5.5365F, -0.5666F);
        gokuSsj.addChild(gokuSsj21);
        setRotationAngle(gokuSsj21, 0.8796F, -1.3512F, -0.1215F);


        Hair9_r3 = new ModelRenderer(this);
        Hair9_r3.setRotationPoint(0.6206F, -2.1349F, 0.2548F);
        gokuSsj21.addChild(Hair9_r3);
        setRotationAngle(Hair9_r3, -0.4439F, -0.1845F, 0.4214F);
        Hair9_r3.cubeList.add(new ModelBox(Hair9_r3, 23, 58, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair9_r4 = new ModelRenderer(this);
        Hair9_r4.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsj21.addChild(Hair9_r4);
        setRotationAngle(Hair9_r4, -0.027F, -0.1901F, 0.404F);
        Hair9_r4.cubeList.add(new ModelBox(Hair9_r4, 23, 58, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj23 = new ModelRenderer(this);
        gokuSsj23.setRotationPoint(3.3324F, -4.2365F, 0.9334F);
        gokuSsj.addChild(gokuSsj23);
        setRotationAngle(gokuSsj23, 0.932F, -1.3512F, -0.1215F);


        Hair10_r4 = new ModelRenderer(this);
        Hair10_r4.setRotationPoint(0.6206F, -1.9349F, 0.2548F);
        gokuSsj23.addChild(Hair10_r4);
        setRotationAngle(Hair10_r4, -0.601F, -0.1845F, 0.4214F);
        Hair10_r4.cubeList.add(new ModelBox(Hair10_r4, 20, 60, -1.053F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair10_r5 = new ModelRenderer(this);
        Hair10_r5.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsj23.addChild(Hair10_r5);
        setRotationAngle(Hair10_r5, -0.027F, -0.1901F, 0.404F);
        Hair10_r5.cubeList.add(new ModelBox(Hair10_r5, 20, 60, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj22 = new ModelRenderer(this);
        gokuSsj22.setRotationPoint(3.3324F, -5.7365F, 2.5334F);
        gokuSsj.addChild(gokuSsj22);
        setRotationAngle(gokuSsj22, 0.6514F, -1.2522F, 0.1591F);


        Hair11_r3 = new ModelRenderer(this);
        Hair11_r3.setRotationPoint(0.6206F, -1.9349F, 0.2548F);
        gokuSsj22.addChild(Hair11_r3);
        setRotationAngle(Hair11_r3, -0.601F, -0.1845F, 0.4214F);
        Hair11_r3.cubeList.add(new ModelBox(Hair11_r3, 31, 60, -1.053F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair11_r4 = new ModelRenderer(this);
        Hair11_r4.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsj22.addChild(Hair11_r4);
        setRotationAngle(Hair11_r4, -0.027F, -0.1901F, 0.404F);
        Hair11_r4.cubeList.add(new ModelBox(Hair11_r4, 31, 60, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsj24 = new ModelRenderer(this);
        gokuSsj24.setRotationPoint(-2.1324F, -8.7865F, 0.0834F);
        gokuSsj.addChild(gokuSsj24);
        setRotationAngle(gokuSsj24, -0.2792F, -0.0018F, -0.0175F);


        Hair20_r1 = new ModelRenderer(this);
        Hair20_r1.setRotationPoint(0.0014F, -3.2509F, -0.0452F);
        gokuSsj24.addChild(Hair20_r1);
        setRotationAngle(Hair20_r1, 0.0F, 0.0F, 0.2618F);
        Hair20_r1.cubeList.add(new ModelBox(Hair20_r1, 31, 59, -1.1736F, -1.9848F, -1.0F, 2, 2, 2, -0.08F));

        Hair20_r2 = new ModelRenderer(this);
        Hair20_r2.setRotationPoint(-0.2206F, -2.5349F, -0.0452F);
        gokuSsj24.addChild(Hair20_r2);
        setRotationAngle(Hair20_r2, 0.0F, 0.0F, 0.1396F);
        Hair20_r2.cubeList.add(new ModelBox(Hair20_r2, 31, 59, -1.0044F, -1.0F, -1.0F, 2, 4, 2, -0.02F));

        gokuSsj25 = new ModelRenderer(this);
        gokuSsj25.setRotationPoint(-0.3324F, -7.3865F, -0.8166F);
        gokuSsj.addChild(gokuSsj25);
        setRotationAngle(gokuSsj25, -0.3142F, 0.0F, 0.0F);


        Hair20_r3 = new ModelRenderer(this);
        Hair20_r3.setRotationPoint(0.1794F, -5.3349F, -0.0452F);
        gokuSsj25.addChild(Hair20_r3);
        setRotationAngle(Hair20_r3, 0.0F, 0.0F, 0.1745F);
        Hair20_r3.cubeList.add(new ModelBox(Hair20_r3, 31, 56, -1.0044F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair20_r4 = new ModelRenderer(this);
        Hair20_r4.setRotationPoint(-0.2206F, -2.5349F, -0.0452F);
        gokuSsj25.addChild(Hair20_r4);
        setRotationAngle(Hair20_r4, 0.0F, 0.0F, 0.1396F);


        gokuSsj26 = new ModelRenderer(this);
        gokuSsj26.setRotationPoint(1.8324F, -7.8865F, -0.8166F);
        gokuSsj.addChild(gokuSsj26);
        setRotationAngle(gokuSsj26, -0.3491F, 0.0F, 0.0F);


        Hair20_r5 = new ModelRenderer(this);
        Hair20_r5.setRotationPoint(-0.1794F, -5.3349F, -0.0452F);
        gokuSsj26.addChild(Hair20_r5);
        setRotationAngle(Hair20_r5, 0.0F, 0.0F, -0.1745F);
        Hair20_r5.cubeList.add(new ModelBox(Hair20_r5, 31, 53, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair20_r6 = new ModelRenderer(this);
        Hair20_r6.setRotationPoint(0.2206F, -2.5349F, -0.0452F);
        gokuSsj26.addChild(Hair20_r6);
        setRotationAngle(Hair20_r6, 0.0F, 0.0F, -0.1396F);


        gokuSsj27 = new ModelRenderer(this);
        gokuSsj27.setRotationPoint(2.4324F, -8.2865F, 0.0834F);
        gokuSsj.addChild(gokuSsj27);
        setRotationAngle(gokuSsj27, -0.2442F, 0.0067F, 0.0343F);


        Hair20_r7 = new ModelRenderer(this);
        Hair20_r7.setRotationPoint(-0.3794F, -5.0349F, -0.0452F);
        gokuSsj27.addChild(Hair20_r7);
        setRotationAngle(Hair20_r7, 0.0F, 0.0F, -0.5061F);
        Hair20_r7.cubeList.add(new ModelBox(Hair20_r7, 31, 50, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair20_r8 = new ModelRenderer(this);
        Hair20_r8.setRotationPoint(0.2206F, -2.5349F, -0.0452F);
        gokuSsj27.addChild(Hair20_r8);
        setRotationAngle(Hair20_r8, 0.0F, 0.0F, -0.1396F);
        Hair20_r8.cubeList.add(new ModelBox(Hair20_r8, 31, 50, -0.9956F, -2.0F, -1.0F, 2, 4, 2, -0.02F));

        gokuSsj28 = new ModelRenderer(this);
        gokuSsj28.setRotationPoint(2.9713F, -9.1232F, 1.9767F);
        gokuSsj.addChild(gokuSsj28);
        setRotationAngle(gokuSsj28, 0.8176F, -1.2204F, -0.5465F);


        Hair7_r4 = new ModelRenderer(this);
        Hair7_r4.setRotationPoint(0.6854F, -1.618F, 0.5569F);
        gokuSsj28.addChild(Hair7_r4);
        setRotationAngle(Hair7_r4, -0.7057F, -0.1845F, 0.4214F);
        Hair7_r4.cubeList.add(new ModelBox(Hair7_r4, 31, 49, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair7_r5 = new ModelRenderer(this);
        Hair7_r5.setRotationPoint(0.248F, -0.7009F, 0.0996F);
        gokuSsj28.addChild(Hair7_r5);
        setRotationAngle(Hair7_r5, -0.2869F, -0.1845F, 0.4214F);
        Hair7_r5.cubeList.add(new ModelBox(Hair7_r5, 31, 49, -0.9956F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsj29 = new ModelRenderer(this);
        gokuSsj29.setRotationPoint(2.2713F, -9.2232F, 3.1767F);
        gokuSsj.addChild(gokuSsj29);
        gokuSsj29.cubeList.add(new ModelBox(gokuSsj29, 29, 49, -1.0578F, -0.2615F, -1.0871F, 2, 2, 2, 0.0F));

        Hair7_r7 = new ModelRenderer(this);
        Hair7_r7.setRotationPoint(-0.0519F, -0.7009F, -0.2004F);
        gokuSsj29.addChild(Hair7_r7);
        setRotationAngle(Hair7_r7, 0.3142F, 0.0F, 0.0F);
        Hair7_r7.cubeList.add(new ModelBox(Hair7_r7, 29, 49, -0.9994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

        Hair7_r8 = new ModelRenderer(this);
        Hair7_r8.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
        gokuSsj29.addChild(Hair7_r8);
        setRotationAngle(Hair7_r8, 0.2967F, 0.0F, 0.0F);
        Hair7_r8.cubeList.add(new ModelBox(Hair7_r8, 29, 49, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsj30 = new ModelRenderer(this);
        gokuSsj30.setRotationPoint(0.6713F, -9.7232F, 2.7767F);
        gokuSsj.addChild(gokuSsj30);
        setRotationAngle(gokuSsj30, -0.0348F, -0.003F, -0.0872F);
        gokuSsj30.cubeList.add(new ModelBox(gokuSsj30, 21, 49, -1.0579F, -0.2615F, -1.0871F, 2, 2, 2, 0.0F));

        Hair7_r9 = new ModelRenderer(this);
        Hair7_r9.setRotationPoint(-0.0519F, -0.7009F, -0.2004F);
        gokuSsj30.addChild(Hair7_r9);
        setRotationAngle(Hair7_r9, 0.2094F, 0.0F, 0.0F);
        Hair7_r9.cubeList.add(new ModelBox(Hair7_r9, 21, 49, -0.9994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

        Hair7_r10 = new ModelRenderer(this);
        Hair7_r10.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
        gokuSsj30.addChild(Hair7_r10);
        setRotationAngle(Hair7_r10, 0.192F, 0.0F, 0.0F);
        Hair7_r10.cubeList.add(new ModelBox(Hair7_r10, 21, 49, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsj31 = new ModelRenderer(this);
        gokuSsj31.setRotationPoint(-1.6287F, -9.3232F, 3.1767F);
        gokuSsj.addChild(gokuSsj31);
        setRotationAngle(gokuSsj31, 0.1572F, -0.003F, -0.0872F);
        gokuSsj31.cubeList.add(new ModelBox(gokuSsj31, 17, 49, -1.0579F, -0.0615F, -1.0871F, 2, 2, 2, 0.0F));

        Hair7_r11 = new ModelRenderer(this);
        Hair7_r11.setRotationPoint(-0.0519F, -0.5009F, -0.2004F);
        gokuSsj31.addChild(Hair7_r11);
        setRotationAngle(Hair7_r11, 0.2094F, 0.0F, 0.0F);
        Hair7_r11.cubeList.add(new ModelBox(Hair7_r11, 17, 49, -0.5994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

        Hair7_r12 = new ModelRenderer(this);
        Hair7_r12.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
        gokuSsj31.addChild(Hair7_r12);
        setRotationAngle(Hair7_r12, 0.192F, 0.0F, 0.0F);
        Hair7_r12.cubeList.add(new ModelBox(Hair7_r12, 17, 49, -0.9956F, -2.0F, -1.0F, 3, 3, 2, -0.05F));

        gokuSsj32 = new ModelRenderer(this);
        gokuSsj32.setRotationPoint(-3.3669F, -4.9669F, 3.4604F);
        gokuSsj.addChild(gokuSsj32);
        setRotationAngle(gokuSsj32, -2.5932F, 0.4958F, -2.9726F);


        Hair10_r9 = new ModelRenderer(this);
        Hair10_r9.setRotationPoint(-0.1901F, -2.866F, 0.2181F);
        gokuSsj32.addChild(Hair10_r9);
        setRotationAngle(Hair10_r9, -0.9152F, 0.0F, 0.0F);
        Hair10_r9.cubeList.add(new ModelBox(Hair10_r9, 17, 50, -0.897F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r10 = new ModelRenderer(this);
        Hair10_r10.setRotationPoint(-0.1901F, -2.966F, 1.0181F);
        gokuSsj32.addChild(Hair10_r10);
        setRotationAngle(Hair10_r10, -0.601F, 0.0F, 0.0F);
        Hair10_r10.cubeList.add(new ModelBox(Hair10_r10, 17, 50, -0.897F, -1.8F, -0.8332F, 2, 4, 2, -0.05F));

        gokuSsj33 = new ModelRenderer(this);
        gokuSsj33.setRotationPoint(-2.1669F, -5.2669F, 3.4604F);
        gokuSsj.addChild(gokuSsj33);
        setRotationAngle(gokuSsj33, -2.5144F, 0.626F, -2.6924F);


        Hair10_r11 = new ModelRenderer(this);
        Hair10_r11.setRotationPoint(-0.1901F, -2.866F, 0.2181F);
        gokuSsj33.addChild(Hair10_r11);
        setRotationAngle(Hair10_r11, -0.9152F, 0.0F, 0.0F);
        Hair10_r11.cubeList.add(new ModelBox(Hair10_r11, 17, 53, -0.897F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r12 = new ModelRenderer(this);
        Hair10_r12.setRotationPoint(-0.1901F, -2.966F, 1.0181F);
        gokuSsj33.addChild(Hair10_r12);
        setRotationAngle(Hair10_r12, -0.601F, 0.0F, 0.0F);
        Hair10_r12.cubeList.add(new ModelBox(Hair10_r12, 17, 53, -0.897F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsj34 = new ModelRenderer(this);
        gokuSsj34.setRotationPoint(3.3669F, -4.2669F, 3.4604F);
        gokuSsj.addChild(gokuSsj34);
        setRotationAngle(gokuSsj34, -2.5932F, -0.4958F, 2.9726F);
        gokuSsj34.cubeList.add(new ModelBox(gokuSsj34, 25, 49, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r13 = new ModelRenderer(this);
        Hair10_r13.setRotationPoint(0.1901F, -2.866F, 0.2181F);
        gokuSsj34.addChild(Hair10_r13);
        setRotationAngle(Hair10_r13, -0.9152F, 0.0F, 0.0F);
        Hair10_r13.cubeList.add(new ModelBox(Hair10_r13, 25, 49, -1.103F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r14 = new ModelRenderer(this);
        Hair10_r14.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsj34.addChild(Hair10_r14);
        setRotationAngle(Hair10_r14, -0.601F, 0.0F, 0.0F);
        Hair10_r14.cubeList.add(new ModelBox(Hair10_r14, 25, 49, -1.103F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsj35 = new ModelRenderer(this);
        gokuSsj35.setRotationPoint(1.2669F, -5.1669F, 3.4604F);
        gokuSsj.addChild(gokuSsj35);
        setRotationAngle(gokuSsj35, -2.6896F, -0.3868F, -3.0479F);


        Hair10_r15 = new ModelRenderer(this);
        Hair10_r15.setRotationPoint(0.1901F, -2.866F, 0.2181F);
        gokuSsj35.addChild(Hair10_r15);
        setRotationAngle(Hair10_r15, -0.9152F, 0.0F, 0.0F);
        Hair10_r15.cubeList.add(new ModelBox(Hair10_r15, 25, 51, -1.103F, -4.0F, -0.9332F, 2, 3, 2, -0.09F));

        gokuSsj36 = new ModelRenderer(this);
        gokuSsj36.setRotationPoint(2.8669F, -3.5669F, 3.9604F);
        gokuSsj.addChild(gokuSsj36);
        setRotationAngle(gokuSsj36, -2.2846F, 0.0246F, -3.0184F);
        gokuSsj36.cubeList.add(new ModelBox(gokuSsj36, 25, 54, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r17 = new ModelRenderer(this);
        Hair10_r17.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsj36.addChild(Hair10_r17);
        setRotationAngle(Hair10_r17, -0.601F, 0.0F, 0.0F);
        Hair10_r17.cubeList.add(new ModelBox(Hair10_r17, 25, 54, -1.103F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        gokuSsj37 = new ModelRenderer(this);
        gokuSsj37.setRotationPoint(0.9669F, -3.6669F, 3.6604F);
        gokuSsj.addChild(gokuSsj37);
        setRotationAngle(gokuSsj37, -2.332F, 0.0034F, -3.1242F);
        gokuSsj37.cubeList.add(new ModelBox(gokuSsj37, 28, 53, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r18 = new ModelRenderer(this);
        Hair10_r18.setRotationPoint(0.1901F, -2.866F, 0.2181F);
        gokuSsj37.addChild(Hair10_r18);
        setRotationAngle(Hair10_r18, -0.9152F, 0.0F, 0.0F);
        Hair10_r18.cubeList.add(new ModelBox(Hair10_r18, 25, 57, -1.103F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r19 = new ModelRenderer(this);
        Hair10_r19.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsj37.addChild(Hair10_r19);
        setRotationAngle(Hair10_r19, -0.601F, 0.0F, 0.0F);
        Hair10_r19.cubeList.add(new ModelBox(Hair10_r19, 28, 53, -1.103F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsj38 = new ModelRenderer(this);
        gokuSsj38.setRotationPoint(-0.9331F, -3.3669F, 3.6604F);
        gokuSsj.addChild(gokuSsj38);
        setRotationAngle(gokuSsj38, -2.2836F, 0.096F, 3.0792F);
        gokuSsj38.cubeList.add(new ModelBox(gokuSsj38, 25, 59, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r20 = new ModelRenderer(this);
        Hair10_r20.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsj38.addChild(Hair10_r20);
        setRotationAngle(Hair10_r20, -0.601F, 0.0F, 0.0F);
        Hair10_r20.cubeList.add(new ModelBox(Hair10_r20, 25, 59, -1.103F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsj39 = new ModelRenderer(this);
        gokuSsj39.setRotationPoint(3.2163F, -7.9499F, -2.2265F);
        gokuSsj.addChild(gokuSsj39);
        setRotationAngle(gokuSsj39, -0.4651F, -0.2457F, -0.3449F);


        Strand4_r3 = new ModelRenderer(this);
        Strand4_r3.setRotationPoint(1.5142F, 1.4614F, 0.7725F);
        gokuSsj39.addChild(Strand4_r3);
        setRotationAngle(Strand4_r3, 0.0F, 0.0F, -0.192F);
        Strand4_r3.cubeList.add(new ModelBox(Strand4_r3, 17, 59, -2.3104F, -2.6512F, -2.0F, 2, 3, 2, 0.0F));

        gokuSsjtwo = new ModelRenderer(this);
        gokuSsjtwo.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(gokuSsjtwo);


        gokuSsjtwo1 = new ModelRenderer(this);
        gokuSsjtwo1.setRotationPoint(1.3324F, -7.6865F, -3.1666F);
        gokuSsjtwo.addChild(gokuSsjtwo1);
        setRotationAngle(gokuSsjtwo1, -0.074F, -0.0738F, -0.2481F);


        Hair1_r4 = new ModelRenderer(this);
        Hair1_r4.setRotationPoint(1.0224F, -3.8521F, 1.8533F);
        gokuSsjtwo1.addChild(Hair1_r4);
        setRotationAngle(Hair1_r4, -0.774F, -0.1693F, 0.4127F);
        Hair1_r4.cubeList.add(new ModelBox(Hair1_r4, 76, 53, -0.9356F, -2.0F, -1.0F, 2, 3, 2, -0.03F));

        Hair1_r5 = new ModelRenderer(this);
        Hair1_r5.setRotationPoint(0.5224F, -1.9521F, 0.4533F);
        gokuSsjtwo1.addChild(Hair1_r5);
        setRotationAngle(Hair1_r5, -0.5297F, -0.1693F, 0.4127F);
        Hair1_r5.cubeList.add(new ModelBox(Hair1_r5, 76, 53, -0.8956F, -1.8F, -0.9F, 2, 3, 2, -0.02F));

        Hair1_r6 = new ModelRenderer(this);
        Hair1_r6.setRotationPoint(0.3166F, -1.2127F, 0.0666F);
        gokuSsjtwo1.addChild(Hair1_r6);
        setRotationAngle(Hair1_r6, -0.027F, -0.1901F, 0.404F);
        Hair1_r6.cubeList.add(new ModelBox(Hair1_r6, 76, 53, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo2 = new ModelRenderer(this);
        gokuSsjtwo2.setRotationPoint(-1.4324F, -7.5865F, -2.7666F);
        gokuSsjtwo.addChild(gokuSsjtwo2);
        setRotationAngle(gokuSsjtwo2, 0.0392F, 0.1507F, 0.3877F);


        Hair2_r4 = new ModelRenderer(this);
        Hair2_r4.setRotationPoint(-1.0224F, -3.8522F, 1.8533F);
        gokuSsjtwo2.addChild(Hair2_r4);
        setRotationAngle(Hair2_r4, -0.8613F, 0.1693F, -0.4127F);
        Hair2_r4.cubeList.add(new ModelBox(Hair2_r4, 74, 56, -1.0644F, -2.0F, -1.0F, 2, 3, 2, -0.03F));

        Hair2_r5 = new ModelRenderer(this);
        Hair2_r5.setRotationPoint(-0.5224F, -1.9521F, 0.4533F);
        gokuSsjtwo2.addChild(Hair2_r5);
        setRotationAngle(Hair2_r5, -0.5297F, 0.1693F, -0.4127F);
        Hair2_r5.cubeList.add(new ModelBox(Hair2_r5, 74, 56, -1.0044F, -2.0F, -1.0F, 2, 4, 2, -0.02F));

        Hair2_r6 = new ModelRenderer(this);
        Hair2_r6.setRotationPoint(-0.3165F, -1.2127F, 0.0666F);
        gokuSsjtwo2.addChild(Hair2_r6);
        setRotationAngle(Hair2_r6, -0.027F, 0.1901F, -0.404F);


        gokuSsjtwo3 = new ModelRenderer(this);
        gokuSsjtwo3.setRotationPoint(3.1324F, -7.5865F, -2.7666F);
        gokuSsjtwo.addChild(gokuSsjtwo3);
        setRotationAngle(gokuSsjtwo3, -0.0446F, -0.1484F, -0.2886F);


        Hair3_r4 = new ModelRenderer(this);
        Hair3_r4.setRotationPoint(1.0224F, -3.8522F, 1.8533F);
        gokuSsjtwo3.addChild(Hair3_r4);
        setRotationAngle(Hair3_r4, -0.774F, -0.1693F, 0.4127F);
        Hair3_r4.cubeList.add(new ModelBox(Hair3_r4, 73, 49, -0.9356F, -1.0F, -1.0F, 2, 2, 2, -0.03F));

        Hair3_r5 = new ModelRenderer(this);
        Hair3_r5.setRotationPoint(0.5224F, -1.9521F, 0.4533F);
        gokuSsjtwo3.addChild(Hair3_r5);
        setRotationAngle(Hair3_r5, -0.5297F, -0.1693F, 0.4127F);
        Hair3_r5.cubeList.add(new ModelBox(Hair3_r5, 73, 49, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

        Hair3_r6 = new ModelRenderer(this);
        Hair3_r6.setRotationPoint(0.3165F, -1.2127F, 0.0666F);
        gokuSsjtwo3.addChild(Hair3_r6);
        setRotationAngle(Hair3_r6, -0.027F, -0.1901F, 0.404F);
        Hair3_r6.cubeList.add(new ModelBox(Hair3_r6, 73, 49, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo4 = new ModelRenderer(this);
        gokuSsjtwo4.setRotationPoint(-3.1324F, -6.5865F, -1.3666F);
        gokuSsjtwo.addChild(gokuSsjtwo4);
        setRotationAngle(gokuSsjtwo4, 0.6178F, 1.3512F, 0.1215F);


        Hair4_r5 = new ModelRenderer(this);
        Hair4_r5.setRotationPoint(-0.6206F, -2.1349F, 0.2548F);
        gokuSsjtwo4.addChild(Hair4_r5);
        setRotationAngle(Hair4_r5, -0.3218F, 0.1845F, -0.4214F);
        Hair4_r5.cubeList.add(new ModelBox(Hair4_r5, 79, 55, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair4_r6 = new ModelRenderer(this);
        Hair4_r6.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo4.addChild(Hair4_r6);
        setRotationAngle(Hair4_r6, -0.027F, 0.1901F, -0.404F);
        Hair4_r6.cubeList.add(new ModelBox(Hair4_r6, 79, 55, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo5 = new ModelRenderer(this);
        gokuSsjtwo5.setRotationPoint(-2.3324F, -7.7865F, -3.0666F);
        gokuSsjtwo.addChild(gokuSsjtwo5);
        setRotationAngle(gokuSsjtwo5, -1.7261F, 1.1313F, -2.2579F);


        Hair5_r5 = new ModelRenderer(this);
        Hair5_r5.setRotationPoint(-0.5206F, -1.9349F, 0.3548F);
        gokuSsjtwo5.addChild(Hair5_r5);
        setRotationAngle(Hair5_r5, -0.5297F, 0.1693F, -0.4127F);
        Hair5_r5.cubeList.add(new ModelBox(Hair5_r5, 72, 55, -1.0044F, -3.0F, -1.0F, 2, 2, 2, -0.05F));
        Hair5_r5.cubeList.add(new ModelBox(Hair5_r5, 72, 55, -1.0044F, -2.0F, -1.0F, 2, 3, 2, -0.02F));

        Hair5_r6 = new ModelRenderer(this);
        Hair5_r6.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo5.addChild(Hair5_r6);
        setRotationAngle(Hair5_r6, -0.027F, 0.1901F, -0.404F);
        Hair5_r6.cubeList.add(new ModelBox(Hair5_r6, 72, 55, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo6 = new ModelRenderer(this);
        gokuSsjtwo6.setRotationPoint(-3.7713F, -8.8232F, 0.7767F);
        gokuSsjtwo.addChild(gokuSsjtwo6);
        setRotationAngle(gokuSsjtwo6, 0.7129F, 1.2204F, 0.5465F);


        Hair6_r7 = new ModelRenderer(this);
        Hair6_r7.setRotationPoint(-0.4854F, -1.518F, 0.4569F);
        gokuSsjtwo6.addChild(Hair6_r7);
        setRotationAngle(Hair6_r7, -0.7057F, 0.1845F, -0.4214F);
        Hair6_r7.cubeList.add(new ModelBox(Hair6_r7, 79, 58, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair6_r8 = new ModelRenderer(this);
        Hair6_r8.setRotationPoint(-0.248F, -0.7009F, 0.0996F);
        gokuSsjtwo6.addChild(Hair6_r8);
        setRotationAngle(Hair6_r8, -0.2869F, 0.1845F, -0.4214F);
        Hair6_r8.cubeList.add(new ModelBox(Hair6_r8, 79, 58, -1.0044F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair6_r9 = new ModelRenderer(this);
        Hair6_r9.setRotationPoint(0.0578F, 0.2385F, -0.0871F);
        gokuSsjtwo6.addChild(Hair6_r9);
        setRotationAngle(Hair6_r9, -0.027F, 0.1901F, -0.404F);


        gokuSsjtwo7 = new ModelRenderer(this);
        gokuSsjtwo7.setRotationPoint(-2.9713F, -9.1232F, 1.9767F);
        gokuSsjtwo.addChild(gokuSsjtwo7);
        setRotationAngle(gokuSsjtwo7, 0.8176F, 1.2204F, 0.5465F);


        Hair7_r13 = new ModelRenderer(this);
        Hair7_r13.setRotationPoint(-0.6854F, -1.618F, 0.5569F);
        gokuSsjtwo7.addChild(Hair7_r13);
        setRotationAngle(Hair7_r13, -0.7057F, 0.1845F, -0.4214F);
        Hair7_r13.cubeList.add(new ModelBox(Hair7_r13, 76, 59, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair7_r14 = new ModelRenderer(this);
        Hair7_r14.setRotationPoint(-0.248F, -0.7009F, 0.0996F);
        gokuSsjtwo7.addChild(Hair7_r14);
        setRotationAngle(Hair7_r14, -0.2869F, 0.1845F, -0.4214F);
        Hair7_r14.cubeList.add(new ModelBox(Hair7_r14, 76, 59, -1.0044F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsjtwo8 = new ModelRenderer(this);
        gokuSsjtwo8.setRotationPoint(-4.0713F, -7.3232F, 1.4767F);
        gokuSsjtwo.addChild(gokuSsjtwo8);
        setRotationAngle(gokuSsjtwo8, -0.1122F, 1.304F, -0.4749F);


        Hair8_r7 = new ModelRenderer(this);
        Hair8_r7.setRotationPoint(-0.6854F, -1.718F, 0.2569F);
        gokuSsjtwo8.addChild(Hair8_r7);
        setRotationAngle(Hair8_r7, -0.5661F, 0.1845F, -0.4214F);
        Hair8_r7.cubeList.add(new ModelBox(Hair8_r7, 65, 52, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair8_r8 = new ModelRenderer(this);
        Hair8_r8.setRotationPoint(-0.248F, -0.7009F, -0.0004F);
        gokuSsjtwo8.addChild(Hair8_r8);
        setRotationAngle(Hair8_r8, -0.1123F, 0.1845F, -0.4214F);
        Hair8_r8.cubeList.add(new ModelBox(Hair8_r8, 65, 52, -1.0044F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair8_r9 = new ModelRenderer(this);
        Hair8_r9.setRotationPoint(0.0579F, 0.2385F, -0.0871F);
        gokuSsjtwo8.addChild(Hair8_r9);
        setRotationAngle(Hair8_r9, -0.027F, 0.1901F, -0.404F);


        gokuSsjtwo9 = new ModelRenderer(this);
        gokuSsjtwo9.setRotationPoint(-3.2324F, -5.5365F, -0.5666F);
        gokuSsjtwo.addChild(gokuSsjtwo9);
        setRotationAngle(gokuSsjtwo9, 0.8796F, 1.3512F, 0.1215F);


        Hair9_r5 = new ModelRenderer(this);
        Hair9_r5.setRotationPoint(-0.6206F, -2.1349F, 0.2548F);
        gokuSsjtwo9.addChild(Hair9_r5);
        setRotationAngle(Hair9_r5, -0.4439F, 0.1845F, -0.4214F);
        Hair9_r5.cubeList.add(new ModelBox(Hair9_r5, 71, 51, -1.0044F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair9_r6 = new ModelRenderer(this);
        Hair9_r6.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo9.addChild(Hair9_r6);
        setRotationAngle(Hair9_r6, -0.027F, 0.1901F, -0.404F);
        Hair9_r6.cubeList.add(new ModelBox(Hair9_r6, 71, 51, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo10 = new ModelRenderer(this);
        gokuSsjtwo10.setRotationPoint(-3.3324F, -4.2365F, 0.9334F);
        gokuSsjtwo.addChild(gokuSsjtwo10);
        setRotationAngle(gokuSsjtwo10, 0.932F, 1.3512F, 0.1215F);


        Hair10_r21 = new ModelRenderer(this);
        Hair10_r21.setRotationPoint(-0.6206F, -1.9349F, 0.2548F);
        gokuSsjtwo10.addChild(Hair10_r21);
        setRotationAngle(Hair10_r21, -0.601F, 0.1845F, -0.4214F);
        Hair10_r21.cubeList.add(new ModelBox(Hair10_r21, 65, 49, -0.947F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair10_r22 = new ModelRenderer(this);
        Hair10_r22.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo10.addChild(Hair10_r22);
        setRotationAngle(Hair10_r22, -0.027F, 0.1901F, -0.404F);
        Hair10_r22.cubeList.add(new ModelBox(Hair10_r22, 65, 49, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo11 = new ModelRenderer(this);
        gokuSsjtwo11.setRotationPoint(-3.3324F, -5.7365F, 2.5334F);
        gokuSsjtwo.addChild(gokuSsjtwo11);
        setRotationAngle(gokuSsjtwo11, 0.6514F, 1.2522F, -0.1591F);


        Hair11_r5 = new ModelRenderer(this);
        Hair11_r5.setRotationPoint(-0.6206F, -1.9349F, 0.2548F);
        gokuSsjtwo11.addChild(Hair11_r5);
        setRotationAngle(Hair11_r5, -0.601F, 0.1845F, -0.4214F);
        Hair11_r5.cubeList.add(new ModelBox(Hair11_r5, 73, 49, -0.947F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair11_r6 = new ModelRenderer(this);
        Hair11_r6.setRotationPoint(-0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo11.addChild(Hair11_r6);
        setRotationAngle(Hair11_r6, -0.027F, 0.1901F, -0.404F);
        Hair11_r6.cubeList.add(new ModelBox(Hair11_r6, 73, 49, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo12 = new ModelRenderer(this);
        gokuSsjtwo12.setRotationPoint(-3.4324F, -4.0365F, 2.6334F);
        gokuSsjtwo.addChild(gokuSsjtwo12);
        setRotationAngle(gokuSsjtwo12, -0.542F, 0.7709F, -0.9898F);


        Hair12_r3 = new ModelRenderer(this);
        Hair12_r3.setRotationPoint(-0.6206F, -1.9349F, 0.1548F);
        gokuSsjtwo12.addChild(Hair12_r3);
        setRotationAngle(Hair12_r3, -0.4136F, 0.213F, -0.3564F);
        Hair12_r3.cubeList.add(new ModelBox(Hair12_r3, 66, 54, -0.947F, -2.0F, -0.9082F, 2, 2, 2, -0.05F));

        Hair12_r4 = new ModelRenderer(this);
        Hair12_r4.setRotationPoint(-0.1147F, -0.9955F, 0.2681F);
        gokuSsjtwo12.addChild(Hair12_r4);
        setRotationAngle(Hair12_r4, -0.027F, 0.1901F, -0.404F);
        Hair12_r4.cubeList.add(new ModelBox(Hair12_r4, 66, 54, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsjtwo13 = new ModelRenderer(this);
        gokuSsjtwo13.setRotationPoint(-2.6669F, -3.2669F, 3.3604F);
        gokuSsjtwo.addChild(gokuSsjtwo13);
        setRotationAngle(gokuSsjtwo13, -2.2098F, 0.3848F, 2.9592F);
        gokuSsjtwo13.cubeList.add(new ModelBox(gokuSsjtwo13, 65, 57, -1.0842F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r23 = new ModelRenderer(this);
        Hair10_r23.setRotationPoint(-0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo13.addChild(Hair10_r23);
        setRotationAngle(Hair10_r23, -0.601F, 0.0F, 0.0F);
        Hair10_r23.cubeList.add(new ModelBox(Hair10_r23, 65, 57, -0.897F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        gokuSsjtwo14 = new ModelRenderer(this);
        gokuSsjtwo14.setRotationPoint(-0.7F, -8.0F, -3.4F);
        gokuSsjtwo.addChild(gokuSsjtwo14);
        setRotationAngle(gokuSsjtwo14, -1.1045F, 0.5025F, 0.3626F);
        gokuSsjtwo14.cubeList.add(new ModelBox(gokuSsjtwo14, 65, 56, -0.8913F, -0.5317F, -0.9572F, 2, 3, 2, 0.0F));

        Strand1_r3 = new ModelRenderer(this);
        Strand1_r3.setRotationPoint(0.1087F, 0.6683F, -0.8572F);
        gokuSsjtwo14.addChild(Strand1_r3);
        setRotationAngle(Strand1_r3, 0.6283F, 0.0F, 0.0F);
        Strand1_r3.cubeList.add(new ModelBox(Strand1_r3, 65, 56, -1.0F, 1.2F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsjtwo15 = new ModelRenderer(this);
        gokuSsjtwo15.setRotationPoint(3.4024F, -7.3384F, -4.0017F);
        gokuSsjtwo.addChild(gokuSsjtwo15);
        setRotationAngle(gokuSsjtwo15, -0.7009F, -0.0802F, -0.3688F);
        gokuSsjtwo15.cubeList.add(new ModelBox(gokuSsjtwo15, 65, 59, -1.0F, -1.75F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsjtwo16 = new ModelRenderer(this);
        gokuSsjtwo16.setRotationPoint(-2.6163F, -7.5498F, -3.8265F);
        gokuSsjtwo.addChild(gokuSsjtwo16);
        setRotationAngle(gokuSsjtwo16, -0.4651F, 0.2457F, 0.3449F);


        Strand4_r4 = new ModelRenderer(this);
        Strand4_r4.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
        gokuSsjtwo16.addChild(Strand4_r4);
        setRotationAngle(Strand4_r4, 0.3046F, -0.3684F, 0.2431F);
        Strand4_r4.cubeList.add(new ModelBox(Strand4_r4, 65, 53, -0.5926F, -2.4717F, -0.8594F, 2, 3, 2, 0.0F));

        Strand4_r5 = new ModelRenderer(this);
        Strand4_r5.setRotationPoint(-1.5142F, 1.4614F, 0.7725F);
        gokuSsjtwo16.addChild(Strand4_r5);
        setRotationAngle(Strand4_r5, 0.0F, 0.0F, 0.192F);
        Strand4_r5.cubeList.add(new ModelBox(Strand4_r5, 65, 53, 0.3104F, -2.6512F, -2.0F, 2, 3, 2, 0.0F));

        gokuSsjtwo17 = new ModelRenderer(this);
        gokuSsjtwo17.setRotationPoint(3.1324F, -6.5865F, -1.3666F);
        gokuSsjtwo.addChild(gokuSsjtwo17);
        setRotationAngle(gokuSsjtwo17, 0.6178F, -1.3512F, -0.1215F);


        Hair4_r7 = new ModelRenderer(this);
        Hair4_r7.setRotationPoint(0.6206F, -2.1349F, 0.2548F);
        gokuSsjtwo17.addChild(Hair4_r7);
        setRotationAngle(Hair4_r7, -0.3218F, -0.1845F, 0.4214F);
        Hair4_r7.cubeList.add(new ModelBox(Hair4_r7, 78, 52, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair4_r8 = new ModelRenderer(this);
        Hair4_r8.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo17.addChild(Hair4_r8);
        setRotationAngle(Hair4_r8, -0.027F, -0.1901F, 0.404F);
        Hair4_r8.cubeList.add(new ModelBox(Hair4_r8, 78, 52, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo18 = new ModelRenderer(this);
        gokuSsjtwo18.setRotationPoint(3.5713F, -8.8232F, 0.7767F);
        gokuSsjtwo.addChild(gokuSsjtwo18);
        setRotationAngle(gokuSsjtwo18, 0.7129F, -1.2204F, -0.5465F);


        Hair6_r10 = new ModelRenderer(this);
        Hair6_r10.setRotationPoint(0.4854F, -1.518F, 0.4569F);
        gokuSsjtwo18.addChild(Hair6_r10);
        setRotationAngle(Hair6_r10, -0.7057F, -0.1845F, 0.4214F);
        Hair6_r10.cubeList.add(new ModelBox(Hair6_r10, 69, 54, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair6_r11 = new ModelRenderer(this);
        Hair6_r11.setRotationPoint(0.248F, -0.7009F, 0.0996F);
        gokuSsjtwo18.addChild(Hair6_r11);
        setRotationAngle(Hair6_r11, -0.2869F, -0.1845F, 0.4214F);
        Hair6_r11.cubeList.add(new ModelBox(Hair6_r11, 69, 54, -0.9956F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair6_r12 = new ModelRenderer(this);
        Hair6_r12.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
        gokuSsjtwo18.addChild(Hair6_r12);
        setRotationAngle(Hair6_r12, -0.027F, -0.1901F, 0.404F);


        gokuSsjtwo19 = new ModelRenderer(this);
        gokuSsjtwo19.setRotationPoint(4.0713F, -7.3232F, 1.4767F);
        gokuSsjtwo.addChild(gokuSsjtwo19);
        setRotationAngle(gokuSsjtwo19, -0.1122F, -1.304F, 0.4749F);


        Hair8_r10 = new ModelRenderer(this);
        Hair8_r10.setRotationPoint(0.6854F, -1.718F, 0.2569F);
        gokuSsjtwo19.addChild(Hair8_r10);
        setRotationAngle(Hair8_r10, -0.5661F, -0.1845F, 0.4214F);
        Hair8_r10.cubeList.add(new ModelBox(Hair8_r10, 75, 57, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair8_r11 = new ModelRenderer(this);
        Hair8_r11.setRotationPoint(0.248F, -0.7009F, -0.0004F);
        gokuSsjtwo19.addChild(Hair8_r11);
        setRotationAngle(Hair8_r11, -0.1123F, -0.1845F, 0.4214F);
        Hair8_r11.cubeList.add(new ModelBox(Hair8_r11, 75, 57, -0.9956F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        Hair8_r12 = new ModelRenderer(this);
        Hair8_r12.setRotationPoint(-0.0579F, 0.2385F, -0.0871F);
        gokuSsjtwo19.addChild(Hair8_r12);
        setRotationAngle(Hair8_r12, -0.027F, -0.1901F, 0.404F);


        gokuSsjtwo20 = new ModelRenderer(this);
        gokuSsjtwo20.setRotationPoint(3.2324F, -5.5365F, -0.5666F);
        gokuSsjtwo.addChild(gokuSsjtwo20);
        setRotationAngle(gokuSsjtwo20, 0.8796F, -1.3512F, -0.1215F);


        Hair9_r7 = new ModelRenderer(this);
        Hair9_r7.setRotationPoint(0.6206F, -2.1349F, 0.2548F);
        gokuSsjtwo20.addChild(Hair9_r7);
        setRotationAngle(Hair9_r7, -0.4439F, -0.1845F, 0.4214F);
        Hair9_r7.cubeList.add(new ModelBox(Hair9_r7, 71, 58, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair9_r8 = new ModelRenderer(this);
        Hair9_r8.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo20.addChild(Hair9_r8);
        setRotationAngle(Hair9_r8, -0.027F, -0.1901F, 0.404F);
        Hair9_r8.cubeList.add(new ModelBox(Hair9_r8, 71, 58, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo21 = new ModelRenderer(this);
        gokuSsjtwo21.setRotationPoint(3.3324F, -4.2365F, 0.9334F);
        gokuSsjtwo.addChild(gokuSsjtwo21);
        setRotationAngle(gokuSsjtwo21, 0.932F, -1.3512F, -0.1215F);


        Hair10_r24 = new ModelRenderer(this);
        Hair10_r24.setRotationPoint(0.6206F, -1.9349F, 0.2548F);
        gokuSsjtwo21.addChild(Hair10_r24);
        setRotationAngle(Hair10_r24, -0.601F, -0.1845F, 0.4214F);
        Hair10_r24.cubeList.add(new ModelBox(Hair10_r24, 68, 60, -1.053F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair10_r25 = new ModelRenderer(this);
        Hair10_r25.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo21.addChild(Hair10_r25);
        setRotationAngle(Hair10_r25, -0.027F, -0.1901F, 0.404F);
        Hair10_r25.cubeList.add(new ModelBox(Hair10_r25, 68, 60, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo22 = new ModelRenderer(this);
        gokuSsjtwo22.setRotationPoint(3.3324F, -5.7365F, 2.5334F);
        gokuSsjtwo.addChild(gokuSsjtwo22);
        setRotationAngle(gokuSsjtwo22, 0.6514F, -1.2522F, 0.1591F);


        Hair11_r7 = new ModelRenderer(this);
        Hair11_r7.setRotationPoint(0.6206F, -1.9349F, 0.2548F);
        gokuSsjtwo22.addChild(Hair11_r7);
        setRotationAngle(Hair11_r7, -0.601F, -0.1845F, 0.4214F);
        Hair11_r7.cubeList.add(new ModelBox(Hair11_r7, 79, 60, -1.053F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        Hair11_r8 = new ModelRenderer(this);
        Hair11_r8.setRotationPoint(0.3147F, -1.1955F, -0.0319F);
        gokuSsjtwo22.addChild(Hair11_r8);
        setRotationAngle(Hair11_r8, -0.027F, -0.1901F, 0.404F);
        Hair11_r8.cubeList.add(new ModelBox(Hair11_r8, 79, 60, -1.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F));

        gokuSsjtwo23 = new ModelRenderer(this);
        gokuSsjtwo23.setRotationPoint(-2.1324F, -8.7865F, 0.0834F);
        gokuSsjtwo.addChild(gokuSsjtwo23);
        setRotationAngle(gokuSsjtwo23, -0.2792F, -0.0018F, -0.0175F);


        Hair20_r9 = new ModelRenderer(this);
        Hair20_r9.setRotationPoint(0.0014F, -3.2509F, -0.0452F);
        gokuSsjtwo23.addChild(Hair20_r9);
        setRotationAngle(Hair20_r9, 0.0F, 0.0F, 0.2618F);
        Hair20_r9.cubeList.add(new ModelBox(Hair20_r9, 79, 59, -1.1736F, -1.9848F, -1.0F, 2, 2, 2, -0.08F));

        Hair20_r10 = new ModelRenderer(this);
        Hair20_r10.setRotationPoint(-0.2206F, -2.5349F, -0.0452F);
        gokuSsjtwo23.addChild(Hair20_r10);
        setRotationAngle(Hair20_r10, 0.0F, 0.0F, 0.1396F);
        Hair20_r10.cubeList.add(new ModelBox(Hair20_r10, 79, 59, -1.0044F, -1.0F, -1.0F, 2, 4, 2, -0.02F));

        gokuSsjtwo24 = new ModelRenderer(this);
        gokuSsjtwo24.setRotationPoint(-0.3324F, -7.3865F, -0.8166F);
        gokuSsjtwo.addChild(gokuSsjtwo24);
        setRotationAngle(gokuSsjtwo24, -0.3142F, 0.0F, 0.0F);


        Hair20_r11 = new ModelRenderer(this);
        Hair20_r11.setRotationPoint(0.1794F, -5.3349F, -0.0452F);
        gokuSsjtwo24.addChild(Hair20_r11);
        setRotationAngle(Hair20_r11, 0.0F, 0.0F, 0.1745F);
        Hair20_r11.cubeList.add(new ModelBox(Hair20_r11, 79, 56, -1.0044F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsjtwo25 = new ModelRenderer(this);
        gokuSsjtwo25.setRotationPoint(1.8324F, -7.8865F, -0.8166F);
        gokuSsjtwo.addChild(gokuSsjtwo25);
        setRotationAngle(gokuSsjtwo25, -0.3491F, 0.0F, 0.0F);


        Hair20_r13 = new ModelRenderer(this);
        Hair20_r13.setRotationPoint(-0.1794F, -5.3349F, -0.0452F);
        gokuSsjtwo25.addChild(Hair20_r13);
        setRotationAngle(Hair20_r13, 0.0F, 0.0F, -0.1745F);
        Hair20_r13.cubeList.add(new ModelBox(Hair20_r13, 79, 53, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsjtwo26 = new ModelRenderer(this);
        gokuSsjtwo26.setRotationPoint(2.4324F, -8.2865F, 0.0834F);
        gokuSsjtwo.addChild(gokuSsjtwo26);
        setRotationAngle(gokuSsjtwo26, -0.2442F, 0.0067F, 0.0343F);


        Hair20_r15 = new ModelRenderer(this);
        Hair20_r15.setRotationPoint(-0.3794F, -5.0349F, -0.0452F);
        gokuSsjtwo26.addChild(Hair20_r15);
        setRotationAngle(Hair20_r15, 0.0F, 0.0F, -0.5061F);
        Hair20_r15.cubeList.add(new ModelBox(Hair20_r15, 79, 50, -0.9956F, -1.0F, -1.0F, 2, 2, 2, -0.05F));

        Hair20_r16 = new ModelRenderer(this);
        Hair20_r16.setRotationPoint(0.2206F, -2.5349F, -0.0452F);
        gokuSsjtwo26.addChild(Hair20_r16);
        setRotationAngle(Hair20_r16, 0.0F, 0.0F, -0.1396F);
        Hair20_r16.cubeList.add(new ModelBox(Hair20_r16, 79, 50, -0.9956F, -2.0F, -1.0F, 2, 4, 2, -0.02F));

        gokuSsjtwo27 = new ModelRenderer(this);
        gokuSsjtwo27.setRotationPoint(2.9713F, -9.1232F, 1.9767F);
        gokuSsjtwo.addChild(gokuSsjtwo27);
        setRotationAngle(gokuSsjtwo27, 0.8176F, -1.2204F, -0.5465F);


        Hair7_r16 = new ModelRenderer(this);
        Hair7_r16.setRotationPoint(0.6854F, -1.618F, 0.5569F);
        gokuSsjtwo27.addChild(Hair7_r16);
        setRotationAngle(Hair7_r16, -0.7057F, -0.1845F, 0.4214F);
        Hair7_r16.cubeList.add(new ModelBox(Hair7_r16, 79, 49, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.2F));

        Hair7_r17 = new ModelRenderer(this);
        Hair7_r17.setRotationPoint(0.248F, -0.7009F, 0.0996F);
        gokuSsjtwo27.addChild(Hair7_r17);
        setRotationAngle(Hair7_r17, -0.2869F, -0.1845F, 0.4214F);
        Hair7_r17.cubeList.add(new ModelBox(Hair7_r17, 79, 49, -0.9956F, -1.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsjtwo28 = new ModelRenderer(this);
        gokuSsjtwo28.setRotationPoint(2.2713F, -9.2232F, 3.1767F);
        gokuSsjtwo.addChild(gokuSsjtwo28);


        Hair7_r19 = new ModelRenderer(this);
        Hair7_r19.setRotationPoint(-0.0519F, -0.7009F, -0.2004F);
        gokuSsjtwo28.addChild(Hair7_r19);
        setRotationAngle(Hair7_r19, 0.3142F, 0.0F, 0.0F);
        Hair7_r19.cubeList.add(new ModelBox(Hair7_r19, 77, 49, -0.9994F, -3.6171F, -0.9963F, 2, 4, 2, -0.1F));

        gokuSsjtwo29 = new ModelRenderer(this);
        gokuSsjtwo29.setRotationPoint(0.6713F, -9.7232F, 2.7767F);
        gokuSsjtwo.addChild(gokuSsjtwo29);
        setRotationAngle(gokuSsjtwo29, -0.0348F, -0.003F, -0.0872F);


        Hair7_r21 = new ModelRenderer(this);
        Hair7_r21.setRotationPoint(-0.0519F, -0.7009F, -0.2004F);
        gokuSsjtwo29.addChild(Hair7_r21);
        setRotationAngle(Hair7_r21, 0.2094F, 0.0F, 0.0F);
        Hair7_r21.cubeList.add(new ModelBox(Hair7_r21, 69, 49, -0.9994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

        Hair7_r22 = new ModelRenderer(this);
        Hair7_r22.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
        gokuSsjtwo29.addChild(Hair7_r22);
        setRotationAngle(Hair7_r22, 0.192F, 0.0F, 0.0F);
        Hair7_r22.cubeList.add(new ModelBox(Hair7_r22, 69, 49, -0.9956F, -2.0F, -1.0F, 2, 3, 2, -0.05F));

        gokuSsjtwo30 = new ModelRenderer(this);
        gokuSsjtwo30.setRotationPoint(-1.6287F, -9.3232F, 3.1767F);
        gokuSsjtwo.addChild(gokuSsjtwo30);
        setRotationAngle(gokuSsjtwo30, 0.1572F, -0.003F, -0.0872F);


        Hair7_r23 = new ModelRenderer(this);
        Hair7_r23.setRotationPoint(-0.0519F, -0.5009F, -0.2004F);
        gokuSsjtwo30.addChild(Hair7_r23);
        setRotationAngle(Hair7_r23, 0.2094F, 0.0F, 0.0F);
        Hair7_r23.cubeList.add(new ModelBox(Hair7_r23, 65, 49, -0.6994F, -3.6171F, -0.9963F, 2, 2, 2, -0.1F));

        Hair7_r24 = new ModelRenderer(this);
        Hair7_r24.setRotationPoint(-0.052F, -0.7009F, -0.2004F);
        gokuSsjtwo30.addChild(Hair7_r24);
        setRotationAngle(Hair7_r24, 0.192F, 0.0F, 0.0F);
        Hair7_r24.cubeList.add(new ModelBox(Hair7_r24, 65, 49, -0.9956F, -2.0F, -1.0F, 3, 3, 2, -0.05F));

        gokuSsjtwo31 = new ModelRenderer(this);
        gokuSsjtwo31.setRotationPoint(-3.3669F, -4.9669F, 3.4604F);
        gokuSsjtwo.addChild(gokuSsjtwo31);
        setRotationAngle(gokuSsjtwo31, -2.5932F, 0.4958F, -2.9726F);


        Hair10_r26 = new ModelRenderer(this);
        Hair10_r26.setRotationPoint(-0.1901F, -2.866F, 0.2181F);
        gokuSsjtwo31.addChild(Hair10_r26);
        setRotationAngle(Hair10_r26, -0.9152F, 0.0F, 0.0F);
        Hair10_r26.cubeList.add(new ModelBox(Hair10_r26, 65, 50, -0.897F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r27 = new ModelRenderer(this);
        Hair10_r27.setRotationPoint(-0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo31.addChild(Hair10_r27);
        setRotationAngle(Hair10_r27, -0.601F, 0.0F, 0.0F);
        Hair10_r27.cubeList.add(new ModelBox(Hair10_r27, 65, 50, -0.897F, -2.0F, -0.9332F, 2, 4, 2, -0.05F));

        gokuSsjtwo32 = new ModelRenderer(this);
        gokuSsjtwo32.setRotationPoint(-2.1669F, -5.2669F, 3.4604F);
        gokuSsjtwo.addChild(gokuSsjtwo32);
        setRotationAngle(gokuSsjtwo32, -2.5144F, 0.626F, -2.6924F);


        Hair10_r28 = new ModelRenderer(this);
        Hair10_r28.setRotationPoint(-0.1901F, -2.866F, 0.2181F);
        gokuSsjtwo32.addChild(Hair10_r28);
        setRotationAngle(Hair10_r28, -0.9152F, 0.0F, 0.0F);
        Hair10_r28.cubeList.add(new ModelBox(Hair10_r28, 65, 53, -0.897F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r29 = new ModelRenderer(this);
        Hair10_r29.setRotationPoint(-0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo32.addChild(Hair10_r29);
        setRotationAngle(Hair10_r29, -0.601F, 0.0F, 0.0F);
        Hair10_r29.cubeList.add(new ModelBox(Hair10_r29, 65, 53, -0.897F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsjtwo33 = new ModelRenderer(this);
        gokuSsjtwo33.setRotationPoint(3.3669F, -4.2669F, 3.4604F);
        gokuSsjtwo.addChild(gokuSsjtwo33);
        setRotationAngle(gokuSsjtwo33, -2.5932F, -0.4958F, 2.9726F);
        gokuSsjtwo33.cubeList.add(new ModelBox(gokuSsjtwo33, 73, 49, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r30 = new ModelRenderer(this);
        Hair10_r30.setRotationPoint(0.1901F, -2.866F, 0.2181F);
        gokuSsjtwo33.addChild(Hair10_r30);
        setRotationAngle(Hair10_r30, -0.9152F, 0.0F, 0.0F);
        Hair10_r30.cubeList.add(new ModelBox(Hair10_r30, 73, 49, -1.103F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r31 = new ModelRenderer(this);
        Hair10_r31.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo33.addChild(Hair10_r31);
        setRotationAngle(Hair10_r31, -0.601F, 0.0F, 0.0F);
        Hair10_r31.cubeList.add(new ModelBox(Hair10_r31, 73, 49, -1.103F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsjtwo34 = new ModelRenderer(this);
        gokuSsjtwo34.setRotationPoint(1.2669F, -5.1669F, 3.4604F);
        gokuSsjtwo.addChild(gokuSsjtwo34);
        setRotationAngle(gokuSsjtwo34, -2.6896F, -0.3868F, -3.0479F);


        Hair10_r32 = new ModelRenderer(this);
        Hair10_r32.setRotationPoint(0.1901F, -2.866F, 0.2181F);
        gokuSsjtwo34.addChild(Hair10_r32);
        setRotationAngle(Hair10_r32, -0.9152F, 0.0F, 0.0F);
        Hair10_r32.cubeList.add(new ModelBox(Hair10_r32, 73, 51, -1.103F, -4.0F, -0.9332F, 2, 3, 2, -0.09F));

        Hair10_r33 = new ModelRenderer(this);
        Hair10_r33.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo34.addChild(Hair10_r33);
        setRotationAngle(Hair10_r33, -0.601F, 0.0F, 0.0F);


        gokuSsjtwo35 = new ModelRenderer(this);
        gokuSsjtwo35.setRotationPoint(2.8669F, -3.5669F, 3.9604F);
        gokuSsjtwo.addChild(gokuSsjtwo35);
        setRotationAngle(gokuSsjtwo35, -2.2846F, 0.0246F, -3.0184F);
        gokuSsjtwo35.cubeList.add(new ModelBox(gokuSsjtwo35, 73, 54, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r34 = new ModelRenderer(this);
        Hair10_r34.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo35.addChild(Hair10_r34);
        setRotationAngle(Hair10_r34, -0.601F, 0.0F, 0.0F);
        Hair10_r34.cubeList.add(new ModelBox(Hair10_r34, 73, 54, -1.103F, -1.0F, -0.9332F, 2, 2, 2, -0.05F));

        gokuSsjtwo36 = new ModelRenderer(this);
        gokuSsjtwo36.setRotationPoint(0.9669F, -3.6669F, 3.6604F);
        gokuSsjtwo.addChild(gokuSsjtwo36);
        setRotationAngle(gokuSsjtwo36, -2.332F, 0.0034F, -3.1242F);
        gokuSsjtwo36.cubeList.add(new ModelBox(gokuSsjtwo36, 76, 53, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r35 = new ModelRenderer(this);
        Hair10_r35.setRotationPoint(0.1901F, -2.866F, 0.2181F);
        gokuSsjtwo36.addChild(Hair10_r35);
        setRotationAngle(Hair10_r35, -0.9152F, 0.0F, 0.0F);
        Hair10_r35.cubeList.add(new ModelBox(Hair10_r35, 73, 57, -1.103F, -4.0F, -0.9332F, 2, 2, 2, -0.09F));

        Hair10_r36 = new ModelRenderer(this);
        Hair10_r36.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo36.addChild(Hair10_r36);
        setRotationAngle(Hair10_r36, -0.601F, 0.0F, 0.0F);
        Hair10_r36.cubeList.add(new ModelBox(Hair10_r36, 76, 53, -1.103F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsjtwo37 = new ModelRenderer(this);
        gokuSsjtwo37.setRotationPoint(-0.9331F, -3.3669F, 3.6604F);
        gokuSsjtwo.addChild(gokuSsjtwo37);
        setRotationAngle(gokuSsjtwo37, -2.2836F, 0.096F, 3.0792F);
        gokuSsjtwo37.cubeList.add(new ModelBox(gokuSsjtwo37, 73, 59, -0.9158F, -2.7266F, -0.2686F, 2, 3, 2, 0.0F));

        Hair10_r37 = new ModelRenderer(this);
        Hair10_r37.setRotationPoint(0.1901F, -2.966F, 1.0181F);
        gokuSsjtwo37.addChild(Hair10_r37);
        setRotationAngle(Hair10_r37, -0.601F, 0.0F, 0.0F);
        Hair10_r37.cubeList.add(new ModelBox(Hair10_r37, 73, 59, -1.103F, -2.0F, -0.9332F, 2, 3, 2, -0.05F));

        gokuSsjtwo38 = new ModelRenderer(this);
        gokuSsjtwo38.setRotationPoint(3.2163F, -7.9499F, -2.2265F);
        gokuSsjtwo.addChild(gokuSsjtwo38);
        setRotationAngle(gokuSsjtwo38, -0.4651F, -0.2457F, -0.3449F);


        Strand4_r6 = new ModelRenderer(this);
        Strand4_r6.setRotationPoint(1.5142F, 1.4614F, 0.7725F);
        gokuSsjtwo38.addChild(Strand4_r6);
        setRotationAngle(Strand4_r6, 0.0F, 0.0F, -0.192F);
        Strand4_r6.cubeList.add(new ModelBox(Strand4_r6, 65, 59, -2.3104F, -2.6512F, -2.0F, 2, 3, 2, 0.0F));

        gokuSsjtwo39 = new ModelRenderer(this);
        gokuSsjtwo39.setRotationPoint(0.5F, -8.0F, -3.2F);
        gokuSsjtwo.addChild(gokuSsjtwo39);
        setRotationAngle(gokuSsjtwo39, 0.1263F, 0.1258F, -3.0516F);
        gokuSsjtwo39.cubeList.add(new ModelBox(gokuSsjtwo39, 71, 55, -1.1087F, -0.5317F, -0.9572F, 2, 3, 2, 0.0F));

        Strand1_r4 = new ModelRenderer(this);
        Strand1_r4.setRotationPoint(-0.1087F, 0.8683F, -0.9572F);
        gokuSsjtwo39.addChild(Strand1_r4);
        setRotationAngle(Strand1_r4, 0.6807F, 0.0F, 0.0F);
        Strand1_r4.cubeList.add(new ModelBox(Strand1_r4, 71, 55, -0.9998F, 1.2F, -1.0F, 2, 3, 2, 0.0F));

        gokuSsjThree = new ModelRenderer(this);
        gokuSsjThree.setRotationPoint(2.0F, -9.3F, -3.3F);
        bipedHead.addChild(gokuSsjThree);


        gokuSsjThree1 = new ModelRenderer(this);
        gokuSsjThree1.setRotationPoint(-4.0F, 7.4669F, 12.0102F);
        gokuSsjThree.addChild(gokuSsjThree1);
        setRotationAngle(gokuSsjThree1, -0.9587F, -0.2133F, -0.0902F);


        hair1_r7 = new ModelRenderer(this);
        hair1_r7.setRotationPoint(2.0F, 25.4331F, -9.8102F);
        gokuSsjThree1.addChild(hair1_r7);
        setRotationAngle(hair1_r7, -0.0175F, 0.0175F, -0.0003F);
        hair1_r7.cubeList.add(new ModelBox(hair1_r7, 57, 33, -4.0F, -25.7F, 2.8102F, 4, 3, 12, -0.1F));

        gokuSsjThree2 = new ModelRenderer(this);
        gokuSsjThree2.setRotationPoint(0.0F, 7.6669F, 11.7102F);
        gokuSsjThree.addChild(gokuSsjThree2);
        setRotationAngle(gokuSsjThree2, -0.9214F, 0.5763F, 0.0981F);
        gokuSsjThree2.cubeList.add(new ModelBox(gokuSsjThree2, 57, 33, -2.0F, -0.1669F, -7.0F, 4, 3, 12, -0.1F));

        gokuSsjThree3 = new ModelRenderer(this);
        gokuSsjThree3.setRotationPoint(0.0F, 0.0F, 0.0F);
        gokuSsjThree.addChild(gokuSsjThree3);
        setRotationAngle(gokuSsjThree3, -0.4887F, 0.0F, 0.0F);
        gokuSsjThree3.cubeList.add(new ModelBox(gokuSsjThree3, 70, 39, -4.0F, -1.0F, 10.0F, 4, 2, 5, -0.1F));

        gokuSsjThree4 = new ModelRenderer(this);
        gokuSsjThree4.setRotationPoint(-2.0F, 0.9F, 10.6F);
        gokuSsjThree.addChild(gokuSsjThree4);
        setRotationAngle(gokuSsjThree4, -0.9425F, 0.0F, 0.0F);
        gokuSsjThree4.cubeList.add(new ModelBox(gokuSsjThree4, 67, 37, -2.0F, 0.5059F, -3.0957F, 4, 4, 7, -0.1F));

        gokuSsjThree5 = new ModelRenderer(this);
        gokuSsjThree5.setRotationPoint(-1.1036F, 3.5F, 0.0464F);
        gokuSsjThree.addChild(gokuSsjThree5);
        setRotationAngle(gokuSsjThree5, 0.8611F, -0.7635F, -0.4375F);


        hair5_r1 = new ModelRenderer(this);
        hair5_r1.setRotationPoint(0.6036F, -1.205F, 0.6036F);
        gokuSsjThree5.addChild(hair5_r1);
        setRotationAngle(hair5_r1, 0.5542F, 0.24F, -0.1054F);
        hair5_r1.cubeList.add(new ModelBox(hair5_r1, 79, 37, -1.04F, -1.0F, -1.0F, 2, 2, 2, -0.3F));

        hair5_1 = new ModelRenderer(this);
        hair5_1.setRotationPoint(0.3036F, -1.9F, 0.2536F);
        gokuSsjThree5.addChild(hair5_1);
        setRotationAngle(hair5_1, 0.192F, 0.0F, 0.0F);


        hair5_5_r1 = new ModelRenderer(this);
        hair5_5_r1.setRotationPoint(-0.8F, 0.495F, -3.25F);
        hair5_1.addChild(hair5_5_r1);
        setRotationAngle(hair5_5_r1, 2.4391F, 0.24F, -0.1054F);
        hair5_5_r1.cubeList.add(new ModelBox(hair5_5_r1, 79, 37, -0.91F, -1.845F, -1.1F, 2, 3, 2, -0.44F));

        hair5_4_r1 = new ModelRenderer(this);
        hair5_4_r1.setRotationPoint(-0.7F, -0.105F, -2.45F);
        hair5_1.addChild(hair5_4_r1);
        setRotationAngle(hair5_4_r1, 2.0988F, 0.24F, -0.1054F);
        hair5_4_r1.cubeList.add(new ModelBox(hair5_4_r1, 79, 37, -0.87F, -0.967F, -0.988F, 2, 2, 2, -0.42F));

        hair5_3_r1 = new ModelRenderer(this);
        hair5_3_r1.setRotationPoint(-0.5F, -0.405F, -1.45F);
        hair5_1.addChild(hair5_3_r1);
        setRotationAngle(hair5_3_r1, 1.7323F, 0.24F, -0.1054F);
        hair5_3_r1.cubeList.add(new ModelBox(hair5_3_r1, 79, 37, -0.86F, -1.085F, -0.91F, 2, 2, 2, -0.41F));

        hair5_2_r1 = new ModelRenderer(this);
        hair5_2_r1.setRotationPoint(-0.2F, -0.505F, -0.65F);
        hair5_1.addChild(hair5_2_r1);
        setRotationAngle(hair5_2_r1, 1.3309F, 0.24F, -0.1054F);
        hair5_2_r1.cubeList.add(new ModelBox(hair5_2_r1, 79, 37, -0.97F, -1.0F, -1.035F, 2, 2, 2, -0.4F));

        hair5_1_r1 = new ModelRenderer(this);
        hair5_1_r1.setRotationPoint(0.0F, -0.105F, -0.15F);
        hair5_1.addChild(hair5_1_r1);
        setRotationAngle(hair5_1_r1, 0.5542F, 0.24F, -0.1054F);
        hair5_1_r1.cubeList.add(new ModelBox(hair5_1_r1, 79, 37, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.4F));

        gokuSsjThree6 = new ModelRenderer(this);
        gokuSsjThree6.setRotationPoint(-4.6421F, 4.7574F, 3.8009F);
        gokuSsjThree.addChild(gokuSsjThree6);
        setRotationAngle(gokuSsjThree6, -1.1974F, -0.844F, -0.2703F);
        gokuSsjThree6.cubeList.add(new ModelBox(gokuSsjThree6, 76, 38, -1.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

        gokuSsjThree7 = new ModelRenderer(this);
        gokuSsjThree7.setRotationPoint(-4.8748F, 9.3493F, 4.8122F);
        gokuSsjThree.addChild(gokuSsjThree7);
        setRotationAngle(gokuSsjThree7, -2.0007F, -1.0092F, -0.3326F);
        gokuSsjThree7.cubeList.add(new ModelBox(gokuSsjThree7, 76, 39, 0.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        gokuSsjThree8 = new ModelRenderer(this);
        gokuSsjThree8.setRotationPoint(-6.0542F, 5.7674F, 2.9604F);
        gokuSsjThree.addChild(gokuSsjThree8);
        setRotationAngle(gokuSsjThree8, -1.5453F, -0.616F, -0.4275F);
        gokuSsjThree8.cubeList.add(new ModelBox(gokuSsjThree8, 77, 38, 0.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

        gokuSsjThree9 = new ModelRenderer(this);
        gokuSsjThree9.setRotationPoint(-6.1F, 3.3F, 1.7F);
        gokuSsjThree.addChild(gokuSsjThree9);
        setRotationAngle(gokuSsjThree9, -0.8888F, -0.6641F, -0.0678F);
        gokuSsjThree9.cubeList.add(new ModelBox(gokuSsjThree9, 76, 38, 0.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

        gokuSsjThree10 = new ModelRenderer(this);
        gokuSsjThree10.setRotationPoint(-6.4909F, 14.7945F, 12.6914F);
        gokuSsjThree.addChild(gokuSsjThree10);
        setRotationAngle(gokuSsjThree10, -2.8559F, -0.4654F, -0.3194F);
        gokuSsjThree10.cubeList.add(new ModelBox(gokuSsjThree10, 75, 39, 0.0F, -6.0F, 0.0F, 4, 6, 3, -0.15F));

        gokuSsjThree11 = new ModelRenderer(this);
        gokuSsjThree11.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
        gokuSsjThree.addChild(gokuSsjThree11);
        setRotationAngle(gokuSsjThree11, -2.3269F, -0.9898F, -0.4286F);
        gokuSsjThree11.cubeList.add(new ModelBox(gokuSsjThree11, 77, 33, -0.8F, -10.0F, 1.0F, 3, 12, 3, -0.1F));

        gokuSsjThree12 = new ModelRenderer(this);
        gokuSsjThree12.setRotationPoint(-6.9326F, 6.5612F, 7.4193F);
        gokuSsjThree.addChild(gokuSsjThree12);
        setRotationAngle(gokuSsjThree12, -2.4986F, -0.4604F, -0.3381F);
        gokuSsjThree12.cubeList.add(new ModelBox(gokuSsjThree12, 73, 32, 0.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        gokuSsjThree13 = new ModelRenderer(this);
        gokuSsjThree13.setRotationPoint(-6.9326F, 6.5612F, 6.9193F);
        gokuSsjThree.addChild(gokuSsjThree13);
        setRotationAngle(gokuSsjThree13, -2.1931F, -0.4604F, -0.3381F);
        gokuSsjThree13.cubeList.add(new ModelBox(gokuSsjThree13, 75, 39, 0.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        gokuSsjThree14 = new ModelRenderer(this);
        gokuSsjThree14.setRotationPoint(-4.1834F, 1.7815F, 9.8741F);
        gokuSsjThree.addChild(gokuSsjThree14);
        setRotationAngle(gokuSsjThree14, -1.8438F, -0.0747F, -0.5456F);
        gokuSsjThree14.cubeList.add(new ModelBox(gokuSsjThree14, 75, 39, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

        gokuSsjThree15 = new ModelRenderer(this);
        gokuSsjThree15.setRotationPoint(-7.9673F, 2.7138F, 5.9609F);
        gokuSsjThree.addChild(gokuSsjThree15);
        setRotationAngle(gokuSsjThree15, -1.2846F, 0.1617F, -1.1107F);
        gokuSsjThree15.cubeList.add(new ModelBox(gokuSsjThree15, 74, 39, 0.0F, -5.0F, 0.5F, 4, 5, 3, -0.1F));

        gokuSsjThree16 = new ModelRenderer(this);
        gokuSsjThree16.setRotationPoint(-6.1158F, 2.3386F, 3.6304F);
        gokuSsjThree.addChild(gokuSsjThree16);
        setRotationAngle(gokuSsjThree16, -0.7848F, 0.1116F, -0.5843F);
        gokuSsjThree16.cubeList.add(new ModelBox(gokuSsjThree16, 79, 41, 0.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

        gokuSsjThree18 = new ModelRenderer(this);
        gokuSsjThree18.setRotationPoint(-7.3049F, 0.386F, 5.2482F);
        gokuSsjThree.addChild(gokuSsjThree18);
        setRotationAngle(gokuSsjThree18, -0.8358F, 0.3467F, -0.643F);
        gokuSsjThree18.cubeList.add(new ModelBox(gokuSsjThree18, 70, 33, 0.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

        gokuSsjThree17 = new ModelRenderer(this);
        gokuSsjThree17.setRotationPoint(-5.4154F, 0.4016F, 1.2309F);
        gokuSsjThree.addChild(gokuSsjThree17);
        setRotationAngle(gokuSsjThree17, -0.6023F, -0.067F, -0.2533F);
        gokuSsjThree17.cubeList.add(new ModelBox(gokuSsjThree17, 57, 32, 1.4F, -6.0F, 0.1691F, 3, 7, 2, -0.1F));

        gokuSsjThree19 = new ModelRenderer(this);
        gokuSsjThree19.setRotationPoint(-1.6F, 1.0F, -0.6F);
        gokuSsjThree.addChild(gokuSsjThree19);
        setRotationAngle(gokuSsjThree19, -0.2792F, -0.1205F, -0.5114F);
        gokuSsjThree19.cubeList.add(new ModelBox(gokuSsjThree19, 77, 41, -3.2744F, -3.0523F, 0.1913F, 3, 3, 2, -0.1F));

        hair19_3_r1 = new ModelRenderer(this);
        hair19_3_r1.setRotationPoint(-1.4F, -3.8F, 0.2F);
        gokuSsjThree19.addChild(hair19_3_r1);
        setRotationAngle(hair19_3_r1, -0.1571F, 0.0F, 0.4363F);
        hair19_3_r1.cubeList.add(new ModelBox(hair19_3_r1, 68, 32, -1.9939F, -3.0579F, 0.1913F, 3, 3, 2, -0.5F));

        hair19_2_r1 = new ModelRenderer(this);
        hair19_2_r1.setRotationPoint(-2.4F, -2.4F, 1.0F);
        gokuSsjThree19.addChild(hair19_2_r1);
        setRotationAngle(hair19_2_r1, -0.1222F, 0.0F, 0.192F);
        hair19_2_r1.cubeList.add(new ModelBox(hair19_2_r1, 79, 32, -0.9939F, -3.0579F, -0.8087F, 3, 3, 2, -0.35F));

        gokuSsjThree20 = new ModelRenderer(this);
        gokuSsjThree20.setRotationPoint(0.6421F, 4.9574F, 3.3009F);
        gokuSsjThree.addChild(gokuSsjThree20);
        setRotationAngle(gokuSsjThree20, -1.2253F, 0.7601F, 0.2358F);
        gokuSsjThree20.cubeList.add(new ModelBox(gokuSsjThree20, 76, 38, -2.0F, -6.0F, -4.0F, 3, 6, 3, -0.1F));

        gokuSsjThree21 = new ModelRenderer(this);
        gokuSsjThree21.setRotationPoint(0.8748F, 9.3493F, 4.8122F);
        gokuSsjThree.addChild(gokuSsjThree21);
        setRotationAngle(gokuSsjThree21, -2.0007F, 1.0092F, 0.3326F);
        gokuSsjThree21.cubeList.add(new ModelBox(gokuSsjThree21, 76, 39, -3.0F, -5.0F, -3.0F, 3, 6, 3, -0.1F));

        gokuSsjThree22 = new ModelRenderer(this);
        gokuSsjThree22.setRotationPoint(2.0542F, 5.7674F, 2.9604F);
        gokuSsjThree.addChild(gokuSsjThree22);
        setRotationAngle(gokuSsjThree22, -1.5453F, 0.616F, 0.4275F);
        gokuSsjThree22.cubeList.add(new ModelBox(gokuSsjThree22, 77, 38, -2.1028F, -5.0477F, -2.0273F, 2, 7, 3, -0.1F));

        gokuSsjThree23 = new ModelRenderer(this);
        gokuSsjThree23.setRotationPoint(2.1F, 3.3F, 1.7F);
        gokuSsjThree.addChild(gokuSsjThree23);
        setRotationAngle(gokuSsjThree23, -0.8888F, 0.6641F, 0.0678F);
        gokuSsjThree23.cubeList.add(new ModelBox(gokuSsjThree23, 76, 38, -2.5F, -5.0F, -3.0F, 2, 6, 3, -0.1F));

        gokuSsjThree24 = new ModelRenderer(this);
        gokuSsjThree24.setRotationPoint(2.7909F, 14.9945F, 12.7914F);
        gokuSsjThree.addChild(gokuSsjThree24);
        setRotationAngle(gokuSsjThree24, -2.8476F, 0.4604F, 0.3381F);
        gokuSsjThree24.cubeList.add(new ModelBox(gokuSsjThree24, 75, 38, -4.0F, -6.8F, 0.0F, 4, 7, 3, -0.18F));

        gokuSsjThree25 = new ModelRenderer(this);
        gokuSsjThree25.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
        gokuSsjThree.addChild(gokuSsjThree25);
        setRotationAngle(gokuSsjThree25, -2.3269F, 0.9898F, 0.4286F);
        gokuSsjThree25.cubeList.add(new ModelBox(gokuSsjThree25, 77, 32, -2.0F, -9.8F, 1.0F, 3, 12, 3, -0.1F));

        gokuSsjThree26 = new ModelRenderer(this);
        gokuSsjThree26.setRotationPoint(2.9326F, 6.5612F, 7.4193F);
        gokuSsjThree.addChild(gokuSsjThree26);
        setRotationAngle(gokuSsjThree26, -2.4986F, 0.4604F, 0.3381F);
        gokuSsjThree26.cubeList.add(new ModelBox(gokuSsjThree26, 73, 32, -4.0F, -10.0F, 0.0F, 4, 12, 4, -0.1F));

        gokuSsjThree28 = new ModelRenderer(this);
        gokuSsjThree28.setRotationPoint(2.9326F, 6.5612F, 6.9193F);
        gokuSsjThree.addChild(gokuSsjThree28);
        setRotationAngle(gokuSsjThree28, -2.1931F, 0.4604F, 0.3381F);
        gokuSsjThree28.cubeList.add(new ModelBox(gokuSsjThree28, 71, 38, -4.6F, -2.9F, -2.8F, 4, 6, 3, -0.1F));

        gokuSsjThree27 = new ModelRenderer(this);
        gokuSsjThree27.setRotationPoint(0.1834F, 1.7815F, 9.8741F);
        gokuSsjThree.addChild(gokuSsjThree27);
        setRotationAngle(gokuSsjThree27, -1.7391F, 0.0747F, 0.5456F);
        gokuSsjThree27.cubeList.add(new ModelBox(gokuSsjThree27, 75, 39, -2.0F, -2.5F, -1.5F, 4, 5, 3, -0.1F));

        gokuSsjThree29 = new ModelRenderer(this);
        gokuSsjThree29.setRotationPoint(3.9673F, 2.7138F, 5.9609F);
        gokuSsjThree.addChild(gokuSsjThree29);
        setRotationAngle(gokuSsjThree29, -1.3179F, -0.1955F, 1.1019F);
        gokuSsjThree29.cubeList.add(new ModelBox(gokuSsjThree29, 74, 39, -4.0F, -4.5F, 0.5F, 4, 5, 3, -0.1F));

        gokuSsjThree30 = new ModelRenderer(this);
        gokuSsjThree30.setRotationPoint(2.1158F, 2.3386F, 3.6304F);
        gokuSsjThree.addChild(gokuSsjThree30);
        setRotationAngle(gokuSsjThree30, -0.7848F, -0.1116F, 0.5843F);
        gokuSsjThree30.cubeList.add(new ModelBox(gokuSsjThree30, 79, 41, -3.0F, -7.0F, -1.0F, 3, 5, 2, -0.1F));

        gokuSsjThree31 = new ModelRenderer(this);
        gokuSsjThree31.setRotationPoint(3.3049F, 0.386F, 5.2482F);
        gokuSsjThree.addChild(gokuSsjThree31);
        setRotationAngle(gokuSsjThree31, -0.8358F, -0.3467F, 0.643F);
        gokuSsjThree31.cubeList.add(new ModelBox(gokuSsjThree31, 62, 38, -4.0F, -5.0F, 1.0F, 4, 5, 3, -0.1F));

        gokuSsjThree32 = new ModelRenderer(this);
        gokuSsjThree32.setRotationPoint(1.4154F, 0.4016F, 1.2309F);
        gokuSsjThree.addChild(gokuSsjThree32);
        setRotationAngle(gokuSsjThree32, -0.6023F, 0.067F, 0.2533F);
        gokuSsjThree32.cubeList.add(new ModelBox(gokuSsjThree32, 62, 32, -4.0F, -5.0F, -0.7309F, 3, 7, 2, -0.1F));

        gokuSsjThree33 = new ModelRenderer(this);
        gokuSsjThree33.setRotationPoint(-1.775F, 1.9057F, 0.3382F);
        gokuSsjThree.addChild(gokuSsjThree33);
        setRotationAngle(gokuSsjThree33, -0.226F, -0.0149F, -0.1213F);


        hair34_2_r1 = new ModelRenderer(this);
        hair34_2_r1.setRotationPoint(0.075F, -2.5057F, -0.0382F);
        gokuSsjThree33.addChild(hair34_2_r1);
        setRotationAngle(hair34_2_r1, -0.1916F, 0.1523F, -0.2527F);
        hair34_2_r1.cubeList.add(new ModelBox(hair34_2_r1, 57, 40, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.3F));

        hair34_r1 = new ModelRenderer(this);
        hair34_r1.setRotationPoint(0.275F, -0.1057F, -0.0382F);
        gokuSsjThree33.addChild(hair34_r1);
        setRotationAngle(hair34_r1, -0.0266F, 0.2955F, -0.0912F);
        hair34_r1.cubeList.add(new ModelBox(hair34_r1, 57, 40, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.15F));

        gokuSsjThree34 = new ModelRenderer(this);
        gokuSsjThree34.setRotationPoint(-2.0F, 1.0F, -0.5F);
        gokuSsjThree.addChild(gokuSsjThree34);
        setRotationAngle(gokuSsjThree34, -0.253F, 0.0501F, 0.2577F);
        gokuSsjThree34.cubeList.add(new ModelBox(gokuSsjThree34, 77, 42, 0.0F, -2.0F, 0.2F, 3, 2, 2, 0.0F));

        hair33_2_r1 = new ModelRenderer(this);
        hair33_2_r1.setRotationPoint(1.5F, -1.8F, 1.0F);
        gokuSsjThree34.addChild(hair33_2_r1);
        setRotationAngle(hair33_2_r1, 0.0F, 0.0F, 0.1571F);
        hair33_2_r1.cubeList.add(new ModelBox(hair33_2_r1, 77, 42, -1.5F, -3.0F, -1.0F, 3, 4, 2, -0.3F));

        gokuSsjThree35 = new ModelRenderer(this);
        gokuSsjThree35.setRotationPoint(-1.2706F, -1.3339F, 7.2587F);
        gokuSsjThree.addChild(gokuSsjThree35);
        setRotationAngle(gokuSsjThree35, -0.7042F, 0.2118F, -0.2571F);
        gokuSsjThree35.cubeList.add(new ModelBox(gokuSsjThree35, 57, 32, -2.6F, -3.1F, -1.9F, 4, 6, 3, -0.1F));

        gokuSsjThree36 = new ModelRenderer(this);
        gokuSsjThree36.setRotationPoint(-6.0F, 7.0F, 7.0F);
        gokuSsjThree.addChild(gokuSsjThree36);
        setRotationAngle(gokuSsjThree36, -2.5744F, 0.0F, 0.0F);
        gokuSsjThree36.cubeList.add(new ModelBox(gokuSsjThree36, 57, 34, 0.9972F, -11.6289F, -3.1585F, 6, 10, 3, -0.1F));

        gokuSsjThree37 = new ModelRenderer(this);
        gokuSsjThree37.setRotationPoint(-6.3578F, 5.4795F, 5.8429F);
        gokuSsjThree.addChild(gokuSsjThree37);
        setRotationAngle(gokuSsjThree37, -2.671F, -0.1142F, 0.5972F);
        gokuSsjThree37.cubeList.add(new ModelBox(gokuSsjThree37, 57, 34, -1.2582F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

        gokuSsjThree38 = new ModelRenderer(this);
        gokuSsjThree38.setRotationPoint(2.0F, 7.0F, 6.2F);
        gokuSsjThree.addChild(gokuSsjThree38);
        setRotationAngle(gokuSsjThree38, -2.7053F, -0.1745F, 0.9599F);
        gokuSsjThree38.cubeList.add(new ModelBox(gokuSsjThree38, 57, 34, -8.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

        gokuSsjThree39 = new ModelRenderer(this);
        gokuSsjThree39.setRotationPoint(2.3578F, 5.4795F, 5.8429F);
        gokuSsjThree.addChild(gokuSsjThree39);
        setRotationAngle(gokuSsjThree39, -2.671F, 0.1142F, -0.5972F);
        gokuSsjThree39.cubeList.add(new ModelBox(gokuSsjThree39, 57, 34, -1.7418F, -4.7443F, -0.8728F, 3, 7, 3, -0.1F));

        gokuSsjThree40 = new ModelRenderer(this);
        gokuSsjThree40.setRotationPoint(-6.0F, 7.0F, 6.2F);
        gokuSsjThree.addChild(gokuSsjThree40);
        setRotationAngle(gokuSsjThree40, -2.7053F, 0.1745F, -0.9599F);
        gokuSsjThree40.cubeList.add(new ModelBox(gokuSsjThree40, 57, 34, 5.9972F, -8.6289F, 0.8415F, 3, 7, 3, -0.1F));

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
