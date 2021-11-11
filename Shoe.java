package xworkz.com.methodoverriding;

public class Shoe {

	private String brand;
	private int size;
	private String color;
	private char gender;
	
	public Shoe() {
		System.out.println("invoked shoe");
	}

	public Shoe(String brand, int size, String color, char gender) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.gender = gender;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "bella";
	}
	
	public boolean equals(Object obj)
	
		{
			System.out.println("invoked equals");
			if(obj==null)
			{
				System.out.println("your passing value is not proper");
				return false;
			}
			if(obj instanceof Bag)
			{
				System.out.println("correct org");
				Shoe casted=(Shoe) obj;
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
				System.err.println("pass shoe ");
			}

			return true;
		
		}
		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
