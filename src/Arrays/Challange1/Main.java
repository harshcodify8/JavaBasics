package Arrays.Challange1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int unsortedarr[] = getRandom(10);
        System.out.println(Arrays.toString(unsortedarr));

    }

    private static int[] getRandom (int length) {
        int arr[] = new int[length];
        Random rad = new Random();
        for(int i = 0 ; i < length ; i ++) {
            arr[i] = rad.nextInt(100);
        }
        return arr;
    }
    private static int[] sortIntegers(int[] array) {
        int [] sortedArray = Arrays.copyOf(array,array.length);
        return sortedArray;
        // sort array in descending order code.
    }
}
