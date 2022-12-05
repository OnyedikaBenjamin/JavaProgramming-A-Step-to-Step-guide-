package _12_ExceptionHandlingAndTextIO;

import java.util.Scanner;

public class QuotientWith_IFStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers separated by spaces -> : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number2 != 0){
            System.out.println("The result of dividing " + number1 + " by " + number2 + " is : " + (number1/number2));}
        else {
            System.out.println("Divisor cannot be Zero");}
    }
}