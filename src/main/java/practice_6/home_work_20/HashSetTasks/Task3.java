package practice_6.home_work_20.HashSetTasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
 */

public class Task3 {

    Set<String> set;

    public Set<String> removeDuplicates(List<String> list) {
        this.set = new HashSet<>(list);
        return set;
    }

    public void printAllNumbers() {
        System.out.println(set);
    }
}
