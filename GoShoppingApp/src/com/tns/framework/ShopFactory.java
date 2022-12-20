package com.tns.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, Float charges, Boolean isPrime) ;
	public abstract NormalAcc getNewNormalAccount(int AccNo, String accNm, Float charges);
	}
