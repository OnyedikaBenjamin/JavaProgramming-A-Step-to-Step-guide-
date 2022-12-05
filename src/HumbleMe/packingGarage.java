package HumbleMe;

import java.util.Scanner;

public class packingGarage {
    static double sumTotal;
            static int numberOfCustomers;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many customers parked in the garage? -> ");
        numberOfCustomers = input.nextInt();

        int[] customers = new int[numberOfCustomers], hoursParked = new int[customers.length];
        double[] charges = new double[customers.length];

        for (int k = 0; k < customers.length; k++) {

            System.out.println("How many hours did Customer-" + k + " parked");
            if (hoursParked[k] <= 24) {
                hoursParked[k] = input.nextInt();
            }
                while(hoursParked[k] > 24) {
                    System.out.println("Customer cannot park more than 24 hours a day!!");
                    break;
                }
            }

        computeData(customers, hoursParked, charges);
        printReceipt(numberOfCustomers, hoursParked, charges);
    }
    private static void printReceipt(int numberOfCustomers, int[] hoursParked, double[] charges) {
        System.out.println("Cust. ID | " + " Hours-Parked |" + " Cost of Parking Service");
        for (int j = 0; j < numberOfCustomers; j++) {
            if(hoursParked[j] > 9){
                System.out.println("   " + (j + 1) + "     |      " + hoursParked[j] + "       |      " + charges[j]);
            }
            else {
                System.out.println("   " + (j + 1) + "     |      " + hoursParked[j] + "        |      " + charges[j]);
            }
        }
        System.out.println("_________________________________________________");
        System.out.println("Total($) | ------------> |      $" + sumTotal +".");
    }

    private static void computeData(int[] customers, int[] hoursParked, double[] charges) {
        sumTotal =0;
        for (int element = 0; element < hoursParked.length; element++) {     // loop through the hours parked
            if (hoursParked[element] < 4) {  // if the hours parked is less than 3
                charges[element] = 2;      // Then the charges is $2
            }
            else {
                double increment =0;
                for(int i = 0; i < hoursParked[element]-3; i++){
                    increment += 0.5;
                }
                if(increment > 8){
                    charges[element] = 10;
                }
                else { charges[element] = 2 + increment;}
            }
        }
        for(int e = 0; e < customers.length; e++){
            sumTotal += charges[e];
        }
    }
}