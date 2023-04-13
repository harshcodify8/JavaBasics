package basics.collections.al2;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }

    }
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void printActions() {
        System.out.println("Actions");
        System.out.println("0  - shutdown" +
                "1  - print contact" +
                "2  - add new contact" +
                "3  - update existing contact" +
                "4  - remove existing contact" +
                "5  - query if an existing contact is there" +
                "6  - for all options");
    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void addNewContact(){
        System.out.println("Enter contact name");
        String name = sc.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = sc.nextLine();
        Contact contact = new Contact(name,phoneNumber);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("added");
        } else {
            System.out.println("already");
        }
    }

    private static void updateContact(){
        System.out.println("Enter contact to be replaced");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("enter new contact name");
        String newName= sc.nextLine();
        System.out.println("Enter new contact phone number:");
        String newNumber = sc.nextLine();
        Contact contact = new Contact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord,contact)){
            System.out.println("Succesfully updated");
        } else  {
            System.out.println("Error cant update");
        }
    }

    private static void queryContact(){

        System.out.println("Enter contact to be queried");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("contact not found");
            return;
        }
        System.out.println(existingContactRecord.getName() + existingContactRecord.getPhoneNumber());
    }

    private static void removeContact(){

        System.out.println("Enter contact to be removed");
        String deletedName = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(deletedName);
        if(existingContactRecord==null){
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("deleted");
        } else {
            System.out.println("error deleteing record ");
        }
    }


}

