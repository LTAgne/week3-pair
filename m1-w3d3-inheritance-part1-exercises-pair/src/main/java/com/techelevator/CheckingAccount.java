package com.techelevator;

public class CheckingAccount extends BankAccount {

	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		
		if(getBalance().minus(amountToWithdraw).getDollars() > - 100) {
			super.withdraw(amountToWithdraw);
			if(getBalance().isNegative()) {
				super.withdraw(new DollarAmount(1000));
			}
			
		}
		return getBalance();
		
//		if (amountToWithdraw.isGreaterThan(getBalance()) && amountToWithdraw.isLessThan(getBalance().plus(new DollarAmount(10000)))){
//			super.withdraw(amountToWithdraw.plus(new DollarAmount(1000)));
//			return getBalance();
//		} else if ((amountToWithdraw.isGreaterThan(getBalance()) && amountToWithdraw.isGreaterThan(getBalance().plus(new DollarAmount(10000))))){
//			return getBalance();
//		} else {
//			super.withdraw(amountToWithdraw);
//		}
//		return getBalance();
	}
}
		
				
		
