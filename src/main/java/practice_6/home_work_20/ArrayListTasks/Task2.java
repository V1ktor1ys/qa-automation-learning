package practice_6.home_work_20.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите программу, которая выводит все чётные числа из ArrayList.
 */

public class Task2 {

    private List<Integer> numbers;

    public Task2() {
        this.numbers = new ArrayList<>();
    }

    public Task2(Integer... numbers) {
        this.numbers = new ArrayList<>(Arrays.asList(numbers));
    }

    public void printAllElements() {
        if (numbers.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        System.out.print("The List of Elements: ");
        for (Integer number : numbers) {
            if (number % 2 == 0) System.out.print(number + " ");
        }
    }
}
