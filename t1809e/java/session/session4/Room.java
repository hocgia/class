package session4;

import java.util.ArrayList;

public class Room {
    private String name;
    private String location;
    private ArrayList<User> userArrayList = new ArrayList<>();

    public Room() {
    }

    public Room(String name, String location, ArrayList<User> userArrayList) {
        this.name = name;
        this.location = location;
        this.userArrayList = userArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public void addUser(User user){
        this.userArrayList.add(user);
    }

    public void deleteUser(int index){
        this.userArrayList.remove(index);
    }

    public void prinRoom(){
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("List User:");
        for (User user: this.userArrayList) {
            user.showUser();
        }
    }
}
