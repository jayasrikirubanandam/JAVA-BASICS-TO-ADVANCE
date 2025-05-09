package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class String5 {

	public static void main(String[] args) {
		String s = "assendddin orrrdder";
		String[] ls = s.split(" ");
		
		Set<Character> ch = new LinkedHashSet<Character>();
		
		for(int i=0;i< ls.length;i++) {
			for(int j=0;j< ls[i].length();j++) {
				ch.add(ls[i].charAt(j));
			}
			
			
		}
		
		for(char c : ch)
		{
			System.out.println(c);
		}

	}

}
