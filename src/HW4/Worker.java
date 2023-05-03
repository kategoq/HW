package HW4;

import java.util.ArrayList;

public class Worker extends Employee {

    public Worker (String name, String surname, float workExperienceOf) {
        super(name, surname, Position.WORKER, workExperienceOf);
    }

    public void setJobTitle (String jobTitle) {
        super.jobTitle = jobTitle;

    }

}
