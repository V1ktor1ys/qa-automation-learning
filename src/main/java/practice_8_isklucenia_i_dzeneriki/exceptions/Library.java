package practice_8_isklucenia_i_dzeneriki.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> library;

    public Library() {
        this.library = new ArrayList<>();
    }

    public void printAllBooks() {
        library.forEach(System.out::println);
    }

    // добавлять книгу
    // Обработка исключения: если мы добавляем существующую книгу, то мы получаем непроверяемое исключение InvalidBookException

    public void addBook(Book book) {

        if (library.contains(book)) {
            throw new InvalidBookException("ОШИБКА, ТАКАЯ КНИГА УЖЕ СУЩЕСТВУЕТ!!!");
        } else {
            library.add(book);
        }
    }

    // искать книгу
    // Обработка исключения: если мы не можем найти книгу, то случится проверяемое исключение BookNotFoundException

    public Book findBook(String name) throws BookNotFoundException {

        AtomicReference<Book> findBook = new AtomicReference<>();
        library.forEach(book -> {
            if (book.getName() == name) {
                findBook.set(book);
            }
        });

        if (findBook.get() == null) {
            throw new BookNotFoundException("ОШИБКА, ТАКАЯ КНИГА НЕ НАЙДЕНА!!!");
        }
        return findBook.get();
    }
}
