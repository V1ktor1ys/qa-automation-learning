package practice_6.home_work_20.HashSetTasks;

import java.util.HashSet;

/**
 * Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
 */

public class Task2 {

    private HashSet<Integer> numbers;

    public Task2() {
        this.numbers = new HashSet<>();
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void printAllNumbers() {
        System.out.println(numbers);
    }
}
