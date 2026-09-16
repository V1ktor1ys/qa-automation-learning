package practice_3;

/**
 * Создайте класс Person с полями:
 * private String firstName
 * private String lastName
 * private final String ssn — номер социального страхования
 * Реализуйте конструктор для всех трёх полей, геттеры для всех полей,
 * сеттеры только для firstName и lastName, метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
 * В main: создайте несколько объектов, измените имя у одного и выведите информацию.
 */
public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return  this.ssn;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }

}
