package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        printAllValuesFrom1to10();

        //Task-2
        System.out.println("\n- - - Task-2 - - -");
        commandReader();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        System.out.println(sumOfAllDigits(123));
        System.out.println(sumOfAllDigits(111011));
        System.out.println(sumOfAllDigits(555));

    }

    //Задача 1: Счётчик
    //Программа выводит числа от 1 до 10 с использованием цикла while.
    public static void printAllValuesFrom1to10() {
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    //Задача 2: Ввод до выхода
    //Программа принимает ввод пользователя до тех пор, пока он не введет "exit".
    public static void commandReader() {
        String command = "";

        Scanner scanner = new Scanner(System.in);

        while (!command.equals("exit")) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }

        System.out.println("Программа завершена.");
    }

    //Задача 3: Сумма цифр числа
    //Программа вычисляет сумму цифр числа, введенного пользователем.
    public static int sumOfAllDigits(int number) {
        // number = 123, 1 + 2 + 3
        // остаток от деления на 10: 123 % 10 = 3
        // 123 / 10 = 12
        // остаток от деления на 10: 12 % 10 = 2
        // 12 / 10 = 1
        // остаток от деления на 10: 1 % 10 = 1
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

}
