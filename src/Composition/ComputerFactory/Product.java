package Composition.ComputerFactory;

public class Product {

    private String model;
    private  int width;
    private int height;
    private int depth;
    private String manufacturer;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {
    public Monitor(String model , String manufacturer){
    super(model,manufacturer);
    }
}
class Motherboard extends Product {
    public Motherboard(String model , String manufacturer){
        super(model,manufacturer);
    }
}
class ComputerCase extends Product {
    public ComputerCase (String model , String manufacturer){
        super(model,manufacturer);
    }
}


