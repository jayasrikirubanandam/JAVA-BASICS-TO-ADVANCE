package Polymorphism;
//Polymorphism - One thing which can be represent in multiple behaviour at runtime.
//to achieve polymorphism -> create reference of a parent type for a child class object. And override methods in all the child class

class Flight{
	Flight(){
		System.out.println("Flight constructor");
	}
	void takeOff() {
		System.out.println(" Parent flight has been take off ");
	}
	
	void landing() {
		System.out.println(" Parent flight is going to land ");
	}
	
	
}

class CargoFlight extends Flight{
	
	@Override
	void takeOff() {
		System.out.println("Cargo Flight has been take off ");
	
	}
	
	void landing() {
		System.out.println("Cargo Flight is going to land ");
	}
}

class PassengerFlight extends Flight{
	
	void takeOff() {
		System.out.println("Passenger Flight has been take off ");
	
	}
	
	void landing() {
		System.out.println("Passenger Flight is going to land ");
	}
}

class FighterFlight extends Flight{
	
	void takeOff() {
		System.out.println("Fighter Flight has been take off ");
	
	}
	
	void landing() {
		System.out.println("Fighter Flight is going to land ");
	}
}

class Poly{
	
	void accessFlight(Flight flight) {
		flight.takeOff();
		flight.landing();
	}
}
public class LaunchPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CargoFlight cf = new CargoFlight();
		Poly p = new Poly();
		p.accessFlight(cf);
		System.out.println("                  ");
		PassengerFlight pf = new PassengerFlight();
		p.accessFlight(pf);
		System.out.println("                  ");
		FighterFlight ff = new FighterFlight();
		p.accessFlight(ff);
	}

}
