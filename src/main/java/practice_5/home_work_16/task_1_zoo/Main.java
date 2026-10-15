package practice_5.home_work_16.task_1_zoo;

public class Main {
    static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal elephant1 = new Elephant();
        zoo.addAnimal(elephant1);
        zoo.demonstrateAnimal();

        Animal bird1 = new Bird();
        zoo.addAnimal(bird1);
        zoo.demonstrateAnimal();
    }
}
