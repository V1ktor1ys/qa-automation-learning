package practice_6.home_work_20.ArrayListTasks;

public class Main {
    static void main(String[] args) {

        // Task-1
        Task1 task1 = new Task1();

        task1.printAllElements2();
        task1.printAllElements();

        task1.addNumber(44);

        task1.printAllElements2();
        task1.printAllElements();

        // Task-2
        Task2 list2_1 = new Task2();
        list2_1.printAllElements();

        Task2 list2_2 = new Task2(1, 2, 3, 6, 7, 8, 11, 12);
        list2_2.printAllElements();

        // Task-3
        Task3 list3_1 = new Task3();
        list3_1.printAllElements();

        Task3 list3_2 = new Task3("aaa", "bbb", "ccc");
        list3_2.printAllElements();

        System.out.println();
        Task3 list3_3 = new Task3("aaa0 aaa1 aaa2", "bbb0 bbb1 bbb22", "ccc0 ccc1 ccc222");
        list3_3.printAllElements();

        //Task-4
        Task4 list4_1 = new Task4(10, 57, 100);
        list4_1.printTotal();

        // Task-5
        Task5 list5_1 = new Task5(55, 17, 9, 75, 25, 33);
        list5_1.printTotal();
    }
}
