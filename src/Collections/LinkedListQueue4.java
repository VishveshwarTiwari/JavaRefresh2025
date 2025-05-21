package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>(); // queue is FIFO Data Structure
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);//offer(value)-> to insert element in the queue
		
		System.out.println(queue);
		
		System.out.println(queue.peek()); // peek() shows which one is comes out -> first in
		System.out.println(queue.poll()); // poll() removes the first one on queue to come out
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
	}

}
