// Write a program that reverses the values of an array list.

package _7_SingleDimensionalArrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arrayList) {
        for (int j = arrayList.length-1; j >= 0; j--) {    // To avoid bound exception, we minus 1 from the array length.

            System.out.print(arrayList[j] + " ");         // So when we call the method in method main, it reverses the array list.
        }
    }

    public static void main(String[] args) {

        int[] myList = {10, 20, 30, 40, 50};

        System.out.println("Before the Loop this is the look  " + Arrays.toString(myList));

        System.out.print("After the loop, this is how it looks  ");
       reverseArray(myList);

    }

}
