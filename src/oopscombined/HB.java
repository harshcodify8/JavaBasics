package oopscombined;
public class HB extends Hamburger{

    private String hlthyextra1Name;
    private double hlthyextra1Price;

    private String hlthyextra2Name;
    private double hlthyextra2Price;

    public HB(String meat, double price ) {
        super( "Healthyyy", meat, price, "Brown-type");
    }

    public void addHamburgerHealthAddition1(String name , double price) {
        this.hlthyextra1Name = name;
        this.hlthyextra1Price = price;
    }
    public void addHamburgerHealthAddition2(String name , double price) {
        this.hlthyextra2Name = name;
        this.hlthyextra2Price = price;
    }

    @Override
    public double totalRupeesHamburger() {
        double hamburgerPrice = super.totalRupeesHamburger();
        if(this.hlthyextra1Name!=null) {
            hamburgerPrice=hlthyextra1Price+hamburgerPrice;
            System.out.println("added");
        }
        if(this.hlthyextra2Name!=null) {
            hamburgerPrice=hlthyextra2Price+hamburgerPrice;
            System.out.println("added");
        }

        return hamburgerPrice;
    }
}
