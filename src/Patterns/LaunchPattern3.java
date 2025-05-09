package Patterns;

public class LaunchPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j == n-1 || i==0 || i== n-1|| j==0|| j==n-1 || 
						i+j== (n-1)/2 || i-j == (n-1)/2  || j-i == (n-1)/2 || i+j == 3*(n-1)/2)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i+j== (n-1)/2 || i-j == (n-1)/2  || j-i == (n-1)/2 
						|| i+j == 3*(n-1)/2)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			//Alphabet -Y
			for(int j=0;j<n;j++) {
				if(i+j == n-1 || i==j && j<(n-1)/2)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			//Alphabet -Q
			for(int j=0;j<n;j++) {
				if(i== 0&& j>0 && j<3*(n-1)/4 || 
						j == 3*(n-1)/4 && i>0 && i< 3*(n-1)/4
						|| j== 0 && i>0 && i< 3*(n-1)/4 || i== 3*(n-1)/4 && j>0 && j< 3*(n-1)/4
						|| i==j   && j>= (n-1)/2)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			
			for(int j=0;j<n;j++) {
				if(i==0||i== n-1|| j==0|| j==n-1
						|| i+j <=(n-1)/2|| i-j >= (n-1)/2 
						|| j-i >= (n-1)/2 || i+j >= 3*(n-1)/2)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("    ");
			
			for(int j=0;j<n;j++) {
				if(i+j >= (n-1)/2 && i<=(n-1)/2 && j <= (n-1)/2
						|| i-j <= (n-1)/2 && i>=(n-1)/2 && j<= (n-1)/2
						|| j-i <= (n-1)/2 && i<=(n-1)/2 && j>= (n-1)/2
						|| i+j <= 3*(n-1)/2 && i>=(n-1)/2 && j>=(n-1)/2  ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
			}
			
		
		
		//Alphabet - V
		System.out.println("    ");
		
		for(int i=0;i< n;i++) {
			for(int j=0; j<n;j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n;j++) {
				if(i+j== n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
		}
		
			System.out.println();
		
		}
		
	}

}
