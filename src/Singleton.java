//Singleton is DP allow us to create only one instance of an class
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
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();

		System.out.println(obj1+ "ObJ "+ obj);
	}


}