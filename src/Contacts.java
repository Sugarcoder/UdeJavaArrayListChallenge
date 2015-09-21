/**
 * Created by Sugarcoder on 9/19/2015.
 */

public class Contacts {
    private String contactName;
    private String phoneNumber;


    public Contacts(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }


    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }


}
