package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);	
		list.add(70);
		list.add(80);
		
	
		
		System.out.println(list);
		
		list.remove(1);//removes element at index 1
		System.out.println(list);
		
		list.remove(Integer.valueOf(30));
		System.out.println(list);
		// list.remove(Double.valueOf(80)); //there is no double value in list to remove if it would have been there it would have been removed
		
		//list.clear(); clears the list
		//System.out.println(list); //==>  []
		
		/*****Time complexity********/
		/*if removing element from a particular position. all the elements shiftLeft after that, 
		 * leftShift by one one step --like in remove operation above
		 * time complexity O(n)- big O of n*/
		
		
		System.out.println(list.contains(40));
		
		list.set(2, 100); // updating the value of list at 2
		System.out.println(list);
		// time complexity of set() function is O(1), big O of 1, as it directly goes to position 
		// and updates the values
		
		System.out.println("The size of the list is = " + list.size());
		
		for(int i=0 ; i<list.size();i++) {
			System.out.println("For loop elements of list  are = " + list.get(i));
		}
		
		for(Integer e : list) {
			System.out.println("ForEach element of the list are = " + e);
		}
		
		Iterator<Integer> it = list.iterator() ;
		
		while(it.hasNext()) {
			System.out.println("Iterator elements = " + it.next());
		}
		
		
		
		
	}
}
