package Map;

import java.util.HashMap;
import java.util.Map;

public class Launch04 {

	public static void main(String[] args) {
		

		HashMap<Integer, String> list = new HashMap<Integer, String>();
		list.put(1, "jay");
		list.put(1,"jay");
		list.put(2, "sri");
		list.put(3, null);
		
		
		System.out.println(list.get(1) == list.get(2));
	}

}
