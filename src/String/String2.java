package String;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="java";
		String s2 ="Java";
		String s3 = new String("java");
		String s4 = new String ("java");
		String s5 = new String ("Java");
		
		//comparing strings
		// ==  compares reference
		// equals data
		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // //false
		System.out.println(s3 == s5); // false
		System.out.println(s3.equals(s5)); // false
		System.out.println(s3.equalsIgnoreCase(s5)); //true
		
		System.out.println("************************************");
		
		//use concat -add to the string 
		//1) concat 2) +
		
		//Memory -> JVM when it looks for anything within a enclosed quotes,
		//it keeps the copy in SCP and the checks how it is created.
		//Telusko copy in SCP.direct literal-> a1 directs to SCP.
		//java copy in SCP. TeluskoJava in SCP.reference is used so a copy is created in heap.And,then a1 gets updated.
		//telusko is not modified. it creates the new object .thats why it is immutable
		String a1 = "Telusko";
		
		System.out.println(a1);
		
		a1 = a1.concat("Java");
		System.out.println(a1); //TeluskoJava
		
		String a2 ="Telusko";
		
		a2.concat("Java");
		System.out.println(a2); //Telusko
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		String j1= "Java";
		String j2 = "Ja" +"va";
		String j3 = j1+j2;
		System.out.println(j1 == j3);//false
		System.out.println(j1 == j2);//true
		
		String p1 ="HyderAbbas";
		String p2 = "Hyder" + "Abbas";
		String t0 = "Hyder";
		String t1 = "Abbas";
		String t8 = t0+t1;
		System.out.println(p1==p2); //true;
		System.out.println(p1 == t8);//false
		System.out.println(p1.equals(t8));//true
		
		
		System.out.println("***************************");
		
		String x1 = "Java";
		String x2 ="Ja" +"va";
		String x3 = "Ja";
		String x4 =" ";
		String x5 = x3+ x4;
		System.out.println(x1 == x2);
		System.out.println(x1 == x5);
		System.out.println(x1.equals(x5));
		
	}

}
