
class Ride {
    int number;
    String name;

    Ride(int n, String s) {
        number = n;
        name = s;
    }
}

public class q5_ridePattern {
    public static void main(String[] args) {
        Ride[] rides = {
                new Ride(1, "Roller Coaster"),
                new Ride(2, "Ferris Wheel"),
                new Ride(3, "Bumper Cars"),
                new Ride(4, "Water Ride"),
                new Ride(5, "Haunted House")
        };

        for (int i = 0; i < 5; i++) {
            System.out.print(rides[i].name + ": ");

            for (int j = 0; j < rides[i].number; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
