package practice_6.home_work_20.LinkedListTasks;

public class Main {
    static void main(String[] args) {

        // Task-1
        Task1 list1 = new Task1();
        list1.printAllElements();

        // Task-2
        Task2 list2_1 = new Task2("aaa", "bbb", "ccc");
        list2_1.printAllTasks();

        list2_1.processAllTasks();
        list2_1.printAllTasks();

        // Task-3
        Task3 list3_1 = new Task3("aaa", "bbb", "ccc", "ddd");
        list3_1.printFirstAndLastElements();

        // Task-4
        Task4 list4_1 = new Task4(7, 15, 23);
        list4_1.printTotal();

        // Task-5
        Task5 list5_1 = new Task5(1, 2, 3);

        list5_1.printElementsFromHeadToTail();

        list5_1.printElementsFromTailToHead();
    }
}
