package sandbox;

import sandbox.elements.Element;

public class ElementsMatrix {
    private Element[][] matrix;
    private int width, height;

    public ElementsMatrix(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new Element[width][height];
    }
}
