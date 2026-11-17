package practice_8_isklucenia_i_dzeneriki.home_work_23.Exception.Task2_Handling_Unchecked_Exception;

public class Task2 {
    static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.divide(10, 2);
    }

    public void divide(int a, int b) {
        if (b != 0) System.out.println(a / b);
        else System.out.println("Cannot divide by zero");
    }
}
