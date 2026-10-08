package practice_5.task_2;

public class Main {
    static void main(String[] args) {

        Product product1 = new Product("Product1", 100, 10);
        Product elektronika1 = new Electronics("Elektronika1", 200, 20);
        Product wmotki1 = new Clothes("Wmotki1", 300, 30);

        Manager menedjer1 = new Manager();

        menedjer1.manage(product1);
        menedjer1.manage(elektronika1);
        menedjer1.manage(wmotki1);

    }
}
