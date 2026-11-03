package practice_6.home_work_20.LinkedHashMapTasks;

import java.util.LinkedHashMap;

/**
 * Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
 */

public class Task1 {

    private LinkedHashMap<String, Integer> contacts;

    public Task1() {
        this.contacts = new LinkedHashMap<>();
    }

    public void addContact(String name, Integer age) {
        contacts.put(name, age);
    }

    public void printAllContacts() {
        System.out.println(contacts);
    }
}
