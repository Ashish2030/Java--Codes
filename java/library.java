class library
{
int id;
String name;
String branch;
int day;
int flag=0;
void getd(int a,String b,String c,int k)
{
id=a;
name=b;
branch=c;
day=k;
}
void calfine()
{
  if(day>50)
    {
   flag=1;
   }
     else
  {
  flag=0;
   }
  }
void printd()
{
if(flag==1)
{
System.out.print((50-day)*10);
}
else
{

System.out.print(0);
}
}


public static void main(String argc[])
{
library lib =new library();
lib.getd(1811981075,"Rahul","CSE",33);
lib.calfine();
lib.printd();
}
}



