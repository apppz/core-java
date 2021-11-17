package com.xworkz.interfaces;



public class HostelRunner {
	
	public static void main(String args[])
	{
		HostelRule rule=new AitHostel ();
		rule.inTime();
		
		AitHostel hostel=new AitHostel();
		hostel.visitingDay();
		hostel.inTime();
		
		//Hostelrule day=new VisitingDay();
		
		Object obj=new AitHostel();
		((HostelRule) obj).inTime();///type casting
		
		
	}

}
