package practice_4.home_work_12;

import java.util.Scanner;

public class ForTasks {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        printValuesDividedOn3();

        //Task-2
        System.out.println("- - - Task-2 - - -");
        sumOfAllValues();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        multiplicationTable();

        //Task-4
        System.out.println("- - - Task-4 - - -");
        checkNumberIsPrime();

        //Task-5
        System.out.println("- - - Task-5 - - -");
        printValuesFrom1To10();

    }

    //Task-1
    public static void printValuesDividedOn3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Task-2
    public static void sumOfAllValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the MAX number: ");
        int number = scanner.nextInt();

        int sumNumber = 0;
        for (int i = 1; i <= number; i++) {
            sumNumber = sumNumber + i;
        }
        System.out.println("The SUM of All Values from 1 to " + number + " is: " + sumNumber);
    }

    //Task-3
    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    //Task-4
    public static void checkNumberIsPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number " + number + " is a Prime Number");
        } else {
            System.out.println("Number " + number + " is NOT a Prime Number");
        }
    }

    //Task-5
    public static void printValuesFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}
