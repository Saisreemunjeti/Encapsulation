package com.encapsulation;

public class LoanApplication {
	
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outStandingBalance;
	
	LoanApplication(String customerName, double loanAmount, double interestRate, int loanTerm){
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
		this.outStandingBalance=outStandingBalance;
		System.out.println("Loan Application Submitted");
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public double getOutstandingBalance() {
		return outStandingBalance;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
    }
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm=loanTerm;
	}
	public void setOutstandingBalance(double outStandingBalance) {
		this.outStandingBalance=outStandingBalance;
	}
	public void makePayment(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid payment amount");
		}
		else if(amount > outStandingBalance) {
			System.out.println("Payment exceeds loan balance");
		}else {
		outStandingBalance -= amount;
			System.out.println("Amount:" +outStandingBalance);
		}
	}
		public double calculateEMI() {
			double monthlyRate = interestRate / (12 * 100);
			int months = loanTerm * 12;
			if (monthlyRate == 0) {
				return loanAmount / months;
			}
			double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
			return Math.round(emi * 100.0) / 100.0;
	}
		public void displayDetails() {
			System.out.println("Customer Name:" +customerName);
			System.out.println("Total Loan:" +loanAmount);
			System.out.println("Interest Rate:" +interestRate);
			System.out.println("EMI:" +calculateEMI());
			System.out.println("Remaining Balance:" +outStandingBalance);
		}
		public static void main(String[] args) {
			LoanApplication loan=new LoanApplication("Saisree", 100000.0, 3.0, 2);
			loan.displayDetails();
			loan.makePayment(3899);
			loan.displayDetails();
		}
}
	