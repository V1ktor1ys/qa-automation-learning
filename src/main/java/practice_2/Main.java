package practice_2;

public class Main {
     public static void main(String[] args) {

         Student student1 = new Student("Vasya", 18);
         student1.print();

         Student student2 = new Student("Kolya", 20);
         student2.print();

         student1.setName("Vasya-2");
         student1.print();

         student2.setAge(21);
         student2.print();

    }
}
