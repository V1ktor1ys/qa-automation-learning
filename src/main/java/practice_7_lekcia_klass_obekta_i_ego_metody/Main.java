package practice_7_lekcia_klass_obekta_i_ego_metody;

public class Main {
    static void main(String[] args) throws CloneNotSupportedException {

        // Create & Print 1st Person (person1)
        Person person1 = new Person("AAA", 111);
        System.out.println(person1);

        // Print info about Class for person1 object
        System.out.println(person1.getClass());

        // Create & Print 2nd Person (person2)
        Person person2 = new Person("AAA", 111);
        System.out.println(person2);

        // Print the result of comparing two objects (person1 and person2)
        System.out.println(person1.equals(person2));

        // Create & Print a clone of person1
        Person clonePerson1 = person1.clone();
        System.out.println(clonePerson1);

        // Print the result of comparing two objects (person1 and clonePerson1)
        System.out.println(person1.equals(clonePerson1));
    }
}
