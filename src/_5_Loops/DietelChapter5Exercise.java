  // Write an application that finds the minimum and maximum amongst several
 //  integers and then computes the sum of the two extremes. The user will be prompted to input how
//   many values the application should ask the user to input.

package _5_Loops;

  import java.util.Scanner;

  public class DietelChapter5Exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numberOfIntegers : ");
        int numberOfIntegers = input.nextInt();
        int maxOfNumbers = 0;
        int minOfNumbers = 1000000000;
        for (int i =1; i <=numberOfIntegers ; i++) {
            System.out.println("Enter number" + i);
            int number = input.nextInt();

            if(number > maxOfNumbers){
                maxOfNumbers = number;
            }
            if(number < minOfNumbers){
                minOfNumbers = number;
            }
        }
        System.out.println("The maximum of the numbers is " + maxOfNumbers);
        System.out.println("The minimum of the numbers is " + minOfNumbers);
        System.out.println("The sum of the maximum and minimum of the two extremes is " + (maxOfNumbers + minOfNumbers));
    }
}
