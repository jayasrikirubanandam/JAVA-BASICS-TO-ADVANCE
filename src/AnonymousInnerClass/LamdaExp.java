package AnonymousInnerClass;

// lambda expression works only for SAM/functional

interface Mobile1{
	void call();
	
}

interface Mobile2{
	void message(String s);
}

interface Siri{
	int heySiri(int i);
}
public class LamdaExp extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile1 m = () -> System.out.println("calling");
		//Parameterised lambda exprssion
		Mobile2 m1 = (String s ) ->
		{
				System.out.println("STring is " + s);
			
		};
		m1.message("hi");
		
		
		Siri s1 = (int i) ->  i*i;
		System.out.println(s1.heySiri(6));
	}

}
