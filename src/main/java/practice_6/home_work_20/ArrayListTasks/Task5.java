package practice_6.home_work_20.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
 */

public class Task5 {

    private ArrayList<Integer> numbers;

    public Task5() {
        this.numbers = new ArrayList<>();
    }

    public Task5(Integer... numbers) {
        this.numbers = new ArrayList<>(Arrays.asList(numbers));
    }

    public void printTotal() {
        if (numbers.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        int maxNumber = numbers.getFirst();
        for (int number: numbers) {
            if (maxNumber < number) maxNumber = number;
        }
        System.out.println("The Biggest Number is: " + maxNumber);
    }
}
