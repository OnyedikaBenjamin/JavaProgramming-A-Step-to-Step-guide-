package Dietel_Exercise;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    private String name, pin;
    private double balance;


    public Account(String customerName, String userPin) {
       name = customerName;
       pin = userPin;
       balance = 0.00;
    }

    public static void main(String[] args) {
        Account customer1 = new Account("Benjamin","blackT");
        customer1.depositMoney();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public double showBalance() {
        System.out.println("Enter your pin");
        if(isValid(input.nextLine())){
            return balance;
        }
        else throw new IllegalArgumentException("Invalid pin");
    }

    public void changePin() {
        System.out.println("Enter the old pin");
        if (isValid(input.nextLine())) {
            System.out.println("Input the new pin");
            this.pin = input.nextLine();
        } else throw new IllegalArgumentException("Invalid pin!!");
    }

    public void depositMoney() {
        System.out.print("Input your pin\n : ");
        String userInput = input.nextLine();
        for(int i =0; i<1000; i++){
            System.out.println("Validating pin...");
        }
        if (isValid(userInput)) {
            System.out.print("How much do you want to deposit?? -> $");
            int depositAmount = input.nextInt();
            validateDeposit(depositAmount);
            balance = balance + depositAmount;
            for(int i =0; i<30000; i++){
                System.out.println("Sending request...");
            }
            System.out.println("Deposit successful!");
        } else throw new IllegalArgumentException("Invalid pin");
    }

    public void withdrawMoney() {
        System.out.println("Input your pin");
        if (isValid(input.nextLine())) {
            System.out.print("How much do you want to withdraw?? -> $");
            int withdrawalAmount = input.nextInt();
            validateWithdrawal(withdrawalAmount);
            balance = balance - withdrawalAmount;
        }
    }

    public boolean isValid(String pin) {
        return pin.equals(getPin());
    }

    public void validateDeposit(double depositAmount) {
        if (depositAmount < 1) {
            throw new IllegalArgumentException("Deposit amount cannot be less than 1");
        }
    }

    public void validateWithdrawal(int withdrawalAmount) {
        if (withdrawalAmount > balance || withdrawalAmount < 1) {
            throw new IllegalArgumentException("invalid withdrawal Amount");
        }
    }


}
