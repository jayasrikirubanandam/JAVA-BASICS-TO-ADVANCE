package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Launch18 extends Object{

	public static void main(String[] args) {
	  List<String> names = Arrays.asList("apple","banana","apricot");
	  
	 Map<Character,String> map= names.stream().collect(Collectors.toMap(n-> n.charAt(0), 
			  n-> n,
			  (existing, replacement) -> existing ));
	  System.out.println(map);

	}

}
