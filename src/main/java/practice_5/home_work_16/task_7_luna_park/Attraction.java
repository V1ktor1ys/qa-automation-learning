package practice_5.home_work_16.task_7_luna_park;

public abstract class Attraction {

    private String maintenance = "Not Maintained";

    public abstract void maintain();

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public void checkStatus() {
        System.out.println("The Status of Attraction is \"" + maintenance + "\"");
    }

}
