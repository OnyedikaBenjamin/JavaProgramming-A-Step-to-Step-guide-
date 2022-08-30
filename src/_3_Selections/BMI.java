     //  Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated by
    //   taking your weight in kilograms and dividing it by the square of your height in meters.
 //______________________________________________________________________________________________________
        //   BMI   <  18.5        (Underweight)
       //    18.5  ≤  BMI < 25.0  (Normal)
      //     25.0  ≤  BMI < 30.0  (Overweight)
     //      30.0  ≤  BMI         (Obese)
//-------------------------------------------------------------------------------------------------------
   //    Write a program that prompts the user to enter a weight in pounds and height in inches and
  //     displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

package _3_Selections;

     import java.util.Scanner;

     public class BMI {

  // bmi      = weightKG / (height * height) in meters.
 //  1 pounds = 0.4535kg      that is to say   X.kg      =  inch * 0.45359237
//   1 inch   = 0.0254meters                   X.meters  =  inch * 0.0254


         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

             System.out.print("Enter the weight in pounds : ");
             double weightInPounds = input.nextDouble();
             double weightInKilogram = weightInPounds * 0.45359237;

             System.out.print("Enter height in inches : ");
             double heightInInches = input.nextDouble();
             double heightInMeters = heightInInches * 0.0254;

             double bmi = weightInKilogram / (heightInMeters * heightInMeters);
             System.out.println("BMI is " + bmi);

             if (bmi < 18.5)
                 System.out.println("Underweight");
              else if (18.5 <= bmi && bmi < 25.0)
                 System.out.println("Normal");
              else if (25.0 <= bmi && bmi < 30.0)
                 System.out.println("Overweight");
              else if (30.0 <= bmi)
                 System.out.println("Obese");

         }
     }
