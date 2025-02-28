package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Modeltamagami_2 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer horns;
	private final ModelRenderer lefthorn_r1;
	private final ModelRenderer righthorn_r1;
	private final ModelRenderer eyes;
	private final ModelRenderer lefteye_r1;
	private final ModelRenderer righteye_r1;
	private final ModelRenderer ears;
	private final ModelRenderer Body;
	private final ModelRenderer LArm;
	private final ModelRenderer rightshoulder;
	private final ModelRenderer cube_r8;
	private final ModelRenderer rightarmbones;
	private final ModelRenderer righthand;
	private final ModelRenderer rightfingers;
	private final ModelRenderer trident;
	private final ModelRenderer cube_r9;
	private final ModelRenderer chest;
	private final ModelRenderer top;
	private final ModelRenderer middle;
	private final ModelRenderer bottom;
	private final ModelRenderer back;
	private final ModelRenderer rightspike;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leftspike;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer dragonball;
	private final ModelRenderer RArm;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftshoulder;
	private final ModelRenderer cube_r7;
	private final ModelRenderer leftarmbones;
	private final ModelRenderer lefthand;
	private final ModelRenderer leftfingers;
	private final ModelRenderer RLeg;
	private final ModelRenderer bone_r1;
	private final ModelRenderer leftfoot;
	private final ModelRenderer LLeg;
	private final ModelRenderer bone_r2;
	private final ModelRenderer rightfoot;
    private float scale = 1.0F;

	public Modeltamagami_2(float _scale) {
		textureWidth = 256;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -43.0F, -1.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -3.5F, -9.0F, -3.0F, 7, 9, 8, 0.0F));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, -3.0F, 1.0F);
		Head.addChild(horns);


		lefthorn_r1 = new ModelRenderer(this);
		lefthorn_r1.setRotationPoint(-3.75F, -6.5F, 2.0F);
		horns.addChild(lefthorn_r1);
		setRotationAngle(lefthorn_r1, -0.4363F, 0.0F, -0.6981F);
		lefthorn_r1.cubeList.add(new ModelBox(lefthorn_r1, 25, 1, -1.5F, -1.5F, -0.5F, 3, 4, 1, 0.0F));

		righthorn_r1 = new ModelRenderer(this);
		righthorn_r1.setRotationPoint(3.75F, -6.5F, 2.0F);
		horns.addChild(righthorn_r1);
		setRotationAngle(righthorn_r1, -0.4363F, 0.0F, 0.6981F);
		righthorn_r1.cubeList.add(new ModelBox(righthorn_r1, 25, 1, -1.5F, -1.5F, -0.5F, 3, 4, 1, 0.0F));

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(0.0F, 1.5F, 0.0F);
		Head.addChild(eyes);


		lefteye_r1 = new ModelRenderer(this);
		lefteye_r1.setRotationPoint(-2.0F, -5.75F, -3.5F);
		eyes.addChild(lefteye_r1);
		setRotationAngle(lefteye_r1, 0.0F, 0.0F, 0.48F);
		lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 34, 1, -2.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F));

		righteye_r1 = new ModelRenderer(this);
		righteye_r1.setRotationPoint(2.0F, -5.75F, -3.5F);
		eyes.addChild(righteye_r1);
        righteye_r1.mirror = true;
		setRotationAngle(righteye_r1, 0.0F, 0.0F, -0.48F);
		righteye_r1.cubeList.add(new ModelBox(righteye_r1, 34, 1, -1.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F));

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 1.0F, 0.0F);
		Head.addChild(ears);
        ears.mirror = true;
		ears.cubeList.add(new ModelBox(ears, 27, 21, 3.5F, -6.0F, -0.5F, 1, 2, 2, 0.0F));
		ears.cubeList.add(new ModelBox(ears, 27, 21, -4.5F, -6.0F, -0.5F, 1, 2, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, -4.0F);


		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(15.0F, -39.0F, 4.0F);
		Body.addChild(LArm);


		rightshoulder = new ModelRenderer(this);
		rightshoulder.setRotationPoint(-4.0F, -2.0F, -4.0F);
		LArm.addChild(rightshoulder);
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 39, 0, -1.0F, -2.0F, -0.5F, 9, 9, 9, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(8.75F, -2.75F, 4.0F);
		rightshoulder.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 0, -1.5F, -1.5F, -0.5F, 3, 4, 1, 0.0F));

		rightarmbones = new ModelRenderer(this);
		rightarmbones.setRotationPoint(14.0F, -2.0F, -4.0F);
		LArm.addChild(rightarmbones);
        rightarmbones.mirror = true;
		rightarmbones.cubeList.add(new ModelBox(rightarmbones, 37, 21, -16.5F, 7.0F, 2.0F, 4, 10, 4, 0.0F));
		rightarmbones.cubeList.add(new ModelBox(rightarmbones, 56, 19, -17.0F, 18.0F, 1.0F, 6, 20, 6, 0.0F));
		rightarmbones.cubeList.add(new ModelBox(rightarmbones, 85, 30, -16.0F, 16.0F, 2.5F, 3, 3, 3, 0.0F));

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(14.0F, -2.0F, -4.0F);
		LArm.addChild(righthand);
        righthand.mirror = true;
		righthand.cubeList.add(new ModelBox(righthand, 78, 2, -17.0F, 38.0F, 1.0F, 6, 6, 6, 0.0F));

		rightfingers = new ModelRenderer(this);
		rightfingers.setRotationPoint(-15.0F, 45.0F, 0.0F);
		righthand.addChild(rightfingers);
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -3.0F, -4.0F, -0.5F, 2, 4, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -1.5F, -1.0F, 1.0F, 2, 4, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -1.5F, -1.0F, 3.0F, 2, 4, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -1.5F, -1.0F, 5.0F, 2, 4, 2, 0.0F));

		trident = new ModelRenderer(this);
		trident.setRotationPoint(-16.0F, 43.4F, 51.1F);
		righthand.addChild(trident);
		setRotationAngle(trident, 1.5708F, 0.0F, -1.5708F);
		trident.cubeList.add(new ModelBox(trident, 205, 14, -7.5F, -104.4F, -0.1F, 15, 20, 1, 0.0F));
		trident.cubeList.add(new ModelBox(trident, 208, 37, -1.0F, -89.4F, -1.1F, 2, 18, 2, 0.0F));
		trident.cubeList.add(new ModelBox(trident, 219, 38, -0.5F, -71.4F, -0.6F, 1, 64, 1, 0.0F));
		trident.cubeList.add(new ModelBox(trident, 217, 105, -1.0F, -7.4F, -1.1F, 2, 6, 2, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.4F, -0.1F);
		trident.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 217, 115, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.025F));

		chest = new ModelRenderer(this);
		chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(chest);
		chest.cubeList.add(new ModelBox(chest, 0, 18, -3.0F, -43.0F, 1.0F, 6, 3, 6, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 54, 85, -5.0F, -37.0F, -0.925F, 10, 5, 5, 0.025F));
		chest.cubeList.add(new ModelBox(chest, 55, 97, -5.0F, -32.0F, 0.05F, 10, 5, 4, 0.025F));

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 0.0F, 0.0F);
		chest.addChild(top);
		top.cubeList.add(new ModelBox(top, 0, 42, -7.0F, -42.0F, -1.0F, 14, 2, 10, 0.0F));
		top.cubeList.add(new ModelBox(top, 0, 60, -11.0F, -40.0F, -1.0F, 22, 8, 10, 0.0F));

		middle = new ModelRenderer(this);
		middle.setRotationPoint(0.0F, 0.0F, 0.0F);
		chest.addChild(middle);
		middle.cubeList.add(new ModelBox(middle, 56, 47, -9.0F, -32.0F, 0.0F, 18, 6, 8, 0.0F));
		middle.cubeList.add(new ModelBox(middle, 66, 67, -6.0F, -26.0F, 0.5F, 12, 6, 7, 0.0F));
		middle.cubeList.add(new ModelBox(middle, 106, 60, -5.0F, -20.0F, 1.0F, 10, 5, 6, 0.0F));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		chest.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 99, 74, -7.0F, -15.0F, 0.0F, 14, 5, 8, 0.0F));
		bottom.cubeList.add(new ModelBox(bottom, 103, 42, -3.0F, -10.0F, 0.0F, 6, 3, 8, 0.0F));

		back = new ModelRenderer(this);
		back.setRotationPoint(0.0F, -27.0F, 11.0F);
		chest.addChild(back);


		rightspike = new ModelRenderer(this);
		rightspike.setRotationPoint(7.5F, -6.0F, -1.0F);
		back.addChild(rightspike);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.25F, 23.0F, 11.0F);
		rightspike.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1745F, 0.0F, -0.2182F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 24, -1.0F, -6.0F, -1.0F, 2, 12, 2, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.25F, 10.0F, 8.0F);
		rightspike.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2618F, 0.0F, -0.2182F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 127, 18, -2.0F, -8.0F, -2.0F, 4, 16, 4, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, 0.0F, 2.0F);
		rightspike.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9163F, 0.0F, -0.2182F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 104, 2, -3.0F, -6.0F, -3.0F, 6, 12, 6, 0.0F));

		leftspike = new ModelRenderer(this);
		leftspike.setRotationPoint(-3.5F, -6.0F, -1.0F);
		back.addChild(leftspike);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.25F, 23.0F, 11.25F);
		leftspike.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.2182F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 24, -1.0F, -6.0F, -1.0F, 2, 12, 2, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.25F, 10.0F, 8.0F);
		leftspike.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.2182F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 127, 18, -2.0F, -8.0F, -2.0F, 4, 16, 4, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, 0.0F, 2.0F);
		leftspike.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.9163F, 0.0F, 0.2182F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 104, 2, -3.0F, -6.0F, -3.0F, 6, 12, 6, 0.0F));

		dragonball = new ModelRenderer(this);
		dragonball.setRotationPoint(0.0F, -27.0F, 0.0F);
		chest.addChild(dragonball);
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 112, -3.0F, -1.0F, -3.0F, 6, 1, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 112, -3.0F, -8.0F, -3.0F, 6, 1, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 114, 116, -4.0F, -7.0F, -3.0F, 1, 6, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 114, 116, 3.0F, -7.0F, -3.0F, 1, 6, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 121, -3.0F, -7.0F, -4.0F, 6, 6, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 121, -3.0F, -7.0F, 3.0F, 6, 6, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 112, -2.0F, -4.5F, -0.5F, 1, 1, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 112, 1.0F, -4.5F, -0.5F, 1, 1, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-15.0F, -39.0F, 4.0F);
		Body.addChild(RArm);


		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(16.0F, -2.0F, -4.0F);
		RArm.addChild(leftarm);


		leftshoulder = new ModelRenderer(this);
		leftshoulder.setRotationPoint(-18.0F, 0.0F, 0.0F);
		leftarm.addChild(leftshoulder);
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 39, 0, -2.0F, -2.0F, -0.5F, 9, 9, 9, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.75F, -2.75F, 4.0F);
		leftshoulder.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 67, 0, -1.5F, -1.5F, -0.5F, 3, 4, 1, 0.0F));

		leftarmbones = new ModelRenderer(this);
		leftarmbones.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarmbones);
		leftarmbones.cubeList.add(new ModelBox(leftarmbones, 37, 21, -17.5F, 7.0F, 2.0F, 4, 10, 4, 0.0F));
		leftarmbones.cubeList.add(new ModelBox(leftarmbones, 56, 19, -18.5F, 18.0F, 1.0F, 6, 20, 6, 0.0F));
		leftarmbones.cubeList.add(new ModelBox(leftarmbones, 85, 30, -17.0F, 16.0F, 2.5F, 3, 3, 3, 0.0F));

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(lefthand);
		lefthand.cubeList.add(new ModelBox(lefthand, 78, 2, -18.5F, 38.0F, 1.0F, 6, 6, 6, 0.0F));

		leftfingers = new ModelRenderer(this);
		leftfingers.setRotationPoint(-15.0F, 45.0F, 0.0F);
		lefthand.addChild(leftfingers);
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, 1.0F, -4.0F, -0.5F, 2, 4, 2, 0.0F));
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, -0.5F, -1.0F, 1.0F, 2, 4, 2, 0.0F));
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, -0.5F, -1.0F, 3.0F, 2, 4, 2, 0.0F));
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, -0.5F, -1.0F, 5.0F, 2, 4, 2, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-7.0F, -11.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 96, -2.5F, 2.0F, 1.5F, 5, 12, 5, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 84, 37, -2.0F, 11.0F, 2.0F, 4, 4, 4, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 26, 83, -3.0F, 13.0F, 1.0F, 6, 19, 6, 0.0F));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.5F, 1.0F, 4.0F);
		RLeg.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 83, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(7.0F, 0.0F, 0.0F);
		RLeg.addChild(leftfoot);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 115, -10.0F, 32.0F, -3.0F, 6, 3, 10, 0.0F));
		leftfoot.cubeList.add(new ModelBox(leftfoot, 25, 110, -10.0F, 33.0F, -5.0F, 6, 2, 2, 0.0F));
		leftfoot.cubeList.add(new ModelBox(leftfoot, 25, 116, -10.0F, 33.0F, 7.0F, 6, 2, 2, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(7.0F, -11.0F, 0.0F);
		Body.addChild(LLeg);
        LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 96, -2.5F, 2.0F, 1.5F, 5, 12, 5, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 84, 37, -2.0F, 11.0F, 2.0F, 4, 4, 4, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 26, 83, -3.0F, 13.0F, 1.0F, 6, 19, 6, 0.0F));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(-0.5F, 1.0F, 4.0F);
		LLeg.addChild(bone_r2);
        bone_r2.mirror = true;
		setRotationAngle(bone_r2, 0.0F, 0.0F, -0.7854F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 0, 83, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(5.0F, 0.0F, 0.0F);
		LLeg.addChild(rightfoot);
        rightfoot.mirror = true;
		rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 115, -8.0F, 32.0F, -3.0F, 6, 3, 10, 0.0F));
		rightfoot.cubeList.add(new ModelBox(rightfoot, 25, 110, -8.0F, 33.0F, -5.0F, 6, 2, 2, 0.0F));
		rightfoot.cubeList.add(new ModelBox(rightfoot, 25, 116, -8.0F, 33.0F, 7.0F, 6, 2, 2, 0.0F));
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
