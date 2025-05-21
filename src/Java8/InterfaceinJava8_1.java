package Java8;

interface phone{
	void call();
	default void message() {
		System.out.println("default method In interface message()");
		System.out.println("Sent");
	}
	
	static void show() {
		System.out.println("Static method in interface");
	}
}

class AndroidPhone implements phone{

	@Override
	public void call() {
		System.out.println("Calling");
		
	}
	
}

public class InterfaceinJava8_1 implements phone {

	public static void main(String[] args) {
		
		phone p = new AndroidPhone();
		p.call();
		p.message();
		phone.show();
		
		InterfaceinJava8_1 ij = new InterfaceinJava8_1(); // to use call and message here we have to implement phone
		ij.call();
		ij.message();
	}

	@Override
	public void call() {
		System.out.println("Calling from InterfaceinJava8_1");
		
	}

}
