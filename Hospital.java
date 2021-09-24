
class Hospital{
public static void main(String[] args)
{
String h1="ashraya";
String h2="govt hospital";
String h3="deepa nursing home";
String h4="ashirvadh";	
String h5="mallikarjun polyclinic";
System.out.println();
String[] hospitalArray={h1,h2,h3,h4,h5};

//System.out.println(hospitalArray);

System.out.println(hospitalArray[1]);

for(int i=0;i<5;i++)
{
System.out.println("\n\t"+hospitalArray[i]);
}
}
}