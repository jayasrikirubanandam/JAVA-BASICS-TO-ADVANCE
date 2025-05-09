package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Given a list of strings, group them by anagrams - 
//An anagram of a string is another string that contains the same characters, only the order of characters can be different..
public class launch14 {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("abba","abcd","abcba","abab");
		
	
		//normal Logic
		
		List<String> isAnagrams = new ArrayList<>();
		
		for(int i=0;i< list.size();i++) {
			for(int j=0;j< list.size();j++) {
				char[] a = list.get(i).toCharArray();
				char[] b = list.get(j).toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				
				if(a.length == b.length) {
					if(a.equals(b)) {
						isAnagrams.add(list.get(i));
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Predicate<String> isAnagram = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				char[] s1 = t.toCharArray();
				Arrays.sort(s1);
				
				
				return false;
			}
			
		};
		
		
//		String s="abab";
//		char[] s1 = s.toCharArray();
//		Arrays.sort(s1);
//		System.out.println(s1);
		
		//list.stream().max((i,j) -> Arrays.sort(i.toCharArray()).compareTo(Arrays.sort(i.toCharArray()))).toList();
		
	}

}
