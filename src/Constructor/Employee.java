package Constructor;

class Users{
	
	private int id;
	private String name;
	
	
	void display(int id, String name) {
		this.id = id;
		this.name = name ;
	}
	
	public Users(int id,String name) {
		this();
		this.id = id;
		this.name = name ;
		System.out.println("parameterized ");
	}
	
	public Users() {
		super();
		System.out.println("zero-parameterized ");
	}
	
}


public class Employee {

	public static void main(String[] args) {
		Users u = new Users(4, "jaY");
	
	}

}
