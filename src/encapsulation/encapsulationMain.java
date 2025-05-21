package encapsulation;

public class encapsulationMain {

	public static void main(String[] args) {
		encapsulationIntro en2 = new encapsulationIntro();
		en2.eat(); //default method accessible here as it is in same package
		//en2.walk(); // private method not accessible as it is not available in same class
		
		referBook rb1 = new referBook();
		rb1.name = "Head first java"; // protected variable available in child class 
		System.out.println("Name of reference book is = " + rb1.name);
	}

}

class referBook extends courseBook{
	
}

