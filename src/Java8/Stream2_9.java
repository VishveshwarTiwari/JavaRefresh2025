package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2_9 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,5,2,6,7);
		
		int result = nums.stream()
					 .filter(n->n%2==0)
					 .map(n->n*2)
					 .reduce(0, (c,e)->(c+e));
		System.out.println(result);
	
		System.out.println("----------------Sorted ------------------");
	
		List<Integer> nums2 = Arrays.asList(4,5,2,6,7,32,22,65,46);
		Stream<Integer> s1 = nums2.stream()
				 .filter(n->n%2==0)
				 .map(n->n*2)
				 .sorted();
			s1.forEach(n->System.out.println(n));
		
		System.out.println("----------------Parallel Stream ------------------");
			
			List<Integer> nums3 = Arrays.asList(4,5,2,6,7,10,12,18,45,36);
			Stream<Integer> s3 = nums3.parallelStream();
					
					 
					 
				s3.forEach(n->System.out.println(n));
				
		
		
	}

}
