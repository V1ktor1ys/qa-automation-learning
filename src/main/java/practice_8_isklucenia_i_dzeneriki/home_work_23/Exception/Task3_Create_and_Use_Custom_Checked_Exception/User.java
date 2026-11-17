package practice_8_isklucenia_i_dzeneriki.home_work_23.Exception.Task3_Create_and_Use_Custom_Checked_Exception;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void checkAge() throws CustomCheckedException {
        if (age < 0 || age > 150) throw new CustomCheckedException("User has an invalid user's age");
        else System.out.println("User has a valid age: " + age);
    }
}
