package practice_3;

/**
 * Создайте класс Company с полями:
 * static String companyName — общее название для всех сотрудников
 * final int employeeID — уникальный идентификатор (нельзя менять)
 * String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и employeeName, статический метод
 * printCompanyName(), геттеры и сеттеры для employeeName. В main: создайте несколько сотрудников, измените companyName
 * и проверьте, что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
 */
public class Company {

    static String companyName = "CompanyName_1";
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    void printEmployee() {
        System.out.println("CompanyName: " + companyName + ", EmployeeID: " + employeeID + ", EmployeeName: " + employeeName);
    }


}
