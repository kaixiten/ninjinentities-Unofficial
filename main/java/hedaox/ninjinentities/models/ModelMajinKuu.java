package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;


public class ModelMajinKuu extends ModelBase {
    private final ModelRenderer bipedHead;
    private final ModelRenderer Ears;
    private final ModelRenderer leftEar_r1;
    private final ModelRenderer rightEar_r1;
    private final ModelRenderer bipedBody;
    private final ModelRenderer Chest;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public ModelMajinKuu(float _scale) {
		textureWidth = 64;
		textureHeight = 64;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 2.0F, 1.0F);
        bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, -0.1F));

        Ears = new ModelRenderer(this);
        Ears.setRotationPoint(0.0F, 22.0F, -1.0F);
        bipedHead.addChild(Ears);


        leftEar_r1 = new ModelRenderer(this);
        leftEar_r1.setRotationPoint(-5.75F, -26.5F, 1.0F);
        leftEar_r1.mirror = true;
        Ears.addChild(leftEar_r1);
        setRotationAngle(leftEar_r1, 0.0F, 0.5236F, -0.2618F);
        leftEar_r1.cubeList.add(new ModelBox(leftEar_r1, 26, 1, -2.0F, -2.5F, 0.0F, 4, 5, 0, -0.1F));

        rightEar_r1 = new ModelRenderer(this);
        rightEar_r1.setRotationPoint(5.75F, -26.5F, 1.0F);
        Ears.addChild(rightEar_r1);
        setRotationAngle(rightEar_r1, 0.0F, -0.5236F, 0.2618F);
        rightEar_r1.cubeList.add(new ModelBox(rightEar_r1, 26, 1, -2.0F, -2.5F, 0.0F, 4, 5, 0, -0.1F));

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 24.0F, 0.0F);


        Chest = new ModelRenderer(this);
        Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(Chest);
        Chest.cubeList.add(new ModelBox(Chest, 3, 23, -3.5F, -21.7F, -0.55F, 7, 5, 3, 0.1F));
        Chest.cubeList.add(new ModelBox(Chest, 24, 21, -3.0F, -20.75F, -1.25F, 6, 2, 1, 0.0F));
        Chest.cubeList.add(new ModelBox(Chest, 4, 32, -3.0F, -20.0F, -0.5F, 6, 6, 3, 0.0F));
        Chest.cubeList.add(new ModelBox(Chest, 3, 42, -3.0F, -14.0F, -0.5F, 6, 3, 3, 0.0F));
        Chest.cubeList.add(new ModelBox(Chest, 7, 17, -2.0F, -22.0F, -0.5F, 4, 1, 3, 0.0F));

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-4.0F, -20.0F, 0.0F);
        bipedBody.addChild(bipedRightArm);
        bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 30, 26, -2.9F, -2.2F, -0.95F, 4, 12, 4, -0.6F));

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(4.0F, -20.0F, 0.0F);
        bipedLeftArm.mirror = true;
        bipedBody.addChild(bipedLeftArm);
        bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 30, 26, -1.1F, -2.2F, -0.95F, 4, 12, 4, -0.6F));

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-1.0F, -10.0F, 1.0F);
        bipedBody.addChild(bipedRightLeg);
        bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 17, 48, -2.0F, -1.0F, -1.5F, 3, 11, 3, 0.0F));

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(1.0F, -10.0F, 1.0F);
        bipedLeftLeg.mirror = true;
        bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 17, 48, -1.0F, -1.0F, -1.5F, 3, 11, 3, 0.0F));
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
