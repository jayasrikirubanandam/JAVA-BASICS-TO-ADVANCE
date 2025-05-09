package AnonymousInnerClass;

//we can also use annony for implementing methods of abstract - make sure that is used only once in the project

abstract class P{
	
	abstract void show();
	abstract void show2();
	
	
}
public class AbstractAnnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new P() is an object anonymous inner class
		P p1 = new P() {

			@Override
			void show() {
				System.out.println("anony p");
			}

			@Override
			void show2() {
			System.out.println("anony p");
				
			}
			
		};
		
		p1.show();
		p1.show2();
		
	}

}
