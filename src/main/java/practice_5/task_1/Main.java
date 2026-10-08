package practice_5.task_1;

public class Main {

    static void main(String[] args) {

        Transport car1 = new Car();
        Transport plane1 = new Plane();
        Transport ship1 = new Ship();

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.control(car1);
        dispatcher.printTransportDetails(car1);

        dispatcher.control(plane1);
        dispatcher.printTransportDetails(plane1);

        dispatcher.control(ship1);
        dispatcher.printTransportDetails(ship1);
    }
}
