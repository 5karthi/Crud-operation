package com.bank_management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long account_number;
	
	
	@Column
	private String account_holder_name;
	
	
	
	@Column
	private Double account_balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}



	public Account(String account_holder_name, Double account_balance) {
		super();
		this.account_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}



	public long getAccount_number() {
		return account_number;
	}



	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}



	public String getAccount_holder_name() {
		return account_holder_name;
	}



	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}



	public Double getAccount_balance() {
		return account_balance;
	}



	public void setAccount_balance(Double account_balance) {
		this.account_balance = account_balance;
	}



	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", account_holder_name=" + account_holder_name
				+ ", account_balance=" + account_balance + "]";
	}
	
	
	
	
}
