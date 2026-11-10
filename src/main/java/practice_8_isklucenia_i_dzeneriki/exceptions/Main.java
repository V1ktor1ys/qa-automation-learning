package practice_8_isklucenia_i_dzeneriki.exceptions;

public class Main {
    static void main(String[] args) {

        Library library1 = new Library();

        library1.addBook(new Book("Name1", "Author1"));
        library1.addBook(new Book("Name2", "Author2"));
        library1.addBook(new Book("Name3", "Author3"));
//        library1.addBook(new Book("Name3", "Author3")); // ТРИГГЕР InvalidBookException

        library1.printAllBooks();

        try {
            library1.findBook("Name4");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение!!!");
        }
    }
}
