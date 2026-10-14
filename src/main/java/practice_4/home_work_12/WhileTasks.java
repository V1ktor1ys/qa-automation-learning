package practice_4.home_work_12;

import java.util.Scanner;

public class WhileTasks {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        calculateFactorial();

        //Task-2
        System.out.println("- - - Task-2 - - -");
        printEvenNumbers();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        printCountdownValues();

    }

    //Task-1
    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= number) {
            result *= i; //result = result * i
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + result);
    }

    //Task-2
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    //Task-3
    public static void printCountdownValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.print(number + " ");
            number--;
        }
    }

}
