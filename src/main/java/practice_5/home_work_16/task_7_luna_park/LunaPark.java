package practice_5.home_work_16.task_7_luna_park;

public class LunaPark {

    Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Attraction is added to the Luna Park");
    }

    public void maintainAttraction() {
        attraction.maintain();
    }

    public void provideStatus() {
        attraction.checkStatus();
    }
}
