package com.flappy.bird;
import java.awt.*;
import javax.swing.ImageIcon;

public class Pipe {
    private static final int WIDTH = 64;
    private  static final int HEIGHT = 512;
    private static final String TOP_PIPE_IMG = "/com/flappy/bird/images/toppipe.png";
    private static final String BOTTOM_PIPE_IMG = "/com/flappy/bird/images/bottompipe.png";
    private int x, y;
    private boolean passed = false;
    private Image img;

    public Pipe(int y, boolean isTopPipe) {
        this.x = GamePanel.BOARD_WIDTH;
        this.y = y;
        this.img = new ImageIcon(getClass().getResource(isTopPipe ? TOP_PIPE_IMG : BOTTOM_PIPE_IMG)).getImage();
    }

    public void move() {
        x -= 4;
    }

    public boolean isOffScreen() {
        return x + WIDTH < 0;
    }

    public void draw(Graphics g) {
        g.drawImage(img, x, y, WIDTH, HEIGHT, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public int getX() {
        return x;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
