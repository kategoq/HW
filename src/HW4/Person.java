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
    public boolean equals (Object o) {
        Person w = (Person) o;
        return w.name.equals(this.name) && w.surname.equals(this.surname);
    }

}
