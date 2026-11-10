package practice_6.home_work_20.TreeMapTasks;

import java.util.Map;
import java.util.TreeMap;

/**
 * Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
 */

public class Task1 {

    private Map<String, Integer> students;

    public Task1() {
        this.students = new TreeMap<>();
    }

    public void addStudent(String name, Integer score) {
        students.put(name, score);
    }

    public void printAllStudents() {
        System.out.println(students);
    }
}
