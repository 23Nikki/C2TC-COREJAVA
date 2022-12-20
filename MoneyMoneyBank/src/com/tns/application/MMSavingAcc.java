package com.tns.application;
import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	private static final float accBal=0;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
	{
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal)
	{
	System.out.println("Dear Saving User,your Account Balance is="+" "+accBal+" "+"and credit limit is="+" "+getcreditLimit());	
	}
	@Override
	public String toString() {
		return "GSPrimeACC [isSalary=" + isSalary() + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
