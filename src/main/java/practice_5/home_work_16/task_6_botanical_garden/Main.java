package practice_5.home_work_16.task_6_botanical_garden;

public class Main {
    static void main(String[] args) {

        Garden garden1 = new Garden();

        Plant orchid1 = new Orchid();
        garden1.addPlant(orchid1);

        garden1.carePlant();

        System.out.println("---------------------------------------");

        Plant cactus1 = new Cactus();
        garden1.addPlant(cactus1);

        garden1.carePlant();
    }
}
