package colors;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RGB {

    private short red;
    private short green;
    private short blue;

    public RGB(short red, short green, short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public  String getColorName() {
        Map<String, Color> colorMap = new HashMap<>();
        colorMap.put("Red", new Color(0xFF, 0x00, 0x00));
        colorMap.put("Green", new Color(0x00, 0xFF, 0x00));
        colorMap.put("Blue", new Color(0x00, 0x00, 0xFF));
        colorMap.put("Yellow", new Color(0xFF, 0xFF, 0x00));
        colorMap.put("Cyan", new Color(0x00, 0xFF, 0xFF));
        colorMap.put("Magenta", new Color(0xFF, 0x00, 0xFF));
        colorMap.put("Black", new Color(0x00, 0x00, 0x00));
        colorMap.put("White", new Color(0xFF, 0xFF, 0xFF));
        colorMap.put("Gray", new Color(0x80, 0x80, 0x80));
        colorMap.put("Pink", new Color(0xFF, 0xC0, 0xCB));
        colorMap.put("Brown", new Color(0xA5, 0x2A, 0x2A));
        colorMap.put("Orange", new Color(0xFF, 0xA5, 0x00));
        colorMap.put("Purple", new Color(0x80, 0x00, 0x80));
        colorMap.put("Teal", new Color(0x00, 0x80, 0x80));
        colorMap.put("Navy", new Color(0x00, 0x00, 0x80));
        colorMap.put("LightGreen", new Color(0x90, 0xEE, 0x90));
        colorMap.put("LightGray", new Color(0xD3, 0xD3, 0xD3));
        colorMap.put("Lime", new Color(0x00, 0xFF, 0x00));
        colorMap.put("Maroon", new Color(0x80, 0x00, 0x00));
        colorMap.put("Olive", new Color(0x80, 0x80, 0x00));
        colorMap.put("OrangeRed", new Color(0xFF, 0x45, 0x00));
        colorMap.put("Silver", new Color(0xC0, 0xC0, 0xC0));
        colorMap.put("Turquoise", new Color(0x40, 0xE0, 0xD0));
        colorMap.put("Violet", new Color(0xEE, 0x82, 0xEE));
        colorMap.put("Indigo", new Color(0x4B, 0x00, 0x82));
        colorMap.put("Lavender", new Color(0xE6, 0xE6, 0xFA));
        colorMap.put("LightPink", new Color(0xFF, 0xB6, 0xC1));
        colorMap.put("LightYellow", new Color(0xFF, 0xFF, 0xE0));
        colorMap.put("MediumBlue", new Color(0x00, 0x00, 0xCD));
        colorMap.put("MediumSeaGreen", new Color(0x32, 0xCD, 0x32));
        colorMap.put("MediumSlateBlue", new Color(0x7B, 0x68, 0xEE));
        colorMap.put("RosyBrown", new Color(0xBC, 0x8F, 0x8F));
        colorMap.put("SteelBlue", new Color(0x46, 0x82, 0xB4));
        colorMap.put("Tan", new Color(0xD2, 0xB4, 0x8C));

        Color color = new Color(this.red, this.green, this.blue);
        double minDistance = Double.MAX_VALUE;
        String closestColorName = null;

        for (Map.Entry<String, Color> entry : colorMap.entrySet()) {
            double distance = euclideanDistance(color.getRed(), color.getGreen(), color.getBlue(), entry.getValue().getRed(), entry.getValue().getGreen(), entry.getValue().getBlue());
            if (distance < minDistance) {
                minDistance = distance;
                closestColorName = entry.getKey();
            }
        }

        return closestColorName;
    }

    public static double euclideanDistance(int r1, int g1, int b1, int r2, int g2, int b2) {
        double dr = r1 - r2;
        double dg = g1 - g2;
        double db = b1 - b2;
        return Math.sqrt(dr * dr + dg * dg + db * db);
    }

    public short getRed() {
        return red;
    }

    public short getGreen() {
        return green;
    }

    public short getBlue() {
        return blue;
    }
    
}