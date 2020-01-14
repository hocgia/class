package mainthread;

import entity.Game;

public class MainThread {

    public static void main(String[] args) {
        System.out.println("Nhap thong tin game");
        Game game1 = new Game("mario", "action game", 12, "12/12/2010", "game1.com");
        Game game2 = new Game("rambo", "easy game", 12, "12/12/2010", "game1.com");
        System.out.println(game1);
        System.out.println(game2);
    }
}
