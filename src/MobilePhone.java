import java.util.ArrayList;

/**
 * Created by Sugarcoder on 9/18/2015.
 */

public class MobilePhone{

    private String myNumber;

    private ArrayList<Contacts> contactList;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contacts>();
    }


    public boolean addNewContact(Contacts contact) {
        if(findContact(contact.getContactName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }

        contactList.add(contact);
        return true;
    }


    private int findContact(Contacts contact) {
        return this.contactList.indexOf(contact);
    }


    private int findContact(String contactName) {
        for(int i=0; i<this.contactList.size();i++) {
            Contacts contact = this.contactList.get(i);
            if(contact.getContactName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }


    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<=0) {
            System.out.println(oldContact.getContactName()+ " was not found");
            return false;
        }

        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getContactName() + " was replaced with " + newContact.getContactName());
        return true;
    }


    public String queryContact(Contacts contact){
        if(findContact(contact) >=0) {
            return contact.getContactName();
        }
        return null;
    }


    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getContactName() + " was not found");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact.getContactName() + " was deleted");
        return true;
    }



    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0; i<this.contactList.size(); i++) {
            System.out.println((i+1) + "." +
                this.contactList.get(i).getContactName() + " -> " +
                this.contactList.get(i).getPhoneNumber());
        }
    }


}
