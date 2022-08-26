package Others;

import java.util.Date;
public class ComputeLoanNew {

    private double annualInterest;
    private int numberOfYears;
    private double loanAmount;
    java.util.Date date = new java.util.Date();
    public ComputeLoanNew(double annualInterest, int numberOfYears, double loanAmount){
    this.annualInterest = annualInterest;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    }
    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getAnnualInterest() {
        return annualInterest;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public Date getDate() {
        return date;
    }
    public double getMonthlyInterestRate(){
       double monthlyInterestRate;
        monthlyInterestRate = getAnnualInterest() / 1200;
        return monthlyInterestRate;
    }
    public double getMonthlyPayment(){
        double monthlyPayment;
        monthlyPayment = getLoanAmount() * getMonthlyInterestRate() / (1
                 - 1 / Math.pow(1 + getMonthlyInterestRate(), getNumberOfYears()* 12));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment;
        totalPayment = getMonthlyPayment() * getNumberOfYears() * 12;
        return totalPayment;
    }
    public static void main(String[] args) {

        ComputeLoanNew loan1 = new ComputeLoanNew(2.5, 5, 1000);
        loan1.setAnnualInterest(2.5);
        loan1.setNumberOfYears(5);
        loan1.setLoanAmount(1000);
        System.out.println("The loan was created on " +  loan1.getDate());
        System.out.printf("%s %.2f %n", "The monthly payment is ", loan1.getMonthlyPayment());
        System.out.printf("%s %.2f ", "The total payment is ",  loan1.getTotalPayment());
    }


}
