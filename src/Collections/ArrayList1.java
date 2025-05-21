package Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list); //add method adds element at the end
		
		list.add(1,50);// element added at 1st index(when we want to add element at particular position)
		System.out.println(list); //[1, 50, 2, 3, 4, 5] we can see other elements moved rightwards
		
		System.out.println(list.size());
		
		ArrayList<Integer> newList = new ArrayList<>();
		list.add(150);
		list.add(160);
		
		list.addAll(newList);//this will add newList to list and adds at the end
		System.out.println(list);
		
		System.out.println(list.get(6));
		
		/*****Time complexity********/
		/*if Inserting element from a particular position. all the elements shift rightwards after that, 
		 * rightShift by one one step --like in add operation above, like in add(1, 50)
		 * time complexity O(n)*/
		
		
	}

}
