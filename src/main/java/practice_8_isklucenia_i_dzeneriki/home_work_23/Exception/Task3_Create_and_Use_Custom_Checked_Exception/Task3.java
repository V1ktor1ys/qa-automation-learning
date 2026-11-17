package practice_8_isklucenia_i_dzeneriki.home_work_23.Exception.Task3_Create_and_Use_Custom_Checked_Exception;

public class Task3 {
    static void main(String[] args) {
        User user1 = new User("User1", 151);

        try {
            user1.checkAge();
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
