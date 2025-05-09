package String;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Telusko";
		System.out.println(name.substring(0, 1));
		Character c='h';
		System.out.println(c);
		String name2 = name.concat("Java");
		System.out.println(name2);
		
		String s1= "Java";
		String s2= "Java";
		
		System.out.println(s1.compareTo(s2));
		String s3 = s2.intern();
		
		System.out.println("INTERN METHOD" +s2.intern());
		String s4 = new String("Java");
		System.out.println(s4 == s3);
		
		
		
	}

}
