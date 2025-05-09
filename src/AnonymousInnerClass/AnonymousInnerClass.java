package AnonymousInnerClass;

// annonymous inner class is a class without a name and is used only when you want to modify the method of the class and used only once in the project
// beacause we should maintain the class
//Anonymous inner class class file name will be AnonymousInnerClass$1 , uses numbers
class Iphone15{
	
	void addFeature() {
		System.out.println("Camera lens " );
	}
	void addCamera() {
		System.out.println("camera");
	}
}

class IPhone15Extra extends Iphone15{
//	public void addFeature(){
//		System.out.println("New feature has been added to iphone 15 ");
//	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iphone15 iphone = new Iphone15();
		iphone.addFeature();
		Iphone15 iphone1 = new Iphone15();
		iphone1.addFeature();
		Iphone15 iphone2 = new Iphone15();
		iphone2.addFeature();
		
		// Anonymous inner class ->
		Iphone15 iphone3 = new Iphone15() 
		{
			public void addFeature()
			{
				System.out.println("New feature has been added to iphone 15 ");
			}
			// multiple methods can be included
			public void addCamera() {
				System.out.println("camera for iphone 3");
			}
			// specialised methods are also allowed but you cannot call them because iphone 15 doesn't know this method
			public void addScreen() {
				
			}
			
		};
		iphone3.addFeature();
		//iphone3.addScreen();
		
		//adding like this is of no use . Multiple times overriding means go for normal.
		Iphone15 iphone4 = new Iphone15() 
		{
			public void addFeature()
			{
				System.out.println("New feature has been added to iphone 15 ");
			}
		};
		iphone4.addFeature();
			
		
		
	}

}
