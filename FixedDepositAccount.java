package com.encapsulation;

public class FixedDepositAccount {
	private String customerName;
	private double principalAmount;
	private double interestRate;
	private int duration;
	private double maturityAmount;
	
	public FixedDepositAccount(String customerName,double principalAmount,double interestRate,int duration,double maturityAmount) {
		this.customerName = customerName;
		this.principalAmount=principalAmount;
		this.duration=duration;
		this.maturityAmount=maturityAmount;
		System.out.println("\"Fixed Deposit Created Successfully");
	}
	public String getcustomerName() {
		return customerName;
	}
	public double getprincipalAmount() {
		return principalAmount;
	}
	public double getinterestRate() {
		return interestRate;
	}
	public int getduration(){
		return duration;
	}
	public double maturityAmount() {
		return maturityAmount;
	}
	
	public void setcustomerName( String customerName) {
		this.customerName=customerName;
	}
	public void setPrincipalAmount(double principalAmount) {
		 this.principalAmount = principalAmount;
	 }
	 public void setInterestRate(double interestRate) {
		 this.interestRate = interestRate;
	 }
	 public void setDuration(int duration) {
		 this.duration = duration;
	 }
	 public void setMaturityAmount(double maturityAmount) {
		 this.maturityAmount = maturityAmount;
	 }
	 public void calculateMaturityAmount() {
		 maturityAmount = principalAmount * Math.pow((1 + interestRate / 100), duration);
	        System.out.println("Maturity Amount after " + duration + " years: " +  maturityAmount);
	    }
	 public void withdrawBeforeMaturity() {
		 if(duration<1) {
		  System.out.println("Cannot withdraw before one year");
		 } else {
			 double penalty = 0.02 * principalAmount;
	            double amountAfterPenalty = principalAmount - penalty;
	            System.out.println("Early Withdrawal: Penalty = " + penalty);
	            System.out.println("Amount after penalty = " + amountAfterPenalty);
		 }
	 }
		 public static void main(String [] args) {
			 FixedDepositAccount fixeddeposit= new FixedDepositAccount("Saisree",548990,1,3,5.0);
			 fixeddeposit.calculateMaturityAmount();
			 fixeddeposit.withdrawBeforeMaturity();
		 }
}