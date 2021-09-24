class SwapNum{
public static void main(String[] args)
{
int x,y;
x=10;
y=20;
System.out.println("before swapping:" +x +""+y);
int t=x+y;

t=x;
x=y;
y=t;
System.out.println("after swapping:" +x+ "" +y);
}
}