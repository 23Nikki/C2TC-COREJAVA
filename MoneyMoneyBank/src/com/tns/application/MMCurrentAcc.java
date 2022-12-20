package com.tns.application;
import com.tns.framework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw (float accBal)
	{
		System.out.println("Dear Current User,Your account Balance is="+" "+accBal+" "+"and credit limit is="+" "+getcreditLimit());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
