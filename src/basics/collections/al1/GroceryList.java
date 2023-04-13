package basics.collections.al1;

import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> groceryList= new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items.");
        for(int i = 0 ; i < groceryList.size();i++){
            System.out.println(groceryList.size());
        }
    }

    public void modifyItem(String curr, String rem){
        int position = findItem(curr);
        if(position>=0){
            modifyGroceryItem(position,rem);
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("modified");

    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public void removeGroceryItem(String remove){
        int position = findItem(remove);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }



    public void removeGroceryItem(int position) {
        // String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem){
        //boolean exists = groceryList.contains(seachItem);
        int position = groceryList.indexOf(searchItem);
            if(position>=0){
                return true;
            }
            return false;
    }

}
