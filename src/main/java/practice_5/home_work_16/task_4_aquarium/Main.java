package practice_5.home_work_16.task_4_aquarium;

public class Main {
    static void main(String[] args) {

        Aquarium aquarium1 = new Aquarium();

        SeaAnimal shark1 = new Shark();
        aquarium1.addSeaAnimal(shark1);

        aquarium1.demonstrateSeaAnimal();

        SeaAnimal starFish1 = new StarFish();
        aquarium1.addSeaAnimal(starFish1);

        aquarium1.demonstrateSeaAnimal();
    }
}
