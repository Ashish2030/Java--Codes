import java.util.Scanner;
class ashu1
{
int roll;
String name;
void data()
{
Scanner sc=new Scanner (System.in);
name=sc.next();
roll=sc.nextInt();
 
}
void display()
{
System.out.print(name);
System.out.print(roll);
}

public static void main(String arr[])
{
ashu1 a=new ashu1();
a.data();
a.display();
}
}