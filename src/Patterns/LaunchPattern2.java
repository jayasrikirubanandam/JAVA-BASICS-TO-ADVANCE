package Patterns;

public class LaunchPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		//Alphabet - T
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i==0 || j== (n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// Alphabet - E
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i== (n-1)/2 || i == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			// Alphabet - L
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			// Alphabet - U
			for(int j=0;j<n;j++) {
				if(j==0 && i<n-1 || i==n-1 && j>0 && j< n-1 || j== n-1 && i<n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			// Alphabet - S
			for(int j=0;j<n;j++) {
				if(i==0 && j > 0 || j==0 && i > 0 && i < (n-1)/2 
						|| i== (n-1)/2 && j>0 && j<n-1 || j== n-1 && i> (n-1)/2  && i< n-1|| i== n-1 && j<n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			// Alphabet - K
			for(int j=0;j<n;j++) {
				if(j==0 || i+j == (n-1)/2 || i-j == (n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			// Alphabet - O
			for(int j=0;j<n;j++) {
				if(j== 0 && i>0&& i< n-1 || i==0 && j>0 &&j<n-1  
						|| i== n-1 && j>0 && j<n-1 || j== n-1 &&i >0 &&i<n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
		}
		
		System.out.println();
		for(int i =0;i<n;i++) {
			// Alphabet - J
			for(int j=0;j<n;j++) {
				if( i==0 || j==(n-1)/2  && i<n-1|| i==n-1 && j< (n-1)/2 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			//Alphabet A
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j>0 &&j<n-1 || j==0&&i >0&& i<=n-1 
						||i== (n-1)/2 || j==n-1 && i>0&& i<=n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			//Alphabet Y
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i+j == n-1 || i==j && j<(n-1)/2 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			//Alphabet A
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j>0 &&j<n-1 || j==0&&i >0&& i<=n-1 
						||i== (n-1)/2 || j==n-1 && i>0&& i<=n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.print("  ");
			// Alphabet - S
			for(int j=0;j<n;j++) {
				if(i==0 && j > 0 || j==0 && i > 0 && i < (n-1)/2 
						|| i== (n-1)/2 && j>0 && j<n-1 || j== n-1 && i> (n-1)/2  && i< n-1|| i== n-1 && j<n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			// Alphabet - R
			for(int j=0;j<n;j++) {
				if(i==0 && j>0 && j< n-1 || j==0 && i>0 
						|| j==n-1 && i>0&& i<(n-1)/2 
						|| i== (n-1)/2 && j>0 && j<n-1
						|| i-j == (n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// Alphabet - I
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || i== n-1 || j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
	}

}
