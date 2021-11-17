package com.xworkz.interfaces;

public class CitizenRunner {

	public static void main(String[] args) {
		
		VotingRule rule=new IndianCitizen();
		int age=rule.validAge();
		System.out.println(age);
		
		String validId=rule.validId();
		System.out.println(validId);
		
		TrafficRule rule2=new IndianCitizen();
		
		boolean validLicense=rule2.validLicense();
		String licenseNo=rule2.licenseNo();
		boolean validInsurance=rule2.validInsurance();
		
		IndianCitizen city=new IndianCitizen();
		int ageValid=city.validAge();
		
		IndianCitizen city1=new IndianCitizen();
		city1.displayNameAndAddressDetails("arpi",Address.CHIkMAGLUR);
		
		
		

	}

}
