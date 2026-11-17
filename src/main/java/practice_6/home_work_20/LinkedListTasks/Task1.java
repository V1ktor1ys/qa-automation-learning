package practice_6.home_work_20.LinkedListTasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
 */

public class Task1 {

    private List<String> strings;

    public Task1 () {
        this.strings = new LinkedList<>(Arrays.asList("aaa1", "aaa2", "aaa3", "aaa4", "aaa5"));
    }

    public void printAllElements() {
        System.out.println(strings);
    }
}
