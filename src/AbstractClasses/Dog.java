package AbstractClasses;
public class Dog extends Animal {


    public Dog(String type, String size, Double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

        if(type == "wolf") {
            System.out.printf("Howling! ");
        } else {
            System.out.printf("Woof!");
        }
    }
}
