package practice_5.home_work_16.task_7_luna_park;

public class RollerCoaster extends Attraction {

    @Override
    public void maintain() {
        System.out.println("Roller Coaster is maintaining (regular safety inspections)");
        setMaintenance("Maintained");
    }
}
