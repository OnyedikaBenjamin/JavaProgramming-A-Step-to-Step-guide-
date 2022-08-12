  /**    Write a program that prompts the user to enter a number continuously until the number matches
 //    the randomly generated number. For each user input, the program tells the user whether
//     the input is too low or too high, so the user can make the next guess intelligently.    */

 package _5_Loops;

  import java.util.Scanner;

  public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int myRandomNumber = (int) (40 + Math.random() * 100);         // myRandomNumber ranges from 40 to 139.
        System.out.println("my random number is " + myRandomNumber);

        System.out.print("guess a magic number between 40 to 139 : ");
        int guessNumber = scan.nextInt();


         while (guessNumber != myRandomNumber){                  // While the condition is true, execute the next phase

                if (guessNumber >  myRandomNumber)
                   System.out.println("Your guess is too high");
                else if (guessNumber < myRandomNumber)
                   System.out.println("Your guess is too low");

                System.out.print("Enter your guess number : ");
                guessNumber = scan.nextInt();

                }

                if (guessNumber == myRandomNumber){             // If the while loop condition is not true, execute this
                 System.out.println("You are correct!!!");
        }
    }
}
