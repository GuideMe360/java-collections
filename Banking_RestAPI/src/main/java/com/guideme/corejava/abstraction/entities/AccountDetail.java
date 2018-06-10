package com.guideme.corejava.abstraction.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the ACCOUNT_DETAIL database table.
 * 
 */
@Entity
@Table(name="ACCOUNT_DETAIL")
@NamedQuery(name="AccountDetail.findAll", query="SELECT a FROM AccountDetail a")
public class AccountDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOUNT_DETAIL_ID")
	private long accountDetailId;

	@Column(name="ACCOUNT_TYPE")
	private String accountType;

	//bi-directional many-to-one association to CustomerDetail
	@ManyToOne
	@JoinColumn(name="CUSTOMER_DETAIL_ID")
	private CustomerDetail customerDetail;

	public AccountDetail() {
	}

	public long getAccountDetailId() {
		return this.accountDetailId;
	}

	public void setAccountDetailId(long accountDetailId) {
		this.accountDetailId = accountDetailId;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public CustomerDetail getCustomerDetail() {
		return this.customerDetail;
	}

	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}

}