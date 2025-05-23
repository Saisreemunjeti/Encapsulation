package com.encapsulation;

public class CreditCardAccount {
	    private String customerName;
	    private double creditLimit;
	    private double currentDebt;
	    private double interestRate;

	    public CreditCardAccount(String customerName, double creditLimit, double interestRate, double currentDebt) {
	        this.customerName = customerName;
	        this.creditLimit = creditLimit;
	        this.interestRate = interestRate;
	        this.currentDebt = currentDebt;
	    }

	    public String getcustomerName() {
	        return customerName;
	    }

	    public double getcreditLimit() {
	        return creditLimit;
	    }

	    public double getcurrentDebt() {
	        return currentDebt;
	    }

	    public double getinterestRate() {
	        return interestRate;
	    }

	    public void setcustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public void setcreditLimit(double creditLimit) {
	        this.creditLimit = creditLimit;
	    }

	    public void setCurrentDebt(double currentDebt) {
	        this.currentDebt = currentDebt;
	    }

	    public void setInterestRate(double interestRate) {
	        this.interestRate = interestRate;
	    }

	    public void swipeCard(double amount) {
	        if (amount > creditLimit) {
	            System.out.println("Transaction declined: Limit exceeded");
	        } else {
	            currentDebt += amount;
	            System.out.println("Transaction approved: " + amount);
	            System.out.println("New debt: " + currentDebt);
	        }
	    }

	    public void makePayment(double amount) {
	        if (amount > currentDebt) {
	            System.out.println("Excess payment not allowed");
	        } else {
	            currentDebt -= amount;
	            System.out.println("Payment of " + amount + " successful.");
	            System.out.println("Remaining debt: " + currentDebt);
	        }
	    }

	    public void applyInterest() {
	        double interest = currentDebt * (interestRate / 100);
	        currentDebt += interest;
	        System.out.println("Interest of " + interest + " applied.");
	        System.out.println("Total debt after interest: " + currentDebt);
	    }

	    public static void main(String[] args) {
	        CreditCardAccount card = new CreditCardAccount("Saisree", 143600, 3.4, 3760);

	        card.swipeCard(10000);
	        card.swipeCard(30000);

	        card.makePayment(2000);
	        card.makePayment(40000);

	        card.applyInterest();
	    }
	}

