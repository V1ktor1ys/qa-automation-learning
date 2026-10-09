package practice_5.home_work_16.task_6_botanical_garden;

public class Garden {

    Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void carePlant() {
        plant.care();
    }
}
