   //  Suppose you want to develop a program for a first-grader to practice Cai,
  //   the program randomly selects two digits and displays to the student a statement such as what is 9 - 2?
 //    After the student types an answer, it displays whether the answer is True or False.
//     Generate using the Math.random() method.
package _3_Selections;

   import java.util.Scanner;

   public class SubtractionQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 50);
        int number2 = (int) (Math.random() * 50);

        System.out.print("What is " + number1 +  " - "  + number2 + "? : ");
        int userAns = input.nextInt();


        if (number1 - number2 == userAns){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong.");
            System.out.println("The correct answer should be " + (number1 - number2));
        }
    }
}
