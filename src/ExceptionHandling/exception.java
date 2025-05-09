package ExceptionHandling;

import java.util.Scanner;

//Exceptions are nothing about errors but what errors and when will happen
//Compile time errors are syntax error, Java compilers check weather you followed the rules
//Runtime errors are those errors that comes from the logic/ user entered inputs ->Those are called as exception.
//Runtime exception  that are not handled by compiler.ANd, developer needs to be encountered.
//runtime errors vs exception -> stack overflow these errors cannot be handled . vs exception can be handled
//statements out of try block that produce exception will not be caught by catch block even though it handles.
class Calculate{
	
	//performing division
	public void calc()  {
		
		
		System.out.println("Enter the numerator ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Enter the denomenator ");
		Scanner scan1 = new Scanner(System.in);
		int num2 = scan1.nextInt();
		
		  
		 
		if(num2!=0)
		{
			int res = num1/num2;
			 // this one is risky code 
			System.out.println("The result is " + res);
		}
		
		else{
			System.out.println("Invalid Input");
		}
		
//		catch(Exception e ) {
//			System.out.println(e.getClass());
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		
	
	}
	
	
}
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculate cal = new Calculate();
		cal.calc();
		
	}

}
