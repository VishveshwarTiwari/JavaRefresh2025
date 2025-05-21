package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap10 {

	public static void main(String[] args) {
		Map <String, Integer> numTree = new TreeMap<>();
		numTree.put("One", 1);	
		numTree.put("Two", 2); 
		numTree.put("Three", 3); 
		numTree.put("Four", 4);
		numTree.put("Five", 5);
		System.out.println(numTree); // see the alphabetical order is maintained as per keys
		// {Five=5, Four=4, One=1, Three=3, Two=2}
		
		
	}

}
