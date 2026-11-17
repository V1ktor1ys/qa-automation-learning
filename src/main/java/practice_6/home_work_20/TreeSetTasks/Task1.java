package practice_6.home_work_20.TreeSetTasks;

import java.util.Set;
import java.util.TreeSet;

/**
 * Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
 */

public class Task1 {

    private Set<Integer> numbers;

    public Task1() {
        this.numbers = new TreeSet<>();
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void printAllNumbers() {
        System.out.println(numbers);
    }
}
