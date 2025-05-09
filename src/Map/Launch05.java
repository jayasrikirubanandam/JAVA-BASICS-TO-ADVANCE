package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//hashMap vs LinkedHashMap 
//doesn't maintain prints randomly-- maintains insertionthe order
//storage hashtable -- hashtable+doubly linkedlist
//performance O(1) for basic operation get() put -- same but slightly highersince linkedlist is used
//Tree map - sorted entries and null key if yu enter throws exception at run time.
public class Launch05 {

	public static void main(String[] args) {
		
		Map<Integer,String> names = new HashMap<Integer,String>();
		names.put(1, null);
		names.put(1, "jay");
		names.put(3, "sri");
		names.put(4, "yuva");
		names.put(5, "andhu");
		names.put(2, "raj");
		names.put(0, "null");
		names.put(10, "nullValue");
		
		for(String i : names.values())
				System.out.println(i);
		
		System.out.println("-------------ENTRY SET----both key and value----------------");
		for(Entry<Integer,String> i : names.entrySet())
			System.out.println(i);
		
		Map<Integer,String> name = new LinkedHashMap<Integer,String>();
		name.put(1, null);
		name.put(1, "jay");
		name.put(3, "sri");
		name.put(4, "yuva");
		name.put(5, "andhu");
		name.put(2, "raj");
		
		System.out.println("---------LINKEDHASHMAP----------------------");
		for(String i : name.values())
				System.out.println(i);
		
		
		Map<Integer,String> nam = new TreeMap<Integer,String>();
	
		nam.put(3, "sri");
		nam.put(1, "jay");
		nam.put(1, "null");
		
		//nam.put(null, "raj");
		
		System.out.println("-------------TREEMAP------------------");
		for(String i : nam.values()) 
				System.out.println(i);
	}

}
