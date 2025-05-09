package Constructor;
//Constructor is a specialised setter method to intialise value to the instance variables 
// in which it has same name as that of class name. 
//Does not have return type 
// By default, JVM creates a default constructor with zero parameters only when programmer doesn't create any constructor 
//Multiple constructor with different parameters - called constructor overloading
//super() ->first line of every constructor
//We can avoid super() by adding this() method which calls the constructor within the class
//both super() and this() cant be in the same constructor

class Student1{
	
	private int age;
	private String name;
	
	Student1(int age, String name){
		this();
		this.age = age;
		this.name = name;
		System.out.println("Parameterised constructor ");
	}
	
	Student1(){
		System.out.println("zero constructor"); //created by a programmer
	}
	
	
	
	
	
}
public class LaunchConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1 = new Student1();
		Student1 s = new Student1(45,"jay");
		
		
		//s.disp();   //You need to create a method 
	}

}
