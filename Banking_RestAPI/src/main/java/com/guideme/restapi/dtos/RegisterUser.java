package com.guideme.restapi.dtos;

public class RegisterUser {
	private String customerName;
	private String address;
	private String email;
	private String city;
	private String mobile;
	private String pincode;

	public RegisterUser(String customerName, String address, String email, String city, String mobile, String pincode) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.city = city;
		this.mobile = mobile;
		this.pincode = pincode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "RegisterUser [customerName=" + customerName + ", address=" + address + ", email=" + email + ", city=" + city + ", mobile=" + mobile + ", pincode=" + pincode + "]";
	}

}
