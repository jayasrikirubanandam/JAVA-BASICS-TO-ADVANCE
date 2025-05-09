package Array;

import java.util.Arrays;
class Telusko{
	
}
class Alien{
	
}
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj[] = new Object[2];
		Alien[] al = new Alien[1];
		obj[1] = new Telusko();// both belongs to Object
		obj[0] = new Alien();
		
		//al[0] = new Telusko();
		int[] ar = new int[8];
		System.out.println(ar.getClass().getName()); // for inbuilt purpose
		
		int[] arr = {9,3,5,1};
		Arrays.sort(arr);
		
		for(int i : arr)
			System.out.print(i +"  ");
	}

}
