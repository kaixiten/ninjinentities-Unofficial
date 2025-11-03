package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelVegetaOozaru extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer FroB;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
    private float scale = 1.0F;

	public ModelVegetaOozaru(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

        ModelRenderer snout = new ModelRenderer(this);
		snout.setRotationPoint(1.0F, -5.0F, -2.0F);
		Head.addChild(snout);
		snout.cubeList.add(new ModelBox(snout, 50, 2, -3.0F, 2.0F, -5.0F, 4, 3, 3, 0.0F));

        ModelRenderer ear = new ModelRenderer(this);
		ear.setRotationPoint(0.0F, 0.0F, -1.0F);
		Head.addChild(ear);
		setRotationAngle(ear, 0.0F, 3.1416F, 0.0F);


        ModelRenderer ear_r1 = new ModelRenderer(this);
		ear_r1.mirror = true;
		ear_r1.setRotationPoint(-4.4F, -4.5F, -0.3342F);
		ear.addChild(ear_r1);
		setRotationAngle(ear_r1, -0.0271F, 0.2606F, -0.0902F);
		ear_r1.cubeList.add(new ModelBox(ear_r1, 0, -4, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F));

        ModelRenderer ear_r2 = new ModelRenderer(this);
		ear_r2.mirror = true;
		ear_r2.setRotationPoint(4.4F, -4.5F, -0.3342F);
		ear.addChild(ear_r2);
		setRotationAngle(ear_r2, -0.0271F, -0.2606F, 0.0902F);
		ear_r2.cubeList.add(new ModelBox(ear_r2, 0, -4, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.mirror = true;
		LLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

        ModelRenderer RShoulderArmor = new ModelRenderer(this);
		RShoulderArmor.mirror = true;
		RShoulderArmor.setRotationPoint(-0.2F, -5.4F, -3.8F);
		Body.addChild(RShoulderArmor);
		setRotationAngle(RShoulderArmor, -1.5708F, 0.0F, 0.0873F);
		RShoulderArmor.cubeList.add(new ModelBox(RShoulderArmor, 0, 32, -6.0F, -2.5F, 0.0F, 6, 5, 4, 0.0F));

        ModelRenderer LShoulderArmor = new ModelRenderer(this);
		LShoulderArmor.setRotationPoint(7.8F, -5.4F, -3.8F);
		Body.addChild(LShoulderArmor);
		setRotationAngle(LShoulderArmor, -1.5708F, 0.0F, -0.0873F);
		LShoulderArmor.cubeList.add(new ModelBox(LShoulderArmor, 0, 32, 0.0F, -2.5F, 0.0F, 6, 5, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.mirror = true;
		LArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

        FroB = new ModelRenderer(this);
        FroB.setRotationPoint(-2.3F, 16.0F, 2.0F);


		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(8.0F, -4.0F, -4.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 34, 4, -2.5F, -2.0F, -1.0F, 4, 4, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 34, 4, -2.5F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 34, 4, -2.5F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 34, 4, -2.5F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 34, 4, -2.5F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 34, 4, -2.5F, -2.0F, 0.0F, 4, 4, 6, 0.0F));
	}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(this.scale, this.scale, this.scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
        Head.render(f5);
        Body.render(f5);
        RArm.render(f5);
        LArm.render(f5);
        renderHairs(0.0625F, "FR", f2);
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

    private void transRot(float f5, ModelRenderer m)
    {
        GL11.glTranslatef(m.rotationPointX * f5, m.rotationPointY * f5, m.rotationPointZ * f5);
        if (m.rotateAngleZ != 0.0F) {
            GL11.glRotatef(m.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
        }
        if (m.rotateAngleY != 0.0F) {
            GL11.glRotatef(m.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
        }
        if (m.rotateAngleX != 0.0F) {
            GL11.glRotatef(m.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
        }
    }
    public String renderHairs(float par1, String hair, float par3)
    {
        if (hair.equals("FR"))
        {
            GL11.glPushMatrix();
            transRot(par1, Body);
            GL11.glScalef(0.7F, 0.35F, 1.0F);
            FroB.render(par1);
            GL11.glScaled(0.1D, 0.1D, 0.1D);
            float r = MathHelper.sin(par3 * 0.02F) * 0.1F;
            float r2 = MathHelper.cos(par3 * 0.02F) * 0.1F;
            float r3 = MathHelper.cos(par3 * 0.14F) * 0.1F;
            ftailS1.rotateAngleY = 0.2F;
            ftailS1.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r;
            ftailS1.rotateAngleX = -0.3F;
            ftailS2.rotateAngleY = 0.2F;
            ftailS2.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.2F - 0.2F + r2 + r3;
            ftailS2.rotateAngleX = 0.4F;
            ftailS3.rotateAngleY = 0.1F;
            ftailS3.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.1F - 0.1F + r + r3;
            ftailS3.rotateAngleX = 0.6F;
            ftailS3.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F + 0.3F;
            ftailS4.rotateAngleY = 0.1F;
            ftailS4.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.1F + r2;
            ftailS4.rotateAngleX = 0.3F;
            ftailS4.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.2F;
            ftailS5.rotateAngleY = 0.2F;
            ftailS5.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r + r3;
            ftailS5.rotateAngleX = -0.2F;
            ftailS5.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.1F - 0.3F;
            ftailS6.rotateAngleY = 0.2F;
            ftailS6.rotateAngleY += MathHelper.cos(par3 * 0.09F) * 0.4F - 0.2F + r2 + r3;
            ftailS6.rotateAngleX = -0.4F;
            ftailS6.rotateAngleX += MathHelper.sin(par3 * 0.09F) * 0.4F - 0.4F;
            GL11.glPopMatrix();
        }
        return "";
    }
}
