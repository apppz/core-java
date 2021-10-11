class Contractor
{
private String name="govinda";
private int age=20;
private float since=1998;
private String experience="10 years";
private String location="banglore";
private String qualification="b tech";

String getName()
{
return this.name;
}
int getAge()
{
return this.age;
}

float getSince()
{
return this.since;
}

String getExperience()
{
return this.experience;
}

String getLocation()
{
return this.location;
}

String getQualification()
{
return this.qualification;
}

void setName(String name)
{
this.name=name;
}

void setAge(int age)
{
this.age=age;
}

void setLocation(String location)
{
this.location=location;
}

void setQualification(String qualification)
{
this.qualification=qualification;
}
}