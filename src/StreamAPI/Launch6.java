package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to remove all duplicate elements from a list using streams.


public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(1,4,5,6,6,7,6,7,8,9);
		
		
		
		
		values.stream().distinct().forEach(i-> System.out.println(i));
		
	}

}
