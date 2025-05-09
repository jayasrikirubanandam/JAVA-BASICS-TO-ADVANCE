package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//prgrm -> Ask user to enter nos and find the odd nos and square all the nos and print the sum

public class Launch2 {

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
		
		int sum = values.stream().filter(i -> i%2 !=0).map(i ->i*i).reduce(0,(c,e) -> c+e);
		values.stream().filter(i -> i%2 !=0).map(i -> i*i).forEach(i-> System.out.println(i));
		System.out.println("the sum of odd numbers is :" + sum);
		
		
		System.out.println(" SUM : "+values.stream().filter(i->i%2 !=0).mapToInt(i-> i*i).sum());
		
		values.stream().filter(i->i%2!=0).map(i->i*i).reduce(0, (c,e)-> c+e);
		
		
	}

}
