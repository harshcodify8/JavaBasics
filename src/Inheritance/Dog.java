package Inheritance;
public class Dog extends Animal{

    // super() is always there if you don't mention.
    // in short dog 'IS A' type of animal.

    private String earShape;
    private String tailShape;

    public Dog () {
        super("husky","big",100);
    }
    public Dog(String type , double weight) {
        this(type,weight,"perky","curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" :(weight < 35 ? "medium" : "large" ) , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        if(type=="wolf") {
            System.out.println("ow wooooooo!!");
        } else {
        bark();
        }
        System.out.println();
        // it makes all dog silent for moment
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk , run yooo");
        if(speed == "slow") {
            walk();
            // wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("hey yooo!!");
    }
    private void run() {
        System.out.println("running");
    }
    private void walk() {
        System.out.println("walking");
    }


}