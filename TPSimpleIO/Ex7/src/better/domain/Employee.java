package better.domain;

import java.io.Serializable;

public abstract class Employee implements Serializable {

    private static String NAME_PATTERN = "%s %s %s";
    protected String firstname;
    private String lastname;
    private int age;
    private String entryYear;


    public Employee(String firstname, String lastname, int age, String entryYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.entryYear = entryYear;
    }

    public abstract double calculerSalaire();
    public abstract String getPosition();

    public String getName() {
        return String.format(NAME_PATTERN, getPosition(), firstname, lastname);
    }

    public String getInfo(){
        return String.format("%s, %s, %d, %s, %s", firstname, lastname, age, entryYear,this.getClass());
    }
}
