package practice_6.contact_book;

public class Main {
    static void main(String[] args) {

        ContactBook contactBook = new ContactBook();

        contactBook.addContact("AAA", 11111);
        contactBook.addContact("BBB", 22222);
        contactBook.addContact("CCC", 33333);

        contactBook.printContacts();

        contactBook.searchContactByName2("BBB");

        contactBook.updatePhoneByName("AAA", 99999);

        contactBook.printContacts();
    }
}
