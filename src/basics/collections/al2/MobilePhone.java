package basics.collections.al2;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
        // always initalize it in constructor with empty list.
    }

    /*
    public MobilePhone(String myNumber){ }
     */


    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact phele se ha baho");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public String queryContact(Contact contact){
        if(findContact(contact) >=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int posi = findContact(name);
        if(posi>=0){
            return this.myContacts.get(posi);
        }
        return null;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0 ; i < this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
        // it wasn't found so return -1;
    }

    public boolean updateContact(Contact oldCon , Contact newCon){
        int posii = findContact(oldCon);
        if(posii < 0){
            System.out.println("NOT FOUND");
            return false;
        }

        this.myContacts.set(posii,newCon);
        System.out.println(oldCon.getName() + " , was replaced with " +newCon.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int posi = findContact(contact);
        if(posi>=0){
            this.myContacts.remove(posi);
            return true;
        }

        return false;
    }

    public void printContacts(){
        System.out.println("printing contacts");
        for(int i = 0 ; i <this.myContacts.size();i++){
            System.out.println(this.myContacts.get(i).getName()+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
