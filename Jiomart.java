class Jiomart
{
public static void getDetailsFromJiomart(String product)
{
	if(product.equals("fruit"))
	{
String[] details={"orange juce"+ "1"+ "btm layout"};
System.out.println(details[0]);
System.out.println(details[1]);
System.out.println(details[2]);
	}
	if(product.equals("cloth"))
	{
String[] details={"jean jacket"+ "1"+ "btm layout"};
System.out.println(details[0]);
System.out.println(details[1]);
System.out.println(details[2]);
	}
	
}

}

class JiomartDetails
{
	public static void main(String[] args){
		JiomartDetails.getDetailsFromJiomart(args[0]);
	}
}