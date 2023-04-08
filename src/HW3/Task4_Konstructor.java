package HW3;

public class Task4_Konstructor {

    public static void main (String[] args){


        Car car1 = new Car( "BMV", "Kolya", "1A11");

        Car car2 = new Car("Mercedes","Katy");

        Car car3 = new Car("Lancer");

        System.out.println(car1.getInfo());

        System.out.println(car3.getInfo());
    };




}
