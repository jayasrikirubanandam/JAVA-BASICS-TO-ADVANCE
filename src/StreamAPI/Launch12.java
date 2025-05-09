package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Launch12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generate a stream of prime numbers up to a given limit.
	
	List<Integer> l = Arrays.asList(3);
	
	//normal logic using recursion
	
		try {
			
			int c = primeOrNot(3,3,0);
			System.out.println("The value of " +c);
			if(c ==2) {
				System.out.println("it is an prime number" +c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	//l.stream(i-> i).limit(4);
	
	
	}
	
	public static int  primeOrNot(int divisor,int n,int c ) {
		int count =c;
		if(divisor !=0) {
			
			if(n%divisor == 0) {
				count++;
			}
			primeOrNot(divisor-1,n,count );
			
		}
		
		return count;
	}
	

}
