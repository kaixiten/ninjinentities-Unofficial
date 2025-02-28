package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Modeltamagami_1 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer horns;
	private final ModelRenderer lefthorn_r1;
	private final ModelRenderer righthorn_r1;
	private final ModelRenderer eyes;
	private final ModelRenderer lefteye_r1;
	private final ModelRenderer righteye_r1;
	private final ModelRenderer ears;
	private final ModelRenderer Body;
	private final ModelRenderer chest;
	private final ModelRenderer dragonball;
	private final ModelRenderer RArm;
	private final ModelRenderer leftshoulder;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftarmbones;
	private final ModelRenderer lefthand;
	private final ModelRenderer leftfingers;
	private final ModelRenderer LArm;
	private final ModelRenderer rightshoulder;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rightarmbones;
	private final ModelRenderer righthand;
	private final ModelRenderer rightfingers;
	private final ModelRenderer sword;
	private final ModelRenderer RLeg;
	private final ModelRenderer leftfoot;
	private final ModelRenderer LLeg;
	private final ModelRenderer rightfoot;
    private float scale = 1.0F;

	public Modeltamagami_1(float _scale) {
		textureWidth = 256;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -42.0F, -1.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -10.0F, -3.0F, 8, 9, 8, 0.0F));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, -4.0F, 1.0F);
		Head.addChild(horns);


		lefthorn_r1 = new ModelRenderer(this);
		lefthorn_r1.setRotationPoint(-4.25F, -6.5F, 2.0F);
		horns.addChild(lefthorn_r1);
		setRotationAngle(lefthorn_r1, -0.4363F, 0.0F, -0.6981F);
		lefthorn_r1.cubeList.add(new ModelBox(lefthorn_r1, 25, 1, -1.5F, -2.5F, -0.5F, 3, 5, 1, 0.0F));

		righthorn_r1 = new ModelRenderer(this);
		righthorn_r1.setRotationPoint(4.25F, -6.5F, 2.0F);
		horns.addChild(righthorn_r1);
		setRotationAngle(righthorn_r1, -0.4363F, 0.0F, 0.6981F);
		righthorn_r1.cubeList.add(new ModelBox(righthorn_r1, 25, 1, -1.5F, -2.5F, -0.5F, 3, 5, 1, 0.0F));

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(0.0F, 0.5F, 0.0F);
		Head.addChild(eyes);


		lefteye_r1 = new ModelRenderer(this);
		lefteye_r1.setRotationPoint(-2.25F, -6.0F, -3.5F);
		eyes.addChild(lefteye_r1);
		setRotationAngle(lefteye_r1, 0.0F, 0.0F, 0.7854F);
		lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 34, 1, -2.5F, -1.0F, -0.5F, 4, 2, 1, 0.0F));

		righteye_r1 = new ModelRenderer(this);
		righteye_r1.setRotationPoint(2.25F, -6.0F, -3.5F);
		eyes.addChild(righteye_r1);
        righteye_r1.mirror = true;
		setRotationAngle(righteye_r1, 0.0F, 0.0F, -0.7854F);
		righteye_r1.cubeList.add(new ModelBox(righteye_r1, 34, 1, -1.5F, -1.0F, -0.5F, 4, 2, 1, 0.0F));

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(ears);
		ears.cubeList.add(new ModelBox(ears, 27, 21, -5.0F, -6.0F, -0.5F, 1, 2, 2, 0.0F));
        ears.mirror = true;
        ears.cubeList.add(new ModelBox(ears, 27, 21, 4.0F, -6.0F, -0.5F, 1, 2, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, -4.0F);


		chest = new ModelRenderer(this);
		chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(chest);
		chest.cubeList.add(new ModelBox(chest, 0, 18, -3.0F, -43.0F, 1.0F, 6, 2, 6, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 0, 42, -7.0F, -44.0F, -1.0F, 14, 3, 10, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 1, 57, -10.0F, -41.0F, -1.0F, 20, 12, 10, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 52, 41, -7.0F, -29.0F, 0.0F, 14, 6, 8, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 83, 74, -6.0F, -23.0F, 0.5F, 12, 2, 7, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 68, 57, -7.0F, -21.0F, 0.0F, 14, 8, 8, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 93, 33, -3.0F, -15.0F, -0.5F, 6, 5, 9, 0.0F));
		chest.cubeList.add(new ModelBox(chest, 54, 85, -5.0F, -27.0F, 0.1F, 10, 4, 5, 0.025F));
		chest.cubeList.add(new ModelBox(chest, 54, 96, -5.0F, -21.0F, 0.1F, 10, 4, 5, 0.025F));
		chest.cubeList.add(new ModelBox(chest, 86, 85, -5.0F, -24.0F, 0.6F, 10, 4, 5, 0.025F));

		dragonball = new ModelRenderer(this);
		dragonball.setRotationPoint(0.0F, -18.0F, 0.0F);
		chest.addChild(dragonball);
		dragonball.cubeList.add(new ModelBox(dragonball, 101, 108, -3.0F, -1.0F, -3.0F, 6, 1, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 101, 108, -3.0F, -8.0F, -3.0F, 6, 1, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 114, 116, -4.0F, -7.0F, -3.0F, 1, 6, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 114, 116, 3.0F, -7.0F, -3.0F, 1, 6, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 99, 116, -3.0F, -7.0F, -4.0F, 6, 6, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 99, 116, -3.0F, -7.0F, 3.0F, 6, 6, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 96, 112, -0.5F, -4.5F, -0.5F, 1, 1, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-14.0F, -39.0F, 0.0F);
		Body.addChild(RArm);


		leftshoulder = new ModelRenderer(this);
		leftshoulder.setRotationPoint(-3.0F, -3.0F, 0.0F);
		RArm.addChild(leftshoulder);
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 41, 0, -1.0F, -1.0F, 0.0F, 8, 8, 8, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.75F, -1.75F, 4.5F);
		leftshoulder.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 0, -1.5F, -2.5F, -0.5F, 3, 5, 1, 0.0F));

		leftarmbones = new ModelRenderer(this);
		leftarmbones.setRotationPoint(15.0F, -3.0F, 0.0F);
		RArm.addChild(leftarmbones);
		leftarmbones.cubeList.add(new ModelBox(leftarmbones, 41, 18, -18.0F, 7.0F, 1.5F, 5, 13, 5, 0.0F));
		leftarmbones.cubeList.add(new ModelBox(leftarmbones, 63, 18, -18.0F, 21.0F, 1.5F, 5, 14, 5, 0.0F));
		leftarmbones.cubeList.add(new ModelBox(leftarmbones, 85, 30, -17.0F, 18.0F, 2.5F, 3, 3, 3, 0.0F));

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(15.0F, -6.0F, 0.0F);
		RArm.addChild(lefthand);
		lefthand.cubeList.add(new ModelBox(lefthand, 81, 0, -18.0F, 38.0F, 1.5F, 5, 6, 5, 0.0F));

		leftfingers = new ModelRenderer(this);
		leftfingers.setRotationPoint(-15.0F, 45.0F, 0.0F);
		lefthand.addChild(leftfingers);
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, -0.75F, -2.0F, -0.5F, 2, 4, 2, 0.0F));
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, -1.0F, -1.0F, 2.0F, 2, 4, 2, 0.0F));
		leftfingers.cubeList.add(new ModelBox(leftfingers, 87, 21, -1.0F, -1.0F, 4.5F, 2, 4, 2, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(15.0F, -39.0F, 0.0F);
		Body.addChild(LArm);


		rightshoulder = new ModelRenderer(this);
		rightshoulder.setRotationPoint(-4.0F, -3.0F, 0.0F);
		LArm.addChild(rightshoulder);
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 41, 0, -1.0F, -1.0F, 0.0F, 8, 8, 8, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(7.75F, -1.75F, 4.5F);
		rightshoulder.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 0, -1.5F, -2.5F, -0.5F, 3, 5, 1, 0.0F));

		rightarmbones = new ModelRenderer(this);
		rightarmbones.setRotationPoint(14.0F, -3.0F, 0.0F);
		LArm.addChild(rightarmbones);
        rightarmbones.mirror = true;
		rightarmbones.cubeList.add(new ModelBox(rightarmbones, 41, 18, -17.0F, 7.0F, 1.5F, 5, 13, 5, 0.0F));
		rightarmbones.cubeList.add(new ModelBox(rightarmbones, 63, 18, -17.0F, 21.0F, 1.5F, 5, 14, 5, 0.0F));
		rightarmbones.cubeList.add(new ModelBox(rightarmbones, 85, 30, -16.0F, 19.0F, 2.5F, 3, 3, 3, 0.0F));

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(14.0F, -6.0F, 0.0F);
		LArm.addChild(righthand);
        righthand.mirror = true;
		righthand.cubeList.add(new ModelBox(righthand, 81, 0, -17.0F, 38.0F, 1.5F, 5, 6, 5, 0.0F));

		rightfingers = new ModelRenderer(this);
		rightfingers.setRotationPoint(-15.0F, 45.0F, 0.0F);
		righthand.addChild(rightfingers);
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -1.25F, -2.0F, -0.5F, 2, 4, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -1.5F, -1.0F, 2.0F, 2, 4, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 87, 21, -1.5F, -1.0F, 4.5F, 2, 4, 2, 0.0F));

		sword = new ModelRenderer(this);
		sword.setRotationPoint(-16.0F, 45.0F, 11.0F);
		righthand.addChild(sword);
		setRotationAngle(sword, 1.5708F, 0.0F, -1.5708F);
		sword.cubeList.add(new ModelBox(sword, 137, 10, -1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F));
		sword.cubeList.add(new ModelBox(sword, 137, 10, -7.0F, -15.0F, -2.0F, 3, 3, 3, 0.0F));
		sword.cubeList.add(new ModelBox(sword, 137, 10, 4.0F, -15.0F, -2.0F, 3, 3, 3, 0.0F));
		sword.cubeList.add(new ModelBox(sword, 137, 19, -4.0F, -14.0F, -1.5F, 8, 1, 2, 0.0F));
		sword.cubeList.add(new ModelBox(sword, 163, 5, -3.25F, -47.5F, 0.0F, 7, 33, 1, 0.5F));
		sword.cubeList.add(new ModelBox(sword, 152, 5, -1.0F, -13.0F, -1.0F, 2, 10, 1, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-6.0F, -11.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 83, -3.0F, -5.0F, 1.0F, 6, 20, 6, 0.1F));
		RLeg.cubeList.add(new ModelBox(RLeg, 26, 83, -3.0F, 14.0F, 1.0F, 6, 17, 6, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 44, 115, -2.0F, 12.0F, 2.0F, 4, 4, 4, 0.1F));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(6.0F, 0.0F, 0.0F);
		RLeg.addChild(leftfoot);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 2, 111, -9.0F, 31.0F, -1.0F, 6, 4, 8, 0.0F));
		leftfoot.cubeList.add(new ModelBox(leftfoot, 24, 112, -9.0F, 33.0F, -4.0F, 6, 2, 3, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(6.0F, -11.0F, 0.0F);
		Body.addChild(LLeg);
        LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 83, -3.0F, -5.0F, 1.0F, 6, 20, 6, 0.1F));
		LLeg.cubeList.add(new ModelBox(LLeg, 44, 115, -2.0F, 12.0F, 2.0F, 4, 4, 4, 0.1F));
		LLeg.cubeList.add(new ModelBox(LLeg, 26, 83, -3.0F, 14.0F, 1.0F, 6, 17, 6, 0.0F));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(6.0F, 0.0F, 0.0F);
		LLeg.addChild(rightfoot);
        rightfoot.mirror = true;
		rightfoot.cubeList.add(new ModelBox(rightfoot, 2, 111, -9.0F, 31.0F, -1.0F, 6, 4, 8, 0.0F));
		rightfoot.cubeList.add(new ModelBox(rightfoot, 24, 112, -9.0F, 33.0F, -4.0F, 6, 2, 3, 0.0F));
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
