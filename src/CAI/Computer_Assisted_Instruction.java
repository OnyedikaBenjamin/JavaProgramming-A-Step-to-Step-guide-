package CAI;

import jdk.jfr.Label;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

    @Label("Aimed at assisting elementary students learn basic calculations")
    public class Computer_Assisted_Instruction {
        private static int correctCount=0,wrongCount=0;
        private static int answer;
        private static String userAnswer,userRemainder,quizToTake;
        private static int firstNumber,secondNumber,remainder;
        private final static SecureRandom randomNumbers = new SecureRandom();
        private static final int numberOfQuestion=4;
        private static double percentage=0;
        private static int additionLevel=1,subtractionLevel=1,multiplicationLevel=1,divisionLevel=1;

        @Label("Execution\"Main Method\"")public static void main(String[] args) throws IOException {
            startQuiz();
        }
        @Label("Implicitly executes the program")public static void startQuiz() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("""
                      \t\t\t\t\t\t\t\t\t\t\tWELCOME TO BEN-BILLION QUIZ
                      Please select a quiz type
                            (1) Addition      (2) Subtraction      (3) Multiplication      (4) Division      (5) Any Quiz  :\s""");
            quizToTake = String.valueOf(scan.readLine());
            promptQuizType();
        }
        @Label("Checks quiz type")public static void promptQuizType() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            if(Integer.parseInt(quizToTake) == 1){startAdditionQuiz();}
            else if(Integer.parseInt(quizToTake) == 2){startSubtractionQuiz();}
            else if(Integer.parseInt(quizToTake) == 3){startMultiplicationQuiz();}
            else if(Integer.parseInt(quizToTake) == 4){startDivisionQuiz();}
            else if(Integer.parseInt(quizToTake) == 5){startAnyQuiz();}
            else {
                while (Integer.parseInt(quizToTake) < 1 || Integer.parseInt(quizToTake) > 5) {
                    System.out.print("Please select a valid number from 1 to 5 : ");
                    quizToTake = String.valueOf(scan.readLine());
                    promptQuizType();
                }
            }
        }
        @Label("Randomly selects a quiz type") public static void startAnyQuiz() throws IOException {
            int anyQuiz = (int) (Math.random() * 12);
            switch (anyQuiz){
                case 1 -> additionLevel1();case 2 -> subtractionLevel1();
                case 3 -> multiplicationLevel1();case 4 -> divisionLevel1();
                case 5 -> additionLevel2();case 6 -> subtractionLevel2();
                case 7 -> multiplicationLevel2();case 8 -> divisionLevel2();
                case 9 -> additionLevel3();case 10 -> subtractionLevel3();
                case 11 -> multiplicationLevel3();case 12 -> divisionLevel3();
            }
        }
        @Label("Generates addition quiz from level1") public static void startAdditionQuiz() throws IOException {
            if (additionLevel == 1) {
                additionLevel1();
            } else if (additionLevel == 2) {
                additionLevel2();
            } else {
                additionLevel3();
            }
        }
        @Label("Generates subtraction quiz from level1")public static void startSubtractionQuiz() throws IOException {
            if (subtractionLevel == 1) {
                subtractionLevel1();
            } else if (subtractionLevel == 2) {
                subtractionLevel2();}
            else {
                subtractionLevel3();
            }
        }
        @Label("Generates multiplication quiz from level1")public static void startMultiplicationQuiz() throws IOException {
            if (multiplicationLevel == 1) {
                multiplicationLevel1();
            } else if (multiplicationLevel == 2) {
                multiplicationLevel2();
            } else {
                multiplicationLevel3();
            }
        }
        @Label("Generates division quiz from level1") public static void startDivisionQuiz() throws IOException {
            if (divisionLevel == 1) {
                divisionLevel1();
            } else if (divisionLevel == 2) {
                divisionLevel2();
            } else {
                divisionLevel3();
            }
        }
        @Label("Attributed with single digits")public static void additionLevel1() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 1 + randomNumbers.nextInt(9);
                secondNumber = 1 + randomNumbers.nextInt(9);
                answer = firstNumber + secondNumber;
                askAdditionQuestionsAndTakeInput();
                checkAndCompareAdditionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateAdditionIterables();}
        }
        @Label("attributed with both single and double digits")public static void additionLevel2() throws IOException {
            for (int a = 0; a < numberOfQuestion; a++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = 1 + randomNumbers.nextInt(9);
                answer = firstNumber + secondNumber;
                askAdditionQuestionsAndTakeInput();
                checkAndCompareAdditionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){calculateAnyQizIterables();}
            else {calculateAdditionIterables();}
        }
        @Label("attributed with bi-digits only")public static void additionLevel3() throws IOException {
            for (int k = 0; k < numberOfQuestion; k++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = 10 + randomNumbers.nextInt(20);
                answer = firstNumber + secondNumber;
                askAdditionQuestionsAndTakeInput();
                checkAndCompareAdditionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){calculateAnyQizIterables();}
            else {calculateAdditionIterables();}
        }@Label("computes iterables") public static void calculateAdditionIterables() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            percentage = correctCount * 100/ numberOfQuestion;
            System.out.printf("%n%s%d%n%s%d%n%s%.2f%n", "Correct count -> ", correctCount,
                    "Wrong count -> ", wrongCount, "Percentage -> %", percentage);
            if(percentage < 75){
                System.out.println("Please ask your teacher for extra help");
                System.out.println("Press 'Y' to reset");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    startAdditionQuiz();}
            } else {
                if(additionLevel == 3){System.out.println("Congratulations!");}
                else {System.out.println("Congratulations you are ready to go to another level");}
                System.out.printf("%s%n", "Enter any key to quit or enter Y to continue : ");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    additionLevel++;
                    startAdditionQuiz();
                }
            }
        }
        @Label("prompt")public static void askAdditionQuestionsAndTakeInput() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            System.out.printf("What is %d + %d = ", firstNumber, secondNumber);
            userAnswer = scan.readLine();
        }
        @Label("continuation conditions") public static void checkAndCompareAdditionAnswer() throws IOException {
            if(!userAnswer.equals(String.valueOf(answer))){
                while(!userAnswer.equals(String.valueOf(answer))) {
                    generateErrorResponse();
                    askAdditionQuestionsAndTakeInput();
                }
                wrongCount++;
                generateRightResponse();}
            else {
                generateRightResponse();
                correctCount++;
            }
        }
        @Label("attributed with single digits")public static void subtractionLevel1() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 1 + randomNumbers.nextInt(9);
                secondNumber = randomNumbers.nextInt(9);
                if(firstNumber < secondNumber){
                    firstNumber = firstNumber ^ secondNumber ^ (secondNumber = firstNumber);
                }
                answer = firstNumber - secondNumber;
                askSubtractionQuestionsAndTakeInput();
                checkAndCompareSubtractionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateSubtractionIterables();}
        }
        @Label("attributed with single and bi-digits")public static void subtractionLevel2() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = randomNumbers.nextInt(9);
                answer = firstNumber - secondNumber;
                askSubtractionQuestionsAndTakeInput();
                checkAndCompareSubtractionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateSubtractionIterables();}
        }
        @Label("attributed with bi-digits")public static void subtractionLevel3() throws IOException {
            for (int k = 0; k < numberOfQuestion; k++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = 10 + randomNumbers.nextInt(20);
                if(firstNumber < secondNumber){
                    firstNumber = firstNumber ^ secondNumber ^ (secondNumber = firstNumber);
                }
                answer = firstNumber - secondNumber;
                askSubtractionQuestionsAndTakeInput();
                checkAndCompareSubtractionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateSubtractionIterables();}
        }

        @Label("prompt")public static void askSubtractionQuestionsAndTakeInput() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            System.out.printf("%s%d%s%d%s", "How much is ", firstNumber, " - ", secondNumber, "? : ");
            userAnswer = scan.readLine();
        }
        @Label("continuation condition")public static void checkAndCompareSubtractionAnswer() throws IOException {
            if(userAnswer.equals(String.valueOf(answer))){
                generateRightResponse();
                correctCount = correctCount + 1;}
            else {
                while(!userAnswer.equals(String.valueOf(answer))) {
                    generateErrorResponse();
                    askSubtractionQuestionsAndTakeInput();}
                wrongCount++;
                generateRightResponse();
            }}@Label("computes iterables") public static void calculateSubtractionIterables() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            percentage = correctCount * 100 / numberOfQuestion;
            System.out.printf("%n%s%d%n%s%d%n%s%.2f%n", "Correct count -> ", correctCount,
                    "Wrong count -> ", wrongCount, "Percentage -> %", percentage);
            if(percentage < 75){
                System.out.println("Please ask your teacher for extra help");
                System.out.println("Press 'Y' to reset");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    startSubtractionQuiz();}
            } else {
                if(subtractionLevel == 3){System.out.println("Congratulations!");}
                else {System.out.println("Congratulations you are ready to go to another level");}
                System.out.printf("%s%n", "Enter any key to quit or enter Y to continue : ");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    subtractionLevel++;
                    startSubtractionQuiz();
                }
            }
        }
        @Label("Level Attributed with single unit values")public static void multiplicationLevel1() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 1 + randomNumbers.nextInt(9);
                secondNumber = 1 + randomNumbers.nextInt(9);
                answer = firstNumber * secondNumber;
                askMultiplicationQuestionsAndTakeInput();
                checkAndCompareMultiplicationAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateMultiplicationIterables();}
        }
        @Label("attributed with single and bi-digits values")public static void multiplicationLevel2() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = 1 + randomNumbers.nextInt(9);
                answer = firstNumber * secondNumber;
                askMultiplicationQuestionsAndTakeInput();
                checkAndCompareMultiplicationAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateMultiplicationIterables();}
        }
        @Label("attributed with bi-digits")public static void multiplicationLevel3() throws IOException {
            for (int k = 0; k < numberOfQuestion; k++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = 10 + randomNumbers.nextInt(20);
                answer = firstNumber * secondNumber;
                askMultiplicationQuestionsAndTakeInput();
                checkAndCompareMultiplicationAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateMultiplicationIterables();}
        }
        @Label("computes iterables")public static void calculateMultiplicationIterables() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            percentage = correctCount * 100/ numberOfQuestion;
            System.out.printf("%n%s%d%n%s%d%n%s%.2f%n", "Correct count -> ", correctCount,
                    "Wrong count -> ", wrongCount, "Percentage -> %", percentage);
            if(percentage < 75){
                System.out.println("Please ask your teacher for extra help");
                System.out.println("Press 'Y' to reset");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;
                    startMultiplicationQuiz();}
            }
            else {
                if(multiplicationLevel == 3){
                    System.out.println("Congratulations!");}
                else {
                    System.out.println("Congratulations you are ready to go to another level");}
                System.out.println("Press any key to quit or 'Y' to continue");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    multiplicationLevel++;
                    startMultiplicationQuiz();
                }
            }
        }
        @Label("prompt")public static void askMultiplicationQuestionsAndTakeInput() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            System.out.printf("%s%d%s%d%s", "How much is ", firstNumber, " * ", secondNumber, "? : ");
            userAnswer = scan.readLine();
        }
        @Label("continuation condition")public static void checkAndCompareMultiplicationAnswer() throws IOException {
            if(userAnswer.equals(String.valueOf(answer))){
                generateRightResponse();
                correctCount = correctCount + 1;}
            else {
                while(!userAnswer.equals(String.valueOf(answer))) {
                    generateErrorResponse();
                    askMultiplicationQuestionsAndTakeInput();}
                wrongCount++;
                generateRightResponse();
            }
        }
        @Label("attributed with single digits") public static void divisionLevel1() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 1 + randomNumbers.nextInt(9);
                secondNumber = randomNumbers.nextInt(9);
                if(firstNumber < secondNumber){
                    firstNumber = firstNumber ^ secondNumber ^ (secondNumber = firstNumber);
                }
                answer = Math.abs(firstNumber/secondNumber);
                remainder = firstNumber % secondNumber;
                askDivisionQuestionsAndTakeInput();
                checkAndCompareDivisionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateDivisionIterables();}
        }
        @Label("attributed with single and bi-digits") public static void divisionLevel2() throws IOException {
            for (int j = 0; j < numberOfQuestion; j++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = randomNumbers.nextInt(9);
                if(firstNumber < secondNumber){
                    firstNumber = firstNumber ^ secondNumber ^ (secondNumber = firstNumber);
                }
                answer = Math.abs(firstNumber/secondNumber);
                remainder = firstNumber % secondNumber;
                askDivisionQuestionsAndTakeInput();
                checkAndCompareDivisionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateDivisionIterables();}
        }
        @Label("attributed with bi-digits") public static void divisionLevel3() throws IOException {
            for (int k = 0; k < numberOfQuestion; k++) {
                firstNumber = 10 + randomNumbers.nextInt(20);
                secondNumber = 10 + randomNumbers.nextInt(20);
                if(firstNumber < secondNumber){
                    firstNumber = firstNumber ^ secondNumber ^ (secondNumber = firstNumber);
                }
                answer = Math.abs(firstNumber/secondNumber);
                remainder = firstNumber % secondNumber;
                askDivisionQuestionsAndTakeInput();
                checkAndCompareDivisionAnswer();
            }
            if (Integer.parseInt(quizToTake) == 5){
                calculateAnyQizIterables();}
            else {
                calculateDivisionIterables();}
        }
        @Label("computes division iterables") public static void calculateDivisionIterables() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            percentage = correctCount * 100 / numberOfQuestion;
            System.out.printf("%n%s%d%n%s%d%n%s%.2f%n", "Correct count -> ", correctCount,
                    "Wrong count -> ", wrongCount, "Percentage -> %", percentage);
            if(percentage < 75){
                System.out.println("Please ask your teacher for extra help");
                System.out.println("Press 'Y' to reset");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    startDivisionQuiz();
                }
            }
            else {
                if(divisionLevel == 3){
                    System.out.println("Congratulations!");}
                else {
                    System.out.println("Congratulations you are ready to go to another level");}
                System.out.println("Press 'Y' to continue or any key to quit");
                if (scan.readLine().equalsIgnoreCase("Y")) {
                    correctCount=0;wrongCount=0;percentage=0;
                    divisionLevel++;
                    startDivisionQuiz();
                }
            }
        }
        @Label("prompt") public static void askDivisionQuestionsAndTakeInput() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("What is "+firstNumber+" divided by "+secondNumber+" ? : ");
            userAnswer = scan.readLine();
            System.out.print(" remainder : ");
            userRemainder = scan.readLine();
        }
        @Label("continuation condition") public static void checkAndCompareDivisionAnswer() throws IOException {
            if(userAnswer.equals(String.valueOf(answer)) && userRemainder.equals(String.valueOf(remainder))){
                generateRightResponse();
                correctCount = correctCount + 1;
            }
            else {
                while(!userAnswer.equals(String.valueOf(answer)) || !userRemainder.equals(String.valueOf(remainder))) {
                    generateErrorResponse();
                    askDivisionQuestionsAndTakeInput();
                }
                wrongCount++;
                generateRightResponse();
            }
        }
        @Label("computes iterables for any quiz") public static void calculateAnyQizIterables() throws IOException {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            percentage = correctCount / numberOfQuestion;
            System.out.printf("%n%s%d%n%s%d%n%s%.2f%n", "Correct count -> ", correctCount,
                    "Wrong count -> ", wrongCount, "Percentage -> %", percentage);
            if(percentage < 75){
                System.out.println("Please ask your teacher for extra help");
                System.out.println("Press 'Y' to continue or any key to quit");}
            else {
                System.out.println("Congratulations!");
                System.out.println("Press 'Y' to continue or any key to quit");}
            if (scan.readLine().equalsIgnoreCase("Y")) {
                correctCount=0;wrongCount=0;
                startAnyQuiz();
            }
        }
        @Label("random response for right answers")public static void generateRightResponse(){
            int num = randomNumbers.nextInt(4);
            String[] responses = {"Correct", " right", "Excellent","Continue the good work"};
            System.out.println(responses[num]);
        }
        @Label("random response for wrong answers")public static void generateErrorResponse(){
            int num = randomNumbers.nextInt(4);
            String [] responses = {"No please try again","Wrong try once more","Dont give up!","No,keep trying"};
            System.out.println(responses[num]);
        }

}
