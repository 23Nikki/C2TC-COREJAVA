package com.tns.framework;

public abstract class SavingAcc  extends BankAcc{
	
	private boolean isSalary;
	private static final float creditLimit=15000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.setSalary(isSalary);
	}
	public float getcreditLimit()
	{
		return creditLimit;
	}
	public void withdraw(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary() + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	
}
