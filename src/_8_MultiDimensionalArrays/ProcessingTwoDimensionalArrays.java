package _8_MultiDimensionalArrays;

import java.util.Scanner;

public class ProcessingTwoDimensionalArrays {
    public static void main(String[] args) {

            // Here we declared our 2-dimensional array with 10 rows and 10 columns.

        double[][] arrayList = new double[10][10];


         // -------------(1) Initializing arrays with input values.-------------------

        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + arrayList.length + " rows and " + arrayList[0].length + " columns.");
        for(int rows =0; rows < arrayList.length; rows++){
            for(int columns =0; columns < arrayList[0].length; columns++){
                arrayList[rows][columns] = input.nextInt();
            }
        }

        // -----------(2) Initializing arrays with random values ---------------------

        for (int row = 0; row < arrayList.length; row++) {
            for (int column = 0; column < arrayList[row].length; column++) {
                arrayList[row][column] = (int) (Math.random() * 100);
                System.out.print(arrayList[row][column] + " ");
            }
        }

        //--------------- (3) Printing arrays ----------------------------------------

        for (int row = 0; row < arrayList.length; row++) {
            for (int column = 0; column < arrayList[row].length; column++) {
                System.out.print(arrayList[row][column] + " ");
            }
            System.out.println();       // If this line of code is not included, the elements of the array will be printed on one line.
        }
        /** To print a two-dimensional array, you have to print each element in the array using the loop above */

        //--------------(4) Summing elements by column ------------------------------

        int total = 0;
        for (int row = 0; row < arrayList.length; row++) {
            for (int column = 0; column < arrayList[row].length; column++) {
                total += arrayList[row][column];
            }
        }

        //-----------------(5) Which row has the largest sum? -------------------------

        int maxRow = 0;
        int indexOfMaxRow = 0;

       /** Get sum of the first row in maxRow */

        for (int column = 0; column < arrayList[0].length; column++) {
            maxRow += arrayList[0][column];
        }
        for (int row = 1; row < arrayList.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < arrayList[row].length; column++)
                totalOfThisRow += arrayList[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow
                + " has the maximum sum of " + maxRow);

        //----------(6) How do we shuffle all the elements in a two-dimensional array? ---------

        for (int i = 0; i < arrayList.length; i++) {
            for (int j = 0; j < arrayList[i].length; j++) {
                int i1 = (int)(Math.random() * arrayList.length);
                int j1 = (int)(Math.random() * arrayList[i].length);
// Swap arrayList[i][j] with arrayList[i1][j1]
                double temp = arrayList[i][j];
                arrayList[i][j] = arrayList[i1][j1];
                arrayList[i1][j1] = temp;
            }
        }





















//        int[][] arrays = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12}
//        };

//    /** This is equivalent to */
//
//    int[][] array = new int[4][3];
//    array[0][0] = 1; array[0][1] = 2; array[0][2] = 3;
//    array[1][0] = 4; array[1][1] = 5; array[1][2] = 6;
//    array[2][0] = 7; array[2][1] = 8; array[2][2] = 9;
//    array[3][0] = 10; array[3][1] = 11; array[3][2] = 12;
    }
}
