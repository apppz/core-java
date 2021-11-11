package xworkz.com.methodoverriding;

public class Ipod extends Object{
	
	private String name;
	private String brand;
	private float price;
	private String modelNo;

	public Ipod() {
		System.out.println("invoked ipod no arg constructor");
	}

	public Ipod(String name, String brand, float price,String modelNo) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.modelNo=modelNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public void getModelNo(String modelNo)
	{
		this.modelNo=modelNo;
	}
	
	public void setModelNo(String modelNo)
	{
		this.modelNo=modelNo;
	}
	
	public String toString() {
		System.out.println("invoked toString method");
		return "titan";
	}
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals method");
		if(obj==null)
		{
		System.out.println("your passing value is not proper");
		return false;
		}
		if(obj instanceof Ipod)
		{
			System.out.println("correct org");
			Ipod casted=(Ipod) obj;
			String castedModelNo=casted.modelNo;
			if(this.modelNo.equals(castedModelNo))
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


