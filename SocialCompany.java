class SocialCompany
{
String name;
String founder;
int establish;
int noOfEmployees;
String headQuaters;
float revenue;
int noOfBranches;

SocialCompany(String name,String founder,int establish,int noOfEmployees,String headQuaters,float revenue,int noOfBranches)
{
this.name=name;
this.founder=founder;
this.establish=establish;
this.noOfEmployees=noOfEmployees;
this.headQuaters=headQuaters;
this.revenue=revenue;
this.noOfBranches=noOfBranches;
}
SocialCompany()
{
	
}

void setName(String name)
{
	this.name=name;
}
void setFounder(String founder)
{
	this.founder=founder;
}
void setEstablish(int establish)
{
	this.establish=establish;
}
void setNoOfEmployees(int noOfEmployees)
{
	noOfEmployees=noOfEmployees;
}
void setHeadQuaters(String headQuaters)
{
	this.headQuaters=headQuaters;
}
void setRevenue(float revenue)
{
	this.revenue=revenue;
}
void setNoOfBranches(int noOfBranches)
{
	this.noOfBranches=noOfBranches;
}

}