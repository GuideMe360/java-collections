package com.guidme.corejava.abstraction.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransactionDTO {
	private String customerName;
	private Integer accountNumber;
	private Integer balance;
	private Integer depositAmt;
	private Integer withdrawAmt;
	private String error;

	public TransactionDTO(String customerName, Integer accountNumber, Integer balance, Integer depositAmt, Integer withdrawAmt, String error) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.depositAmt = depositAmt;
		this.withdrawAmt = withdrawAmt;
		this.error = error;
	}

	public TransactionDTO() {

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(Integer depositAmt) {
		this.depositAmt = depositAmt;
	}

	public Integer getWithdrawAmt() {
		return withdrawAmt;
	}

	public void setWithdrawAmt(Integer withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "TransactionDTO [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance=" + balance + ", depositAmt=" + depositAmt + ", withdrawAmt=" + withdrawAmt + ", error=" + error + "]";
	}

}
