    //  Suppose you want to develop a program for a first-grader to practice addition,
   //   the program randomly selects two digits and displays to the student a statement such as what is 1 + 7?
  //    After the student types an answer, it displays whether the answer is True or False.
 //     For now Generate the first number using System.currentTimeMillis() % 10 and the second using
//     System.currentTimeMillis()/ 7 % 10.

package _3_Selections;

    import java.util.Scanner;

    public class AdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis()/ 7 % 10.);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + " ? : ");
        int userAnswer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + userAnswer + " is " + (number1 + number2==userAnswer));
    }
}
