package practice_4.home_work_12;

import java.util.Scanner;

public class SwitchTasks {
    static void main(String[] args) {

        //Task-1
        System.out.println("- - - Task-1 - - -");
        checkWeekDay();

        //Task-2
        System.out.println("- - - Task-2 - - -");
        checkCinemaPrice();

        //Task-3
        System.out.println("- - - Task-3 - - -");
        transformNumToLetGradeValue();

        //Task-4
        System.out.println("- - - Task-4 - - -");
        processTextCommands();

        //Task-5
        System.out.println("- - - Task-5 - - -");
        simpleCalcUsingSwitch();

    }

    //Task-1
    public static void checkWeekDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("WRONG ENTERED DAY");
        }
    }

    //Task-2
    public static void checkCinemaPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Ticket costs 30$");
                break;
            case 6, 7:
                System.out.println("Ticket costs 45$");
                break;
            default:
                System.out.println("WRONG ENTERED DAY");
        }
    }

    //Task-3
    public static void transformNumToLetGradeValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of your Grade: ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90:
                System.out.println("Your Letter Grade is: A");
                break;
            case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80:
                System.out.println("Your Letter Grade is: B");
                break;
            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70:
                System.out.println("Your Letter Grade is: C");
                break;
            case 69, 68, 67, 65, 64, 63, 62, 61, 60:
                System.out.println("Your Letter Grade is: D");
                break;
            default:
                System.out.println("Your Letter Grade is: F");
        }
    }

    //Task-4
    public static void processTextCommands() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("The system has been launched");
                break;
            case "stop":
                System.out.println("The system has been stopped");
                break;
            case "restart":
                System.out.println("The system has been restated");
                break;
            case "status":
                System.out.println("The status of the system has been requested");
                break;
            default:
                System.out.println("INCORRECT COMMAND");
        }
    }

    //Task-5
    public static void simpleCalcUsingSwitch() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the operator: ");
        String sign = scanner.nextLine();

        switch (sign) {
            case "+":
                System.out.println("The result: " + Math.addExact(number1, number2));
                break;
            case "-":
                System.out.println("The result: " + Math.subtractExact(number1, number2));
                break;
            case "*":
                System.out.println("The result: " + Math.multiplyExact(number1, number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println("The result: " + Math.divideExact(number1, number2));
                } else {
                    System.out.println("ERROR, cannot be divided on 0");
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }

}
