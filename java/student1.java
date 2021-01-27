class student1
{
int a,b,c;
void sum(int k,int y)
{
c=k+y;
}
void display()
{
System.out.print(c);
}
public static void main(String a[])
{
int p=50,e=70;
student1 s=new student1();
s.sum(p,e);
s.display();
}
}
