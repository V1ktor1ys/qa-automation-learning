package practice_6.contact_book;

import java.util.HashMap;

public class ContactBook {

    private HashMap<String, Integer> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    // add contact
    public void addContact(String name, Integer phone) {
        contacts.put(name, phone);
    }

    // search contact by name
    public Integer searchContactByName(String name) {
        return contacts.get(name);
    }

    // search & print contact by name
    public void searchContactByName2(String name) {
        System.out.println("Name: " + name + ", Phone: " + contacts.get(name));
        System.out.println();
    }

    // update phone by name
    public void updatePhoneByName(String name, Integer updatedPhone) {
        contacts.put(name, updatedPhone);
    }

    // print all contacts
    public void printContacts() {
        System.out.println("CONTACTS: ");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("Name: " + name + ", Phone: " + phone);
                }
        );
        System.out.println();
    }
}
