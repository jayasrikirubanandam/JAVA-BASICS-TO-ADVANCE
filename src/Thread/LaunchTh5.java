package Thread;

import java.util.Scanner;

//Using Thread class
//IF we try to invoke or call run() manually then the program behaves like single threaded program
//main thread is the first one to invoke and first one to complete as well.
class Banking2 extends Thread {
	
	
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

class displaying2 extends Thread{
	
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

class printing2 extends Thread{
	
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

public class LaunchTh5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no need to create thread objects since each class extends thread.
		Banking2 b = new Banking2();
		b.start();
		//b.run();           // behaves like single threaded pgm oly

		displaying2 d = new displaying2();
		d.start();
		//d.run();
		
		printing2 p = new printing2();
		p.start();
		//p.run();
	}

}
