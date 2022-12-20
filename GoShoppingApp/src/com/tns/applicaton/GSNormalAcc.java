package com.tns.applicaton;
import com.tns.framework.NormalAcc;
public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("dear Normal user,Your charges are"+charges+"with delivary charges is :"+getDelivaryCharges());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}