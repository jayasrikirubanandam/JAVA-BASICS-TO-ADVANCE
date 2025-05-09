package StreamAPI;

import java.util.ArrayList;
import java.util.List;

//5. Write a Java program to count the number of strings in a list that 
//start with a specific letter using streams.
//to cast char to String -> 1) concatenate with "";
//2) -> String.valueOf();
public class Launch7 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		words.add("and");
		words.add("hat");
		words.add("plates");
		words.add("bottles");
		words.add("alass");
		words.add("apple");
		
		
		
		words.stream().filter(i->i.startsWith("a")).count();
		
		
		
		
		
		
		System.out.println("COUNTTTTTTT "+ words.stream().filter(i->i.startsWith("a")).count());
		//long count = words.stream().filter(i -> (i.charAt(0)+"").equals("a")).count();
		
		//long count = words.stream().filter(i -> String.valueOf(i.charAt(0)).equals("a")).count();
		long count = words.stream()
				.filter(i -> i.startsWith(String.valueOf("a"))).count();
		
		System.out.println("The count of words that starts with a : "+ count);
		
	}
}
