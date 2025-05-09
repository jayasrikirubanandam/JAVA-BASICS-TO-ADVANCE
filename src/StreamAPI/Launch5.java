package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.


public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> l = Arrays.asList(23,67,45,31,1,3,4,7,8,9,10,43);
		
		int even = l.stream().filter(i->i%2==0).reduce(0,(c,e) -> c+e);
		int odd = l.stream().filter(i->i%2!=0).reduce(0,(c,e) -> c+e);
		
		//int even1 = l.stream().filter(i->i%2==0).mapToInt(Integer:: intValue).sum();
		
		System.out.println("The sum of all even nos:" +even + " The sum of all even nos:" +odd);
		
	}

}
