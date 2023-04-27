import HW3.arrays.Arrays.Methods;
import HW3.seasons.CheckSeason;
import HW3.seasons.Month;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,566,7,-124, 343, 5, -9};
        //    CheckSeason checkSeason = new CheckSeason();
        //   checkSeason.checkSeason(Month.April);

        Methods arraysMethods = new Methods();
       // arraysMethods.printSortArray(arr);

     //   arraysMethods.printMaxValue(arr);

        arraysMethods.printElement(arr,2);
    }

}
