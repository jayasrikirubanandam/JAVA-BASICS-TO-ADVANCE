package String;

//StringBuffer and String Builder
//both used to create mutable strings 
//following applies for both 
//by default, the memory allocation is 16. After that,for every one char added - the capacity changes to 16*2+2;
//both appends to any type of value that is converted to string Object 
//the equals method here checks the reference and not the data because its not overridden, it uses the default behaviour of Object class.
//both occupies heap memory only since it uses new keyword.

//the difference is StringBuffer - all the methods that are under StringBuffer uses synchronised keyword. Multithreading was not possible here. 
//Thats why String builder was invented using same methods without synchronised keyword.
//Mutable objects are compared by compareTo();

public class String3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		StringBuffer s3 = new StringBuffer("Java");
		StringBuffer s4 = new StringBuffer("Java");
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));  //the body of equals method in Object class are used as it is. Its not overidden
		System.out.println(s3.compareTo(s4));// returns int value
		System.out.println("Mutable objects are compared by "+ s3.compareTo(s4));
		s3.ensureCapacity(100); // requesting the capacity size 
		System.out.println(s3.capacity());
		
		s3.trimToSize();
		System.out.println(s3.capacity());
	}

}
