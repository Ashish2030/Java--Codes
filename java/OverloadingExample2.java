public class OverloadingExample2
{
   public int rollNum;
   OverloadingExample2()
   {
      rollNum =100;
   }
   OverloadingExample2(int rnum)
   {
this();
      rollNum = rollNum+ rnum;
//this();
   }
   public int getRollNum()
 {
	  return rollNum;
   }
   public void setRollNum(int rollNum) 
{
	  this.rollNum = rollNum;
   }
   public static void main(String args[])
   {
	   OverloadingExample2 obj = new OverloadingExample2(12);
       System.out.println(obj.getRollNum());
    }
}