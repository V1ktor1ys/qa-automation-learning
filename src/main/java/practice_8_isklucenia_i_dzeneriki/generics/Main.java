package practice_8_isklucenia_i_dzeneriki.generics;

public class Main {
    static void main(String[] args) {

        Box<String> boxString = new Box<>();

        boxString.setElement("AAA");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();

        boxInteger.setElement(111);
        System.out.println(boxInteger.getElement());

        Box<Book> boxBook = new Box<>();

        boxBook.setElement(new Book("BookAAA"));
        System.out.println(boxBook.getElement().getName());
    }
}
