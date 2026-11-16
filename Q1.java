
class HospitalTask extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class Q1 {
    public static void main(String[] args) {
        HospitalTask t1 = new HospitalTask();
        HospitalTask t2 = new HospitalTask();
        HospitalTask t3 = new HospitalTask();

        t1.setName("EmergencyAlert");
        t2.setName("VitalMonitor");
        t3.setName("ReportGenerator");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
