package com.guidme.corejava.abstraction.banks;

import com.guidme.corejava.abstraction.common.Bank;
import com.guidme.corejava.abstraction.dtos.TransactionDTO;

public class BankTestClient {

	public static void main(String[] args) throws Exception {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setAccountNumber(123456);
		transactionDTO.setCustomerName("Arun");
		Bank cb = new CitiBank(transactionDTO);
		TransactionDTO response = cb.depositAmount(1503);
		System.out.println(response);
		cb.viewBalance(response);
	}

}
