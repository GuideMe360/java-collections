package com.guidme.corejava.abstraction.banks;

import com.guidme.corejava.abstraction.common.Bank;
import com.guidme.corejava.abstraction.dtos.RegisterUser;
import com.guidme.corejava.abstraction.dtos.TransactionDTO;

public class BankOfAmerica extends Bank {

	TransactionDTO transactionDTO = new TransactionDTO();

	BankOfAmerica(TransactionDTO transactionDTO) {
		this.transactionDTO = transactionDTO;
	}

	@Override
	public TransactionDTO getBalance(Integer accountNumber) {
		if (transactionDTO.getAccountNumber() == accountNumber) {
			transactionDTO.setBalance(transactionDTO.getBalance());
		}
		return transactionDTO;
	}

	@Override
	public TransactionDTO depositAmount(Integer depositAmount) {
		Integer balance = transactionDTO.getBalance() != null ? transactionDTO.getBalance() : 0;
		Integer total = 0;
		if (balance != null) {
			total = balance + depositAmount;
		}
		transactionDTO.setBalance(total);
		return transactionDTO;
	}

	@Override
	public TransactionDTO withdrawAmout(Integer withdrawAmont) throws Exception {
		Integer balance = transactionDTO.getBalance() != null ? transactionDTO.getBalance() : 0;
		Integer total = 0;
		if (balance < withdrawAmont) {
			throw new Exception("Insufficient Fund");
		} else {
			total = balance + withdrawAmont;
		}

		if (withdrawAmont > 15000) {
			int serviceCharge = Bank.serviceCharge;
			total = total + serviceCharge;
		}

		transactionDTO.setBalance(total);
		return transactionDTO;
	}

	@Override
	public void addCustomer(RegisterUser user) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
