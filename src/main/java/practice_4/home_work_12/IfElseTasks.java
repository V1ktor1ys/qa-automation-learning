package practice_4.home_work_12;

import java.util.Scanner;

public class IfElseTasks {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        checkNumberSign();

        //Task-2
        System.out.println("- - - Task-2 - - -");
        findBiggestFromTwoNumbers();
        //Task-2 ver2
        System.out.println("- - - Task-2 ver2 - - -");
        findBiggestFromTwoNumbersVer2();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        printRateDescription();

        //Task-4
        System.out.println("- - - Task-4 - - -");
        checkEvenOrOddOfTheNumber();

        //Task-5
        System.out.println("- - - Task-5 - - -");
        checkDiscount();

        //Task-6
        System.out.println("- - - Task-6 - - -");
        checkTestResult();

    }

    //Task-1
    public static void checkNumberSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negavite");
        } else {
            System.out.println("Number is equal to zero");
        }
    }

    //Task-2
    public static void findBiggestFromTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fist number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) System.out.println("The Biggest Number is: " + number1);
        else if (number1 < number2) System.out.println("The Biggest Number is: " + number2);
        else System.out.println("Numbers are equal");
    }

    //Task-2 ver2
    public static void findBiggestFromTwoNumbersVer2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fist number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();

        int biggestNumber = Math.max(number1, number2);
        System.out.println("The Biggest Number is: " + biggestNumber);
    }

    //Task-3
    public static void printRateDescription() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (number) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2, 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("ERROR INPUT VALUE");
        }
    }

    //Task-4
    public static void checkEvenOrOddOfTheNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number is EVEN value");
        } else {
            System.out.println("Entered number is ODD value");
        }
    }

    //Task-5
    public static void checkDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Your discount is 25%");
        } else if (age > 65) {
            System.out.println("Your discount is 30%");
        } else {
            System.out.println("You don't have any discounts :(");
        }
    }

    //Task-6
    public static void checkTestResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Test Score: ");
        int testScore = scanner.nextInt();

        if (testScore >= 90) {
            System.out.println("Отлично");
        } else if (testScore >= 75 && testScore <= 89) {
            System.out.println("Хорошо");
        } else if (testScore >= 60 && testScore <= 74) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

}
