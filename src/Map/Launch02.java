package Map;

//HashCollision - when two distinct key returns same hash code,
//doesn't maintains the insertion order
//if you want to use iterator on hashmap - firstly,entrySet 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Launch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> studentMarks = new HashMap<>();
		
		studentMarks.put("Virat", 45);
		studentMarks.put("Rohit", 67);
		studentMarks.put("Scahin", 71);
		studentMarks.put("Rahul", 52);
		studentMarks.put("Apple", 52);
		
		System.out.println(" -----" + getValues(studentMarks, "Virat"));
		
		//delete(studentMarks, "Virat");
		System.out.println(studentMarks);
		
		for(Entry<String,Integer> e :studentMarks.entrySet()) {
			System.out.println(e);
		}
		
		System.out.println("Using Iterator");
		
		Iterator itr = studentMarks.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static int getValues(HashMap<String, Integer> h, String key) {
		return h.get(key);
	}
	
	public static void delete(HashMap<String, Integer> h,String key) {
		h.remove(key);
	}

}
