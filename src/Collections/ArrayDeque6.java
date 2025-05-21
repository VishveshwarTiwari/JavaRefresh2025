package Collections;

import java.util.ArrayDeque;

public class ArrayDeque6 {
	
	/*It is a doubly ended queue. It is a queue which you can
	 * add and remove form the Front-end as well as from the Rear-End. 
	 * we can peek from both sides as well */
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(12); // adds element to last
		adq.offerFirst(24); //adds element to head
		adq.offerLast(45); // adds element to rear end
		System.out.println(adq);
		
		adq.offer(36); // but we used offer again so it adds element to end again
		System.out.println(adq);
		
		System.out.println(adq.peek()); // peek() -> top in order to come out
		System.out.println(adq.peekFirst()); // peekFirst() -> head, which will come out first
		System.out.println(adq.peekLast()); // peekLast() -> peeks at element last in order to come out
		
		System.out.println(adq);
		System.out.println();
		System.out.println("Poll operation starts below");
		System.out.println("adq = "+ adq);
		System.out.println(adq.poll()); // poll() -> removes first in order to come out
		System.out.println("After Poll() = " + adq);
		System.out.println(adq.pollFirst()); // polls -> removes head of adq
		System.out.println("After PollFirst() = " + adq);
		System.out.println(adq.pollLast()); // polls -> removes rear end of adq
		System.out.println("After PollLast() = " + adq);
		
		/*we can also use ArrayDeque to implement STACK just use pollLast() as STACK is -> LIFO*/

	}

}
