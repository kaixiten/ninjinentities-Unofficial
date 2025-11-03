package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelJanemba extends ModelBase {
	private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelJanemba(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -16.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 66, 0, -4.9F, -4.0F, -4.5F, 10, 4, 10, 0.0F));

        ModelRenderer head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(head2);
		head2.cubeList.add(new ModelBox(head2, 70, 81, -4.0F, -8.0F, -3.5F, 8, 8, 8, 0.0F));

        ModelRenderer lefteyebrow = new ModelRenderer(this);
		lefteyebrow.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(lefteyebrow, 0.0F, -0.5463F, -0.4554F);
		Head.addChild(lefteyebrow);
		lefteyebrow.cubeList.add(new ModelBox(lefteyebrow, 10, 6, 2.1F, -7.9F, -4.1F, 4, 1, 1, 0.0F));

        ModelRenderer righteyebrow = new ModelRenderer(this);
		righteyebrow.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(righteyebrow, 0.0F, 0.5463F, 0.4554F);
		Head.addChild(righteyebrow);
		righteyebrow.cubeList.add(new ModelBox(righteyebrow, 12, 3, -6.0F, -8.0F, -4.0F, 4, 1, 1, 0.0F));

        ModelRenderer leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftear, 0.0F, -0.5463F, -0.4554F);
		Head.addChild(leftear);
		leftear.cubeList.add(new ModelBox(leftear, 12, 0, 4.0F, -4.0F, -1.0F, 5, 3, 0, 0.0F));

        ModelRenderer rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightear, 0.0F, 0.5463F, 0.4554F);
		Head.addChild(rightear);
		rightear.cubeList.add(new ModelBox(rightear, 0, 12, -9.0F, -4.4F, -1.6F, 5, 3, 0, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -11.2F, -8.0F, -10.4F, 22, 18, 22, 0.0F));

        ModelRenderer holeL1 = new ModelRenderer(this);
		holeL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(holeL1);
		holeL1.cubeList.add(new ModelBox(holeL1, 0, 121, 5.0F, -17.0F, -2.0F, 4, 1, 4, 0.0F));

        ModelRenderer holeR1 = new ModelRenderer(this);
		holeR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(holeR1);
		holeR1.cubeList.add(new ModelBox(holeR1, 0, 121, -9.0F, -17.0F, -2.0F, 4, 1, 4, 0.0F));

        ModelRenderer upperBody = new ModelRenderer(this);
		upperBody.setRotationPoint(0.0F, -17.1F, 1.2F);
		Body.addChild(upperBody);
		upperBody.cubeList.add(new ModelBox(upperBody, 0, 40, -9.6F, 1.0F, -8.9F, 19, 8, 17, 0.0F));

        ModelRenderer breasts = new ModelRenderer(this);
		breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(breasts, -0.4098F, 0.0F, 0.0F);
		Body.addChild(breasts);
		breasts.cubeList.add(new ModelBox(breasts, 55, 40, -9.0F, -11.0F, -12.5F, 18, 6, 7, 0.0F));

        ModelRenderer junkSide = new ModelRenderer(this);
		junkSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(junkSide, 0.4554F, 0.0F, 0.0F);
		Body.addChild(junkSide);
		junkSide.cubeList.add(new ModelBox(junkSide, 58, 58, -10.6F, 4.5F, -13.5F, 21, 9, 14, 0.0F));

        ModelRenderer ass = new ModelRenderer(this);
		ass.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(ass);
		ass.cubeList.add(new ModelBox(ass, 0, 67, -10.6F, 9.0F, -6.3F, 21, 9, 14, 0.0F));

        ModelRenderer holeL2 = new ModelRenderer(this);
		holeL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(holeL2, 0.0F, 0.0F, 0.7285F);
		Body.addChild(holeL2);
		holeL2.cubeList.add(new ModelBox(holeL2, 0, 0, 0.0F, -7.0F, -12.0F, 4, 4, 2, 0.0F));

        ModelRenderer holeL3 = new ModelRenderer(this);
		holeL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(holeL3, 0.0F, 0.0F, 0.7285F);
		Body.addChild(holeL3);
		holeL3.cubeList.add(new ModelBox(holeL3, 0, 6, 5.5F, -1.0F, -12.0F, 4, 4, 2, 0.0F));

        ModelRenderer holeR2 = new ModelRenderer(this);
		holeR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(holeR2, 0.0F, 0.0F, -0.7285F);
		Body.addChild(holeR2);
		holeR2.cubeList.add(new ModelBox(holeR2, 0, 0, -4.0F, -7.0F, -12.0F, 4, 4, 2, 0.0F));

        ModelRenderer holeR3 = new ModelRenderer(this);
		holeR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(holeR3, 0.0F, 0.0F, -0.7285F);
		Body.addChild(holeR3);
		holeR3.cubeList.add(new ModelBox(holeR3, 0, 6, -9.5F, -1.0F, -12.0F, 4, 4, 2, 0.0F));


        ModelRenderer tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(-3.0F, 4.3F, 13.0F);
		setRotationAngle(tail1, -0.1745F, 0.0F, 0.0F);
		Body.addChild(tail1);
		tail1.cubeList.add(new ModelBox(tail1, 92, 109, 0.0F, 0.0F, -2.0F, 5, 5, 13, 0.0F));

        ModelRenderer tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(-3.0F, 5.2F, 21.0F);
		setRotationAngle(tail2, 0.1745F, 0.0F, 0.0F);
		Body.addChild(tail2);
		tail2.cubeList.add(new ModelBox(tail2, 97, 112, 0.0F, 0.9848F, -0.1736F, 5, 5, 10, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-9.0F, -16.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.4887F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 88, 14, -6.0F, 0.0F, -3.0F, 6, 18, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(10.0F, -16.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.4887F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 90, -1.0F, 0.0F, -3.0F, 6, 17, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 24.0F, 0.0F);
		Body.addChild(RLeg);

        ModelRenderer leg_1 = new ModelRenderer(this);
		leg_1.setRotationPoint(-3.3F, -5.8F, 0.0F);
		RLeg.addChild(leg_1);
		leg_1.cubeList.add(new ModelBox(leg_1, 94, 94, -4.1F, 0.0F, -4.4F, 8, 3, 8, 0.0F));

        ModelRenderer rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-1.3F, -29.8F, 0.0F);
		setRotationAngle(rightfoot, 0.0F, 0.4363F, 0.0F);
		RLeg.addChild(rightfoot);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 95, 43, -4.2289F, 27.0F, -7.5163F, 5, 3, 10, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 24.0F, 0.0F);
		Body.addChild(LLeg);

        ModelRenderer leg_2 = new ModelRenderer(this);
		leg_2.setRotationPoint(3.3F, -5.8F, 0.0F);
		LLeg.addChild(leg_2);
		leg_2.mirror = true;
		leg_2.cubeList.add(new ModelBox(leg_2, 94, 94, -3.9F, 0.0F, -4.4F, 8, 3, 8, 0.0F));

        ModelRenderer leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(1.3F, -29.8F, 0.0F);
		setRotationAngle(leftfoot, 0.0F, -0.4363F, 0.0F);
		LLeg.addChild(leftfoot);
		leftfoot.mirror = true;
		leftfoot.cubeList.add(new ModelBox(leftfoot, 95, 43, -0.7711F, 27.0F, -7.5163F, 5, 3, 10, 0.0F));
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
