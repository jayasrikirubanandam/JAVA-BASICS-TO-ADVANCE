package Final;
//Final Keyword 
// final class cannot be inherited. It doesn't participate in inheritance.
//final methods can be inherited. It participate in inheritance However they cannot be override - That is modified
//final variables cannot be modified . it act as a constant.
//A class can either be an abstract or final. Not both.
//An abstract class cannot be declared as final because abstract class provides requirements/ sspecifications 
//in which the subclass requires to implement them. Final doesn't participate in inheritance whereas abstract has to be inherited.
//Static variables are called only once in memory. And the data is shared among all other objects.
// And you can modify it whereas final variables cannot be modified.
//Final class can't be  a parent / super class. however , final class can have parent .

 class Alpha{
	
	final int a = 3;
	 void disp() {
		
		System.out.println(" Alpha ");
	}
	
}

//class Beta extends Alpha {
//	
//	void disp() {
//		System.out.println(" Beta ");
//	}
//}

 final class Beta extends Alpha{
	
	void disp() {
		
	}
 }

// class Gamma extends Beta{
//	 
// }
public class LaunchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beta b = new Beta();
		b.disp();
		
	}

}
