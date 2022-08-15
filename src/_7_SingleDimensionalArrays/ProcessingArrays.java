package _7_SingleDimensionalArrays;

import java.util.Scanner;

public class ProcessingArrays {

    public static void main(String[] args) {

//-------------- (1) Initializing arrays with input values---------------------------

        Scanner input = new Scanner(System.in);

        int[] myList = new int[10];

        System.out.print("Enter " + myList.length + " values : ");

        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextInt();
        }
            /**
             * The above loop initializes the array myList with user input values.
             */

//------------ (2) Initializing arrays with random values-----------------------------

            int[] myList2 = new int[10];
            for (int j = 0; j < myList2.length; j++) {
                myList2[(int)j] = (int) (Math.random() * 100);
            }
            /**
             * The above loop initializes the array myList
             * with random values between 0 and 100, but less than 100.
             */

//----------------- (3) Displaying Arrays-------------------------------------------------

            int[] myList3 = {78, 84, 34, 42, 32, 23};
            for (int k = 0; k < myList3.length; k++) {
                System.out.print(myList3[k] + " ");
            }

/** For an array of the char[] type, it can be printed using one print statement. For example, the following code displays Dallas */

        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);

//-----------------(4) Summing all elements--------------------------------------------

        int[] myList4 = {40, 33, 43, 43, 34};
        double total = 0;
        for (int l = 0; l < myList4.length; l++) {
            total += myList4[l];
        }
/** Add each element in the array to total using a loop like this */

//---------------- (5) Finding the largest element-------------------------------------

        int[] myList5 = {40, 50, 55, 60, 34, 70};
        double max = myList5[0];
        for (int m = 1; m < myList5.length; m++) {
            if (myList5[m] > max)
                max = myList5[m];
            int indexOfMax = m;      // This shows the index of the largest of the numbers.
            System.out.println(max + " is the largest of the elements when compared to index " + indexOfMax);
            /**
             * Initially max is myList[0]. To find the largest element in the array myList, compare
             * each element with max, and update max if the element is greater than max.
             */
        }

//--------------- (6) Finding the smallest index of the largest element -------------------

        int myList6 [] = {3, 6, 8, 5, 8, 1, 3};
        double theMaximumOfTheNumbers = 0;
        int indexOfMax = 0;

        for(int n = 0; n < myList6.length; n++ ){

            if (myList6[n] > theMaximumOfTheNumbers ) {
                theMaximumOfTheNumbers = myList6[n];
                indexOfMax = n;
            }
            System.out.println("The maximum number is : " + theMaximumOfTheNumbers + " and it is at index " + n);
        }
//----------------- (7) Copying Arrays ------------------------------------------------------
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        /** The above functions copies the elements from the source array to the target array
         *  The System.arraycopy is a java class. The parameters srcPos and destPos indicate the
         *  starting positions in sourceArray and targetArray, respectively.
         *The number of elements copied from sourceArray to targetArray is indicated by length */

    }
}
