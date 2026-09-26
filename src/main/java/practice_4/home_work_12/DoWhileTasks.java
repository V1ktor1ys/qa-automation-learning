package practice_4.home_work_12;

import java.util.Scanner;

public class DoWhileTasks {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        requestPositiveNumber();

        //Task-2
        System.out.println("- - - Task-2 - - -");
        checkPassword();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        printNumbersFrom1to10();

        //Task-4
        System.out.println("- - - Task-4 - - -");
        stopProgrammByCommand();

        //Task-5
        System.out.println("- - - Task-5 - - -");
        calculateDigitQuantity();

    }

    //Task-1
    public static void requestPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    //Task-2
    public static void checkPassword() {
        String originPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        String password;
        do {
            System.out.print("Enter the Password: ");
            password = scanner.nextLine();
        } while (!password.equals(originPassword));
    }

    //Task-3
    public static void printNumbersFrom1to10() {
        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }

    //Task-4
    public static void stopProgrammByCommand() {
        String exitCommand = "exit";

        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            System.out.print("Enter the Exit Command: ");
            command = scanner.nextLine();
        } while (!command.equals(exitCommand));
    }

    //Task-5
    public static void calculateDigitQuantity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int count = 1;
        do {
            if (number / 10 == 0) {
                break;
            } else {
                number = number / 10;
                count++;
            }
        } while (count <= number);

        System.out.println("Number has " + count + " symbols");
    }

}
