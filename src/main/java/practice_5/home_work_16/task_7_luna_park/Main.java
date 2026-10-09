package practice_5.home_work_16.task_7_luna_park;

import practice_3.Library;

public class Main {
    static void main(String[] args) {

        LunaPark lunaPark1 = new LunaPark();

        Attraction rollerCoaster1 = new RollerCoaster();
        lunaPark1.addAttraction(rollerCoaster1);

        lunaPark1.maintainAttraction();
        lunaPark1.provideStatus();

        System.out.println("--------------------------------------------------");

        Attraction carousel1 = new Carousel();
        lunaPark1.addAttraction(carousel1);

        lunaPark1.provideStatus();

        System.out.println("--------------------------------------------------");

        lunaPark1.maintainAttraction();
        lunaPark1.provideStatus();
    }
}
