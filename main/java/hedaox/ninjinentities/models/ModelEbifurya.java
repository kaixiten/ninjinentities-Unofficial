package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelEbifurya extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelEbifurya(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, 1.0F, -3.0F);
		Head.addChild(hair);

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
		Head.addChild(earL);
		earL.cubeList.add(new ModelBox(earL, 0, 52, 4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer earR = new ModelRenderer(this);
		earR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earR, 0.0F, -0.5236F, 0.0F);
		Head.addChild(earR);
		earR.cubeList.add(new ModelBox(earR, 0, 52, -4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

        ModelRenderer ponyTail = new ModelRenderer(this);
		ponyTail.setRotationPoint(0.0F, 23.3125F, 0.4375F);
		Head.addChild(ponyTail);

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

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

        ModelRenderer armor = new ModelRenderer(this);
		armor.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(armor);

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

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 0, 37, -3.0031F, -2.079F, -2.0018F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 32, 0, -0.9938F, -2.158F, -1.9964F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 18, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 34, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
        this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
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
