package Patterns;

public class FacePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 10;
       
       for(int i=0;i<n ;i++) {
    	   for(int j=0;j<n;j++) {
    		   if((i==0 && j>0&& j<n-1) || (j==0 && i>0&&i<n-1)||( j==n-1 && i>0&& i<n-1) || (i==n-1 && j>0 && j<n-1)
    				 || i==(n-1)/4 && j>1 && j <= (n-1)/4  || i==(n-1)/4 && j==(3*n)/4
    				 || i== (n-1)/2 && j>3&& j<6
    				 || i == (3*n)/4 && j>2&& j<7
    				 )
    		   
    		   {
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
