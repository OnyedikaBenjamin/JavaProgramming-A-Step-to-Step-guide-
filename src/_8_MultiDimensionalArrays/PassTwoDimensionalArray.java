   // You can pass a two-dimensional array to a method just as you pass a one-dimensional array.
  //  You can also return an array from a method. This program gives an example with two methods.
 //   The first method, getArray(), returns a two-dimensional array, and the second method,
//    sum(int[][] m), returns the sum of all the elements in a matrix.

package _8_MultiDimensionalArrays;

   import java.util.Scanner;

   public class PassTwoDimensionalArray {

    public static int[][] getArray(){

        Scanner input = new Scanner(System.in);

        int[][] arrayList = new int[3][3];    // We specified the size of the array we want our user to input.

        System.out.println("Enter " + arrayList.length + " rows and " + arrayList[0].length + " column : " );  // i.e enter 4 rows and 3 columns.

        for(int row = 0; row < arrayList.length; row++)
            for (int column = 0; column < arrayList[row].length; column++)

                arrayList[row][column] = input.nextInt(); // Input the values of the rows and the columns.
        return arrayList;
    }
    public static int sum(int [][] arrayList) {
         int total = 0;
         for (int row = 0; row < arrayList.length; row++)
             for (int column = 0; column < arrayList[0].length; column++)
                total += arrayList[row][column];
         return total;
     }


     public static void main(String []args){

     int[][] myList = getArray();
         System.out.println("\nSum of all elements is " + sum(myList));
     }
}
