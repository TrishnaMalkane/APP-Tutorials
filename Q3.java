
interface BasicSecurity {
    void login();

    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprint();

    void faceRecognition();
}

class BankingApplication implements AdvancedSecurity {
    public void login() {
        System.out.println("Login successful");
    }

    public void logout() {
        System.out.println("Logged out successfully");
    }

    public void fingerprint() {
        System.out.println("Fingerprint verified");
    }

    public void faceRecognition() {
        System.out.println("Face recognition successful");
    }
}

public class Q3 {
    public static void main(String[] args) {
        BankingApplication b = new BankingApplication();

        b.login();
        b.fingerprint();
        b.faceRecognition();
        b.logout();
    }
}
