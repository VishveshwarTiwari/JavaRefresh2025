package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set7 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		
		/* ***** Internal working of HashSet***********
		 * why printed in random order because, hashing is going on inside it.
		 *  set creates hash for each and every element,  and hash goes into collection ,
		 *   corresponding to that values are there, and they check that,if any element's hash is 
		 *   already present or not. So all elements have a unique HASH   */

		
		set.add(54);
		set.add(54);
		set.add(54); // how many times you add 54 will not get added
		System.out.println(set);
		
		set.remove(54);// to remove a particular value
		System.out.println(set);
		
		System.out.println(set.contains(21));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		
		
		
		for(Integer e: set) {
			System.out.println("set elements : "+e);
		}
		
		
		// to get element at particular index
		List<Integer> setList = new ArrayList<Integer>(set);
		System.out.println("element at index 1 : " + setList.get(1));
		
		set.clear();
		System.out.println(set);
		
		
		System.out.println("-----------------------------");
		System.out.println("LinkedHashSet");
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(32);
		set1.add(2);
		set1.add(54);
		set1.add(21);
		set1.add(65);
		System.out.println(set1); // you can see the oreder is maintained in which we added the elements
		
		System.out.println("-----------------------------");
		System.out.println("TreeSet");
		Set<Integer> set2 = new TreeSet<>();
		set2.add(32);
		set2.add(2);
		set2.add(54);
		set2.add(21);
		set2.add(65);
		System.out.println(set2); // the set is in sorted form in treeset
		
		
		
	}

}
