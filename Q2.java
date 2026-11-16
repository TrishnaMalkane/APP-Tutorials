
class DeliveryTask extends Thread {
    String activity;

    DeliveryTask(String activity) {
        this.activity = activity;
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority()
                + " Activity: " + activity);
    }
}

public class Q2 {
    public static void main(String[] args) {
        DeliveryTask t1 = new DeliveryTask("Processing Orders");
        DeliveryTask t2 = new DeliveryTask("Tracking Delivery");
        DeliveryTask t3 = new DeliveryTask("Sending Notifications");

        t1.setName("OrderProcessing");
        t2.setName("DeliveryTracking");
        t3.setName("Notification");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
