package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
class consImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
	System.out.println(i);
		
	} // we can use anonymous inner class implemenation here no need to make a seperate class
	
}*/ 
public class forEachConsumerInterface8 {

	public static void main(String[] args) {
		
		
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
/*		//1.	Consumer<Integer> c = new consImpl();
 * 
		Consumer <Integer> c = new Consumer<Integer>()
					{
			
						public void accept(Integer i) {
							System.out.println(i);
							
						}
						
					}; 	this also prints the same values	*/
				
		//Consumer <Integer> c = (Integer i) -> {System.out.println(i);};
		Consumer <Integer> c =  i-> System.out.println(i);
		 			 
		values.forEach(c); 
		
		// also we can see forEach method accepts consumer Object that is "c" here
		// so we can directly write 
		System.out.println("----------direct forEach -------------");
		values.forEach(i-> System.out.println(i)); 
		
	}

}
