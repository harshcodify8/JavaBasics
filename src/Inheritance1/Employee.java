package Inheritance1;
public class Employee extends Worker {
    private String hireDate;

    private long EmployeeID;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.EmployeeID = Employee.employeeNo++;
        //postfix
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

}
