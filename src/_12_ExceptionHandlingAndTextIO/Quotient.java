package _12_ExceptionHandlingAndTextIO;

import java.util.Scanner;

// Write a program that reads 2 integers and displays their quotient.
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers separated by spaces -> : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int quotient = number1 / number2;

        // Let's say we input 3 and Zero
        System.out.println("The result of dividing 3 by zero is " + quotient);
    }
}