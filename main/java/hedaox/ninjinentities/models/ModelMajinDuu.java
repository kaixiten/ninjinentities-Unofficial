package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelMajinDuu extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Ears;
	private final ModelRenderer leftEar_r1;
	private final ModelRenderer rightEar_r1;
	private final ModelRenderer Antenna;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public ModelMajinDuu(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 1.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Ears = new ModelRenderer(this);
		Ears.setRotationPoint(0.0F, 15.0F, -1.0F);
		bipedHead.addChild(Ears);


		leftEar_r1 = new ModelRenderer(this);
		leftEar_r1.setRotationPoint(-5.25F, -18.5F, 1.0F);
        leftEar_r1.mirror = true;
		Ears.addChild(leftEar_r1);
		setRotationAngle(leftEar_r1, 0.0F, 0.9163F, -0.3491F);
		leftEar_r1.cubeList.add(new ModelBox(leftEar_r1, 0, 0, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F));

		rightEar_r1 = new ModelRenderer(this);
		rightEar_r1.setRotationPoint(5.25F, -18.5F, 1.0F);
		Ears.addChild(rightEar_r1);
		setRotationAngle(rightEar_r1, 0.0F, -0.9163F, 0.3491F);
		rightEar_r1.cubeList.add(new ModelBox(rightEar_r1, 0, 0, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F));

		Antenna = new ModelRenderer(this);
		Antenna.setRotationPoint(0.0F, -12.0F, -1.0F);
		bipedHead.addChild(Antenna);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 4.25F, 1.0F);
		Antenna.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 0, -1.5F, -2.0F, -1.5F, 3, 3, 3, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 2.0F, 3.0F);
		Antenna.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.0036F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 0, -1.0F, -2.0F, -1.0F, 2, 4, 2, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -6.0F, -24.0F, -2.0F, 12, 8, 6, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 30, -7.0F, -16.0F, -3.0F, 14, 8, 8, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(7.0F, -21.0F, 0.0F);
        bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 36, 16, -1.0F, -3.0F, -1.0F, 4, 10, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-7.0F, -21.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 36, 16, -3.0F, -3.0F, -1.0F, 4, 10, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-3.0F, -8.0F, 1.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 46, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(3.0F, -8.0F, 1.0F);
        bipedLeftLeg.mirror = true;
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 46, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F));
	}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(this.scale, this.scale, this.scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
        bipedHead.render(f5);
        bipedBody.render(f5);
        GL11.glPopMatrix();
        this.bipedHead.rotateAngleY = f3 / (180F / (float)Math.PI);
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
