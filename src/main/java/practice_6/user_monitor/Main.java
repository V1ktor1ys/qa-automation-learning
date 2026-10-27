package practice_6.user_monitor;

public class Main {
    static void main(String[] args) {

        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addSession("AAAAA");
        userMonitor.addSession("AAAAA");
        userMonitor.addSession("AAAAA");
        userMonitor.addSession("BBBBB");
        userMonitor.addSession("BBBBB");
        userMonitor.addSession("CCCCC");
        userMonitor.addSession("AAAAA");
        userMonitor.addSession("AAAAA");
        userMonitor.addSession("AAAAA");

        userMonitor.printSessions();

        System.out.println(userMonitor.getSessions());
    }
}
