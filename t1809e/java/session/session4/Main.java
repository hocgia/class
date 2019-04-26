package session4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Test
        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "name" + i;
            String email = "email" + i + "@gmail.com";
            String password = "123";
            User user = new User(name, email, password);
            userArrayList.add(user);
        }
        // Add room
        Room room = new Room("T1809e", "A7", userArrayList);
        // Add user
        User user = new User("addName", "addEmail@gmail.com", "123");
        room.addUser(user);
        // Delete user with index
        room.deleteUser(0);
        // Show room
        room.prinRoom();

    }
}
