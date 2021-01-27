public class Demo1
{
   private int rollNum;
   //We are not defining a no-arg constructor here

   Demo1(int rnum)
   {
      rollNum = rollNum+ rnum;
   }
   //Getter and Setter methods

   public static void main(String args[])
   {
      //This statement would invoke no-arg constructor
      Demo1 obj = new Demo1();
   }
}