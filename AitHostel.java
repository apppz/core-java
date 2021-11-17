package com.xworkz.interfaces;

public  class  AitHostel implements HostelRule,VisitingDay{
	
	@Override
	public int inTime()
	{
		System.out.println("invoked inTime methos");
		return 9;
		}
	

	@Override
	public String visitingDay() {
		System.out.println("invoked visitingday");
		return null;
	}
}
