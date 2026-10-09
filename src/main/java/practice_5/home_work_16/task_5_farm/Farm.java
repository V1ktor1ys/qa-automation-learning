package practice_5.home_work_16.task_5_farm;

public class Farm {

    Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        if (animal instanceof Producible producible) {
            producible.produce();
        }

        if (animal instanceof Functionable functionable) {
            functionable.function();
        }
    }
}
