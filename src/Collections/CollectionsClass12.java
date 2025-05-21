package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass12 {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		
		
		list.add(34);
		list.add(12);
		
		list.add(9);
		list.add(76);
		list.add(29);
		list.add(75);
		
		System.out.println(list);// prints--> [34, 12, 9, 76, 29, 75] // prints in the order added
		
		list.add(9);
		list.add(9);
		System.out.println(list);
		System.out.println("Min element : " + Collections.min(list));
		System.out.println("Mac element : " + Collections.max(list));
		System.out.println("frequency of 9 : " + Collections.frequency(list,9));
		System.out.println(list);
		list.remove(Integer.valueOf(9));
		list.remove(6);
		System.out.println("After remove 9 operation : "+list);
		
		
		Collections.sort(list);
		System.out.println("Sorted list in Ascending order : " + list);
		
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println("Sorted list in Desceding order : " + list);

	}

}
