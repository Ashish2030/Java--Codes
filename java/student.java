 class student
{
int a,b,z;
void sum(int x,int y)
{
a=x;
b=y;
z=a+b;
}
void display()
{
System.out.print(z);
}
    public static void main(String[] args) 
    {
      int a=50;
int b=70;
student s=new student();
s.sum(a,b);
s.display();    
    }
    
    }
