import java .util.Scanner;
class a
{
public void b(int a,double b)
{
System.out.println(a+b);
}
public void b(double a,int  b)
{
System.out.println(a+b);
}
}
class methodoverloading
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
double b=sc.nextDouble();
a obj=new a();
obj.b(a,b);
obj.b(b,a);
}
}
