package AnonymousInnerClass;

//three class are created A, A$B, InnerClass
//when innerclass method is static -Then use Class directly
//when innerclass method is not static - Then we use object of outer class.new B();
//innerclass can also extends 
//3 Types of innerclass ->member , static, anonymous inner class.
//purpose of inner class -> to avoid managing lot of inner class
//AN inner class can be private , static, final 
class A{
	
	int num =9;
	A(){
		System.out.println("A constructor");
	}
	void show() {
		System.out.println("class A - doing something ");
	}
	
	//innerclass 
	 class B{
		int as = 9;
		 B(){
			 super();
			 System.out.println("B constructor");
		 }
		public static void show() {
			System.out.println("class B - doing something ");
		}
	}
	  class C {
		 
		static void helllo() {
			 System.out.println("hello from C");
		 }
	 }
	
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.show();
		a.num= 90;
		//A.B.show(); // static method in B
		
		A.B b = a.new B(); // non static method in B
		b.as = 90;
		b.show();
		
		A.C.helllo();
		
		
	}

}
