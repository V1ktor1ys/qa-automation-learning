package practice_6.home_work_20.HashSetTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве,
 * и выводит соответствующее сообщение.
 */

public class Task4 {

    private Set<String> names;

    public Task4() {
        this.names = new HashSet<>();
    }

    public Task4(String... names) {
        this.names = new HashSet<>(Arrays.asList(names));
    }

    public void checkPresenceName(String checkedName) {
        if (names.contains(checkedName)) System.out.println(checkedName + " is present in the list.");
        else System.out.println(checkedName + " is NOT present in the list.");
    }
}
