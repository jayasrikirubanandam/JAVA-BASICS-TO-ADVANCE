package Static;
//Static with Inheritance
//Static methods participate in inheritance
//static methods cannot be override. It just hiding the parent methods.
//To prove this use @Override annotation
//Method hiding - the static methods of super class are not overidden in subclass.
//they are hided by the sub class or we can call it as a specialised method to the child.

class A{
	
	 private int ds = 9;
	 int a = 10;
	 
	 public A(){
		 System.out.println("Constructor calling A");
	 }
	 
	 static void parent() {
		System.out.println(" Static from parent ");
	}
	 
	 public  void display() {
		 System.out.println("hi");
	 }
}

class B extends A{
	@Override
	public  void display() {
		 System.out.println("hi from B");
	 }
	static void parent() {
		System.out.println(" Static from child ");
	}
	public void run() {
		System.out.println("run");
	}
}
public class StaticInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		A b1 = new B();
		
		
		b1.parent();
		b1.display();
		//b1.run();
		
		B.parent();
		A.parent();
	}

}
