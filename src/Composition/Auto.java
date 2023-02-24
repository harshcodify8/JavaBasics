package Composition;
public class Auto extends Vehicle {
    private int doors;
    private int engineCapacity;
    public Auto(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    // Is a relationship -> Auto is a vehicle
}
