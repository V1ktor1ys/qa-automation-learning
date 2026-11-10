package practice_6.home_work_20.PriorityQueueTasks;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
 */

public class Task1 {

    private Queue<Integer> priorityNumbers;

    public Task1() {
        this.priorityNumbers = new PriorityQueue<>();
    }

    public void addNumber(Integer number) {
        priorityNumbers.add(number);
    }

    public void printAllNumbers() {
        System.out.println(priorityNumbers);
    }

    public void printNumbersInRemovalOrder() {
        System.out.println("The list of numbers in removal order: ");
        while (!priorityNumbers.isEmpty()) System.out.println(priorityNumbers.poll());
    }
}
