package _7_SingleDimensionalArrays;
import jdk.jfr.Label;
import java.util.Scanner;

public class AnalyzeNumbers_MethodCall {
    static double average;
    static int []arrayList;
    static int noOfItems;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        startProgram();
    }
    public static void startProgram(){
        promptUser();
        findArrayAverage();
        checkAndPrint();
    }
    public static void promptUser(){
        System.out.print("Enter the numbers of values you want to compute -> ");
        input = new Scanner(System.in);
        arrayList = new int[input.nextInt()];
        for(int i = 0; i < arrayList.length; i++){
            System.out.printf("%s%d%s","Enter value ", i+1, " -> ");
            arrayList[i] = input.nextInt();
        }
    }
    public static void findArrayAverage(){
        int sum = 0;
        for(int i = 0; i < arrayList.length; i++){
            sum += arrayList[i];
        }
        average = (double) (sum / arrayList.length);
        System.out.println("The average is " + average);
    }
    @Label("Find the number of the Items greater than the average") public static void checkAndPrint(){
        int items = 0;
        for(int i = 0; i < arrayList.length; i++){
            if(arrayList[i] > average){
                noOfItems++;
            }
        }
        System.out.println("There are " + noOfItems + " items greater than the average");
    }


}
