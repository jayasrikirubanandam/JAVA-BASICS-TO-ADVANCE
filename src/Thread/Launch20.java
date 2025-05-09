package Thread;


class BankAccount1 implements Runnable{
	
	long accNo;
	int bankBalance = 1000;
	
	 public void run() {
		for(int i=1;i<3;i++) {
			bankBalance = bankBalance -100;
			System.out.println(Thread.currentThread().getName()+ " " +bankBalance);
		}
		
		
	}
}
public class Launch20 {

	public static void main(String[] args) {
		
		Runnable r = new BankAccount1();
		Thread t = new Thread(r);
		t.start();
		t.setName("Jay Thread");
		
		
		Thread t1= new Thread( new BankAccount1());
		t1.start();
		t1.setName("Raj Thread");
	}

}
