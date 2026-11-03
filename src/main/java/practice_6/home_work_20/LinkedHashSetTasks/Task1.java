package practice_6.home_work_20.LinkedHashSetTasks;

import java.util.LinkedHashSet;

/**
 * Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
 */

public class Task1 {

    private LinkedHashSet<String> list;

    public Task1() {
        this.list = new LinkedHashSet<>();
    }

    public void addElement(String element) {
        list.add(element);
    }

    public void printAllElements() {
        System.out.println(list);
    }

    public void printAllElements2() {
        System.out.println("All Elements in the list: ");
        list.forEach(System.out::println);
    }
}
