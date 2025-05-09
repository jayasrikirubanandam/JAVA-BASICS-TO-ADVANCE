package Thread;

class A extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

}
}

public class LaunchTh7 {

	public static void main(String[] args) throws InterruptedException {
		A t = new A();
		t.start();
		t.setName("A");
		
		A t1 = new A();
		t1.start();
		t1.setName("A1");
		
		A t2 = new A();
		t2.start();
		t2.setName("A2");
		
		
		t.join();
		t1.join();
		t2.join();
		System.out.println("Main thread stops");

	}

}
