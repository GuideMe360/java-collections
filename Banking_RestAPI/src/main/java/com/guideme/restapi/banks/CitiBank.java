package com.guideme.restapi.banks;

import com.guideme.restapi.common.Bank;
import com.guideme.restapi.dtos.RegisterUser;
import com.guideme.restapi.dtos.TransactionDTO;

public class CitiBank extends Bank {

	TransactionDTO transactionDTO = new TransactionDTO();

	public CitiBank(TransactionDTO transactionDTO) {
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
			total = balance - withdrawAmont;
		}

		transactionDTO.setBalance(total);
		return transactionDTO;
	}

	@Override
	public void addCustomer(RegisterUser user) throws Exception {
		// TODO Auto-generated method stub
		
	}

}