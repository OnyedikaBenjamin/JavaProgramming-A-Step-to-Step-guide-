package _8_MultiDimensionalArrays;

public class ProcessingTwoDimensionalArrays {
    public static void main(String[] args) {

            // Here we declared our 2-dimensional array with 10 rows and 10 columns.

        double[][] matrix = new double[10][10];


         // -------------(1) Initializing arrays with input values.-------------------

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns.");
//        for(int rows =0; rows < matrix.length; rows++){
//            for(int columns =0; columns < matrix[0].length; columns++){
//                matrix[rows][columns] = input.nextInt();
//            }
//        }

        // -----------(2) Initializing arrays with random values ---------------------

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column] + " ");
            }
        }

        //--------------- (3) Printing arrays ----------------------------------------

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();       // If this line of code is not included, the elements of the array will be printed on one line.
        }
        /** To print a two-dimensional array, you have to print each element in the array using the loop above */

        //--------------(4) Summing elements by column ------------------------------

        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }

        //-----------------(5) Summing elements by column -------------------------

        // For each column, use a variable named total to store its sum. Add each element in the column to total using a loop like this:

        //
        //for (int column = 0; column < matrix[0].length; column++) {
        //int total = 0;
        //for (int row = 0; row < matrix.length; row++)
        // total += matrix[row][column];
        // System.out.println("Sum for column " + column + " is "
        // + total);
        //}
        //6. Which row has the largest sum? Use variables maxRow and indexOfMaxRow to track
        //the largest sum and index of the row. For each row, compute its sum and update maxRow
        //and indexOfMaxRow if the new sum is greater.
        //int maxRow = 0;
        //int indexOfMaxRow = 0;
        //// Get sum of the first row in maxRow
        //for (int column = 0; column < matrix[0].length; column++) {
        // maxRow += matrix[0][column];
        //}
        //for (int row = 1; row < matrix.length; row++) {
        //int totalOfThisRow = 0;
        //for (int column = 0; column < matrix[row].length; column++)
        // totalOfThisRow += matrix[row][column];
        //if (totalOfThisRow > maxRow) {
        // maxRow = totalOfThisRow;
        // indexOfMaxRow = row;
        // }
        //}
        //System.out.println("Row " + indexOfMaxRow
        // + " has the maximum sum of " + maxRow);
        //7. Random shuffling. Shuffling the elements in a one-dimensional array was introduced
        //in Section 7.2.6. How do you shuffle all the elements in a two-dimensional array? To
        //accomplish this, for each element matrix[i][j], randomly generate indices i1 and
        //j1 and swap matrix[i][j] with matrix[i1][j1], as follows:
        //for (int i = 0; i < matrix.length; i++) {
        //for (int j = 0; j < matrix[i].length; j++) {
        //int i1 = (int)(Math.random() * matrix.length);
        //int j1 = (int)(Math.random() * matrix[i].length);
        //// Swap matrix[i][j] with matrix[i1][j1]
        //VideoNote
        //Find the row with the largest
        //sum
        //8.4 Passing Two-Dimensional Arrays to Methods 293
        // int temp = matrix[i][j];
        // matrix[i][j] = matrix[i1][j1];
        // matrix[i1][j1] = temp;
        // }





















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
