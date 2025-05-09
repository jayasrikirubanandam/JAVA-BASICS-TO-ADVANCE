package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Launch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdCard id1 = new IdCard(40, "Rohan", "Banglore");
        IdCard id2 = new IdCard(45, "Visal", "Chennai");
        IdCard id3 = new IdCard(50, "Ananya", "Delhi");

        HashMap<Integer, IdCard> hm = new HashMap<Integer, IdCard>();

        hm.put(10001, id1);
        hm.put(10002, id2);
        hm.put(10003, id3);

        System.out.println(hm);
        System.out.println("******************");

        // Get Key-Value pairs /
        
        Set<Entry<Integer, IdCard>> set_i = hm.entrySet();

        Iterator<Entry<Integer, IdCard>> itr = set_i.iterator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly endter ID number..");

        Integer id = scan.nextInt();

        scan.close();

        while (itr.hasNext()) {

            Entry<Integer, IdCard> pair = itr.next();

            Integer key = pair.getKey();

            if (key.equals(id) ) {
                System.out.println("The Details are " + pair.getValue());
            }

        }

        System.out.println("**    Using StreamAPI **");

        List<Entry<Integer, IdCard>> lst = set_i.stream().filter(i -> i.getKey().equals(id)).toList();

        lst.forEach(i -> System.out.println(i.getValue()));
	}

}
