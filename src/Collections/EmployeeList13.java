package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList13 {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> EmpList = new ArrayList<>();
		EmpList.add(new Employee(2, "Vishu"));
		EmpList.add(new Employee(3, "Shishu"));
		EmpList.add(new Employee(1, "VT"));
		EmpList.add(new Employee(4, "Jax"));
		System.out.println(EmpList); 
		
		/*
		Employee e1 = new Employee(2, "Tom");
		Employee e2 = new Employee(3, "Jerry");
		System.out.println(e1.compareTo(e2));
		
		*/
		
		System.out.println("----------------------------------------------------"); 
		
		//Collections.sort(EmpList); //error without comparable, no instance of type t exists so that employee confirms to comparable
		System.out.println("Sorting using Comparable Implementation in Employee Class"); 
		Collections.sort(EmpList);
		System.out.println(EmpList); // after implementing comparable<Employee> in Employee class
		// one comparable method only with one class,we have defined here that only that way we can compare employees
		
		
		// Comparator Implementation for Dynamic sorting depending on the mood by name, or EmpNo
		// now we want to sort by name as comparable is already sorting by EmpNo
		System.out.println("----------------------------------------------------"); 
		System.out.println("Sorting using  new Comparator Class of Employee type in sort method"); 
		
		Collections.sort(EmpList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		
		/*Collections.sort(EmpList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}); // roll no only
		*/
		
		
		System.out.println(EmpList); 
		
		
		
	}

}
