package HW4;

import java.util.ArrayList;

public class Worker extends Employee {

    public Worker (String name, String surname, float coefficientOf, float workExperienceOf, float baseRateOf) {
        super(name, surname, Position.WORKER, coefficientOf, workExperienceOf, baseRateOf);
    }

    public void setJobTitle (String jobTitle) {
        super.jobTitle = jobTitle;

    }

}
