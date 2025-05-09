package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Write a Java program to sort a list of strings in alphabetical order, 
//ascending and descending using streams.
public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = new ArrayList<String>();
		words.add("and");
		words.add("hat");
		words.add("plates");
		words.add("bottles");
		words.add("glass");
		
		words.stream().sorted();
		
		Comparator<String> comp =  new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(0) > o2.charAt(0)) {
					return -1; //no need to swap
				}else {
					return 1;
				}
				
				
			}
			
		};
		
		//ascending
		System.out.println("ASCENDING");
		words.stream().sorted().forEach(i -> System.out.println(i));
		
		//descending
		System.out.println("DESCENDING");
		words.stream().sorted(comp).forEach(i -> System.out.println(i));
		
		System.out.println("Using Comparator default method");
		words.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
		
	}

}
