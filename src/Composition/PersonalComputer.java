package Composition;
public class PersonalComputer {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //getMonitor().drawPixelAt(1222,222,"blue");
        monitor.drawPixelAt(1228,8999,"blue");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
