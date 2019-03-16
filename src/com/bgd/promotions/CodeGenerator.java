package com.bgd.promotions;

import java.util.Random;

public class CodeGenerator {
	private static Random RAND = new Random(System.currentTimeMillis());
	Promotions promotion = new Promotions();
	
	
	public Promotions getPromotion() {
		return promotion;
	}


	public void setPromotion(Promotions promotion) {
		this.promotion = promotion;
	}


	public String getCode() {
		Promotions p = getPromotion();
		
		int l = p.getLength();
		int offset = l == 16 ? 4 : 3;
		
		StringBuffer sb = new StringBuffer();
		String samples = p.getCs();
		
		while(l != 0) {
			char now = samples.charAt(RAND.nextInt(samples.length()));
			sb.append(now);
			l--;
			if(l % offset ==0 )
				sb.append(" ");
		}
		
		
		
		return sb.toString().trim();
	}

}
