package encapsulation;

public class encapsulationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encapsulationIntro en1 = new encapsulationIntro();
		en1.eat();
		en1.walk();
		
		
		books b1 = new books();
		b1.name = "Acing java"; // protected variable available in same parent class
		System.out.println("The name of book is = "+b1.name);
		
		courseBook cb1 = new courseBook();
		cb1.name = "Microservices in Action"; // protected variable available in same child class
		System.out.println("course book name is = " + cb1.name);
	}

	
	public void doWork() { //public method accesible in javaOOPS package as well 
		System.out.println("doing work form encapsulationIntro in encapsulation package");
	}
	
	
	void eat() { //default method only accessible in encapsulation package
		System.out.println("eating form encapsulationIntro in encapsulation package");
	}	
	
	private void walk() {
		System.out.println("Walk method is private and in only available in encapsulationIntro only accessible in same class");
	}
	
	
		
}

class books {
protected String name;
}
class courseBook extends books{
	
}