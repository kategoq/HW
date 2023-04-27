package HW4;

public class Person {
    private String name;
    private String surname;

    public Person (String nameOf, String surnameOf) {
        this.name = nameOf;
        this.surname = surnameOf;
    }
    public String getFullName () {
        return this.name + " " + this.surname;
    }

}
