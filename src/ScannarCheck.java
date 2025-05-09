import java.util.Scanner;

public class ScannarCheck {

	// next() -> will consider only one word at a time 
	//nextLine() -> consider a whole sentence in a line
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer value ");
		int i = scanner.nextInt();
		
		System.out.println("Enter the first string ");
		String s1 = scanner.next();
		
		System.out.println("Enter the second string ");
		String s2 = scanner.next();
		
	}
}
