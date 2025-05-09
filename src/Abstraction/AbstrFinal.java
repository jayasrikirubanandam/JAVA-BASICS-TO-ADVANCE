package Abstraction;
// Combination of abstract and final concepts
// lets try final in abstract class, methods 
// abstract class cannot be final. A class can either be abstract or final.Not both.
//because-> abstract class has abstract methods which will be implemented by other class. If you define them as final then they cannot be inherited 
// abstract methods cannot be declared as final 
abstract  class Car {
	
	abstract  void doors();
}
class Tata extends Car {

	
	void doors() {
		System.out.println("Tata car has 4 doors");
	}
	
}
public class AbstrFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tata t = new Tata();
		t.doors();
	}

}
