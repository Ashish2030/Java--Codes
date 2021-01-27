import java.util.Scanner;
class gitu
{
int roll;
String name;
void data()
{
Scanner sc=new Scanner (System.in);
roll=sc.nextInt();
sc.nextLine();
name=sc.next();
int id=.nextInt();
}
void display()
{
System.out.print(name);
System.out.print(roll);
System.out.print(id);
}

public static void main(String arr[])
{
gitu a=new gitu();
a.data();
a.display();
}
}