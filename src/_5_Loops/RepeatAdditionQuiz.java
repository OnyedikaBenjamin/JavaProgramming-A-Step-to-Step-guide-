     //   Write a program that prompts the user to enter
    //    an answer for a question on addition of two single digits.
   //     Rewrite the program to let the user repeatedly enter a new answer until it is correct.

package _5_Loops;

     import java.util.Scanner;

     public class RepeatAdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 50);         // number1 ranges from 0 to 50.
        int number2 = (int) (50 + Math.random() * 50);   // number2 ranges from 50 to 99.

        Scanner scan = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? : ");
        int userInput = scan.nextInt();

        int realAnswer = number1 + number2;

        while (userInput != realAnswer){
            System.err.println("Wrong answer! please try again\n" +
                               "What is " + number1 + " + " + number2 + "? : ");
                                userInput = scan.nextInt();
        }
        System.out.println("You are correct!");          // Else, print this.

    }
}
