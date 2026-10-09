package practice_5.home_work_16.task_2_pet_management;

public class Main {
    static void main(String[] args) {

        Owner owner = new Owner();

        Pet dog1 = new Dog();

        owner.interactPet(dog1);
        owner.feedPet(dog1);

        Pet cat1 = new Cat();

        owner.interactPet(cat1);
        owner.feedPet(cat1);
    }
}
