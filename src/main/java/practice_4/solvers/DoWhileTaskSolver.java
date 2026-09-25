package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        guessNumber(5);

        //Task-2
        System.out.println("- - - Task-2 - - -");
        findMinimumValue();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        checkCredentials();

    }

    //Задача 1: Угадай число
    //Программа загадывает случайное число от 1 до 100. Пользователь угадывает число, пока не угадает правильно.
    public static void guessNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(bound);

        int number;
        do {
            System.out.print("Угадайте число: ");
            number = scanner.nextInt();
        } while (number != randomNumber);
        System.out.println("УСПЕХ! Рандомное число: " + randomNumber + ", Ваше число: " + number);
    }

    //Задача 2: Минимум вводимых чисел
    //Программа просит вводить числа, пока пользователь не введет отрицательное число. Выводится минимальное из введенных чисел.
    public static void findMinimumValue() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int minNumber = 2147483647;
        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < minNumber && number >= 0) minNumber = number;
        } while (number >= 0);

        System.out.println("Минимальное число: " + minNumber);
    }

    //Задача 3: Авторизация
    //Программа запрашивает логин и пароль, пока не будут введены верные данные.
    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.print("Введите логин: ");
            login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Доступ разрешен.");
    }

}
