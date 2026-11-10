package practice_6.home_work_20.HashSetTasks;

import java.util.HashSet;
import java.util.Set;

/**
 * Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
 */

public class Task2 {

    private Set<Integer> numbers;

    public Task2() {
        this.numbers = new HashSet<>();
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void checkNumber(Integer number) {
        if (numbers.contains(number)) System.out.println("Number \"" + number + "\" is present");
        else System.out.println("Number \"" + number + "\" is NOT present");
    }

    public void printAllNumbers() {
        System.out.println("All Numbers: " + numbers);
    }
}
