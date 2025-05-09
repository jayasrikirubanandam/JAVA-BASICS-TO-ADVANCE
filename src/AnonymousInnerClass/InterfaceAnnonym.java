package AnonymousInnerClass;

// 3 types of interface ->
//1) normal -> nore than one methods
//2) SAM - single abstract method/ functional -> only one method - strictly
//3)Marker -> no methods at all

interface Mobile{
	void message();
	void call();
}

public class InterfaceAnnonym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m = new Mobile() {

			@Override
			public void message() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void call() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
