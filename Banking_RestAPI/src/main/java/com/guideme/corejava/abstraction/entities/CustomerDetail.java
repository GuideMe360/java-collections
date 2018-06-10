package com.guideme.corejava.abstraction.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the CUSTOMER_DETAIL database table.
 * 
 */
@Entity
@Table(name = "CUSTOMER_DETAIL")
@NamedQuery(name = "CustomerDetail.findAll", query = "SELECT c FROM CustomerDetail c")
public class CustomerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUSTOMER_DETAIL_ID")
	private long customerDetailId;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CITY")
	private String city;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE")
	private BigDecimal mobile;

	@Column(name = "PINCODE")
	private String pincode;

	// bi-directional many-to-one association to AccountDetail
	@OneToMany(mappedBy = "customerDetail")
	private List<AccountDetail> accountDetails;

	public CustomerDetail() {
	}

	public long getCustomerDetailId() {
		return this.customerDetailId;
	}

	public void setCustomerDetailId(long customerDetailId) {
		this.customerDetailId = customerDetailId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getMobile() {
		return this.mobile;
	}

	public void setMobile(BigDecimal mobile) {
		this.mobile = mobile;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<AccountDetail> getAccountDetails() {
		return this.accountDetails;
	}

	public void setAccountDetails(List<AccountDetail> accountDetails) {
		this.accountDetails = accountDetails;
	}

	public AccountDetail addAccountDetail(AccountDetail accountDetail) {
		getAccountDetails().add(accountDetail);
		accountDetail.setCustomerDetail(this);

		return accountDetail;
	}

	public AccountDetail removeAccountDetail(AccountDetail accountDetail) {
		getAccountDetails().remove(accountDetail);
		accountDetail.setCustomerDetail(null);

		return accountDetail;
	}

}