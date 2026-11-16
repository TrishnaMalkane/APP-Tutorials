
import doctor.Doctor;
import patient.Patient;

public class Q2 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1, "Ravi", "Cardiology", 500);
        Doctor d2 = new Doctor(2, "Priya", "Dermatology", 400);

        Patient[] patients = {
                new Patient(101, "Arun", "Heart Problem", 45),
                new Patient(102, "Bala", "Skin Allergy", 25),
                new Patient(103, "Charan", "Heart Problem", 50)
        };

        int count1 = 0, count2 = 0;

        for (Patient p : patients) {
            p.display();

            if (p.getDisease().equals("Heart Problem")
                    && d1.getSpecialization().equals("Cardiology")) {
                d1.display();
                count1++;
            } else if (p.getDisease().equals("Skin Allergy")
                    && d2.getSpecialization().equals("Dermatology")) {
                d2.display();
                count2++;
            }

            System.out.println();
        }

        System.out.println("Total fee collected by Doctor Ravi: "
                + count1 * d1.getConsultationFee());

        System.out.println("Total fee collected by Doctor Priya: "
                + count2 * d2.getConsultationFee());
    }
}
