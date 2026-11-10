package practice_6.home_work_20.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
 */

public class Task3 {

    private List<String> strings;

    public Task3() {
        this.strings = new ArrayList<>();
    }

    public Task3(String... strings) {
        this.strings = new ArrayList<>(Arrays.asList(strings));
    }

    public void printAllElements() {
        if (strings.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        System.out.println("The Most Longest String: ");
        String longestString = strings.getFirst();
        for (String string : strings) {
            if (longestString.length() < string.length()) longestString = string;
        }
        System.out.println(longestString);
    }
}
