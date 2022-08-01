//Create a program that checks whether a number is divisible
// by 2 and 3, by 2 or 3 but not both, and cannot be divisible by 2 or 3.

package _3_Selections;

import java.util.Scanner;

public class TestBooleanOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        if (number % 2 ==0 && number % 3 ==0){
            System.out.println(number + " is divisible by both 2 and 3.");
        } else if (number % 2 ==0 || number % 3 ==0) {
            System.out.println(number + " can be divided by 2 or 3 but not both");
        }
        else if (number % 2 != 0 && number % 3 != 0) {
            System.out.println(number + " cannot be divided by 2 and 3");
        }
    }
}
