package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue5 {

	public static void main(String[] args) {
		
		
		System.out.println("Implemented minHeap() Below");
		Queue<Integer> pq1 = new PriorityQueue<>();
		
		pq1.offer(48);
		pq1.offer(12);// we added 48 first so as per FIFO it should come out						
		pq1.offer(20);// but as it is PQ minHeap() is already implemented
		pq1.offer(52);
		
		
		System.out.println(pq1); // [12, 20, 52, 48] //we can see order of elements is changed minHeap is implemented
		
		/*minHeap()-> heap is a Data Structure and in minHeap(),
		 * the smallest no is at the TOP or at the highest priority
		 */
		System.out.println(pq1.peek()); // next in line to come out or TOP priority ->12
		System.out.println(pq1.poll()); //12
		
		System.out.println(pq1); 
		System.out.println(pq1.peek());
	
		
		
		
		System.out.println(" ");
		System.out.println("Implemented maxHeap() Below");
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq2.offer(21);
		pq2.offer(92);// we added 21 first so as per FIFO it should come out												
		pq2.offer(57);// but as it is PQ maxHeap() is already implemented by passing (Comparator.reverseOrder()) in PriorityQueue
		pq2.offer(48);
		
		System.out.println(pq2); // [92, 48, 57, 21] //we can see order of elements is changed maxHeap is implemented
		
		//maxHeap()-> now the biggest element have the  TOP or highest priority 
		
		System.out.println(pq2.peek()); // next in line to come out or TOP priority ->92
		System.out.println(pq2.poll()); //92
		
		System.out.println(pq2); 
		System.out.println(pq2.peek());
		
		
		
		
		
		
		
		
		
	}

}
