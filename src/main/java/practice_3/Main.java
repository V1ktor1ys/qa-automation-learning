package practice_3;

public class Main {

    static void main(String[] args) {

//        System.out.println(Student.studentCount);
//        Student student1 = new Student("Student_1", 18);
//        System.out.println(Student.studentCount);
//        Student student2 = new Student("Student_2", 20);
//        System.out.println(Student.studentCount);
//        Student.printMaxYears();

        //Task-1
        Company.printCompanyName();
        Company employee1 = new Company(1, "EmployeeName_1");
        employee1.printEmployee();
        Company employee2 = new Company(2, "EmployeeName_2");
        employee2.printEmployee();
        Company.companyName = "CompanyName_2";
        Company.printCompanyName();
        employee1.printEmployee();
        employee2.printEmployee();

        //Task-2
        double square1 = MathConstants.calculateCircleArea(10);
        System.out.println(square1);
        double square2 = MathConstants.calculateCircleArea(20);
        System.out.println(square2);
        double circumference1 = MathConstants.calculateCircumference(10);
        System.out.println(circumference1);
        double circumference2 = MathConstants.calculateCircumference(20);
        System.out.println(circumference2);
        double exponentialGrowth1 = MathConstants.calculateExponentialGrowth(10, 2, 5);
        System.out.println(exponentialGrowth1);
        double exponentialGrowth2 = MathConstants.calculateExponentialGrowth(20, 4, 10);
        System.out.println(exponentialGrowth2);

        //Task-4
        University student1 = new University(1, "StudentName_1");
        University student2 = new University(2, "StudentName_2");
        University student3 = new University(3, "StudentName_3");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("NewUniversityName");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        //Task-5
        GameSettings game1 = new GameSettings("GameName1");
        GameSettings game2 = new GameSettings("GameName2");
        game1.printGameStatus();
        game2.printGameStatus();
        GameSettings.setMaxPlayers(100);
        game1.printGameStatus();
        game2.printGameStatus();
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        //Task-6
        Person person1 = new Person("FirstName_1", "LastName_1", "111-11-1111");
        Person person2 = new Person("FirstName_2", "LastName_2", "222-22-2222");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person1.setFirstName("FirstName_1_ver2");
        person1.setLastName("LastName_1_ver2");
        person1.printPersonInfo();
        person2.printPersonInfo();

    }
}
