package practice_6.home_work_20.HashMapTasks;

public class Main {
    static void main(String[] args) {

        // Task-1
        Task1 list1 = new Task1();
        list1.addContact("aaa", 111);
        list1.printAllContacts();
        list1.addContact("bbb", 222);
        list1.printAllContacts();
        list1.addContact("ccc", 333);
        list1.printAllContacts();

        // Task-2
        Task2 list2 = new Task2();
        list2.addContact("aaa", 111);
        list2.checkContactPresence("bbb");
        list2.checkContactPresence("aaa");
    }
}
