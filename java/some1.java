class some1
{
int id;
String w;
String u;
float salary;
some1()
{
}
some1 (int i,String a,String b,float s)
{
id =i;
w=a;
u=b;
salary=s;
}
void  cal()
{
float da=(float)(10*salary)/100;
float ta=(float)(12*salary)/100;
salary=salary+da+ta;
}
 void print()
{
System.out.print(salary);
}
public static void main(String a[])
{
some1 sum=new some1(1075,"ashish","ceo",5000);
sum.cal();
sum.print();
}
}


