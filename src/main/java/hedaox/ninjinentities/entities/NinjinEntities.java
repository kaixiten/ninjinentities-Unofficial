package hedaox.ninjinentities.entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import hedaox.ninjinentities.Main;
import hedaox.ninjinentities.entities.IF.*;
import hedaox.ninjinentities.entities.DBAF.*;
import hedaox.ninjinentities.entities.DAIMA.*;
import hedaox.ninjinentities.entities.DB.*;
import hedaox.ninjinentities.entities.DBGT.*;
import hedaox.ninjinentities.entities.DBS.*;
import hedaox.ninjinentities.entities.DBZ.*;
import hedaox.ninjinentities.entities.Movies.*;
import hedaox.ninjinentities.entities.ZENO.*;
import hedaox.ninjinentities.entities.doujin.*;
import hedaox.ninjinentities.lib.ModVars;

public class NinjinEntities {

	private static int entityId = 0;

	public static void init()
	{
		createEntity(EntityMasterBaba.class, 64, "masterBaba");
		createEntity(EntityGeneralBlue.class, 64, "generalBlue");
		createEntity(EntityHercule.class, 64, "hercule");
		createEntity(EntityGohanAdult.class, 64, "gohanAdult");
		createEntity(EntityGohanAdultSsj.class, 64, "gohanAdultSsj");
		createEntity(EntityGohanAdultSsj2.class, 64, "gohanAdultSsj2");
		createEntity(EntityGohanKid1.class, 64, "gohanKid1");
		createEntity(EntityGohanKid2.class, 64, "gohanKid2");
		createEntity(EntityGohanKid3.class, 64, "gohanKid3");
		createEntity(EntityGohanKidArmor.class, 64, "gohanKidArmor");
		createEntity(EntityGohanTeen.class, 64, "gohanTeen");
		createEntity(EntityGohanTeenArmor.class, 64, "gohanTeenArmor");
		createEntity(EntityGohanTeenArmorSsj.class, 64, "gohanTeenArmorSsj");
		createEntity(EntityGohanTeenSsj.class, 64, "gohanTeenSsj");
		createEntity(EntityGohanTeenSsj2.class, 64, "gohanTeenSsj2");
		createEntity(EntityGohanUltimate.class, 64, "gohanUltimate");
        createEntity(EntityGohanBeast.class, 64, "gohanBeast");
		createEntity(EntityGokuKid1.class, 64, "gokuKid1");
		createEntity(EntityGokuKid2.class, 64, "gokuKid2");
		createEntity(EntityGoku1.class, 64, "goku1");
		createEntity(EntityGoku2Kaioken.class, 64, "goku2Kaioken");
		createEntity(EntityGoku2.class, 64, "goku2");
		createEntity(EntityGokuArmor.class, 64, "gokuArmor");
		createEntity(EntityGokuArmorSsj.class, 64, "gokuArmorSsj");
		createEntity(EntityGokunoweight.class, 64, "gokunoweight");
		createEntity(EntityGokuSsj.class, 64, "gokuSsj");
		createEntity(EntityGokuSsj2.class, 64, "gokuSsj2");
		createEntity(EntityGokuSsj3.class, 64, "gokuSsj3");
		createEntity(EntityGokuSsj4.class, 64, "gokuSsj4");
        createEntity(EntityGokuSsj5.class, 64, "gokuSsj5");
		createEntity(EntityGokuSsjg.class, 64, "gokuSsjg");
		createEntity(EntityGokuSsjb.class, 64, "gokuSsjb");
		createEntity(EntityGokuSsjbk.class, 64, "gokuSsjbk");
		createEntity(EntityGokuSuper.class, 64, "gokuSuper");
		createEntity(EntityGokuSuperSsj.class, 64, "gokuSuperSsj");
		createEntity(EntityGokuSuperSsjb.class, 64, "gokuSuperSsjb");
		createEntity(EntityGokuUI.class, 64, "gokuUi");
		createEntity(EntityGokuUIM.class, 64, "gokuUiM");
		createEntity(EntityGokuYardrat.class, 64, "gokuYardrat");
		createEntity(EntityGokuYardratSsj.class, 64, "gokuYardratSsj");
		createEntity(EntityGoten.class, 64, "goten");
		createEntity(EntityGotenSsj.class, 64, "gotenSsj");
		createEntity(EntityGotenks.class, 64, "gotenks");
		createEntity(EntityGotenksSsj.class, 64, "gotenksSsj");
		createEntity(EntityGotenksSsj3.class, 64, "gotenksSsj3");
		createEntity(EntityKrillin1.class, 64, "krillin1");
		createEntity(EntityKrillin2.class, 64, "krillin2");
		createEntity(EntityKrillinKid1.class, 64, "krillinKid1");
		createEntity(EntityKrillinKid2.class, 64, "krillinKid2");
		createEntity(Entityglnl.class, 64, "glnl");
		createEntity(EntityKanba.class, 64, "kanba");
		createEntity(EntityKanbassj.class, 64, "kanbassj");
		createEntity(EntityKanbaSsj2.class, 64, "kanbassj2");
		createEntity(EntityKanbaSsj3.class, 64, "kanbassj3");
		createEntity(EntityKanbaSsjoozaru.class, 64, "kanbassjoozaru");
		createEntity(EntityTien.class, 64, "tien");
		createEntity(EntityChiaotzu1.class, 64, "chiaotzu1");
		createEntity(EntityChiaotzu2.class, 64, "chiaotzu2");
		createEntity(EntityYamcha1.class, 64, "yamcha1");
		createEntity(EntityYamcha2.class, 64, "yamcha2");
		createEntity(EntityYamcha3.class, 64, "yamcha3");
		createEntity(EntityPiccolo.class, 64, "piccolo");
		createEntity(EntityPiccoloInjury.class, 64, "PiccoloInjury");
		createEntity(EntityOozaru.class, 64, "oozaru");
		createEntity(EntityRoshi.class, 64, "roshi");
		createEntity(EntityRoshiBuff.class, 64, "roshiBuff");
		createEntity(EntityTrunksArmor.class, 64, "trunksArmor");
		createEntity(EntityTrunksArmorSsj.class, 64, "trunksArmorSsj");
		createEntity(EntityTrunksArmorSsjG2.class, 64, "trunksArmorSsjG2");
		createEntity(EntityTrunksArmorSsjG3.class, 64, "trunksArmorSsjG3");
		createEntity(EntityTrunksFutur.class, 64, "trunksFutur");
		createEntity(EntityTrunksFuturSsj.class, 64, "trunksFuturSsj");
		createEntity(EntityTrunksFuturSuper.class, 64, "trunksFuturSuper");
		createEntity(EntityTrunksFuturSuperSsj.class, 64, "trunksFuturSuperSsj");
		createEntity(EntityTrunksFuturSuperSsj2.class, 64, "trunksFuturSuperSsj2");
		createEntity(EntityTrunksFuturSuperSsjG3.class, 64, "trunksFuturSuperSsjG3");
		createEntity(EntityTrunksFuturSuperSsjRage.class, 64, "trunksFuturSuperSsjRage");
		createEntity(EntityTrunksKid.class, 64, "trunksKid");
		createEntity(EntityTrunksKidSsj.class, 64, "trunksKidSsj");
		createEntity(EntityVegeto.class, 64, "vegeto");
		createEntity(EntityVegetoSsj2.class, 64, "vegetoSsj2");
		createEntity(EntityVegetoSsj3.class, 64, "vegetoSsj3");
		createEntity(EntityVegetoSsj.class, 64, "vegetoSsj");
		createEntity(EntityVegetoSsjb.class, 64, "vegetoSsjb");
		createEntity(EntityVegetoUi.class, 64, "vegetoUi");
		createEntity(EntityVegetoUw.class, 64, "vegetoUw");
		createEntity(EntityGogeta.class, 64, "gogeta");
		createEntity(EntityGogetaSsj.class, 64, "gogetaSsj");
		createEntity(EntityGogetaSsj2.class, 64, "gogetaSsj2");
		createEntity(EntityGogetaSsj3.class, 64, "gogetaSsj3");
		createEntity(EntityGogetaSsjb.class, 64, "gogetaSsjb");
		createEntity(EntityGogetaUi.class, 64, "gogetaUi");
		createEntity(EntityGogetaUw.class, 64, "gogetaUw");
		createEntity(EntityVegeta0.class, 64, "vegeta0");
		createEntity(EntityVegeta0Damaged.class, 64, "vegeta0Damaged");
		createEntity(EntityVegeta1.class, 64, "vegeta");
		createEntity(EntityVegeta3.class, 64, "vegeta3");
		createEntity(EntityVegetaSsj.class, 64, "vegetaSsj");
		createEntity(EntityVegetaSsjG2.class, 64, "vegetaSsjG2");
		createEntity(EntityVegeta2.class, 64, "vegeta2");
		createEntity(EntityVegeta2Ssj.class, 64, "vegeta2Ssj");
		createEntity(EntityVegeta2Ssj2.class, 64, "vegeta2Ssj2");
		createEntity(EntityVegetaSsjg.class, 64, "vegetaSsjg");
		createEntity(EntityVegetaSsjb.class, 64, "vegetaSsjb");
		createEntity(EntityVegetaSsjbe.class, 64, "vegetaSsjbe");
		createEntity(EntityVegetaMajin.class, 64, "vegetaMajin");
		createEntity(EntityVegetaOozaru.class, 64, "vegetaOozaru");
		createEntity(EntityVegetaCopy.class, 64, "vegetaCopy");
		createEntity(EntityVegetaCopyBlue.class, 64, "vegetaBlueCopy");
		createEntity(EntityVegetaSuper.class, 64, "vegetaSuper");
		createEntity(EntityVegetaSuperSsj.class, 64, "vegetaSuperSsj");
		createEntity(EntityVegetaSuperSsjb.class, 64, "vegetaSuperSsjb");
		createEntity(EntityCyborgTaopaipai.class, 64, "cyborgTaopaipai");
		createEntity(EntityTaopaipai.class, 64, "taopaipai");
		createEntity(EntityCymbal.class, 64, "cymbal");
		createEntity(EntityTambourine.class, 64, "tambourine");
		createEntity(EntityDrum.class, 64, "drum");
		createEntity(EntityPiccoloDaimaoOld.class, 64, "piccoloDaimaoOld");
		createEntity(EntityPiccoloDaimaoYoung.class, 64, "piccoloDaimaoYoung");
		createEntity(EntityPiccoloDaimaoYoung2.class, 64, "piccoloDaimaoYoung2");
		createEntity(EntityHit.class, 64, "hit");
		createEntity(EntityFrost1.class, 64, "frost1");
		createEntity(EntityFrost3.class, 64, "frost3");
		createEntity(EntityFrost4.class, 64, "frost4");
		createEntity(EntityFreeza5Damaged.class, 64, "freeza5Damaged");
		createEntity(EntityFreeza6Damaged.class, 64, "freeza6Damaged");
		createEntity(EntityDodoria.class, 64, "dodoria");
		createEntity(EntityCabbaNinjin.class, 64, "cabba");
		createEntity(EntityCabbaSsj.class, 64, "cabbaSsj");
		createEntity(EntityCauliflaNinjin.class, 64, "caulifla");
		createEntity(EntityCauliflaSsj.class, 64, "cauliflaSsj");
		createEntity(EntityCauliflaSsj2.class, 64, "cauliflaSsj2");
		createEntity(EntityKaleNinjin.class, 64, "kale");
		createEntity(EntityKaleSsj.class, 64, "kaleSsj");
		createEntity(EntityKaleSsjL.class, 64, "kaleSsjL");
		createEntity(EntityKaleSsj2.class, 64, "kaleSsj2");
		createEntity(EntityMonaka.class, 64, "monaka");
		createEntity(EntityGokuBlack.class, 64, "gokuBlack");
		createEntity(EntityGokuBlackSsj.class, 64, "gokuBlackSsj");
		createEntity(EntityGokuBlackR.class, 64, "gokuBlackR");
		createEntity(EntityZamasu.class, 64, "zamasu");
		createEntity(EntityZamasuMerged.class, 64, "zamasuMerged");
		createEntity(EntityJirenNinjin.class, 64, "jiren");
		createEntity(EntityJirenSuperFullPower.class, 64, "jirenSuperFullPower");
		createEntity(EntityToppoNinjin.class, 64, "toppo");
		createEntity(EntityToppoNinjinFullPower.class, 64, "toppoGOD");
		createEntity(EntityDyspoNinjin.class, 64, "dyspo");
		createEntity(EntityKahseralNinjin.class, 64, "kahseral");
		createEntity(EntityCocotteNinjin.class, 64, "cocotte");
		createEntity(EntityVewon.class, 64, "vewon");
		createEntity(EntityTupper.class, 64, "tupper");
		createEntity(EntityZoire.class, 64, "zoire");
		createEntity(EntityKettle.class, 64, "kettle");
		createEntity(EntityKnsi.class, 64, "knsi");
		createEntity(EntityKeflaNinjin.class, 64, "kefla");
		createEntity(EntityKeflaSsj.class, 64, "keflaSsj");
		createEntity(EntityBergamoNinjin.class, 64, "bergamo");
		createEntity(EntityLavenderNinjin.class, 64, "lavender");
		createEntity(EntityPilina.class, 64, "pilina");
		createEntity(EntitySaonel.class, 64, "saonel");
		createEntity(EntityBrolySuper.class, 64, "brolySuper");
		createEntity(EntityBrolySuperWrath.class, 64, "brolySuperWrath");
		createEntity(EntityBrolySuperSsj.class, 64, "brolySuperSsj");
		createEntity(EntityBrolySuperSsjL.class, 64, "brolySuperSsjL");
		createEntity(EntityZarbon1.class, 64, "zarbon1");
		createEntity(EntityZarbon2.class, 64, "zarbon2");
		createEntity(EntityNail.class, 64, "nail");
		createEntity(EntityGinyuGoku.class, 64, "ginyuGoku");
		createEntity(EntitySpopovich.class, 64, "spopovich");
		createEntity(EntityYamu.class, 64, "yamu");
		createEntity(EntityMajinSoldier1.class, 64, "majinSoldier1");
		createEntity(EntityMajinSoldier2.class, 64, "majinSoldier2");
		createEntity(EntityGinyuGoku.class, 64, "ginyuGoku");
		createEntity(EntityWhis.class, 64, "whis");
		createEntity(EntityRaditz.class, 64, "raditz");
		createEntity(EntityNappa.class, 64, "nappa");
		createEntity(EntityNappaDamaged.class, 64, "nappaDamaged");
		createEntity(EntityBioWarrior1.class, 64, "bioWarrior1");
		createEntity(EntityBioWarrior2.class, 64, "bioWarrior2");
		createEntity(EntityBioWarrior3.class, 64, "bioWarrior3");
		createEntity(EntityBioWarrior4.class, 64, "bioWarrior4");
		createEntity(EntityBioWarrior5.class, 64, "bioWarrior5");
		createEntity(EntityBioWarrior6.class, 64, "bioWarrior6");
		createEntity(EntityBrolyZBio.class, 64, "brolyZBio");
		createEntity(EntityBido.class, 64, "bido");
		createEntity(EntityBojack.class, 64, "bojack");
		createEntity(EntityBojackSuper.class, 64, "bojackSuper");
		createEntity(EntityBujin.class, 64, "bujin");
		createEntity(EntityKogu.class, 64, "kogu");
		createEntity(EntityKoguSuper.class, 64, "koguSuper");
		createEntity(EntityZangya.class, 64, "zangya");
		createEntity(EntityAngol.class, 64, "angol");
		createEntity(EntityBrolyZBase.class, 64, "brolyZBase");
		createEntity(EntityBrolyZLSsj.class, 64, "brolyZLSsj");
		createEntity(EntityBrolyZLSsj3.class, 64, "brolyZLSsj3");
		createEntity(EntityBrolyZSsj.class, 64, "brolyZSsj");
		createEntity(EntityBrolyZ2Ssj.class, 64, "brolyZ2Ssj");
		createEntity(EntityMoah.class, 64, "moah");
		createEntity(EntityParagus.class, 64, "paragus");
		createEntity(EntityParagusSoldier.class, 64, "paragusSoldier");
		createEntity(EntityCooler.class, 64, "cooler");
		createEntity(EntityCoolerFifthForm.class, 64, "coolerFifthForm");
		createEntity(EntityDore.class, 64, "dore");
		createEntity(EntityNeiz.class, 64, "neiz");
		createEntity(EntitySalza.class, 64, "salza");
		createEntity(EntityGarlicJr.class, 64, "garlicJr");
		createEntity(EntityGarlicJrSuper.class, 64, "garlicJrSuper");
		createEntity(EntityGinger.class, 64, "ginger");
		createEntity(EntityNicky.class, 64, "nicky");
		createEntity(EntitySansho.class, 64, "sansho");
		createEntity(EntityJanemba.class, 64, "janemba");
		createEntity(EntityJanembaSuper.class, 64, "janembaSuper");
		createEntity(EntityAngila.class, 64, "angila");
		createEntity(EntitySlugOld.class, 64, "slugOld");
		createEntity(EntitySlugYoung.class, 64, "slugYoung");
		createEntity(EntitySlugGiant.class, 64, "slugGiant");
		createEntity(EntityMedamatcha.class, 64, "medamatcha");
		createEntity(EntityMedamatchaClone.class, 64, "medamatchaClone");
		createEntity(EntitySlugSoldier.class, 64, "slugSoldier");
		createEntity(EntityWings.class, 64, "wings");
		createEntity(EntityZeeun.class, 64, "zeeun");
		createEntity(EntityAndroid13.class, 64, "android13");
		createEntity(EntityAndroid13Super.class, 64, "android13Super");
		createEntity(EntityAndroid14.class, 64, "android14");
		createEntity(EntityAndroid15.class, 64, "android15");
		createEntity(EntityArbee.class, 64, "arbee");
		createEntity(EntityBudo.class, 64, "budo");
		createEntity(EntityGure.class, 64, "gure");
		createEntity(EntityJiku.class, 64, "jiku");
		createEntity(EntityKawazu.class, 64, "kawazu");
		createEntity(EntityKinkarn.class, 64, "kinkarn");
		createEntity(EntityPonkarn.class, 64, "ponkarn");
		createEntity(EntitySkud.class, 64, "skud");
		createEntity(EntityHatchiyack.class, 64, "hatchiyack");
		createEntity(EntityHatchiyackSuper.class, 64, "hatchiyackSuper");
		createEntity(EntityHatchiyackGiant.class, 64, "hatchiyackGiant");
		createEntity(EntityCyclopianGuard.class, 64, "cyclopianGuard");
		createEntity(EntityCoolerMetal.class, 64, "coolerMetal");
		createEntity(EntityCoolerMetalTrueForm.class, 64, "coolerMetalTrueForm");
		createEntity(EntityAmond.class, 64, "amond");
		createEntity(EntityCacao.class, 64, "cacao");
		createEntity(EntityDaiz.class, 64, "daiz");
		createEntity(EntityRasin.class, 64, "rasin");
		createEntity(EntityLakasei.class, 64, "lakasei");
		createEntity(EntityTurles1.class, 64, "turles1");
		createEntity(EntityTurles2.class, 64, "turles2");
		createEntity(EntityTurles3.class, 64, "turles3");
		createEntity(EntityBiomen.class, 64, "biomen");
		createEntity(EntityDrWheelo.class, 64, "drWheelo");
		createEntity(EntityEbifurya.class, 64, "ebifurya");
		createEntity(EntityKishime.class, 64, "kishime");
		createEntity(EntityMisokatsun.class, 64, "misokatsun");
		createEntity(EntityHoi.class, 64, "hoi");
		createEntity(EntityHirudegarnPre.class, 64, "hirudegarnPre");
		createEntity(EntityHirudegarnBottom.class, 64, "hirudegarnBottom");
		createEntity(EntityHirudegarnUpper.class, 64, "hirudegarnUpper");
		createEntity(EntityHirudegarnPost.class, 64, "hirudegarnPost");
		createEntity(EntityAbo.class, 64, "abo");
		createEntity(EntityKado.class, 64, "kado");
		createEntity(EntityAka.class, 64, "aka");
		createEntity(EntityCell4Ninjin.class, 64, "cell4");
		createEntity(EntityRecoomeDamaged.class, 64, "recoomeDamaged");
		createEntity(EntityGoldcellNinjin.class, 64, "hjcell");
		createEntity(EntityChilled.class, 64, "qed");
		createEntity(EntityBdkNinjin.class, 64, "bdk");
		createEntity(EntityBdkssjNinjin.class, 64, "bdkssj");
		createEntity(EntityBdkssj3Ninjin.class, 64, "bdkssj3");
		createEntity(EntityBdkssjbNinjin.class, 64, "bdkssjb");
		createEntity(EntityBdkssjb3Ninjin.class, 64, "bdkssjb3");
		createEntity(EntityBlackFrieza.class, 64, "hsfls");
		createEntity(EntityBb.class, 64, "beibi");
		createEntity(EntityBb2.class, 64, "beibi2");
		createEntity(EntityBbssj.class, 64, "beibissj");
		createEntity(EntityBbssj2.class, 64, "beibissj2");
		createEntity(EntityJs.class, 64, "jiasi");
		createEntity(EntityZsfls.class, 64, "zsfls");
		createEntity(EntityZsCoolerFifthForm.class, 64, "zsgl");
		createEntity(EntityGoldCoolerFifthForm.class, 64, "hjgl");
		createEntity(EntityBzGokuSsj.class, 64, "Bzgokussj");
		createEntity(EntityFu.class, 64, "fu");
		createEntity(EntityVegetaZw.class, 64, "Vegetazw");
		createEntity(EntityVegetaSsj4.class, 64, "VegetaSsj4");
		createEntity(EntityDragon.class, 64, "GTDragon");
		createEntity(Entityomega.class, 64, "omega");
		createEntity(Entityomega2.class, 64, "omega2");
		createEntity(EntityMara.class, 64, "mara");
		createEntity(EntityMara_Young.class, 64, "mara2");
		createEntity(EntityMara_Fusion.class, 64, "mara3");
		createEntity(EntityCellmax.class, 64, "cellmax");
		createEntity(EntityGamma1.class, 64, "Gamma1");
		createEntity(EntityGamma2.class, 64, "Gamma2");
		createEntity(EntitySuper17.class, 64, "super17");
		createEntity(EntityPiccolo2.class, 64, "Piccolo2");
		createEntity(EntityPiccolo3.class, 64, "Piccolo3");
		createEntity(EntityPiccolo4.class, 64, "Piccolo4");
		createEntity(EntityPiccolo5.class, 64, "Piccolo5");
		createEntity(EntityEldKaioshin.class, 64, "eldKaioshin");
		createEntity(EntityKibito.class, 64, "Kibito");
        createEntity(EntityBlockGoku.class,64,"BlockGoku");
        createEntity(EntityBlockGokuSsjR.class,64,"BlockGokuSsjR");
        createEntity(EntityBlockGokuSsjR3.class,64,"BlockGokuSsjR3");
        createEntity(EntityTamagami_1.class,64,"Tamagami1");
        createEntity(EntityTamagami_2.class,64,"Tamagami2");
        createEntity(EntityTamagami_3.class,64,"Tamagami3");
        createEntity(EntityKaioshin.class, 64, "Kaioshin");
        createEntity(EntityKaioshinChild.class, 64, "KaioshinChild");
        createEntity(EntityBlockGohanUltimate.class, 64, "BlockGohan");
        createEntity(EntityDAIMAGokuSsj4.class, 64, "DAIMAGokuSsj4");
        createEntity(EntityDAIMAGoku.class, 64, "DAIMAGoku");
        createEntity(EntityDAIMAGokuSsj.class, 64, "DAIMAGokuSsj");
        createEntity(EntityDAIMAGokuSsj2.class, 64, "DAIMAGokuSsj2");
        createEntity(EntityDAIMAGokuSsj3.class, 64, "DAIMAGokuSsj3");
        createEntity(EntityDAIMAPorunga.class, 64, "DAIMAPorunga");
        createEntity(EntityPorungaNinjin.class, 64, "PorungaNinjin");

	}

	// simpleEntity
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void createEntity(Class entityClass, int trackingRange, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, entityId, ModVars.MOD_ID, trackingRange, 1, true);
		entityId++;
	}
}
