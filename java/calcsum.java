class calcsum
{
int n,i,sum1;
void sum(int num)
{
n=num;
for(i=1;i<=n;i++)
{
sum1+=i;
}
System.out.print(sum1);
}
 public static void main(String[] args) 
    {
calcsum c=new calcsum();
c.sum(20);
}
}