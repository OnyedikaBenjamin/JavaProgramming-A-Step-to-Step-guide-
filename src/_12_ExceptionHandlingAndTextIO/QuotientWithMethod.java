package _12_ExceptionHandlingAndTextIO;

import java.util.Scanner;

public class QuotientWithMethod {
    public static int showQuotient(int number1, int number2){
        if(number2 == 0){
            System.out.println("Divisor cannot be zero!");
            System.exit(5);       // This command will terminate the program
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers separated by spaces -> : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(showQuotient(number1, number2));
    }
}
