package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearningStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(11,41,51,61,62,73,14,64,74,84,91);
		
		int[] a = {1,2,3,4,5};
		//list to map 
		
		Map<Integer, Integer> s = values.stream().collect(Collectors.toMap(null, null));
		
		values.stream().sorted().toList();
		values.stream().filter(i-> i%2==0).reduce((c,e) -> 0,(c+e));
		//second smallest using streams 
		
		//values.stream().sorted().forEach(i->System.out.println(i));
		Optional<Integer> Optional = values.stream().sorted().skip(1).findFirst();
		//System.out.println("Second Smallest" +Optional.get());
		
		values.stream().sorted().skip(1).findFirst();
		//second largest
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if((Integer)o1 > (Integer)o2)
					return 1;//when to swap 
				else
					return -1; //when not to swap
			}
		
		};
		
		
		 Optional<Integer> largest = values.stream().sorted(comp).skip(1).findFirst();
		 values.stream().sorted(comp).forEach(i->System.out.println(i));
		 //System.out.println("Second largest" +largest.get());
		 
		 //sum of nos
		 
		 int sum = values.stream().filter(i->i%2==0).reduce(0,(c,e) -> c+e);
			//find min and max
		 
		  Integer max = values.stream().sorted(comp).findFirst().get();
		  System.out.println("MINIMUM " +max);
	}

}
