package basics.collections.al1;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                case 2:
                    Main.addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("0 - print");
        System.out.println("1 - print the list of grocery item");
        System.out.println("2 - to add an item into list");
        System.out.println("3 - to modify item in list");
        System.out.println("4 - to remove an item from list");
        System.out.println("5 - to search an item in the list");
        System.out.println("6 - to quit ");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }


    public static void removeItem() {
        System.out.println("Enter the item name:");
        String itemrem = sc.nextLine();
        groceryList.removeGroceryItem(itemrem);
    }

    public static void modifyItem() {
        System.out.println("Enter the current item");
        String current = sc.nextLine();
        System.out.println("Enter the item to be changed");
        String changed = sc.nextLine();
        groceryList.modifyItem(current, changed);

    }

    public static void searchForItem() {
        System.out.print("search item daal");
        String searchItem = sc.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("not found");
        }

    }
}