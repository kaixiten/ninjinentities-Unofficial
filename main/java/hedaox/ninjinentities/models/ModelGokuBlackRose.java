package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelGokuBlackRose extends ModelBase {
    private final ModelRenderer bipedHead;
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
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer Kild;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private float scale = 1.0F;

    public ModelGokuBlackRose(float _scale) {
        textureWidth = 128;
        textureHeight = 64;
        scale = _scale;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

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

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 5.4F, 0.0F);
        bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, -5.4F, -2.0F, 8, 12, 4, 0.0F));

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

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, -2.4F, 0.0F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

        Kild = new ModelRenderer(this);
        Kild.setRotationPoint(0.0F, 3.2F, -12.7F);
        bipedRightArm.addChild(Kild);
        setRotationAngle(Kild, 1.2217F, 0.0F, 0.0F);
        Kild.cubeList.add(new ModelBox(Kild, 81, 0, -0.5F, -17.0F, -0.5F, 1, 44, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 111, 0, -1.0F, 21.0F, -1.0F, 2, 3, 2, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 103, 0, -1.0F, -14.0F, -1.0F, 2, 11, 2, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 109, 32, 0.0F, -13.0F, 1.0F, 0, 7, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 107, 35, 0.0F, -12.0F, 2.0F, 0, 4, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 105, 39, 0.0F, -14.0F, 3.0F, 0, 3, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 109, 43, 0.25F, -11.0F, 2.0F, 0, 1, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 121, 33, 0.25F, -13.0F, 3.0F, 0, 2, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 111, 43, 0.25F, -15.0F, 4.0F, 0, 1, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 85, 43, 0.0F, -14.0F, 2.0F, 0, 1, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 123, 41, 0.0F, -5.0F, 1.0F, 0, 1, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 121, 30, 0.0F, -6.0F, 2.0F, 0, 2, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 87, 43, 0.0F, -7.0F, 3.0F, 0, 1, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 105, 43, 0.0F, -10.0F, 3.0F, 0, 1, 1, 0.1F));
        Kild.cubeList.add(new ModelBox(Kild, 85, 0, -0.5F, -12.0F, -9.0F, 1, 8, 8, 0.1F));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -8.3644F, -24.0914F);
        Kild.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 93, 29, -0.5F, 1.5F, 4.0F, 1, 6, 2, 0.088F));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -8.9827F, -19.1673F);
        Kild.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 25, -0.5F, -0.5F, 1.0F, 1, 6, 4, 0.089F));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -9.4827F, -19.4173F);
        Kild.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 85, 16, -0.5F, -1.0172F, 4.8464F, 1, 7, 6, 0.09F));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.5F, 27.0F, 0.5F);
        Kild.addChild(bone9);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-0.5F, 0.0F, 0.0F);
        bone9.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 123, 43, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.1F));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.0F, 0.0F, -0.5F);
        bone9.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1745F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 107, 41, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.1F));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-0.5F, 0.0F, -1.0F);
        bone9.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 121, 43, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.1F));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 0.0F, -0.5F);
        bone9.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.1745F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 121, 40, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.1F));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -12.0F, 0.0F);
        Kild.addChild(bone8);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-1.0F, 0.0F, 0.0F);
        bone8.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 119, 43, 0.0F, -3.0F, 0.0F, 0, 1, 1, 0.1F));
        cube_r8.cubeList.add(new ModelBox(cube_r8, 117, 43, 0.0F, -4.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r8.cubeList.add(new ModelBox(cube_r8, 117, 9, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.1F));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(1.0F, 0.0F, 0.0F);
        bone8.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 113, 43, 0.0F, -4.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 121, 37, 0.0F, -2.0F, -1.0F, 0, 2, 1, 0.1F));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 40, 0.0F, -3.0F, -1.0F, 0, 1, 2, 0.1F));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, 0.0F, -1.0F);
        bone8.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 93, 44, 0.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 121, 3, -1.0F, -3.0F, 0.0F, 2, 3, 0, 0.1F));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone8.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 125, 11, -1.0F, -2.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 93, 40, -1.0F, -4.0F, 0.0F, 2, 2, 0, 0.1F));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 121, 36, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.1F));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(2.0F, -18.0F, 0.0F);
        Kild.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 99, 16, -2.0F, 5.0F, -9.0F, 0, 1, 8, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 119, 16, -2.25F, 4.0F, -4.0F, 0, 1, 2, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 101, 39, -2.0F, 4.0F, -3.0F, 0, 1, 2, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 119, 19, -2.25F, 3.0F, -3.0F, 0, 1, 2, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 123, 30, -2.25F, 2.0F, -4.0F, 0, 1, 1, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 123, 21, -1.75F, 3.0F, -6.0F, 0, 1, 1, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 123, 32, -1.75F, 4.0F, -7.0F, 0, 1, 1, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 123, 34, -2.0F, 4.0F, -6.0F, 0, 1, 1, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 119, 13, -2.0F, 14.0F, -7.0F, 0, 1, 2, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 125, 0, -2.25F, 14.0F, -9.0F, 0, 1, 1, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 119, 22, -1.75F, 15.0F, -8.0F, 0, 1, 2, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 97, 39, -2.25F, 14.0F, -3.0F, 0, 1, 2, 0.1F));
        bone7.cubeList.add(new ModelBox(bone7, 123, 39, -2.0F, 15.0F, -7.0F, 0, 1, 1, 0.1F));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-1.5F, 9.6356F, -24.0914F);
        bone7.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 99, 42, -0.5F, 7.5F, 4.0F, 0, 1, 1, 0.1F));
        cube_r12.cubeList.add(new ModelBox(cube_r12, 115, 32, -0.5F, 3.5F, 3.0F, 0, 6, 1, 0.1F));
        cube_r12.cubeList.add(new ModelBox(cube_r12, 123, 17, -0.5F, 0.5F, 5.0F, 0, 1, 1, 0.1F));

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-1.5F, 9.0173F, -19.1673F);
        bone7.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 117, 38, -0.5F, 5.5F, 1.0F, 0, 1, 2, 0.1F));
        cube_r13.cubeList.add(new ModelBox(cube_r13, 123, 19, -0.5F, 5.5F, 4.0F, 0, 1, 1, 0.1F));
        cube_r13.cubeList.add(new ModelBox(cube_r13, 103, 42, -0.25F, -2.5F, 4.0F, 0, 1, 1, 0.1F));
        cube_r13.cubeList.add(new ModelBox(cube_r13, 123, 37, -0.5F, -1.5F, 4.0F, 0, 1, 1, 0.1F));
        cube_r13.cubeList.add(new ModelBox(cube_r13, 123, 23, -0.5F, -1.5F, 2.0F, 0, 1, 1, 0.1F));
        cube_r13.cubeList.add(new ModelBox(cube_r13, 119, 0, -0.25F, -1.5F, 3.0F, 0, 1, 2, 0.1F));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-1.25F, 8.5173F, -19.4173F);
        bone7.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 123, 26, -0.5F, 6.9828F, 7.8464F, 0, 1, 1, 0.1F));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 111, 5, -0.75F, 5.9828F, 6.8464F, 0, 1, 3, 0.1F));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 115, 42, -0.75F, -3.0172F, 8.8464F, 0, 1, 1, 0.1F));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 101, 42, -1.0F, -4.0172F, 8.8464F, 0, 1, 1, 0.1F));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 111, 9, -1.0F, -3.0172F, 7.8464F, 0, 1, 3, 0.1F));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 109, 25, -0.75F, -2.0172F, 4.8464F, 0, 1, 6, 0.1F));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -2.0F, 0.0F);
        Kild.addChild(bone6);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, 0.0F, -1.0F);
        bone6.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 125, 10, -1.0F, -3.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r15.cubeList.add(new ModelBox(cube_r15, 91, 44, 0.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r15.cubeList.add(new ModelBox(cube_r15, 121, 10, -1.0F, -2.0F, 0.0F, 2, 2, 0, 0.1F));

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone6.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 125, 9, 0.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r16.cubeList.add(new ModelBox(cube_r16, 97, 42, 0.0F, -2.0F, 0.0F, 1, 2, 0, 0.1F));
        cube_r16.cubeList.add(new ModelBox(cube_r16, 111, 40, -1.0F, -3.0F, 0.0F, 2, 1, 0, 0.1F));

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(1.0F, 0.0F, 0.0F);
        bone6.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.1745F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 123, 15, 0.0F, -4.0F, 0.0F, 0, 1, 1, 0.1F));
        cube_r17.cubeList.add(new ModelBox(cube_r17, 115, 18, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.1F));

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-1.0F, 0.0F, 0.0F);
        bone6.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -0.1745F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 95, 42, 0.0F, -2.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r18.cubeList.add(new ModelBox(cube_r18, 89, 36, 0.0F, -4.0F, -1.0F, 0, 2, 2, 0.1F));
        cube_r18.cubeList.add(new ModelBox(cube_r18, 111, 37, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.1F));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 4.0F, 0.0F);
        Kild.addChild(bone5);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.0F, 0.0F, -1.0F);
        bone5.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 125, 8, -1.0F, -3.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 44, 0.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r19.cubeList.add(new ModelBox(cube_r19, 121, 8, -1.0F, -2.0F, 0.0F, 2, 2, 0, 0.1F));

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone5.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 125, 7, 0.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r20.cubeList.add(new ModelBox(cube_r20, 123, 13, 0.0F, -2.0F, 0.0F, 1, 2, 0, 0.1F));
        cube_r20.cubeList.add(new ModelBox(cube_r20, 121, 29, -1.0F, -3.0F, 0.0F, 2, 1, 0, 0.1F));

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(1.0F, 0.0F, 0.0F);
        bone5.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, 0.1745F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 93, 42, 0.0F, -4.0F, 0.0F, 0, 1, 1, 0.1F));
        cube_r21.cubeList.add(new ModelBox(cube_r21, 115, 13, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.1F));

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-1.0F, 0.0F, 0.0F);
        bone5.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, -0.1745F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 91, 42, 0.0F, -2.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r22.cubeList.add(new ModelBox(cube_r22, 117, 5, 0.0F, -4.0F, -1.0F, 0, 2, 2, 0.1F));
        cube_r22.cubeList.add(new ModelBox(cube_r22, 93, 37, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.1F));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 10.0F, 0.0F);
        Kild.addChild(bone4);


        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(1.0F, 0.0F, 0.0F);
        bone4.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.1745F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 89, 42, 0.0F, -3.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r23.cubeList.add(new ModelBox(cube_r23, 123, 0, 0.0F, -4.0F, 0.0F, 0, 1, 1, 0.1F));
        cube_r23.cubeList.add(new ModelBox(cube_r23, 85, 36, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.1F));

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-1.0F, 0.0F, 0.0F);
        bone4.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, -0.1745F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 119, 41, 0.0F, -4.0F, 0.0F, 0, 1, 1, 0.1F));
        cube_r24.cubeList.add(new ModelBox(cube_r24, 121, 26, 0.0F, -2.0F, 0.0F, 0, 2, 1, 0.1F));
        cube_r24.cubeList.add(new ModelBox(cube_r24, 117, 35, 0.0F, -3.0F, -1.0F, 0, 1, 2, 0.1F));

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone4.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 125, 6, -1.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r25.cubeList.add(new ModelBox(cube_r25, 117, 32, -1.0F, -3.0F, 0.0F, 2, 3, 0, 0.1F));

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(0.0F, 0.0F, -1.0F);
        bone4.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 125, 5, 0.0F, -2.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r26.cubeList.add(new ModelBox(cube_r26, 89, 40, -1.0F, -4.0F, 0.0F, 2, 2, 0, 0.1F));
        cube_r26.cubeList.add(new ModelBox(cube_r26, 107, 40, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.1F));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 22.0F, 0.0F);
        Kild.addChild(bone2);


        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(-1.0F, 0.0F, 0.0F);
        bone2.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, -0.1745F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 109, 41, 0.0F, -3.0F, 0.0F, 0, 1, 1, 0.1F));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 119, 3, 0.0F, -4.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 99, 35, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.1F));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(1.0F, 0.0F, 0.0F);
        bone2.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, 0.1745F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 97, 37, 0.0F, -4.0F, -1.0F, 0, 1, 1, 0.1F));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 115, 39, 0.0F, -2.0F, -1.0F, 0, 2, 1, 0.1F));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 107, 13, 0.0F, -3.0F, -1.0F, 0, 1, 2, 0.1F));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.0F, 0.0F, -1.0F);
        bone2.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 123, 28, 0.0F, -4.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r29.cubeList.add(new ModelBox(cube_r29, 103, 13, -1.0F, -3.0F, 0.0F, 2, 3, 0, 0.1F));

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone2.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.1745F, 0.0F, 0.0F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 123, 2, -1.0F, -2.0F, 0.0F, 1, 1, 0, 0.1F));
        cube_r30.cubeList.add(new ModelBox(cube_r30, 115, 23, -1.0F, -4.0F, 0.0F, 2, 2, 0, 0.1F));
        cube_r30.cubeList.add(new ModelBox(cube_r30, 121, 12, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.1F));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        bipedBody.render(scaleFactor);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
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
