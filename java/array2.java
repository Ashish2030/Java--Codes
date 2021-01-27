class array2
{
public static void main(String a[])
{
int arr[][];
arr=new int [3][3];
arr[0][0]=10;
arr[0][1]=20;
arr[0][2]=30;
arr[1][0]=40;
arr[1][1]=50;
arr[1][2]=60;
arr[2][0]=70;
arr[2][1]=80;
arr[2][2]=90;
for(int i[]:arr)
{
for(int j:i)
System.out.print(j);
}
System.out.println();
}
}
