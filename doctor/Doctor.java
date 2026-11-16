
package doctor;

public class Doctor {
    private int doctorId;
    private String name, specialization;
    private double consultationFee;

    public Doctor(int id, String name, String specialization, double fee) {
        doctorId = id;
        this.name = name;
        this.specialization = specialization;
        consultationFee = fee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void display() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Fee: " + consultationFee);
    }
}
