package oopscombined;

public class Main {
    public static void main(String[] args) {
        Hamburger hm = new Hamburger("Basic", "fresh", 300.10, "Brown");
        hm.addHamburgerAddition1("cheese", 20.05);
        double price = hm.totalRupeesHamburger();
        System.out.println(price);
        HB hb = new HB("Simple",200.00);
        hb.addHamburgerAddition1("fish",300.00);
        hb.addHamburgerHealthAddition1("onion",300.00);
        System.out.println(hb.totalRupeesHamburger());
        Delux d = new Delux();
        d.totalRupeesHamburger();
    }
}
