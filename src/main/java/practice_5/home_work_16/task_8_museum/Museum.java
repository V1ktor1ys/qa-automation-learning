package practice_5.home_work_16.task_8_museum;

import java.time.LocalDateTime;

public class Museum {

    private Exhibit exhibit;
    private String history = "No any history records";

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Exhibit is added to the Luna Park");
    }

    public void storageExhibit() {
        exhibit.store();
        this.history = "Stored since: " + LocalDateTime.now();
    }

    public void storageHistory() {
        System.out.println(history);
    }
}
