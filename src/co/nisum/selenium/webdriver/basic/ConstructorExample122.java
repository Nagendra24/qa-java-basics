package co.nisum.selenium.webdriver.basic;

class ConstructorExample122{
    int  value1;
    int  value2;
    ConstructorExample122(){
     value1 = 10;
     value2 = 20;
     System.out.println("Inside 1st Constructor");
   }
    ConstructorExample122(int a){
    value1 = a;
    System.out.println("Inside 2nd Constructor");
  }
    ConstructorExample122(int a,int b){
  value1 = a;
  value2 = b;
  System.out.println("Inside 3rd Constructor");
 }
 public void display(){
    System.out.println("Value1 is "+value1);
    System.out.println("Value2 is "+value2);
}
public static void main(String args[]){
	ConstructorExample122 d1 = new ConstructorExample122();
	ConstructorExample122 d2 = new ConstructorExample122(30);
	ConstructorExample122 d3 = new ConstructorExample122(30,40);
  d1.display();
  d2.display();
  d3.display();
}
}
