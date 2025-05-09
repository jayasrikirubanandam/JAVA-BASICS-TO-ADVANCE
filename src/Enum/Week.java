package Enum;

//enum is a group of named constants - value are final
//constructor can be defined inside enum but without access specifier
public class Week {

	public Week() {
		
	}
	enum Weeks{
		MON,TUE,WED,THURS,FRI,SAT,SUN;
		
	}

	public static void main(String[] args) {

		Weeks w = Weeks.MON;
		System.out.println(w);
		
		if(w.equals("MON")) {
			System.out.println("yes");
		}
	}


}
