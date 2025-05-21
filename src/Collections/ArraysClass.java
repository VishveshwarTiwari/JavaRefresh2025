package Collections;

import java.util.Arrays;

public class ArraysClass {

	  
		// we use Arrays Class to have more functionality and 
		// to do more manipulation on arrays
		
	public static void main(String[] args) {
		
		int numbers [] = {1,2,3,4,5,6,7,8,9,10};
		
		// int []  numbers2 = {11,12,13,14,15,16,17,18,19,20};
		// we can write arrays in both ways as shown above
		
		
		// for finding the index using binary search we use binarySearch(arrayName, elementValue)
		System.out.println("The index of 4 in array is  : " + Arrays.binarySearch(numbers, 4));
		
		// Binary search is function of Arrays-Class and 
		// works only in Sorted arrays with O(logn) time
		
		
		//for sorting
		Integer [] numbers2 = {10,2,32,15,76,17,48,79};
		Arrays.sort(numbers2);
		
		for(Integer e : numbers2) {
			System.out.println(e);
		}
		
		//for filling
		System.out.println("we are doing fill() operaton below");
		Arrays.fill(numbers2, 12);
		

		for(Integer j =0; j<numbers2.length;j++) {
			System.out.println(numbers2[j]);
		}
	}

}
