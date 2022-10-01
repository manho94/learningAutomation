package features.elements;

public class Person {
    private final String LASTNAME;
    private final String FIRSTNAME;
    private final String EMAIL;
    private final float DUE;
    private final String WEBSITE;

    public Person(String lastname, String firstname, String email, float due, String website) {
        LASTNAME = lastname;
        FIRSTNAME = firstname;
        EMAIL = email;
        DUE = due;
        WEBSITE = website;
    }


    public String getLASTNAME() {
        return LASTNAME;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public float getDUE() {
        return DUE;
    }

    public String getWEBSITE() {
        return WEBSITE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "LASTNAME='" + LASTNAME + '\'' +
                ", FIRSTNAME='" + FIRSTNAME + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", DUE=" + DUE +
                ", WEBSITE='" + WEBSITE + '\'' +
                '}';
    }
}
