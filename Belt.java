package xworkz.com.methodoverriding;

public class Belt {
	
	private float price;
	private String material;
	private int size;
	private char gender;
	private String beltBrand;
	
	public Belt() {
		System.out.println("invoked belt");
		
	}

	public Belt(float price, String material, int size, char gender,String beltBrand) {
		super();
		this.price = price;
		this.material = material;
		this.size = size;
		this.gender = gender;
		this.beltBrand=beltBrand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getBeltBrand() {
		return beltBrand;
	}

	public void setBeltBrand(String beltBrand) {
		this.beltBrand = beltBrand;
	}
	
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "halmon";
	}
	
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Belt)
		{
			System.out.println("correct org");
			Belt casted=(Belt) obj;
			String castedMaterial=casted.material;
			if(this.material.equals(castedMaterial))
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
			System.err.println("pass belt ");
		}

		return true;
	
	}
		
	}


