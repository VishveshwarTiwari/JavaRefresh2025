package Collections;

import java.util.HashSet;
import java.util.Set;

public class CustomClassSet8 {

	public static void main(String[] args) {

		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student(1, "VT"));
		studentSet.add(new Student(2, "Vishu"));
		studentSet.add(new Student(3, "Shishu"));
		studentSet.add(new Student(1, "ST"));
		studentSet.add(new Student(4, "VT"));
		System.out.println(studentSet); 
		
		/*[Student [rollNo=4, name=VT], Student [rollNo=2, name=Vishu], Student [rollNo=3, name=Shishu], Student [rollNo=1, name=ST], Student [rollNo=1, name=VT]]
		 * you can see here with same roll no 1 ST and VT are printed just after adding to string () method 
		 * earlier objects were getting printed
		 * 
		 * Now after adding hashCode and equals() method with choosing unique parameters 
		 * no duplicate values will be printed
		 * we can choose our parameters from name and roll no both
		 * 
		 * after generating hashCode and Equals method for unique rollNo in student class, we get below result
		 * [Student [rollNo=1, name=VT], Student [rollNo=2, name=Vishu], Student [rollNo=3, name=Shishu], Student [rollNo=4, name=VT]]
		 * */
		
		
		
		
	
	
	}

}
