package HW4;

public class Company {
    public static void main (String[] args) {
        Director director = new Director("Sergey", "Davidov", 5, 15,350);
        Director zamDirector = new Director("Nasty", "Berezina", 5,6,320);
        Employee worker = new Worker("Ruslan", "Dudkevich", 2,7,140);
        Employee worker2 = new Worker("Vadim", "Haritonov", 2,14,70);
        Employee worker3 = new Worker("Sasha", "Mlynarchik",2, 5,45);

        worker.setJobTitle("Главный инженер");
        worker2.setJobTitle("Прораб");
        worker3.setJobTitle("Рабочий");

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
    }


}
