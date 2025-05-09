package Thread;

import java.util.Scanner;
//SINGLE THREADED PROBLEM 
//thread - independent line of execution.
//mutitasking at OS level -> applications runs simultaneously eg) music plays, write code , facebook
//mutiThread -> within a application each task that is independent of each other that runs simultaneously
//In this code , we have three irrevelent activity running. 
//However, the other activity is not starting until the previous activity gets over- This is the problem here - Handled by single thread
//CPU time is getting wasted here
//Completely single threaded, if something happens in the activity that it other task will not be executed
class Banking{
	
	
	public void bank() {

		System.out.println("Banking..........");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account Number ");
		int accNo = scanner.nextInt();
		
		System.out.println("Enter the password ");
		int pswd = scanner.nextInt();
		
		System.out.println("your bank account is here");
		
	}
	
}

class displaying{
	
	public void display() throws InterruptedException {
		for(int i=0;i< 5;i++) {
			System.out.println("displaying " + i);
			Thread.sleep(4000);
		}
	}
}

class printing {
	
	public void print()  {
		for(int i=65;i< 75;i++) {
			System.out.println("printing Alphabets " + (char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class LaunchTh2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.out.println("Activity 1 starts    ");
		Banking b = new Banking();
		b.bank();
		System.out.println("Activity 1 ends    ");
		
		System.out.println("Activity 2 starts    ");
		displaying d = new displaying();
		d.display();
		System.out.println("Activity 2 ends    ");
		System.out.println("Activity 3 starts    ");
		printing p = new printing();
		p.print();
		System.out.println("Activity 3 ends    ");
		
	}

}
