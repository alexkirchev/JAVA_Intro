package arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myDefaultArray = new int [5];
        myDefaultArray[0] = 1;
        myDefaultArray[3] = 4;
        System.out.println(Arrays.toString(myDefaultArray)); // prints myDefaultArray values as string

        int[] myFirstArray = {1, 5, 9};

        String[] myFirstStringArray = {"Asia", "Africa", "Australia"};

        System.out.println(myFirstArray); //prints array ID

        System.out.println(Arrays.toString(myFirstArray)); // prints myFirstArray as a string

        System.out.println(myFirstArray[0]); //prints number on index 0
        System.out.println(myFirstArray[1]);  //prints number on index 1
        System.out.println(myFirstArray[2]);  //prints number on index 2

        for (int i = 0; i < myFirstArray.length; i++) {  //prints numbers using "for"
            System.out.println(myFirstArray[i]);
        }

        System.out.println(myFirstStringArray[0]); //prints string on index 0
        System.out.println(myFirstStringArray[1]);  //prints string on index 1
        System.out.println(myFirstStringArray[2]);  //prints string on index 2

        for (int i = 0; i < myFirstStringArray.length; i++) { //prints strings using "for"
            System.out.println(myFirstStringArray[i]);
        }
        Arrays.sort(myFirstStringArray);                // prints strints sotred
        for (int i = 0; i < myFirstStringArray.length; i++) {
            System.out.println(myFirstStringArray[i]);
        }
    }
}
