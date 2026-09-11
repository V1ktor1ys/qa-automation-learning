package practice_2;

/**
 * Создайте класс Teacher с полями name и subject. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
 * выводящий информацию о учителе и предмете. В main измените предмет и выведите обновлённую информацию.
 */
public class Teacher {

    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject);
    }

}
