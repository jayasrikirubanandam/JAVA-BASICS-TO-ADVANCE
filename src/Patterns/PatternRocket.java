package Patterns;

public class PatternRocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		
		for(int i=0;i<n;i++) {
			//2 Gaps
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//1 Center Triangle
			for(int j=0;j<n;j++) {
				if(i+j == (n-1)/2 ||i== (n-1)/2 || j-i == (n-1)/2)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			//2 Gaps
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println(" ");
		//Second Part
		for(int i=0;i<n;i++) {
			//2 Gaps
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			// rectangle
			for(int j=0; j<n;j++) {
				if( i == (n-1)/4 && j<(n-1) || j== 0 && i<=(n-1)/4
						|| j== (n-1) && i<= (n-1)/4 || i== (n-1)/4 && j< (n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//2 Gaps
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}

}
