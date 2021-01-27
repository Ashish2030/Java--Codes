class Example2
{
      private int var;
    
      public Example2(int num)
      {
             this.var = num;
      }
      public int getValue()
      {
              return var;
      }
  //default constructor
      public Example2()
      {
             this.var = 10;
      }
      //parameterized constructor
      public static void main(String args[])
      {
            
              Example2 obj2 = new Example2(100);
  Example2 obj = new Example2();
              System.out.println("var is: "+obj.getValue());
              System.out.println("var is: "+obj2.getValue());
      }
}