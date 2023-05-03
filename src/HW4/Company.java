package HW4;

import java.util.ArrayList;

public class Company implements IEmployeeSearchable {
    private ArrayList<Employee> staff;

    public Company() {
        this.staff = new ArrayList<Employee>();
    }
    public void addStaff(Employee worker) {
        this.staff.add(worker);

    }
    public void hire (Employee worker) {
        this.staff.remove(worker);
    }
    public Employee findByName(String name, String surname) {
        String fullName = name + " " + surname;
        for (int i =0; this.staff.size()>i; ++i) {
            Employee worker = this.staff.get(i);
            if (worker.getFullName().equals(fullName)) {
                return worker;
            }
        }
        return null;
    }
    public static void main (String[] args) {
        Company company = new Company();

        Director director = new Director("Sergey", "Davidov", 5);
        Director zamDirector = new Director("Nasty", "Berezina", 5);
        Employee worker = new Worker("Ruslan", "Dudkevich", 2);
        Employee worker2 = new Worker("Vadim", "Haritonov", 2);
        Employee worker3 = new Worker("Sasha", "Mlynarchik",2);
        Servant servant1 = new Servant("Vasia", "Malinka", 20);
        Servant servant2 = new Servant("Frosya", "Klubnichka", 0.5f);


        worker.setJobTitle("Главный инженер");
        worker2.setJobTitle("Прораб");
        worker3.setJobTitle("Рабочий");
        director.setJobTitle("Директор");
        zamDirector.setJobTitle("Замдиректоp");
        servant1.setJobTitle("Дворник");
        servant2.setJobTitle("Стажер");

        company.addStaff(worker);
        company.addStaff(worker2);
        company.addStaff(worker3);
        company.addStaff(director);
        company.addStaff(zamDirector);
        company.addStaff(servant1);
        company.addStaff(servant2);

        worker.addWorker(worker2);
        worker2.addFine(400);
        company.hire(worker2);

        System.out.println(director.getFullName() + " " + director.getSalary());
        System.out.println(worker.getFullName() + " " + worker.getSalary());
        System.out.println(worker2.getFullName() + " " + worker2.getSalary());
        System.out.println(worker3.getFullName() + " " + worker3.getSalary());

        director.addWorker(worker2);
        director.addWorker(worker3);

        System.out.println(director);

        zamDirector.addWorker(worker);
        director.addWorker(zamDirector);

        System.out.println(director);

        Employee found = company.findByName("Sasha", "Mlynarchik");
        if (found != null) {
            Employee boss = found.getBoss();
            if (boss != null) {
                System.out.println(found.getFullName() + " в подчинении у " + boss.getFullName());
            } else {
                System.out.println(found.getFullName() + " найден");
            }
        }

    }


}
