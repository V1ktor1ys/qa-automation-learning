package practice_6.home_work_20.HashMapTasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Проверьте, есть ли определённое имя в HashMap.
 */

public class Task2 {

    private Map<String, Integer> contacts;

    public Task2() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Integer age) {
        contacts.put(name, age);
    }

    public void printAllContacts() {
        System.out.println(contacts);
    }

    public void checkContactPresence(String name) {
        if (contacts.containsKey(name)) System.out.println("The \"" + name + "\" is present in the list.");
        else System.out.println("The \"" + name + "\" is NOT present in the list.");
    }
}
