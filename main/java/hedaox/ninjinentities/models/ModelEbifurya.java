package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelEbifurya extends ModelBase {
	private final ModelRenderer bipedHead;
    private final ModelRenderer bipedBody;
    private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelEbifurya(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, 1.0F, -3.0F);
		bipedHead.addChild(hair);

        ModelRenderer hair1 = new ModelRenderer(this);
		hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hair1);
		hair1.cubeList.add(new ModelBox(hair1, 43, 16, -1.0F, -5.0152F, 7.8263F, 2, 2, 0, 0.0F));

        ModelRenderer hair2 = new ModelRenderer(this);
		hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hair2);
		hair2.cubeList.add(new ModelBox(hair2, 47, 47, -1.0F, -11.8264F, 6.9848F, 2, 7, 3, 0.0F));

        ModelRenderer hair3 = new ModelRenderer(this);
		hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hair3);
		hair3.cubeList.add(new ModelBox(hair3, 24, 22, -1.0F, -12.8264F, -1.0152F, 2, 4, 8, 0.0F));

        ModelRenderer hair4 = new ModelRenderer(this);
		hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hair4);
		hair4.cubeList.add(new ModelBox(hair4, 42, 13, -1.0F, -10.8264F, -1.0152F, 2, 2, 9, 0.0F));

        ModelRenderer hair5 = new ModelRenderer(this);
		hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(hair5);
		hair5.cubeList.add(new ModelBox(hair5, 49, 20, -1.0F, -10.8264F, 5.9848F, 2, 6, 2, 0.0F));

        ModelRenderer earL = new ModelRenderer(this);
		earL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earL, 0.0F, 0.5236F, 0.0F);
		bipedHead.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 0, 52, 4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earR, 0.0F, -0.5236F, 0.0F);
		bipedHead.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 0, 52, -4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer ponyTail = new ModelRenderer(this);
		ponyTail.setRotationPoint(0.0F, 23.3125F, 0.4375F);
		bipedHead.addChild(ponyTail);

        ModelRenderer PT1 = new ModelRenderer(this);
		PT1.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT1, 0.1745F, 0.0F, 0.0F);
		ponyTail.addChild(PT1);
		PT1.cubeList.add(new ModelBox(PT1, 43, 18, -1.0F, -0.5F, -0.5F, 2, 9, 1, 0.0F));

        ModelRenderer PT2 = new ModelRenderer(this);
		PT2.setRotationPoint(0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT2, 0.1745F, 0.0F, -0.2618F);
		ponyTail.addChild(PT2);
		PT2.cubeList.add(new ModelBox(PT2, 43, 18, -1.0F, -0.5F, -0.5F, 2, 8, 1, 0.0F));

        ModelRenderer PT3 = new ModelRenderer(this);
		PT3.setRotationPoint(-0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT3, 0.1745F, 0.0F, 0.2618F);
		ponyTail.addChild(PT3);
		PT3.cubeList.add(new ModelBox(PT3, 43, 18, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.0F));

        ModelRenderer PT4 = new ModelRenderer(this);
		PT4.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT4, 0.3491F, 0.0F, 0.0F);
		ponyTail.addChild(PT4);
		PT4.cubeList.add(new ModelBox(PT4, 43, 18, -1.0F, -0.5F, -0.5F, 2, 7, 1, 0.0F));

        ModelRenderer PT5 = new ModelRenderer(this);
		PT5.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT5, 0.0F, 0.0F, 0.1745F);
		ponyTail.addChild(PT5);
		PT5.cubeList.add(new ModelBox(PT5, 43, 18, -1.0F, -0.5F, -0.5F, 2, 8, 1, 0.0F));

        ModelRenderer PT6 = new ModelRenderer(this);
		PT6.setRotationPoint(0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT6, 0.1745F, 0.0F, -0.5236F);
		ponyTail.addChild(PT6);
		PT6.cubeList.add(new ModelBox(PT6, 43, 18, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.0F));

        ModelRenderer PT7 = new ModelRenderer(this);
		PT7.setRotationPoint(-0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT7, 0.1745F, 0.0F, 0.5236F);
		ponyTail.addChild(PT7);
		PT7.cubeList.add(new ModelBox(PT7, 43, 18, -1.0F, -0.5F, -0.5F, 2, 5, 1, 0.0F));

        ModelRenderer PT8 = new ModelRenderer(this);
		PT8.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT8, 0.5236F, 0.0F, 0.0F);
		ponyTail.addChild(PT8);
		PT8.cubeList.add(new ModelBox(PT8, 43, 18, -1.0F, -0.5F, -0.5F, 2, 4, 1, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

        ModelRenderer armor = new ModelRenderer(this);
		armor.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(armor);

        ModelRenderer bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		armor.addChild(bodyChild_1);

        ModelRenderer bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.5236F, 0.0F, 0.0F);
		armor.addChild(bodyChild_3);

        ModelRenderer bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_2, -0.3491F, 0.0F, 0.0F);
		armor.addChild(bodyChild_2);

        ModelRenderer bodyChild = new ModelRenderer(this);
		bodyChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild, -0.1745F, 0.0F, 0.0F);
		armor.addChild(bodyChild);

        ModelRenderer bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.1745F);
		armor.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 24, 0, 4.0F, -3.0F, -2.0F, 1, 3, 1, 0.0F));

        ModelRenderer bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 4.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.1745F);
		armor.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 16, 4.0F, -3.0F, -3.0F, 1, 3, 1, 0.0F));

        ModelRenderer bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.1745F);
		armor.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 3, 3, -5.0F, -3.0F, -2.0F, 1, 3, 1, 0.0F));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -5.0F, -3.0F, 2.0F, 1, 3, 1, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 37, -3.0031F, -2.079F, -2.0018F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 0, -0.9938F, -2.158F, -1.9964F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 18, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 34, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
