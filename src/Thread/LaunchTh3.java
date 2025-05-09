package Thread;

//Your program do not execute without threads.
//By default, JVM creates one thread called as main thread. 
//main thread can be manipulated by developer.
//All the methods under thread are static . 


public class LaunchTh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Thread thread = Thread.currentThread();
				String s = thread.getName();
				
				System.out.println("Thread name " +s);
				System.out.println(thread.getPriority());
				
				System.out.println("After changing");
				thread.setName("Jay");
				thread.setPriority(7);
		
				System.out.println("Thread name " +thread.getName());
				System.out.println(thread.getPriority());
				
	}

}
