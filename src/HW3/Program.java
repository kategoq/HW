package HW3;

public class Program{

    public static void main(String[] args) {

        Person chelovek1 = new Employee("Sam", "Leman Brothers");
        Person chelovek2 = new Client("Bob", "Leman Brothers");
    }
}
abstract class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public abstract void display();
}

class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

class Client extends Person
{
    private String bank;

    public Client(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
