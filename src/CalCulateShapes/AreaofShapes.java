package CalCulateShapes;

// We used just methods, variables, objects and class to implement the area of shapes
import java.util.Scanner;

class Square1 {
	
	double side;
	double area;
	
	
	 public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side to calculate the area of square ");
		side = scanner.nextDouble();
		
	}
	public void area() {
		
		area = side*side;
	}
	
	public void disp() {
		System.out.println("The area of square is " +area);
	}
}

class Rectangle1 {
	
	double length, breadth;
	double area;
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length and breadth to calculate the area of Rectangle ");
		System.out.println("Enter the length ");
		length = scanner.nextDouble();
		System.out.println("Enter the breadth ");
		breadth = scanner.nextDouble();
		
	}
	public void area() {
		
		area = length *breadth;
	}
	
	public void disp() {
		System.out.println("The area of rectangle is " +area);
	}
}

class Circle1 {
	
	double radius;
	final float pi = 3.14f;
	double area;
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius to calculate the area of Circle ");
		System.out.println("Enter the radius ");
		radius = scanner.nextDouble();
		
	}
	public void area() {
		
		area = pi*radius*radius;
	}
	
	public void disp() {
		System.out.println("The area of circle is " +area);
	}
}
public class AreaofShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square1 sq = new Square1();
		sq.input();
		sq.area();
		sq.disp();
		
		Rectangle1 rect = new Rectangle1();
		rect.input();
		rect.area();
		rect.disp();
		
		Circle1 ci = new Circle1();
		ci.input();
		ci.area();
		ci.disp();
		
	}

}
