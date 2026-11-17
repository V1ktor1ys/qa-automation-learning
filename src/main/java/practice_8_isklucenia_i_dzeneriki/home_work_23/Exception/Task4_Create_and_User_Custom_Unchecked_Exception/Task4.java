package practice_8_isklucenia_i_dzeneriki.home_work_23.Exception.Task4_Create_and_User_Custom_Unchecked_Exception;

public class Task4 {
    static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.validateEmailFormat("validEmail@gmail.com");
        task4.validateEmailFormat("invalidEmail@gmail");
    }

    public void validateEmailFormat(String email) {
        if (!email.matches(".+@.+\\..+")) throw new CustomUncheckedException("Email is NOT Valid!!!");
        else System.out.println("Email is Valid!!!");
    }
}
