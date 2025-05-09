package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
//Given a string, find the count of distinct characters.
public class Launch16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ababc");
		
		//normal logic 
//		int count =0;
//		String word = list.get(0);
//		for(int i=0;i<word.length();i++ ) {
//			if(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i)) ) {
//				count++;
//			}
//				
//		}
//		
//		System.out.println(count);
//		
		
		
		System.out.println(list.get(0).chars().mapToObj(i-> (char)i).distinct().count());list.get(0).chars().mapToObj(i-> (char)i).distinct().count();
	}

}
