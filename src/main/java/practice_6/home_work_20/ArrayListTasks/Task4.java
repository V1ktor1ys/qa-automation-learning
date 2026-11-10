package practice_6.home_work_20.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
 */

public class Task4 {

    private List<Integer> numbers;

    public Task4() {
        this.numbers = new ArrayList<>();
    }

    public Task4(Integer... numbers) {
        this.numbers = new ArrayList<>(Arrays.asList(numbers));
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
