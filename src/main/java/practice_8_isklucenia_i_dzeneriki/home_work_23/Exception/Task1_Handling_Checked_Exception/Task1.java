package practice_8_isklucenia_i_dzeneriki.home_work_23.Exception.Task1_Handling_Checked_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
