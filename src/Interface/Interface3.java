package Interface;

interface Bug{
	
	int noOfLegs =4;
	String name ="LadyBug";
	
	void enangered();
	void extinct();
	
	default void bugBehaviour() {
		System.out.println("Friendly");
	}
	
	static void test() {
		System.out.println("static");
	}
	
	private void IsIt() {
		System.out.println("possible");
	}
	
}
class Bugeee implements Bug{
	
	public void enangered() {
		System.out.println("Buggee is Not an endagered species");
		
	}
	public void bad() {
		System.out.println("Bugeee is bad");
	}
	@Override
	public void extinct() {
		// TODO Auto-generated method stub
		
	}

}

interface clone {
	
}


public class Interface3 {

	public static void main(String[] args) {
	  
//		 LadyBug  b = new LadyBug() {
//			
//			public void bad() {
//				System.out.println("Bugeee is not  bad");
//			}
//			
//			static void test1() {
//				System.out.println("static");
//			}
//		};
		
		
//		b.bugBehaviour();
//		b.enangered();
//		b.extinct();
//	
	
		Bug.test();
		
	}

}
