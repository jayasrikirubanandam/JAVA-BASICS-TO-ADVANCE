package Switch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//switch case -> is of pattern matching
		// I want to set alarm at 6:00 am on monday , 8:00 on tue,wed,
		//9:00 am on thurs, fri, 12:00 pm on sat , sun
		
		while(true) {
			
		
		System.out.println("Please enter the day to set your alarm ");
		
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		switch(day) {
		
		case "Monday" ->
			System.out.println("Alexa, pls set alarm at 6:00 am");
			
		
		case "Tuesday" , "Wednesday" ->
		System.out.println("Alexa, pls set alarm at 8:00 am");
	
		
		case "Thursday", "Friday" ->
			System.out.println("Alexa, pls set alarm at 9:00 am");
			
		case "Saturday", "Sunday" ->
			System.out.println("Alexa, pls set alarm at 12:00 pm");
			
		default ->
			System.out.println("please enter the valid day ");
	
		}
		
		}
	}

}
