import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sugarcoder on 9/18/2015.
 */

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone("415 123 4567");


    public static void main(String[] args) {

        /*
        - Menu Options: quit, print list of contacts, add new contact,
        update existing contact, remove contact, search/find contact
        */


        boolean quit = false;
        startPhone();
        printActions();



        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }


        }

    }



    private static void startPhone(){
        System.out.println("Starting phone...");
    }



    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                            "1 - Print contacts\n" +
                            "2 - Add a contact\n" +
                            "3 - Update an existing contact\n"" +
                            "4 - Remove a contact\n" +
                            "5 - Query if an existing contact exists\n" +
                            "6 - Print a list of available actions.");
        System.out.println("Choose your actions:");

    }



    public static void addContacts() {
        System.out.println("Please enter the grocery item: ");
        contactList.addContact(scanner.nextLine();
    }




}


