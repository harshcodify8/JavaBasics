package Inheritance;
public class Fish extends Animal{
    private int gills;
    private int fish;

    public Fish(String type, double weight, int gills, int fish) {
        super(type,"small" , weight);
        this.gills = gills;
        this.fish = fish;
    }

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveBackFin() {
        System.out.println("Backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fish=" + fish +
                "} " + super.toString();
    }
}
