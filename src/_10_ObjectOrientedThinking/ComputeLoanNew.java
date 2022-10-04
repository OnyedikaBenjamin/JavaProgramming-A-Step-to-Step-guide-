package _10_ObjectOrientedThinking;

import java.util.Date;
public class ComputeLoanNew {

    private double annualInterest;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    public ComputeLoanNew() {         // Default constructor
        this(0, 0, 0);
    }
    public ComputeLoanNew(double annualInterest, int numberOfYears, double loanAmount){   // to construct an object with specified fields.
    this.annualInterest = annualInterest;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
    }
    public void setAnnualInterest(double annualInterest) {
        validateAnnualInterest(annualInterest);
        this.annualInterest = annualInterest;
    }
    private void validateAnnualInterest(double annualInterest) {
        if (annualInterest < 0) throw new IllegalArgumentException
                (String.format("%s", "Annual Interest cannot be less than 0"));
    }public void setNumberOfYears(int numberOfYears) {
        validateNumberOfYears(numberOfYears);
        this.numberOfYears = numberOfYears;
    }private void validateNumberOfYears(int numberOfYears) {
        if (numberOfYears < 1) throw new IllegalArgumentException
                (String.format("%s", "Number of years cannot be less than 1"));
    }public void setLoanAmount(double loanAmount) {
        validateLoanAmount(loanAmount);
        this.loanAmount = loanAmount;
    }private void validateLoanAmount(double loanAmount) {
        if (loanAmount < 0) throw new IllegalArgumentException
                (String.format("%s","Loan amount cannot be less than 0"));
    }public double getAnnualInterest() {
        return annualInterest;
    }public int getNumberOfYears() {
        return numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public Date getLoanDate() {
        return loanDate;
    }
    public double getMonthlyInterestRate(){
       double monthlyInterestRate;
        monthlyInterestRate = getAnnualInterest() / 1200;
        return monthlyInterestRate;
    }public double getMonthlyPayment(){
        double monthlyPayment;
        monthlyPayment = getLoanAmount() * getMonthlyInterestRate() / (1
                 - 1 / Math.pow(1 + getMonthlyInterestRate(), getNumberOfYears()* 12));
        return Math.round(monthlyPayment);
    }public double getTotalPayment(){
        double totalPayment;
        totalPayment = getMonthlyPayment() * getNumberOfYears() * 12;
        return Math.round(totalPayment);
    }public static void main(String[] args) {
        ComputeLoanNew loan1 = new ComputeLoanNew(2.5, 5, 1000);
        loan1.setAnnualInterest(2.5);
        loan1.setNumberOfYears(5);
        loan1.setLoanAmount(1000);
        System.out.println("The loan was created on " +  loan1.getLoanDate());
        System.out.printf("%s %f %n", "The monthly payment is ", loan1.getMonthlyPayment());
        System.out.printf("%s %f ", "The total payment is ",  loan1.getTotalPayment());
    }

}