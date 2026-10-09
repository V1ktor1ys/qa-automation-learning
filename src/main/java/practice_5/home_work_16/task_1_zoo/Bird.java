package practice_5.home_work_16.task_1_zoo;

public class Bird extends Animal {

    public Bird() {
    }

    @Override
    public void makeSound() {
        System.out.println("The bird is tweeting");
    }

    @Override
    public void move() {
        System.out.println("The bird is flying");
    }
}
