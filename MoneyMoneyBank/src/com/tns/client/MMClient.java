package com.tns.client;

import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.application.MMBankFactory;

public class MMClient {

	public static void main(String[] args) {
		MMBankFactory factory=new MMBankFactory();
		MMCurrentAcc gsn=(MMCurrentAcc)factory.getNewCurrentAccount(895581212, "Zakaur", 6040.00f);
		gsn.withdraw(gsn.getAccBal());
		MMSavingAcc gsp=(MMSavingAcc) factory.getNewSavingAccount(1218529622, "Rahman", 5000.00f, true);
		gsp.withdraw(gsp.getAccBal());
	}

}
