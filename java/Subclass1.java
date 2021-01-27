class Parentclass
{
   //Overridden method
   void display(){
	System.out.println("Parent class method");
   }
}
class Subclass1 extends Parentclass
{
   //Overriding method
   void display(){
	System.out.println("Child class method");
   }
   void printMsg(){
	//This would call Overriding method
	display();
	//This would call Overridden method
	super.display();
   }
   public static void main(String args[]){		
	Subclass1 obj= new Subclass1();
	obj.printMsg(); 
   }
}