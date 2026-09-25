package practice_4.solvers;

public class IfElseTaskSolver {
    static void main(String[] args) {
        //- - - - - IF-ELSE TASKS: - - - - -

        //Task-1
        System.out.println("- - - Task-1 - - -");
        System.out.println(checkParity(4));
        System.out.println(checkParity(7));

        //Task-2
        System.out.println("- - - Task-2 - - -");
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(70));

        //Task-3
        System.out.println("- - - Task-3 - - -");
        System.out.println(checkMax(3, 5, 7));
        System.out.println(checkMax(7, 3, 5));
        System.out.println(checkMax(5, 7, 3));
    }

    //Задача 1: Проверка четности числа
    //Напишите программу, которая проверяет, является ли введенное число четным или нечетным.
    public static String checkParity(int number) {
        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    //Задача 2: Классификация возраста
    //Программа принимает возраст пользователя и классифицирует его
    public static String checkAge(int age) {
        String ageDescription = "";

        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }

    //Задача 3: Определение наибольшего числа
    //Программа принимает три числа и выводит наибольшее из них.
    public static int checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > max) {
            max = c;
        }
        return max;
    }
}
