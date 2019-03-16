package com.bgd.promotions;


public class Promotions {
	
	private String charset;
	private int length;
	private int caseUpperLower;
	
	
	public int getCaseUpperLower() {
		return caseUpperLower;
	}
	public void setCaseUpperLower(int caseUpperLower) {
		this.caseUpperLower = caseUpperLower;
	}
	public String getCs() {
		switch(charset) {
		case "alphanumeric" :{
			if(caseUpperLower == 1)
			return Constants.ALPHANUMERIC.toUpperCase();
			return Constants.ALPHANUMERIC;
			
		}
		case "numeric" :{
			
			return Constants.NUMERIC;
		}
		default :{
			if(caseUpperLower ==1)
			return Constants.ALPHA.toUpperCase();
			return Constants.ALPHA;
		}
		}
	}
	public void setCs(String cs) {
		this.charset = cs;
	}
	public int getLength() {
		if(length == 12)
			return Constants.LENGHTSMALL;
		return Constants.LENGHTLARGE;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	
	
	
	
	
}
