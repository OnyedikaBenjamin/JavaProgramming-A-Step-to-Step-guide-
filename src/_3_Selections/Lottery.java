/*   Create a program randomly generates a
        lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
        whether the user wins according to the following rules:
        1. If the user input matches the lottery number in the exact order, the award is $10,000.
        2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
        3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
        Note that the digits of a two-digit number may be 0. If a number is less than 10, we assume
        the number is preceded by a 0 to form a two-digit number. For example, number 8 is treated
        as 08 and number 0 is treated as 00 in the program.   */
package _3_Selections;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int winningNumber = (int) (Math.random() * 100);       // Winning number ranges from 0 to 99.
        int lotteryDigit1 = winningNumber / 10;               //  The first digit of the winning number.
        int lotteryDigit2 = winningNumber % 10;              //   The Second digit of the winning number.

        System.out.println(winningNumber + " is the winning number");
        
        System.out.print("Enter your guess number : ");
        int guessNumber = input.nextInt();
        int guessDigit1 = guessNumber / 10;
        int guessDigit2 = guessNumber % 10;
        
        if(guessNumber == winningNumber)
            System.out.println("You won $10,000!!!");
            else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
                     System.out.println("You won $3000!!");
                 else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                              || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
                              System.out.println("You won $1000");
                        else {
                              System.out.println("You lost!");
                             }
    }
}
