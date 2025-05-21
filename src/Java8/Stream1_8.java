package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1_8 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4,5,2,6,7);
		Stream <Integer> s1 = nums.stream();
		
		//s1.forEach(n-> System.out.println(n)); // n is object for consumer interface which is each value in stream
		
		/*s1.forEach(n-> System.out.println(n));**/ // we cannot use the stream again after using  it once
		
		//*********  filter()  method *********
		// filter asks for a condition, for a given value n and then return a stream, used for filtering values
		
		Stream <Integer> s2 = s1.filter(n->n%2 ==0);
			//s2.forEach(n-> System.out.println(n));
		
		//******* map() method ******************
		//we can perform some operation on given values and then map will return a stream, like doubling stream
		Stream <Integer> s3 = s2.map(n->n*2);
		//s3.forEach(n-> System.out.println(n));
		
		//********** reduce() method ***************
		/*it will not give a stream but a last output, it will give a value of type
		 * that we have mentioned on our stream while doing reduce operation here it is integer*/
		
		int result = s3.reduce(0, (c,e)->(c+e));
		System.out.println(result);
		// gives 24 // it gave a single value,so  we cannot use forEach here
	}

}
