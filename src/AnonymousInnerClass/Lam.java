package AnonymousInnerClass;

interface ShapeHel{
	
	void draw();
}
public class Lam {

	public static void main(String[] args) {
		
		ShapeHel s = ()->
			System.out.println("hello");
		s.draw();

	}

}
