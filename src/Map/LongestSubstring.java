package Map;

import java.util.HashSet;

//Longest Substring Without Repeating Characters:
//Given a string, find the length of the longest substring without repeating characters.
//Example: "abcabcbb". Output: 3 (for "abc").


public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println("the longest subString is "+longestString("abcabcbb"));
	}

	public static int longestString(String word) {
		
		System.out.println("The word is " +word);
		HashSet<String> substr = new HashSet<>();
		int highestLength=0;
		String subStr ="";
		for(char c: word.toCharArray()) {
			
			if(subStr.isEmpty()) {
				subStr +=c;
			}else {
				if(!(subStr.)){
					subStr+=c;
				}else {
					substr.add(subStr);
					subStr =null;
				}
			}
		}
		System.out.println("Strings are" +substr);
		for(String s : substr) {
			System.out.println("Strings are" +s);
			if(s.length()> 0) {
				highestLength = s.length();
			}
		}
		
		for end in range(len(word)) {
			
		}
		return highestLength;
	}
}
