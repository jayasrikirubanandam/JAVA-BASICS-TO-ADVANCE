package Patterns;

public class LaunchPatternMaking {

	public static void main(String[] args) {
		int n =10;
		
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// Empty box
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==0 ||i==n-1 || j==0 || j== n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}*/
		
		// ALphabet - A
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if((i==0 && j>0 && j<n-1) || i==(n-1)/2  || j==0 && i > 0  || j==n-1&& i>0 ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			//gap inbetween alphabets
			System.out.print("  ");
			//Alphabet - B
			
			for(int j=0;j<n;j++) {

				if((i==0  && j<n-1) || (i==n-1 && j>0 && j<n-1)|| (i==(n-1)/2  ) || j==0 && i > 0  || j==n-1&& i>0&&i<n-1 ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - C
			
			for(int j=0;j<n;j++) {

				if((i==0  && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || j==0 && i > 0 && i<n-1 ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - D
			
			for(int j=0;j<n;j++) {

				if((i==0  && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || j==0  || j==n-1&& i>0&& i<n-1  ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - E
			
			for(int j=0;j<n;j++) {

				if((i==0) || j==0  || i==(n-1)/2 || i==n-1  ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");
			//Alphabet - F
			
			for(int j=0;j<n;j++) {

				if((i==0) || j==0  || i==(n-1)/2   ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - G
			
			for(int j=0;j<n;j++) {

				if((i==0 && j>0) || j==0 && i>0 && i< n-1 || i==n-1&& j>0 || j==n-1 && i>(n-1)/2 || i == (n-1)/2 && j>2){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");
			//Alphabet - H
			
			for(int j=0;j<n;j++) {

				if(j ==0 ||  j==n-1  || i == (n-1)/2 ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - I
			
			for(int j=0;j<n;j++) {

				if(i==0 ||  i==n-1  || j == (n-1)/2 ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		
			
		}
		
		// Gap between coloumns
		
		System.out.println(" ");
		
		for(int i=0;i<n;i++) {

			// Alphabet -J
			for(int j=0;j<n;j++) {

				if( i==0 || j== (n-1)/2 || i==n-1 && j > 0 &&j< (n-1)/2){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - L
			
			for(int j=0;j<n;j++) {

				if(j==0 ||  i==n-1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");
			//Alphabet - O
			
			for(int j=0;j<n;j++) {

				if(i ==0 && j>0 &&j<n-1 || j==0 && i>0&& i<n-1 || j==n-1 && i>0 &&i<n-1 || i==n-1&&j >0&&j<n-1){
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - P
			
			for(int j=0;j<n;j++) {

				if( j==0 || i==0 && j>0 && j<n-1 || j== n-1 && i>0&& i<(n-1)/2 || i == (n-1)/2 && j<n-1){
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - S
			
			for(int j=0;j<n;j++) {

				if( i==0 && j>0  || j==0 && i>0 && i<(n-1)/2 || i== (n-1)/2 && j>0 && j<n-1 || j==n-1 && i > (n-1)/2 && i< n-1 || i==n-1&& j>0 && j<n-1  ){
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - T
			
			for(int j=0;j<n;j++) {

				if( i==0 || j== (n-1)/2 ){
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.print("  ");
			//Alphabet - U
			
			for(int j=0;j<n;j++) {

				if( j==0  && i<n-1 || j== n-1 && i<n-1 || i==n-1 && j>0 && j<n-1){
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			
			System.out.println();
	}
	}
}
