
class Traffic extends Thread {
    String status;
    int delay;

    Traffic(String status, int delay) {
        this.status = status;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + status);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Traffic t1 = new Traffic("Heavy Traffic", 1000);
        Traffic t2 = new Traffic("Moderate Traffic", 1500);
        Traffic t3 = new Traffic("Light Traffic", 2000);

        t1.setName("Junction 1");
        t2.setName("Junction 2");
        t3.setName("Junction 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
