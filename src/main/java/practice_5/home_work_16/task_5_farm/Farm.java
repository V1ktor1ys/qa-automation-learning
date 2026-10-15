package practice_5.home_work_16.task_5_farm;

public class Farm {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        animal.manage();
    }
}
