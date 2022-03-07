package com.mortgage.managerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
@Entity
@Table(name = "customerDetails")
public class CustomerDetails {
	
	@Id
	@Column(name = "customer_id")
	@ApiModelProperty(notes = "ID of the customer",name="customerId",required=false,value="Auto generated")
	private int customerId;
	
	@Column(name = "mobile_no")
	@ApiModelProperty(notes = "Mobile Number of the customer",name="mobile",required=true,value="Accept only 10 digits")
	private int mobileNo;
	
	@Column(name = "email_id")
	@ApiModelProperty(notes = "Email of the customer",name="email",required=true,value="test email")
	private String emailId;
	
	@Column(name = "adhar_card")
	@ApiModelProperty(notes = "AdharCard of the customer",name="AdharCard",required=true,value="Accept only 12 digit")
	private int adharCard;
	
	@Column(name = "pan_card")
	@ApiModelProperty(notes = "PanCard of the customer",name="PanCard",required=true,value="Accept only 10 value")
	private String panCard;
	
	@Column(name = "acc_no")
	@ApiModelProperty(notes = "accNo of the customer",name="accNo",required=true,value="Accept only number")
	private String accNo;
	
	public CustomerDetails() {
		super();
	
	}
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(int adharCard) {
		this.adharCard = adharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	

}
