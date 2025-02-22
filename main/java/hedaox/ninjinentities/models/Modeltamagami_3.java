package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class Modeltamagami_3 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer eyes;
	private final ModelRenderer lefteye_r1;
	private final ModelRenderer righteye_r1;
	private final ModelRenderer horns;
	private final ModelRenderer lefthorn_r1;
	private final ModelRenderer righthorn_r1;
	private final ModelRenderer Body;
	private final ModelRenderer dragonball;
	private final ModelRenderer LLeg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer RLeg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LArm;
	private final ModelRenderer rightshoulder;
	private final ModelRenderer spike_r1;
	private final ModelRenderer rightarmbone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer righthand;
	private final ModelRenderer spike_r2;
	private final ModelRenderer rightfingers;
	private final ModelRenderer RArm;
	private final ModelRenderer leftshoulder;
	private final ModelRenderer spike_r3;
	private final ModelRenderer leftarmbone;
	private final ModelRenderer cube_r2;
	private final ModelRenderer lefthand;
	private final ModelRenderer spike_r4;
	private final ModelRenderer leftfingers;
	private final ModelRenderer leftfingers_r1;
	private final ModelRenderer finger_r1;
	private final ModelRenderer finger_r1_r1;
	private final ModelRenderer finger_r2;
	private final ModelRenderer finger_r2_r1;
	private final ModelRenderer hammer;
	private final ModelRenderer hammerhead;
	private final ModelRenderer handle;
    private float scale = 1.0F;

	public Modeltamagami_3(float _scale) {
		textureWidth = 256;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -36.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 109, 0, -6.0F, -10.0F, -6.0F, 12, 10, 12, 0.0F));

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(eyes);


		lefteye_r1 = new ModelRenderer(this);
		lefteye_r1.setRotationPoint(-3.75F, -6.0F, -6.5F);
		eyes.addChild(lefteye_r1);
		setRotationAngle(lefteye_r1, 0.0F, 0.0F, 0.2618F);
		lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 122, 25, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F));

		righteye_r1 = new ModelRenderer(this);
		righteye_r1.setRotationPoint(3.75F, -6.0F, -6.5F);
		eyes.addChild(righteye_r1);
        righteye_r1.mirror = true;
		setRotationAngle(righteye_r1, 0.0F, 0.0F, -0.2618F);
		righteye_r1.cubeList.add(new ModelBox(righteye_r1, 122, 25, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(horns);


		lefthorn_r1 = new ModelRenderer(this);
		lefthorn_r1.setRotationPoint(-6.25F, -11.0F, 2.0F);
		horns.addChild(lefthorn_r1);
		setRotationAngle(lefthorn_r1, -0.4363F, 0.0F, -0.7854F);
		lefthorn_r1.cubeList.add(new ModelBox(lefthorn_r1, 147, 2, -2.0F, -3.0F, -1.0F, 3, 6, 2, 0.0F));

		righthorn_r1 = new ModelRenderer(this);
		righthorn_r1.setRotationPoint(6.25F, -11.0F, 2.0F);
		horns.addChild(righthorn_r1);
        righthorn_r1.mirror = true;
		setRotationAngle(righthorn_r1, -0.4363F, 0.0F, 0.7854F);
		righthorn_r1.cubeList.add(new ModelBox(righthorn_r1, 147, 2, -1.0F, -3.0F, -1.0F, 3, 6, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -2.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 144, 9, -8.0F, -35.5F, -8.0F, 16, 2, 16, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -14.0F, -34.0F, -11.0F, 28, 12, 22, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 37, -13.0F, -22.0F, -10.0F, 26, 12, 20, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 74, -12.0F, -10.0F, -9.0F, 24, 10, 18, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 211, 27, -5.0F, -27.0F, -10.75F, 10, 10, 7, 0.025F));

		dragonball = new ModelRenderer(this);
		dragonball.setRotationPoint(0.0F, -18.0F, -9.0F);
		Body.addChild(dragonball);
		dragonball.cubeList.add(new ModelBox(dragonball, 228, 13, -3.0F, -1.0F, -3.0F, 6, 1, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 228, 13, -3.0F, -8.0F, -3.0F, 6, 1, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 227, 0, -4.0F, -7.0F, -3.0F, 1, 6, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 227, 0, 3.0F, -7.0F, -3.0F, 1, 6, 6, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 242, 5, -3.0F, -7.0F, -4.0F, 6, 6, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 242, 5, -3.0F, -7.0F, 3.0F, 6, 6, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 249, 15, 0.75F, -3.75F, -0.5F, 1, 1, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 249, 15, -1.75F, -3.75F, -0.5F, 1, 1, 1, 0.0F));
		dragonball.cubeList.add(new ModelBox(dragonball, 249, 15, -0.5F, -5.75F, -0.5F, 1, 1, 1, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(11.0F, 0.0F, 0.0F);
		Body.addChild(LLeg);
        LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 93, 100, -0.5F, 2.0F, -2.5F, 5, 8, 5, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 117, 99, -1.0F, 10.0F, -3.0F, 6, 12, 6, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 135, 111, -1.0F, 22.0F, -6.0F, 6, 4, 9, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, 0.0F, 0.0F);
		LLeg.addChild(cube_r3);
        cube_r3.mirror = true;
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 93, 81, -4.0F, -5.0F, -4.0F, 8, 8, 8, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-11.0F, -1.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 93, 100, -4.5F, 3.0F, -2.5F, 5, 8, 5, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 117, 99, -5.0F, 11.0F, -3.0F, 6, 12, 6, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 135, 111, -5.0F, 23.0F, -6.0F, 6, 4, 9, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, 1.0F, 0.0F);
		RLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2618F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 93, 81, -4.0F, -5.0F, -4.0F, 8, 8, 8, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(14.0F, -30.0F, 0.0F);
		Body.addChild(LArm);


		rightshoulder = new ModelRenderer(this);
		rightshoulder.setRotationPoint(6.0587F, -3.5381F, 0.0F);
		LArm.addChild(rightshoulder);
		rightshoulder.cubeList.add(new ModelBox(rightshoulder, 100, 38, -6.0587F, -2.4619F, -5.0F, 10, 10, 10, 0.0F));

		spike_r1 = new ModelRenderer(this);
		spike_r1.setRotationPoint(5.1913F, -3.7119F, 1.0F);
		rightshoulder.addChild(spike_r1);
		setRotationAngle(spike_r1, 0.0F, 0.0F, 0.7854F);
		spike_r1.cubeList.add(new ModelBox(spike_r1, 96, 39, -2.0F, -1.5F, -1.0F, 4, 5, 2, 0.0F));

		rightarmbone = new ModelRenderer(this);
		rightarmbone.setRotationPoint(8.0F, 8.0F, 0.0F);
		LArm.addChild(rightarmbone);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -0.5F, 0.0F);
		rightarmbone.addChild(cube_r1);
        cube_r1.mirror = true;
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 60, -2.5F, -5.0F, -2.5F, 5, 10, 5, 0.0F));

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(1.0F, 14.0F, -3.0F);
		LArm.addChild(righthand);
        righthand.mirror = true;
		righthand.cubeList.add(new ModelBox(righthand, 123, 60, 2.0F, -2.0F, -1.0F, 8, 12, 8, 0.0F));
		righthand.cubeList.add(new ModelBox(righthand, 132, 34, 2.5F, 10.0F, -0.5F, 7, 5, 7, 0.0F));

		spike_r2 = new ModelRenderer(this);
		spike_r2.setRotationPoint(8.975F, -2.0F, 3.0F);
		righthand.addChild(spike_r2);
        spike_r2.mirror = true;
		setRotationAngle(spike_r2, -0.7854F, 0.0F, 0.0F);
		spike_r2.cubeList.add(new ModelBox(spike_r2, 149, 60, -0.975F, -1.5F, -1.5F, 2, 3, 3, 0.0F));

		rightfingers = new ModelRenderer(this);
		rightfingers.setRotationPoint(10.0F, 15.0F, 0.0F);
		righthand.addChild(rightfingers);
		rightfingers.cubeList.add(new ModelBox(rightfingers, 142, 48, -7.0F, 0.0F, 1.5F, 2, 5, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 142, 48, -7.0F, 0.0F, 4.0F, 2, 5, 2, 0.0F));
		rightfingers.cubeList.add(new ModelBox(rightfingers, 142, 48, -7.0F, -2.0F, -1.0F, 2, 5, 2, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-14.0F, -31.0F, 0.0F);
		Body.addChild(RArm);


		leftshoulder = new ModelRenderer(this);
		leftshoulder.setRotationPoint(-3.9413F, -2.5381F, 0.0F);
		RArm.addChild(leftshoulder);
		leftshoulder.cubeList.add(new ModelBox(leftshoulder, 100, 38, -6.0587F, -2.4619F, -5.0F, 10, 10, 10, 0.0F));

		spike_r3 = new ModelRenderer(this);
		spike_r3.setRotationPoint(-6.3087F, -2.7119F, 1.0F);
		leftshoulder.addChild(spike_r3);
        spike_r3.mirror = true;
		setRotationAngle(spike_r3, 0.0F, 0.0F, -0.7854F);
		spike_r3.cubeList.add(new ModelBox(spike_r3, 96, 39, -2.0F, -2.5F, -1.0F, 4, 5, 2, 0.0F));

		leftarmbone = new ModelRenderer(this);
		leftarmbone.setRotationPoint(-2.0F, 9.0F, 0.0F);
		RArm.addChild(leftarmbone);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.0F, -0.5F, 0.0F);
		leftarmbone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1309F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 100, 60, -2.5F, -5.0F, -2.5F, 5, 10, 5, 0.0F));

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(-11.0F, 15.0F, -3.0F);
		RArm.addChild(lefthand);
		lefthand.cubeList.add(new ModelBox(lefthand, 123, 60, 0.0F, -2.0F, -1.0F, 8, 12, 8, 0.0F));
		lefthand.cubeList.add(new ModelBox(lefthand, 132, 34, 0.5F, 10.0F, 0.5F, 7, 5, 7, 0.0F));

		spike_r4 = new ModelRenderer(this);
		spike_r4.setRotationPoint(0.775F, -2.0F, 3.0F);
		lefthand.addChild(spike_r4);
		setRotationAngle(spike_r4, -0.7854F, 0.0F, 0.0F);
		spike_r4.cubeList.add(new ModelBox(spike_r4, 149, 60, -0.775F, -1.5F, -1.5F, 2, 3, 3, 0.0F));

		leftfingers = new ModelRenderer(this);
		leftfingers.setRotationPoint(52.0F, 15.0F, 0.0F);
		lefthand.addChild(leftfingers);


		leftfingers_r1 = new ModelRenderer(this);
		leftfingers_r1.setRotationPoint(-47.0F, 0.25F, 2.5F);
		leftfingers.addChild(leftfingers_r1);
        leftfingers_r1.mirror = true;
		setRotationAngle(leftfingers_r1, 0.0F, 0.0F, -1.789F);
		leftfingers_r1.cubeList.add(new ModelBox(leftfingers_r1, 142, 48, -1.442F, -0.7345F, -1.0F, 2, 5, 2, 0.0F));

		finger_r1 = new ModelRenderer(this);
		finger_r1.setRotationPoint(-46.0F, -0.5F, 0.0F);
		leftfingers.addChild(finger_r1);


		finger_r1_r1 = new ModelRenderer(this);
		finger_r1_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		finger_r1.addChild(finger_r1_r1);
        finger_r1_r1.mirror = true;
		setRotationAngle(finger_r1_r1, 0.0F, 0.0F, -1.5708F);
		finger_r1_r1.cubeList.add(new ModelBox(finger_r1_r1, 142, 48, -1.0F, -0.5F, -1.0F, 2, 5, 2, 0.0F));

		finger_r2 = new ModelRenderer(this);
		finger_r2.setRotationPoint(-46.0F, 2.5F, 5.25F);
		leftfingers.addChild(finger_r2);


		finger_r2_r1 = new ModelRenderer(this);
		finger_r2_r1.setRotationPoint(-1.75F, -1.75F, 0.25F);
		finger_r2.addChild(finger_r2_r1);
        finger_r2_r1.mirror = true;
		setRotationAngle(finger_r2_r1, 0.0F, 0.0F, -1.789F);
		finger_r2_r1.cubeList.add(new ModelBox(finger_r2_r1, 142, 48, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F));

		hammer = new ModelRenderer(this);
		hammer.setRotationPoint(-3.5F, 27.5F, 7.5F);
		RArm.addChild(hammer);
		setRotationAngle(hammer, 1.5708F, 0.0F, 0.0F);


		hammerhead = new ModelRenderer(this);
		hammerhead.setRotationPoint(5.5F, -23.0F, -1.5F);
		hammer.addChild(hammerhead);
		hammerhead.cubeList.add(new ModelBox(hammerhead, 160, 63, -14.0F, -33.0F, -14.0F, 16, 16, 32, 0.0F));

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.5F, 0.0F, -0.5F);
		hammer.addChild(handle);
		handle.cubeList.add(new ModelBox(handle, 240, 71, -1.5F, -40.0F, -0.5F, 2, 20, 2, 0.0F));
		handle.cubeList.add(new ModelBox(handle, 226, 70, -2.0F, -20.0F, -1.0F, 3, 20, 3, 0.0F));
		handle.cubeList.add(new ModelBox(handle, 226, 62, -2.5F, 0.0F, -1.5F, 4, 3, 4, 0.0F));
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
