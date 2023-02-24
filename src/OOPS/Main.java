package OOPS;

public class Main {
    public static void main(String[] args) {
        // Car car = null;
        // it will throw an expcetion at runtime
       /*

        Car car = new Car();
        car.setMake("Porshe");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Blue");
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " +car.getModel());

        */

        // Account cristianoAccount = new Account("12345","Ronaldo",1000.00,
        //       "ronaldo@gmail.com","7777777777");

        Account cristianoAccount = new Account("ronaldo","ronaldo@gmail.com"
                ,"777777777");

        //cristianoAccount.setNumber("77777");
        //cristianoAccount.setBalance(100.00);
        //cristianoAccount.setCustomerName("Ronaldo");
        //cristianoAccount.setCustomerEmail("cristiano@gmail.com");
        //cristianoAccount.setCustomerPhone("7777777777");
        System.out.println(cristianoAccount.getNumber());
        System.out.println(cristianoAccount.getBalance());
        cristianoAccount.withdrawl(200.00);
        cristianoAccount.deposit(300.00);
        cristianoAccount.withdrawl(100.00);




        Customer customer = new Customer("lm",
                1000000000,
                "lionelmessi@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());

        Customer customer2 = new Customer();

        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());



    }
}
