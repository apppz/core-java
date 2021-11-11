package xworkz.com.methodoverriding;

public class Aeroplane {

	private int no;
	private String comapany;
	private String govt;
	
	public Aeroplane() {
			System.out.println("invoked aeroplane");
	}

	public Aeroplane(int no, String comapany, String govt) {
		super();
		this.no = no;
		this.comapany = comapany;
		this.govt = govt;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getComapany() {
		return comapany;
	}

	public void setComapany(String comapany) {
		this.comapany = comapany;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "Aeroplane";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Aeroplane)
		{
			System.out.println("correct org");
			Aeroplane casted=(Aeroplane) obj;
			String castedMaterial=casted.comapany;
			if(this.comapany.equals(castedMaterial))
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
			System.err.println("pass aeroplane ");
		}

		return true;
	
	}
	
	
}
