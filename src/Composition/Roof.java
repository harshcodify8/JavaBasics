package Composition;
public class Roof {
    private int height;
    private String paintedColor;

    public Roof(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}
