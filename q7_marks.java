
class Marks {
    int m1, m2, m3;

    void calculate() {
        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class q7_marks {
    public static void main(String[] args) {
        Marks m = new Marks();

        m.m1 = 80;
        m.m2 = 75;
        m.m3 = 90;

        m.calculate();
    }
}
