package sandbox;

import processing.core.PGraphics;
import sandbox.elements.Element;
import sandbox.elements.Empty;
import sandbox.elements.solid.movable.Sand;
import util.Color;

public class ElementsMatrix {
    private Element[][] matrix;
    private final int width, height;
    private final int pixelSize;

    public ElementsMatrix(int width, int height, int pixelSize) {
        this.pixelSize = pixelSize;
        this.width = width / pixelSize;
        this.height = height / pixelSize;
        this.matrix = new Element[this.width][this.height];


        this.matrix = this.createMatrix(this.width, this.height);
    }

    public void drawElements(PGraphics graphics) {
        graphics.beginDraw();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Element elem = get(i, j);
                if (elem == null) continue;

                Color color = elem.getColor();
                if (color == null) continue;

                int c = graphics.color(color.r, color.g, color.b, color.a);
                for (int x = 0; x < pixelSize; x++)
                    for (int y = 0; y < pixelSize; y++)
                        graphics.set(toScreenPos(i) + x, toScreenPos(j) + y, c);
            }
        }

        graphics.endDraw();
    }

    public Element get(int x, int y) {
        if (!isInBounds(x, y)) return null;
        return matrix[x][y];
    }

    private boolean isInBounds(int x, int y) {
        return (x >= 0 && x < width) && (y >= 0 && y < height);
    }

    private Element[][] createMatrix(int width, int height) {
        Element[][] matrix = new Element[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (Math.random() > 0) {
                    matrix[i][j] = new Sand(i, j);
                } else {
                    matrix[i][j] = new Empty(i, j);
                }
            }
        }

        return matrix;
    }

    private int toScreenPos(int matrixPos) {
        return matrixPos * pixelSize;
    }
}
