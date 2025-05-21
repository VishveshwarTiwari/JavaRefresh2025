package javaOops;
/*
class ImplInterface implements vehicle,human {
	@Override
	public void walk() {
		
		System.out.println("Transformer walks");
		
	}

	@Override
	public void start() {
		System.out.println("Transformer Starts");
		
	}

}*/

//public class Interface7 extends  ImplInterface{

public class Interface7 implements vehicle,human {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface7 in1 = new Interface7(); //creating object of interface class in necessary
		in1.walk();
		in1.start();
	}

	@Override
	public void walk() {
		System.out.println("Transformer walks");
		
	}

	@Override
	public void start() {
		System.out.println("Transformer Starts");
		
	}

	
}

interface vehicle {
	void start();
}

interface human {
	void walk();
}
