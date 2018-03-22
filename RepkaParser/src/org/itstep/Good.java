package org.itstep;

public class Good {
	private String name;
	private String logUrl;
	private final String currency = "UAH";
	private int price;
	private String productLink;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogUrl() {
		return logUrl;
	}
	public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductLink() {
		return productLink;
	}
	public void setProductLink(String productLink) {
		this.productLink = productLink;
	}
	public String getCurrency() {
		return currency;
	}
	public Good() {
		
	}
	public Good(String name, String logUrl, int price, String productLink) {
		this.name = name;
		this.logUrl = logUrl;
		this.price = price;
		this.productLink = productLink;
	}
	
}
