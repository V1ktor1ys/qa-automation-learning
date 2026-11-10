package practice_6.home_work_20.ArrayDequeTasks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Создайте ArrayDeque, добавьте 5 элементов и выведите их.
 */

public class Task1 {

    private Deque<Integer> numbers;

    public Task1() {
        this.numbers = new ArrayDeque<>();
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void printAllNumbers() {
        System.out.println(numbers);
    }
}
