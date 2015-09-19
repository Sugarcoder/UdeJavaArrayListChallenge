import java.util.ArrayList;

/**
 * Created by Sugarcoder on 9/18/2015.
 */

public class MobilePhone{

    private ArrayList<String> contactList = new ArrayList<String>();


    public void addContact(String contact){
        contactList.add(contact);
    }


    public void printContact(){
        System.out.println(contactList.size() + " is in your Contact List");
        for (int i=0; i<contactList.size();i++) {
            System.out.println((i+1) + contactList.get(i));
        }
    }



    public void modifyContact(String currentContact, String newContact){
        int position = findContact(currentContact);
        if(position>=0) {
            modifyContact(position, newContact);
        }
    }


    public void modifyContact(int position, String newContact) {
        contactList.set(position, newContact);
    }


    private int findContact(String searchItem) {
        return contactList.indexOf(searchItem);
    }


    public void removeContact(){

    }



    public void queryContact(){

    }




}
