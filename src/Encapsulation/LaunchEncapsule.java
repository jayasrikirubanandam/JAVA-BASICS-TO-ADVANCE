package Encapsulation;

public class LaunchEncapsule {
//Encapsulation - binding data and methods together ,
	//provides security to the data members
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setId(43);
		s.setMarks(45);
		s.setName("Jay");
		
		s.display();
	}

}
