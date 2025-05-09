package Map;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStribg01 {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        Set<Character> ss = new HashSet<>();
	        int i = 0, ans = 0;
	        for (int j = 0; j < s.length(); ++j) {
	            char c = s.charAt(j);
	            while (ss.contains(c)) {
	                ss.remove(s.charAt(i++));
	            }
	            ss.add(c);
	            ans = Math.max(ans, j - i + 1);
	        }
	        return ans;
	    }

}
