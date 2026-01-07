package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelPESSMonster2 extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelPESSMonster2(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;


		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -6.0F, -30.0F, -8.0F, 12, 8, 13, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 19, 60, -3.0F, -31.0F, -10.0F, 2, 3, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 33, 46, 1.0F, -31.0F, -10.0F, 2, 3, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 37, 8, -4.0F, -32.0F, -9.0F, 3, 3, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 7, 1.0F, -32.0F, -9.0F, 3, 3, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 60, -3.5F, -33.0F, -8.0F, 3, 3, 13, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 62, 14, 0.5F, -33.0F, -8.0F, 3, 3, 13, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 29, 47, -5.0F, -32.0F, -8.0F, 4, 2, 13, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 50, 50, 1.0F, -32.0F, -8.0F, 4, 2, 13, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 46, -1.0F, -27.0F, -9.0F, 2, 1, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 47, 8, 1.0F, -26.0F, -9.0F, 1, 1, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 21, -3.0F, -25.0F, -9.0F, 1, 5, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 37, 0, 2.0F, -25.0F, -9.0F, 1, 5, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -3.0F, -20.0F, -8.0F, 1, 3, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 8, 0, 2.0F, -20.0F, -8.0F, 1, 3, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 50, 57, -2.0F, -26.0F, -9.0F, 1, 1, 2, 0.0F));

        ModelRenderer turns_left = new ModelRenderer(this);
		turns_left.setRotationPoint(5.5F, -25.0F, 0.0F);
		setRotationAngle(turns_left, 0.0F, 0.0F, 1.1345F);
		bipedHead.addChild(turns_left);
		turns_left.cubeList.add(new ModelBox(turns_left, 40, 31, -4.3202F, -2.5662F, -5.0F, 8, 6, 10, 0.0F));

        ModelRenderer turns_right = new ModelRenderer(this);
		turns_right.setRotationPoint(-5.5F, -25.0F, 0.0F);
		setRotationAngle(turns_right, 0.0F, 0.0F, -1.1345F);
		bipedHead.addChild(turns_right);
		turns_right.cubeList.add(new ModelBox(turns_right, 41, 11, -3.5F, -2.5662F, -5.0F, 7, 6, 10, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 88, 68, -5.0F, -22.0F, 6.0F, 10, 11, 3, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 21, -8.0F, -22.0F, -3.0F, 16, 11, 9, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 84, 53, 3.0F, -18.0F, -6.0F, 6, 8, 7, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 77, 84, -9.0F, -18.0F, -6.0F, 6, 8, 7, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 41, -6.0F, -21.0F, -7.0F, 12, 10, 9, 0.0F));

        ModelRenderer tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -24.0F, 0.0F);
		setRotationAngle(tail, -0.3491F, 0.0F, 0.0F);
		bipedBody.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 1, 114, -2.0F, 8.1953F, 5.5635F, 3, 2, 11, 0.0F));

        ModelRenderer tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(-3.0F, -8.8F, 17.0F);
		setRotationAngle(tail2, 0.1745F, 0.0F, 0.0F);
		bipedBody.addChild(tail2);
		tail2.cubeList.add(new ModelBox(tail2, 0, 117, 1.0F, -2.966F, -5.0406F, 3, 2, 9, 0.0F));

        ModelRenderer backpack = new ModelRenderer(this);
		backpack.setRotationPoint(0.0F, -27.5F, 7.5F);
		setRotationAngle(backpack, 0.2618F, 0.0F, 0.0F);
		bipedBody.addChild(backpack);
		backpack.cubeList.add(new ModelBox(backpack, 0, 89, -5.0F, -3.2992F, -2.9746F, 10, 9, 3, 0.0F));
		backpack.cubeList.add(new ModelBox(backpack, 71, 53, -4.0F, -4.5442F, -2.8359F, 8, 2, 2, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-7.0F, -21.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);

        ModelRenderer right_arm5 = new ModelRenderer(this);
		right_arm5.setRotationPoint(0.5F, 0.0F, -0.5F);
		setRotationAngle(right_arm5, 0.0F, 0.0F, -0.3491F);
		bipedRightArm.addChild(right_arm5);
		right_arm5.cubeList.add(new ModelBox(right_arm5, 71, 40, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer right_arm6 = new ModelRenderer(this);
		right_arm6.setRotationPoint(-3.5F, 3.0F, -0.5F);
		setRotationAngle(right_arm6, 0.0F, 0.0F, -0.9599F);
		bipedRightArm.addChild(right_arm6);
		right_arm6.cubeList.add(new ModelBox(right_arm6, 65, 0, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer right_arm7 = new ModelRenderer(this);
		right_arm7.setRotationPoint(-5.5F, 7.0F, -1.5F);
		setRotationAngle(right_arm7, 0.0F, -0.2618F, -0.9599F);
		bipedRightArm.addChild(right_arm7);
		right_arm7.cubeList.add(new ModelBox(right_arm7, 60, 65, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer right_arm8 = new ModelRenderer(this);
		right_arm8.setRotationPoint(-7.5F, 11.0F, -4.5F);
		setRotationAngle(right_arm8, 0.0F, -0.6981F, -0.9599F);
		bipedRightArm.addChild(right_arm8);
		right_arm8.cubeList.add(new ModelBox(right_arm8, 32, 65, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer right_hand_global = new ModelRenderer(this);
		right_hand_global.setRotationPoint(-9.0F, 11.5F, -7.0F);
		setRotationAngle(right_hand_global, -1.7453F, 2.4435F, 2.3562F);
		bipedRightArm.addChild(right_hand_global);
		right_hand_global.cubeList.add(new ModelBox(right_hand_global, 59, 91, -2.5F, -2.5F, -3.5F, 4, 3, 4, 0.0F));

        ModelRenderer right_hand8 = new ModelRenderer(this);
		right_hand8.setRotationPoint(5.75F, -1.0F, -1.5F);
		setRotationAngle(right_hand8, 0.0F, 0.0F, -0.4363F);
		right_hand_global.addChild(right_hand8);
		right_hand8.cubeList.add(new ModelBox(right_hand8, 0, 0, -4.0326F, -3.2254F, -2.0F, 2, 3, 4, 0.0F));

        ModelRenderer right_hand9 = new ModelRenderer(this);
		right_hand9.setRotationPoint(5.75F, -1.0F, -2.5F);
		setRotationAngle(right_hand9, 0.0F, 0.0F, -0.8727F);
		right_hand_global.addChild(right_hand9);
		right_hand9.cubeList.add(new ModelBox(right_hand9, 50, 0, -1.4059F, -3.9042F, -1.0F, 5, 3, 4, 0.0F));
		right_hand9.cubeList.add(new ModelBox(right_hand9, 41, 27, 3.5867F, -2.1772F, 0.0F, 3, 1, 2, 0.0F));

        ModelRenderer right_hand10 = new ModelRenderer(this);
		right_hand10.setRotationPoint(-2.5F, -2.1732F, -3.2918F);
		setRotationAngle(right_hand10, 1.309F, 0.9599F, 0.0F);
		right_hand_global.addChild(right_hand10);
		right_hand10.cubeList.add(new ModelBox(right_hand10, 21, 76, -2.1499F, -1.7907F, -2.4434F, 4, 4, 3, 0.0F));

        ModelRenderer right_hand11 = new ModelRenderer(this);
		right_hand11.setRotationPoint(-0.5F, -7.1695F, -4.2383F);
		setRotationAngle(right_hand11, 0.8727F, 0.9599F, 0.0F);
		right_hand_global.addChild(right_hand11);
		right_hand11.cubeList.add(new ModelBox(right_hand11, 53, 65, -4.0724F, -2.2178F, -7.5028F, 4, 4, 3, 0.0F));
		right_hand11.cubeList.add(new ModelBox(right_hand11, 0, 41, -3.3357F, -6.0974F, -7.1243F, 2, 4, 1, 0.0F));

        ModelRenderer right_hand1 = new ModelRenderer(this);
		right_hand1.setRotationPoint(-2.5F, -2.5F, 3.0F);
		setRotationAngle(right_hand1, 0.3491F, -0.9599F, 0.0F);
		right_hand_global.addChild(right_hand1);
		right_hand1.cubeList.add(new ModelBox(right_hand1, 43, 91, -4.6552F, -0.7554F, -3.6043F, 4, 3, 4, 0.0F));

        ModelRenderer right_hand13 = new ModelRenderer(this);
		right_hand13.setRotationPoint(-4.664F, -4.5614F, 5.3813F);
		setRotationAngle(right_hand13, 0.8727F, -0.9599F, 0.0F);
		right_hand_global.addChild(right_hand13);
		right_hand13.cubeList.add(new ModelBox(right_hand13, 86, 0, -5.3645F, -1.9374F, -4.3762F, 4, 3, 4, 0.0F));
		right_hand13.cubeList.add(new ModelBox(right_hand13, 50, 27, -3.8629F, -1.3565F, -0.529F, 2, 1, 3, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(8.0F, -21.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);

        ModelRenderer left_arm1 = new ModelRenderer(this);
		left_arm1.setRotationPoint(-1.5F, 0.0F, -0.5F);
		setRotationAngle(left_arm1, 0.0F, 0.0F, 0.3491F);
		bipedLeftArm.addChild(left_arm1);
		left_arm1.cubeList.add(new ModelBox(left_arm1, 81, 13, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer left_arm2 = new ModelRenderer(this);
		left_arm2.setRotationPoint(2.5F, 3.0F, -0.5F);
		setRotationAngle(left_arm2, 0.0F, 0.0F, 0.9599F);
		bipedLeftArm.addChild(left_arm2);
		left_arm2.cubeList.add(new ModelBox(left_arm2, 56, 78, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer left_arm3 = new ModelRenderer(this);
		left_arm3.setRotationPoint(4.5F, 7.0F, -1.5F);
		setRotationAngle(left_arm3, 0.0F, 0.2618F, 0.9599F);
		bipedLeftArm.addChild(left_arm3);
		left_arm3.cubeList.add(new ModelBox(left_arm3, 28, 78, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer left_arm4 = new ModelRenderer(this);
		left_arm4.setRotationPoint(6.5F, 11.0F, -4.5F);
		setRotationAngle(left_arm4, 0.0F, 0.6981F, 0.9599F);
		bipedLeftArm.addChild(left_arm4);
		left_arm4.cubeList.add(new ModelBox(left_arm4, 0, 76, -3.5F, -3.0F, -3.5F, 7, 6, 7, 0.0F));

        ModelRenderer left_hand_global = new ModelRenderer(this);
		left_hand_global.setRotationPoint(8.0F, 11.5F, -7.0F);
		setRotationAngle(left_hand_global, -1.7453F, -2.4435F, -2.3562F);
		bipedLeftArm.addChild(left_hand_global);
		left_hand_global.cubeList.add(new ModelBox(left_hand_global, 50, 98, -2.0F, -2.5F, -3.5F, 4, 3, 4, 0.0F));

        ModelRenderer left_hand2 = new ModelRenderer(this);
		left_hand2.setRotationPoint(-5.75F, -1.0F, -1.5F);
		setRotationAngle(left_hand2, 0.0F, 0.0F, 0.4363F);
		left_hand_global.addChild(left_hand2);
		left_hand2.cubeList.add(new ModelBox(left_hand2, 50, 50, 1.6563F, -3.2254F, -2.0F, 2, 3, 4, 0.0F));

        ModelRenderer left_hand3 = new ModelRenderer(this);
		left_hand3.setRotationPoint(-5.75F, -1.0F, -2.5F);
		setRotationAngle(left_hand3, 0.0F, 0.0F, 0.8727F);
		left_hand_global.addChild(left_hand3);
		left_hand3.cubeList.add(new ModelBox(left_hand3, 66, 30, -3.9729F, -3.9042F, -1.0F, 5, 3, 4, 0.0F));
		left_hand3.cubeList.add(new ModelBox(left_hand3, 50, 47, -7.25F, -2.1772F, 0.0F, 3, 1, 2, 0.0F));

        ModelRenderer left_hand4 = new ModelRenderer(this);
		left_hand4.setRotationPoint(2.5F, -2.1732F, -3.2918F);
		setRotationAngle(left_hand4, 1.309F, -0.9599F, 0.0F);
		left_hand_global.addChild(left_hand4);
		left_hand4.cubeList.add(new ModelBox(left_hand4, 66, 98, -1.8501F, -1.7907F, -2.4434F, 4, 4, 3, 0.0F));

        ModelRenderer left_hand5 = new ModelRenderer(this);
		left_hand5.setRotationPoint(0.5F, -7.1695F, -4.2383F);
		setRotationAngle(left_hand5, 0.8727F, -0.9599F, 0.0F);
		left_hand_global.addChild(left_hand5);
		left_hand5.cubeList.add(new ModelBox(left_hand5, 49, 78, 0.0724F, -2.2178F, -7.5028F, 4, 4, 3, 0.0F));
		left_hand5.cubeList.add(new ModelBox(left_hand5, 33, 41, 0.5F, -6.0974F, -7.1243F, 2, 4, 1, 0.0F));

        ModelRenderer left_hand6 = new ModelRenderer(this);
		left_hand6.setRotationPoint(2.5F, -2.5F, 3.0F);
		setRotationAngle(left_hand6, 0.3491F, 0.9599F, 0.0F);
		left_hand_global.addChild(left_hand6);
		left_hand6.cubeList.add(new ModelBox(left_hand6, 96, 82, 0.6552F, -0.7554F, -3.6043F, 4, 3, 4, 0.0F));

        ModelRenderer left_hand7 = new ModelRenderer(this);
		left_hand7.setRotationPoint(4.664F, -4.5614F, 5.3813F);
		setRotationAngle(left_hand7, 0.8727F, 0.9599F, 0.0F);
		left_hand_global.addChild(left_hand7);
		left_hand7.cubeList.add(new ModelBox(left_hand7, 92, 39, 1.3645F, -1.9374F, -4.3762F, 4, 3, 4, 0.0F));
		left_hand7.cubeList.add(new ModelBox(left_hand7, 54, 7, 2.7261F, -0.864F, -1.4211F, 2, 1, 3, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-5.0F, -14.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 19, 62, -1.0F, 13.0F, -4.0F, 3, 1, 7, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 60, -1.0F, 9.0F, -1.0F, 3, 4, 3, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 87, 26, -2.0F, 3.0F, -3.0F, 5, 6, 7, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(6.0F, -14.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 37, 0, -3.0F, 13.0F, -4.0F, 3, 1, 7, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 80, 99, -3.0F, 9.0F, -1.0F, 3, 4, 3, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 26, 91, -4.0F, 3.0F, -3.0F, 5, 6, 7, 0.0F));
	}

	@Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scaleX, scaleY, scaleZ);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scaleY/0.45F,1.88F)))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        bipedBody.render(scaleFactor);
        GL11.glPopMatrix();
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netbipedHeadYaw / (180F / (float)Math.PI);
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
