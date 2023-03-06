package Generics;

import java.util.ArrayList;

public class WhyGenerics {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add("sharma");
        // it don't show the error till compile time that is the issue.
        al.add(4);

        for(Object O : al) {
            System.out.println((Integer)O);
        }
    }
}
