package practice_5.home_work_16.task_1_zoo;

public class Elephant extends Animal {

    public Elephant() {
    }

    @Override
    public void makeSound() {
        System.out.println("The elephant is trumpeting");
    }

    @Override
    public void move() {
        System.out.println("The elephant is walking");
    }
}
