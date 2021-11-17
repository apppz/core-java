package com.xworkz.interfaces;

public class IndianCitizen implements VisitingDay,VotingRule,TrafficRule,MarraigeRule{
	
	private String name="Arpita";
	private Address address;

	@Override
	public int validAge()
	{
		return 18;
	}
	
	@Override
	public String validId()
	{
		return "GYF765";
	}
	
	@Override
	public boolean validLicense()
	{
		return false;
	}
	
	@Override
	public String licenseNo()
	{
		return "757GGNGF";
	}
	
	
	public boolean validInsurance()
	{
		return false;
	}
	
	//public boolean validAge1('f',24)
	//{
		//return null; 
	//}
	
	public void displayNameAndAddressDetails(String name,Address adress)
	{
		this.name=name;
		this.address=address;
	}

	@Override
	public boolean validAge(char gender, int age) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String visitingDay() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
