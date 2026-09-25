package practice_4.solvers;

public class ForTaskSolver {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        multiplyTable(5);

        //Task-2
        System.out.println("- - - Task-2 - - -");
        System.out.println(sumAllNumbers(10));

        //Task-3
        System.out.println("- - - Task-3 - - -");
        showSimpleNumbers(1, 100);

    }

    //Задача 1: Таблица умножения
    //Программа выводит таблицу умножения для числа, введенного пользователем.
    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    //Задача 2: Сумма чисел
    //Программа вычисляет сумму всех чисел от 1 до N, где N вводит пользователь.
    public static int sumAllNumbers(int number) {
        int sumAllNumbers = 0;
        for (int i = 1; i <= number; i++) {
            sumAllNumbers = sumAllNumbers + i;
        }
        return sumAllNumbers;
    }

    //Задача 3: Простые числа
    //Программа выводит все простые числа от 1 до 100.
    public static void showSimpleNumbers(int n1, int n2) {
        for (int i = Math.max(n1, 2); i <= n2; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }

}
