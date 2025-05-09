package Interface;
// interface - is one of the way to achieve abstraction.Here, only 100% abstraction is possible until Java 8
//all the methods under interface are by default public and abstract. You cannot modify the access specifier.
// subclass implementing the interface may or may not override. If it overrides, then the access specifier must be public.
//One of the override rules is -> do not reduce the access specifier when subclass implements interface
// Cannot create object instantiation for the interface.However, we can have reference of the interface parent to all other sub classes.
//Many classes can implement interface 
// cannot create object for interface because methods don't have body/ implementation
//interface cannot have an constructor because all the data members in interface are by default public static final(constant). We cannot initialize values while calling constructor. 
//However , we can have reference of parent which has access to hold all other subclasses.

interface Alpha1{
	
	
	 void add();
	 void sub();
		
}

 class Beta1 implements Alpha1{


	public  void add() {
		System.out.println("Addition");
	}
	
	public void sub() {
		System.out.println("Subraction");
	}

}
 
 class Gamma implements Alpha1{

	
	public void add() {
		System.out.println("Gamma");
	}

	
	public void sub() {
		System.out.println("Gamma");
	}
	 
 }
 class Yard implements Alpha1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	 
 }
public class LaunchInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beta1 beta = new Beta1();
		beta.add();
		beta.sub();
		
		Alpha1 alpha = new Beta1();
		alpha.add();
		alpha.sub();
	}

}
