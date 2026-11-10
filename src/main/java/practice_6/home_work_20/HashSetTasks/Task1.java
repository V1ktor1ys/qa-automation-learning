package practice_6.home_work_20.HashSetTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Создайте HashSet из 5 чисел и выведите его содержимое.
 */

public class Task1 {

    private Set<Integer> numbers;

    public Task1() {
        this.numbers = new HashSet<>(Arrays.asList(3, 5, 7, 10, 14));
    }

    public void printAllNumbers() {
        System.out.println(numbers);
    }
}
