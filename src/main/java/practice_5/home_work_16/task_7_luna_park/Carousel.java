package practice_5.home_work_16.task_7_luna_park;

public class Carousel extends Attraction {
    @Override
    public void maintain() {
        System.out.println("Carousel is maintaining (frequent maintenance)");
        setMaintenance("Maintained");
    }
}
