package Collection;

//failFast scenario - concurrentModification exception throws when we try to iterate over a collection and modify them after an iterator is created.
//to avoid use CopyOnWriteArrayList -> which is thread safe, how it works - read operations are done to the current array . all the write operations are sone in a new array, 
//once it done modifying, the reference directs to the new array

//failSafe - that doesn't throw concurrentModification exception when we try to iterate over a collection and modify them after an iterator is created.
//works for copyOnwriteArrayList and ConcurrentHashMap
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);

		
		//to avoid failfast scenario
		CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
		list1.add(5);
		list1.add(4);
		list1.add(1);
		list1.add(3);
		list1.add(1);
		//System.out.println(list);

		Iterator itr  = list1.iterator();;
		list.add("jay");


		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		ListIterator itr1 = list.listIterator();
//
//		while(itr1.hasPrevious()) {
//			System.out.println("previous "+ itr1.previous());
//		}

	}

}
