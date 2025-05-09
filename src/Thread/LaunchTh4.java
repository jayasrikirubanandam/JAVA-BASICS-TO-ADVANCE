package Thread;

import java.util.Scanner;

//How to create multiple threads 
//-> extending Thread class
//-> implements Runnable


//Using  RUNNABLE INTERFACE 
//has one abstract method - run which needs to be defined
//creating object to thread class -> create a thread.
//to define which activity has to be run by thread must be passed via constructor
//start() -> gives life to the thread and handles it to thread schedular
// thread Schedular is the boss of all the threads that controls the thread based on the CPU available time
//can we make thread schedular run based on the highest thread priority ???
//We can but based on other factors such as the thread states and other quantum theory .
//but not guarantee to run with highest priority

class Banking1 implements Runnable {
	
	
	public void run() {

		System.out.println("Activity 1 starts    ");
		System.out.println("Banking..........");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account Number ");
		int accNo = scanner.nextInt();
		
		System.out.println("Enter the password ");
		int pswd = scanner.nextInt();
		
		System.out.println("your bank account is here");
		System.out.println("Activity 1 ends    ");
		
		
	}
	
}

class displaying1 implements Runnable{
	
	public void run() {
		System.out.println("Activity 2 starts    ");
		for(int i=0;i< 5;i++) {
			System.out.println("displaying " + i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Activity 2 ends    ");
		
	}
}

class printing1 implements Runnable{
	
	public void run()  {
		System.out.println("Activity 3 starts    ");
		for(int i=65;i< 75;i++) {
			System.out.println("printing Alphabets " + (char)i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Activity 3 ends    ");
		
	}
}


public class LaunchTh4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Banking1 b = new Banking1();
		//b.bank();

		displaying1 d = new displaying1();
		//d.display();
			
		printing1 p = new printing1();
		//p.print();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(p);
		
		t1.setPriority(1);
		t2.setPriority(6);
		t3.setPriority(9);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
