package javaOops;

public class ClassesObjMethods1 {

	public static void main(String[] args) {
	
		
		person p1 = new person();
		person p2 = new person();
		
		p1.name = "VT";
		p1.age  = 25;
		p2.name = "Vishu";
		p2.age  = 28;
		
		System.out.println(p1.age + " " + p1.name);
		System.out.println(p2.age + " " + p2.name);
		
		p1.walk();
		p1.walk(10);
		p2.eat();
		p2.eat("Pizza", false);
	}

}

class person{
	
	String name;
	int age;
	
	void walk() {
		System.out.println(name + " is Walking ");
	}
	
	void eat() {
		System.out.println(name + " whose age is " + age + " is eating ");
	}
	
	void walk(int steps) {  //method overloading and Compile time polymorphism
		System.out.println(name + " walked " + steps + " steps ");
	}
	
	void eat(String food, boolean isHealthy) { //method overloading and Compile time polymorphism
		System.out.println(name + " is eating " + food + " which is " + isHealthy + " food");
	}
}