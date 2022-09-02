//Write a program that takes in a 20 by 20 array and prompts the user
//to input its values.

package _8_MultiDimensionalArrays;

import java.util.Scanner;

public class Display2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] array = new String[20][20];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Enter the element at " + "Row" + row + "-Column" + column + " : ");
                array[row][column] = input.nextLine();
            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]);
                if (column < array.length -1 ){
                    System.out.print("|");
                }
            }
            System.out.println();
        }

    }
}
