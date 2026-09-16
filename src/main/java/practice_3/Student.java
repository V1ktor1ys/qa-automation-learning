package practice_3;

public class Student {

    final static int MAX_YEARS = 111;
    static int studentCount;

    static {
        studentCount = 0;
    }

    String name;
    int age;

    Student(String someName, int someAge) {
        this.name = someName;
        this.age = someAge;

        studentCount++;
    }

    static void printMaxYears() {
        System.out.println(MAX_YEARS);
    }
}
