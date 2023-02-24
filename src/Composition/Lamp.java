package Composition;

public class Lamp {
    private String style;
    private String battery;
    private int globRating;

    public Lamp(String style, String battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is turning on");
    }

    public String getStyle() {
        return style;
    }

    public String getBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
