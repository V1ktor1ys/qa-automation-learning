package practice_5.home_work_16.task_8_museum;

public class Main {
    static void main(String[] args) {

        Museum museum1 = new Museum();

        Exhibit ancientManuscript1 = new AncientManuscript();

        museum1.addExhibit(ancientManuscript1);
        museum1.storageHistory();

        museum1.storageExhibit();
        museum1.storageHistory();

        System.out.println("----------------------------------------------");

        Exhibit sculpture1 = new Sculpture();

        museum1.addExhibit(sculpture1);
        museum1.storageExhibit();
        museum1.storageHistory();
    }
}
