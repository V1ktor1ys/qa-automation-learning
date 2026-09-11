package practice_2;

/**
 * Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор, геттеры, сеттер для владельца, методы
 * deposit(amount) и withdraw(amount) и метод printBalance(). В main внесите деньги, снимите и выведите баланс.
 */
public class BankAccount {

    String owner;
    float balance;

    BankAccount(String owner, float balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return owner;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void deposit(float amount) {
        this.balance = balance + amount;
    }

    public void withdraw(float amount) {
        this.balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Account Balance is: " + balance);
    }


}
