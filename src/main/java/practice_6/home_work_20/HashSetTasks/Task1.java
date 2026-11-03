package practice_6.home_work_20.HashSetTasks;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Создайте HashSet из 5 чисел и выведите его содержимое.
 */

public class Task1 {

    private HashSet<Integer> numbers;

    public Task1() {
        this.numbers = new HashSet<>(Arrays.asList(3, 5, 7, 10));
    }

    public void printAllNumbers() {
        System.out.println(numbers);
    }
}
