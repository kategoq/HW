package HW3.arrays.Arrays;

import java.util.Arrays;

public class Methods {
    private int[] sortArray (int [] arr) {
        Arrays.sort(arr);
        return arr;
    }
    public void printSortArray (int[] arr) {
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    private int findMaxValue (int[] arr) {
        sortArray(arr);
        int maxValue = arr[arr.length-1];
        return maxValue;
    }
    public void printMaxValue (int [] arr) {
        System.out.println(findMaxValue(arr));
    }
    private int findElementByIndex (int[] arr, int index) {
        int element = 0;
        for (int i = 0; i< index+1; i++) {
            element = arr [index];
        } return element;
    }
    public void printElement (int[] arr, int index) {
        System.out.println(findElementByIndex(arr, index));
    }
}
