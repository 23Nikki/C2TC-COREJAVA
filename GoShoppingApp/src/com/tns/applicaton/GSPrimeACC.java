package com.tns.applicaton;
import com.tns.framework.PrimeAcc;

public class GSPrimeACC extends PrimeAcc{

	private static final float charges=0;
	public GSPrimeACC(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float charges)
	{
	System.out.println("dear prime users,your product charges are"+getCharges()+"shipping charges"+getDelivaryCharges());	
	}
	@Override
	public String toString() {
		return "GSPrimeACC [isPrime=" + isPrime() + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}