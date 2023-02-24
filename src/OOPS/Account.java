package OOPS;
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    public Account() {
        this("1234","2.50",300,
                "cristiano@gamil.com","7777777777");
        System.out.println("empty constructor");
    }

    public Account(String number , String customerName , double balance,
                   String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("12345",customerName,1000.00,customerEmail,customerPhone);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }

    public void deposit(double deposit) {
        balance +=  deposit;
        System.out.println(this.balance);
    }
    public void withdrawl (double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Insufficent funds in your accounts");
        }
        else {
            balance=balance-withdrawalAmount;
            System.out.println("withdrawl: "+ withdrawalAmount+" rem: "+balance);
        }
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
