package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Stream is an interface to process large amount of data

//pgram -> Ask the no of persons age and filter the persons who are above 18 only and give the count of people who are above 18 
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no of persons to be entered in the group");
		int noOfPersons = scan.nextInt();
		
		List<Integer> age = new ArrayList<Integer>();
		
		System.out.println("Enter their age: ");
		for(int i=0;i< noOfPersons;i++) {
			age.add(scan.nextInt());
			
		}
		
		age.stream().filter(e -> (e >18));
		long countOfPerson = age.stream().filter(i -> (i >= 18)).count();
		
		System.out.println("The number of persons above 18 are: "+countOfPerson );
	}

}
