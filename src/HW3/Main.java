package HW3;
import HW3.User;
public class Main {
    public static void main(String[] args) {
        User userKaty = new User("katy", "same", 26, User.Sex.FEMALE);
        User userVika = new User("vika", "nara", 49, User.Sex.MALE);


        System.out.println(userVika.getAge());

        System.out.println(userKaty.getAge());

        System.out.println(userKaty.increaseAge(4));

        System.out.println(userVika.increaseAge(5));

        System.out.println(userKaty.getInfo());

        System.out.println(userVika.getInfo() + " " + userKaty.getInfo());



    }
}