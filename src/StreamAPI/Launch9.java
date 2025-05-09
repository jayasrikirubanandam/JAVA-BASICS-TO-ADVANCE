package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Write a Java program to find the maximum and minimum values
//in a list of integers using streams.
public class Launch9 {

	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(11,41,51,61,62,73,014,64,74,84,91);
		
		Optional<Integer> min = values.stream().min((Integer o1, Integer o2) ->{
			if(o1 > o2) {
				return 1;
			}else {
				return -1;
			}
	});
		
		int minValue = values.stream().mapToInt(Integer :: intValue).min().getAsInt();
		System.out.println(minValue + "  MIN_VALUE");
		
		int maxValue = values.stream().mapToInt(Integer :: intValue).max().getAsInt();
		System.out.println(maxValue + "  MAX_VALUE");
		
		System.out.println("the minimum value is :" + min.get());

		
		Optional<Integer> max = values.stream().max((Integer o1, Integer o2) ->{
			if(o1 > o2) {
				return 1;
			}else {
				return -1;
			}
	});
		System.out.println("the maximum value is :" + max.get());

	}

}
