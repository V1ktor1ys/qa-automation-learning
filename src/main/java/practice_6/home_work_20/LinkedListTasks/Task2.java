package practice_6.home_work_20.LinkedListTasks;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
 */

public class Task2 {

    private LinkedList<String> tasks;

    public Task2() {
        this.tasks = new LinkedList<>();
    }

    public Task2(String... strings) {
        this.tasks = new LinkedList<>(Arrays.asList(strings));
    }

    public void processAllTasks() {
        while (!tasks.isEmpty()) {
            tasks.poll();
            if (!tasks.isEmpty()) System.out.println(tasks);
        }
        System.out.println("All tasks have been processed");
    }

    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        System.out.println("The List of All Tasks: " + tasks);
    }
}
