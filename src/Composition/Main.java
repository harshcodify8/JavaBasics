package Composition;
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(10,20,11);
        Case theCase = new Case("tuf504fx","asus","250", dimensions);
        Monitor monitor = new Monitor("Al","Asus",15,new Resolution(1233,999));
        Motherboard motherboard = new  Motherboard("AsusMotherBoardXpro","AsuMotherBoards",8,4,"z1.1");
        PersonalComputer theNewPc = new PersonalComputer(theCase,monitor,motherboard);
        //theNewPc.getMonitor().drawPixelAt(111,222,"black");
        //theNewPc.getMotherboard().loadProgram("Windows");
        theNewPc.powerUp();
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Roof roof = new Roof(20,"pink");
        Bed bed = new Bed("old",2,9,10);
        Lamp lamp = new Lamp("funky","luminious",5);
        Bedroom bedroom = new Bedroom("Ceaser",wall1,wall2,wall3,wall4,roof,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
