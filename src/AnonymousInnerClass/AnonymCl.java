package AnonymousInnerClass;

abstract class Shape{
	abstract void draw();
}

abstract class Button{
	abstract void OnClick();
}
public class AnonymCl {

	public static void main(String[] args) {
		
		Shape circle = new Shape() {
			
				void draw() {
					System.out.println("Circle ");
			
				}
				
				 void helo(){
					 System.out.println("helo");
				 }
				 
				
				
		};
		
		Shape rectangle = new Shape() {
			
			void draw() {
				
				System.out.println("Rectangle "); 
			}
			
	};
	
	Button b = new Button() {
		void OnClick() {
			System.out.println("On clicking go to next page");
		}
	};
	}

}
