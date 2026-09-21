package practice_3;

/**
 * Создайте класс Library с полями:
 * private String bookTitle
 * protected String author
 * int year (default-доступ)
 * public String category
 * Реализуйте геттеры и сеттеры для всех полей. В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.
 */
public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle() {
        return this.bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    String getCategory() {
        return this.category;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setCategory(String category) {
        this.category = category;
    }

}
