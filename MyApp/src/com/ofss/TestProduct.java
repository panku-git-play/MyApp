package com.ofss;

public class TestProduct {

	public TestProduct() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Stock stock = new Stock(123,"ORCL",  129.56f); 
		System.out.println(stock);
		
		Customer cust = new Customer();
		cust.customerName = "New Cust 1";
		
		Stock[] tempstocks = new Stock[3];
		
			tempstocks[0].stockId = 101;
			tempstocks[0].stockName = "ABC Ltd.";
			tempstocks[0].stockPrice = 29.5f;
		
			tempstocks[0].stockId = 102;
			tempstocks[0].stockName = "IJK Ltd.";
			tempstocks[0].stockPrice = 11.43f;
			
			tempstocks[0].stockId = 103;
			tempstocks[0].stockName = "XYZ Ltd.";
			tempstocks[0].stockPrice = 117.05f;
		    
			cust.stocks = tempstocks;
			
			System.out.println(cust);
	}

} 
