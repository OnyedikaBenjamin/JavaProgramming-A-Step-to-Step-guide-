    // Write a program for swapping two elements in an array.

package _7_SingleDimensionalArrays;

public class SwapArrayElements {

    public static void main(String[] args) {

        int []  myArrayList = {2,4};

        System.out.println("Before swapping the two elements the value of x is : " + myArrayList[0] + " and the value of y is " + myArrayList[1]);

        swap(myArrayList);

        System.out.println("After invoking the swap method, x is now : " + myArrayList[0] + " and y is now : " + myArrayList[1]);
    }

    public static void swap(int[] numbersToSwap){
        int temp = numbersToSwap [0];
        numbersToSwap[0] = numbersToSwap[1];
        numbersToSwap[1] = temp;
    }
}
