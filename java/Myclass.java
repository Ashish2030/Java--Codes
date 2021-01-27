 class MyClass {
  
  static void myStaticMethod()
 {
    System.out.println("Static methods can be called without creating objects");
  }

 
  public void myPublicMethod() 
{
    System.out.println("Public methods must be called by creating objects");
  }

 
  public static void main(String[] args) 
{
    myStaticMethod(); // Call the static method
    // myPublicMethod(); 

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method on the object
  }
}