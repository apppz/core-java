package xworkz.com.methodoverriding;

public class Stadium {
	
	private String name;
	private String city;
	private float areaInMeters;
	
	public Stadium() {
		System.out.println("invoked stadium");
	}

	public Stadium(String name, String city, float areaInMeters) {
		super();
		this.name = name;
		this.city = city;
		this.areaInMeters = areaInMeters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "kanteerava";
	}
	
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Stadium)
		{
			System.out.println("correct org");
			Stadium casted=(Stadium) obj;
			String castedName=casted.name;
			if(this.name.equals(castedName))
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
			System.err.println("pass stadium ");
		}

		return true;
	}

}
