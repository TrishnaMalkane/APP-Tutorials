
package patient;

public class Patient {
    private int patientId, age;
    private String name, disease;

    public Patient(int id, String name, String disease, int age) {
        patientId = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Age: " + age);
    }
}
