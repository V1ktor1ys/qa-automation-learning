package practice_2;

public class Student {

    //Fields
    String name;
    int age;

    //Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getters
    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    //Setters
    void setName(String newName) {
        this.name = newName;
    }

    void setAge(int newAge) {
        this.age = newAge;
    }

    void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
