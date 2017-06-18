package com.example.terry.dmtools;

public class Deity {

	String deityName;
	String deityAlignment;
	String domain;
	String symbol;
	
	public Deity() {
		deityName = "none";
		deityAlignment = "none";
		domain = "none";
		symbol = "none";		
	}
	
	
	
	public Deity(String aName, String anAlignment, String aDomain, String aSymbol){
		deityName = aName;
		deityAlignment = anAlignment;
		domain = aDomain;
		symbol = aSymbol;
	}
	

	public String getDeityName() {
		return deityName;
	}

	public void setDeityName(String deityName) {
		this.deityName = deityName;
	}

	public String getDeityAlignment() {
		return deityAlignment;
	}

	public void setDeityAlignment(String deityAlignment) {
		this.deityAlignment = deityAlignment;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
	
	
	
	
	
}
