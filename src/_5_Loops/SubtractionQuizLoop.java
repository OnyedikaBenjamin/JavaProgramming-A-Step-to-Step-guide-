  //   Create a program that generates five subtraction questions (i.e number1 - number2), and after a student
 //    answers all five, the program reports the number of correct answers.
//     The program also displays the time spent on the test and lists all the questions.


package _5_Loops;

  import java.util.Scanner;

  public class SubtractionQuizLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

        int count         = 0;
        int correctCount  = 0;
        int wrongCount    = 0;
        String output = "";
        final int numberOfQuestions = 5;

        while (count < numberOfQuestions){

            int randomNumber1 = (int) (Math.random() * 50);
            int randomNumber2 = 40 + (int) (Math.random() * 50);

            int emptyContainer =0;
            if (randomNumber1 < randomNumber2)

                emptyContainer = randomNumber1;
                randomNumber1 = randomNumber2;
                randomNumber2 = emptyContainer;


            int correctAnswer = (randomNumber1 - randomNumber2);

            System.out.println("What is " + randomNumber1 + " - " + randomNumber2 + "? : " );
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer){
                System.out.println("You are correct!\n");
                correctCount++;                                     // If the user is correct, the correctCount increases by 1.
            }
            else{
                System.err.println("You are wrong!\n" +
                        "The right answer is " + (randomNumber1 - randomNumber2));
                wrongCount++;
            }
            count++;

             output += "\n" + randomNumber1 + "-" + randomNumber2 + " = " + userAnswer +        // This statement keeps track of all the questions
                    ((randomNumber1 - randomNumber2 == userAnswer) ? " correct" : " wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Your test time is : " + (testTime/1000) + " seconds");

        System.out.println("You got " + correctCount + " answers correct and failed " + wrongCount);

        System.out.println(output);


    }
}
