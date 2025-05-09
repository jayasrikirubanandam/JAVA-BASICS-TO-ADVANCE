package AnonymousObject;
//Anonymous Object - are unnamed objects 
//objects that has no reference variable.
//Purpose-> if you are using hospitality score method only once in the project then do not waste time in creating the reference to call the method using ref.
// instead we can directly create an object and call the method - > Only if a class has one method inside.
class Hotel{
	
	void hospitalityScore() {
		System.out.println("Hospitality Score is 6 ");
	}
	void name() {
		System.out.println("hilton ");
	}
	
}

public class LaunchAnonymousObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hotel h = new Hotel();
//		h.hospitalityScore();
		
		new Hotel().hospitalityScore();
		new Hotel().name();    // this is wrong . rather we can create an ref and call the methods using ref.
	}     // do anonymous obj only if a class has one method and used only once .

}
