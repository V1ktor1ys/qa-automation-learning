package practice_5.home_work_16.task_5_farm;

public class Chicken extends Animal implements Producible, Functionable {

    @Override
    public void produce() {
        System.out.println("Chicken is producing Eggs");
    }

    @Override
    public void function() {
        System.out.println("Chicken is eating grain based feed");
    }
}
