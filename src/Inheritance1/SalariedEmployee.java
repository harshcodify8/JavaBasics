package Inheritance1;

public class SalariedEmployee extends Employee{

    boolean isRetired;
    double annualSalary;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
       return (int) annualSalary / 26;
    }

    public void retire() {
        terminate("12/12/2077");
        isRetired = true;
    }
}
