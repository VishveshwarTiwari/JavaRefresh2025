import java.util.Scanner;

public class Hello2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World 2025");
		
//		int a = 1;
//		a++;
//		--a;
//		System.out.println("--a = "+ --a);
//		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks 1 : ");
		//double marks1 = sc.nextInt(); 
		// wroong inpput if you give .nextInt as 500.40366
		double marks1 = sc.nextDouble(); 
		System.out.println("Enter your marks 2 : ");
		//double marks2 = sc.nextInt();
		double marks2 = sc.nextDouble(); 
		System.out.println("Your total marks is = "+ (marks1+marks2));
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc2.next();
		System.out.println("Your name is " + name);
		*/
		
//		
//		String grade = "D";
//		
//		if(grade == "A") {
//			System.out.println("A");
//		}
//		else if(grade == "B") {
//			System.out.println("B");
//		}
//		else if(grade == "C") {
//			System.out.println("C");
//		}
//		else if(grade == "D") {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("Invalid Grade");
//		}
	
		
		
		
//		int VT = 28 ;
//		switch(VT) {
//		
//		case 1 : System.out.println(1); break;
//		case 2 : System.err.println(2); break;
//		case 28 : System.out.println(28); break;
//		case 30: System.out.println(30); break;
//		default:  System.out.println("Invalid");
//		
//		}
//	
//	

		
	//	Loops
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println("Vishu"+i); // prints vishu{i} 10 times
//		}
//	
		
		
//		int a = 23;
//		while(true) {
//			System.out.println(a);
//			a++;
//			if(a>100) {
//				System.out.println("Final Value of a before breaking "+a);
//				break;
//				}
//		}
		
//		int a= 23;
//		while(a<100) {
//			System.out.println(a);
//			a++;
//		}
//		
		
		
		// do while loop
		
//		int a=23;
//		
//		do {
//			System.out.println(a);
//			a++;
//		}while(a>100);
//		
		
//		int a =23;
//		while(a<=100) {
//			a++;
//			if (a==65) continue;
//			System.out.println(a);
//			
//		}
//		
		
//		
//		int marks [] = new int [5];
//		marks[0] = 23;
//		marks[1] = 12;
//		marks[2] = 56;
//		marks[3] = 34;
//		marks[4] = 99;
//		
//		System.out.println("marks array length is " + marks.length);
//		for(int i=0;i<marks.length;i++) {
//			System.out.println(marks[i]);			
//		}
		
		
//		
//		String Animals [] = {"Cat","Dog","Cow","Lion"};
//		System.out.println("Animals array length is " + Animals.length);
//		for(int i=0;i<Animals.length;i++) {
//			System.out.println(Animals[i]);			
//		}
//		
		
//		
//		String Brothers [] = {"VT","MT","ST","OT"};
//		System.out.println("Brothers array length is " + Brothers.length);
//		for(int i=0;i<=Brothers.length;i++) {
//			System.out.println(Brothers[i]);	//VT MT	ST OT 	Index 4 out of bounds for length 4 (do not access 4th index)	 
//		}
		
		//Matrix or 2d Array
		
//		int a [][] =new int [2][3]; 
	
//		int b [][] = {{1,2},
//					  {3,4}
//						};
//		System.out.println(b[0][0]);//1
//		System.out.println(b[0][1]);//2
//		System.out.println(b[1][0]);//3
//		System.out.println(b[1][1]);//4
		
//		
//		System.out.println(average(5, 6));
		
		
		
		
		int arr [] = new int[3];
		
		try {
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The above line broke due to error");
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		// generalized exception
		try {
			System.out.println(arr[-1]);
		}
		catch(Exception e) {
			System.out.println("The above line broke due to error");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Neeche ki line");
		
			try {
				System.out.println(2/0);
			}
			catch(Exception e) {
				System.out.println("The above line broke due to error");
			System.out.println(e.getLocalizedMessage());
			}
		
		
		
	}
	
	
	//Method definition
//	static int average(int firstNo, int secondNo) {
//		int sum = firstNo+secondNo;
//		
//		return sum/2;
//		
//	}

}
