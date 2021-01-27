import java.util.Scanner;
class a1
{

void display()
{
for(int i=0;i<5;i++)
{
//System.out.print(marks[i]);
}
}
public static void main(String a[])
{
int  marks[];
marks=new int[100];
Scanner sc=new Scanner(System.in);
a1 obj=new a1();
for(int i=0;i<5;i++)
{
marks[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.print(marks[i]);
}

}
}

