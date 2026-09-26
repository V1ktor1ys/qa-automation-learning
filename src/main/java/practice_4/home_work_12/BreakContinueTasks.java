package practice_4.home_work_12;

import java.util.Scanner;

public class BreakContinueTasks {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        sumOfAllNumbersUntilNegativeNumberInputted();

        //Task-2
        System.out.println("- - - Task-2 - - -");
        skipNumbersDividedBy3();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        printOnlyPositiveNumbers();

        //Task-4
        System.out.println("- - - Task-4 - - -");
        requestStringsUntilStopCommand();

    }

    //Task-1
    public static void sumOfAllNumbersUntilNegativeNumberInputted() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        while (true) {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();

            if (number < 0) {
                break;
            } else {
                sum = sum + number;
            }

            System.out.println("The SUM of ALL Numbers are: " + sum);
        }
    }

    //Task-2
    public static void skipNumbersDividedBy3() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    //Task-3
    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;
        String resultValue = "";
        while (true) {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println(resultValue);
                continue;
            } else {
                resultValue = resultValue + number + " ";
            }
            System.out.println(resultValue);
        }
    }

    //Task-4
    public static void requestStringsUntilStopCommand() {
        String stopCommand = "stop";

        Scanner scanner = new Scanner(System.in);

        String string = "";
        while (true) {
            System.out.print("Enter the String: ");
            string = scanner.nextLine();

            if (string.equals(stopCommand)) break;
        }
    }

}
