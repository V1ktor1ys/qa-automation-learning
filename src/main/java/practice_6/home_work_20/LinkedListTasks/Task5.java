package practice_6.home_work_20.LinkedListTasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Используйте ListIterator для прохода по LinkedList в обоих направлениях.
 */

public class Task5 {

    private LinkedList<Integer> numbers;
    private ListIterator<Integer> it;

    public Task5() {
        this.numbers = new LinkedList<>();
        it = numbers.listIterator();
    }

    public Task5(Integer... numbers) {
        this.numbers = new LinkedList<>(Arrays.asList(numbers));
        this.it = this.numbers.listIterator();
    }

    public void printElementsFromHeadToTail() {
        System.out.println("Elements from Head to Tail: ");
        while (it.hasNext()) System.out.println(it.next());
    }

    public void printElementsFromTailToHead() {
        System.out.println("Elements from Tail to Head: ");
        while (it.hasPrevious()) System.out.println(it.previous());
    }
}
