
import java.util.Scanner;
import java.util.Arrays;

class Candidate {
    int Candidate_Id;
    String name;
    int aptitude, technical, communication;

    Candidate(int id, String n, int a, int t, int c) {
        Candidate_Id = id;
        name = n;
        aptitude = a;
        technical = t;
        communication = c;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class q6_topCandidates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Candidate[] c = new Candidate[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int a = sc.nextInt();
            int t = sc.nextInt();
            int cm = sc.nextInt();

            c[i] = new Candidate(id, name, a, t, cm);
        }

        Arrays.sort(c, (a, b) -> {
            if (a.getTotalScore() != b.getTotalScore())
                return Integer.compare(b.getTotalScore(), a.getTotalScore());

            return Integer.compare(a.Candidate_Id, b.Candidate_Id);
        });

        for (int i = 0; i < k; i++) {
            System.out.println(c[i].Candidate_Id + " " +
                    c[i].name + " " +
                    c[i].getTotalScore());
        }

        sc.close();
    }
}
