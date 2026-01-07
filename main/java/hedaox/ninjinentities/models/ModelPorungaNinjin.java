package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelPorungaNinjin extends ModelBase {
	private final ModelRenderer bipedHead1;
	private final ModelRenderer TentacleL;
	private final ModelRenderer bipedHead2;
	private final ModelRenderer bipedHead3;
	private final ModelRenderer TopHornL1;
	private final ModelRenderer TopHornL2;
	private final ModelRenderer TopHornL3;
	private final ModelRenderer SideHornL1;
	private final ModelRenderer SideHornL2;
	private final ModelRenderer SideHornL3;
	private final ModelRenderer TopHornR1;
	private final ModelRenderer TopHornR2;
	private final ModelRenderer TopHornR3;
	private final ModelRenderer SideHornR1;
	private final ModelRenderer SideHornR2;
	private final ModelRenderer SideHornR3;
	private final ModelRenderer Jaw1;
	private final ModelRenderer JawR;
	private final ModelRenderer JawL;
	private final ModelRenderer Jaw2;
	private final ModelRenderer Jaw3;
	private final ModelRenderer TentacleR;
	private final ModelRenderer bipedBody1;
	private final ModelRenderer DragonFin1;
	private final ModelRenderer bipedBody2;
	private final ModelRenderer Chest;
	private final ModelRenderer bipedBody3;
	private final ModelRenderer bipedBody4;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;
	private final ModelRenderer DragonFin4;
	private final ModelRenderer Tail3;
	private final ModelRenderer Tail4;
	private final ModelRenderer DragonFin6;
	private final ModelRenderer Tail5;
	private final ModelRenderer DragonFin7;
	private final ModelRenderer Tail6;
	private final ModelRenderer DragonFin8;
	private final ModelRenderer Tail7;
	private final ModelRenderer Tail8;
	private final ModelRenderer Tail9;
	private final ModelRenderer DragonFin11;
	private final ModelRenderer Tail10;
	private final ModelRenderer DragonFin11_1;
	private final ModelRenderer Tail11;
	private final ModelRenderer DragonFin11_2;
	private final ModelRenderer Tail12;
	private final ModelRenderer DragonFin11_3;
	private final ModelRenderer Tail13;
	private final ModelRenderer DragonFin11_4;
	private final ModelRenderer Tail14;
	private final ModelRenderer Tail15;
	private final ModelRenderer DragonFin10;
	private final ModelRenderer DragonFin9;
	private final ModelRenderer DragonFin5;
	private final ModelRenderer DragonFin3;
	private final ModelRenderer Abs;
	private final ModelRenderer DragonFin2;
	private final ModelRenderer Neck;
	private final ModelRenderer ShoulderL;
	private final ModelRenderer ShoulderSpikeL1;
	private final ModelRenderer ShoulderSpikeL2;
	private final ModelRenderer ShoulderSpikeL3;
	private final ModelRenderer ShoulderSpikeL4;
	private final ModelRenderer ShoulderSpikeL5;
	private final ModelRenderer BicepL;
	private final ModelRenderer ForeArmL;
	private final ModelRenderer PalmL1;
	private final ModelRenderer LFingerT1;
	private final ModelRenderer LFingersT2;
	private final ModelRenderer LFingerL1;
	private final ModelRenderer LFingerL2;
	private final ModelRenderer LFingerP1;
	private final ModelRenderer LFingerP2;
	private final ModelRenderer LFingerM1;
	private final ModelRenderer LFingerM2;
	private final ModelRenderer PalmL2;
	private final ModelRenderer LFingerR1;
	private final ModelRenderer LFingerR2;
	private final ModelRenderer ShoulderR;
	private final ModelRenderer ShoulderSpikeR6;
	private final ModelRenderer ShoulderSpikeR7;
	private final ModelRenderer ShoulderSpikeL8;
	private final ModelRenderer ShoulderSpikeL9;
	private final ModelRenderer ShoulderSpikeL10;
	private final ModelRenderer BicepR2;
	private final ModelRenderer ForeArmR2;
	private final ModelRenderer PalmR3;
	private final ModelRenderer LFingerT2;
	private final ModelRenderer LFingersT3;
	private final ModelRenderer LFingerL3;
	private final ModelRenderer LFingerL4;
	private final ModelRenderer LFingerP3;
	private final ModelRenderer LFingerP4;
	private final ModelRenderer LFingerM3;
	private final ModelRenderer LFingerM4;
	private final ModelRenderer PalmL4;
	private final ModelRenderer LFingerR3;
	private final ModelRenderer LFingerR4;
    public boolean whis_granted;
    public float last_update_tick;
    private float scale = 1.0F;

    @SuppressWarnings("unchecked")
	public ModelPorungaNinjin(float _scale) {
        whis_granted = false;
        last_update_tick = 0.0F;
		textureWidth = 256;
		textureHeight = 256;
        scale = _scale;

		bipedHead1 = new ModelRenderer(this);
		bipedHead1.setRotationPoint(0.0F, -80.0F, -5.0F);
		setRotationAngle(bipedHead1, 0.4554F, 0.0F, 0.0F);
		bipedHead1.cubeList.add(new ModelBox(bipedHead1, 97, 2, -4.0F, -4.0F, -5.5F, 8, 5, 7, 0.0F));

		TentacleL = new ModelRenderer(this);
		TentacleL.setRotationPoint(1.5F, -3.5F, -5.6F);
		bipedHead1.addChild(TentacleL);
        TentacleL.mirror = true;
		setRotationAngle(TentacleL, 0.0F, 0.7741F, -0.1798F);
		TentacleL.cubeList.add(new ModelBox(TentacleL, 92, 3, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F));

		bipedHead2 = new ModelRenderer(this);
		bipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead1.addChild(bipedHead2);
		bipedHead2.cubeList.add(new ModelBox(bipedHead2, 103, 15, -3.0F, 0.0F, -6.5F, 6, 1, 1, 0.0F));

		bipedHead3 = new ModelRenderer(this);
		bipedHead3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead2.addChild(bipedHead3);
		bipedHead3.cubeList.add(new ModelBox(bipedHead3, 103, 18, -2.0F, -1.0F, -7.5F, 4, 2, 2, 0.0F));

		TopHornL1 = new ModelRenderer(this);
		TopHornL1.setRotationPoint(2.0F, -4.0F, -3.2F);
		bipedHead1.addChild(TopHornL1);
        TopHornL1.mirror = true;
		setRotationAngle(TopHornL1, -0.9561F, 0.1745F, 0.0F);
		TopHornL1.cubeList.add(new ModelBox(TopHornL1, 128, 21, -1.4F, -3.9F, 0.0F, 3, 4, 4, 0.0F));

		TopHornL2 = new ModelRenderer(this);
		TopHornL2.setRotationPoint(0.0F, -4.0F, 2.0F);
		TopHornL1.addChild(TopHornL2);
        TopHornL2.mirror = true;
		setRotationAngle(TopHornL2, -0.2276F, 0.0F, 0.0873F);
		TopHornL2.cubeList.add(new ModelBox(TopHornL2, 129, 11, -0.7F, -5.3F, -1.5F, 2, 6, 3, 0.0F));

		TopHornL3 = new ModelRenderer(this);
		TopHornL3.setRotationPoint(0.0F, -5.2F, 0.1F);
		TopHornL2.addChild(TopHornL3);
        TopHornL3.mirror = true;
		setRotationAngle(TopHornL3, -0.2276F, 0.0F, 0.0873F);
		TopHornL3.cubeList.add(new ModelBox(TopHornL3, 130, 2, -0.3F, -5.8F, -1.2F, 1, 6, 2, 0.0F));

		SideHornL1 = new ModelRenderer(this);
		SideHornL1.setRotationPoint(4.1F, 0.3F, -1.1F);
        SideHornL1.mirror = true;
		bipedHead1.addChild(SideHornL1);
		SideHornL1.cubeList.add(new ModelBox(SideHornL1, 91, 20, -0.2F, -1.5F, -1.8F, 2, 3, 3, 0.0F));

		SideHornL2 = new ModelRenderer(this);
		SideHornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideHornL2.mirror = true;
		SideHornL1.addChild(SideHornL2);
		SideHornL2.cubeList.add(new ModelBox(SideHornL2, 80, 22, 1.7F, -0.9F, -1.3F, 3, 2, 2, 0.0F));

		SideHornL3 = new ModelRenderer(this);
		SideHornL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        SideHornL3.mirror = true;
		SideHornL2.addChild(SideHornL3);
		SideHornL3.cubeList.add(new ModelBox(SideHornL3, 73, 24, 4.7F, -0.5F, -0.8F, 2, 1, 1, 0.0F));

		TopHornR1 = new ModelRenderer(this);
		TopHornR1.setRotationPoint(-2.2F, -4.0F, -3.2F);
		bipedHead1.addChild(TopHornR1);
		setRotationAngle(TopHornR1, -0.9561F, -0.1745F, 0.0F);
		TopHornR1.cubeList.add(new ModelBox(TopHornR1, 128, 21, -1.4F, -3.9F, 0.0F, 3, 4, 4, 0.0F));

		TopHornR2 = new ModelRenderer(this);
		TopHornR2.setRotationPoint(0.3F, -4.1F, 1.7F);
		TopHornR1.addChild(TopHornR2);
		setRotationAngle(TopHornR2, -0.2276F, 0.0F, -0.0873F);
		TopHornR2.cubeList.add(new ModelBox(TopHornR2, 129, 11, -1.1F, -5.3F, -1.5F, 2, 6, 3, 0.0F));

		TopHornR3 = new ModelRenderer(this);
		TopHornR3.setRotationPoint(0.0F, -5.2F, 0.1F);
		TopHornR2.addChild(TopHornR3);
		setRotationAngle(TopHornR3, -0.2276F, 0.0F, -0.0873F);
		TopHornR3.cubeList.add(new ModelBox(TopHornR3, 130, 2, -0.7F, -5.8F, -1.2F, 1, 6, 2, 0.0F));

		SideHornR1 = new ModelRenderer(this);
		SideHornR1.setRotationPoint(-4.2F, 0.3F, -1.1F);
		bipedHead1.addChild(SideHornR1);
		SideHornR1.cubeList.add(new ModelBox(SideHornR1, 91, 20, -1.8F, -1.5F, -1.8F, 2, 3, 3, 0.0F));

		SideHornR2 = new ModelRenderer(this);
		SideHornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SideHornR1.addChild(SideHornR2);
		SideHornR2.cubeList.add(new ModelBox(SideHornR2, 80, 22, -4.6F, -0.9F, -1.3F, 3, 2, 2, 0.0F));

		SideHornR3 = new ModelRenderer(this);
		SideHornR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		SideHornR2.addChild(SideHornR3);
		SideHornR3.cubeList.add(new ModelBox(SideHornR3, 73, 24, -6.4F, -0.5F, -0.8F, 2, 1, 1, 0.0F));

		Jaw1 = new ModelRenderer(this);
		Jaw1.setRotationPoint(0.0F, 0.2F, 0.0F);
		bipedHead1.addChild(Jaw1);
		Jaw1.cubeList.add(new ModelBox(Jaw1, 99, 23, -3.0F, 0.8F, -5.5F, 6, 3, 5, 0.0F));

		JawR = new ModelRenderer(this);
		JawR.setRotationPoint(0.0F, 80.0F, 5.0F);
		Jaw1.addChild(JawR);
		JawR.cubeList.add(new ModelBox(JawR, 90, 29, -5.0F, -80.2753F, -9.0642F, 2, 3, 3, 0.0F));

		JawL = new ModelRenderer(this);
		JawL.setRotationPoint(0.0F, 80.0F, 5.0F);
		Jaw1.addChild(JawL);
		JawL.cubeList.add(new ModelBox(JawL, 90, 29, 3.0F, -80.2753F, -9.0642F, 2, 3, 3, 0.0F));

		Jaw2 = new ModelRenderer(this);
		Jaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Jaw1.addChild(Jaw2);
		Jaw2.cubeList.add(new ModelBox(Jaw2, 103, 32, -3.0F, 0.8F, -6.5F, 6, 2, 1, 0.0F));

		Jaw3 = new ModelRenderer(this);
		Jaw3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Jaw1.addChild(Jaw3);
		Jaw3.cubeList.add(new ModelBox(Jaw3, 104, 36, -2.0F, 0.8F, -7.5F, 4, 2, 1, 0.0F));

		TentacleR = new ModelRenderer(this);
		TentacleR.setRotationPoint(-1.5F, -3.5F, -5.6F);
		bipedHead1.addChild(TentacleR);
		setRotationAngle(TentacleR, 0.0F, -0.7741F, 0.2731F);
		TentacleR.cubeList.add(new ModelBox(TentacleR, 92, 3, -4.9F, -0.5F, 0.0F, 5, 3, 0, 0.0F));

		bipedBody1 = new ModelRenderer(this);
		bipedBody1.setRotationPoint(0.0F, -80.0F, 0.0F);
		setRotationAngle(bipedBody1, 0.2793F, 0.0F, 0.0F);
		bipedBody1.cubeList.add(new ModelBox(bipedBody1, 8, 51, -15.0F, 0.0F, -3.5F, 30, 16, 14, 0.0F));

		DragonFin1 = new ModelRenderer(this);
		DragonFin1.setRotationPoint(0.0F, 0.0F, 11.9F);
		bipedBody1.addChild(DragonFin1);
		DragonFin1.cubeList.add(new ModelBox(DragonFin1, 85, 62, 0.0F, -9.9F, -11.8F, 0, 26, 20, 0.0F));

		bipedBody2 = new ModelRenderer(this);
		bipedBody2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody1.addChild(bipedBody2);
		setRotationAngle(bipedBody2, -0.4554F, 0.0F, 0.0F);
		bipedBody2.cubeList.add(new ModelBox(bipedBody2, 15, 35, -11.0F, -4.7F, -0.7F, 22, 5, 10, 0.0F));

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 6.2F, -3.3F);
		bipedBody1.addChild(Chest);
		Chest.cubeList.add(new ModelBox(Chest, 84, 50, -12.0F, -3.7F, -3.2F, 24, 8, 3, 0.0F));

		bipedBody3 = new ModelRenderer(this);
		bipedBody3.setRotationPoint(0.0F, 13.0F, 1.7F);
		bipedBody1.addChild(bipedBody3);
		setRotationAngle(bipedBody3, -0.1745F, 0.0F, 0.0F);
		bipedBody3.cubeList.add(new ModelBox(bipedBody3, 12, 83, -11.0F, -0.2F, -5.3F, 22, 14, 13, 0.0F));

		bipedBody4 = new ModelRenderer(this);
		bipedBody4.setRotationPoint(0.0F, 12.8F, 0.0F);
		bipedBody3.addChild(bipedBody4);
		setRotationAngle(bipedBody4, 0.182F, 0.0F, 0.0911F);
		bipedBody4.cubeList.add(new ModelBox(bipedBody4, 17, 111, -8.5F, -1.0F, -4.8F, 17, 11, 11, 0.0F));

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(0.0F, 9.8F, 0.0F);
		bipedBody4.addChild(Tail1);
		setRotationAngle(Tail1, -0.0911F, 0.0F, 0.182F);
		Tail1.cubeList.add(new ModelBox(Tail1, 21, 135, -7.0F, -0.7F, -4.2F, 14, 10, 9, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 9.5F, 0.55F);
		Tail1.addChild(Tail2);
		setRotationAngle(Tail2, -0.3187F, 0.0F, -0.0456F);
		Tail2.cubeList.add(new ModelBox(Tail2, 49, 157, -6.0F, -0.7F, -3.9F, 12, 12, 8, 0.0F));

		DragonFin4 = new ModelRenderer(this);
		DragonFin4.setRotationPoint(0.0F, 4.2F, 2.5F);
		Tail2.addChild(DragonFin4);
		DragonFin4.cubeList.add(new ModelBox(DragonFin4, 95, 139, 0.0F, -6.4F, -0.1F, 0, 14, 9, 0.0F));

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 10.7F, -0.9F);
		Tail2.addChild(Tail3);
		setRotationAngle(Tail3, -0.5009F, -0.182F, -0.2276F);
		Tail3.cubeList.add(new ModelBox(Tail3, 50, 179, -5.4F, 0.0F, -3.9F, 10, 8, 7, 0.0F));

		Tail4 = new ModelRenderer(this);
		Tail4.setRotationPoint(0.0F, 7.1F, 0.0F);
		Tail3.addChild(Tail4);
		setRotationAngle(Tail4, -0.5009F, -0.182F, -0.4554F);
		Tail4.cubeList.add(new ModelBox(Tail4, 51, 196, -5.5F, 0.0F, -3.9F, 9, 10, 7, 0.0F));

		DragonFin6 = new ModelRenderer(this);
		DragonFin6.setRotationPoint(-1.2F, -6.5F, 2.5F);
		Tail4.addChild(DragonFin6);
		DragonFin6.cubeList.add(new ModelBox(DragonFin6, 95, 139, -0.6F, 6.2F, -0.1F, 0, 12, 9, 0.0F));

		Tail5 = new ModelRenderer(this);
		Tail5.setRotationPoint(-0.7F, 8.5F, 0.0F);
		Tail4.addChild(Tail5);
		setRotationAngle(Tail5, -0.4098F, -0.182F, -0.6829F);
		Tail5.cubeList.add(new ModelBox(Tail5, 51, 215, -4.5F, 0.0F, -3.9F, 7, 11, 7, 0.0F));

		DragonFin7 = new ModelRenderer(this);
		DragonFin7.setRotationPoint(-1.6F, -15.0F, 2.5F);
		Tail5.addChild(DragonFin7);
		DragonFin7.cubeList.add(new ModelBox(DragonFin7, 95, 139, 0.0F, 14.0F, -0.1F, 0, 14, 9, 0.0F));

		Tail6 = new ModelRenderer(this);
		Tail6.setRotationPoint(-0.4F, 10.3F, 1.1F);
		Tail5.addChild(Tail6);
		setRotationAngle(Tail6, -0.3643F, -0.3643F, -0.5918F);
		Tail6.cubeList.add(new ModelBox(Tail6, 52, 235, -5.0F, 0.0F, -3.9F, 7, 12, 7, 0.0F));

		DragonFin8 = new ModelRenderer(this);
		DragonFin8.setRotationPoint(-0.5F, -4.3F, 2.5F);
		Tail6.addChild(DragonFin8);
		DragonFin8.cubeList.add(new ModelBox(DragonFin8, 95, 139, 0.0F, 4.0F, -0.1F, 0, 14, 9, 0.0F));

		Tail7 = new ModelRenderer(this);
		Tail7.setRotationPoint(-1.8F, 12.9F, 0.0F);
		Tail6.addChild(Tail7);
		setRotationAngle(Tail7, -0.3187F, -0.2276F, -0.8196F);
		Tail7.cubeList.add(new ModelBox(Tail7, 21, 169, -3.0F, 0.0F, -3.9F, 6, 12, 7, 0.0F));

		Tail8 = new ModelRenderer(this);
		Tail8.setRotationPoint(0.0F, 11.8F, 0.9F);
		Tail7.addChild(Tail8);
		setRotationAngle(Tail8, -0.3187F, -0.2276F, -0.5009F);
		Tail8.cubeList.add(new ModelBox(Tail8, 21, 190, -3.2F, 0.0F, -3.9F, 5, 13, 6, 0.0F));

		Tail9 = new ModelRenderer(this);
		Tail9.setRotationPoint(-0.7F, 12.4F, -0.8F);
		Tail8.addChild(Tail9);
		setRotationAngle(Tail9, -0.3187F, 0.0F, -0.5918F);
		Tail9.cubeList.add(new ModelBox(Tail9, 21, 213, -2.3F, 0.0F, -2.7F, 5, 14, 5, 0.0F));

		DragonFin11 = new ModelRenderer(this);
		DragonFin11.setRotationPoint(1.4F, -21.0F, 2.5F);
		Tail9.addChild(DragonFin11);
		setRotationAngle(DragonFin11, 0.0F, 0.0F, 0.0456F);
		DragonFin11.cubeList.add(new ModelBox(DragonFin11, 96, 156, 0.0F, 20.0F, -0.1F, 0, 18, 8, 0.0F));

		Tail10 = new ModelRenderer(this);
		Tail10.setRotationPoint(0.1F, 13.8F, -0.1F);
		Tail9.addChild(Tail10);
		setRotationAngle(Tail10, -0.3187F, -0.3187F, -0.3643F);
		Tail10.cubeList.add(new ModelBox(Tail10, 21, 235, -2.1F, 0.0F, -2.7F, 4, 15, 5, 0.0F));

		DragonFin11_1 = new ModelRenderer(this);
		DragonFin11_1.setRotationPoint(2.1F, -33.0F, 3.3F);
		Tail10.addChild(DragonFin11_1);
		setRotationAngle(DragonFin11_1, 0.0F, 0.0F, 0.0456F);
		DragonFin11_1.cubeList.add(new ModelBox(DragonFin11_1, 96, 156, -0.4F, 33.7F, -0.1F, 0, 17, 8, 0.0F));

		Tail11 = new ModelRenderer(this);
		Tail11.setRotationPoint(0.2F, 14.7F, -0.05F);
		Tail10.addChild(Tail11);
		setRotationAngle(Tail11, -0.2276F, -0.1367F, -0.3643F);
		Tail11.cubeList.add(new ModelBox(Tail11, 0, 167, -2.1F, 0.0F, -2.7F, 4, 15, 5, 0.0F));

		DragonFin11_2 = new ModelRenderer(this);
		DragonFin11_2.setRotationPoint(-0.1F, 6.4F, 2.0F);
		Tail11.addChild(DragonFin11_2);
		setRotationAngle(DragonFin11_2, 0.0F, 0.0F, 0.0456F);
		DragonFin11_2.cubeList.add(new ModelBox(DragonFin11_2, 96, 156, 0.0F, -7.4F, -0.1F, 0, 16, 8, 0.0F));

		Tail12 = new ModelRenderer(this);
		Tail12.setRotationPoint(-0.1F, 14.4F, 0.1F);
		Tail11.addChild(Tail12);
		setRotationAngle(Tail12, -0.1367F, -0.182F, -0.5463F);
		Tail12.cubeList.add(new ModelBox(Tail12, 0, 189, -2.1F, 0.0F, -2.7F, 4, 15, 5, 0.0F));

		DragonFin11_3 = new ModelRenderer(this);
		DragonFin11_3.setRotationPoint(0.0F, 5.7F, 1.7F);
		Tail12.addChild(DragonFin11_3);
		setRotationAngle(DragonFin11_3, 0.0F, 0.0F, 0.0456F);
		DragonFin11_3.cubeList.add(new ModelBox(DragonFin11_3, 96, 156, 0.0F, -7.4F, 0.5F, 0, 18, 8, 0.0F));

		Tail13 = new ModelRenderer(this);
		Tail13.setRotationPoint(0.1F, 14.5F, -0.1F);
		Tail12.addChild(Tail13);
		setRotationAngle(Tail13, -0.1367F, -0.0911F, -0.5009F);
		Tail13.cubeList.add(new ModelBox(Tail13, 0, 211, -2.1F, 0.0F, -2.2F, 4, 15, 4, 0.0F));

		DragonFin11_4 = new ModelRenderer(this);
		DragonFin11_4.setRotationPoint(-0.1F, -15.0F, 0.1F);
		Tail13.addChild(DragonFin11_4);
		DragonFin11_4.cubeList.add(new ModelBox(DragonFin11_4, 96, 156, 0.0F, 15.7F, 0.0F, 0, 18, 8, 0.0F));

		Tail14 = new ModelRenderer(this);
		Tail14.setRotationPoint(-0.4F, 14.7F, -0.1F);
		Tail13.addChild(Tail14);
		setRotationAngle(Tail14, 0.0456F, -0.0911F, -0.3643F);
		Tail14.cubeList.add(new ModelBox(Tail14, 0, 232, -1.6F, 0.0F, -2.2F, 3, 9, 4, 0.0F));

		Tail15 = new ModelRenderer(this);
		Tail15.setRotationPoint(2.9F, -94.8F, -2.9F);
		Tail14.addChild(Tail15);
		setRotationAngle(Tail15, -0.0911F, -0.0911F, -0.2276F);
		Tail15.cubeList.add(new ModelBox(Tail15, 0, 246, -27.1F, 99.0F, 12.9F, 2, 7, 3, 0.0F));

		DragonFin10 = new ModelRenderer(this);
		DragonFin10.setRotationPoint(0.0F, 4.2F, 2.5F);
		Tail8.addChild(DragonFin10);
		DragonFin10.cubeList.add(new ModelBox(DragonFin10, 95, 139, -0.5F, -4.9F, -0.1F, 0, 14, 9, 0.0F));

		DragonFin9 = new ModelRenderer(this);
		DragonFin9.setRotationPoint(1.5F, -14.4F, 1.4F);
		Tail7.addChild(DragonFin9);
		setRotationAngle(DragonFin9, 0.0F, 0.0F, 0.2276F);
		DragonFin9.cubeList.add(new ModelBox(DragonFin9, 95, 139, 3.3F, 14.1F, -0.1F, 0, 14, 9, 0.0F));

		DragonFin5 = new ModelRenderer(this);
		DragonFin5.setRotationPoint(-0.5F, 5.1F, 2.5F);
		Tail3.addChild(DragonFin5);
		setRotationAngle(DragonFin5, 0.0F, 0.0F, 0.0911F);
		DragonFin5.cubeList.add(new ModelBox(DragonFin5, 95, 139, 0.0F, -7.0F, 0.1F, 0, 14, 9, 0.0F));

		DragonFin3 = new ModelRenderer(this);
		DragonFin3.setRotationPoint(0.0F, 5.5F, 4.6F);
		Tail1.addChild(DragonFin3);
		DragonFin3.cubeList.add(new ModelBox(DragonFin3, 93, 123, 0.0F, -6.7F, -0.2F, 0, 12, 11, 0.0F));

		Abs = new ModelRenderer(this);
		Abs.setRotationPoint(0.0F, 81.0F, -5.8F);
		bipedBody3.addChild(Abs);
		Abs.cubeList.add(new ModelBox(Abs, 98, 63, -6.0F, -83.0F, -1.2F, 12, 9, 2, 0.0F));

		DragonFin2 = new ModelRenderer(this);
		DragonFin2.setRotationPoint(0.0F, 5.9F, 7.5F);
		bipedBody3.addChild(DragonFin2);
		DragonFin2.cubeList.add(new ModelBox(DragonFin2, 93, 98, 0.0F, -6.4F, -2.5F, 0, 22, 12, 0.0F));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody1.addChild(Neck);
		setRotationAngle(Neck, -0.2731F, 0.0F, 0.0F);
		Neck.cubeList.add(new ModelBox(Neck, 28, 20, -5.8F, -4.1F, -5.1F, 12, 8, 5, 0.0F));

		ShoulderL = new ModelRenderer(this);
		ShoulderL.setRotationPoint(14.9F, -76.5F, 3.2F);
        ShoulderL.mirror = true;
		setRotationAngle(ShoulderL, -0.1309F, 0.0F, 0.0F);
		ShoulderL.cubeList.add(new ModelBox(ShoulderL, 144, 54, 0.1F, -3.6F, -5.0F, 11, 10, 10, 0.0F));

		ShoulderSpikeL1 = new ModelRenderer(this);
		ShoulderSpikeL1.setRotationPoint(9.5F, -2.0F, 0.0F);
        ShoulderSpikeL1.mirror = true;
		ShoulderL.addChild(ShoulderSpikeL1);
		setRotationAngle(ShoulderSpikeL1, 0.0F, 0.0F, 0.7854F);
		ShoulderSpikeL1.cubeList.add(new ModelBox(ShoulderSpikeL1, 191, 57, -3.0F, -2.5F, -3.5F, 6, 4, 7, 0.0F));

		ShoulderSpikeL2 = new ModelRenderer(this);
		ShoulderSpikeL2.setRotationPoint(-24.4F, 78.5F, -3.2F);
        ShoulderSpikeL2.mirror = true;
		ShoulderSpikeL1.addChild(ShoulderSpikeL2);
		ShoulderSpikeL2.cubeList.add(new ModelBox(ShoulderSpikeL2, 192, 46, 22.0F, -83.0F, 0.2F, 5, 2, 6, 0.0F));

		ShoulderSpikeL3 = new ModelRenderer(this);
		ShoulderSpikeL3.setRotationPoint(24.5F, -78.0F, 3.0F);
        ShoulderSpikeL3.mirror = true;
		ShoulderSpikeL2.addChild(ShoulderSpikeL3);
		ShoulderSpikeL3.cubeList.add(new ModelBox(ShoulderSpikeL3, 195, 37, -2.0F, -7.5F, -2.0F, 4, 3, 4, 0.0F));

		ShoulderSpikeL4 = new ModelRenderer(this);
		ShoulderSpikeL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ShoulderSpikeL4.mirror = true;
		ShoulderSpikeL3.addChild(ShoulderSpikeL4);
		ShoulderSpikeL4.cubeList.add(new ModelBox(ShoulderSpikeL4, 196, 28, -1.5F, -11.4F, -1.5F, 3, 4, 3, 0.0F));

		ShoulderSpikeL5 = new ModelRenderer(this);
		ShoulderSpikeL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ShoulderSpikeL5.mirror = true;
		ShoulderSpikeL4.addChild(ShoulderSpikeL5);
		ShoulderSpikeL5.cubeList.add(new ModelBox(ShoulderSpikeL5, 198, 19, -1.0F, -16.3F, -1.0F, 2, 5, 2, 0.0F));

		BicepL = new ModelRenderer(this);
		BicepL.setRotationPoint(6.1F, 5.7F, 0.0F);
        BicepL.mirror = true;
		ShoulderL.addChild(BicepL);
		setRotationAngle(BicepL, 0.1222F, 0.0F, -0.0911F);
		BicepL.cubeList.add(new ModelBox(BicepL, 146, 76, -4.5F, 0.0F, -4.5F, 9, 11, 9, 0.0F));

		ForeArmL = new ModelRenderer(this);
		ForeArmL.setRotationPoint(0.0F, 10.5F, 0.0F);
        ForeArmL.mirror = true;
		BicepL.addChild(ForeArmL);
		setRotationAngle(ForeArmL, -0.5009F, 0.0911F, 0.1367F);
		ForeArmL.cubeList.add(new ModelBox(ForeArmL, 149, 98, -4.5F, -0.5F, -3.6F, 8, 13, 7, 0.0F));

		PalmL1 = new ModelRenderer(this);
		PalmL1.setRotationPoint(-1.4F, 12.35F, 0.05F);
        PalmL1.mirror = true;
		ForeArmL.addChild(PalmL1);
		setRotationAngle(PalmL1, 3.1395F, -0.656F, 3.0893F);
		PalmL1.cubeList.add(new ModelBox(PalmL1, 148, 119, -3.7F, 0.0F, -3.0F, 7, 7, 4, 0.0F));

		LFingerT1 = new ModelRenderer(this);
		LFingerT1.setRotationPoint(-3.3F, -6.7F, 0.0F);
		PalmL1.addChild(LFingerT1);
        LFingerT1.mirror = true;
		setRotationAngle(LFingerT1, 0.0F, 0.5918F, -0.182F);
		LFingerT1.cubeList.add(new ModelBox(LFingerT1, 172, 127, -4.65F, 8.6F, -2.8F, 3, 2, 3, 0.0F));

		LFingersT2 = new ModelRenderer(this);
		LFingersT2.setRotationPoint(-1.1F, -12.5F, 0.0F);
		LFingerT1.addChild(LFingersT2);
        LFingersT2.mirror = true;
		setRotationAngle(LFingersT2, 0.0F, 1.0472F, 0.0F);
		LFingersT2.cubeList.add(new ModelBox(LFingersT2, 173, 133, -4.85F, 21.55F, -4.45F, 5, 1, 2, 0.0F));

		LFingerL1 = new ModelRenderer(this);
		LFingerL1.setRotationPoint(2.2F, 7.1F, 0.4F);
		PalmL1.addChild(LFingerL1);
        LFingerL1.mirror = true;
		setRotationAngle(LFingerL1, 0.6374F, -0.0075F, -0.182F);
		LFingerL1.cubeList.add(new ModelBox(LFingerL1, 148, 133, -0.9F, -2.2F, -2.3F, 2, 4, 3, 0.0F));

		LFingerL2 = new ModelRenderer(this);
		LFingerL2.setRotationPoint(1.3F, -20.8F, -0.2F);
		LFingerL1.addChild(LFingerL2);
        LFingerL2.mirror = true;
		setRotationAngle(LFingerL2, 0.8652F, 0.0F, 0.0F);
		LFingerL2.cubeList.add(new ModelBox(LFingerL2, 160, 141, -1.6F, 13.1F, -18.6F, 1, 5, 2, 0.0F));

		LFingerP1 = new ModelRenderer(this);
		LFingerP1.setRotationPoint(-2.8F, 6.8F, -0.3F);
		PalmL1.addChild(LFingerP1);
        LFingerP1.mirror = true;
		setRotationAngle(LFingerP1, 0.5918F, 0.0456F, 0.2276F);
		LFingerP1.cubeList.add(new ModelBox(LFingerP1, 159, 132, -1.2F, -1.1F, -2.0F, 2, 5, 3, 0.0F));

		LFingerP2 = new ModelRenderer(this);
		LFingerP2.setRotationPoint(-0.3F, 3.7F, -0.4F);
		LFingerP1.addChild(LFingerP2);
        LFingerP2.mirror = true;
		setRotationAngle(LFingerP2, 0.8652F, 0.0F, 0.0F);
		LFingerP2.cubeList.add(new ModelBox(LFingerP2, 160, 141, -0.5F, -1.1F, -0.9F, 1, 5, 2, 0.0F));

		LFingerM1 = new ModelRenderer(this);
		LFingerM1.setRotationPoint(-0.8F, 7.3F, 0.0F);
        LFingerM1.mirror = true;
		PalmL1.addChild(LFingerM1);
		setRotationAngle(LFingerM1, 0.2276F, 0.0F, 0.1395F);
		LFingerM1.cubeList.add(new ModelBox(LFingerM1, 159, 132, -1.2F, -1.2F, -2.3F, 2, 5, 3, 0.0F));

		LFingerM2 = new ModelRenderer(this);
		LFingerM2.setRotationPoint(2.3F, 3.2F, -0.4F);
        LFingerM2.mirror = true;
		LFingerM1.addChild(LFingerM2);
		setRotationAngle(LFingerM2, 1.0016F, 0.0F, 0.0F);
		LFingerM2.cubeList.add(new ModelBox(LFingerM2, 160, 141, -0.5F, -1.0F, -0.8F, 1, 5, 2, 0.0F));

		PalmL2 = new ModelRenderer(this);
		PalmL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        PalmL2.mirror = true;
		PalmL1.addChild(PalmL2);
		PalmL2.cubeList.add(new ModelBox(PalmL2, 171, 119, -4.5F, 1.9F, -1.8F, 1, 3, 3, 0.0F));

		LFingerR1 = new ModelRenderer(this);
		LFingerR1.setRotationPoint(1.1F, 7.9F, 0.0F);
		PalmL1.addChild(LFingerR1);
        LFingerR1.mirror = true;
		setRotationAngle(LFingerR1, 0.3187F, 0.0F, 0.0F);
		LFingerR1.cubeList.add(new ModelBox(LFingerR1, 159, 132, -1.1F, -2.2F, -2.3F, 2, 5, 3, 0.0F));

		LFingerR2 = new ModelRenderer(this);
		LFingerR2.setRotationPoint(1.3F, -20.1F, -0.3F);
		LFingerR1.addChild(LFingerR2);
        LFingerR1.mirror = true;
		setRotationAngle(LFingerR2, 1.0016F, 0.0F, 0.0F);
		LFingerR2.cubeList.add(new ModelBox(LFingerR2, 160, 141, -4.2F, 11.1F, -20.4F, 1, 5, 2, 0.0F));

		ShoulderR = new ModelRenderer(this);
		ShoulderR.setRotationPoint(-14.9F, -76.5F, 3.2F);
		setRotationAngle(ShoulderR, -0.1309F, 0.0F, 0.0F);
		ShoulderR.cubeList.add(new ModelBox(ShoulderR, 144, 54, -11.1F, -3.6F, -5.0F, 11, 10, 10, 0.0F));

		ShoulderSpikeR6 = new ModelRenderer(this);
		ShoulderSpikeR6.setRotationPoint(-9.5F, -2.0F, 0.0F);
		ShoulderR.addChild(ShoulderSpikeR6);
		setRotationAngle(ShoulderSpikeR6, 0.0F, 0.0F, -0.7854F);
		ShoulderSpikeR6.cubeList.add(new ModelBox(ShoulderSpikeR6, 191, 57, -3.0F, -2.5F, -3.5F, 6, 4, 7, 0.0F));

		ShoulderSpikeR7 = new ModelRenderer(this);
		ShoulderSpikeR7.setRotationPoint(24.4F, 78.5F, -3.2F);
		ShoulderSpikeR6.addChild(ShoulderSpikeR7);
		ShoulderSpikeR7.cubeList.add(new ModelBox(ShoulderSpikeR7, 192, 46, -27.0F, -83.0F, 0.2F, 5, 2, 6, 0.0F));

		ShoulderSpikeL8 = new ModelRenderer(this);
		ShoulderSpikeL8.setRotationPoint(-24.5F, -78.0F, 3.0F);
		ShoulderSpikeR7.addChild(ShoulderSpikeL8);
		ShoulderSpikeL8.cubeList.add(new ModelBox(ShoulderSpikeL8, 195, 37, -2.0F, -7.5F, -2.0F, 4, 3, 4, 0.0F));

		ShoulderSpikeL9 = new ModelRenderer(this);
		ShoulderSpikeL9.setRotationPoint(0.0F, 0.0F, 0.0F);
		ShoulderSpikeL8.addChild(ShoulderSpikeL9);
		ShoulderSpikeL9.cubeList.add(new ModelBox(ShoulderSpikeL9, 196, 28, -1.5F, -11.4F, -1.5F, 3, 4, 3, 0.0F));

		ShoulderSpikeL10 = new ModelRenderer(this);
		ShoulderSpikeL10.setRotationPoint(0.0F, 0.0F, 0.0F);
		ShoulderSpikeL9.addChild(ShoulderSpikeL10);
		ShoulderSpikeL10.cubeList.add(new ModelBox(ShoulderSpikeL10, 198, 19, -1.0F, -16.3F, -1.0F, 2, 5, 2, 0.0F));

		BicepR2 = new ModelRenderer(this);
		BicepR2.setRotationPoint(-6.1F, 5.7F, 0.0F);
		ShoulderR.addChild(BicepR2);
		setRotationAngle(BicepR2, 0.1222F, 0.0F, 0.0911F);
		BicepR2.cubeList.add(new ModelBox(BicepR2, 146, 76, -4.5F, 0.0F, -4.5F, 9, 11, 9, 0.0F));

		ForeArmR2 = new ModelRenderer(this);
		ForeArmR2.setRotationPoint(0.0F, 10.5F, 0.0F);
		BicepR2.addChild(ForeArmR2);
		setRotationAngle(ForeArmR2, -0.5009F, -0.0911F, -0.1367F);
		ForeArmR2.cubeList.add(new ModelBox(ForeArmR2, 149, 98, -3.5F, -0.5F, -3.6F, 8, 13, 7, 0.0F));

		PalmR3 = new ModelRenderer(this);
		PalmR3.setRotationPoint(1.4F, 12.35F, 0.05F);
		ForeArmR2.addChild(PalmR3);
		setRotationAngle(PalmR3, 3.1395F, 0.656F, -3.0893F);
		PalmR3.cubeList.add(new ModelBox(PalmR3, 148, 119, -3.3F, 0.0F, -3.0F, 7, 7, 4, 0.0F));

		LFingerT2 = new ModelRenderer(this);
		LFingerT2.setRotationPoint(3.3F, -6.7F, 0.0F);
		PalmR3.addChild(LFingerT2);
		setRotationAngle(LFingerT2, 0.0F, -0.5918F, 0.182F);
		LFingerT2.cubeList.add(new ModelBox(LFingerT2, 172, 127, 1.65F, 8.6F, -2.8F, 3, 2, 3, 0.0F));

		LFingersT3 = new ModelRenderer(this);
		LFingersT3.setRotationPoint(1.1F, -12.5F, 0.0F);
		LFingerT2.addChild(LFingersT3);
		setRotationAngle(LFingersT3, 0.0F, -1.0472F, 0.0F);
		LFingersT3.cubeList.add(new ModelBox(LFingersT3, 173, 133, -0.15F, 21.55F, -4.45F, 5, 1, 2, 0.0F));

		LFingerL3 = new ModelRenderer(this);
		LFingerL3.setRotationPoint(-2.2F, 7.1F, 0.4F);
		PalmR3.addChild(LFingerL3);
		setRotationAngle(LFingerL3, 0.6374F, 0.0075F, 0.182F);
		LFingerL3.cubeList.add(new ModelBox(LFingerL3, 148, 133, -1.1F, -2.2F, -2.3F, 2, 4, 3, 0.0F));

		LFingerL4 = new ModelRenderer(this);
		LFingerL4.setRotationPoint(-1.3F, -20.8F, -0.2F);
		LFingerL3.addChild(LFingerL4);
		setRotationAngle(LFingerL4, 0.8652F, 0.0F, 0.0F);
		LFingerL4.cubeList.add(new ModelBox(LFingerL4, 160, 141, 0.6F, 13.1F, -18.6F, 1, 5, 2, 0.0F));

		LFingerP3 = new ModelRenderer(this);
		LFingerP3.setRotationPoint(2.8F, 6.8F, -0.3F);
		PalmR3.addChild(LFingerP3);
		setRotationAngle(LFingerP3, 0.5918F, -0.0456F, -0.2276F);
		LFingerP3.cubeList.add(new ModelBox(LFingerP3, 159, 132, -0.8F, -1.1F, -2.0F, 2, 5, 3, 0.0F));

		LFingerP4 = new ModelRenderer(this);
		LFingerP4.setRotationPoint(0.3F, 3.7F, -0.4F);
		LFingerP3.addChild(LFingerP4);
		setRotationAngle(LFingerP4, 0.8652F, 0.0F, 0.0F);
		LFingerP4.cubeList.add(new ModelBox(LFingerP4, 160, 141, -0.5F, -1.1F, -0.9F, 1, 5, 2, 0.0F));

		LFingerM3 = new ModelRenderer(this);
		LFingerM3.setRotationPoint(0.8F, 7.3F, 0.0F);
		PalmR3.addChild(LFingerM3);
		setRotationAngle(LFingerM3, 0.2276F, 0.0F, -0.1395F);
		LFingerM3.cubeList.add(new ModelBox(LFingerM3, 159, 132, -0.8F, -1.2F, -2.3F, 2, 5, 3, 0.0F));

		LFingerM4 = new ModelRenderer(this);
		LFingerM4.setRotationPoint(-2.3F, 3.2F, -0.4F);
		LFingerM3.addChild(LFingerM4);
		setRotationAngle(LFingerM4, 1.0016F, 0.0F, 0.0F);
		LFingerM4.cubeList.add(new ModelBox(LFingerM4, 160, 141, -0.5F, -1.0F, -0.8F, 1, 5, 2, 0.0F));

		PalmL4 = new ModelRenderer(this);
		PalmL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		PalmR3.addChild(PalmL4);
		PalmL4.cubeList.add(new ModelBox(PalmL4, 171, 119, 3.5F, 1.9F, -1.8F, 1, 3, 3, 0.0F));

		LFingerR3 = new ModelRenderer(this);
		LFingerR3.setRotationPoint(-1.1F, 7.9F, 0.0F);
		PalmR3.addChild(LFingerR3);
		setRotationAngle(LFingerR3, 0.3187F, 0.0F, 0.0F);
		LFingerR3.cubeList.add(new ModelBox(LFingerR3, 159, 132, -0.9F, -2.2F, -2.3F, 2, 5, 3, 0.0F));

		LFingerR4 = new ModelRenderer(this);
		LFingerR4.setRotationPoint(-1.3F, -20.1F, -0.3F);
		LFingerR3.addChild(LFingerR4);
		setRotationAngle(LFingerR4, 1.0016F, 0.0F, 0.0F);
		LFingerR4.cubeList.add(new ModelBox(LFingerR4, 160, 141, 3.2F, 11.1F, -20.4F, 1, 5, 2, 0.0F));
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glScalef(this.scale, this.scale, this.scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
        this.bipedHead1.render(f5);
        this.ShoulderR.render(f5);
        this.bipedBody1.render(f5);
        this.ShoulderL.render(f5);
        GL11.glPopMatrix();
    }

    public void renderModel(Entity entity, float f) {
        render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f);
    }

    public void renderModel2(Entity entity, float f) {
        render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        f2 = entity.ticksExisted;
        boolean update = (f2 > this.last_update_tick);
        this.last_update_tick = f2;
        float rotation = 0.0F;
        float ANIMATION_MULTI = 1.0F;
        float ANIMATION_MULTI2 = 3.0F;
        this.bipedHead1.rotateAngleX = 0.5F;
        float r = MathHelper.sin(f2 * 0.01F * 3.0F) * 0.05F * 1.0F + 0.15F;
        float r2 = MathHelper.sin(f2 * 0.001F * 3.0F) * 0.05F * 1.0F + 0.15F;
        float ANIMATION_MULTI3 = 5.0F;
        float r3 = MathHelper.sin(f2 * 0.01F * 5.0F) * 0.05F * 1.0F + 0.15F;
        this.Jaw1.rotateAngleX = r;
        rotation = -r2 * 0.5F;
        this.ShoulderR.rotateAngleX = rotation * 1.0F;
        rotation = r2 * 0.05F;
        this.ShoulderR.rotateAngleZ = rotation * 1.0F;
        rotation = -r2;
        this.BicepR2.rotateAngleX = rotation * 1.0F;
        rotation = r2 * 1.0F;
        this.BicepR2.rotateAngleZ = rotation * 1.0F;
        rotation = -r2 - 0.2F;
        this.ForeArmR2.rotateAngleX = rotation * 1.0F;
        rotation = -r2 * 1.0F;
        this.ForeArmR2.rotateAngleZ = rotation * 1.0F;
        rotation = -r2 * 1.0F;
        this.LFingerT2.rotateAngleX = rotation * 1.0F;
        rotation = -r2 * 2.0F;
        this.LFingerT2.rotateAngleY = rotation * 1.0F;
        rotation = -r2 * 2.0F;
        this.LFingerL3.rotateAngleX = -rotation * 1.0F;
        this.LFingerR3.rotateAngleX = -rotation * 1.0F;
        this.LFingerM3.rotateAngleX = -rotation * 1.0F;
        this.LFingerP3.rotateAngleX = -rotation * 1.0F;
        rotation = 2.0F + r2 * 1.0F;
        this.PalmR3.rotateAngleY = rotation * 1.0F;
        rotation = r3 * 1.0F;
        this.bipedBody1.rotateAngleX = rotation * 1.0F;
        rotation = -r3 * 1.0F;
        this.bipedBody3.rotateAngleX = rotation * 1.0F;
        rotation = -r3 * 0.5F;
        float rotation2 = rotation * 1.0F;
        this.Tail1.rotateAngleY = rotation2 * 1.0F;
        this.Tail2.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.18203785F;
        this.Tail3.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.18203785F;
        this.Tail4.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.18203785F;
        this.Tail5.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.3642502F;
        this.Tail6.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.22759093F;
        this.Tail7.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.22759093F;
        this.Tail8.rotateAngleY = rotation2 * 1.0F;
        rotation2 = r3 * 1.6F;
        this.Tail9.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.31869712F;
        this.Tail10.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.13665928F;
        this.Tail11.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.18203785F;
        this.Tail12.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.091106184F;
        this.Tail13.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.091106184F;
        this.Tail14.rotateAngleY = rotation2 * 1.0F;
        rotation2 = rotation + -0.091106184F;
        this.Tail15.rotateAngleY = rotation2 * 1.0F;
        if (!this.whis_granted) {
            rotation = -r2 * 0.5F;
            this.ShoulderL.rotateAngleX = rotation * 1.0F;
            rotation = -r2 * 0.05F;
            this.ShoulderL.rotateAngleZ = rotation * 1.0F;
            rotation = -r2;
            this.BicepL.rotateAngleX = rotation * 1.0F;
            rotation = -r2 * 1.0F;
            this.BicepL.rotateAngleZ = rotation * 1.0F;
            rotation = -r2 - 0.2F;
            this.ForeArmL.rotateAngleX = rotation * 1.0F;
            rotation = r2 * 1.0F;
            this.ForeArmL.rotateAngleZ = rotation * 1.0F;
            rotation = -r2 * 1.0F;
            this.LFingerT1.rotateAngleX = rotation * 1.0F;
            rotation = -r2 * 2.0F;
            this.LFingerT1.rotateAngleY = -rotation * 1.0F;
            rotation = -r2 * 2.0F;
            this.LFingerL1.rotateAngleX = -rotation * 1.0F;
            this.LFingerR1.rotateAngleX = -rotation * 1.0F;
            this.LFingerM1.rotateAngleX = -rotation * 1.0F;
            this.LFingerP1.rotateAngleX = -rotation * 1.0F;
            rotation = -r2 * 2.0F;
            this.LFingersT2.rotateAngleY = 1.0471976F;
            this.LFingerL2.rotateAngleX = 0.8651597F;
            this.LFingerR2.rotateAngleX = 1.0016445F;
            this.LFingerM2.rotateAngleX = 1.0016445F;
            this.LFingerP2.rotateAngleX = 0.8651597F;
            rotation = -2.0F - r2 * 1.0F;
            this.PalmL1.rotateAngleY = rotation * 1.0F;
        } else {
            rotation = -r2 * 0.5F;
            this.ShoulderL.rotateAngleX = rotation * 1.0F;
            rotation = -r2 * 0.05F;
            this.ShoulderL.rotateAngleZ = rotation * 1.0F;
            rotation = -r2;
            this.BicepL.rotateAngleX = -0.4F;
            rotation = -r2 * 1.0F;
            this.BicepL.rotateAngleZ = -0.6F;
            rotation = -r2 - 0.2F;
            this.ForeArmL.rotateAngleX = -1.5F;
            rotation = r2 * 1.0F;
            this.ForeArmL.rotateAngleZ = rotation * 1.0F;
            this.LFingerT1.rotateAngleX = -1.8F;
            this.LFingerT1.rotateAngleY = 1.6F;
            this.LFingerL1.rotateAngleX = 0.1F;
            this.LFingerR1.rotateAngleX = 0.0F;
            this.LFingerM1.rotateAngleX = 0.0F;
            this.LFingerP1.rotateAngleX = 1.1F;
            this.LFingersT2.rotateAngleY = 0.5F;
            this.LFingerL2.rotateAngleX = 0.2F;
            this.LFingerR2.rotateAngleX = 0.2F;
            this.LFingerM2.rotateAngleX = 0.2F;
            this.LFingerP2.rotateAngleX = 1.2F;
            this.PalmL1.rotateAngleY = -2.0F;
        }
    }
}
