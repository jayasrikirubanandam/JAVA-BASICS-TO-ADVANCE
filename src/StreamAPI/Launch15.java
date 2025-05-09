package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Longest Word: Given a list of strings, find the longest word.
public class Launch15 {

	public static void main(String[] args) {
		//List<Double> list = Arrays.asList(1.2,4.5,8.0,1.1);
		
		//System.out.println(list.stream().mapToDouble( Double:: doubleValue).average().getAsDouble());
		
		List<String> list = Arrays.asList("abbaq","abcd","abcba");
		
		
//		Predicate<String> isLongest = new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				
//				int max =0;
//				if(t.length() > max) {
//					max = t.length();
//					return true;
//				}
//				else {
//					return false;
//				}
//				
//			}
//			
//			
//		};
		
		String l = list.stream().max((i,j) -> Integer.compare(i.length(), j.length())).get();
		System.out.println(l);
		
		
		//String l = list.stream().max((i,j) ->Integer.compare(i.length(), j.length())).orElse("Not able find the max");
		
		
		//System.out.println(l);
	}

}
