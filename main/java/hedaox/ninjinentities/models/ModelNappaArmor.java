package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNappaArmor extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
    private final ModelRenderer bipedLeftArm;
    private final ModelRenderer bipedRightLeg;
    private final ModelRenderer bipedLeftLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNappaArmor(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.2F, 5.4F, -0.2F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer RShoulderArmor = new ModelRenderer(this);
		RShoulderArmor.setRotationPoint(-3.0F, -1.7F, 0.0F);
		setRotationAngle(RShoulderArmor, -1.5708F, 0.0F, 0.1047F);
		bipedRightArm.addChild(RShoulderArmor);
		RShoulderArmor.cubeList.add(new ModelBox(RShoulderArmor, 24, 0, -3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.mirror = true;
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer LShoulderArmor = new ModelRenderer(this);
		LShoulderArmor.setRotationPoint(11.0F, -1.7F, 0.0F);
		setRotationAngle(LShoulderArmor, -1.5708F, 0.0F, -0.1047F);
		bipedLeftArm.addChild(LShoulderArmor);
		LShoulderArmor.mirror = true;
		LShoulderArmor.cubeList.add(new ModelBox(LShoulderArmor, 24, 0, -3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer belt = new ModelRenderer(this);
		belt.setRotationPoint(-0.8F, -1.6F, -2.2F);
		setRotationAngle(belt, -0.0698F, 0.0873F, 0.0F);
		bipedRightLeg.addChild(belt);

        ModelRenderer belt2 = new ModelRenderer(this);
		belt2.setRotationPoint(-0.8F, -1.6F, -2.2F);
		setRotationAngle(belt2, -0.0698F, 1.2217F, 0.0F);
		bipedRightLeg.addChild(belt2);

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer FKusazuri = new ModelRenderer(this);
		FKusazuri.setRotationPoint(-0.2F, 5.7F, -0.9F);
		setRotationAngle(FKusazuri, -0.0873F, 0.0F, 0.0F);
		bipedBody.addChild(FKusazuri);
		FKusazuri.cubeList.add(new ModelBox(FKusazuri, 52, 0, -3.0F, -1.0F, -1.0F, 6, 9, 0, 0.0F));

        ModelRenderer RKusazuri = new ModelRenderer(this);
		RKusazuri.setRotationPoint(-4.4F, 4.9F, 0.1F);
		setRotationAngle(RKusazuri, 0.0873F, -1.5708F, 0.0F);
		bipedBody.addChild(RKusazuri);
		RKusazuri.cubeList.add(new ModelBox(RKusazuri, 52, 10, -2.0F, -0.3149F, -0.1781F, 4, 9, 0, 0.0F));

        ModelRenderer LKusazuri = new ModelRenderer(this);
		LKusazuri.setRotationPoint(4.0F, 4.9F, 0.1F);
		setRotationAngle(LKusazuri, 0.0873F, 1.5708F, 0.0F);
		bipedBody.addChild(LKusazuri);
		LKusazuri.mirror = true;
		LKusazuri.cubeList.add(new ModelBox(LKusazuri, 52, 10, -2.0F, -0.3149F, -0.1781F, 4, 9, 0, 0.0F));
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
