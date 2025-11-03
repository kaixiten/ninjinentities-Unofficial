package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelVegetaSsj3 extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer bone3;
    private final ModelRenderer Hair;
    private final ModelRenderer bone;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair7;
    private final ModelRenderer Hair26;
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
    private final ModelRenderer Hair14;
    private final ModelRenderer RightHair2;
    private final ModelRenderer Hair15;
    private final ModelRenderer Hair10_r3;
    private final ModelRenderer Hair16;
    private final ModelRenderer Hair17;
    private final ModelRenderer Hair19;
    private final ModelRenderer Hair20;
    private final ModelRenderer RightHair1;
    private final ModelRenderer Hair21;
    private final ModelRenderer Hair10_r4;
    private final ModelRenderer Hair22;
    private final ModelRenderer Hair23;
    private final ModelRenderer Hair24;
    private final ModelRenderer Hair25;
    private final ModelRenderer Hair18;
    private final ModelRenderer Hair12;
    private final ModelRenderer bone2;
    private final ModelRenderer Hair27;
    private final ModelRenderer Hair1_r1;
    private final ModelRenderer LeftHair3;
    private final ModelRenderer Hair31;
    private final ModelRenderer Hair10_r5;
    private final ModelRenderer Hair32;
    private final ModelRenderer Hair33;
    private final ModelRenderer Hair34;
    private final ModelRenderer Hair35;
    private final ModelRenderer LeftHair4;
    private final ModelRenderer Hair36;
    private final ModelRenderer Hair10_r6;
    private final ModelRenderer Hair37;
    private final ModelRenderer Hair38;
    private final ModelRenderer Hair40;
    private final ModelRenderer RightHair3;
    private final ModelRenderer Hair41;
    private final ModelRenderer Hair10_r7;
    private final ModelRenderer Hair42;
    private final ModelRenderer Hair43;
    private final ModelRenderer Hair45;
    private final ModelRenderer RightHair4;
    private final ModelRenderer Hair46;
    private final ModelRenderer Hair10_r8;
    private final ModelRenderer Hair47;
    private final ModelRenderer Hair48;
    private final ModelRenderer Hair52;
    private final ModelRenderer Hair51;
    private final ModelRenderer Hair1_r2;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scale = 1.0F;

    @SuppressWarnings("unchecked")
    public ModelVegetaSsj3(float _scale) {
        textureWidth = 64;
        textureHeight = 32;

        scale = _scale;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.1F, 0.0F);
        Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.1F));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 1.0F, -0.15F);
        Head.addChild(bone3);
        setRotationAngle(bone3, 0.1309F, 0.0F, 0.0F);


        Hair = new ModelRenderer(this);
        Hair.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(Hair);
        setRotationAngle(Hair, -0.2618F, 0.0F, 0.0F);


        bone = new ModelRenderer(this);
        bone.setRotationPoint(-1.25F, -9.25F, 0.0F);
        Hair.addChild(bone);


        Hair1 = new ModelRenderer(this);
        Hair1.setRotationPoint(0.4747F, 1.6924F, -1.7478F);
        bone.addChild(Hair1);
        setRotationAngle(Hair1, -0.1969F, 0.0F, 0.0F);
        Hair1.cubeList.add(new ModelBox(Hair1, 42, 2, -1.2642F, -9.5142F, -3.0819F, 4, 10, 4, -0.1F));

        Hair2 = new ModelRenderer(this);
        Hair2.setRotationPoint(-0.25F, -1.25F, 0.0F);
        bone.addChild(Hair2);
        setRotationAngle(Hair2, -0.173F, 0.0227F, -0.2201F);


        Hair7 = new ModelRenderer(this);
        Hair7.setRotationPoint(0.0F, -1.875F, 5.3125F);
        bone.addChild(Hair7);
        setRotationAngle(Hair7, -0.3479F, 0.0298F, 0.1519F);
        Hair7.cubeList.add(new ModelBox(Hair7, 46, 1, 1.7624F, -5.8021F, -8.2477F, 3, 12, 3, -0.1F));

        Hair26 = new ModelRenderer(this);
        Hair26.setRotationPoint(2.5F, -1.875F, 5.3125F);
        bone.addChild(Hair26);
        setRotationAngle(Hair26, -0.3479F, -0.0298F, -0.1519F);
        Hair26.cubeList.add(new ModelBox(Hair26, 46, 1, -4.7624F, -5.8021F, -8.2477F, 3, 12, 3, -0.1F));

        LeftHair1 = new ModelRenderer(this);
        LeftHair1.setRotationPoint(-0.625F, -7.5F, 1.625F);
        Hair.addChild(LeftHair1);
        setRotationAngle(LeftHair1, -0.1745F, 0.0F, 0.3491F);


        Hair10 = new ModelRenderer(this);
        Hair10.setRotationPoint(0.0F, 0.0F, 0.0F);
        LeftHair1.addChild(Hair10);
        setRotationAngle(Hair10, 2.4826F, 0.1957F, 0.2441F);


        Hair10_r1 = new ModelRenderer(this);
        Hair10_r1.setRotationPoint(-1.625F, 37.75F, -1.125F);
        Hair10.addChild(Hair10_r1);
        setRotationAngle(Hair10_r1, 0.028F, -0.0466F, 0.0676F);
        Hair10_r1.cubeList.add(new ModelBox(Hair10_r1, 44, 2, 1.4607F, -37.7225F, -2.6172F, 3, 3, 3, -0.1F));

        Hair9 = new ModelRenderer(this);
        Hair9.setRotationPoint(4.625F, -3.5F, 0.875F);
        LeftHair1.addChild(Hair9);
        setRotationAngle(Hair9, 2.6616F, 0.0873F, 0.349F);
        Hair9.cubeList.add(new ModelBox(Hair9, 45, 4, 0.1215F, -6.2137F, -1.5235F, 3, 7, 3, -0.1F));

        Hair13 = new ModelRenderer(this);
        Hair13.setRotationPoint(4.625F, -3.5F, 1.5F);
        LeftHair1.addChild(Hair13);
        setRotationAngle(Hair13, 2.5808F, 0.111F, 0.5896F);
        Hair13.cubeList.add(new ModelBox(Hair13, 47, 3, 0.7465F, -5.4638F, -4.0235F, 3, 6, 3, -0.1F));

        Hair4 = new ModelRenderer(this);
        Hair4.setRotationPoint(6.625F, -1.5F, -4.125F);
        LeftHair1.addChild(Hair4);
        setRotationAngle(Hair4, 2.6471F, -0.0378F, 0.5289F);
        Hair4.cubeList.add(new ModelBox(Hair4, 44, 3, -2.9965F, -2.9637F, -2.7735F, 3, 7, 3, -0.1F));

        Hair3 = new ModelRenderer(this);
        Hair3.setRotationPoint(2.125F, -3.5F, -1.625F);
        LeftHair1.addChild(Hair3);
        setRotationAngle(Hair3, -0.1571F, 0.0F, 0.3665F);
        Hair3.cubeList.add(new ModelBox(Hair3, 44, 3, 0.8254F, -3.9275F, -3.75F, 3, 7, 3, -0.1F));

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
        Hair10_r2.cubeList.add(new ModelBox(Hair10_r2, 44, 2, 1.3582F, -39.4122F, -2.9956F, 3, 9, 3, -0.1F));

        Hair6 = new ModelRenderer(this);
        Hair6.setRotationPoint(4.625F, -3.5F, 0.875F);
        LeftHair2.addChild(Hair6);
        setRotationAngle(Hair6, 2.6616F, 0.0873F, 0.349F);
        Hair6.cubeList.add(new ModelBox(Hair6, 45, 4, 0.1215F, -4.2137F, -1.5235F, 3, 8, 3, -0.1F));

        Hair8 = new ModelRenderer(this);
        Hair8.setRotationPoint(4.625F, -3.5F, 1.5F);
        LeftHair2.addChild(Hair8);
        setRotationAngle(Hair8, 2.5808F, 0.111F, 0.5896F);
        Hair8.cubeList.add(new ModelBox(Hair8, 47, 2, 0.7465F, -5.4638F, -4.0235F, 3, 11, 3, -0.1F));

        Hair11 = new ModelRenderer(this);
        Hair11.setRotationPoint(6.625F, -1.5F, -4.125F);
        LeftHair2.addChild(Hair11);
        setRotationAngle(Hair11, 2.6471F, -0.0378F, 0.5289F);
        Hair11.cubeList.add(new ModelBox(Hair11, 44, 3, -2.9965F, -2.9637F, -2.7735F, 3, 9, 3, -0.1F));

        Hair14 = new ModelRenderer(this);
        Hair14.setRotationPoint(2.125F, -1.5F, -2.625F);
        LeftHair2.addChild(Hair14);
        setRotationAngle(Hair14, -0.1571F, 0.0F, 0.3665F);
        Hair14.cubeList.add(new ModelBox(Hair14, 44, 3, 0.8039F, -6.086F, -3.2272F, 3, 9, 3, -0.1F));

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
        Hair10_r3.cubeList.add(new ModelBox(Hair10_r3, 44, 2, -4.3582F, -39.4122F, -2.9956F, 3, 9, 3, -0.1F));

        Hair16 = new ModelRenderer(this);
        Hair16.setRotationPoint(-4.625F, -3.5F, 0.875F);
        RightHair2.addChild(Hair16);
        setRotationAngle(Hair16, 2.6616F, -0.0873F, -0.349F);
        Hair16.cubeList.add(new ModelBox(Hair16, 45, 4, -3.1215F, -4.2137F, -1.5235F, 3, 8, 3, -0.1F));

        Hair17 = new ModelRenderer(this);
        Hair17.setRotationPoint(-4.625F, -3.5F, 1.5F);
        RightHair2.addChild(Hair17);
        setRotationAngle(Hair17, 2.5808F, -0.111F, -0.5896F);
        Hair17.cubeList.add(new ModelBox(Hair17, 47, 2, -3.7465F, -5.4638F, -4.0235F, 3, 11, 3, -0.1F));

        Hair19 = new ModelRenderer(this);
        Hair19.setRotationPoint(-6.625F, -1.5F, -4.125F);
        RightHair2.addChild(Hair19);
        setRotationAngle(Hair19, 2.6471F, 0.0378F, -0.5289F);
        Hair19.cubeList.add(new ModelBox(Hair19, 44, 3, -0.0035F, -2.9637F, -2.7735F, 3, 9, 3, -0.1F));

        Hair20 = new ModelRenderer(this);
        Hair20.setRotationPoint(-2.125F, -1.5F, -2.625F);
        RightHair2.addChild(Hair20);
        setRotationAngle(Hair20, -0.1571F, 0.0F, -0.3665F);
        Hair20.cubeList.add(new ModelBox(Hair20, 44, 3, -3.8039F, -6.086F, -3.2272F, 3, 9, 3, -0.1F));

        RightHair1 = new ModelRenderer(this);
        RightHair1.setRotationPoint(0.625F, -7.5F, 1.625F);
        Hair.addChild(RightHair1);
        setRotationAngle(RightHair1, -0.1745F, 0.0F, -0.3491F);


        Hair21 = new ModelRenderer(this);
        Hair21.setRotationPoint(0.0F, 0.0F, 0.0F);
        RightHair1.addChild(Hair21);
        setRotationAngle(Hair21, 2.4826F, -0.1957F, -0.2441F);


        Hair10_r4 = new ModelRenderer(this);
        Hair10_r4.setRotationPoint(1.625F, 37.75F, -1.125F);
        Hair21.addChild(Hair10_r4);
        setRotationAngle(Hair10_r4, 0.028F, 0.0466F, -0.0676F);
        Hair10_r4.cubeList.add(new ModelBox(Hair10_r4, 44, 2, -4.4607F, -37.7225F, -2.6172F, 3, 3, 3, -0.1F));

        Hair22 = new ModelRenderer(this);
        Hair22.setRotationPoint(-4.625F, -3.5F, 0.875F);
        RightHair1.addChild(Hair22);
        setRotationAngle(Hair22, 2.6616F, -0.0873F, -0.349F);
        Hair22.cubeList.add(new ModelBox(Hair22, 45, 4, -3.1215F, -6.2137F, -1.5235F, 3, 7, 3, -0.1F));

        Hair23 = new ModelRenderer(this);
        Hair23.setRotationPoint(-4.625F, -3.5F, 1.5F);
        RightHair1.addChild(Hair23);
        setRotationAngle(Hair23, 2.5808F, -0.111F, -0.5896F);
        Hair23.cubeList.add(new ModelBox(Hair23, 47, 3, -3.7465F, -5.4638F, -4.0235F, 3, 6, 3, -0.1F));

        Hair24 = new ModelRenderer(this);
        Hair24.setRotationPoint(-6.625F, -1.5F, -4.125F);
        RightHair1.addChild(Hair24);
        setRotationAngle(Hair24, 2.6471F, 0.0378F, -0.5289F);
        Hair24.cubeList.add(new ModelBox(Hair24, 44, 3, -0.0035F, -2.9637F, -2.7735F, 3, 7, 3, -0.1F));

        Hair25 = new ModelRenderer(this);
        Hair25.setRotationPoint(-2.125F, -3.5F, -1.625F);
        RightHair1.addChild(Hair25);
        setRotationAngle(Hair25, -0.1571F, 0.0F, -0.3665F);
        Hair25.cubeList.add(new ModelBox(Hair25, 44, 3, -3.8254F, -3.9275F, -3.75F, 3, 7, 3, -0.1F));

        Hair18 = new ModelRenderer(this);
        Hair18.setRotationPoint(-1.25F, -11.25F, 3.75F);
        Hair.addChild(Hair18);
        setRotationAngle(Hair18, -0.537F, 0.0696F, -0.0448F);


        Hair12 = new ModelRenderer(this);
        Hair12.setRotationPoint(0.0F, -3.0F, 1.0F);
        bone3.addChild(Hair12);
        setRotationAngle(Hair12, -0.7418F, 0.0F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-1.25F, -9.25F, 0.0F);
        Hair12.addChild(bone2);


        Hair27 = new ModelRenderer(this);
        Hair27.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(Hair27);
        setRotationAngle(Hair27, -0.2356F, 0.0023F, -0.1572F);


        Hair1_r1 = new ModelRenderer(this);
        Hair1_r1.setRotationPoint(-3.75F, 41.25F, 3.5F);
        Hair27.addChild(Hair1_r1);
        setRotationAngle(Hair1_r1, 0.1304F, -0.0114F, 0.1302F);
        Hair1_r1.cubeList.add(new ModelBox(Hair1_r1, 43, 0, -2.1477F, -49.3863F, -2.9175F, 4, 12, 4, -0.1F));

        LeftHair3 = new ModelRenderer(this);
        LeftHair3.setRotationPoint(-0.875F, -7.5F, 1.625F);
        Hair12.addChild(LeftHair3);
        setRotationAngle(LeftHair3, 0.0F, 0.0F, 0.3927F);


        Hair31 = new ModelRenderer(this);
        Hair31.setRotationPoint(0.0F, 0.0F, 0.0F);
        LeftHair3.addChild(Hair31);
        setRotationAngle(Hair31, 2.4826F, 0.1957F, 0.2441F);


        Hair10_r5 = new ModelRenderer(this);
        Hair10_r5.setRotationPoint(-1.625F, 37.75F, -1.125F);
        Hair31.addChild(Hair10_r5);
        setRotationAngle(Hair10_r5, 0.028F, -0.0466F, 0.0676F);
        Hair10_r5.cubeList.add(new ModelBox(Hair10_r5, 44, 2, 1.4607F, -40.7225F, -2.6172F, 3, 9, 3, -0.1F));

        Hair32 = new ModelRenderer(this);
        Hair32.setRotationPoint(4.625F, -3.5F, 0.875F);
        LeftHair3.addChild(Hair32);
        setRotationAngle(Hair32, 2.6616F, 0.0873F, 0.349F);
        Hair32.cubeList.add(new ModelBox(Hair32, 46, 2, 0.1215F, -7.2137F, -1.5235F, 3, 11, 3, -0.1F));

        Hair33 = new ModelRenderer(this);
        Hair33.setRotationPoint(4.625F, -3.5F, 1.5F);
        LeftHair3.addChild(Hair33);
        setRotationAngle(Hair33, 2.5808F, 0.111F, 0.5896F);
        Hair33.cubeList.add(new ModelBox(Hair33, 47, 3, 0.7465F, -6.4638F, -4.0235F, 3, 10, 3, -0.1F));

        Hair34 = new ModelRenderer(this);
        Hair34.setRotationPoint(6.625F, -1.5F, -4.125F);
        LeftHair3.addChild(Hair34);
        setRotationAngle(Hair34, 2.6471F, -0.0378F, 0.5289F);


        Hair35 = new ModelRenderer(this);
        Hair35.setRotationPoint(2.125F, -3.5F, -1.625F);
        LeftHair3.addChild(Hair35);
        setRotationAngle(Hair35, -0.1571F, 0.0F, 0.3665F);


        LeftHair4 = new ModelRenderer(this);
        LeftHair4.setRotationPoint(-1.875F, -8.5F, 1.625F);
        Hair12.addChild(LeftHair4);
        setRotationAngle(LeftHair4, 0.0F, 0.0F, -0.0873F);


        Hair36 = new ModelRenderer(this);
        Hair36.setRotationPoint(0.0F, 0.0F, 0.0F);
        LeftHair4.addChild(Hair36);
        setRotationAngle(Hair36, 2.4826F, 0.1957F, 0.2441F);


        Hair10_r6 = new ModelRenderer(this);
        Hair10_r6.setRotationPoint(-1.625F, 37.75F, -1.125F);
        Hair36.addChild(Hair10_r6);
        setRotationAngle(Hair10_r6, 0.028F, -0.0466F, 0.0676F);
        Hair10_r6.cubeList.add(new ModelBox(Hair10_r6, 45, 0, 1.3582F, -40.4122F, -2.9956F, 3, 13, 3, -0.1F));

        Hair37 = new ModelRenderer(this);
        Hair37.setRotationPoint(4.625F, -3.5F, 0.875F);
        LeftHair4.addChild(Hair37);
        setRotationAngle(Hair37, 2.6616F, 0.0873F, 0.349F);
        Hair37.cubeList.add(new ModelBox(Hair37, 45, 0, 0.1215F, -5.2137F, -1.5235F, 3, 12, 3, -0.1F));

        Hair38 = new ModelRenderer(this);
        Hair38.setRotationPoint(4.625F, -3.5F, 1.5F);
        LeftHair4.addChild(Hair38);
        setRotationAngle(Hair38, 2.5808F, 0.111F, 0.5896F);
        Hair38.cubeList.add(new ModelBox(Hair38, 48, 1, 0.7465F, -6.4638F, -4.0235F, 3, 12, 3, -0.1F));

        Hair40 = new ModelRenderer(this);
        Hair40.setRotationPoint(2.125F, -1.5F, -2.625F);
        LeftHair4.addChild(Hair40);
        setRotationAngle(Hair40, -0.1571F, 0.0F, 0.3665F);
        Hair40.cubeList.add(new ModelBox(Hair40, 45, 0, 0.8039F, -7.086F, -3.2272F, 3, 13, 3, -0.1F));

        RightHair3 = new ModelRenderer(this);
        RightHair3.setRotationPoint(1.875F, -8.5F, 1.625F);
        Hair12.addChild(RightHair3);
        setRotationAngle(RightHair3, 0.0F, 0.0F, 0.0873F);


        Hair41 = new ModelRenderer(this);
        Hair41.setRotationPoint(0.0F, 0.0F, 0.0F);
        RightHair3.addChild(Hair41);
        setRotationAngle(Hair41, 2.4826F, -0.1957F, -0.2441F);


        Hair10_r7 = new ModelRenderer(this);
        Hair10_r7.setRotationPoint(1.625F, 37.75F, -1.125F);
        Hair41.addChild(Hair10_r7);
        setRotationAngle(Hair10_r7, 0.028F, 0.0466F, -0.0676F);
        Hair10_r7.cubeList.add(new ModelBox(Hair10_r7, 45, 0, -4.3582F, -40.4122F, -2.9956F, 3, 13, 3, -0.1F));

        Hair42 = new ModelRenderer(this);
        Hair42.setRotationPoint(-4.625F, -3.5F, 0.875F);
        RightHair3.addChild(Hair42);
        setRotationAngle(Hair42, 2.6616F, -0.0873F, -0.349F);
        Hair42.cubeList.add(new ModelBox(Hair42, 46, 1, -3.1215F, -5.2137F, -1.5235F, 3, 12, 3, -0.1F));

        Hair43 = new ModelRenderer(this);
        Hair43.setRotationPoint(-4.625F, -3.5F, 1.5F);
        RightHair3.addChild(Hair43);
        setRotationAngle(Hair43, 2.5808F, -0.111F, -0.5896F);
        Hair43.cubeList.add(new ModelBox(Hair43, 48, 1, -3.7465F, -6.4638F, -4.0235F, 3, 12, 3, -0.1F));

        Hair45 = new ModelRenderer(this);
        Hair45.setRotationPoint(-2.125F, -1.5F, -2.625F);
        RightHair3.addChild(Hair45);
        setRotationAngle(Hair45, -0.1571F, 0.0F, -0.3665F);
        Hair45.cubeList.add(new ModelBox(Hair45, 45, 0, -3.8039F, -7.086F, -3.2272F, 3, 13, 3, -0.1F));

        RightHair4 = new ModelRenderer(this);
        RightHair4.setRotationPoint(0.875F, -7.5F, 1.625F);
        Hair12.addChild(RightHair4);
        setRotationAngle(RightHair4, 0.0F, 0.0F, -0.3927F);


        Hair46 = new ModelRenderer(this);
        Hair46.setRotationPoint(0.0F, 0.0F, 0.0F);
        RightHair4.addChild(Hair46);
        setRotationAngle(Hair46, 2.4826F, -0.1957F, -0.2441F);


        Hair10_r8 = new ModelRenderer(this);
        Hair10_r8.setRotationPoint(1.625F, 37.75F, -1.125F);
        Hair46.addChild(Hair10_r8);
        setRotationAngle(Hair10_r8, 0.028F, 0.0466F, -0.0676F);
        Hair10_r8.cubeList.add(new ModelBox(Hair10_r8, 44, 2, -4.4607F, -40.7225F, -2.6172F, 3, 9, 3, -0.1F));

        Hair47 = new ModelRenderer(this);
        Hair47.setRotationPoint(-4.625F, -3.5F, 0.875F);
        RightHair4.addChild(Hair47);
        setRotationAngle(Hair47, 2.6616F, -0.0873F, -0.349F);
        Hair47.cubeList.add(new ModelBox(Hair47, 46, 2, -3.1215F, -7.2137F, -1.5235F, 3, 11, 3, -0.1F));

        Hair48 = new ModelRenderer(this);
        Hair48.setRotationPoint(-4.625F, -3.5F, 1.5F);
        RightHair4.addChild(Hair48);
        setRotationAngle(Hair48, 2.5808F, -0.111F, -0.5896F);
        Hair48.cubeList.add(new ModelBox(Hair48, 47, 3, -3.7465F, -6.4638F, -4.0235F, 3, 10, 3, -0.1F));

        Hair52 = new ModelRenderer(this);
        Hair52.setRotationPoint(-1.25F, -7.25F, 5.75F);
        Hair12.addChild(Hair52);
        setRotationAngle(Hair52, -0.7115F, 0.0696F, -0.0448F);
        Hair52.cubeList.add(new ModelBox(Hair52, 32, 0, -1.1416F, -7.0925F, -3.4643F, 5, 11, 5, -0.1F));

        Hair51 = new ModelRenderer(this);
        Hair51.setRotationPoint(-1.25F, -11.25F, 3.75F);
        Hair12.addChild(Hair51);
        setRotationAngle(Hair51, -0.0134F, -0.0177F, -0.0436F);
        Hair51.cubeList.add(new ModelBox(Hair51, 42, 0, -1.6416F, -8.6925F, -4.9642F, 6, 12, 4, -0.15F));

        Hair1_r2 = new ModelRenderer(this);
        Hair1_r2.setRotationPoint(1.3584F, 0.4075F, -2.9642F);
        Hair51.addChild(Hair1_r2);
        setRotationAngle(Hair1_r2, -0.6981F, 0.0F, 0.0F);
        Hair1_r2.cubeList.add(new ModelBox(Hair1_r2, 44, 0, -3.0F, -8.5F, -2.0F, 6, 12, 4, -0.1F));

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
        this.Head.rotateAngleY = f3 / (110F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (90F / (float)Math.PI);
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
