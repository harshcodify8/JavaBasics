package Inheritance1;
public class Main {
    public static void main(String[] args) {

        Employee mathew = new Employee("Mathew","07/07/1998","10/10/2021");
        System.out.println(mathew);
        System.out.println("Age = " + mathew.getAge());
        System.out.println("Pay = " + mathew.collectPay());

        SalariedEmployee shakira = new SalariedEmployee("shakira","07/07/1998",
                "10/10/2021",3500);
        System.out.println(shakira);
        System.out.println("shakira paycheck" + shakira.collectPay());
    }
}
