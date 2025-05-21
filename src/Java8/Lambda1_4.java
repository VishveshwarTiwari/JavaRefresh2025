package Java8;

interface A1{ // functional Interface with one abstract method
	void show();
}

public class Lambda1_4 {

	public static void main(String[] args) {// we can provide the implementation of show at obj declaration only
		A1 obj = new A1() // Anonymous obj // we are creating obj of Interface A
					{// anonymous class // class inside a class is inner class and it has no name so anonymous inner class
						public void show() 
						{
							System.out.println("Hello");
			
						}
					};// anonymous class

								// we need three things for method implementation name,param,return type we have it in interface itself
			obj.show();			//so no need to write anonymous class and anonymous obj
	}

}
