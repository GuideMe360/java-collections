/**
 * 
 */
package com.guidme.corejava.abstraction.common;

import com.guidme.corejava.abstraction.dtos.RegisterUser;
import com.guidme.corejava.abstraction.dtos.TransactionDTO;

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
