package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCellmax extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Head1;
	private final ModelRenderer FroB;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer Body;
	private final ModelRenderer leftwing_r1;
	private final ModelRenderer rightwing_r1;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	public int heldItemRight;
	private float scale = 1.0F;

	public ModelCellmax(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(1.8F, -12.3F, 0.0F);
		Head.addChild(Head2);
		setRotationAngle(Head2, 0.0F, 0.0F, 0.2705F);
		Head2.cubeList.add(new ModelBox(Head2, 108, 50, 0.7F, -1.7F, -3.5F, 3, 7, 7, 0.0F));

		Head1 = new ModelRenderer(this);
		Head1.setRotationPoint(-1.5F, -10.5F, 0.0F);
		Head.addChild(Head1);
		setRotationAngle(Head1, 0.0F, 0.0F, -0.2705F);
		Head1.cubeList.add(new ModelBox(Head1, 108, 50, -3.5F, -3.5F, -3.5F, 3, 7, 7, 0.0F));

		FroB = new ModelRenderer(this);
		FroB.setRotationPoint(0.0F, 5.0F, 2.0F);


		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 71, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 71, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 71, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 71, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 71, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 71, 54, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F));
		ftailS6.cubeList.add(new ModelBox(ftailS6, 18, 44, -3.5F, -3.5F, 6.0F, 7, 7, 6, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.5F, 0.0F, 6.0F);
		ftailS6.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7418F, 0.0F, -1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 48, -2.0F, -2.0268F, 0.0118F, 4, 2, 2, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, 3.4142F, 6.0F);
		ftailS6.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 48, -1.0F, -1.9272F, -0.0429F, 4, 2, 2, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.5F, 0.0F, 6.0F);
		ftailS6.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.829F, 0.0F, -1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 48, -2.0F, 0.0F, -2.0F, 4, 2, 2, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -2.0858F, 6.0F);
		ftailS6.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 48, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		leftwing_r1 = new ModelRenderer(this);
		leftwing_r1.setRotationPoint(2.8F, -1.4F, 2.2F);
		Body.addChild(leftwing_r1);
		setRotationAngle(leftwing_r1, 0.1745F, 0.0F, -0.2182F);
		leftwing_r1.cubeList.add(new ModelBox(leftwing_r1, 114, 20, -2.3F, -3.2411F, 0.6314F, 7, 20, 0, 0.0F));

		rightwing_r1 = new ModelRenderer(this);
		rightwing_r1.mirror = true;
		rightwing_r1.setRotationPoint(-7.2F, -1.4F, 2.2F);
		Body.addChild(rightwing_r1);
		setRotationAngle(rightwing_r1, 0.1309F, 0.0F, 0.2182F);
		rightwing_r1.cubeList.add(new ModelBox(rightwing_r1, 114, 20, -0.7F, -4.15F, 0.6314F, 7, 20, 0, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.mirror = true;
		LLeg.setRotationPoint(0.8F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -1.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild) {
			GL11.glPushMatrix();
			GL11.glScalef(this.scale, this.scale, this.scale);
			GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
			this.Head.render(f5);
			this.Body.render(f5);
			GL11.glPopMatrix();
		} else {
			GL11.glScalef(this.scale, this.scale, this.scale);
			GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
			this.Head.render(f5);
			this.Body.render(f5);
			renderHairs(0.0625F, "FR", f2);
			this.RArm.render(f5);
			this.LArm.render(f5);
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
		if (this.heldItemRight != 0) {
			this.RArm.rotateAngleX = (this.RArm.rotateAngleX * 0.5F - 0.31415927F * this.heldItemRight);
		}
		this.RArm.rotateAngleY = 0.0F;
		if (this.onGround > -9990.0F) {
			float f6 = this.onGround;
			this.Body.rotateAngleY = (MathHelper.sin(MathHelper.sqrt_float(f6) * 3.1415927F * 2.0F) * 0.2F);
			this.RArm.rotationPointZ = (-MathHelper.sin(this.Body.rotateAngleY) * 5.0F);
			this.RArm.rotationPointX = (-MathHelper.cos(this.Body.rotateAngleY) * 5.0F);
			this.LArm.rotationPointZ = (-MathHelper.sin(this.Body.rotateAngleY) * 5.0F);
			this.LArm.rotationPointX = (MathHelper.cos(this.Body.rotateAngleY) * 5.0F);

			f6 = 1.0F - this.onGround;
			f6 *= f6;
			f6 *= f6;
			f6 = 1.0F - f6;
			float f7 = MathHelper.sin(f6 * 3.1415927F);
			float f8 = MathHelper.sin(this.onGround * 3.1415927F) * -(this.Head.rotateAngleX - 0.7F) * 0.75F;
			this.RArm.rotateAngleX = ((float)(this.RArm.rotateAngleX - (f7 * 1.2D + f8)));
			this.RArm.rotateAngleY += this.Body.rotateAngleY * 2.0F;
			this.RArm.rotateAngleZ = (MathHelper.sin(this.onGround * 2.1415927F) * -0.4F);

			this.RArm.offsetX = 0.063F;
			this.RArm.offsetZ = 0.0F;
			this.LArm.offsetX = -0.062F;
			this.LArm.offsetZ = 0.0F;
		}
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
	public void renderHairs(float par1, String hair, float par3)
	{
		if (hair.equals("FR"))
		{
			GL11.glPushMatrix();
			transRot(par1, Body);
			GL11.glScalef(1.0F, 1.0F, 1.0F);
			FroB.render(par1);
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
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}