// Write a program that calculates the sales tax of a given goods at a tax rate of 6%

package _2_ElementaryProgramming;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {

        final double taxRate = 6;
        double priceOfGoods;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the Goods : ");
        priceOfGoods = input.nextDouble();


        double salesTax = taxRate/100 * priceOfGoods;

        System.out.println("The sales tax for a goods worth $" + priceOfGoods + " is $" + salesTax);


    }
}
