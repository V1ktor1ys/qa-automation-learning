package practice_3;

public class Main {

    static void main(String[] args) {

        System.out.println(Student.studentCount);

        Student student1 = new Student("Student_1", 18);

        System.out.println(Student.studentCount);

        Student student2 = new Student("Student_2", 20);

        System.out.println(Student.studentCount);

        Student.printMaxYears();



    }
}
