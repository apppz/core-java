class Prime{
public static void main(String[] args){
int num=3;
for(int i=2;i<=num/2;i++){
if(num%i==0)
{
if(num)
{
System.out.println("is a prime number"+num);
}
else
{
System.out.println("is not a palindrome"+num);
}
}
}

}}