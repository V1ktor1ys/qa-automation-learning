package practice_5.home_work_16.task_4_aquarium;

public class Aquarium {

    SeaAnimal seaAnimal;

    public void addSeaAnimal(SeaAnimal seaAnimal) {
        this.seaAnimal = seaAnimal;
    }

    public void demonstrateSeaAnimal() {
        seaAnimal.move();
    }
}
