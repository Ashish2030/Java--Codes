import java .util.Scanner;
class c

{
public static void main(String args[])
{
int flag=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int arr1[][]=new int [100][100];
int arr[][]=new int [100][100];
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
arr[i][j]=sc.nextInt();
}
}

for(int i=0;i<c;i++)
{
for(int j=0;j<d;j++)
{
arr1[i][j]=sc.nextInt();
}
}
if(a==c&&c==d)
{
for(int i=0;i<c;i++)
{
for(int j=0;j<d;j++)
{
if(arr[i][j]==arr1[i][j])
{
flag=1;
}
else
{
flag=0;
break;
}
}
}
}
if(flag==1)
{
System.out.print("equal");
}
else
{
System.out.print("unequal");
}
}
}



