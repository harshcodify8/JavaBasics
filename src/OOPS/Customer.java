package OOPS;

import javax.sound.midi.Soundbank;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("messi",100000000,
                "lionelmessi@gmail.com");
        System.out.println("Default called");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
      this(name,1000000000,"messi@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
