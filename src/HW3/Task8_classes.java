package HW3;
import HW3.Package1.*;
import HW3.Package1.Katy;
import HW3.Package2.*;
public class Task8_classes {
    public static void main (String[] args) {
        HW3.Package1.Katy vasya = new HW3.Package1.Katy();
        HW3.Package2.Katy misha = new HW3.Package2.Katy();

        /* начинается задача 5 */
        vasya.goodMethod();
        vasya.badMethod();
    }

}
