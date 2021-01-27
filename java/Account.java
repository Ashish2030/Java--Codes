class Account{
int a;
int b;

 public void setData(int a ,int b){
  this.a = a;
  this.b = b;
 }
 public void showData(){
   System.out.println("Value of A ="+a);// zero
   System.out.println("Value of B ="+b);//zero
 }
 public static void main(String args[]){
   Account obj = new Account();
   obj.setData(2,3);
   obj.showData();
 }
}