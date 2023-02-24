package Inheritance;
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal ("Generic Animal",
                "Huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("husky",
                100,"floopy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf" , 40);
        doAnimalStuff(wolf,"slow");

        Fish nemo = new Fish("nemo",1,2,4);
        doAnimalStuff(nemo,"fast");
    }
    public static void doAnimalStuff(Animal animal,String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("----");;
    }
}
