package javaOops;

public class Abstraction6 {

	public static void main(String[] args) {
	
	/*	car c1 = new car();
		c1.start();
		
		*/
		//System.out.println("Now car's unimplemented methods will be executed at time of instantiating the object");
		audi a1 = new audi();
		a1.price = 100_00_00;
		System.out.println("price of audi is = " + a1.price);
		a1.start();
		
		//System.out.println("Now car's unimplemented methods will be executed at time of instantiating the object");
		BMW b1 = new BMW();
		b1.start();
		b1.breaks();
	}

}

abstract class car{
	int price;
abstract void start();
{ System.out.println("car is starting");}
void breaks() {
	
	System.out.println("Car is breaking");
}

}
class audi extends car{

	@Override
	void start() {
		System.out.println("Audi is starting");
		
	}
	
}

class BMW extends car{

	@Override
	void start() {
		System.out.println("BMW is starting");
		
	}
	
}

