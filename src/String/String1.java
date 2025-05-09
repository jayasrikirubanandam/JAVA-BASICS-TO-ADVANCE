package String;

//In java - the collection of characters that are enclosed within a double quotes are string
// it can be a number or special characters that are enclosed within a double quotes
//how String are stored - They are stored in heap.
//String - Immutable(Not changeable) vs Mutable(changeable)
//To creatre Immutable - we use String class
// String comparison - 1) ==  -> reference are compared 
		//			 - 2) equals method -> data are compared with case sensitive
        //           - 3) equalIgnoreCase -> data are compares without case sensitive
		//           -4)compareTo() - string is compared single by single character

// Memory -> String uses A specific area called string constant pool.In which duplicates are not allowed.
			// 1) only direct literals occupies SCP.->no new keyword, no reference, no inbuild methods.
			// heap duplicates are allowed.And heap memory is used only - > when inbuild method, ref ,new keywords are used.
			//Garbage collector doesn't enter SCP.The SCP memory deallocates when JVM is shut down.
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "12jka&"; // this is also a string
		
		//Two ways to create immutable string 
		String s2 = "Java";  // direct literal 
		String s3 = new String("Java"); // new keyword is used
		
		// if you try to print array -> address are printed . we use toString() to print the values.
		//This shows that String has override the toString().
		System.out.println(s2);
		
	}

}
