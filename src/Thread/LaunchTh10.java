package Thread;

import java.util.Scanner;

//synchronised keyword - used to controll the threads- if same resources accessed by multiple threads - race condition
//to prevent this we use synchronise
//what it does is it will not allow other thread to start until the first thread completes.
//eg) car Share by three son in a family

class BankAccount implements Runnable{
	
	private static int bankBalance= 1000;
	
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		if(threadName.equals("withdrawal")) {
			withdrawal();
		}else if(threadName.equalsIgnoreCase("deposit")) {
			deposit();
		}else if(threadName.equals("balance")){
			checkBalance();
		}
		
	}
	synchronized void withdrawal() {
		
		System.out.println("Enter the amt to be withdrawal");
		
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		bankBalance -= amt;
		checkBalance();
	}
	
	synchronized void deposit() {
		System.out.println("Enter the amt to deposit");
		
		Scanner scan = new Scanner(System.in);
		int amt1 = scan.nextInt();
		bankBalance += amt1;
		checkBalance();
	}
	
	synchronized void checkBalance() {
		System.out.println("Balance " +bankBalance);
	}

	
}
public class LaunchTh10 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new BankAccount());
		Thread t2 = new Thread(new BankAccount());
		Thread t3 = new Thread(new BankAccount());
		
		t1.setName("withdrawal");
		t2.setName("deposit");
		t3.setName("balance");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
