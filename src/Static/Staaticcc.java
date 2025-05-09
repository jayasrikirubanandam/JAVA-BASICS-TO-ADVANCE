package Static;

// static variables stored at heap memory outside the object .
class Bottle{
	
	String shape;
	String color;
    static int count;// which shares among all object creation
   
    
	Bottle(){
		
	}
	Bottle(String shape, String color){
		this.shape= shape;
		this.color = color;
		count++;
		
	}
}
public class Staaticcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bottle b1 = new Bottle("cylinder", "black");
		Bottle b2 = new Bottle("square", "green");
		Bottle b3 = new Bottle("circle", "blue");
		System.out.println(b1.count);
		
	}

}
