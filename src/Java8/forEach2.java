package Java8;

import java.util.Arrays;
import java.util.List;

public class forEach2 {

	public static void main(String[] args) {
	
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		for (int i=0; i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("-----------------------");
		for(int e : values) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------");
		values.forEach(i->System.out.println(i));
	}

}
