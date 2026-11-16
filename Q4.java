
interface Confidential {
}

class Document {
    String name;

    Document(String name) {
        this.name = name;
    }
}

class BankDocument extends Document implements Confidential {
    BankDocument(String name) {
        super(name);
    }
}

class CollegeDocument extends Document {
    CollegeDocument(String name) {
        super(name);
    }
}

class MedicalDocument extends Document implements Confidential {
    MedicalDocument(String name) {
        super(name);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Document[] docs = {
                new BankDocument("Bank Statement"),
                new CollegeDocument("College Notice"),
                new MedicalDocument("Medical Report")
        };

        for (Document d : docs) {
            if (d instanceof Confidential) {
                System.out.println(d.name + " is Confidential");
            } else {
                System.out.println(d.name + " is Not Confidential");
            }
        }
    }
}
