package practice_5.home_work_16.task_5_farm;

public class Main {
    static void main(String[] args) {

        Farm farm1 = new Farm();

        Animal cow1 = new Cow();
        farm1.setAnimal(cow1);

        farm1.manageAnimal();

        System.out.println("-------------------------------------------------");

        Animal chicken1 = new Chicken();
        farm1.setAnimal(chicken1);

        farm1.manageAnimal();
    }
}
