package _12_ExceptionHandlingAndTextIO;

import java.util.Scanner;

public class QuotientWithException{
    public static void startProgram() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers separated by spaces -> : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int quotient = number1 / number2;
            System.out.println("The quotient is " + quotient);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("The divisor cannot be zero");
            startProgram();
        }
        System.out.println("Execution continues....");
    }

        public static void main(String[] args) {
            startProgram();
    }
}