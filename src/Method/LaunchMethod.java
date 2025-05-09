package Method;


//void methods cannot be used as an argument in sysout

class Calculator{
	
	int num1, num2;
	
	void add() {
		System.out.println(" Adding ");
	}
	
//	void add(int a,int b) {
//		int res = a+b;
//		System.out.println("Result is :" +res);
//	}
	
	void add(double a, int b) {
		System.out.println("Double  and Int ");
	}
	void add(int a, double b) {
		System.out.println("Int  and double ");
	}
	
	void hello(int a,float b) {
		System.out.println("hello");
	}
	
	void hello(float a, int b) {
		System.out.println("hello");
		
	}
}

public class LaunchMethod {

	//Method signature  methodName(parameters){ activity}
	// if you want to perform any activity or task we write that inside the method 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		//cal.add(7,8); // numeric promotion first check for the signature, if not found then it looks for other methods that handles the int capacity
	}
	
	public static void main(int q) {
		System.out.println("d");
	}

}
