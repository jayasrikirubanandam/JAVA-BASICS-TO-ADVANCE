//static methods doesn't deal with objects.However, we can use objects to call them -> allows with the warnings
//static methods usually gets invoked by an class Name.
//Java Initialization block -> gets invoked when a constructor is called -> Constructor is called while object creation  
//before the statements inside the constructor gets executed , the java initialization block gets invoked.
//static block gets executed at class loading itself
//non- static/ normal instance variables gets life only at object creation-> Thats why we are not able to use them at static methods
//static variable gets life at class load itself -> thats why we are able to use them at anywhere at non- static method as well.
class Test{
	
	int age ,marks;
	static int check;
	
	static {
		
		System.out.println("static block gets executed at class loader itself");
	}
	
	{
		System.out.println("Java initialisation block");
	}
	
	Test(){
		System.out.println("Inside a constructor ");
	}

	static void display() {
		check = 90;
		System.out.println("static method is invoked");
	}
	
	void disp() {
		check=100;
	}
}
public class Sstatiic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test t = new Test();
     t.display();    // we can call static methods using object but it's not  advisible
     Test.display();
	}

}
