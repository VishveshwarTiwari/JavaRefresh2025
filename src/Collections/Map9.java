package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map9 {
		/*  ** Map is used for storing key value pairs
			 *  Multiple classes are implementing Maps, TreeMap and HashMap*/
	public static void main(String[] args) {
	
		Map <String,Integer> num = new HashMap<>();
		num.put("One", 1);// here we can store keys and value pairs		
		num.put("Two", 2);// ****key's value are always unique
		num.put("Three", 3);// Value pairs may or may not be unique
		
		
		System.out.println(num);//{One=1, Two=2, Three=3}
		
		num.put("Two", 24); // if we try to add other value in key "Two" value of key will be overridden
		System.out.println(num);//{One=1, Two=24, Three=3}
		
		if(!num.containsKey("Three")) {
			
			System.out.println(num.put("Three", 9)); // not overridden this time
		}
		
		num.putIfAbsent("Three", 9); 	// we can also use .putIfAbsent("Three", 9) instead of if block 
		System.out.println(num);
		
		
		// to get an element in a map we use get(key) method
		System.out.println("to get an element in a map we use get(key) method");
		System.out.println("Element at key Two : " + num.get("Two"));
		
		//**** HOW TO ITERATE IN A MAP **************
		// SYNTAX :- for(Map.Entry<KeyDataType, ValueDataType> variableName : MapName.entrySet()) 
		
		/* numbers.entrySet() :- Return's Set of numbers entered in Numbers Map*/
		
		for(Map.Entry<String, Integer> e : num.entrySet()) {
			
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(String key : num.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value : num.values()) {
			System.out.println(value);
		}
		
		System.out.println(num.containsKey("Three"));
		System.out.println(num.containsValue(9));
		System.out.println(num.isEmpty());
		System.out.println(num);
		num.remove("One"); // case sensitive
		System.out.println(num);
		num.clear();
		System.out.println(num); //{}
		
		
		
	}

}
