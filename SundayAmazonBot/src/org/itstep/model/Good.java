package org.itstep.model;

/**
 * 
 * @author Dmitriy
 *
 */
public class Good {
	private String asin;
	private String name;
	private String shopUrl;

	// alt +shift +s
	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	public Good() {
		// TODO Auto-generated constructor stub
	}

	public Good(String asin, String name, String shopUrl) {
		this.asin = asin;
		this.name = name;
		this.shopUrl = shopUrl;
	}
	

}
