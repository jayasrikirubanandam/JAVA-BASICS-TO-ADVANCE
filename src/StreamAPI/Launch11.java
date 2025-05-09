package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

//Word Count: Given a list of sentences, count the total number of words in all the sentences.
public class Launch11 {
	public static void main(String[] args) {
		
		List<String> sentences = Arrays.asList("I am learning Java", "The sky is blue","I love you");
		List<Integer> countArray= new ArrayList<>();
		
		
		
		
		for(int i=0;i< sentences.size();i++) {
			
			String s = sentences.get(i);
			
			String[] words = s.split(" ");
			
				countArray.add(words.length);
		}
		
		for(int i : countArray)
			System.out.println(i);
		
		
		
		sentences.stream().mapToInt(i-> i.split(" ").length).forEach(System.out :: print);
		
		
		
		
		
		
		
		
//		//normal logic 
//		for(String s: sentences) {
//			
//			String[] a = s.split(" ");
//			for(String i: a)
//				countArray.add(i);
//		}
//		
//		System.out.println(countArray.size());
//		
//	    System.out.println(sentences.stream().mapToLong(i->Arrays.stream(i.split(" ")).count()));
	}
	
	
}
