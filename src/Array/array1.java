package Array;

import java.util.Scanner;

//array - indexed based data structure. stores collection of similar data types.
//size cannot be negative 
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 int[] studentId = new int[5];
		 int[][] ar = new int[3][3];// 3 classes has 3 students - normal array 
		 System.out.println(studentId);
		/* System.out.println("Enter the studentId ");
		 Scanner scanner = new Scanner(System.in);
		 
		 for(int i=0;i<ar.length;i++) {
			 for(int j=0;j< ar[i].length;j++) {
				 ar[i][j] = scanner.nextInt();
			 }
		 }*/
		 
		 //int[] h = new int[-6];
//		 for(int i=0;i< h.length;i++) {
//			 System.out.println("aa");
//		 }
	/*	 System.out.println("Enter the studentId ");
		 Scanner scanner = new Scanner(System.in);
		 
		 for(int i=0;i< studentId.length;i++) {
			studentId[i]  = scanner.nextInt();
		 }
		 */
		 
		 System.out.println("The student Id are: ");
		 for(int i=0;i< ar.length;i++)
		 {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]);
			}
			 System.out.println();
		 }
	}

}
