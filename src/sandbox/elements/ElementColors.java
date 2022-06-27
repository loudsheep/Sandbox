package sandbox.elements;

import util.Color;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ElementColors {
    public static final Map<ElementType, Color[]> colors;

    static {
        colors = new HashMap<>();

        // TODO organize this
        Color[] sandColors = new Color[]{
                new Color(255, 255, 0, 255),
                new Color(178, 201, 6, 255),
                new Color(233, 252, 90, 255),
        };
        colors.put(ElementType.SAND, sandColors);

        Color[] stoneColors = new Color[]{
                new Color(153, 153, 153, 255),
                new Color(128, 126, 126, 255)
        };
        colors.put(ElementType.STONE, stoneColors);

        Color[] coalColors = new Color[]{
                new Color(34, 34, 34, 255),
                new Color(55, 55, 55, 255),
                new Color(62, 62, 62, 255),
        };
        colors.put(ElementType.COAL, coalColors);

        Color[] waterColors = new Color[]{
                new Color(28, 86, 234, 255 * .8f)
        };
        colors.put(ElementType.WATER, waterColors);

        Color[] woodColors = new Color[]{
                new Color(165, 98, 36, 255),
                new Color(61, 33, 7, 255),
                new Color(140, 74, 12, 255),
        };
        colors.put(ElementType.WOOD, woodColors);

        Color[] acidColors = new Color[]{
                new Color(0, 255, 0, 255),
        };
        colors.put(ElementType.ACID, acidColors);

        Color[] moltenMetalColors = new Color[]{
                new Color(255,155,53, 255),
                new Color(249,243,124,255),
                new Color(249,243,124,255),
                new Color(249,243,124,255),
        };
        colors.put(ElementType.MOLTENMETAL, moltenMetalColors);

        Color[] oilColors = new Color[]{
                new Color(0,0,0,255),
        };
        colors.put(ElementType.OIL, oilColors);
    }

    public static Color getColorForElement(ElementType elementType) {
        Color[] colorList = colors.get(elementType);
        if (colorList == null) {
            return null;
        }
        if (colorList.length == 0) {
            return null;
        }

        Random r = new Random();
        return colorList[r.nextInt(colorList.length)];
    }

    public static Color getColorForElement(Element element) {
        return getColorForElement(element.getType());
    }
}
