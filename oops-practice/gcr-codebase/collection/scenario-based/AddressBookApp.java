import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    public static void searchContact(String name) {

        Contact c = contactMap.get(name);

        if (c != null) {
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
            System.out.println("Email: " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void deleteContact(String name) {

        Contact c = contactMap.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void displayContacts() {

        Collections.sort(contacts, Comparator.comparing(contact -> contact.name));

        System.out.println("\nAddress Book:");

        for (Contact c : contacts) {
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Harshita", "9876543210", "harshita@gmail.com");
        addContact("Aman", "9999999999", "aman@gmail.com");
        addContact("Priya", "8888888888", "priya@gmail.com");
        addContact("Riya", "9876543210", "riya@gmail.com");

        searchContact("Aman");

        deleteContact("Priya");

        displayContacts();
    }
}