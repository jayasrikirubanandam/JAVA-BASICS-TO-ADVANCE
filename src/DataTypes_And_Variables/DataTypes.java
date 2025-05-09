package DataTypes_And_Variables;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// by default all the whole Numbers data types are integer
		
		byte no1 = 61; 
		byte no2 = 48;
		float no3  = 90;
		
		char c ='g';// only single character takes into account and within single quotes only
		
		char c1 = 97; // it consider it as a decimal representation of a character
		System.out.println(c1);
		
		char c2 = 18905;
		System.out.println(c2);
		//byte result = no1+no2; //Regardless of types , any operation on whole nos , the default types are int
		
		
		//by default all the real nos data types are double
		int a = 17;
		int b =2;
		
		float res1 =a/b;
		System.out.println(res1);
		
		float no4 = 15.5f;
		float no5 = 28.123445678901237464349303294723748327843284632864372864732648732674863276f;
		
		float res =  no4* no5;
		System.out.println(res);
		
		
		// var supports from java 10 , where it supports all the data types
		var s1= "java";
		var s2 = 12;
		var s3 = 'g';
		
	}

}
