 class e
{
public static void main(String arr[])
{
int a=11;
int b=6;
double c=7.3;
double d=9.4;
int result1=  minFunction(a,b);
double result2 = minFunction(c,d);
System.out.print("Min value="+result1);
System.out.print("min value="+result2);
}
public static int minFunction(int a,int b)
{
return (a+b);
}
public static double minFunction(double c,double d)
{
return (c+d);
}
}