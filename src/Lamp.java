public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean batterty, int globRating) {
        this.style = style;
        this.battery = batterty;
        this.globRating = globRating;
    }

    public  void  turnOn() {
        System.out.println("Lamb -> Turned on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
