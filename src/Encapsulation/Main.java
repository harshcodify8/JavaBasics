package Encapsulation;
public class Main {
    public static void main(String[] args) {
        Player pl = new Player("boxing",80,"boxing-gloves");
        System.out.println(pl.getHealth());
        Printer pr = new Printer(75,true);
        int pagesprinted=pr.printPages(2);
        // int health = pl.remaningHealth();
        // System.out.println(health);
    }
}
