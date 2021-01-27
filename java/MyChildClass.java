class MyParentClass {
   MyParentClass(){
	System.out.println("MyParentClass Constructor");
   }
}
class MyChildClass extends MyParentClass{
   MyChildClass() {
	System.out.println("MyChildClass Constructor");
   }
   public static void main(String args[]) {
	MyChildClass obj=new MyChildClass();
   }
}