package AbstractClasses;

public abstract class Animal {

    protected String type;

    private String size;

    private Double  weight;

    public Animal(String type, String size, Double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    // it it is private subclasses wont even see it!!

    public abstract void makeNoise();

}
