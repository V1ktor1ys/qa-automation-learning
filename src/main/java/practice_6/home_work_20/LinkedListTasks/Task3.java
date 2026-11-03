package practice_6.home_work_20.LinkedListTasks;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
 */

public class Task3 {

    private LinkedList<String> list;

    public Task3() {
        this.list = new LinkedList<>();
    }

    public Task3(String... strings) {
        this.list = new LinkedList<>(Arrays.asList(strings));
    }

    public void printFirstAndLastElements() {
        if (list.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        System.out.println("The First and The Last Elements from The List: " + list.getFirst() + ", " + list.getLast());
    }
}
