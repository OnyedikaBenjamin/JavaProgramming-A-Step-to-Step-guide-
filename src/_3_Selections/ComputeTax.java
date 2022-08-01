/*   The United States federal personal income tax is calculated based on filing status and taxable income.
   There are four filing statuses: single filers, married filing jointly or qualified
widow(er), married filing separately, and head of household. The tax rates vary every year.
   If you are, say, single with a taxable income of $10,000,
the first $8,350 is taxed at 10% and the other $1,650 is taxed at 15%, so, your total tax is
$1,082.50.
  You are to write a program to compute personal income tax. Your program should prompt
        the user to enter the filing status and taxable income and compute the tax. Enter 0 for single
        filers, 1 for married filing jointly or qualified widow(er), 2 for married filing separately, and
        3 for head of household.  */

//   For each filing status there are six tax rates. Each rate is applied to a certain amount of
//    taxable income. For example, of a taxable income of $400,000 for single filers, $8,350 is
//     taxed at 10%, (33,950 – 8,350) at 15%, (82,250 – 33,950) at 25%, (171,550 – 82,250) at 28%,
//      (372,950 – 171,550) at 33%, and (400,000 – 372,950) at 35%.


package _3_Selections;

        import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Enter 0 for Single filters
                Enter 1 for Married filing jointly or qualified widow(er)
                Enter 2 for married filing separately
                Enter 3 for head of household
                :""");

        int status = input.nextInt();

        System.out.print("Enter your taxable income : $");
        double income = input.nextDouble();

        double tax =0;


//-------------------------------For Singles-------------------------------------------------//

        if (status == 0) {
            if (income <= 8350)
                tax = 0.10 * income;
            else if (income <= 33950)
                tax = (0.10 * 8350) + (0.15 * (income - 8350));
            else if (income <= 82250)
                tax = (0.15 * 33950) + (0.25 * (income - 33950));
            else if (income <= 171550)
                tax = (0.25 * 82250) + (0.28 * (income - 82250));
            else if (income <= 372950)
                tax = (0.28 * 171550) + (0.33 * (income - 171550));
            else
                tax = (0.33 * 372950) + (0.35 * (income - 372950));
        }

//----------------For Married filing jointly or qualified Widow(er)-----------------------------//

            if (status == 1 && income <= 16700) {
                tax = 0.10 * income;
            } else if (status == 1 && income <= 67900) {
                tax = (0.10 * 16700) + (0.15 * (income - 16700));
            } else if (status == 1 && income <= 137050) {
                tax = (0.15 * 16701) + (0.25 * (income - 16701));
            } else if (status == 1 && income <= 208850) {
                tax = (0.25 * 67901) + (0.28 * (income - 67901));
            } else if (status == 1 && income <= 372950) {
                tax = (0.28 * 137051) + (0.33 * (income - 137051));
            } else if (status == 1 && income > 372951) {
                tax = (0.33 * 208851) + (0.35 * (income - 208851));
            }


//------------------------For Married Separately----------------------------------------//

            if (status == 2) {
                if (income <= 8350)
                    tax = 0.10 * income;

                else if (income <= 33950)
                    tax = (0.10 * 8350) + (0.15 * (income - 8350));

                else if (income <= 68525)
                    tax = (0.15 * 33950) + (0.25 * (income - 33950));

                else if (income <= 104425)
                    tax = (0.25 * 68535) + (0.28 * (income - 68525));

                else if (income <= 186475)
                    tax = (0.28 * 104425) + (0.33 * (income - 104425));

                else if (income > 186476)
                    tax = (0.33 * 186475) + (0.35 * (income - 186475));

            }
//------------------------Head Of Household-------------------------------------------//

            if (status == 3) {
                if (income <= 11950)
                    tax = 0.10 * income;

                else if (income <= 45500)
                    tax = (0.10 * 11950) + (0.15 * (income - 11950));

                else if (income <= 117450)
                    tax = (0.15 * 45500) + (0.25 * (income - 45500));

                else if (income <= 190200)
                    tax = (0.25 * 117450) + (0.28 * (income - 117450));

                else if (income <= 372950)
                    tax = (0.28 * 190200) + (0.33 * (income - 190200));

                else if (income > 372951)
                    tax = (0.33 * 372950) + (0.35 * (income - 372950));

            }
            System.out.println("Your tax for an income of $" + income + " is $" + tax);
        }
    }

