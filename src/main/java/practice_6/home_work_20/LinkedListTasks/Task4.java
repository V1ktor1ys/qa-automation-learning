package practice_6.home_work_20.LinkedListTasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
 */

public class Task4 {

    private List<Integer> numbers;

    public Task4() {
        this.numbers = new LinkedList<>();
    }

    public Task4(Integer... numbers) {
        this.numbers = new LinkedList<>(Arrays.asList(numbers));
    }

    public void printTotal() {
        if (numbers.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        int total = 0;
        for (int number: numbers) {
            total = total + number;
        }
        System.out.println("The SUM of All elements is: " + total);
    }
}
