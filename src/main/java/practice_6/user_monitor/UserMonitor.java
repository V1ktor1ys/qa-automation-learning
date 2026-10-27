package practice_6.user_monitor;

import java.util.HashSet;

public class UserMonitor {

    private HashSet<String> sessions;

    public UserMonitor() {
        this.sessions = new HashSet<>();
    }

    public void addSession(String session) {
        sessions.add(session);
    }

    // get access to sessions
    public HashSet<String> getSessions() {
        return this.sessions;
    }

    // print all sessions
    public void printSessions() {
        System.out.println("ALL SESSIONS: ");
        sessions.forEach(System.out::println);
        System.out.println();
    }
}
