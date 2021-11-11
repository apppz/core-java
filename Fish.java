package xworkz.com.methodoverriding;

public class Fish {
	private String name;
	private String type;
	private float price;
	private String color;
	
	public Fish() {
		System.out.println("invoked fish");
	}

	public Fish(String name, String type, float price, String color) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "bangude";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Fish)
		{
			System.out.println("correct org");
			Fish casted=(Fish) obj;
			String castedMaterial=casted.type;
			if(this.type.equals(castedMaterial))
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
			System.err.println("pass fish ");
		}

		return true;
	
	}
		

}
