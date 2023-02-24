package oopscombined;

public class Delux extends Hamburger{
    public Delux() {
        super("delux","coolmeat", 4600.00, "extra brown");
        super.addHamburgerAddition1("kurkure",250.00);
        super.addHamburgerAddition2("juice",500.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional item");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add");
    }
}
