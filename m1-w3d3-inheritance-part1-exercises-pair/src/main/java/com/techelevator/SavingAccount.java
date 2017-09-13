package com.techelevator;

public class SavingAccount extends BankAccount {

	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {

		if (this.getBalance().isLessThan(amountToWithdraw)) {
			return this.getBalance();
		}else if (this.getBalance().isLessThan(new DollarAmount(15000))){
			super.withdraw(amountToWithdraw.plus(new DollarAmount(200)));

		} else {
			super.withdraw(amountToWithdraw);
			return this.getBalance();
		}

		return this.getBalance();


	}
}
