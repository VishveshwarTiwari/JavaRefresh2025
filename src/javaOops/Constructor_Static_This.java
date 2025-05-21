package javaOops;

public class Constructor_Static_This {

	public static void main(String[] args) {
		
		student s1 = new student();
		s1.name = "Vishu";
		System.out.println("Student name is " + s1.name);
		student s2 = new student();
		s2.name = "Shishu";
		System.out.println("Student name is " + s2.name);
		
		
	
		
		student s3 = new student(12,"Om Tiwari");
		System.out.println("S3 name is " +  s3.name);
		s3.walk();
		
		System.out.println(student.count);
		
	}

}


class student{
	
	String name;
	int age;
	static int count;
	public student() {
		count++;
		System.out.println("Creating an Object");
	}
	

	 void walk() {
		 System.out.println(name + " " + "is walking");
	 }
	 
	 public student(int age, String name) { //constructor overloading
		 	this(); // this keyword without args to call default constructor
		 	this.name = name;// this keyword is used for calling class parameters
			this.age = age;
		}
	 
}