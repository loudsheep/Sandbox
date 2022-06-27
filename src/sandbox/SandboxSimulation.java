package sandbox;

import processing.core.PApplet;
import processing.core.PGraphics;

public class SandboxSimulation {
    private PApplet sketch;
    private ElementsMatrix matrix;
    private PGraphics texture;
    private int width, height;

    public SandboxSimulation(PApplet sketch, int width, int height, int pixelSize) {
        this.sketch = sketch;
        this.width = width;
        this.height = height;
        this.matrix = new ElementsMatrix(width, height, pixelSize);
        this.texture = sketch.createGraphics(width, height);
    }

    public void update(float dt) {
        texture = null;
        texture = sketch.createGraphics(width, height);

        matrix.drawElements(texture);

        sketch.image(texture, 0, 0);
    }
}
