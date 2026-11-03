package practice_6.home_work_20.HashSetTasks;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        // Task-1
        Task1 list1 = new Task1();
        list1.printAllNumbers();

        // Task-2
        Task2 list2 = new Task2();
        list2.addNumber(5);
        list2.addNumber(22);
        list2.addNumber(7);
        list2.addNumber(7);
        list2.addNumber(11);
        list2.addNumber(33);
        list2.addNumber(5);
        list2.addNumber(-3);
        list2.addNumber(0);
        list2.addNumber(5);
        list2.printAllNumbers();

        // Task-3
        Task3 list3 = new Task3();
        List<String> list = Arrays.asList("aaa", "aaa", "bbb", "ccc", "ddd", "aaa", "ccc");
        list3.removeDuplicates(list);
        list3.printAllNumbers();

        // Task-4
        Task4 list4 = new Task4("aaa", "bbb", "ccc");
        list4.checkPresenceName("ddd");
        list4.checkPresenceName("aaa");
        list4.checkPresenceName("bbb");
        list4.checkPresenceName("ccc");
    }
}
