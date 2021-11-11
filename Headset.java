package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.HeadsetType;

public class Headset {

	private String brand;
	private int battery;
	private int warranty;
	private HeadsetType type;
	
	public Headset() {
		System.out.println("invoked no arg headset constrct");
	}

	public Headset(String brand, int battery, int warranty, HeadsetType type) {
		super();
		this.brand = brand;
		this.battery = battery;
		this.warranty = warranty;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public HeadsetType getType() {
		return type;
	}

	public void setType(HeadsetType type) {
		this.type = type;
	}
	
	public String toString()
	{
		System.out.println("invoked toString");
		return "Samsung";
	}
	
		public boolean equals(Object obj)
		{
			System.out.println("invoked equals method");
			if(obj==null)
			{
			System.out.println("your passing value is not proper");
			return false;
			}
			if(obj instanceof Headset)
			{
				System.out.println("correct org");
				Headset casted=(Headset) obj;
				String castedBrand=casted.brand;
				if(this.brand.equals(castedBrand))
				{
					System.out.println("model no matched");
					return true;
				}
				else
				{
					System.err.println("model no missmatch");
				}
			}
			
			else 
			{
				System.err.println("pass ipod ");
		}
			return true;
	}
	
}
