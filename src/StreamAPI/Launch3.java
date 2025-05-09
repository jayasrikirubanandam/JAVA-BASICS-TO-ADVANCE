package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to calculate the average of a list of integers using streams.


public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the numbers to be entered");
		int size = scan.nextInt();
		
		List<Integer> values = new ArrayList<Integer>();
		System.out.println("Enter the numbers ");
		for(int i=0;i< size;i++) {
			values.add(scan.nextInt()) ;
		}
		
		
		int sum = values.stream().reduce(0,(c,e) -> c+e);
		double avg1 = sum/values.size();
		avg1 =values.stream().mapToDouble(Integer ::doubleValue ).average().getAsDouble();		
		
	
		//int sum = values.stream().reduce(0,(c,e) -> c+e);
		
		double avg = values.stream()
				.mapToDouble(Integer:: doubleValue)
				.average().orElse(0.0);
					
		System.out.println("The average value is :" +avg + " new" +avg1);
	}

}
