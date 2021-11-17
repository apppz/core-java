package com.xworkz.interfaces;

public class AfricanCitizen implements VotingRule,MarraigeRule,TrafficRule{

	@Override
	public boolean validLicense() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String licenseNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validInsurance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validAge(char gender, int age) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int validAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String validId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
