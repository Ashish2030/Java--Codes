class u
{
static int a=3;
static int b;
static void func(int x)
{
System.out.println(x);
System.out.println(a);
System.out.println(b);
}
static 
{
System.out.println("ashish");
b=a=4;
}
public static void main(String a[])
{
func(42);
}
}
