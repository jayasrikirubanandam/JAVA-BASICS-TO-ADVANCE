package Singleton;


// to check Singelton - need to be class names as Singelton
class Jay{
	
	static Jay jay = null;
	private Jay() {
		
	}
	
	
	public static Jay getObject() {
		if(jay == null) {
		    jay = new Jay();
		    return jay;
		}else {
			return jay;
		}
	}
}

public class Person {

	public static void main(String[] args) {
		
		Jay j = Jay.getObject();
		Jay j1= Jay.getObject();
		
		if(j == j1) {
			System.out.println("singelton");
		}
	}

}
