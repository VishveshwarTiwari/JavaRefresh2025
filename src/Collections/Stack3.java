package Collections;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>(); // Stack is a LIFO data Structure
		
		animals.push("cat");
		animals.push("dog");
		animals.push("horse");
		animals.push("Lion"); // push adds element at the end
		
		System.out.println("Stack : " + animals);
		
		System.out.println(animals.peek()); //  last in was ->Lion
		
		animals.pop();  // pops last - Lion
		
		System.out.println(animals.peek());
		System.out.println(animals.pop()); // pops last - horse
		
		System.out.println(animals);
		

	}

}
