package _9_ObjectsAndClasses;

import java.util.ArrayList;

public class Factors {

    /** Write a function that finds the number of factors  of a given number  */

    public static int findFactorsOfNumber(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int factorsCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
                factorsCount++;
            }
        }
        return factorsCount;
    }

    /**    Write a function that finds the number of primes of a given number    */

    public static int findPrimeOfNumber(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        int primeCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i != 0) {
                primeNumbers.add(i);
                primeCount++;
            }
        }
        return primeCount;
    }

    /** Write a function that finds the maximum of a given set of number */
    public static int maximumOfList(int[] arrayList) {
        int maximum = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > maximum)
                maximum = arrayList[i];
        }
        return maximum;
    }

    /** Write a function that finds the minimum of a given set of number */
    public static int minimumOfList(int[] arrayList) {
        int minimum = 1000000000;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] < minimum)
                minimum = arrayList[i];
        }
        return minimum;
    }

    // TODO : Write a program that takes a List of numbers, take away each element of the List and calculate the total
    //        of the remaining numbers in the list. then find the maximum and minimum of the totals after the second
    //        implementation.

    public static void crazyMaximum(int[] arrayList) {

        int sum = 0;
        int maxCount = 0;
        int max = 0;
        int individualSum = 0;
        ArrayList<Integer> individualSumList = new ArrayList<Integer>();


        for (int i = 0; i < arrayList.length; i++) {
            sum += arrayList[i];
        }
            for (int j = 0; j < arrayList.length; j++) {
                individualSum = sum - arrayList[j];

                individualSumList.add(individualSum);
            }

                for (int k = 0; k < individualSumList.size(); k++) {
                    if (individualSumList.get(k) > max) {
                        max = individualSumList.get(k);
                    }
                }
                System.out.println("The maximum of the crazy maximums is " + max);
            }



    public static void crazyMinimum(int[] arrayList) {

        int sum = 0;
        int maxCount = 0;
        int min = 1000000000;    // Here I created a sentinel value that initializes the greatest minimum integer we can imagine.
        int individualSum = 0;
        ArrayList<Integer> individualSumList = new ArrayList<>();


        for (int i = 0; i < arrayList.length; i++) {             // I first got the sum of the elements in my arrayList.
            sum += arrayList[i];
        }
        for (int j = 0; j < arrayList.length; j++) {           // Then I got the sum of the values after excluding each element of the list.
            individualSum = sum - arrayList[j];

            individualSumList.add(individualSum);           // After getting the values, I added them to an arrayList
        }

        for (int k = 0; k < individualSumList.size(); k++) {
            if (individualSumList.get(k) < min) {
                min = individualSumList.get(k);
            }
        }
        System.out.println("The minimum of the crazy maximums is " + min);
    }



//----- Here I did my testing for each of the methods.

    public static void main(String[] args) {

  int []arrayList = {2,3,1,5,4};

        System.out.println("The maximum of the list is "+maximumOfList(arrayList));
        System.out.println("The minimum of the list is "+minimumOfList(arrayList));

        crazyMaximum(arrayList);
        crazyMinimum(arrayList);
    }
}