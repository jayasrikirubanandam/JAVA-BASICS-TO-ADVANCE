package AnonymousInnerClass;

import java.util.Scanner;

//performing arithmetic mean using lamda 
interface Meanable{
	
	void calcMean();
}
public class LamdaExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Meanable mean = () ->
		{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the no of numbers to calculate arithmetic mean");
				int size = scan.nextInt();
				int sum =0;
				int[] numbers = new int[size];
				for(int i=0;i<size;i++) {
					System.out.println("Enter the number: ");
					numbers[i] = scan.nextInt();
					sum+= numbers[i];
				}
				 
				System.out.print("the arithmetic mean is :"+ sum/size);
			
	
		};
		mean.calcMean();
		
	}

}
