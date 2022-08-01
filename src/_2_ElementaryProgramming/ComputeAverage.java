package _2_ElementaryProgramming;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        double number1 = input.nextDouble();

        System.out.print("Enter number 2 : ");
        double number2 = input.nextDouble();

        System.out.print("Enter number3 : ");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of the numbers is : " + average);
    }
}
