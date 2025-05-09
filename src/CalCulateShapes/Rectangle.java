package CalCulateShapes;

public class Rectangle {

	int length,breadth;
	double area;
	
	void area() {
		area = length * breadth;
	}
	
	void disp() {
		System.out.println("The area of rectangle is "+ area);
	}
}
