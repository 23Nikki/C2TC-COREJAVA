package com.tns.framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAccount(int AccNo, String accNm, Float accBal, Boolean isSalary) ;
	public abstract CurrentAcc getNewCurrentAccount(int AccNo, String accNm, Float accBal);
	}
