/**
 * 
 */
package com.guideme.restapi.common;

import com.guideme.restapi.dtos.RegisterUser;
import com.guideme.restapi.dtos.TransactionDTO;

/**
 * @author Arun
 *
 */
public abstract class Bank {
	public abstract TransactionDTO getBalance(Integer accountNumber) throws Exception;

	public abstract TransactionDTO depositAmount(Integer customer) throws Exception;

	public abstract TransactionDTO withdrawAmout(Integer customer) throws Exception;

	public void viewBalance(TransactionDTO customer) {
		System.out.println(String.format("Account Number :%s - Balance :%s", customer.getAccountNumber(), customer.getBalance()));
	};

	public static final Integer serviceCharge = 1000;

	public abstract void addCustomer(RegisterUser user) throws Exception;
}
