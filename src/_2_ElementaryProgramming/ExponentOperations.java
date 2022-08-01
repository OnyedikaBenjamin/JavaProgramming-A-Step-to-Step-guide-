package _2_ElementaryProgramming;

import java.util.Scanner;

public class ExponentOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // say we want to display x exponent y (X raise to the power of y) we use the Math.pow(x, y) function.

        System.out.print("Enter value for x : ");
        int x = input.nextInt();

        System.out.print("Enter value for y : ");
        int y = input.nextInt();

        System.out.println("The value of " + x + " raise to the power of " + y + " is : " + Math.pow(x, y));
    }
}
