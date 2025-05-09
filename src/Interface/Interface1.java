package Interface;

// A class can extends other class and implements as many interface at a same time. 
//- Always extends first and implements next because if class and interface have same method name - class will have define methods whereas interface doesn't
// No ambiguity throws when there is same method names in interface - anyways you going to define them
//interface variables can be inherited in subclass.However they cannot be modified. That is they are final by default.
//Empty interface - called as marked or tagged interface -> which has no methods. And developers need not worry about the implementation, JVM takes care of it.

//An interface has default methods to add additional features without breaking out the previous
interface FlightNormal{
	
	int a =9;
	void takeOff();
	void landing();
}


interface FlightRasher extends FlightNormal{
	//void takeOff();
	//void landing();
}
class CargoFlightNormal{
	
	public void takeOff() {
		System.out.println("class of cargoFlight has beeen flying");
	}
	void isPetrolFilled() {
		System.out.println("Flight has been fueled fully ");
	}
}


interface Water{    // marker or tagged interface 
	
}

class Purified implements Water{
	
}

class PassengerFlight1 extends CargoFlightNormal implements FlightNormal ,FlightRasher {

	

	
	public void landing() {
		
	}
	
	void show() {
		//a= 10; // cannot modify the interface variable
		System.out.println(a);
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassengerFlight1 pf = new PassengerFlight1();
		pf.isPetrolFilled();
		pf.takeOff();
		pf.landing();
		pf.show();
		
	}

}
