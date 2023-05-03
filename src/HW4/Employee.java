package HW4;

import java.util.ArrayList;

public abstract class Employee extends Person {
    private Position position;
    protected String jobTitle;
    private float coefficient;
    private float workExperience;
    protected float baseRate;
    protected ArrayList<Employee> workers;
    protected float fines;
    private Employee boss;


    public Employee(String name, String surname, Position positionOf, float workExperienceOf) {
        super(name,surname);
        this.position = positionOf;
        this.coefficient = positionOf.coefficient;
        this.workExperience = workExperienceOf;
        this.baseRate = positionOf.basic;
        this.workers = new ArrayList<Employee>();
    }
    public Employee getBoss() {
        return this.boss;
    }
    public abstract void setJobTitle (String jobTitle);
    public void addFine(float sum) {
        this.fines = this.fines + sum;

    }

    public void addWorker(Employee worker) {
        this.workers.add(worker);
        worker.boss = this;

    }

    public float getSalary () {
        return this.baseRate * this.workExperience * this.coefficient - this.fines;
    }
    public String toString () {
        String strPosition = "";
        if (this.position == Position.DIRECTOR) {
            strPosition = "Director";
        } else if (this.position == Position.WORKER) {
            strPosition = "Worker";
        }

        return strPosition + " " + super.getFullName() + " " + this.workExperience + " " + this.jobTitle + " " + this.getSalary();
    }
}
