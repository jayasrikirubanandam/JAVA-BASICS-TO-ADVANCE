package StreamAPI;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to convert a list of strings to uppercase or lowercase using streams.

public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = new ArrayList<String>();
		words.add("and");
		words.add("hat");
		words.add("plates");
		words.add("bottles");
		words.add("glass");
		
		
		
		
		words.stream().map(String :: toUpperCase).forEach(i->System.out.println(i));;
		
		
		
		
		
		words.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));
		
		
		
 	}

}
