public class Countdown extends Thread {
    private int i ;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        try {
            System.out.println("Start countdown.");
            while (true) {
                System.out.println(++i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
