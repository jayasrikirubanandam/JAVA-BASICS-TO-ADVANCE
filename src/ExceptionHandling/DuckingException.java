package ExceptionHandling;

import java.util.Scanner;

//risky code entered inside try block , exception gets handled in catch block
//a method doesn't handles the exception rather it tells the caller method that it throws an exception so that the caller method act accordingly.
//throws - written as method signature to tell the caller method to handle the exception
//throw - usually written the catch block / method to re-throw the exception object to the caller method
//finally - whether the exception occurs or not , whatever the situation/scenario - > finally block will be executed.it uses for closing the resources / clean up process
//statements under throw doesnt executes -> it acts like return statement.
class Alpha{

	public void calc() {


		System.out.println("Enter the numerator ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter the denomenator ");
		Scanner scan1 = new Scanner(System.in);
		int num2 = scan1.nextInt();
		
		try {
			int res = num1/num2; 
		}
		
		catch(ArithmeticException e ){
			System.out.println("ArithmeticException occured handle by alpha method");
			throw e;    ///re throwing the handled-exception to the caller method explicitly or manually
		}
		
		finally {
			System.out.println("Alpha method is terminated"); 
		}
	
	}

}
public class DuckingException {

	public static void main(String[] args) {

		Alpha a = new Alpha();
		try {
			
			a.calc();

		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occured handle by main method");
		}
		
		System.out.println("main method is terminated"); 
	}

}
