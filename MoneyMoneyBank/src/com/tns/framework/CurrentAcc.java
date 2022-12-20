package com.tns.framework;

public abstract class CurrentAcc  extends BankAcc{
	private final float creditLimit=500000;
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
			}
	public float getcreditLimit()
	{
		return creditLimit;
	}
	public void withdraw(float  creditLimit)
	{
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}