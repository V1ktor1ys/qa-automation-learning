package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    static void main(String[] args) {
        //- - - - - SWITCH TASKS: - - - - -

        //Task-1
        System.out.println("- - - Task-1 - - -");
        System.out.println(dayOfWeek(1));
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(3));
        System.out.println(dayOfWeek(4));
        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(6));
        System.out.println(dayOfWeek(7));
        System.out.println(dayOfWeek(11));

        //Task-2
        System.out.println("- - - Task-2 - - -");
        System.out.println(seasonDescription(Season.WINTER));
        System.out.println(seasonDescription(Season.SPRING));
        System.out.println(seasonDescription(Season.SUMMER));
        System.out.println(seasonDescription(Season.AUTUMN));
    }

    //Задача 1: День недели
    //Напишите программу, которая принимает номер дня недели (1–7) и выводит его название.
    public static String dayOfWeek(int dayNumber) {
        String dayOfWeek = "";

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Wrong number of the week day";
        }
        return dayOfWeek;
    }

    //Задача 2: Работа с сезонами (enum)
    //Создайте enum с названиями сезонов (WINTER, SPRING, SUMMER, AUTUMN). Программа принимает сезон и выводит описание
    public static String seasonDescription(Season season) {
        String seasonDescription = "";

        switch (season) {
            case WINTER -> seasonDescription = "Cold Cold Cold";
            case SPRING -> seasonDescription = "Warm Warm Warm";
            case SUMMER -> seasonDescription = "Hot Hot Hot";
            case AUTUMN -> seasonDescription = "Wet Wet Wet";
        }

        return seasonDescription;
    }

}
