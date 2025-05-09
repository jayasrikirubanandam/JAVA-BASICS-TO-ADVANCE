package Thread;

//use of .isAlive() and .join() methods 
//main thread is the one which begins and complete first 
//running multiple methods based on the thread names using single run method
//main thread doesn't go ahead until the threads  t1 , t2, t3 works gets completed 
//isAlive() -> returns true only thread start is called
class PrintingMachine implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String nameOfThread = Thread.currentThread().getName();
		
		if(nameOfThread.equals("type")) {
			type();
		}else if(nameOfThread.equals("scan")) {
			scan();
		}else {
			print();
		}
	}
	
	public void type() 
	{
		System.out.println("User is typing.......");
	}
	
	public void scan() 
	{
		System.out.println("Printer is scanning........");
	}
	
	public void print() {
		System.out.println("Printing your document.......");
	}

	
	
	
}
public class LaunchTh6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main Thread starts ");
		PrintingMachine pM = new PrintingMachine();
		
		Thread t1 = new Thread(pM);
		Thread t2 = new Thread(pM);
		Thread t3 = new Thread(pM);
		
		
		t1.setName("type");
		t2.setName("scan");
		t3.setName("print");
		
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		t1.join();
		t2.join();
		t3.join();
		
		
		
		System.out.println("Main Thread stops ");
		

	}

}
