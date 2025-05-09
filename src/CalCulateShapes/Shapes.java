package CalCulateShapes;

import java.util.Scanner;

//calculating shapes using oops concepts - abstraction, polymorphism, inheritance
abstract class CalcShapes{
	// abstract given specification other class can implement it accordingly 
	float area;
	abstract void input();
	abstract void compute();
	void disp() {
		System.out.println("The area is " + area);
	}
}

//inheritance
class Square2 extends CalcShapes {
	
	float side;
	
	 public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side to calculate the area of square ");
		side = scanner.nextFloat();
		
	}
	public void compute() {
		
		area = side*side;
	}
	
}

class Rectangle2 extends CalcShapes {
	
	float length, breadth;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length and breadth to calculate the area of Rectangle ");
		System.out.println("Enter the length ");
		length = scanner.nextFloat();
		System.out.println("Enter the breadth ");
		breadth = scanner.nextFloat();
		
	}
	public void compute() {
		
		area = length *breadth;
	}
	
}
class Circle2 extends CalcShapes {
	
	float radius;
	final float pi = 3.14f;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius to calculate the area of Circle ");
		System.out.println("Enter the radius ");
		radius = scanner.nextFloat();
		
	}
	public void compute() {
		
		area = pi*radius*radius;
	}
	
}

class Geometry {
	//polymorphism concept- parent obj reference which holds all the child classes
	void calculateShapes(CalcShapes shapes) {
		
		shapes.input();
		shapes.compute();
		shapes.disp();
	}
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square2 sq = new Square2();
		Rectangle2 rect = new Rectangle2();
		Circle2  ci = new Circle2();
		
		Geometry geo = new Geometry();
		geo.calculateShapes(sq);
		geo.calculateShapes(rect);
		geo.calculateShapes(ci);
	}

}
