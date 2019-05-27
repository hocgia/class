import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input an integer number.");
        int i = new Scanner(System.in).nextInt();
        Countdown countdown = new Countdown();
        countdown.setI(i);
        countdown.start();
    }
}
