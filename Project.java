package Behavioral_patterns;

import java.util.ArrayList;

public class Project {
    private ArrayList<String> usernames;

    public Project(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

    public void processUserList() {
        for (int i = 0; i < usernames.size(); i++) {
            String username = usernames.get(i);
            System.out.println("Processing user: " + username);
        }
    }
    private void processUser(String username) {
        System.out.println("Processing user: " + username);
        if (username.contains("admin")) {
            handleAdminUser(username);
        }
    }

    private void handleAdminUser(String username) {
        System.out.println("Admin user detected!");
    }


    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("admin");
        usernames.add("user2");
        usernames.add("admin3");

        Project processor = new Project(usernames);
        processor.processUserList();
        processor.processUser( "admin");
    }
}
