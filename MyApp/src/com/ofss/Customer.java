package com.ofss;

import java.util.Arrays;

public class Customer {
	
	String	customerName;
	Stock[] stocks;
	

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", stocks=" + Arrays.toString(stocks) + ", getCustomerName()="
				+ getCustomerName() + ", getStocks()=" + Arrays.toString(getStocks()) + "]";
	}


	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	/**
	 * @return the stocks
	 */
	public Stock[] getStocks() {
		return stocks;
	}


	/**
	 * @param stocks the stocks to set
	 */
	public void setStocks(Stock[] stocks) {
		this.stocks = stocks;
	}


	/**
	 * @param customerName
	 * @param stocks
	 */
	public Customer(String customerName, Stock[] stocks) {
		this.customerName = customerName;
		this.stocks = stocks;
	}


	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
