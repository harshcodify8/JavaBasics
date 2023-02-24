package Arrays.first;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        int [] myArray = new int[10];
        myArray[5] = 50;
        myArray[1]=50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);


        // array initializer
        // java starts indexing with zero
        int[] myArrays = {1,2,3,4,5};
        System.out.println("length = "+myArrays.length);
        System.out.println("last = "+myArrays[myArrays.length-1]);

        int[] newArray;
        newArray = new int[5];
        for(int i = 0 ; i < newArray.length ; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for(int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println(Arrays.toString(newArray));
        // if you just want your element to a single string!!

    }
}
