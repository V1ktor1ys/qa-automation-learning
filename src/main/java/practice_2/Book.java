package practice_2;

/**
 * Создайте класс Book с полями title и author. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
 * выводящий название и автора книги. В main создайте книгу, измените автора и выведите информацию.
 */
public class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void printInfo() {
        System.out.println("Book Name: " + title + ", Author: " + author);
    }
}
