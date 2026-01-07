package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDrWheelo extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDrWheelo(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 256;
		textureHeight = 256;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(2.0F, 2.0F, -4.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 47, 50, -10.0F, -34.0F, -11.0F, 16, 17, 11, 0.0F));

        ModelRenderer bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, 22.0F, 4.0F);
		bipedHead.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 60, 109, -7.0F, -55.0F, -14.0F, 14, 16, 1, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 70, 25, -9.0F, -48.0F, -12.0F, 18, 13, 8, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 0, 61, -6.0F, -35.0F, -10.0F, 12, 3, 6, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 70, -8.0F, -48.0F, -4.0F, 16, 20, 8, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 93, 63, -6.0F, -48.0F, 4.0F, 12, 10, 8, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 101, 0, -4.0F, -38.0F, 4.0F, 9, 5, 7, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -9.0F, -60.0F, -12.0F, 18, 12, 21, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 34, 37, -7.0F, -57.0F, 9.0F, 14, 9, 4, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 57, 0, -7.0F, -64.0F, -9.0F, 14, 4, 16, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 15, 48, -3.0F, -26.0F, 3.0F, 5, 4, 9, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 53, -3.0F, -44.0F, -16.0F, 5, 2, 1, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 48, 98, -7.0F, -28.0F, -3.0F, 13, 5, 6, 0.0F));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 109, 88, -6.0F, -23.0F, -2.0F, 11, 3, 4, 0.0F));

        ModelRenderer bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.5F, -22.0F, 28.0F);
		setRotationAngle(bone4, 0.6981F, 0.0F, 0.0F);
		bipedBody.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 8, 41, -2.5F, -14.2846F, -12.2567F, 5, 4, 16, 0.0F));

        ModelRenderer bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -16.7014F, 6.0371F);
		setRotationAngle(bone5, 0.5236F, 0.0F, 0.0F);
		bone4.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 14, -1.5F, 1.0F, 17.0F, 3, 2, 5, 0.0F));
		bone5.cubeList.add(new ModelBox(bone5, 42, 50, 0.5F, 1.0F, 21.0F, 1, 2, 5, 0.0F));
		bone5.cubeList.add(new ModelBox(bone5, 0, 33, -2.5F, 0.0F, -6.0F, 5, 4, 24, 0.0F));

        ModelRenderer spikes = new ModelRenderer(this);
		spikes.setRotationPoint(-6.0F, -52.0F, 15.0F);
		bipedBody.addChild(spikes);
		spikes.cubeList.add(new ModelBox(spikes, 34, 17, 1.0F, -14.0F, -24.0F, 0, 2, 16, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 0, 67, 1.0F, -21.0F, -24.0F, 0, 7, 3, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 12, 50, 1.0F, -24.0F, -22.0F, 0, 3, 3, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 0, 0, 1.0F, -19.0F, -19.0F, 0, 5, 3, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 49, 49, 1.0F, -22.0F, -17.0F, 0, 3, 3, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 0, 12, 1.0F, -17.0F, -14.0F, 0, 3, 2, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 10, 0, 1.0F, -19.0F, -13.0F, 0, 2, 2, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 0, 0, 1.0F, -16.0F, -10.0F, 0, 2, 1, 0.0F));
		spikes.cubeList.add(new ModelBox(spikes, 4, 0, 1.0F, -17.0F, -9.0F, 0, 1, 1, 0.0F));

        ModelRenderer bone = new ModelRenderer(this);
		bone.setRotationPoint(10.0F, 0.0F, 0.0F);
		spikes.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 34, 19, 1.0F, -14.0F, -24.0F, 0, 2, 16, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 40, 67, 1.0F, -21.0F, -24.0F, 0, 7, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 58, 1.0F, -24.0F, -22.0F, 0, 3, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 11, 11, 1.0F, -19.0F, -19.0F, 0, 5, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 18, 50, 1.0F, -22.0F, -17.0F, 0, 3, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 17, 12, 1.0F, -17.0F, -14.0F, 0, 3, 2, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 15, 1.0F, -19.0F, -13.0F, 0, 2, 2, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 2, 0, 1.0F, -16.0F, -10.0F, 0, 2, 1, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 4, 1, 1.0F, -17.0F, -9.0F, 0, 1, 1, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-9.0F, -48.0F, -2.0F);
		setRotationAngle(bipedRightArm, 0.0F, 0.0F, 0.1309F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 86, 86, -6.9914F, 1.1305F, -2.0F, 6, 28, 7, 0.0F));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 63, 110, -5.0F, -7.0F, -4.0F, 5, 10, 12, 0.0F));

        ModelRenderer right_glove = new ModelRenderer(this);
		right_glove.setRotationPoint(-4.0513F, 3.1139F, 6.0F);
		setRotationAngle(right_glove, -1.5707F, 1.5272F, -1.5707F);
		bipedRightArm.addChild(right_glove);
		right_glove.cubeList.add(new ModelBox(right_glove, 134, 21, -1.0F, 22.0F, -2.0F, 1, 4, 4, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 20, 132, 0.0F, 22.0F, -3.0F, 1, 4, 6, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 116, 116, -1.0F, 11.8861F, -3.0F, 1, 11, 6, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 34, 46, -0.9487F, 5.0F, -2.0F, 0, 7, 4, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 142, 16, -1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 0, 0, 0.0F, 16.0F, -4.0F, 1, 6, 8, 0.0F));

        ModelRenderer right_gloove_addon = new ModelRenderer(this);
		right_gloove_addon.setRotationPoint(0.0F, 0.0F, 1.0F);
		setRotationAngle(right_gloove_addon, 0.0F, 0.0F, -0.3491F);
		right_glove.addChild(right_gloove_addon);
		right_gloove_addon.cubeList.add(new ModelBox(right_gloove_addon, 16, 33, -10.0F, 24.0F, -2.0F, 1, 4, 2, 0.0F));
		right_gloove_addon.cubeList.add(new ModelBox(right_gloove_addon, 100, 46, -9.0F, 24.0F, -3.0F, 1, 4, 4, 0.0F));

        ModelRenderer right_glove2 = new ModelRenderer(this);
		right_glove2.setRotationPoint(-4.6233F, 28.4135F, -3.0F);
		setRotationAngle(right_glove2, -1.5707F, -1.5272F, 1.5707F);
		bipedRightArm.addChild(right_glove2);
		right_glove2.cubeList.add(new ModelBox(right_glove2, 124, 95, -1.0F, -3.0F, -2.0F, 1, 2, 4, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 132, 124, 0.0F, -3.0F, -3.0F, 1, 2, 6, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 127, 6, -1.0F, -12.0F, -3.0F, 1, 9, 6, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 26, 120, 0.0F, -7.0F, -4.0F, 1, 4, 8, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 52, 126, 1.0F, -7.0F, -4.0F, 1, 3, 8, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 123, 48, 1.6319F, -7.0F, -3.0F, 4, 3, 6, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 114, 133, -1.0F, -17.0F, -2.0F, 1, 5, 4, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 122, 125, 6.0F, -7.0F, -4.0F, 1, 3, 8, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 72, 78, -1.0F, -22.0F, -1.0F, 1, 5, 2, 0.0F));

        ModelRenderer right_gloove_addon2 = new ModelRenderer(this);
		right_gloove_addon2.setRotationPoint(0.0F, 0.0F, -1.0F);
		setRotationAngle(right_gloove_addon2, 0.0F, 0.0F, -0.3491F);
		right_glove2.addChild(right_gloove_addon2);
		right_gloove_addon2.cubeList.add(new ModelBox(right_gloove_addon2, 0, 43, -1.0F, -1.0F, 0.0F, 1, 4, 2, 0.0F));
		right_gloove_addon2.cubeList.add(new ModelBox(right_gloove_addon2, 139, 87, 0.0F, -1.0F, -1.0F, 1, 4, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(9.0F, -48.0F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0F, 0.0F, -0.1309F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 98, 1.0F, 0.0F, -4.0F, 6, 28, 7, 0.0F));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 101, 46, 0.0F, -7.0F, -6.0F, 5, 10, 12, 0.0F));

        ModelRenderer left_gloove = new ModelRenderer(this);
		left_gloove.setRotationPoint(4.6335F, 27.7738F, -4.0F);
		setRotationAngle(left_gloove, 3.1416F, -1.5272F, -3.1416F);
		bipedLeftArm.addChild(left_gloove);
		left_gloove.cubeList.add(new ModelBox(left_gloove, 80, 98, -1.0F, -2.0F, -2.0F, 1, 2, 4, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 62, 126, 0.0F, -2.0F, -3.0F, 1, 2, 6, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 100, 125, -1.0F, -11.0F, -3.0F, 1, 9, 6, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 36, 61, -1.0F, -16.0F, -2.0F, 1, 5, 4, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 72, 78, -1.0F, -21.0F, -1.0F, 1, 5, 2, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 90, 46, 0.0F, -6.0F, -4.0F, 1, 4, 8, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 82, 125, 1.0F, -6.0F, -4.0F, 1, 3, 8, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 123, 39, 1.3665F, -6.0F, -3.0F, 4, 3, 6, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 122, 104, 6.0F, -6.0F, -4.0F, 1, 3, 8, 0.0F));

        ModelRenderer right_gloove_addon3 = new ModelRenderer(this);
		right_gloove_addon3.setRotationPoint(0.0F, 0.0F, -1.0F);
		setRotationAngle(right_gloove_addon3, 0.0F, 0.0F, -0.3491F);
		left_gloove.addChild(right_gloove_addon3);
		right_gloove_addon3.cubeList.add(new ModelBox(right_gloove_addon3, 0, 33, -1.8776F, -0.6835F, 0.0872F, 1, 4, 2, 0.0F));
		right_gloove_addon3.cubeList.add(new ModelBox(right_gloove_addon3, 10, 0, -0.9629F, -0.5756F, -0.9034F, 1, 4, 4, 0.0F));

        ModelRenderer left_glove3 = new ModelRenderer(this);
		left_glove3.setRotationPoint(4.0257F, 26.2751F, 4.0F);
		setRotationAngle(left_glove3, -1.5708F, 1.5708F, -1.5708F);
		bipedLeftArm.addChild(left_glove3);
		left_glove3.cubeList.add(new ModelBox(left_glove3, 135, 57, -1.0F, -1.6667F, -2.0F, 1, 4, 4, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 0, 133, 0.0F, -1.6667F, -3.0F, 1, 4, 6, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 116, 95, -1.0F, -12.6667F, -3.0F, 1, 11, 6, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 26, 98, -1.0F, -18.6667F, -2.0F, 1, 6, 4, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 135, 0, 1.0F, 0.0F, -3.0F, 1, 4, 4, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 16, 43, 0.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 90, 46, -1.0F, -24.0F, -1.0F, 1, 5, 2, 0.0F));
		left_glove3.cubeList.add(new ModelBox(left_glove3, 74, 78, 0.0F, -8.0F, -4.0F, 1, 6, 8, 0.0F));

        ModelRenderer left_gloove_addon4 = new ModelRenderer(this);
		left_gloove_addon4.setRotationPoint(1.7997F, -0.1305F, 33.4451F);
		setRotationAngle(left_gloove_addon4, 0.0436F, 0.0F, -2.9671F);
		left_glove3.addChild(left_gloove_addon4);

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-7.0F, -20.0F, -1.0F);
		setRotationAngle(bipedRightLeg, -0.1309F, 0.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 150, 0, -3.0F, -1.5185F, -2.3466F, 4, 10, 4, 0.0F));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 33, -2.0F, -4.649F, -1.3552F, 5, 4, 6, 0.0F));

        ModelRenderer rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-8.0F, 19.351F, 6.6448F);
		setRotationAngle(rightLeg, 0.1309F, 0.0F, 0.0F);
		bipedRightLeg.addChild(rightLeg);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 57, 0, 5.0F, -11.8609F, -7.878F, 4, 10, 4, 0.0F));
		rightLeg.cubeList.add(new ModelBox(rightLeg, 70, 129, 4.0F, -2.0F, -10.0F, 2, 2, 7, 0.0F));
		rightLeg.cubeList.add(new ModelBox(rightLeg, 34, 132, 6.0F, -1.8695F, -8.0086F, 2, 2, 6, 0.0F));
		rightLeg.cubeList.add(new ModelBox(rightLeg, 125, 68, 8.0F, -2.2611F, -9.9829F, 2, 2, 7, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(6.0F, -20.0F, -1.0F);
		setRotationAngle(bipedLeftLeg, -0.1309F, 0.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 122, 24, -1.0F, -1.5185F, -2.3466F, 4, 10, 4, 0.0F));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 43, -3.0F, -4.649F, -1.3552F, 5, 4, 6, 0.0F));

        ModelRenderer leftLeg2 = new ModelRenderer(this);
		leftLeg2.setRotationPoint(-6.0F, 19.351F, 6.6448F);
		setRotationAngle(leftLeg2, 0.1309F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(leftLeg2);
		leftLeg2.cubeList.add(new ModelBox(leftLeg2, 57, 0, 5.0F, -11.8609F, -7.878F, 4, 10, 4, 0.0F));
		leftLeg2.cubeList.add(new ModelBox(leftLeg2, 130, 115, 4.0F, -2.0F, -10.0F, 2, 2, 7, 0.0F));
		leftLeg2.cubeList.add(new ModelBox(leftLeg2, 132, 104, 6.0F, -1.8695F, -8.0086F, 2, 2, 6, 0.0F));
		leftLeg2.cubeList.add(new ModelBox(leftLeg2, 130, 95, 8.0F, -2.2611F, -9.9829F, 2, 2, 7, 0.0F));
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
