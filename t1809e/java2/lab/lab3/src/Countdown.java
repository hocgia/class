public class Countdown extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Start countdown.");
            int minus = 10;
            minus--;
            while (minus >= 0) {
                for (int j = 59; j >= 0; j--) {
                    Thread.sleep(150);
                    System.out.printf("%02d.%02d\n", minus, j);
                }
                minus--;
            }
            System.out.println("Congratulations!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
