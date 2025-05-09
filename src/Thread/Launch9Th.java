package Thread;

class Sum implements Runnable{
	
	private int sum =0;
	private int[] ar;
	
	public Sum(int[] ar) {
		this.ar = ar;
	}
	public void run() {
		
		for(int i =0;i< this.ar.length;i++) {
			sum+= i;
		}
	
	}
}

public class Launch9Th {

	public static void main(String[] args) {
		
		int totalSum =0;
		int[] arrayTo = {4,2,3,4,1,3}; 
		
		
		
		
	}

}
