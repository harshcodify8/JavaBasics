package Arrays.second;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] first = random(10);
        System.out.println(Arrays.toString(first));
        Arrays.sort(first);
        // dont return anything so we dont get new instance of an array back . its void
       // the actuall array we passed to it got sorted.
        System.out.println(Arrays.toString(first));

        int [] second = new int[10];
        System.out.println(Arrays.toString(second));
        Arrays.fill(second,5);
        System.out.println(Arrays.toString(second));

        int [] third = random(10);
        System.out.println(Arrays.toString(third));

        int [] fourthArray = Arrays.copyOf(third,third.length);
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(third));
        System.out.println(Arrays.toString(fourthArray));

        // for primitives  values get copied.
        // for objects ,  the objects references get copied , so performing operation on the copied array dont impact the original array

        int [] smaller = Arrays.copyOf(third,5);
        int [] larger = Arrays.copyOf(third,20);
        System.out.println(Arrays.toString(smaller));
        System.out.println(Arrays.toString(larger));

        String [] sArray = {"sachin","suresh","mahesh","Jatin","Karan"};
        Arrays.sort(sArray);
        if(Arrays.binarySearch(sArray,"mahesh") >= 0){
            System.out.println("Found");
        }
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        // this method return true or false
        if(Arrays.equals(s1,s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }
    private static int[] random (int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0 ; i < len ; i++) {
            newInt[i] = random.nextInt(100);
            // 0 to maximum integer value , dont pass the bound , but ab it will get any number between 0 to 99
        }
        return newInt;
    }

}
