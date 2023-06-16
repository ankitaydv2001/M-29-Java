package org.tnsif.application;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;
import org.tnsif.framework.BankFactory;
public class MMBankFactory extends BankFactory{
	
	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, Float accBal, boolean isSalaried) {
			MMSavingAcc s = new MMSavingAcc(accNo,  accNm,  accBal, isSalaried);
			return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, Float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(accNo,  accNm,  accBal, creditLimit);
		return c;

	}

}