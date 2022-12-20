package com.tns.framework;

public abstract class ShopAcc {
	protected int accNo ;
	protected String accNm; 
	protected float charges;
	
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public int getACCNo()
	{
		return accNo;
	}
	public String getAccNm()
	{
		return accNm;
	}
	public String SetAccNm(String accNm)
	{
		return accNm;
	}
	public float getCharges()
	{
		return charges;
	}
	
	public void bookProduct(float charges)
	{
		
	}
	public void items(float charges) 
	{
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}