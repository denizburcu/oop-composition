public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelArt(1200, 50, "yellow");
    }

}
