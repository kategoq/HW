package HW4;

public class Servant extends Employee {
    public Servant (String name, String surname, float workExperienceOf) {
        super(name, surname, Position.SERVANTS, workExperienceOf);
    }

    public void setJobTitle (String jobTitle) {
        super.jobTitle = jobTitle;

    }

    public float getSalary () {
        return this.baseRate - this.fines;
    }
}
