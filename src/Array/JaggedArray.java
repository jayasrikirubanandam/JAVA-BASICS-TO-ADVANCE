package Array;
// cannot go beyond the array size- array has boundary restrictions.
//disadvantages of array - size is fixed. Cannot shrink or grow.
//demands contagious memory allocation.
// stores homogeneous data values.
//Array treated as objects - so uses heap memory
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1 = {5,6,7,9};
		int[][] ar = new int[2][]; //jagged array - each class strength is different,classA 2, classB 3
		ar[0] = new int[2];
		ar[1] = new int[3];
		
		System.out.println("Enter the studentId ");
		Scanner scanner = new Scanner(System.in);
		 
		 for(int i=0;i<ar.length;i++) {
			 for(int j=0;j< ar[i].length;j++) {
				 ar[i][j] = scanner.nextInt();
			 }
		 }
		 
		 System.out.println("The student Id's are:  ");
		 for(int i=0;i<ar.length;i++) {
			 for(int j=0;j< ar[i].length;j++) {
				 System.out.print(ar[i][j] + " ");
			 }
		System.out.println();
	}

}
}
