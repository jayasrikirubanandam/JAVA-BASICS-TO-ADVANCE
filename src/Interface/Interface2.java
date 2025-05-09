package Interface;

//form java8, interface can have implementation. how? 
// to have implementation under interface use default keyword.
//default methods gets inherited in subclass.Not mandatory to override. If so, make sure the access specifier is public 
//Interface can have static methods. However, they cannot be inherited in subclass. Invoked using interface name. 
//From Java 9, interface can have private methods . However,they cannot be used outside the class.They cannot be inherited
// Private methods under interface can be accessed wither via default method or public static methods.

interface Car {
	int doors = 4;
	int windows = 4;
	int tyres =4;
	void name();
	
	
	default void doors() {
		tyre();
		System.out.println("No of doors " + doors);
	}
	
	static void windows() {
		tyre();
		System.out.println("No of windows " +windows );
	}
	
	private static void tyre() {
		System.out.println("No of tyres "+ tyres);
	}
}

class Buick {
	
	static void feature() {
		System.out.println(" Buick has sun roof feature ");
	}
	private void test() {
		System.out.println("private method");
	}
}


class Hyundai extends Buick implements Car{

	public void doors() {
		
		System.out.println("No of doors " + doors);
	}
	public void name() {
		System.out.println("Hyndai is my car name ");
		
	}
	
//	public void doors() {
//		System.out.println("Hyundai has 4 doors");
//	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c= new Hyundai();
		c.name();
		c.doors();
	
		Car.windows();
		
		
	}

}
