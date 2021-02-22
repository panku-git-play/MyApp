package com.ofss;

public class Stock {
	int stockId;
	String stockName;
	float stockPrice;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param stockId
	 * @param stockName
	 * @param stockPrice
	 */
	public Stock(int stockId, String stockName, float stockPrice) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	/**
	 * @return the stockId
	 */
	public int getStockId() {
		return stockId;
	}

	/**
	 * @param stockId the stockId to set
	 */
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return the stockPrice
	 */
	public float getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice the stockPrice to set
	 */
	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", stockPrice=" + stockPrice + "]";
	}




}
