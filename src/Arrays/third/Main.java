package Arrays.third;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = getelements();
        System.out.println(Arrays.toString(array));

        int minimum = minimum(array);
        System.out.println("minimum value = "+minimum);

        System.out.println("Final: " + Arrays.toString(array));

    }
    private static int[] getelements () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers , seprated by commas");
        String array = sc.nextLine();

        String[] split = array.split(",");
        int [] values = new int [split.length];

        for(int i = 0 ; i < split.length ; i++) {
            values[i] = Integer.parseInt(split[i].trim());

        }

        return values;
    }
    private static int minimum(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < array.length ; i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    private static void reverselement(int [] array){
        int maxIndex = array.length-1;
        int maxSize = array.length-1;
        int hl = array.length/2;
        for(int i = 0 ; i < hl ; i++) {
            int temp = array[i];
            array[i] =  array[maxIndex - i];
            array[maxIndex-i] = temp;
            System.out.println("--> "+ Arrays.toString(array));

        }
    }
}
