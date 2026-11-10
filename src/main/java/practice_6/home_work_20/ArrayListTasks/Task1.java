package practice_6.home_work_20.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
 */

public class Task1 {

    List<Integer> numbers;

    public Task1() {
        this.numbers = new ArrayList<>(Arrays.asList(3, 7, 15, 22, 31));
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void printAllElements() {
        numbers.forEach(number -> System.out.println("Number: " + number));
        System.out.println();
    }

    public void printAllElements2() {
        System.out.println(numbers);
    }
}
