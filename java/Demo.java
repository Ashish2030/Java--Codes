class Demo{
   void disp(int a, double b){
	System.out.println("Method A");
   }
   void disp(int a, double b, double c){
	System.out.println("Method B");
   }
   public static void main(String args[]){
	Demo obj = new Demo();
	obj.disp(100, 20.67f);
   }
}