package practice_2;

/**
 * Создайте класс StudentGroup с полями groupName и studentCount. Реализуйте конструктор, геттеры и сеттеры, и метод
 * printInfo(), выводящий информацию о группе и количестве студентов. В main измените число студентов и выведите информацию.
 */
public class StudentGroup {

    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Group Name: " + groupName + ", Total Students: " + studentCount);
    }
}
