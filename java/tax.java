class tax
{
public static void main(String a[])
{
int  h=150000;
float tax;
if(h<2000)
{
tax=0;
}
else if(h>=3000 && h<51000)
{
tax=(float)((h*2)/100);
System.out.print(tax);
}
else if(h>=2000&&h<3000)
{
tax=(float)((h*1.5)/100);
System.out.print(tax);
}
else
{
tax =(float)((h*2.7)/100);
System.out.print(tax);
}
}
}



