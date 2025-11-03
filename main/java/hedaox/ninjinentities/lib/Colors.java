package hedaox.ninjinentities.lib;

import java.awt.Color;
import java.util.ArrayList;

public class Colors {
    public static ArrayList<Integer> ColorIDs = new ArrayList<>();

    public Colors() {
    }

    public static int getRGB(int r, int g, int b) {
        return new Color(r, g, b).getRGB();
    }

    static {
        // 使用数组初始化 ColorIDs，避免重复代码
        int[] colorValues = {
            1423062, 1684438, 1946070, 2207702, 2469334, 2730966, 2992598, 3254230,
            3515862, 3777494, 4039127, 4300759, 4562391, 4823767, 5085399, 5347031,
            5608663, 5870295, 6131927, 6393559, 6655192, 6916824, 7178456, 7440088,
            7701720, 7963352, 8224728, 8486360, 8747992, 9009624, 9271257, 9532889,
            9794521, 10056153, 10317785, 10579417, 10841049, 11102681, 11364057,
            11625689, 11887322, 12148954, 12410586, 12672218, 12933850, 13195482,
            13457114, 13718746, 13980378, 14242010, 14569179
        };

        for (int color : colorValues) {
            ColorIDs.add(color);
        }
    }
}
