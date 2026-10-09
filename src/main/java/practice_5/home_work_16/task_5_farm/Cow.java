package practice_5.home_work_16.task_5_farm;

public class Cow extends Animal implements Producible, Functionable {

    @Override
    public void produce() {
        System.out.println("Cow is producing Milk");
    }

    @Override
    public void function() {
        System.out.println("Cow is walking on the grace");
    }
}
