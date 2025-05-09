package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String s) {
		System.out.println("invalid age input");
	}
	
}

class DrivingClass{
	
	public void enrolCourse() throws InvalidAgeException {
		
		System.out.println("Enter your age to check whether you are eligible for the course");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age > 0) {
			if(age > 18) {
				System.out.println("you are eligible");
			}
			else {
				System.out.println("you are not eligible");
			}
		}
		else {
			throw new InvalidAgeException("age cannot be an negative number");
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		
		DrivingClass dS = new DrivingClass();
		
		try {
			dS.enrolCourse();
		}
		
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage() + "from main method");
			
			try {
				dS.enrolCourse();
			}
			
			catch(InvalidAgeException e1) {
				System.out.println(e1.getMessage() + "from main method");
				
				try {
					dS.enrolCourse();
				}
				
				catch(InvalidAgeException e2) {
					System.out.println(e2.getMessage() + "SYSTEM CRASHED");
					
			}
		}
		
		finally {
			System.out.println("main method terminated");
		}

	}
	}
}
