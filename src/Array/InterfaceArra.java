package Array;

interface Car{
	
	int size =8 ;
	String name = "Hyndai";
	void disp();
}

class Hyndai implements Car{

	@Override
	public void disp() {
		System.out.println("Hyundai");
		
	}
	
}
public class InterfaceArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] c = new Hyndai[2];
		c[0] = new Hyndai();
		c[1] = new Hyndai();
		c[0].disp();
		c[1].disp();
		
		

		
	}

}
