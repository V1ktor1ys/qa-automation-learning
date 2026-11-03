package practice_6.home_work_20.HashMapTasks;

import java.util.HashMap;

/**
 * Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
 */

public class Task1 {

    private HashMap<String, Integer> contacts;

    public Task1() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Integer age) {
        contacts.put(name, age);
    }

    public void printAllContacts() {
        System.out.println(contacts);
    }
}
