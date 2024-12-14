package spacealien;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class GameEntity {
    protected int x;
    protected int y;
    protected boolean isActive;

    public GameEntity(int x, int y) {
        this.x = x;
        this.y = y;
        this.isActive = true;
    }
        abstract void update();
    abstract void render(GraphicsContext gc);

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}


