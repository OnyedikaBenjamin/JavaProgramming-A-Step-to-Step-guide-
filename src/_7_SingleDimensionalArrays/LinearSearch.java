// Write a program that searches for a particular integer number in a list of numbers.

package _7_SingleDimensionalArrays;

public class LinearSearch {


    /**  We first create a method that can search for the position of a number in a particular index.
     *   The method will take in 2 arguments, the number to search for and the list to search from. */

    public static int search(int [] list, int number){  //

        for(int i =0; i < list.length; i++){
            if (number == list[i])                   // If the number is equal to the value at a particular index,
                return i;                           //  return the index.
        }
        return -1;                                  // If no match is found, the search returns -1
    }

    /** Then Secondly, we create our main method to execute and test the method 'search'. */

    public static void main(String[] args) {

        int[] myArrayList = {23, 5, -7, 4, 15, 15, 23, 9};
        System.out.println(search(myArrayList, 23));   // search for 7 in myArrayList
    }
}
