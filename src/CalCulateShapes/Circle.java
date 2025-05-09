package CalCulateShapes;

public class Circle {

	final float pi = 3.14f;
	int radius;
	
	double area;
	
	void area() {
		area = pi*radius* radius;
	}
	
	void disp() {
		System.out.println("The area of Circle is "+ area);
	}
	
	
}
