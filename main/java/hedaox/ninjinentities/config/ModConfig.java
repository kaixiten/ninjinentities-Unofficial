package hedaox.ninjinentities.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import java.io.File;

public class ModConfig {

    // EntityMara 配置项
    public static int kiDrainInterval; // 时间间隔（ticks）
    public static double kiDrainRange; // 范围（格）
    public static String kiDrainAmount; // 扣除的 Ki 值（支持百分比或数值）

    // EntityMara_Young 配置项
    public static int kiDrainIntervalYoung; // 时间间隔（ticks）
    public static double kiDrainRangeYoung; // 范围（格）
    public static String kiDrainAmountYoung; // 扣除的 Ki 值（支持百分比或数值）

    // EntityMara_Fusion 配置项
    public static int kiDrainIntervalFusion; // 时间间隔（ticks）
    public static double kiDrainRangeFusion; // 范围（格）
    public static String kiDrainAmountFusion; // 扣除的 Ki 值（支持百分比或数值）

    // Ki 转换比例配置项
    public static double kiToHealthRatio; // Ki 转换为血量的比例（支持百分比或数值）
    public static String kiToMaxHealthRatio; // Ki 转换为血量上限的比例（支持百分比或数值）
    public static String kiToAttackRatio; // Ki 转换为攻击力的比例（支持百分比或数值）

    public static double kiToHealthRatioYoung; // Ki 转换为血量的比例（支持百分比或数值）
    public static String kiToMaxHealthRatioYoung; // Ki 转换为血量上限的比例（支持百分比或数值）
    public static String kiToAttackRatioYoung; // Ki 转换为攻击力的比例（支持百分比或数值）

    public static double kiToHealthRatioFusion; // Ki 转换为血量的比例（支持百分比或数值）
    public static String kiToMaxHealthRatioFusion; // Ki 转换为血量上限的比例（支持百分比或数值）
    public static String kiToAttackRatioFusion; // Ki 转换为攻击力的比例（支持百分比或数值）

    // Ki 转换上限配置项
    public static double maxHealthEnhancementLimit; // 血量上限增强的上限（百分比）
    public static double attackEnhancementLimit; // 攻击力增强的上限（百分比）

    //GokuUi
    public static double gokuUIDodgeRate;         // 闪避率
    public static double gokuUICounterChance;     // 闪避反击概率

    //GokuUiM
    public static double gokuUIMDodgeRate;         // 闪避率
    public static double gokuUIMCounterChance;     // 闪避反击概率

    //GogetaUI
    public static double GogetaUIDodgeRate;         // 闪避率
    public static double GogetaUICounterChance;     // 闪避反击概率

    //VegetoUI
    public static double VegetoUIDodgeRate;         // 闪避率
    public static double VegetoUICounterChance;     // 闪避反击概率

    //Whis
    public static double WhisDodgeRate;         // 闪避率
    public static double WhisCounterChance;     // 闪避反击概率

    //super17
    public static double attackBoostEnergyFactor;     // 能量伤害 → 提升量换算系数
    public static double attackBoostPercentPerHit;    // 每次最大提升量（相对于初始攻击力的百分比）
    public static double attackMaxPercent;            // 攻击力提升最大倍数（相对于初始攻击力）

    public static boolean useNewFlightAI; // 飞行


    // 初始化配置
    public static void loadConfig(File configFile) {
        Configuration config = new Configuration(configFile);
        try {
            config.load();
            initConfig(config);
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
        } finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }
    // 解析百分比值，并限制最大值为 100%
    private static double parsePercentage(String value, double defaultValue) {
        if (value.endsWith("%")) {
            try {
                double percentage = Double.parseDouble(value.substring(0, value.length() - 1));
                return Math.min(percentage, 100.0); // 限制最大值为 100%
            } catch (NumberFormatException e) {
                // 如果解析失败，使用默认值
                return defaultValue;
            }
        } else {
            // 如果不是百分比格式，使用默认值
            return defaultValue;
        }
    }
    // 初始化配置
    private static void initConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(
            "ninjinentities-unofficial",
            "# Ninjin Entities configuration\n"
        );

        // 加载 EntityMara 配置项
        Property kiDrainProp = cfg.get(
            "ninjinentities-unofficial",
            "Ki Drain settings (Interval, Range, Amount) value from 0 to 1000 (defaults: 20, 10, 1%).",
            new String[]{"20", "10", "1%"},
            "Eldmoro-kidrain.\n" +
                "kiDrainAmount can be a fixed value (e.g., 1) or a percentage (e.g., 1%)."
        );
        kiDrainProp.setValidationPattern(java.util.regex.Pattern.compile(".+%?")); // 允许百分比或数值

        // 解析 EntityMara 配置项
        String[] kiDrainValues = kiDrainProp.getStringList();
        kiDrainInterval = Integer.parseInt(kiDrainValues[0]);
        kiDrainRange = Double.parseDouble(kiDrainValues[1]);
        kiDrainAmount = kiDrainValues[2];

        // 加载 EntityMara_Young 配置项
        Property kiDrainPropYoung = cfg.get(
            "ninjinentities-unofficial",
            "Ki Drain settings (Interval, Range, Amount) value from 0 to 1000 (defaults: 18, 12, 1.5%).",
            new String[]{"18", "12", "1.5%"},
            "moro-kidrain.\n" +
                "kiDrainAmount can be a fixed value (e.g., 1) or a percentage (e.g., 1%)."
        );
        kiDrainPropYoung.setValidationPattern(java.util.regex.Pattern.compile(".+%?")); // 允许百分比或数值

        // 解析 EntityMara_Young 配置项
        String[] kiDrainValuesYoung = kiDrainPropYoung.getStringList();
        kiDrainIntervalYoung = Integer.parseInt(kiDrainValuesYoung[0]);
        kiDrainRangeYoung = Double.parseDouble(kiDrainValuesYoung[1]);
        kiDrainAmountYoung = kiDrainValuesYoung[2];

        // 加载 EntityMara_Fusion 配置项
        Property kiDrainPropFusion = cfg.get(
            "ninjinentities-unofficial",
            "Ki Drain settings (Interval, Range, Amount) value from 0 to 1000 (defaults: 15, 16, 2.0%).",
            new String[]{"15", "16", "2.0%"},
            "moroFusion-kidrain.\n" +
                "kiDrainAmount can be a fixed value (e.g., 1) or a percentage (e.g., 1%)."
        );
        kiDrainPropFusion.setValidationPattern(java.util.regex.Pattern.compile(".+%?")); // 允许百分比或数值

        // 解析 EntityMara_Fusion 配置项
        String[] kiDrainValuesFusion = kiDrainPropFusion.getStringList();
        kiDrainIntervalFusion = Integer.parseInt(kiDrainValuesFusion[0]);
        kiDrainRangeFusion = Double.parseDouble(kiDrainValuesFusion[1]);
        kiDrainAmountFusion = kiDrainValuesFusion[2];

        // 加载 Eldmoro Ki 转换比例配置项
        Property kiRatioProp = cfg.get(
            "ninjinentities-unofficial",
            "Ki Conversion settings (Regeneration, MaxHealth, Attack) value from 0 to 1000 (defaults: 1%, 1, 1).",
            new String[]{"1%", "1", "1"},
            "Eldmoro-Ki Conversion settings.\n" +
                "Regeneration must be a percentage (e.g., 10%). MaxHealth and Attack can be a fixed value (e.g., 0.1) or a percentage (e.g., 10%)."
        );

        // 解析 Eldmoro Ki 转换比例配置项
        String[] kiRatioValues = kiRatioProp.getStringList();

        // 解析 kiToHealthRatio（仅支持百分比，最大 100%）
        kiToHealthRatio = parsePercentage(kiRatioValues[0], 0.1); // 默认值为 0.1%

        // 解析 kiToMaxHealthRatio 和 kiToAttackRatio（支持百分比或数值）
        kiToMaxHealthRatio = kiRatioValues[1];
        kiToAttackRatio = kiRatioValues[2];

        // 加载 moroYoung Ki 转换比例配置项
        Property kiRatioPropYoung = cfg.get(
            "ninjinentities-unofficial",
            "Ki Conversion settings (Regeneration, MaxHealth, Attack) value from 0 to 1000 (defaults: 1%, 1.1, 1.1).",
            new String[]{"1%", "1.1", "1.1"},
            "Youngmoro-Ki Conversion settings.\n" +
                "Regeneration must be a percentage (e.g., 10%). MaxHealth and Attack can be a fixed value (e.g., 0.1) or a percentage (e.g., 10%)."
        );
        kiRatioPropYoung.setValidationPattern(java.util.regex.Pattern.compile(".+%?")); // 允许百分比或数值

        // 解析 moroYoung Ki 转换比例配置项
        String[] kiRatioValuesYoung = kiRatioProp.getStringList();

        // 解析 kiToHealthRatioYoung（仅支持百分比，最大 100%）
        kiToHealthRatioYoung = parsePercentage(kiRatioValuesYoung[0], 0.1); // 默认值为 0.1%

        // 解析 kiToMaxHealthRatioYoung 和 kiToAttackRatioYoung（支持百分比或数值）
        kiToMaxHealthRatioYoung = kiRatioValuesYoung[1];
        kiToAttackRatioYoung = kiRatioValuesYoung[2];

        // 加载 moroFusion Ki 转换比例配置项
        Property kiRatioPropFusion = cfg.get(
            "ninjinentities-unofficial",
            "Ki Conversion settings (Regeneration, MaxHealth, Attack) value from 0 to 1000 (defaults: 1%, 1.15, 1.15).",
            new String[]{"1%", "1.15", "1.15"},
            "moroFusion-Ki Conversion settings.\n" +
                "Regeneration must be a percentage (e.g., 10%). MaxHealth and Attack can be a fixed value (e.g., 0.1) or a percentage (e.g., 10%)."
        );
        // 解析 moroFusion Ki 转换比例配置项
        String[] kiRatioValuesFusion = kiRatioProp.getStringList();

        // 解析 kiToHealthRatioFusion（仅支持百分比，最大 100%）
        kiToHealthRatioFusion = parsePercentage(kiRatioValuesFusion[0], 0.1); // 默认值为 0.1%

        // 解析 kiToMaxHealthRatioFusion 和 kiToAttackRatioFusion（支持百分比或数值）
        kiToMaxHealthRatioFusion = kiRatioValuesFusion[1];
        kiToAttackRatioFusion = kiRatioValuesFusion[2];

        // 加载 Ki 转换上限配置项
        maxHealthEnhancementLimit = cfg.getFloat(
            "maxHealthEnhancementLimit",
            "ninjinentities-unofficial",
            50.0f,
            0.0f,
            1000.0f,
            "Maximum percentage by which max health can be enhanced (default: 50%)."
        );

        attackEnhancementLimit = cfg.getFloat(
            "attackEnhancementLimit",
            "ninjinentities-unofficial",
            50.0f,
            0.0f,
            1000.0f,
            "Maximum percentage by which attack damage can be enhanced (default: 50%)."
        );
        // GokuUI配置
        Property gokuUICombatProp = cfg.get(
            "ninjinentities-unofficial",
            "gokuUI Combat (DodgeRate CounterChance QuadCounter DecaCounter)",
            new String[]{"50%", "30%"},
            "GokuUI combat settings in percentage (dodge, counter)"
        );
        String[] gokuUIValues = gokuUICombatProp.getStringList();

        gokuUIDodgeRate = parsePercentage(gokuUIValues.length > 0 ? gokuUIValues[0] : "38%", 50.0);
        gokuUICounterChance = parsePercentage(gokuUIValues.length > 1 ? gokuUIValues[1] : "10%", 30.0);

        // GokuUIM配置
        Property gokuUIMCombatProp = cfg.get(
            "ninjinentities-unofficial",
            "gokuUIM Combat (DodgeRate CounterChance QuadCounter DecaCounter)",
            new String[]{"50%", "30%"},
            "GokuUIM combat settings in percentage (dodge, counter)"
        );
        String[] gokuUIMValues = gokuUIMCombatProp.getStringList();

        gokuUIMDodgeRate = parsePercentage(gokuUIMValues.length > 0 ? gokuUIMValues[0] : "50%", 50.0);
        gokuUIMCounterChance = parsePercentage(gokuUIMValues.length > 1 ? gokuUIMValues[1] : "30%", 30.0);

        // GogetaUI配置
        Property GogetaUICombatProp = cfg.get(
            "ninjinentities-unofficial",
            "GogetaUI Combat (DodgeRate CounterChance QuadCounter DecaCounter)",
            new String[]{"50%", "30%"},
            "GogetaUI combat settings in percentage (dodge, counter)"
        );
        String[] GogetaUIValues = GogetaUICombatProp.getStringList();

        GogetaUIDodgeRate = parsePercentage(GogetaUIValues.length > 0 ? GogetaUIValues[0] : "50%", 50.0);
        GogetaUICounterChance = parsePercentage(GogetaUIValues.length > 1 ? GogetaUIValues[1] : "30%", 30.0);

        // VegetoUI配置
        Property VegetoUICombatProp = cfg.get(
            "ninjinentities-unofficial",
            "VegetoUI Combat (DodgeRate CounterChance QuadCounter DecaCounter)",
            new String[]{"50%", "30%"},
            "VegetoUI combat settings in percentage (dodge, counter)"
        );
        String[] VegetoUIValues = VegetoUICombatProp.getStringList();

        VegetoUIDodgeRate = parsePercentage(VegetoUIValues.length > 0 ? VegetoUIValues[0] : "50%", 50.0);
        VegetoUICounterChance = parsePercentage(VegetoUIValues.length > 1 ? VegetoUIValues[1] : "30%", 30.0);

        // Whis配置
        Property WhisCombatProp = cfg.get(
            "ninjinentities-unofficial",
            "Whis Combat (DodgeRate CounterChance QuadCounter DecaCounter)",
            new String[]{"70%", "50%"},
            "Whis combat settings in percentage (dodge, counter)"
        );
        String[] WhisValues = WhisCombatProp.getStringList();

        WhisDodgeRate = parsePercentage(WhisValues.length > 0 ? WhisValues[0] : "70%", 70.0);
        WhisCounterChance = parsePercentage(WhisValues.length > 1 ? WhisValues[1] : "50%", 50.0);

        //super17配置
        Property attackEnhanceProp = cfg.get(
            "ninjinentities-unofficial",
            "Super Android 17 ki attack absorption settings (EnergyFactor, BoostPercentPerHit, MaxPercent)",
            new String[]{"0.1", "5%", "300%"},
            "Attack enhancement settings.\n" +
                "EnergyFactor = how much attack increases per energy damage (e.g., 0.1).\n" +
                "BoostPercentPerHit = max boost per hit, relative to initial attack (e.g., 5%).\n" +
                "MaxPercent = maximum attack relative to initial (e.g., 300%)."
        );
        String[] attackEnhanceValues = attackEnhanceProp.getStringList();

        // 解析
        try {
            attackBoostEnergyFactor = Double.parseDouble(attackEnhanceValues[0]); // 默认 0.1
        } catch (Exception e) {
            attackBoostEnergyFactor = 0.1;
        }

        // 每次提升百分比
        attackBoostPercentPerHit = parsePercentage(
            attackEnhanceValues.length > 1 ? attackEnhanceValues[1] : "5%",
            5.0
        ) / 100.0; // 转成 0.05

        // 最大百分比
        attackMaxPercent = parsePercentage(
            attackEnhanceValues.length > 2 ? attackEnhanceValues[2] : "300%",
            300.0
        ) / 100.0; // 转成 3.0

        //飞行配置
        Property flightAIProp = cfg.get(
            "ninjinentities-unofficial",
            "Flight AI settings (use New Flight AI)",
            true,
            "Switch between new flight AI and old flight AI.\n" +
                "true = use new smooth 3D flight AI\n" +
                "false = use old height-based flight AI"
        );
        useNewFlightAI = flightAIProp.getBoolean(true);
    }
}
