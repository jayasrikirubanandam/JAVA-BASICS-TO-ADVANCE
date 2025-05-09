package CalCulateShapes;

public class Square {

	int side;
	double area;
	
	void area() {
		
		area = side*side;
	}
	
	void disp() {
		System.out.println("The area of square is " +area);
	}
}
