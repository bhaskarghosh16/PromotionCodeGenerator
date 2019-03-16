package com.bgd.promotions.main;

import com.bgd.promotions.CodeGenerator;
import com.bgd.promotions.Promotions;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Promotions promotion = new Promotions();
		promotion.setCs("alphanumeric");
		promotion.setCaseUpperLower(1);
		
		
		CodeGenerator cg = new CodeGenerator();
		System.out.println("A 16 digit alphanumeric code");
		promotion.setLength(16);
		cg.setPromotion(promotion);
		System.out.println(cg.getCode());
		System.out.println("----------------------------");
		
		System.out.println("A 12 digit alphanumeric code");
		promotion.setLength(12);
		cg.setPromotion(promotion);
		System.out.println(cg.getCode());
		System.out.println("----------------------------");
		
		System.out.println("A 16 digit alpha code");
		promotion.setLength(16);
		promotion.setCs("alpha");
		cg.setPromotion(promotion);
		System.out.println(cg.getCode());
		System.out.println("----------------------------");
		
		System.out.println("A 12 digit alpha code");
		promotion.setLength(12);
		promotion.setCs("alpha");
		cg.setPromotion(promotion);
		System.out.println(cg.getCode());
		System.out.println("----------------------------");
		
		
		System.out.println("A 16 digit numeric code");
		promotion.setLength(16);
		promotion.setCs("numeric");
		cg.setPromotion(promotion);
		System.out.println(cg.getCode());
		System.out.println("----------------------------");
		
		System.out.println("A 12 digit numeric code");
		promotion.setLength(12);
		promotion.setCs("numeric");
		cg.setPromotion(promotion);
		System.out.println(cg.getCode());
		System.out.println("----------------------------");
		
		
		
		
	}

}
