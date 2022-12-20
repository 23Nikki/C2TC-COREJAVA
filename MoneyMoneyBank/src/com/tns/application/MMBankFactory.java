package com.tns.application;

import com.tns.framework.SavingAcc;
import com.tns.framework.CurrentAcc;
import com.tns.framework.BankFactory;

public class MMBankFactory extends BankFactory
{
SavingAcc acc1;
CurrentAcc acc2;
	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, Float accBal, Boolean isSalary) 
	{
		acc1=new MMSavingAcc(AccNo,accNm,accBal,isSalary);
		return acc1;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, Float accBal)
	{
		acc2=new MMCurrentAcc(AccNo,accNm,accBal);
		return acc2;
	
    }
}
