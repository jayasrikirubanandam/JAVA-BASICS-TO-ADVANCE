//Singleton is DP allow us to create only one instance of an class
package Singleton;

public class Singleton {

	
	static Singleton s = null;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
			return s;
		}
		return s;
	}
}
class ABC{
	
	 Singleton obj = Singleton.getInstance();
}