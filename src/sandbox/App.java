package sandbox;

import processing.core.PApplet;
import processing.event.KeyEvent;
import processing.event.MouseEvent;

public class App extends PApplet {

    private long beginTime = System.currentTimeMillis();
    private long endTime;
    private float dt = -1f;

    SandboxSimulation sandbox;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        sandbox = new SandboxSimulation(this, width, height, Settings.pixelSizeMod);
    }

    @Override
    public void draw() {
        background(50);

        if (dt > 0) {
            // todo call simulation update
            sandbox.update(dt);
        }
        endTime = System.currentTimeMillis();
        dt = (endTime - beginTime) / 1000f;
        beginTime = endTime;

        textSize(10);
        fill(255, 0, 0);
        text("FPS: " + Math.round(frameRate), 10, 15);
    }

    @Override
    public void mousePressed(MouseEvent event) {
    }

    @Override
    public void mouseReleased(MouseEvent event) {
    }

    @Override
    public void keyPressed(KeyEvent event) {
    }

    public static void main(String[] args) {
        PApplet.main(App.class.getName());
    }
}
