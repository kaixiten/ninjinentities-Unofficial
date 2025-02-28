package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelBaba extends ModelBase {
	private final ModelRenderer Tete;
	private final ModelRenderer Corps;
	private final ModelRenderer Dos;
	private float scaleX;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelBaba(float _scaleX, float _scaleY, float _scaleZ) {
		textureWidth = 128;
		textureHeight = 64;

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		Tete = new ModelRenderer(this);
		Tete.setRotationPoint(0.0F, 7.0F, 1.0F);
		Tete.cubeList.add(new ModelBox(Tete, 33, 33, -3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F));

		ModelRenderer couronne_Chapeau = new ModelRenderer(this);
		couronne_Chapeau.setRotationPoint(11.0F, -7.0F, -1.0F);
		Tete.addChild(couronne_Chapeau);
		couronne_Chapeau.cubeList.add(new ModelBox(couronne_Chapeau, 73, 1, -18.0F, 0.0F, -6.0F, 14, 1, 14, 0.0F));

		ModelRenderer chapeau_1 = new ModelRenderer(this);
		chapeau_1.setRotationPoint(0.0F, -7.0F, -1.0F);
		Tete.addChild(chapeau_1);
		chapeau_1.cubeList.add(new ModelBox(chapeau_1, 0, 22, -3.0F, -3.5F, -2.0F, 6, 4, 6, 0.0F));

		ModelRenderer chapeau_2 = new ModelRenderer(this);
		chapeau_2.setRotationPoint(0.0F, -7.0F, -1.0F);
		Tete.addChild(chapeau_2);
		chapeau_2.cubeList.add(new ModelBox(chapeau_2, 84, 24, -2.0F, -7.5F, -1.0F, 4, 4, 4, 0.0F));

		ModelRenderer chapeau_3 = new ModelRenderer(this);
		chapeau_3.setRotationPoint(0.0F, -7.0F, -1.0F);
		Tete.addChild(chapeau_3);
		chapeau_3.cubeList.add(new ModelBox(chapeau_3, 101, 28, -1.0F, -9.5F, 0.0F, 2, 2, 2, 0.0F));

		Corps = new ModelRenderer(this);
		Corps.setRotationPoint(0.0F, 24.0F, 0.0F);

		ModelRenderer boule_Principale = new ModelRenderer(this);
		boule_Principale.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(boule_Principale);
		boule_Principale.cubeList.add(new ModelBox(boule_Principale, 0, 44, -5.0F, 11.0F, -4.0F, 10, 10, 10, 0.0F));

		ModelRenderer boule_Cote_1 = new ModelRenderer(this);
		boule_Cote_1.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(boule_Cote_1);
		boule_Cote_1.cubeList.add(new ModelBox(boule_Cote_1, 98, 48, 4.5F, 12.0F, -3.0F, 1, 8, 8, 0.0F));

		ModelRenderer boule_Cote_2 = new ModelRenderer(this);
		boule_Cote_2.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(boule_Cote_2);
		boule_Cote_2.cubeList.add(new ModelBox(boule_Cote_2, 59, 48, -5.5F, 12.0F, -3.0F, 1, 8, 8, 0.0F));

		ModelRenderer boule_Cote_3 = new ModelRenderer(this);
		boule_Cote_3.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(boule_Cote_3);
		boule_Cote_3.cubeList.add(new ModelBox(boule_Cote_3, 41, 55, -4.0F, 12.0F, -4.5F, 8, 8, 1, 0.0F));

		ModelRenderer boucle_Cote_4 = new ModelRenderer(this);
		boucle_Cote_4.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(boucle_Cote_4);
		boucle_Cote_4.cubeList.add(new ModelBox(boucle_Cote_4, 78, 55, -4.0F, 12.0F, 5.5F, 8, 8, 1, 0.0F));

		ModelRenderer boule_Cote_5 = new ModelRenderer(this);
		boule_Cote_5.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(boule_Cote_5);
		boule_Cote_5.cubeList.add(new ModelBox(boule_Cote_5, 71, 46, -4.0F, 20.5F, -3.0F, 8, 1, 8, 0.0F));

		ModelRenderer gros_cul = new ModelRenderer(this);
		gros_cul.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(gros_cul);
		gros_cul.cubeList.add(new ModelBox(gros_cul, 0, 33, -4.0F, 8.5F, -3.0F, 8, 3, 8, 0.0F));

		ModelRenderer main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(main);
		main.cubeList.add(new ModelBox(main, 0, 18, -1.0F, 6.5F, -4.0F, 2, 2, 1, 0.0F));

		ModelRenderer bras_Gauche = new ModelRenderer(this);
		bras_Gauche.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(bras_Gauche);
		bras_Gauche.cubeList.add(new ModelBox(bras_Gauche, 58, 25, 3.0F, 6.5F, -2.0F, 2, 2, 6, 0.0F));

		ModelRenderer bras_Droit = new ModelRenderer(this);
		bras_Droit.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(bras_Droit);
		bras_Droit.cubeList.add(new ModelBox(bras_Droit, 58, 33, -5.0F, 6.5F, -2.0F, 2, 2, 6, 0.0F));

		ModelRenderer bras_Devant = new ModelRenderer(this);
		bras_Devant.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(bras_Devant);
		bras_Devant.cubeList.add(new ModelBox(bras_Devant, 58, 42, -5.0F, 6.5F, -3.0F, 10, 2, 1, 0.0F));

		ModelRenderer epaule_Droite = new ModelRenderer(this);
		epaule_Droite.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(epaule_Droite);
		epaule_Droite.cubeList.add(new ModelBox(epaule_Droite, 75, 34, -5.0F, 4.5F, 2.0F, 2, 2, 2, 0.0F));

		ModelRenderer epaule_Droite_2 = new ModelRenderer(this);
		epaule_Droite_2.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(epaule_Droite_2);
		epaule_Droite_2.cubeList.add(new ModelBox(epaule_Droite_2, 75, 39, -5.0F, 5.5F, 1.0F, 2, 1, 1, 0.0F));

		ModelRenderer epaule_Gauche = new ModelRenderer(this);
		epaule_Gauche.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(epaule_Gauche);
		epaule_Gauche.cubeList.add(new ModelBox(epaule_Gauche, 75, 26, 3.0F, 4.5F, 2.0F, 2, 2, 2, 0.0F));

		ModelRenderer epaule_Gauche_2 = new ModelRenderer(this);
		epaule_Gauche_2.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(epaule_Gauche_2);
		epaule_Gauche_2.cubeList.add(new ModelBox(epaule_Gauche_2, 75, 31, 3.0F, 5.5F, 1.0F, 2, 1, 1, 0.0F));

		Dos = new ModelRenderer(this);
		Dos.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Dos);
		Dos.cubeList.add(new ModelBox(Dos, 27, 24, -3.0F, 6.5F, -2.0F, 6, 2, 6, 0.0F));
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Tete.render(f5);
		Corps.render(f5);
		GL11.glPopMatrix();
        this.Tete.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.Tete.rotateAngleX = f4 / (180F / (float)Math.PI);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
