package practice_5.home_work_16.task_1_zoo;

public class Zoo {

    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void demonstrateAnimal() {
        animal.makeSound();
        animal.move();
    }
}
