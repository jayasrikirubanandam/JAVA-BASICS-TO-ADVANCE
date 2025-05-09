package Thread;

//DEADLOCK SYNARIO 
public class Launch21 {

	private final static Object spoon= new Object();
	private final static Object fork= new Object();


	public static void main(String[] args)  {

		
		Thread t1 = new Thread (()->{

			synchronized(spoon){
				System.out.println("Sppon is acquired by thread 1");
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiting to acquire fork");
			synchronized(fork){
				System.out.println("fork is trying to acquire by thread 1");
			}

		});


		Thread t2 = new Thread (()->{

			synchronized(fork){
				System.out.println("fork is acquired by thread 2");
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiting to acquire spoon");
			synchronized(spoon){
				System.out.println("spoon is trying to acquire by thread 2");
			}

		});
		Thread t3 = new Thread(() ->{
			while(true) {
				System.out.println("Daemon thread");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		});
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}

}
