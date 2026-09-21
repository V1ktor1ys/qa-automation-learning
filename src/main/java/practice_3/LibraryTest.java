package practice_3;

public class LibraryTest {

    Library library1 = new Library();
    String a = library1.author;
    int b = library1.year;
    String c = library1.category;
//    String d1 = library1.bookTitle; <== No Access
    String d2 = library1.getBookTitle();


}
