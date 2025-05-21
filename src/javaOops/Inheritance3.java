package javaOops;

public class Inheritance3 {

	public static void main(String[] args) {
		
		employee e1 = new developer(20, "Vishu"); // employee but with developer constructor
		System.out.println(e1.name +" "+ e1.age);
		e1.doWork();
		
		employee e2 = new employee(24, "Shishu");
		e2.walk();
		e2.doWork();
		
		developer d1 = new developer(28, "VT");
		d1.eat(); // Inherited method from parent  employee class
		d1.doWork(); //method overriding
		
	
		
		
		System.out.println("developer count is  " + developer.count);
		System.out.println("employee count is  " + employee.count);
		
	}

}


//parent class

class employee{
	
	String name;
	int age;
	static int count;
	
	public employee(int age, String name) {
		count++;
		this.age = age;
		this.name = name;
	}

		 void walk() {
			 System.out.println(name + " " + "is walking");
		 }
		 
		 void eat() {
			 System.out.println(name + " " + "is eating");
		 }
		
		 void walk(int steps) {
			 System.out.println(name + " Walked " + steps +" steps");
		 }
		 
		 void doWork() {
			 System.out.println(name + " " + "is working");
		 }
	
}

// child class 

class developer extends employee{
	
	public developer(int age, String name) {
		super(age,name);
	}
	
	void doWork() { // runtime polymorphism
		 System.out.println("Developer "+ name + " " + "is working");
	 }
}
