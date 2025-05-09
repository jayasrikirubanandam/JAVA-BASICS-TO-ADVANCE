package Thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class AmazonCart implements Runnable{


	public void run() {
		ArrayList<String> products = new ArrayList<String>();

		System.out.println("Enter the products to be added to the cart");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			products.add(scan.next());
		}
		
		
		for(String i : products)
			System.out.println(i);
		
	}

}


class AmazonPayment implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Pay via cash or upi");
		Scanner scan = new Scanner(System.in);
		String pay = scan.next();
		if(pay.equals("cash")) {
			System.out.println("Payed via cash ");
		}else {
			System.out.println("Payed via upi ");
		}
		
		
	}
	
}

public class LaunchTh9 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main thread starts");
		AmazonCart ac = new AmazonCart();
		AmazonPayment ap = new AmazonPayment();
		
		Thread t1 = new Thread(ac);
		Thread t2 = new Thread(ap);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Main thread ends");
		
	}

}
