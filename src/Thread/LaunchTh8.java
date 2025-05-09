package Thread;


class Print implements Runnable{
	
	public void run() {
		for(int i=0;i< 5;i++) {
			System.out.println(i + "Current Thread Name" +Thread.currentThread());
		}
		try { 
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
public class LaunchTh8 {

	public static void main(String[] args) {
		
    Thread t1 = new Thread(new Print());
    Thread t2 = new Thread(new Print());
    Thread t3 = new Thread(new Print());
    
    t1.setName("Jay");
    t2.setName("Raj");
    t2.setName("sri");
    System.out.println("Names of the thread " +t1.getName() +t2.getName() +t3.getName());
    t1.start();
    t2.start();
    t3.start();
    
		
	}

}
