package HW4;
import java.util.ArrayList;
public class Director extends Employee {
    private ArrayList<Employee> workers;

    public Director (String name, String surname, float coefficientOf, float workExperienceOf, float baseRateOf) {
        super(name, surname, Position.DIRECTOR, coefficientOf, workExperienceOf, baseRateOf);
        this.workers = new ArrayList<Employee>();
    }
    public void setJobTitle (String jobTitle) {
        super.jobTitle = jobTitle;

    }
    public void addWorker(Employee worker) {
        this.workers.add(worker);

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
