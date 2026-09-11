package practice_2;

public class Main {
     public static void main(String[] args) {

//         Student student1 = new Student("Vasya", 18);
//         student1.print();
//
//         Student student2 = new Student("Kolya", 20);
//         student2.print();
//
//         student1.setName("Vasya-2");
//         student1.print();
//
//         student2.setAge(21);
//         student2.print();

         //HW - Task_1
         System.out.println("HW - Task_1");
         Car car1 = new Car("BMW", 2000);
         car1.print();

         car1.setYear(2026);
         car1.print();

         //HW - Task_2
         System.out.println("HW - Task_2");
         Rectangle rectangle1 = new Rectangle(100.5, 100.5);
         System.out.println("Square is: " + rectangle1.calculateArea());

         rectangle1.setWidth(199.99);
         System.out.println("Square is: " + rectangle1.calculateArea());

         //HW - Task_3
         System.out.println("HW - Task_3");
         Book book1 = new Book("Book_1", "Author_1");
         book1.printInfo();

         book1.setAuthor("Author_1_ver2");
         book1.printInfo();

         //HW - Task_4
         System.out.println("HW - Task_4");
         BankAccount bankAccount1 = new BankAccount("Owner_1", 111.11f);
         bankAccount1.printBalance();
         bankAccount1.deposit(222.22f);
         bankAccount1.printBalance();
         bankAccount1.withdraw(200f);
         bankAccount1.printBalance();

         //HW - Task_5
         System.out.println("HW - Task_5");
         Point point1 = new Point(11.1, 22.2);
         point1.print();
         point1.setX(33.3);
         point1.print();

         //HW - Task_6
         System.out.println("HW - Task_6");
         StudentGroup studentGroup1 = new StudentGroup("Group_1", 100);
         studentGroup1.printInfo();
         studentGroup1.setStudentCount(102);
         studentGroup1.printInfo();

         //HW - Task_7
         System.out.println("HW - Task_7");
         Circle circle1 = new Circle(10);
         System.out.println("Area: " + circle1.calculateArea() + "; Circumference: " + circle1.calculateCircumference());
         circle1.setRadius(20);
         System.out.println("Area: " + circle1.calculateArea() + "; Circumference: " + circle1.calculateCircumference());

         //HW - Task_8
         System.out.println("HW - Task_8");
         Teacher teacher1 = new Teacher("Teacher_1", "Subject_1");
         teacher1.printInfo();
         teacher1.setSubject("Subject_1_ver2");
         teacher1.printInfo();

         //HW - Task_9
         System.out.println("HW - Task_9");
         Product product1 = new Product("Product_1", 100.5);
         product1.printInfo();
         product1.applyDiscount(50);
         product1.printInfo();

         //HW - Task_10
         System.out.println("HW - Task_10");
         Laptop laptop1 = new Laptop("Brand_1", 999.9);
         laptop1.printInfo();
         laptop1.setPrice(888.80);
         laptop1.printInfo();

    }
}
