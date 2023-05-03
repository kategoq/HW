package HW4;
import java.util.ArrayList;
public class Director extends Employee {



    public Director (String name, String surname, float workExperienceOf) {
        super(name, surname, Position.DIRECTOR, workExperienceOf);
    }
    public void setJobTitle (String jobTitle) {
        super.jobTitle = jobTitle;

    }
    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
    }

    public float getSalary () {
        return super.getSalary() + this.workers.size() * 200;
    }
    public String toString () {
        String result = super.toString() + "\n";
        for (int i = 0; workers.size()> i; ++i) {
            result = result + "  " + workers.get(i) + "\n";
        }
        return result;
    }



}
