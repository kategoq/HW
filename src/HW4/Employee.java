package HW4;

public abstract class Employee extends Person {
    private Position position;
    protected String jobTitle;
    private float coefficient;
    private float workExperience;

    private float baseRate;

    public Employee(String name, String surname, Position positionOf, float coefficientOf, float workExperienceOf,float baseRateOf) {
        super(name,surname);
        this.position = positionOf;
        this.coefficient = coefficientOf;
        this.workExperience = workExperienceOf;
        this.baseRate = baseRateOf;
    }
    public abstract void setJobTitle (String jobTitle);

    public float getSalary () {
        return this.baseRate * this.workExperience * this.coefficient;
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
