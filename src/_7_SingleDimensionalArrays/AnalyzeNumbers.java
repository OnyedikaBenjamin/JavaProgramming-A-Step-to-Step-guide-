// Write a program that finds the number of items above the average of all the items.

package _7_SingleDimensionalArrays;

import java.util.Scanner;

public class AnalyzeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many items do you wanna compute? : ");
        int numberOfItems = input.nextInt();

        int [] items = new int[numberOfItems];
        int sum = 0;

         // Always initialize your counter to start at 0 to avoid "array out of bound exception".
        //  and the condition must not have the = operator for example i <= 10 can cause an error

        for(int i = 0;  i < numberOfItems; i++){
            System.out.print("Enter the number at index " + i + " : ");
            items[i] = input.nextInt();
            sum += items[i];
        }

        int average = sum/numberOfItems;
        System.out.println("The average is " + average);

        int aboveAverageCount = 0;
        for (int i = 0; i < numberOfItems; i++)      // Loop through the elements of the array
             if (items[i] > average)                //  if any element is above the average
             aboveAverageCount++;                  //   count it

        System.out.println("The number of items above the average is " + aboveAverageCount);


    }
}
