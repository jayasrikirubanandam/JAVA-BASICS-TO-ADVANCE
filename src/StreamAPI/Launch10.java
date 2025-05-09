package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Write a Java program to find the second smallest and largest elements in a list of integers using streams.
public class Launch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(11,41,51,61,62,73,014,64,74,84,91);
		
		values.stream().sorted().forEach(i -> System.out.print(i+" "));
		
		int val = values.stream().sorted().skip(1).findFirst().get();
		System.out.println("The second smallest is :" + val);
		
		int val1 = values.stream()
				.sorted((a,b) -> Integer.compare(b, a))
				.skip(1)
				.findFirst()
				.get();
		System.out.println("The second largest is :" + val1);
		
	
		
		
	}

}
