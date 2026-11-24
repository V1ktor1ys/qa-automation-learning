package practice_8_isklucenia_i_dzeneriki.home_work_23.Generics.Task2_Generic_Method;

public class Task2 {
    static void main(String[] args) {
        Integer[] numbers = {10, 15, 25};
        String[] strings = {"aaa", "bbb", "ccc"};

        Task2 task2 = new Task2();
        task2.printArray(numbers);
        task2.printArray(strings);
    }

    public <T> void printArray(T[] t) {
        for (T value : t) System.out.println(value);
    }
}
