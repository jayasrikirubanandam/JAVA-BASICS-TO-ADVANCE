package StreamAPI;
// String Concatenation: Given a list of strings, 
//concatenate them into a single string using a delimiter.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Delimiter serves different purpose one such is to format that is to show the boundary between the strings 
//eg) john, jay, raj -> (,)-> comma is an delimiter
public class Launch17 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abbaq","abcd","abcba");
		String combine="";
		for(String s : list) {
			combine+= s;
		}
		System.out.println( combine);
		
		//collectors is an interface       
		String l = list.stream().collect(Collectors.joining());
		System.out.println(l);
		
		
		}

}
