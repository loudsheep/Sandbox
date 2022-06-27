package sandbox.elements;

import sandbox.Settings;
import util.Color;

public abstract class Element {

    protected int matrixX, matrixY;
    protected int screenX, screenY;
    protected ElementType type;
    protected final Color color;

    public Element(int x, int y) {
        setMatrixPosition(x, y);
        this.type = getTypeFromClassName();
        this.color = ElementColors.getColorForElement(this);
    }

    private ElementType getTypeFromClassName() {
        return ElementType.valueOf(this.getClass().getSimpleName().toUpperCase());
    }

    private void setMatrixPosition(int x, int y) {
        this.matrixX = x;
        this.matrixY = y;
        this.screenX = toScreenPosition(x);
        this.matrixY = toScreenPosition(y);
    }

    private int toScreenPosition(int c) {
        return Settings.pixelSizeMod * c;
    }

    public ElementType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }
}
