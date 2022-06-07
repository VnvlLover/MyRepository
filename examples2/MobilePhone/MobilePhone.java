package examples2.MobilePhone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MobilePhone {
    public static ArrayList<Contacts> contactsList = new ArrayList<Contacts>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        menu();
    }

    public static void printMenu() {
        System.out.print("Mobile phone menu:" + "\n" +
                "\t" + "1: Print list of contacts." + "\n" +
                "\t" + "2: Add contact." + "\n" +
                "\t" + "3: Update existing contact" + "\n" +
                "\t" + "4: Remove contact." + "\n" +
                "\t" + "5: Find contact." + "\n" +
                "\t" + "6: Print options." + "\n" +
                "\t" + "7: Quit program." + "\n" +
                "Enter your choose:" + "\n");
    }

    public static void addContact() {
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();
     Contacts contact = new Contacts(name, phoneNumber);
     contactsList.add(contact);
    }

    public static void printListOfContacts() {
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println(i + 1 + ":\n" +
                    "\t" + contactsList.get(i).getName() + "\n" +
                    "\t" + contactsList.get(i).getPhoneNumber());
        }
    }

    public static void updateContact() {
        System.out.println("Enter existing name:");
        String name = scanner.next();
        boolean isExisting = false;
        int position = 0;
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) {
                isExisting = true;
                position = i;
            }
        }
        if (isExisting) {
            System.out.println("Enter new name:");
            String newName = scanner.next();
            System.out.println("Enter new number:");
            String newPhoneNumber = scanner.next();
            contactsList.set(position, Contacts.createContact(newName, newPhoneNumber));
            System.out.println("Contact updated");

        } else {
            System.out.println("Entered contact does not exist");
        }

    }

    public static void removeContact(){
        System.out.println("Enter contact name to remove:");
        String name = scanner.next();
        boolean isExisting = false;
        int position = 0;
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) {
                isExisting = true;
                position = i;
            }
        }
        if(isExisting){
            contactsList.remove(position);
        }else {
            System.out.println("Entered contact does not exist");
        }
    }

    public static void findContact(){
        System.out.println("Enter contact name to find:");
        String name = scanner.next();
        boolean isExisting = false;
        int position = 0;
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) {
                isExisting = true;
                position = i;
            }
        }
        if(isExisting){
            System.out.println(position + 1 + ":\n" +
                                "\t" + contactsList.get(position).getName() + "\n" +
                                "\t" + contactsList.get(position).getPhoneNumber());
        }else {
            System.out.println("Entered contact does not exist");
        }
    }

    public static void menu() {
        boolean flag = true;
        System.out.println("Hello");
        System.out.println("Enter option:");
        printMenu();

        while (flag) {
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    printListOfContacts();
                    System.out.println("Enter your choose:");
                    break;
                case 2:
                    addContact();
                    System.out.println("Contact added. \nEnter your choose:");
                    break;
                case 3:
                    updateContact();
                    System.out.println("Enter your choose:");
                    break;
                case 4:
                    removeContact();
                    System.out.println("Enter your choose:");
                    break;
                case 5:
                    findContact();
                    System.out.println("Enter your choose:");
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    System.out.println("Adios");
                    flag = false;
                    break;
            }
        }
    }
}


