package Map;

import java.util.HashMap;

//HashMap - key and value pair
//keys should be unique - if they are duplicated, the latest one gets updated
//null keys , null values are accepted


public class Launch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap h1 = new HashMap();
		h1.put(1,"hi");
		h1.put(1, "hello");
		h1.put(null, "jay");
		h1.put(null, "sri");
		h1.put(null, "ilov");
		h1.put(1, 90);
		
		System.out.println(h1.get(1));
		for(Object k: h1.values()) {
			System.out.println(k);
		}
		for(Object k: h1.keySet()) {
			System.out.println(k);
		}
		for(Object s: h1.entrySet()) {
			System.out.println(s);
		}
	}

}
