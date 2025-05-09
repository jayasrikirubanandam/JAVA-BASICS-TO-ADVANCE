package Abstraction;
// Abstraction -> hiding implementation .
// can be achieved in two ways -> abstract class , interface
// abstract class -> 100% abstraction or partial abstraction can be achieved
//even if one method is abstract , then the class must strictly be an abstract class.
//if a class extends abstract class, then either it should implement the abstract methods or make the class abstract
//An abstract class can have concrete method as well
//An abstract class can have a constructor. which can be invoked by a child class super() method.
// abstract class cannot have object instantiation
// cannot make an constructor as an  abstract because it has either this() or  super() method inside. abstract methods cannot have body 
abstract class Flight1{
	abstract  void takeOff();
	abstract void landing();
	
	int noOf = 5;
	 Flight1(){
		System.out.println(" Flight1 constructor ");
	}
	void arrived() {
		System.out.println("Flight has been arrived");
	}
}

 class CargoFlight1 extends Flight1{
	 
	 
	 void takeOff() {
			System.out.println("Cargo Flight has been take off ");
		
		}
		
		void landing() {
			System.out.println("Cargo Flight is going to land ");
		}
}

public class LaunchAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Flight1 fg = new Flight1();
		Flight1 fg = new CargoFlight1();
		//CargoFlight1 cf = new CargoFlight1();
		fg.arrived();
		fg.takeOff();
		fg.landing();
		
	}

}
