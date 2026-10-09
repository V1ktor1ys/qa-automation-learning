package practice_5.home_work_16.task_2_pet_management;

public class Dog extends Pet {
    @Override
    public void act() {
        System.out.println("The dog is walking");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dry food");
    }
}
