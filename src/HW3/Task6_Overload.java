package HW3;

import java.util.Scanner;

public class Task6_Overload {
    public static void main (String[] args){
        Post post1 = new Post(1129);

        System.out.println(post1.getInfo());

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter parcel count to send");
        int parcelCount = scanner.nextInt();

        System.out.println("enter letters count to send");
        int letterCount = scanner.nextInt();


        for (int i = 0; parcelCount > i; ++i) {
            Post.Parcel parcel = post1.new Parcel();
            post1.send(parcel);
        }
        for (int i = 0; letterCount > i; ++i) {
            Post.Letter letter = post1.new Letter();
            post1.send(letter);
        }
        post1.send(22);

        System.out.println(post1.getInfo());
    }



}
