package WrapperClass;

public class Launch01 {

	public static void main(String[] args) {
		
		int i = 14;
		Integer i1 = Integer.valueOf(i);// autoboxing
		System.out.println(i1);
		int j = i1;
		System.out.println(j); // auto unboxing

	}

}
